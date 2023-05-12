// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/js_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link js_parser}.
 */
public interface js_parserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link js_parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(js_parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(js_parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(js_parser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(js_parser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(js_parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(js_parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(js_parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(js_parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(js_parser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(js_parser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_content}.
	 * @param ctx the parse tree
	 */
	void enterImport_content(js_parser.Import_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_content}.
	 * @param ctx the parse tree
	 */
	void exitImport_content(js_parser.Import_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_default}.
	 * @param ctx the parse tree
	 */
	void enterImport_default(js_parser.Import_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_default}.
	 * @param ctx the parse tree
	 */
	void exitImport_default(js_parser.Import_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(js_parser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(js_parser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_all}.
	 * @param ctx the parse tree
	 */
	void enterImport_all(js_parser.Import_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_all}.
	 * @param ctx the parse tree
	 */
	void exitImport_all(js_parser.Import_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_multiple_named}.
	 * @param ctx the parse tree
	 */
	void enterImport_multiple_named(js_parser.Import_multiple_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_multiple_named}.
	 * @param ctx the parse tree
	 */
	void exitImport_multiple_named(js_parser.Import_multiple_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#import_alias}.
	 * @param ctx the parse tree
	 */
	void enterImport_alias(js_parser.Import_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#import_alias}.
	 * @param ctx the parse tree
	 */
	void exitImport_alias(js_parser.Import_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(js_parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(js_parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(js_parser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(js_parser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(js_parser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(js_parser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#single_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_decl_with_type(js_parser.Single_decl_with_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#single_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_decl_with_type(js_parser.Single_decl_with_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#single_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void enterSingle_decl_with_init(js_parser.Single_decl_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#single_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void exitSingle_decl_with_init(js_parser.Single_decl_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#single_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expression(js_parser.Single_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#single_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expression(js_parser.Single_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#multi_declaratuon}.
	 * @param ctx the parse tree
	 */
	void enterMulti_declaratuon(js_parser.Multi_declaratuonContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#multi_declaratuon}.
	 * @param ctx the parse tree
	 */
	void exitMulti_declaratuon(js_parser.Multi_declaratuonContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void enterMulti_decl_with_type(js_parser.Multi_decl_with_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void exitMulti_decl_with_type(js_parser.Multi_decl_with_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void enterMulti_decl_with_init(js_parser.Multi_decl_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void exitMulti_decl_with_init(js_parser.Multi_decl_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(js_parser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(js_parser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(js_parser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(js_parser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#normal_for}.
	 * @param ctx the parse tree
	 */
	void enterNormal_for(js_parser.Normal_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#normal_for}.
	 * @param ctx the parse tree
	 */
	void exitNormal_for(js_parser.Normal_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(js_parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(js_parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(js_parser.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(js_parser.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#loop_block}.
	 * @param ctx the parse tree
	 */
	void enterLoop_block(js_parser.Loop_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#loop_block}.
	 * @param ctx the parse tree
	 */
	void exitLoop_block(js_parser.Loop_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#for_in}.
	 * @param ctx the parse tree
	 */
	void enterFor_in(js_parser.For_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#for_in}.
	 * @param ctx the parse tree
	 */
	void exitFor_in(js_parser.For_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#for_of}.
	 * @param ctx the parse tree
	 */
	void enterFor_of(js_parser.For_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#for_of}.
	 * @param ctx the parse tree
	 */
	void exitFor_of(js_parser.For_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(js_parser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(js_parser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(js_parser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(js_parser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(js_parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(js_parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(js_parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(js_parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(js_parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(js_parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(js_parser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(js_parser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(js_parser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(js_parser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#elif_expression}.
	 * @param ctx the parse tree
	 */
	void enterElif_expression(js_parser.Elif_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#elif_expression}.
	 * @param ctx the parse tree
	 */
	void exitElif_expression(js_parser.Elif_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(js_parser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(js_parser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#modern_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterModern_if_statement(js_parser.Modern_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#modern_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitModern_if_statement(js_parser.Modern_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case_statement(js_parser.Switch_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case_statement(js_parser.Switch_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(js_parser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(js_parser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#default_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefault_statement(js_parser.Default_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#default_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefault_statement(js_parser.Default_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(js_parser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(js_parser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#class_statement}.
	 * @param ctx the parse tree
	 */
	void enterClass_statement(js_parser.Class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#class_statement}.
	 * @param ctx the parse tree
	 */
	void exitClass_statement(js_parser.Class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(js_parser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(js_parser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(js_parser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(js_parser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void enterException_statement(js_parser.Exception_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void exitException_statement(js_parser.Exception_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(js_parser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(js_parser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(js_parser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(js_parser.Catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void enterFinally_statement(js_parser.Finally_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void exitFinally_statement(js_parser.Finally_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_statement(js_parser.Comment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_statement(js_parser.Comment_statementContext ctx);
}