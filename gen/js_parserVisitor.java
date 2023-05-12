// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/js_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link js_parserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface js_parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link js_parserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(js_parserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(js_parserParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(js_parserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(js_parserParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(js_parserParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_content(js_parserParser.Import_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_default(js_parserParser.Import_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(js_parserParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_all(js_parserParser.Import_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_multiple_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_multiple_named(js_parserParser.Import_multiple_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_alias(js_parserParser.Import_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(js_parserParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(js_parserParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#single_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_declaration(js_parserParser.Single_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#single_decl_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_decl_with_type(js_parserParser.Single_decl_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#single_decl_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_decl_with_init(js_parserParser.Single_decl_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#single_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expression(js_parserParser.Single_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#multi_declaratuon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_declaratuon(js_parserParser.Multi_declaratuonContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#multi_decl_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_decl_with_type(js_parserParser.Multi_decl_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#multi_decl_with_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_decl_with_init(js_parserParser.Multi_decl_with_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#multi_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_expression(js_parserParser.Multi_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(js_parserParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#normal_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_for(js_parserParser.Normal_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(js_parserParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update(js_parserParser.For_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#loop_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_block(js_parserParser.Loop_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#for_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in(js_parserParser.For_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#for_of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_of(js_parserParser.For_ofContext ctx);
}