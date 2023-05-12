// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/grammer_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammer_parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammer_parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammer_parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grammer_parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(grammer_parser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grammer_parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(grammer_parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(grammer_parser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_content(grammer_parser.Import_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_default(grammer_parser.Import_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(grammer_parser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_all(grammer_parser.Import_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_multiple_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_multiple_named(grammer_parser.Import_multiple_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#import_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_alias(grammer_parser.Import_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(grammer_parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(grammer_parser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#single_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_declaration(grammer_parser.Single_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#single_decl_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_decl_with_type(grammer_parser.Single_decl_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#single_decl_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_decl_with_init(grammer_parser.Single_decl_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#single_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expression(grammer_parser.Single_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#multi_declaratuon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_declaratuon(grammer_parser.Multi_declaratuonContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_decl_with_type(grammer_parser.Multi_decl_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_decl_with_init(grammer_parser.Multi_decl_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#multi_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_expression(grammer_parser.Multi_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(grammer_parser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#normal_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_for(grammer_parser.Normal_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(grammer_parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update(grammer_parser.For_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#loop_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_block(grammer_parser.Loop_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#for_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in(grammer_parser.For_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#for_of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_of(grammer_parser.For_ofContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(grammer_parser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(grammer_parser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(grammer_parser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(grammer_parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(grammer_parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(grammer_parser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(grammer_parser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#elif_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_expression(grammer_parser.Elif_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(grammer_parser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#modern_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModern_if_statement(grammer_parser.Modern_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#switch_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case_statement(grammer_parser.Switch_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(grammer_parser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#default_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_statement(grammer_parser.Default_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(grammer_parser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(grammer_parser.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(grammer_parser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(grammer_parser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#exception_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_statement(grammer_parser.Exception_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(grammer_parser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(grammer_parser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#finally_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_statement(grammer_parser.Finally_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#comment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_statement(grammer_parser.Comment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(grammer_parser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammer_parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(grammer_parser.LogicalOrExpressionContext ctx);
}