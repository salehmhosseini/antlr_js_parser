// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/js_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class js_parserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SemiColon=1, Comma=2, DolorSign=3, ComputeSigns=4, LogicalOperator=5, 
		RelationalOperator=6, Des_In_CreamentOprators=7, RelationalOprators=8, 
		Assign=9, As=10, From=11, Import=12, Const=13, Var=14, Let=15, Equals=16, 
		OpenBracket=17, CloseBracket=18, OpenParen=19, CloseParen=20, OpenBrace=21, 
		CloseBrace=22, For=23, In=24, Of=25, Continue=26, Break=27, While=28, 
		Do=29, If=30, Else=31, ElseIf=32, Switch=33, Match=34, Case=35, Default=36, 
		Finally=37, Class=38, Constructor=39, This=40, New=41, Return=42, QuestionMark=43, 
		Colon=44, Identifier=45, Char=46, WS=47, StringLiteral=48, Number=49, 
		DecimalNumber=50, Exponent=51, Integer=52;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_statement = 2, RULE_statements = 3, 
		RULE_import_statement = 4, RULE_import_content = 5, RULE_import_default = 6, 
		RULE_import_from = 7, RULE_import_all = 8, RULE_import_multiple_named = 9, 
		RULE_import_alias = 10, RULE_variable_declaration = 11, RULE_variable_type = 12, 
		RULE_single_declaration = 13, RULE_single_decl_with_type = 14, RULE_single_decl_with_init = 15, 
		RULE_single_expression = 16, RULE_multi_declaratuon = 17, RULE_multi_decl_with_type = 18, 
		RULE_multi_decl_with_init = 19, RULE_multi_expression = 20, RULE_for_loop = 21, 
		RULE_normal_for = 22, RULE_condition = 23, RULE_for_update = 24, RULE_loop_block = 25, 
		RULE_for_in = 26, RULE_for_of = 27, RULE_while_loop = 28, RULE_do_while_loop = 29, 
		RULE_do_statement = 30, RULE_while_statement = 31, RULE_if_statement = 32, 
		RULE_if_expression = 33, RULE_if_block = 34, RULE_elif_expression = 35, 
		RULE_else_statement = 36, RULE_modern_if_statement = 37, RULE_assignments = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "statement", "statements", "import_statement", 
			"import_content", "import_default", "import_from", "import_all", "import_multiple_named", 
			"import_alias", "variable_declaration", "variable_type", "single_declaration", 
			"single_decl_with_type", "single_decl_with_init", "single_expression", 
			"multi_declaratuon", "multi_decl_with_type", "multi_decl_with_init", 
			"multi_expression", "for_loop", "normal_for", "condition", "for_update", 
			"loop_block", "for_in", "for_of", "while_loop", "do_while_loop", "do_statement", 
			"while_statement", "if_statement", "if_expression", "if_block", "elif_expression", 
			"else_statement", "modern_if_statement", "assignments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'$'", null, null, null, null, null, null, "'as'", 
			"'from'", "'import'", "'const'", "'var'", "'let'", null, "'['", "']'", 
			"'('", "')'", "'{'", "'}'", "'for'", "'in'", "'of'", "'continue'", "'break'", 
			"'while'", "'do'", "'if'", "'else'", "'elif'", "'switch'", "'match'", 
			"'case'", "'default'", "'finally'", "'class'", "'constructor'", "'this'", 
			"'new'", "'return'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SemiColon", "Comma", "DolorSign", "ComputeSigns", "LogicalOperator", 
			"RelationalOperator", "Des_In_CreamentOprators", "RelationalOprators", 
			"Assign", "As", "From", "Import", "Const", "Var", "Let", "Equals", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"For", "In", "Of", "Continue", "Break", "While", "Do", "If", "Else", 
			"ElseIf", "Switch", "Match", "Case", "Default", "Finally", "Class", "Constructor", 
			"This", "New", "Return", "QuestionMark", "Colon", "Identifier", "Char", 
			"WS", "StringLiteral", "Number", "DecimalNumber", "Exponent", "Integer"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "js_parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public js_parserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(js_parserParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			sourceElements();
			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					import_statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 39584306036744L) != 0)) {
				{
				{
				setState(88);
				statements();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Modern_if_statementContext modern_if_statement() {
			return getRuleContext(Modern_if_statementContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				do_while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				modern_if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				assignments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode DolorSign() { return getToken(js_parserParser.DolorSign, 0); }
		public TerminalNode Import() { return getToken(js_parserParser.Import, 0); }
		public Import_contentContext import_content() {
			return getRuleContext(Import_contentContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DolorSign);
			{
			setState(104);
			match(Import);
			setState(105);
			import_content();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_contentContext extends ParserRuleContext {
		public Import_defaultContext import_default() {
			return getRuleContext(Import_defaultContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_allContext import_all() {
			return getRuleContext(Import_allContext.class,0);
		}
		public Import_multiple_namedContext import_multiple_named() {
			return getRuleContext(Import_multiple_namedContext.class,0);
		}
		public Import_aliasContext import_alias() {
			return getRuleContext(Import_aliasContext.class,0);
		}
		public Import_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_contentContext import_content() throws RecognitionException {
		Import_contentContext _localctx = new Import_contentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_content);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				import_default();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				import_from();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				import_all();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				import_multiple_named();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				import_alias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_defaultContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public Import_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_defaultContext import_default() throws RecognitionException {
		Import_defaultContext _localctx = new Import_defaultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_import_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(StringLiteral);
			setState(115);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_fromContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public TerminalNode From() { return getToken(js_parserParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public TerminalNode As() { return getToken(js_parserParser.As, 0); }
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(Identifier);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(118);
				match(As);
				setState(119);
				match(Identifier);
				}
			}

			setState(122);
			match(From);
			setState(123);
			match(StringLiteral);
			setState(124);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_allContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(js_parserParser.Comma, 0); }
		public TerminalNode As() { return getToken(js_parserParser.As, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode From() { return getToken(js_parserParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public Import_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_allContext import_all() throws RecognitionException {
		Import_allContext _localctx = new Import_allContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_import_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Comma);
			setState(127);
			match(As);
			setState(128);
			match(Identifier);
			setState(129);
			match(From);
			setState(130);
			match(StringLiteral);
			setState(131);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_multiple_namedContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public TerminalNode From() { return getToken(js_parserParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(js_parserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(js_parserParser.Comma, i);
		}
		public Import_multiple_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_multiple_named; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_multiple_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_multiple_named(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_multiple_named(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_multiple_namedContext import_multiple_named() throws RecognitionException {
		Import_multiple_namedContext _localctx = new Import_multiple_namedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_import_multiple_named);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Identifier);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(134);
				match(Comma);
				setState(135);
				match(Identifier);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(From);
			setState(142);
			match(StringLiteral);
			setState(143);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_aliasContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public TerminalNode As() { return getToken(js_parserParser.As, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public Import_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_aliasContext import_alias() throws RecognitionException {
		Import_aliasContext _localctx = new Import_aliasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_import_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(StringLiteral);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(146);
				match(As);
				setState(147);
				match(Identifier);
				}
			}

			setState(150);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode DolorSign() { return getToken(js_parserParser.DolorSign, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public Multi_declaratuonContext multi_declaratuon() {
			return getRuleContext(Multi_declaratuonContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(DolorSign);
			setState(153);
			variable_type();
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(154);
				single_declaration();
				}
				break;
			case 2:
				{
				setState(155);
				multi_declaratuon();
				}
				break;
			}
			setState(158);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_typeContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(js_parserParser.Let, 0); }
		public TerminalNode Var() { return getToken(js_parserParser.Var, 0); }
		public TerminalNode Const() { return getToken(js_parserParser.Const, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitVariable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_declarationContext extends ParserRuleContext {
		public Single_decl_with_typeContext single_decl_with_type() {
			return getRuleContext(Single_decl_with_typeContext.class,0);
		}
		public Single_decl_with_initContext single_decl_with_init() {
			return getRuleContext(Single_decl_with_initContext.class,0);
		}
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitSingle_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitSingle_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_single_declaration);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				single_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				single_decl_with_init();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_decl_with_typeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public Single_decl_with_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_decl_with_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterSingle_decl_with_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitSingle_decl_with_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitSingle_decl_with_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_decl_with_typeContext single_decl_with_type() throws RecognitionException {
		Single_decl_with_typeContext _localctx = new Single_decl_with_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_single_decl_with_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_decl_with_initContext extends ParserRuleContext {
		public Single_decl_with_typeContext single_decl_with_type() {
			return getRuleContext(Single_decl_with_typeContext.class,0);
		}
		public TerminalNode Equals() { return getToken(js_parserParser.Equals, 0); }
		public Single_expressionContext single_expression() {
			return getRuleContext(Single_expressionContext.class,0);
		}
		public Single_decl_with_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_decl_with_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterSingle_decl_with_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitSingle_decl_with_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitSingle_decl_with_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_decl_with_initContext single_decl_with_init() throws RecognitionException {
		Single_decl_with_initContext _localctx = new Single_decl_with_initContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_single_decl_with_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			single_decl_with_type();
			setState(169);
			match(Equals);
			setState(170);
			single_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_expressionContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(js_parserParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(js_parserParser.Number, i);
		}
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public List<TerminalNode> ComputeSigns() { return getTokens(js_parserParser.ComputeSigns); }
		public TerminalNode ComputeSigns(int i) {
			return getToken(js_parserParser.ComputeSigns, i);
		}
		public Single_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterSingle_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitSingle_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitSingle_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_expressionContext single_expression() throws RecognitionException {
		Single_expressionContext _localctx = new Single_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_single_expression);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(Number);
				{
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					match(ComputeSigns);
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(180);
				match(Number);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_declaratuonContext extends ParserRuleContext {
		public Multi_decl_with_typeContext multi_decl_with_type() {
			return getRuleContext(Multi_decl_with_typeContext.class,0);
		}
		public Multi_decl_with_initContext multi_decl_with_init() {
			return getRuleContext(Multi_decl_with_initContext.class,0);
		}
		public Multi_declaratuonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_declaratuon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterMulti_declaratuon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitMulti_declaratuon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitMulti_declaratuon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_declaratuonContext multi_declaratuon() throws RecognitionException {
		Multi_declaratuonContext _localctx = new Multi_declaratuonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multi_declaratuon);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				multi_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				multi_decl_with_init();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_decl_with_typeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(js_parserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(js_parserParser.Comma, i);
		}
		public Multi_decl_with_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_decl_with_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterMulti_decl_with_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitMulti_decl_with_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitMulti_decl_with_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_decl_with_typeContext multi_decl_with_type() throws RecognitionException {
		Multi_decl_with_typeContext _localctx = new Multi_decl_with_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multi_decl_with_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				match(Identifier);
				setState(188);
				match(Comma);
				setState(189);
				match(Identifier);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_decl_with_initContext extends ParserRuleContext {
		public Multi_decl_with_typeContext multi_decl_with_type() {
			return getRuleContext(Multi_decl_with_typeContext.class,0);
		}
		public TerminalNode Equals() { return getToken(js_parserParser.Equals, 0); }
		public Multi_expressionContext multi_expression() {
			return getRuleContext(Multi_expressionContext.class,0);
		}
		public Multi_decl_with_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_decl_with_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterMulti_decl_with_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitMulti_decl_with_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitMulti_decl_with_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_decl_with_initContext multi_decl_with_init() throws RecognitionException {
		Multi_decl_with_initContext _localctx = new Multi_decl_with_initContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multi_decl_with_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			multi_decl_with_type();
			setState(195);
			match(Equals);
			setState(196);
			multi_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_expressionContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(js_parserParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(js_parserParser.Number, i);
		}
		public TerminalNode Comma() { return getToken(js_parserParser.Comma, 0); }
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public List<TerminalNode> ComputeSigns() { return getTokens(js_parserParser.ComputeSigns); }
		public TerminalNode ComputeSigns(int i) {
			return getToken(js_parserParser.ComputeSigns, i);
		}
		public Multi_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterMulti_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitMulti_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitMulti_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multi_expression);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(198);
				match(Number);
				setState(199);
				match(Comma);
				setState(200);
				match(Number);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(201);
				match(Identifier);
				setState(202);
				match(Comma);
				setState(203);
				match(Identifier);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(204);
				match(Number);
				{
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					match(ComputeSigns);
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(210);
				match(Number);
				}
				setState(212);
				match(Comma);
				{
				setState(213);
				match(Number);
				{
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					match(ComputeSigns);
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(219);
				match(Number);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(js_parserParser.For, 0); }
		public Normal_forContext normal_for() {
			return getRuleContext(Normal_forContext.class,0);
		}
		public For_inContext for_in() {
			return getRuleContext(For_inContext.class,0);
		}
		public For_ofContext for_of() {
			return getRuleContext(For_ofContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(For);
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(223);
				normal_for();
				}
				break;
			case 2:
				{
				setState(224);
				for_in();
				}
				break;
			case 3:
				{
				setState(225);
				for_of();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Normal_forContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode Comma() { return getToken(js_parserParser.Comma, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Normal_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterNormal_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitNormal_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitNormal_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_forContext normal_for() throws RecognitionException {
		Normal_forContext _localctx = new Normal_forContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_normal_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(OpenParen);
			setState(229);
			variable_declaration();
			setState(230);
			match(Comma);
			setState(231);
			condition();
			setState(232);
			match(SemiColon);
			setState(233);
			for_update();
			setState(234);
			match(CloseParen);
			setState(235);
			match(OpenBrace);
			setState(236);
			loop_block();
			setState(237);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public List<TerminalNode> RelationalOperator() { return getTokens(js_parserParser.RelationalOperator); }
		public TerminalNode RelationalOperator(int i) {
			return getToken(js_parserParser.RelationalOperator, i);
		}
		public List<TerminalNode> Number() { return getTokens(js_parserParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(js_parserParser.Number, i);
		}
		public List<TerminalNode> LogicalOperator() { return getTokens(js_parserParser.LogicalOperator); }
		public TerminalNode LogicalOperator(int i) {
			return getToken(js_parserParser.LogicalOperator, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(Identifier);
			setState(240);
			match(RelationalOperator);
			setState(241);
			match(Number);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOperator) {
				{
				{
				setState(242);
				match(LogicalOperator);
				setState(243);
				match(Identifier);
				setState(244);
				match(RelationalOperator);
				setState(245);
				match(Number);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_updateContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode Des_In_CreamentOprators() { return getToken(js_parserParser.Des_In_CreamentOprators, 0); }
		public TerminalNode RelationalOprators() { return getToken(js_parserParser.RelationalOprators, 0); }
		public TerminalNode Number() { return getToken(js_parserParser.Number, 0); }
		public For_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterFor_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitFor_update(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitFor_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_updateContext for_update() throws RecognitionException {
		For_updateContext _localctx = new For_updateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_update);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(251);
				match(Identifier);
				setState(252);
				match(Des_In_CreamentOprators);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(253);
				match(Identifier);
				setState(254);
				match(RelationalOprators);
				setState(255);
				match(Number);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Loop_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterLoop_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitLoop_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitLoop_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_blockContext loop_block() throws RecognitionException {
		Loop_blockContext _localctx = new Loop_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_inContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public TerminalNode In() { return getToken(js_parserParser.In, 0); }
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public TerminalNode Char() { return getToken(js_parserParser.Char, 0); }
		public For_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterFor_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitFor_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitFor_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_inContext for_in() throws RecognitionException {
		For_inContext _localctx = new For_inContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(OpenParen);
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			match(In);
			setState(263);
			match(Identifier);
			setState(264);
			match(CloseParen);
			setState(265);
			match(OpenBrace);
			setState(266);
			loop_block();
			setState(267);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_ofContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public TerminalNode Of() { return getToken(js_parserParser.Of, 0); }
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(js_parserParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(js_parserParser.CloseParen, i);
		}
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public TerminalNode Char() { return getToken(js_parserParser.Char, 0); }
		public For_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterFor_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitFor_of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitFor_of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_ofContext for_of() throws RecognitionException {
		For_ofContext _localctx = new For_ofContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_of);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(OpenParen);
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
			match(Of);
			setState(272);
			match(Identifier);
			setState(273);
			match(CloseParen);
			setState(274);
			match(OpenBrace);
			setState(275);
			loop_block();
			setState(276);
			match(CloseParen);
			setState(277);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(js_parserParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(While);
			setState(280);
			match(OpenParen);
			setState(281);
			condition();
			setState(282);
			match(CloseParen);
			setState(283);
			match(OpenBrace);
			setState(284);
			loop_block();
			setState(285);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_loopContext extends ParserRuleContext {
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			do_statement();
			setState(288);
			while_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_statementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(js_parserParser.Do, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Do);
			setState(291);
			match(OpenBrace);
			setState(292);
			loop_block();
			setState(293);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			while_loop();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public Elif_expressionContext elif_expression() {
			return getRuleContext(Elif_expressionContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			if_expression();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ElseIf) {
				{
				setState(298);
				elif_expression();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(299);
					else_statement();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(js_parserParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(If);
			setState(305);
			match(OpenParen);
			setState(306);
			condition();
			setState(307);
			match(CloseParen);
			setState(308);
			match(OpenBrace);
			setState(309);
			if_block();
			setState(310);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_expressionContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(js_parserParser.ElseIf, 0); }
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Elif_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterElif_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitElif_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitElif_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_expressionContext elif_expression() throws RecognitionException {
		Elif_expressionContext _localctx = new Elif_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elif_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ElseIf);
			setState(315);
			match(OpenParen);
			setState(316);
			condition();
			setState(317);
			match(CloseParen);
			setState(318);
			match(OpenBrace);
			setState(319);
			if_block();
			setState(320);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(js_parserParser.Else, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(Else);
			setState(323);
			match(OpenBrace);
			setState(324);
			if_block();
			setState(325);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Modern_if_statementContext extends ParserRuleContext {
		public TerminalNode QuestionMark() { return getToken(js_parserParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(js_parserParser.Colon, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(js_parserParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(js_parserParser.StringLiteral, i);
		}
		public List<TerminalNode> Number() { return getTokens(js_parserParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(js_parserParser.Number, i);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public TerminalNode Return() { return getToken(js_parserParser.Return, 0); }
		public Modern_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modern_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterModern_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitModern_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitModern_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modern_if_statementContext modern_if_statement() throws RecognitionException {
		Modern_if_statementContext _localctx = new Modern_if_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_modern_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				{
				{
				setState(327);
				match(Return);
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Number) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case Identifier:
				{
				setState(329);
				assignments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(332);
			match(QuestionMark);
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(334);
			match(Colon);
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(js_parserParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode Number() { return getToken(js_parserParser.Number, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public TerminalNode RelationalOprators() { return getToken(js_parserParser.RelationalOprators, 0); }
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignments);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(337);
				match(Identifier);
				setState(338);
				match(Assign);
				setState(339);
				match(StringLiteral);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(340);
				match(Identifier);
				setState(341);
				match(Assign);
				setState(342);
				match(Number);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(343);
				match(Identifier);
				setState(344);
				match(RelationalOprators);
				setState(345);
				match(Number);
				}
				setState(347);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u015f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002U\b\u0002"+
		"\u000b\u0002\f\u0002V\u0001\u0002\u0005\u0002Z\b\u0002\n\u0002\f\u0002"+
		"]\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0089\b\t\n\t\f\t\u008c"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0095"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009d\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0003\r\u00a5\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u00b1\b\u0010\u000b\u0010\f\u0010\u00b2\u0001\u0010\u0003\u0010"+
		"\u00b6\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00ba\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00bf\b\u0012\u000b\u0012\f"+
		"\u0012\u00c0\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0004\u0014\u00cf\b\u0014\u000b\u0014\f\u0014\u00d0\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00d8"+
		"\b\u0014\u000b\u0014\f\u0014\u00d9\u0001\u0014\u0003\u0014\u00dd\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e3\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00f7\b\u0017\n\u0017\f\u0017\u00fa\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0101\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u012d\b \u0003"+
		" \u012f\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u014b\b%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u015d\b&\u0001&\u0000\u0000"+
		"\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0003\u0001\u0000\r\u000f\u0001"+
		"\u0000-.\u0001\u000001\u015a\u0000N\u0001\u0000\u0000\u0000\u0002Q\u0001"+
		"\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000"+
		"\u0000\bg\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000"+
		"\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000"+
		"\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000"+
		"\u0000\u001a\u00a4\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000"+
		"\u0000\u001e\u00a8\u0001\u0000\u0000\u0000 \u00b5\u0001\u0000\u0000\u0000"+
		"\"\u00b9\u0001\u0000\u0000\u0000$\u00be\u0001\u0000\u0000\u0000&\u00c2"+
		"\u0001\u0000\u0000\u0000(\u00dc\u0001\u0000\u0000\u0000*\u00de\u0001\u0000"+
		"\u0000\u0000,\u00e4\u0001\u0000\u0000\u0000.\u00ef\u0001\u0000\u0000\u0000"+
		"0\u0100\u0001\u0000\u0000\u00002\u0102\u0001\u0000\u0000\u00004\u0104"+
		"\u0001\u0000\u0000\u00006\u010d\u0001\u0000\u0000\u00008\u0117\u0001\u0000"+
		"\u0000\u0000:\u011f\u0001\u0000\u0000\u0000<\u0122\u0001\u0000\u0000\u0000"+
		">\u0127\u0001\u0000\u0000\u0000@\u0129\u0001\u0000\u0000\u0000B\u0130"+
		"\u0001\u0000\u0000\u0000D\u0138\u0001\u0000\u0000\u0000F\u013a\u0001\u0000"+
		"\u0000\u0000H\u0142\u0001\u0000\u0000\u0000J\u014a\u0001\u0000\u0000\u0000"+
		"L\u015c\u0001\u0000\u0000\u0000NO\u0003\u0002\u0001\u0000OP\u0005\u0000"+
		"\u0000\u0001P\u0001\u0001\u0000\u0000\u0000QR\u0003\u0004\u0002\u0000"+
		"R\u0003\u0001\u0000\u0000\u0000SU\u0003\b\u0004\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W[\u0001\u0000\u0000\u0000XZ\u0003\u0006\u0003\u0000YX\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^f\u0003\u0016\u000b\u0000_f\u0003*\u0015\u0000`f\u00038\u001c"+
		"\u0000af\u0003:\u001d\u0000bf\u0003@ \u0000cf\u0003J%\u0000df\u0003L&"+
		"\u0000e^\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gh\u0005\u0003\u0000\u0000hi\u0005\f\u0000\u0000ij\u0003\n\u0005"+
		"\u0000j\t\u0001\u0000\u0000\u0000kq\u0003\f\u0006\u0000lq\u0003\u000e"+
		"\u0007\u0000mq\u0003\u0010\b\u0000nq\u0003\u0012\t\u0000oq\u0003\u0014"+
		"\n\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u000b"+
		"\u0001\u0000\u0000\u0000rs\u00050\u0000\u0000st\u0005\u0001\u0000\u0000"+
		"t\r\u0001\u0000\u0000\u0000ux\u0005-\u0000\u0000vw\u0005\n\u0000\u0000"+
		"wy\u0005-\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0005\u000b\u0000\u0000{|\u00050\u0000\u0000"+
		"|}\u0005\u0001\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u0002\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0005-"+
		"\u0000\u0000\u0081\u0082\u0005\u000b\u0000\u0000\u0082\u0083\u00050\u0000"+
		"\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0011\u0001\u0000\u0000"+
		"\u0000\u0085\u008a\u0005-\u0000\u0000\u0086\u0087\u0005\u0002\u0000\u0000"+
		"\u0087\u0089\u0005-\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000b\u0000\u0000\u008e"+
		"\u008f\u00050\u0000\u0000\u008f\u0090\u0005\u0001\u0000\u0000\u0090\u0013"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u00050\u0000\u0000\u0092\u0093\u0005"+
		"\n\u0000\u0000\u0093\u0095\u0005-\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0015\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009c\u0003\u0018"+
		"\f\u0000\u009a\u009d\u0003\u001a\r\u0000\u009b\u009d\u0003\"\u0011\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0001\u0000\u0000"+
		"\u009f\u0017\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000"+
		"\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003\u001c\u000e\u0000"+
		"\u00a3\u00a5\u0003\u001e\u000f\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u001b\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005-\u0000\u0000\u00a7\u001d\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0003\u001c\u000e\u0000\u00a9\u00aa\u0005\u0010\u0000\u0000\u00aa"+
		"\u00ab\u0003 \u0010\u0000\u00ab\u001f\u0001\u0000\u0000\u0000\u00ac\u00b6"+
		"\u00051\u0000\u0000\u00ad\u00b6\u0005-\u0000\u0000\u00ae\u00b0\u00051"+
		"\u0000\u0000\u00af\u00b1\u0005\u0004\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b6\u00051\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b6!\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003$\u0012\u0000\u00b8"+
		"\u00ba\u0003&\u0013\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba#\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"-\u0000\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00bf\u0005-\u0000"+
		"\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1%\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003$\u0012\u0000\u00c3"+
		"\u00c4\u0005\u0010\u0000\u0000\u00c4\u00c5\u0003(\u0014\u0000\u00c5\'"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u00051\u0000\u0000\u00c7\u00c8\u0005"+
		"\u0002\u0000\u0000\u00c8\u00dd\u00051\u0000\u0000\u00c9\u00ca\u0005-\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb\u00dd\u0005-\u0000\u0000"+
		"\u00cc\u00ce\u00051\u0000\u0000\u00cd\u00cf\u0005\u0004\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u00051\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0002\u0000\u0000\u00d5\u00d7"+
		"\u00051\u0000\u0000\u00d6\u00d8\u0005\u0004\u0000\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u00051\u0000\u0000\u00dc\u00c6\u0001\u0000"+
		"\u0000\u0000\u00dc\u00c9\u0001\u0000\u0000\u0000\u00dc\u00cc\u0001\u0000"+
		"\u0000\u0000\u00dd)\u0001\u0000\u0000\u0000\u00de\u00e2\u0005\u0017\u0000"+
		"\u0000\u00df\u00e3\u0003,\u0016\u0000\u00e0\u00e3\u00034\u001a\u0000\u00e1"+
		"\u00e3\u00036\u001b\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3+\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u0013\u0000\u0000\u00e5\u00e6\u0003"+
		"\u0016\u000b\u0000\u00e6\u00e7\u0005\u0002\u0000\u0000\u00e7\u00e8\u0003"+
		".\u0017\u0000\u00e8\u00e9\u0005\u0001\u0000\u0000\u00e9\u00ea\u00030\u0018"+
		"\u0000\u00ea\u00eb\u0005\u0014\u0000\u0000\u00eb\u00ec\u0005\u0015\u0000"+
		"\u0000\u00ec\u00ed\u00032\u0019\u0000\u00ed\u00ee\u0005\u0016\u0000\u0000"+
		"\u00ee-\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005-\u0000\u0000\u00f0\u00f1"+
		"\u0005\u0006\u0000\u0000\u00f1\u00f8\u00051\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0005\u0000\u0000\u00f3\u00f4\u0005-\u0000\u0000\u00f4\u00f5\u0005\u0006"+
		"\u0000\u0000\u00f5\u00f7\u00051\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9/\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005-\u0000\u0000\u00fc"+
		"\u0101\u0005\u0007\u0000\u0000\u00fd\u00fe\u0005-\u0000\u0000\u00fe\u00ff"+
		"\u0005\b\u0000\u0000\u00ff\u0101\u00051\u0000\u0000\u0100\u00fb\u0001"+
		"\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u01011\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0003\u0006\u0003\u0000\u01033\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\u0013\u0000\u0000\u0105\u0106\u0007\u0001\u0000"+
		"\u0000\u0106\u0107\u0005\u0018\u0000\u0000\u0107\u0108\u0005-\u0000\u0000"+
		"\u0108\u0109\u0005\u0014\u0000\u0000\u0109\u010a\u0005\u0015\u0000\u0000"+
		"\u010a\u010b\u00032\u0019\u0000\u010b\u010c\u0005\u0016\u0000\u0000\u010c"+
		"5\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0013\u0000\u0000\u010e\u010f"+
		"\u0007\u0001\u0000\u0000\u010f\u0110\u0005\u0019\u0000\u0000\u0110\u0111"+
		"\u0005-\u0000\u0000\u0111\u0112\u0005\u0014\u0000\u0000\u0112\u0113\u0005"+
		"\u0015\u0000\u0000\u0113\u0114\u00032\u0019\u0000\u0114\u0115\u0005\u0014"+
		"\u0000\u0000\u0115\u0116\u0005\u0016\u0000\u0000\u01167\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\u001c\u0000\u0000\u0118\u0119\u0005\u0013\u0000"+
		"\u0000\u0119\u011a\u0003.\u0017\u0000\u011a\u011b\u0005\u0014\u0000\u0000"+
		"\u011b\u011c\u0005\u0015\u0000\u0000\u011c\u011d\u00032\u0019\u0000\u011d"+
		"\u011e\u0005\u0016\u0000\u0000\u011e9\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0003<\u001e\u0000\u0120\u0121\u0003>\u001f\u0000\u0121;\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005\u001d\u0000\u0000\u0123\u0124\u0005\u0015"+
		"\u0000\u0000\u0124\u0125\u00032\u0019\u0000\u0125\u0126\u0005\u0016\u0000"+
		"\u0000\u0126=\u0001\u0000\u0000\u0000\u0127\u0128\u00038\u001c\u0000\u0128"+
		"?\u0001\u0000\u0000\u0000\u0129\u012e\u0003B!\u0000\u012a\u012c\u0003"+
		"F#\u0000\u012b\u012d\u0003H$\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000"+
		"\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012fA\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u001e\u0000\u0000\u0131"+
		"\u0132\u0005\u0013\u0000\u0000\u0132\u0133\u0003.\u0017\u0000\u0133\u0134"+
		"\u0005\u0014\u0000\u0000\u0134\u0135\u0005\u0015\u0000\u0000\u0135\u0136"+
		"\u0003D\"\u0000\u0136\u0137\u0005\u0016\u0000\u0000\u0137C\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0003\u0006\u0003\u0000\u0139E\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005 \u0000\u0000\u013b\u013c\u0005\u0013\u0000\u0000"+
		"\u013c\u013d\u0003.\u0017\u0000\u013d\u013e\u0005\u0014\u0000\u0000\u013e"+
		"\u013f\u0005\u0015\u0000\u0000\u013f\u0140\u0003D\"\u0000\u0140\u0141"+
		"\u0005\u0016\u0000\u0000\u0141G\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"\u001f\u0000\u0000\u0143\u0144\u0005\u0015\u0000\u0000\u0144\u0145\u0003"+
		"D\"\u0000\u0145\u0146\u0005\u0016\u0000\u0000\u0146I\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005*\u0000\u0000\u0148\u014b\u0007\u0002\u0000\u0000"+
		"\u0149\u014b\u0003L&\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014a\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005+\u0000\u0000\u014d\u014e\u0007\u0002\u0000\u0000\u014e\u014f\u0005"+
		",\u0000\u0000\u014f\u0150\u0007\u0002\u0000\u0000\u0150K\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005-\u0000\u0000\u0152\u0153\u0005\t\u0000\u0000"+
		"\u0153\u015d\u00050\u0000\u0000\u0154\u0155\u0005-\u0000\u0000\u0155\u0156"+
		"\u0005\t\u0000\u0000\u0156\u015d\u00051\u0000\u0000\u0157\u0158\u0005"+
		"-\u0000\u0000\u0158\u0159\u0005\b\u0000\u0000\u0159\u015a\u00051\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0005\u0001\u0000"+
		"\u0000\u015c\u0151\u0001\u0000\u0000\u0000\u015c\u0154\u0001\u0000\u0000"+
		"\u0000\u015c\u0157\u0001\u0000\u0000\u0000\u015dM\u0001\u0000\u0000\u0000"+
		"\u0017V[epx\u008a\u0094\u009c\u00a4\u00b2\u00b5\u00b9\u00c0\u00d0\u00d9"+
		"\u00dc\u00e2\u00f8\u0100\u012c\u012e\u014a\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}