package aardvark;

import aardvark.local.AardvarkStackFrame;
import aardvark.local.AardvarkStructInstanceNode;
import aardvark.local.AardvarkStructNode;
import aardvark.local.Shape;
import aardvark.node.*;
import aardvark.type.AardvarkTypeFactory;
import aardvark.type.AardvarkTyped;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class AardvarkLanguageListener {
    Stack<AardvarkStackFrame> scopes = new Stack<>();

    public static void main(String[] args) throws IOException {
        CommonTokenStream stream = new CommonTokenStream(new AardvarkLexer(new ANTLRFileStream("test.aardvark")));
        AardvarkParser parser = new AardvarkParser(stream);
        AardvarkLanguageListener listener = new AardvarkLanguageListener();
        listener.scopes.push(AardvarkStackFrame.createRootFrame());

        var compilationUnit = parser.compilationUnit();

        compilationUnit.structDefinition().forEach(listener::visitStructDefinition);
        compilationUnit.declaration().forEach(listener::visitDeclaration);

        new AardvarkInvokeNode(listener.scopes.peek().accessFunction("main")).executeGeneric(listener.scopes.peek());
    }


    public AardvarkExpressionNode visitFunctionCall(AardvarkParser.FunctionCallContext ctx) {
        String functionName = ctx.Identifier().getText();
        List<AardvarkExpressionNode> params =
                ctx.functionCallParameters().value().stream().map(this::visitValue).collect(toList());

        return new AardvarkInvokeNode(scopes.peek().accessFunction(functionName),
                params.toArray(AardvarkExpressionNode[]::new));
    }


    public AardvarkStatementNode visitDeclarationFunction(AardvarkParser.DeclarationFunctionContext ctx) {
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

        AardvarkFunctionNode functionNode = new AardvarkFunctionNode(scopes.peek(), expressions,
                new Shape(variableNames, types));

        scopes.pop();
        declarationScope.defineFunction(functionName, functionNode);
        return null;
    }

    public AardvarkExpressionNode visitVariableRef(AardvarkParser.VariableNameContext ctx) {
        return new AardvarkVariableAccessNode(ctx.Identifier().getText(),
                scopes.peek().accessVariable(ctx.Identifier().getText()).getType());
    }


    public AardvarkStatementNode visitAssignmentDecVariable(AardvarkParser.DeclarationVariableContext ctx) {
        String variableName = ctx.variableName().Identifier().getText();
        AardvarkExpressionNode variableValue = this.visitValue(ctx.value());

        AardvarkTyped type;
        if (ctx.typeAnnotation() != null) {
            type = AardvarkTypeFactory.getType(ctx.typeAnnotation().type().getText(), scopes.peek());
            assert variableValue.getType().canBe(type);
        } else
            type = variableValue.getType();

        scopes.peek().createVariable(variableName, null, variableValue.getType());

        return new AardvarkVariableDeclaration(variableName, variableValue);
    }


    public AardvarkExpressionNode visitValue(AardvarkParser.ValueContext ctx) { // TODO
        if (ctx.functionCall() != null)
            return this.visitFunctionCall(ctx.functionCall());
        else if (ctx.variableName() != null)
            return this.visitVariableRef(ctx.variableName());
        else if (ctx.INTEGER() != null)
            return new AardvarkIntNode(Integer.parseInt(ctx.INTEGER().getText()));
        else if (ctx.structInstantiation() != null)
            return this.visitStructInstantiation(ctx.structInstantiation());
        else if (ctx.string() != null)
            throw new RuntimeException("String not implemented");

        return null;
    }

    public AardvarkStructInstanceNode visitStructInstantiation(AardvarkParser.StructInstantiationContext ctx) {
        String name = ctx.Identifier().getText();
        List<String> variableNames = ctx.variableName().stream()
                .map(AardvarkParser.VariableNameContext::Identifier)
                .map(TerminalNode::getText)
                .collect(toList());
        List<AardvarkExpressionNode> variableValues = ctx.value().stream()
                .map(this::visitValue)
                .collect(toList());

        return new AardvarkStructInstanceNode(zipToMap(variableNames, variableValues), scopes.peek().accessStruct(name));
    }

    public AardvarkStatementNode visitDeclaration(AardvarkParser.DeclarationContext ctx) {
        if (ctx.declarationVariable() != null) {
            return this.visitAssignmentDecVariable(ctx.declarationVariable());
        } else if (ctx.declarationFunction() != null)
            return this.visitDeclarationFunction(ctx.declarationFunction());
        return null;
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

        AardvarkStructNode structNode = new AardvarkStructNode(scopes.peek().createChildFrame(), new Shape(names, types));
        scopes.peek().createStruct(name, structNode);
    }

    public AardvarkStatementNode visitStatement(AardvarkParser.StatementContext ctx) {
        if (ctx.declaration() != null)
            return this.visitDeclaration(ctx.declaration());
        else if (ctx.functionCall() != null)
            return this.visitFunctionCall(ctx.functionCall());
        else if (ctx.returnExpression() != null)
            return new AardvarkReturnNode(this.visitValue(ctx.returnExpression().value()));
        return null;
    }
    public static <K, V> Map<K, V> zipToMap(List<K> keys, List<V> values) {
        return IntStream.range(0, keys.size()).boxed()
                .collect(Collectors.toMap(keys::get, values::get));
    }
}
