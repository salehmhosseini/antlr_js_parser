// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/js_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link js_parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface js_parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link js_parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(js_parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(js_parser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(js_parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(js_parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(js_parser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_content(js_parser.Import_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_default(js_parser.Import_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(js_parser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_all(js_parser.Import_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_multiple_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_multiple_named(js_parser.Import_multiple_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#import_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_alias(js_parser.Import_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(js_parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(js_parser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#single_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_declaration(js_parser.Single_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#single_decl_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_decl_with_type(js_parser.Single_decl_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#single_decl_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_decl_with_init(js_parser.Single_decl_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#single_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expression(js_parser.Single_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#multi_declaratuon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_declaratuon(js_parser.Multi_declaratuonContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_decl_with_type(js_parser.Multi_decl_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_decl_with_init(js_parser.Multi_decl_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#multi_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_expression(js_parser.Multi_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(js_parser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#normal_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_for(js_parser.Normal_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(js_parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update(js_parser.For_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#loop_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_block(js_parser.Loop_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#for_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in(js_parser.For_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#for_of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_of(js_parser.For_ofContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(js_parser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(js_parser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(js_parser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(js_parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(js_parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(js_parser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(js_parser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#elif_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_expression(js_parser.Elif_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(js_parser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#modern_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModern_if_statement(js_parser.Modern_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#switch_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case_statement(js_parser.Switch_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(js_parser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#default_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_statement(js_parser.Default_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(js_parser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(js_parser.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(js_parser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(js_parser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#exception_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_statement(js_parser.Exception_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(js_parser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(js_parser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#finally_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_statement(js_parser.Finally_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parser#comment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_statement(js_parser.Comment_statementContext ctx);
}