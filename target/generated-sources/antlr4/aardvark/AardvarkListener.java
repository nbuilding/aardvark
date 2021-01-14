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
	 * Enter a parse tree produced by {@link AardvarkParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(AardvarkParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(AardvarkParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(AardvarkParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(AardvarkParser.If_statementContext ctx);
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
	 * Enter a parse tree produced by {@link AardvarkParser#statementNoSemi}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoSemi(AardvarkParser.StatementNoSemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#statementNoSemi}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoSemi(AardvarkParser.StatementNoSemiContext ctx);
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
	 * Enter a parse tree produced by {@link AardvarkParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(AardvarkParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(AardvarkParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(AardvarkParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(AardvarkParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#leq}.
	 * @param ctx the parse tree
	 */
	void enterLeq(AardvarkParser.LeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#leq}.
	 * @param ctx the parse tree
	 */
	void exitLeq(AardvarkParser.LeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#geq}.
	 * @param ctx the parse tree
	 */
	void enterGeq(AardvarkParser.GeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#geq}.
	 * @param ctx the parse tree
	 */
	void exitGeq(AardvarkParser.GeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link AardvarkParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(AardvarkParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link AardvarkParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(AardvarkParser.EqContext ctx);
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
}