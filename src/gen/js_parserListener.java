// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/mine_codes/js_parser.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link js_parserParser#import_from_alias}.
	 * @param ctx the parse tree
	 */
	void enterImport_from_alias(js_parserParser.Import_from_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#import_from_alias}.
	 * @param ctx the parse tree
	 */
	void exitImport_from_alias(js_parserParser.Import_from_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link js_parserParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(js_parserParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link js_parserParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(js_parserParser.IdentifierNameContext ctx);
}