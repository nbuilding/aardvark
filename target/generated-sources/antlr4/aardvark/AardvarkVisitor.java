// Generated from Aardvark.g4 by ANTLR 4.9

    package aardvark;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AardvarkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AardvarkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(AardvarkParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(AardvarkParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(AardvarkParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#declarationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationFunction(AardvarkParser.DeclarationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#functionDeclarationArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationArguments(AardvarkParser.FunctionDeclarationArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#declarationVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationVariable(AardvarkParser.DeclarationVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#functionCallParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParameters(AardvarkParser.FunctionCallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AardvarkParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(AardvarkParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(AardvarkParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(AardvarkParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AardvarkParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(AardvarkParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(AardvarkParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AardvarkParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AardvarkParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#returnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(AardvarkParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(AardvarkParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(AardvarkParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AardvarkParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AardvarkParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#statementNoSemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoSemi(AardvarkParser.StatementNoSemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(AardvarkParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#structInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructInstantiation(AardvarkParser.StructInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#lessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(AardvarkParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#greaterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(AardvarkParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#leq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeq(AardvarkParser.LeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#geq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeq(AardvarkParser.GeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(AardvarkParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link AardvarkParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(AardvarkParser.PredicateContext ctx);
}