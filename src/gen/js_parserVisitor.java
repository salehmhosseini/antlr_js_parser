// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/mine_codes/js_parser.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link js_parserParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(js_parserParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_default(js_parserParser.Import_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_alias(js_parserParser.Import_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(js_parserParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#import_from_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from_alias(js_parserParser.Import_from_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link js_parserParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(js_parserParser.IdentifierNameContext ctx);
}