package aardvark;

import aardvark.local.*;
import aardvark.node.*;
import aardvark.type.AardvarkTypeFactory;
import aardvark.type.AardvarkTyped;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class AardvarkLanguageListener {
    Stack<AardvarkStackFrame> scopes = new Stack<>();

    public static void main(String[] args) throws IOException {
        CommonTokenStream stream = new CommonTokenStream(new AardvarkLexer(new ANTLRFileStream("test.aardvark")));
        AardvarkParser parser = new AardvarkParser(stream);
        AardvarkLanguageListener listener = new AardvarkLanguageListener();
        listener.scopes.push(AardvarkStackFrame.createRootFrame());

        var compilationUnit = parser.compilationUnit();

        compilationUnit.declaration().forEach(listener::visitDeclaration);

        new AardvarkInvokeNode(listener.scopes.peek().accessFunction("main")).executeGeneric(listener.scopes
                .peek());

        //   var result = new AardvarkInvokeNode(AardvarkStackFrame.builtinFrame.otherImpls.get("i32").get("eq"),
        //         new AardvarkIntNode(1), new AardvarkIntNode(1)).executeGeneric(listener.scopes.peek());
        // System.out.println(result);
    }

    public static <K, V> Map<K, V> zipToMap(List<K> keys, List<V> values) {
        return IntStream.range(0, keys.size()).boxed()
                .collect(Collectors.toMap(keys::get, values::get));
    }

    public AardvarkExpressionNode visitFunctionCall(AardvarkParser.FunctionCallContext ctx) {
        String functionName = ctx.Identifier().getText();
        List<AardvarkExpressionNode> params =
                ctx.functionCallParameters().expression().stream().map(this::visitExpression).collect(toList());

        return new AardvarkInvokeNode(scopes.peek().accessFunction(functionName),
                params.toArray(AardvarkExpressionNode[]::new));
    }

    public AardvarkFunctionNode parseDeclarationFunction(AardvarkParser.DeclarationFunctionContext ctx) {
        var declarationScope = scopes.peek();
        scopes.push(declarationScope.createChildFrame());

        String functionName = ctx.Identifier().getSymbol().getText();
        List<String> variableNames =
                ctx.functionDeclarationArguments().variableName().stream().map(AardvarkParser.VariableNameContext::Identifier).map(TerminalNode::getText).collect(toList());
        List<AardvarkTyped> types =
                ctx.functionDeclarationArguments().typeAnnotation().stream()
                        .map(AardvarkParser.TypeAnnotationContext::type)
                        .map(AardvarkParser.TypeContext::Identifier)
                        .map(TerminalNode::getText)
                        .map(n -> AardvarkTypeFactory.getType(n, scopes.peek()))
                        .collect(toList());

        scopes.peek().makePlaceholders(new Shape(variableNames, types));

        AardvarkStatementNode[] expressions =
                ctx.statement().stream().map(this::visitStatement).toArray(AardvarkStatementNode[]::new);

        AardvarkFunctionNode functionNode = new AardvarkFunctionNode(scopes.peek(), functionName, expressions,
                new Shape(variableNames, types));

        scopes.pop();
        return functionNode;
    }

    public AardvarkExpressionNode visitDeclarationFunction(AardvarkParser.DeclarationFunctionContext ctx) {
        AardvarkFunctionNode node = parseDeclarationFunction(ctx);
        scopes.peek().defineFunction(node.getName(), node);
        return null;
    }


    private String findJoinedName(AardvarkParser.VariableRefContext ctx) {
        return ctx.Identifier().stream().map(TerminalNode::getText).collect(Collectors.joining("."));
    }

    public AardvarkStatementNode visitAssignmentDecVariable(AardvarkParser.DeclarationVariableContext ctx) {
        AardvarkExpressionNode variableValue = this.visitExpression(ctx.expression());
        if (ctx.variableName() != null) {
            String variableName = ctx.variableName().Identifier().getText();

            if (scopes.peek().hasVariable(variableName)) {
                if (ctx.typeAnnotation() != null)
                    throw new AardvarkException("Cannot change the type of a previously declared variable %s",
                            variableName);
                if (variableValue.getType().canBe(scopes.peek().accessVariable(variableName)))
                    throw new AardvarkException("Incompatible types for variable %s: you gave me %s, but the " +
                                                "variable's " +
                                                "type is %s", variableName, variableValue.getType().toString(),
                            scopes.peek().accessVariable(variableName).getType().toString());

                return new AardvarkVariableMutation(variableName, variableValue);
            }


            AardvarkTyped type;
            if (ctx.typeAnnotation() != null) {
                type = AardvarkTypeFactory.getType(ctx.typeAnnotation().type().getText(), scopes.peek());
                assert variableValue.getType().canBe(type);
            } else
                type = variableValue.getType();

            scopes.peek().createVariable(variableName, variableValue, variableValue.getType());


            return new AardvarkVariableDeclaration(variableName, variableValue);
        } else if (ctx.variableRef() != null) {
            String variableName = findJoinedName(ctx.variableRef());
            if (!scopes.peek().hasVariable(variableName)) {
                throw new AardvarkException("Variable %s is not found, and is a member of a struct so we can't " +
                                            "declare it.", variableName);
            }
            if (ctx.typeAnnotation() != null)
                throw new AardvarkException("Cannot change the type of a previously declared variable %s which " +
                                            "does not belong to us.",
                        variableName);
            if (variableValue.getType().canBe(scopes.peek().accessVariable(variableName)))
                throw new AardvarkException("Incompatible types for variable %s: you gave me %s, but the " +
                                            "variable's " +
                                            "type is %s", variableName, variableValue.getType().toString(),
                        scopes.peek().accessVariable(variableName).getType().toString());

            return new AardvarkVariableMutation(variableName, variableValue);
        }
        throw new AardvarkException("Internal error.");
    }

    public AardvarkExpressionNode visitPredicate(AardvarkParser.PredicateContext ctx) {
        String operator = ctx.predicateOperator().getText();
        AardvarkExpressionNode left = visitValue(ctx.value(0)), right = visitValue(ctx.value(1));

        return switch (operator) {
            case "==" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "eq"), left,
                    right);
            case "!=" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "neq"), left,
                    right);
            case "<" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "le"), left,
                    right);
            case ">" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "ge"), left,
                    right);
            case "<=" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "leq"), left,
                    right);
            case ">=" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "geq"), left,
                    right);
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    public AardvarkExpressionNode visitExpression(AardvarkParser.ExpressionContext ctx) {
        if (ctx.value() != null)
            return visitValue(ctx.value());
        else if (ctx.predicate() != null)
            return visitPredicate(ctx.predicate());
        else if (ctx.infixOperation() != null)
            return visitInfix(ctx.infixOperation());
        return null;
    }

    private AardvarkExpressionNode visitInfix(AardvarkParser.InfixOperationContext ctx) {
        String operator = ctx.infixOperator().getText();
        AardvarkExpressionNode left = visitValue(ctx.value(0)), right = visitValue(ctx.value(1));

        return switch (operator) {
            case "+" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "add"), left,
                    right);
            case "-" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "sub"), left,
                    right);
            case "*" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "mul"), left,
                    right);
            case "/" -> new AardvarkInvokeNode(scopes.peek().getOtherImpl(left.getType().toString(), "div"), left,
                    right);

            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    public AardvarkExpressionNode visitValue(AardvarkParser.ValueContext ctx) { // TODO
        if (ctx.functionCall() != null)
            return this.visitFunctionCall(ctx.functionCall());
        else if (ctx.variableName() != null)
            return scopes.peek().accessVariable(ctx.variableName().Identifier().getText());
        else if (ctx.variableRef() != null) {
            return scopes.peek().accessVariable(findJoinedName(ctx.variableRef()));
        } else if (ctx.INTEGER() != null)
            return new AardvarkIntNode(Integer.parseInt(ctx.INTEGER().getText()));
        else if (ctx.structInstantiation() != null)
            return this.visitStructInstantiation(ctx.structInstantiation());
        else if (ctx.string() != null)
            throw new RuntimeException("String not implemented");

        return null;
    }

    public AardvarkStructInstanceNode visitStructInstantiation(boolean isPlaceholder,
                                                               AardvarkParser.StructInstantiationContext ctx) {
        String name = ctx.Identifier().getText();

        List<String> variableNames = ctx.variableName().stream()
                .map(AardvarkParser.VariableNameContext::Identifier)
                .map(TerminalNode::getText)
                .collect(toList());
        List<AardvarkExpressionNode> variableValues = ctx.expression().stream()
                .map(this::visitExpression)
                .collect(toList());

        return new AardvarkStructInstanceNode(isPlaceholder, zipToMap(variableNames, variableValues),
                scopes.peek().accessStruct(name));
    }

    public AardvarkStructInstanceNode visitStructInstantiation(AardvarkParser.StructInstantiationContext ctx) {
        return this.visitStructInstantiation(false, ctx);
    }

    public AardvarkStatementNode visitDeclaration(AardvarkParser.DeclarationContext ctx) {
        if (ctx.declarationVariable() != null) {
            return this.visitAssignmentDecVariable(ctx.declarationVariable());
        } else if (ctx.declarationFunction() != null)
            return this.visitDeclarationFunction(ctx.declarationFunction());
        else if (ctx.structDefinition() != null)
            this.visitStructDefinition(ctx.structDefinition());
        else if (ctx.structImplementation() != null)
            this.visitStructImplementation(ctx.structImplementation());
        else if (ctx.contractDefinition() != null)
            this.visitContractDefinition(ctx.contractDefinition());
        return null;
    }

    private void visitContractDefinition(AardvarkParser.ContractDefinitionContext ctx) {
        List<FunctionSignature> expressions =
                ctx.declarationFunctionStub().stream().map(this::visitFunctionStub).collect(toList());
        List<String> names = expressions.stream().map(FunctionSignature::getName).collect(toList());
        scopes.peek().defineTrait(ctx.Identifier().getText(), new AardvarkTrait(scopes.peek().createChildFrame(),
                zipToMap(names, expressions)))
        ;
    }

    private FunctionSignature visitFunctionStub(AardvarkParser.DeclarationFunctionStubContext ctx) {
        String functionName = ctx.Identifier().getSymbol().getText();
        List<String> variableNames =
                ctx.functionDeclarationArguments().variableName().stream().map(AardvarkParser.VariableNameContext::Identifier).map(TerminalNode::getText).collect(toList());
        List<AardvarkTyped> types =
                ctx.functionDeclarationArguments().typeAnnotation().stream()
                        .map(AardvarkParser.TypeAnnotationContext::type)
                        .map(AardvarkParser.TypeContext::Identifier)
                        .map(TerminalNode::getText)
                        .map(n -> AardvarkTypeFactory.getType(n, scopes.peek()))
                        .collect(toList());

        return new FunctionSignature(types, scopes.peek().accessType(ctx.typeAnnotation().type().getText()),
                ctx.Identifier().getText());
    }

    private void visitStructImplementation(AardvarkParser.StructImplementationContext ctx) {
        String structName = ctx.Identifier().getText();
        AardvarkStructNode struct = scopes.peek().accessStruct(structName);
        struct.frame.setPointerToThisType(struct);

        String traitName = ctx.typeAnnotation().type().getText();
        AardvarkTrait trait = scopes.peek().accessTrait(traitName);

        Map<String, AardvarkFunctionNode> functionNodes =
                ctx.declarationFunction().stream().map(this::parseDeclarationFunction).collect(toMap(AardvarkFunctionNode::getName, Function.identity()));
        scopes.peek().implementTraitForStruct(struct, trait, functionNodes);
    }


    public void visitStructDefinition(AardvarkParser.StructDefinitionContext ctx) {
        String name = ctx.Identifier().getText();
        List<String> names = ctx.variableName().stream()
                .map(AardvarkParser.VariableNameContext::Identifier)
                .map(TerminalNode::getText)
                .collect(toList());
        List<AardvarkTyped> types = ctx.typeAnnotation().stream()
                .map(AardvarkParser.TypeAnnotationContext::type)
                .map(AardvarkParser.TypeContext::Identifier)
                .map(TerminalNode::getText)
                .map(n -> AardvarkTypeFactory.getType(n, scopes.peek()))
                .collect(toList());

        AardvarkStructNode structNode = new AardvarkStructNode(scopes.peek().createChildFrame(), new Shape(names,
                types), name);
        scopes.peek().createStruct(name, structNode);
    }

    public AardvarkStatementNode visitStatement(AardvarkParser.StatementContext ctx) {
        if (ctx.declaration() != null)
            return this.visitDeclaration(ctx.declaration());
        else if (ctx.functionCall() != null)
            return this.visitFunctionCall(ctx.functionCall());
        else if (ctx.returnExpression() != null)
            return new AardvarkReturnNode(this.visitExpression(ctx.returnExpression().expression()));
        else if (ctx.for_statement() != null)
            return new AardvarkFor(scopes.peek(),
                    visitAssignmentDecVariable(ctx.for_statement().declarationVariable()),
                    visitExpression(ctx.for_statement().expression()), visitStatement(ctx.for_statement().statement(0)),
                    ctx.for_statement().statement().stream()
                            .skip(1)
                            .map(this::visitStatement)
                            .toArray(AardvarkStatementNode[]::new));
        return null;
    }


}
