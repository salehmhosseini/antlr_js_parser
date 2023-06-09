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
		T__0=1, OPEN_PAREN=1, CLOSE_PAREN=2, IDENTIFIER=3, INTEGER=4, WS=5, LogicalOperator=6, 
		AdditiveOperator=7, MultiplicativeOperator=8, UnaryOperator=9, DolorSign=10, 
		Import=11, StringLiteral=12, SemiColon=13, Identifier=14, As=15, From=16, 
		Comma=17, Let=18, Var=19, Const=20, Equals=21, Number=22, ComputeSigns=23, 
		For=24, OpenParen=25, CloseParen=26, OpenBrace=27, CloseBrace=28, RelationalOperator=29, 
		Des_In_CreamentOprators=30, RelationalOprators=31, Char=32, In=33, Of=34, 
		While=35, Do=36, If=37, ElseIf=38, Else=39, Return=40, QuestionMark=41, 
		Colon=42, Switch=43, Match=44, Case=45, Break=46, Default=47, Assign=48, 
		Class=49, Constructor=50, Function_=51, DataTypes=52, Try=53, Catch=54, 
		Finally=55;
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
		RULE_else_statement = 36, RULE_modern_if_statement = 37, RULE_switch_case_statement = 38, 
		RULE_case_statement = 39, RULE_default_statement = 40, RULE_assignments = 41, 
		RULE_class_statement = 42, RULE_constructor = 43, RULE_function_statement = 44, 
		RULE_exception_statement = 45, RULE_try_statement = 46, RULE_catch_statement = 47, 
		RULE_finally_statement = 48;
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
			"else_statement", "modern_if_statement", "switch_case_statement", "case_statement", 
			"default_statement", "assignments", "class_statement", "constructor", 
			"function_statement", "exception_statement", "try_statement", "catch_statement", 
			"finally_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CLOSE_PAREN", "IDENTIFIER", "INTEGER", "WS", "LogicalOperator", 
			"AdditiveOperator", "MultiplicativeOperator", "UnaryOperator", "DolorSign", 
			"Import", "StringLiteral", "SemiColon", "Identifier", "As", "From", "Comma", 
			"Let", "Var", "Const", "Equals", "Number", "ComputeSigns", "For", "OpenParen", 
			"CloseParen", "OpenBrace", "CloseBrace", "RelationalOperator", "Des_In_CreamentOprators", 
			"RelationalOprators", "Char", "In", "Of", "While", "Do", "If", "ElseIf", 
			"Else", "Return", "QuestionMark", "Colon", "Switch", "Match", "Case", 
			"Break", "Default", "Assign", "Class", "Constructor", "Function_", "DataTypes", 
			"Try", "Catch", "Finally"
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
			setState(98);
			sourceElements();
			setState(99);
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
			setState(101);
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
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(103);
					import_statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11849677347505152L) != 0)) {
				{
				{
				setState(108);
				statements();
				}
				}
				setState(113);
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
		public Switch_case_statementContext switch_case_statement() {
			return getRuleContext(Switch_case_statementContext.class,0);
		}
		public Class_statementContext class_statement() {
			return getRuleContext(Class_statementContext.class,0);
		}
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public Exception_statementContext exception_statement() {
			return getRuleContext(Exception_statementContext.class,0);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				do_while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				modern_if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				assignments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				switch_case_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				class_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				function_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				exception_statement();
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
			setState(127);
			match(DolorSign);
			{
			setState(128);
			match(Import);
			setState(129);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				import_default();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				import_from();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				import_all();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				import_multiple_named();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
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
			setState(138);
			match(StringLiteral);
			setState(139);
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
			setState(141);
			match(Identifier);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(142);
				match(As);
				setState(143);
				match(Identifier);
				}
			}

			setState(146);
			match(From);
			setState(147);
			match(StringLiteral);
			setState(148);
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
			setState(150);
			match(Comma);
			setState(151);
			match(As);
			setState(152);
			match(Identifier);
			setState(153);
			match(From);
			setState(154);
			match(StringLiteral);
			setState(155);
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
			setState(157);
			match(Identifier);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(158);
				match(T__0);
				setState(159);
				match(Identifier);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(From);
			setState(166);
			match(StringLiteral);
			setState(167);
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
			setState(169);
			match(StringLiteral);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(170);
				match(As);
				setState(171);
				match(Identifier);
				}
			}

			setState(174);
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
			setState(176);
			match(DolorSign);
			setState(177);
			variable_type();
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(178);
				single_declaration();
				}
				break;
			case 2:
				{
				setState(179);
				multi_declaratuon();
				}
				break;
			}
			setState(182);
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
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				single_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
			setState(190);
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
			setState(192);
			single_decl_with_type();
			setState(193);
			match(Equals);
			setState(194);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(Number);
				{
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					match(ComputeSigns);
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(204);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				multi_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(Identifier);
				setState(212);
				match(Comma);
				setState(213);
				match(Identifier);
				}
				}
				setState(216); 
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
			setState(218);
			multi_decl_with_type();
			setState(219);
			match(Equals);
			setState(220);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(222);
				match(Number);
				setState(223);
				match(Comma);
				setState(224);
				match(Number);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(225);
				match(Identifier);
				setState(226);
				match(Comma);
				setState(227);
				match(Identifier);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(228);
				match(Number);
				{
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					match(ComputeSigns);
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(234);
				match(Number);
				}
				setState(236);
				match(Comma);
				{
				setState(237);
				match(Number);
				{
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					match(ComputeSigns);
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(243);
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
			setState(246);
			match(For);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(247);
				normal_for();
				}
				break;
			case 2:
				{
				setState(248);
				for_in();
				}
				break;
			case 3:
				{
				setState(249);
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
			setState(252);
			match(OpenParen);
			setState(253);
			variable_declaration();
			setState(254);
			match(Comma);
			setState(255);
			condition();
			setState(256);
			match(SemiColon);
			setState(257);
			for_update();
			setState(258);
			match(CloseParen);
			setState(259);
			match(OpenBrace);
			setState(260);
			loop_block();
			setState(261);
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
			setState(263);
			match(Identifier);
			setState(264);
			match(RelationalOperator);
			setState(265);
			match(Number);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOperator) {
				{
				{
				setState(266);
				match(LogicalOperator);
				setState(267);
				match(Identifier);
				setState(268);
				match(RelationalOperator);
				setState(269);
				match(Number);
				}
				}
				setState(274);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(275);
				match(Identifier);
				setState(276);
				match(Des_In_CreamentOprators);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(277);
				match(Identifier);
				setState(278);
				match(RelationalOprators);
				setState(279);
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
			setState(282);
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
			setState(284);
			match(OpenParen);
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(286);
			match(In);
			setState(287);
			match(Identifier);
			setState(288);
			match(CloseParen);
			setState(289);
			match(OpenBrace);
			setState(290);
			loop_block();
			setState(291);
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
			setState(293);
			match(OpenParen);
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(295);
			match(Of);
			setState(296);
			match(Identifier);
			setState(297);
			match(CloseParen);
			setState(298);
			match(OpenBrace);
			setState(299);
			loop_block();
			setState(300);
			match(CloseParen);
			setState(301);
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
			setState(303);
			match(While);
			setState(304);
			match(OpenParen);
			setState(305);
			condition();
			setState(306);
			match(CloseParen);
			setState(307);
			match(OpenBrace);
			setState(308);
			loop_block();
			setState(309);
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
			setState(311);
			do_statement();
			setState(312);
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
			setState(314);
			match(Do);
			setState(315);
			match(OpenBrace);
			setState(316);
			loop_block();
			setState(317);
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
			setState(319);
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
			setState(321);
			if_expression();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ElseIf) {
				{
				setState(322);
				elif_expression();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(323);
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
			setState(328);
			match(If);
			setState(329);
			match(OpenParen);
			setState(330);
			condition();
			setState(331);
			match(CloseParen);
			setState(332);
			match(OpenBrace);
			setState(333);
			if_block();
			setState(334);
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
			setState(336);
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
			setState(338);
			match(ElseIf);
			setState(339);
			match(OpenParen);
			setState(340);
			condition();
			setState(341);
			match(CloseParen);
			setState(342);
			match(OpenBrace);
			setState(343);
			if_block();
			setState(344);
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
			setState(346);
			match(Else);
			setState(347);
			match(OpenBrace);
			setState(348);
			if_block();
			setState(349);
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
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
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
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				{
				{
				setState(351);
				match(Return);
				setState(352);
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
				setState(353);
				assignments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			match(QuestionMark);
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(358);
			match(Colon);
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(360);
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
	public static class Switch_case_statementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public Default_statementContext default_statement() {
			return getRuleContext(Default_statementContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public TerminalNode Switch() { return getToken(js_parserParser.Switch, 0); }
		public TerminalNode Match() { return getToken(js_parserParser.Match, 0); }
		public List<Case_statementContext> case_statement() {
			return getRuleContexts(Case_statementContext.class);
		}
		public Case_statementContext case_statement(int i) {
			return getRuleContext(Case_statementContext.class,i);
		}
		public Switch_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterSwitch_case_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitSwitch_case_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitSwitch_case_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_case_statementContext switch_case_statement() throws RecognitionException {
		Switch_case_statementContext _localctx = new Switch_case_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switch_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==Switch || _la==Match) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(363);
			match(Identifier);
			setState(364);
			match(OpenBrace);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(365);
				case_statement();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			default_statement();
			setState(372);
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
	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(js_parserParser.Case, 0); }
		public TerminalNode Colon() { return getToken(js_parserParser.Colon, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Break() { return getToken(js_parserParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public TerminalNode Number() { return getToken(js_parserParser.Number, 0); }
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(Case);
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			match(Colon);
			setState(377);
			statements();
			setState(378);
			match(Break);
			setState(379);
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
	public static class Default_statementContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(js_parserParser.Default, 0); }
		public TerminalNode Colon() { return getToken(js_parserParser.Colon, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Break() { return getToken(js_parserParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public Default_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterDefault_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitDefault_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitDefault_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_statementContext default_statement() throws RecognitionException {
		Default_statementContext _localctx = new Default_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_default_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(Default);
			setState(382);
			match(Colon);
			setState(383);
			statements();
			setState(384);
			match(Break);
			setState(385);
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
	public static class AssignmentsContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(js_parserParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(js_parserParser.StringLiteral, 0); }
		public TerminalNode Number() { return getToken(js_parserParser.Number, 0); }
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
		enterRule(_localctx, 82, RULE_assignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(387);
				match(Identifier);
				setState(388);
				match(Assign);
				setState(389);
				match(StringLiteral);
				}
				}
				break;
			case 2:
				{
				{
				setState(390);
				match(Identifier);
				setState(391);
				match(Assign);
				setState(392);
				match(Number);
				}
				}
				break;
			case 3:
				{
				{
				setState(393);
				match(Identifier);
				setState(394);
				match(RelationalOprators);
				setState(395);
				match(Number);
				}
				}
				break;
			}
			setState(398);
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
	public static class Class_statementContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(js_parserParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Class_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterClass_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitClass_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitClass_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementContext class_statement() throws RecognitionException {
		Class_statementContext _localctx = new Class_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_class_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(Class);
			setState(401);
			match(Identifier);
			setState(402);
			match(OpenBrace);
			setState(403);
			constructor();
			setState(404);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(js_parserParser.Constructor, 0); }
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(js_parserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(js_parserParser.Comma, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(Constructor);
			setState(407);
			match(OpenParen);
			{
			setState(408);
			match(Identifier);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(409);
				match(Comma);
				setState(410);
				match(Identifier);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(416);
			match(CloseParen);
			setState(417);
			match(OpenBrace);
			setState(418);
			statements();
			setState(419);
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
	public static class Function_statementContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(js_parserParser.Function_, 0); }
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Return() { return getToken(js_parserParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public List<TerminalNode> DataTypes() { return getTokens(js_parserParser.DataTypes); }
		public TerminalNode DataTypes(int i) {
			return getToken(js_parserParser.DataTypes, i);
		}
		public List<TerminalNode> Comma() { return getTokens(js_parserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(js_parserParser.Comma, i);
		}
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitFunction_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitFunction_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_statementContext function_statement() throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Function_);
			setState(422);
			match(Identifier);
			setState(423);
			match(OpenParen);
			{
			setState(424);
			match(DataTypes);
			setState(425);
			match(Identifier);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(426);
				match(Comma);
				setState(427);
				match(DataTypes);
				setState(428);
				match(Identifier);
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(434);
			match(CloseParen);
			setState(435);
			match(OpenBrace);
			setState(436);
			statements();
			setState(437);
			match(Return);
			setState(438);
			match(Identifier);
			setState(439);
			match(SemiColon);
			setState(440);
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
	public static class Exception_statementContext extends ParserRuleContext {
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public Exception_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterException_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitException_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitException_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_statementContext exception_statement() throws RecognitionException {
		Exception_statementContext _localctx = new Exception_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exception_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			try_statement();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Catch) {
				{
				setState(443);
				catch_statement();
				}
			}

			setState(446);
			finally_statement();
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
	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(js_parserParser.Try, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(Try);
			setState(449);
			match(OpenBrace);
			setState(450);
			statements();
			setState(451);
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
	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(js_parserParser.Catch, 0); }
		public TerminalNode OpenParen() { return getToken(js_parserParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(js_parserParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(Catch);
			setState(454);
			match(OpenParen);
			setState(455);
			match(Identifier);
			setState(456);
			match(CloseParen);
			setState(457);
			match(OpenBrace);
			setState(458);
			statements();
			setState(459);
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
	public static class Finally_statementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(js_parserParser.Finally, 0); }
		public TerminalNode OpenBrace() { return getToken(js_parserParser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(js_parserParser.CloseBrace, 0); }
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitFinally_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitFinally_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Finally);
			setState(462);
			match(OpenBrace);
			setState(463);
			statements();
			setState(464);
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

	public static final String _serializedATN =
		"\u0004\u00017\u01d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002i\b\u0002"+
		"\u000b\u0002\f\u0002j\u0001\u0002\u0005\u0002n\b\u0002\n\u0002\f\u0002"+
		"q\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003~\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0089\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0091\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00ad\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b5\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r"+
		"\u00bd\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00c9\b\u0010\u000b\u0010\f\u0010\u00ca\u0001\u0010\u0003\u0010\u00ce"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d2\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u00d7\b\u0012\u000b\u0012\f\u0012"+
		"\u00d8\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u00e7\b\u0014\u000b\u0014\f\u0014\u00e8\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00f0\b\u0014"+
		"\u000b\u0014\f\u0014\u00f1\u0001\u0014\u0003\u0014\u00f5\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00fb\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u010f\b\u0017\n\u0017\f\u0017\u0112\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0119\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0145\b \u0003 \u0147"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u0163\b%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u016f"+
		"\b&\n&\f&\u0172\t&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u018d"+
		"\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u019c\b+\n+\f+\u019f\t+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0005,\u01ae\b,\n,\f,\u01b1\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0003-\u01bd\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0000\u00001\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0004\u0001\u0000\u0012"+
		"\u0014\u0002\u0000\u000e\u000e  \u0002\u0000\f\f\u0016\u0016\u0001\u0000"+
		"+,\u01cc\u0000b\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000"+
		"\u0004h\u0001\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u007f"+
		"\u0001\u0000\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u008a\u0001"+
		"\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u0096\u0001"+
		"\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a9\u0001"+
		"\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b8\u0001"+
		"\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00be\u0001"+
		"\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000"+
		"\u0000\u0000\"\u00d1\u0001\u0000\u0000\u0000$\u00d6\u0001\u0000\u0000"+
		"\u0000&\u00da\u0001\u0000\u0000\u0000(\u00f4\u0001\u0000\u0000\u0000*"+
		"\u00f6\u0001\u0000\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000.\u0107\u0001"+
		"\u0000\u0000\u00000\u0118\u0001\u0000\u0000\u00002\u011a\u0001\u0000\u0000"+
		"\u00004\u011c\u0001\u0000\u0000\u00006\u0125\u0001\u0000\u0000\u00008"+
		"\u012f\u0001\u0000\u0000\u0000:\u0137\u0001\u0000\u0000\u0000<\u013a\u0001"+
		"\u0000\u0000\u0000>\u013f\u0001\u0000\u0000\u0000@\u0141\u0001\u0000\u0000"+
		"\u0000B\u0148\u0001\u0000\u0000\u0000D\u0150\u0001\u0000\u0000\u0000F"+
		"\u0152\u0001\u0000\u0000\u0000H\u015a\u0001\u0000\u0000\u0000J\u0162\u0001"+
		"\u0000\u0000\u0000L\u016a\u0001\u0000\u0000\u0000N\u0176\u0001\u0000\u0000"+
		"\u0000P\u017d\u0001\u0000\u0000\u0000R\u018c\u0001\u0000\u0000\u0000T"+
		"\u0190\u0001\u0000\u0000\u0000V\u0196\u0001\u0000\u0000\u0000X\u01a5\u0001"+
		"\u0000\u0000\u0000Z\u01ba\u0001\u0000\u0000\u0000\\\u01c0\u0001\u0000"+
		"\u0000\u0000^\u01c5\u0001\u0000\u0000\u0000`\u01cd\u0001\u0000\u0000\u0000"+
		"bc\u0003\u0002\u0001\u0000cd\u0005\u0000\u0000\u0001d\u0001\u0001\u0000"+
		"\u0000\u0000ef\u0003\u0004\u0002\u0000f\u0003\u0001\u0000\u0000\u0000"+
		"gi\u0003\b\u0004\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ko\u0001\u0000\u0000"+
		"\u0000ln\u0003\u0006\u0003\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0005"+
		"\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000r~\u0003\u0016\u000b"+
		"\u0000s~\u0003*\u0015\u0000t~\u00038\u001c\u0000u~\u0003:\u001d\u0000"+
		"v~\u0003@ \u0000w~\u0003J%\u0000x~\u0003R)\u0000y~\u0003L&\u0000z~\u0003"+
		"T*\u0000{~\u0003X,\u0000|~\u0003Z-\u0000}r\u0001\u0000\u0000\u0000}s\u0001"+
		"\u0000\u0000\u0000}t\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000"+
		"}v\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000"+
		"\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081"+
		"\u0082\u0003\n\u0005\u0000\u0082\t\u0001\u0000\u0000\u0000\u0083\u0089"+
		"\u0003\f\u0006\u0000\u0084\u0089\u0003\u000e\u0007\u0000\u0085\u0089\u0003"+
		"\u0010\b\u0000\u0086\u0089\u0003\u0012\t\u0000\u0087\u0089\u0003\u0014"+
		"\n\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000\u0000"+
		"\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\f\u0000\u0000\u008b\u008c\u0005\r\u0000\u0000"+
		"\u008c\r\u0001\u0000\u0000\u0000\u008d\u0090\u0005\u000e\u0000\u0000\u008e"+
		"\u008f\u0005\u000f\u0000\u0000\u008f\u0091\u0005\u000e\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093"+
		"\u0094\u0005\f\u0000\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095\u000f"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0098"+
		"\u0005\u000f\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a"+
		"\u0005\u0010\u0000\u0000\u009a\u009b\u0005\f\u0000\u0000\u009b\u009c\u0005"+
		"\r\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u00a2\u0005\u000e"+
		"\u0000\u0000\u009e\u009f\u0005\u0001\u0000\u0000\u009f\u00a1\u0005\u000e"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00a7\u0005\f\u0000"+
		"\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u0013\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0005\f\u0000\u0000\u00aa\u00ab\u0005\u000f\u0000\u0000\u00ab"+
		"\u00ad\u0005\u000e\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\r\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\n\u0000\u0000\u00b1\u00b4\u0003\u0018\f\u0000\u00b2\u00b5\u0003"+
		"\u001a\r\u0000\u00b3\u00b5\u0003\"\u0011\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\r\u0000\u0000\u00b7\u0017\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0007\u0000\u0000\u0000\u00b9\u0019\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0003\u001c\u000e\u0000\u00bb\u00bd\u0003\u001e\u000f"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u000e\u0000"+
		"\u0000\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e"+
		"\u0000\u00c1\u00c2\u0005\u0015\u0000\u0000\u00c2\u00c3\u0003 \u0010\u0000"+
		"\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00ce\u0005\u0016\u0000\u0000"+
		"\u00c5\u00ce\u0005\u000e\u0000\u0000\u00c6\u00c8\u0005\u0016\u0000\u0000"+
		"\u00c7\u00c9\u0005\u0017\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ce\u0005\u0016\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ce!\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003$\u0012\u0000\u00d0\u00d2"+
		"\u0003&\u0013\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u000e"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0011\u0000\u0000\u00d5\u00d7\u0005\u000e"+
		"\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da\u00db\u0003$\u0012\u0000"+
		"\u00db\u00dc\u0005\u0015\u0000\u0000\u00dc\u00dd\u0003(\u0014\u0000\u00dd"+
		"\'\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0016\u0000\u0000\u00df\u00e0"+
		"\u0005\u0011\u0000\u0000\u00e0\u00f5\u0005\u0016\u0000\u0000\u00e1\u00e2"+
		"\u0005\u000e\u0000\u0000\u00e2\u00e3\u0005\u0011\u0000\u0000\u00e3\u00f5"+
		"\u0005\u000e\u0000\u0000\u00e4\u00e6\u0005\u0016\u0000\u0000\u00e5\u00e7"+
		"\u0005\u0017\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0016\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0011\u0000\u0000\u00ed\u00ef\u0005\u0016\u0000\u0000\u00ee\u00f0"+
		"\u0005\u0017\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5"+
		"\u0005\u0016\u0000\u0000\u00f4\u00de\u0001\u0000\u0000\u0000\u00f4\u00e1"+
		"\u0001\u0000\u0000\u0000\u00f4\u00e4\u0001\u0000\u0000\u0000\u00f5)\u0001"+
		"\u0000\u0000\u0000\u00f6\u00fa\u0005\u0018\u0000\u0000\u00f7\u00fb\u0003"+
		",\u0016\u0000\u00f8\u00fb\u00034\u001a\u0000\u00f9\u00fb\u00036\u001b"+
		"\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb+\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0019\u0000\u0000\u00fd\u00fe\u0003\u0016\u000b\u0000"+
		"\u00fe\u00ff\u0005\u0011\u0000\u0000\u00ff\u0100\u0003.\u0017\u0000\u0100"+
		"\u0101\u0005\r\u0000\u0000\u0101\u0102\u00030\u0018\u0000\u0102\u0103"+
		"\u0005\u001a\u0000\u0000\u0103\u0104\u0005\u001b\u0000\u0000\u0104\u0105"+
		"\u00032\u0019\u0000\u0105\u0106\u0005\u001c\u0000\u0000\u0106-\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108\u0109\u0005\u001d"+
		"\u0000\u0000\u0109\u0110\u0005\u0016\u0000\u0000\u010a\u010b\u0005\u0006"+
		"\u0000\u0000\u010b\u010c\u0005\u000e\u0000\u0000\u010c\u010d\u0005\u001d"+
		"\u0000\u0000\u010d\u010f\u0005\u0016\u0000\u0000\u010e\u010a\u0001\u0000"+
		"\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111/\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u000e\u0000"+
		"\u0000\u0114\u0119\u0005\u001e\u0000\u0000\u0115\u0116\u0005\u000e\u0000"+
		"\u0000\u0116\u0117\u0005\u001f\u0000\u0000\u0117\u0119\u0005\u0016\u0000"+
		"\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118\u0115\u0001\u0000\u0000"+
		"\u0000\u01191\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u0006\u0003\u0000"+
		"\u011b3\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0019\u0000\u0000\u011d"+
		"\u011e\u0007\u0001\u0000\u0000\u011e\u011f\u0005!\u0000\u0000\u011f\u0120"+
		"\u0005\u000e\u0000\u0000\u0120\u0121\u0005\u001a\u0000\u0000\u0121\u0122"+
		"\u0005\u001b\u0000\u0000\u0122\u0123\u00032\u0019\u0000\u0123\u0124\u0005"+
		"\u001c\u0000\u0000\u01245\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0019"+
		"\u0000\u0000\u0126\u0127\u0007\u0001\u0000\u0000\u0127\u0128\u0005\"\u0000"+
		"\u0000\u0128\u0129\u0005\u000e\u0000\u0000\u0129\u012a\u0005\u001a\u0000"+
		"\u0000\u012a\u012b\u0005\u001b\u0000\u0000\u012b\u012c\u00032\u0019\u0000"+
		"\u012c\u012d\u0005\u001a\u0000\u0000\u012d\u012e\u0005\u001c\u0000\u0000"+
		"\u012e7\u0001\u0000\u0000\u0000\u012f\u0130\u0005#\u0000\u0000\u0130\u0131"+
		"\u0005\u0019\u0000\u0000\u0131\u0132\u0003.\u0017\u0000\u0132\u0133\u0005"+
		"\u001a\u0000\u0000\u0133\u0134\u0005\u001b\u0000\u0000\u0134\u0135\u0003"+
		"2\u0019\u0000\u0135\u0136\u0005\u001c\u0000\u0000\u01369\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0003<\u001e\u0000\u0138\u0139\u0003>\u001f\u0000\u0139"+
		";\u0001\u0000\u0000\u0000\u013a\u013b\u0005$\u0000\u0000\u013b\u013c\u0005"+
		"\u001b\u0000\u0000\u013c\u013d\u00032\u0019\u0000\u013d\u013e\u0005\u001c"+
		"\u0000\u0000\u013e=\u0001\u0000\u0000\u0000\u013f\u0140\u00038\u001c\u0000"+
		"\u0140?\u0001\u0000\u0000\u0000\u0141\u0146\u0003B!\u0000\u0142\u0144"+
		"\u0003F#\u0000\u0143\u0145\u0003H$\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000"+
		"\u0000\u0146\u0142\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147A\u0001\u0000\u0000\u0000\u0148\u0149\u0005%\u0000\u0000\u0149"+
		"\u014a\u0005\u0019\u0000\u0000\u014a\u014b\u0003.\u0017\u0000\u014b\u014c"+
		"\u0005\u001a\u0000\u0000\u014c\u014d\u0005\u001b\u0000\u0000\u014d\u014e"+
		"\u0003D\"\u0000\u014e\u014f\u0005\u001c\u0000\u0000\u014fC\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0003\u0006\u0003\u0000\u0151E\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005&\u0000\u0000\u0153\u0154\u0005\u0019\u0000\u0000"+
		"\u0154\u0155\u0003.\u0017\u0000\u0155\u0156\u0005\u001a\u0000\u0000\u0156"+
		"\u0157\u0005\u001b\u0000\u0000\u0157\u0158\u0003D\"\u0000\u0158\u0159"+
		"\u0005\u001c\u0000\u0000\u0159G\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"\'\u0000\u0000\u015b\u015c\u0005\u001b\u0000\u0000\u015c\u015d\u0003D"+
		"\"\u0000\u015d\u015e\u0005\u001c\u0000\u0000\u015eI\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005(\u0000\u0000\u0160\u0163\u0007\u0002\u0000\u0000"+
		"\u0161\u0163\u0003R)\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0005)\u0000\u0000\u0165\u0166\u0007\u0002\u0000\u0000\u0166\u0167\u0005"+
		"*\u0000\u0000\u0167\u0168\u0007\u0002\u0000\u0000\u0168\u0169\u0005\r"+
		"\u0000\u0000\u0169K\u0001\u0000\u0000\u0000\u016a\u016b\u0007\u0003\u0000"+
		"\u0000\u016b\u016c\u0005\u000e\u0000\u0000\u016c\u0170\u0005\u001b\u0000"+
		"\u0000\u016d\u016f\u0003N\'\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0003P(\u0000\u0174\u0175"+
		"\u0005\u001c\u0000\u0000\u0175M\u0001\u0000\u0000\u0000\u0176\u0177\u0005"+
		"-\u0000\u0000\u0177\u0178\u0007\u0002\u0000\u0000\u0178\u0179\u0005*\u0000"+
		"\u0000\u0179\u017a\u0003\u0006\u0003\u0000\u017a\u017b\u0005.\u0000\u0000"+
		"\u017b\u017c\u0005\r\u0000\u0000\u017cO\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0005/\u0000\u0000\u017e\u017f\u0005*\u0000\u0000\u017f\u0180\u0003"+
		"\u0006\u0003\u0000\u0180\u0181\u0005.\u0000\u0000\u0181\u0182\u0005\r"+
		"\u0000\u0000\u0182Q\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u000e\u0000"+
		"\u0000\u0184\u0185\u00050\u0000\u0000\u0185\u018d\u0005\f\u0000\u0000"+
		"\u0186\u0187\u0005\u000e\u0000\u0000\u0187\u0188\u00050\u0000\u0000\u0188"+
		"\u018d\u0005\u0016\u0000\u0000\u0189\u018a\u0005\u000e\u0000\u0000\u018a"+
		"\u018b\u0005\u001f\u0000\u0000\u018b\u018d\u0005\u0016\u0000\u0000\u018c"+
		"\u0183\u0001\u0000\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000\u018c"+
		"\u0189\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0005\r\u0000\u0000\u018fS\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u00051\u0000\u0000\u0191\u0192\u0005\u000e\u0000\u0000\u0192\u0193\u0005"+
		"\u001b\u0000\u0000\u0193\u0194\u0003V+\u0000\u0194\u0195\u0005\u001c\u0000"+
		"\u0000\u0195U\u0001\u0000\u0000\u0000\u0196\u0197\u00052\u0000\u0000\u0197"+
		"\u0198\u0005\u0019\u0000\u0000\u0198\u019d\u0005\u000e\u0000\u0000\u0199"+
		"\u019a\u0005\u0011\u0000\u0000\u019a\u019c\u0005\u000e\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005\u001a\u0000\u0000\u01a1\u01a2\u0005\u001b\u0000\u0000\u01a2"+
		"\u01a3\u0003\u0006\u0003\u0000\u01a3\u01a4\u0005\u001c\u0000\u0000\u01a4"+
		"W\u0001\u0000\u0000\u0000\u01a5\u01a6\u00053\u0000\u0000\u01a6\u01a7\u0005"+
		"\u000e\u0000\u0000\u01a7\u01a8\u0005\u0019\u0000\u0000\u01a8\u01a9\u0005"+
		"4\u0000\u0000\u01a9\u01af\u0005\u000e\u0000\u0000\u01aa\u01ab\u0005\u0011"+
		"\u0000\u0000\u01ab\u01ac\u00054\u0000\u0000\u01ac\u01ae\u0005\u000e\u0000"+
		"\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000"+
		"\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0005\u001a\u0000\u0000\u01b3\u01b4\u0005\u001b\u0000"+
		"\u0000\u01b4\u01b5\u0003\u0006\u0003\u0000\u01b5\u01b6\u0005(\u0000\u0000"+
		"\u01b6\u01b7\u0005\u000e\u0000\u0000\u01b7\u01b8\u0005\r\u0000\u0000\u01b8"+
		"\u01b9\u0005\u001c\u0000\u0000\u01b9Y\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0003\\.\u0000\u01bb\u01bd\u0003^/\u0000\u01bc\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0003`0\u0000\u01bf[\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u00055\u0000\u0000\u01c1\u01c2\u0005\u001b\u0000\u0000\u01c2\u01c3"+
		"\u0003\u0006\u0003\u0000\u01c3\u01c4\u0005\u001c\u0000\u0000\u01c4]\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u00056\u0000\u0000\u01c6\u01c7\u0005\u0019"+
		"\u0000\u0000\u01c7\u01c8\u0005\u000e\u0000\u0000\u01c8\u01c9\u0005\u001a"+
		"\u0000\u0000\u01c9\u01ca\u0005\u001b\u0000\u0000\u01ca\u01cb\u0003\u0006"+
		"\u0003\u0000\u01cb\u01cc\u0005\u001c\u0000\u0000\u01cc_\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u00057\u0000\u0000\u01ce\u01cf\u0005\u001b\u0000\u0000"+
		"\u01cf\u01d0\u0003\u0006\u0003\u0000\u01d0\u01d1\u0005\u001c\u0000\u0000"+
		"\u01d1a\u0001\u0000\u0000\u0000\u001bjo}\u0088\u0090\u00a2\u00ac\u00b4"+
		"\u00bc\u00ca\u00cd\u00d1\u00d8\u00e8\u00f1\u00f4\u00fa\u0110\u0118\u0144"+
		"\u0146\u0162\u0170\u018c\u019d\u01af\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}