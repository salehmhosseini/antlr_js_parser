// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/tmp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tmpParser}.
 */
public interface tmpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tmpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tmpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tmpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tmpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tmpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#loop_condition}.
	 * @param ctx the parse tree
	 */
	void enterLoop_condition(tmpParser.Loop_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#loop_condition}.
	 * @param ctx the parse tree
	 */
	void exitLoop_condition(tmpParser.Loop_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(tmpParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(tmpParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tmpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tmpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(tmpParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(tmpParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(tmpParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(tmpParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(tmpParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(tmpParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(tmpParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(tmpParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tmpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(tmpParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tmpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(tmpParser.Primary_expressionContext ctx);
}