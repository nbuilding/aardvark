// Generated from Aardvark.g4 by ANTLR 4.9

    package aardvark;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AardvarkParser}.
 */
public interface AardvarkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(AardvarkParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(AardvarkParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(AardvarkParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(AardvarkParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(AardvarkParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(AardvarkParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#declarationFunctionStub}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationFunctionStub(AardvarkParser.DeclarationFunctionStubContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#declarationFunctionStub}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationFunctionStub(AardvarkParser.DeclarationFunctionStubContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#declarationFunction}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationFunction(AardvarkParser.DeclarationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#declarationFunction}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationFunction(AardvarkParser.DeclarationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#functionDeclarationArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationArguments(AardvarkParser.FunctionDeclarationArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#functionDeclarationArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationArguments(AardvarkParser.FunctionDeclarationArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#declarationVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationVariable(AardvarkParser.DeclarationVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#declarationVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationVariable(AardvarkParser.DeclarationVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#functionCallParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParameters(AardvarkParser.FunctionCallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#functionCallParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParameters(AardvarkParser.FunctionCallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AardvarkParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AardvarkParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(AardvarkParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(AardvarkParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(AardvarkParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(AardvarkParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(AardvarkParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(AardvarkParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AardvarkParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AardvarkParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterVariableRef(AardvarkParser.VariableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitVariableRef(AardvarkParser.VariableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(AardvarkParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(AardvarkParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(AardvarkParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(AardvarkParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AardvarkParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AardvarkParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AardvarkParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AardvarkParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AardvarkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AardvarkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(AardvarkParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(AardvarkParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(AardvarkParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(AardvarkParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AardvarkParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AardvarkParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AardvarkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AardvarkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(AardvarkParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(AardvarkParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#structInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterStructInstantiation(AardvarkParser.StructInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#structInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitStructInstantiation(AardvarkParser.StructInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#structImplementation}.
	 * @param ctx the parse tree
	 */
	void enterStructImplementation(AardvarkParser.StructImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#structImplementation}.
	 * @param ctx the parse tree
	 */
	void exitStructImplementation(AardvarkParser.StructImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(AardvarkParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(AardvarkParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(AardvarkParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(AardvarkParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(AardvarkParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(AardvarkParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#infixOperator}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperator(AardvarkParser.InfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#infixOperator}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperator(AardvarkParser.InfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(AardvarkParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(AardvarkParser.InfixOperationContext ctx);
}