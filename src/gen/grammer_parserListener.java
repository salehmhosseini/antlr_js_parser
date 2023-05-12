// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/grammer_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammer_parser}.
 */
public interface grammer_parserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammer_parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammer_parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammer_parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(grammer_parser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(grammer_parser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grammer_parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grammer_parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(grammer_parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(grammer_parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(grammer_parser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(grammer_parser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_content}.
	 * @param ctx the parse tree
	 */
	void enterImport_content(grammer_parser.Import_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_content}.
	 * @param ctx the parse tree
	 */
	void exitImport_content(grammer_parser.Import_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_default}.
	 * @param ctx the parse tree
	 */
	void enterImport_default(grammer_parser.Import_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_default}.
	 * @param ctx the parse tree
	 */
	void exitImport_default(grammer_parser.Import_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(grammer_parser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(grammer_parser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_all}.
	 * @param ctx the parse tree
	 */
	void enterImport_all(grammer_parser.Import_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_all}.
	 * @param ctx the parse tree
	 */
	void exitImport_all(grammer_parser.Import_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_multiple_named}.
	 * @param ctx the parse tree
	 */
	void enterImport_multiple_named(grammer_parser.Import_multiple_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_multiple_named}.
	 * @param ctx the parse tree
	 */
	void exitImport_multiple_named(grammer_parser.Import_multiple_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#import_alias}.
	 * @param ctx the parse tree
	 */
	void enterImport_alias(grammer_parser.Import_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#import_alias}.
	 * @param ctx the parse tree
	 */
	void exitImport_alias(grammer_parser.Import_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(grammer_parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(grammer_parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(grammer_parser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(grammer_parser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(grammer_parser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(grammer_parser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#single_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_decl_with_type(grammer_parser.Single_decl_with_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#single_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_decl_with_type(grammer_parser.Single_decl_with_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#single_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void enterSingle_decl_with_init(grammer_parser.Single_decl_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#single_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void exitSingle_decl_with_init(grammer_parser.Single_decl_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#single_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expression(grammer_parser.Single_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#single_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expression(grammer_parser.Single_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#multi_declaratuon}.
	 * @param ctx the parse tree
	 */
	void enterMulti_declaratuon(grammer_parser.Multi_declaratuonContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#multi_declaratuon}.
	 * @param ctx the parse tree
	 */
	void exitMulti_declaratuon(grammer_parser.Multi_declaratuonContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void enterMulti_decl_with_type(grammer_parser.Multi_decl_with_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 */
	void exitMulti_decl_with_type(grammer_parser.Multi_decl_with_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void enterMulti_decl_with_init(grammer_parser.Multi_decl_with_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 */
	void exitMulti_decl_with_init(grammer_parser.Multi_decl_with_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(grammer_parser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(grammer_parser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(grammer_parser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(grammer_parser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#normal_for}.
	 * @param ctx the parse tree
	 */
	void enterNormal_for(grammer_parser.Normal_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#normal_for}.
	 * @param ctx the parse tree
	 */
	void exitNormal_for(grammer_parser.Normal_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grammer_parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grammer_parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(grammer_parser.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(grammer_parser.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#loop_block}.
	 * @param ctx the parse tree
	 */
	void enterLoop_block(grammer_parser.Loop_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#loop_block}.
	 * @param ctx the parse tree
	 */
	void exitLoop_block(grammer_parser.Loop_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#for_in}.
	 * @param ctx the parse tree
	 */
	void enterFor_in(grammer_parser.For_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#for_in}.
	 * @param ctx the parse tree
	 */
	void exitFor_in(grammer_parser.For_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#for_of}.
	 * @param ctx the parse tree
	 */
	void enterFor_of(grammer_parser.For_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#for_of}.
	 * @param ctx the parse tree
	 */
	void exitFor_of(grammer_parser.For_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(grammer_parser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(grammer_parser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(grammer_parser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(grammer_parser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(grammer_parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(grammer_parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(grammer_parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(grammer_parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(grammer_parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(grammer_parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(grammer_parser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(grammer_parser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(grammer_parser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(grammer_parser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#elif_expression}.
	 * @param ctx the parse tree
	 */
	void enterElif_expression(grammer_parser.Elif_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#elif_expression}.
	 * @param ctx the parse tree
	 */
	void exitElif_expression(grammer_parser.Elif_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(grammer_parser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(grammer_parser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#modern_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterModern_if_statement(grammer_parser.Modern_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#modern_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitModern_if_statement(grammer_parser.Modern_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case_statement(grammer_parser.Switch_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#switch_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case_statement(grammer_parser.Switch_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(grammer_parser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(grammer_parser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#default_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefault_statement(grammer_parser.Default_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#default_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefault_statement(grammer_parser.Default_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(grammer_parser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(grammer_parser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#class_statement}.
	 * @param ctx the parse tree
	 */
	void enterClass_statement(grammer_parser.Class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#class_statement}.
	 * @param ctx the parse tree
	 */
	void exitClass_statement(grammer_parser.Class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(grammer_parser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(grammer_parser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(grammer_parser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(grammer_parser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void enterException_statement(grammer_parser.Exception_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void exitException_statement(grammer_parser.Exception_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(grammer_parser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(grammer_parser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(grammer_parser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(grammer_parser.Catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void enterFinally_statement(grammer_parser.Finally_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void exitFinally_statement(grammer_parser.Finally_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_statement(grammer_parser.Comment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_statement(grammer_parser.Comment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(grammer_parser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(grammer_parser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(grammer_parser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(grammer_parser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(grammer_parser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(grammer_parser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(grammer_parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(grammer_parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(grammer_parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(grammer_parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(grammer_parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(grammer_parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(grammer_parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(grammer_parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(grammer_parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(grammer_parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(grammer_parser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(grammer_parser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammer_parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(grammer_parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammer_parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(grammer_parser.PrimaryExpressionContext ctx);
}