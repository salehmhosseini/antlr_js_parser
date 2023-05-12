// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/tmp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tmpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tmpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tmpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tmpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(tmpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#loop_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_condition(tmpParser.Loop_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(tmpParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(tmpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(tmpParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(tmpParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(tmpParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(tmpParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tmpParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(tmpParser.Primary_expressionContext ctx);
}