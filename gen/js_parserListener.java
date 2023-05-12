// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/js_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link js_parserParser}.
 */
public interface js_parserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link js_parserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(js_parserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(js_parserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(js_parserParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(js_parserParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(js_parserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(js_parserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(js_parserParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(js_parserParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(js_parserParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(js_parserParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_content}.
	 * @param ctx the parse tree
	 */
	void enterImport_content(js_parserParser.Import_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_content}.
	 * @param ctx the parse tree
	 */
	void exitImport_content(js_parserParser.Import_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_default}.
	 * @param ctx the parse tree
	 */
	void enterImport_default(js_parserParser.Import_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_default}.
	 * @param ctx the parse tree
	 */
	void exitImport_default(js_parserParser.Import_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(js_parserParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(js_parserParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_all}.
	 * @param ctx the parse tree
	 */
	void enterImport_all(js_parserParser.Import_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_all}.
	 * @param ctx the parse tree
	 */
	void exitImport_all(js_parserParser.Import_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_multiple_named}.
	 * @param ctx the parse tree
	 */
	void enterImport_multiple_named(js_parserParser.Import_multiple_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_multiple_named}.
	 * @param ctx the parse tree
	 */
	void exitImport_multiple_named(js_parserParser.Import_multiple_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#import_alias}.
	 * @param ctx the parse tree
	 */
	void enterImport_alias(js_parserParser.Import_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_alias}.
	 * @param ctx the parse tree
	 */
	void exitImport_alias(js_parserParser.Import_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(js_parserParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(js_parserParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(js_parserParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(js_parserParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(js_parserParser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(js_parserParser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#single_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_decl_with_type(js_parserParser.Single_decl_with_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#single_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_decl_with_type(js_parserParser.Single_decl_with_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#single_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void enterSingle_decl_with_init(js_parserParser.Single_decl_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#single_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void exitSingle_decl_with_init(js_parserParser.Single_decl_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expression(js_parserParser.Single_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expression(js_parserParser.Single_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#multi_declaratuon}.
	 * @param ctx the parse tree
	 */
	void enterMulti_declaratuon(js_parserParser.Multi_declaratuonContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#multi_declaratuon}.
	 * @param ctx the parse tree
	 */
	void exitMulti_declaratuon(js_parserParser.Multi_declaratuonContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void enterMulti_decl_with_type(js_parserParser.Multi_decl_with_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void exitMulti_decl_with_type(js_parserParser.Multi_decl_with_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void enterMulti_decl_with_init(js_parserParser.Multi_decl_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void exitMulti_decl_with_init(js_parserParser.Multi_decl_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(js_parserParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(js_parserParser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(js_parserParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(js_parserParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#normal_for}.
	 * @param ctx the parse tree
	 */
	void enterNormal_for(js_parserParser.Normal_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#normal_for}.
	 * @param ctx the parse tree
	 */
	void exitNormal_for(js_parserParser.Normal_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(js_parserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(js_parserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(js_parserParser.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(js_parserParser.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#loop_block}.
	 * @param ctx the parse tree
	 */
	void enterLoop_block(js_parserParser.Loop_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#loop_block}.
	 * @param ctx the parse tree
	 */
	void exitLoop_block(js_parserParser.Loop_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#for_in}.
	 * @param ctx the parse tree
	 */
	void enterFor_in(js_parserParser.For_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#for_in}.
	 * @param ctx the parse tree
	 */
	void exitFor_in(js_parserParser.For_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#for_of}.
	 * @param ctx the parse tree
	 */
	void enterFor_of(js_parserParser.For_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#for_of}.
	 * @param ctx the parse tree
	 */
	void exitFor_of(js_parserParser.For_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(js_parserParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(js_parserParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(js_parserParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(js_parserParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(js_parserParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(js_parserParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(js_parserParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(js_parserParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(js_parserParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(js_parserParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(js_parserParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(js_parserParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(js_parserParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(js_parserParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#elif_expression}.
	 * @param ctx the parse tree
	 */
	void enterElif_expression(js_parserParser.Elif_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#elif_expression}.
	 * @param ctx the parse tree
	 */
	void exitElif_expression(js_parserParser.Elif_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(js_parserParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(js_parserParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#modern_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterModern_if_statement(js_parserParser.Modern_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#modern_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitModern_if_statement(js_parserParser.Modern_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(js_parserParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(js_parserParser.AssignmentsContext ctx);
}