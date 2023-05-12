// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/grammer_parser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grammer_parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SemiColon=1, Comma=2, DolorSign=3, QuestionMark=4, Colon=5, ComputeSigns=6, 
		Des_In_CreamentOprators=7, LogicalOperator=8, RelationalOperator=9, RelationalOprators=10, 
		Assign=11, Equals=12, As=13, From=14, Import=15, Const=16, Var=17, Let=18, 
		OpenBracket=19, CloseBracket=20, OpenParen=21, CloseParen=22, OpenBrace=23, 
		CloseBrace=24, For=25, In=26, Of=27, Continue=28, Break=29, While=30, 
		Do=31, If=32, Else=33, ElseIf=34, Switch=35, Match=36, Case=37, Default=38, 
		Finally=39, Class=40, Constructor=41, This=42, New=43, Return=44, DataTypes=45, 
		Function_=46, Try=47, Catch=48, Identifier=49, Char=50, WS=51, StringLiteral=52, 
		Number=53, DecimalNumber=54, Exponent=55, Integer=56, SingleLineComment=57, 
		MultiLineComment=58, Plus=59, Minus=60, Multiply=61, Divide=62, IntegerDivide=63, 
		Power=64, LogicalAnd=65, LogicalOr=66, Equalsw=67, NotEquals=68, RelationalOperatorw=69, 
		InequalityOperator=70, UnaryOperator=71, Tt=72;
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
		RULE_finally_statement = 48, RULE_comment_statement = 49, RULE_logical_expression = 50, 
		RULE_logicalOrExpression = 51;
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
			"finally_statement", "comment_statement", "logical_expression", "logicalOrExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'$'", "'?'", "':'", null, null, null, null, null, 
			null, null, "'as'", "'from'", "'import'", "'const'", "'var'", "'let'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "'for'", "'in'", "'of'", "'continue'", 
			"'break'", "'while'", "'do'", "'if'", "'else'", "'elif'", "'switch'", 
			"'match'", "'case'", "'default'", "'finally'", "'class'", "'constructor'", 
			"'this'", "'new'", "'return'", null, "'function'", "'try'", "'catch'", 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'//'", "'**'", "'&&'", "'||'", "'=='", "'!='", null, "'<>'", 
			null, "'###'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SemiColon", "Comma", "DolorSign", "QuestionMark", "Colon", "ComputeSigns", 
			"Des_In_CreamentOprators", "LogicalOperator", "RelationalOperator", "RelationalOprators", 
			"Assign", "Equals", "As", "From", "Import", "Const", "Var", "Let", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"For", "In", "Of", "Continue", "Break", "While", "Do", "If", "Else", 
			"ElseIf", "Switch", "Match", "Case", "Default", "Finally", "Class", "Constructor", 
			"This", "New", "Return", "DataTypes", "Function_", "Try", "Catch", "Identifier", 
			"Char", "WS", "StringLiteral", "Number", "DecimalNumber", "Exponent", 
			"Integer", "SingleLineComment", "MultiLineComment", "Plus", "Minus", 
			"Multiply", "Divide", "IntegerDivide", "Power", "LogicalAnd", "LogicalOr", 
			"Equalsw", "NotEquals", "RelationalOperatorw", "InequalityOperator", 
			"UnaryOperator", "Tt"
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
	public String getGrammarFileName() { return "grammer_parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammer_parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(grammer_parser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			sourceElements();
			setState(105);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitStatement(this);
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
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(109);
					import_statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 442145621994897416L) != 0)) {
				{
				{
				setState(114);
				statements();
				}
				}
				setState(119);
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
		public Comment_statementContext comment_statement() {
			return getRuleContext(Comment_statementContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				do_while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				modern_if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				assignments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				switch_case_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				class_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				function_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				exception_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				comment_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(132);
				logical_expression();
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
		public TerminalNode DolorSign() { return getToken(grammer_parser.DolorSign, 0); }
		public TerminalNode Import() { return getToken(grammer_parser.Import, 0); }
		public Import_contentContext import_content() {
			return getRuleContext(Import_contentContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(DolorSign);
			{
			setState(136);
			match(Import);
			setState(137);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_contentContext import_content() throws RecognitionException {
		Import_contentContext _localctx = new Import_contentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_content);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				import_default();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				import_from();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				import_all();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				import_multiple_named();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
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
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public Import_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_defaultContext import_default() throws RecognitionException {
		Import_defaultContext _localctx = new Import_defaultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_import_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(StringLiteral);
			setState(147);
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
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public TerminalNode From() { return getToken(grammer_parser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode As() { return getToken(grammer_parser.As, 0); }
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_from(this);
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
			setState(149);
			match(Identifier);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(150);
				match(As);
				setState(151);
				match(Identifier);
				}
			}

			setState(154);
			match(From);
			setState(155);
			match(StringLiteral);
			setState(156);
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
		public TerminalNode Comma() { return getToken(grammer_parser.Comma, 0); }
		public TerminalNode As() { return getToken(grammer_parser.As, 0); }
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode From() { return getToken(grammer_parser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public Import_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_allContext import_all() throws RecognitionException {
		Import_allContext _localctx = new Import_allContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_import_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Comma);
			setState(159);
			match(As);
			setState(160);
			match(Identifier);
			setState(161);
			match(From);
			setState(162);
			match(StringLiteral);
			setState(163);
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
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public TerminalNode From() { return getToken(grammer_parser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(grammer_parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(grammer_parser.Comma, i);
		}
		public Import_multiple_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_multiple_named; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_multiple_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_multiple_named(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_multiple_named(this);
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
			setState(165);
			match(Identifier);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(166);
				match(Comma);
				setState(167);
				match(Identifier);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(From);
			setState(174);
			match(StringLiteral);
			setState(175);
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
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode As() { return getToken(grammer_parser.As, 0); }
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public Import_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterImport_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitImport_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitImport_alias(this);
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
			setState(177);
			match(StringLiteral);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(178);
				match(As);
				setState(179);
				match(Identifier);
				}
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode DolorSign() { return getToken(grammer_parser.DolorSign, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(DolorSign);
			setState(185);
			variable_type();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(186);
				single_declaration();
				}
				break;
			case 2:
				{
				setState(187);
				multi_declaratuon();
				}
				break;
			}
			setState(190);
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
		public TerminalNode Let() { return getToken(grammer_parser.Let, 0); }
		public TerminalNode Var() { return getToken(grammer_parser.Var, 0); }
		public TerminalNode Const() { return getToken(grammer_parser.Const, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitVariable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitVariable_type(this);
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
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitSingle_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitSingle_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_single_declaration);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				single_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public Single_decl_with_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_decl_with_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterSingle_decl_with_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitSingle_decl_with_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitSingle_decl_with_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_decl_with_typeContext single_decl_with_type() throws RecognitionException {
		Single_decl_with_typeContext _localctx = new Single_decl_with_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_single_decl_with_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		public TerminalNode Equals() { return getToken(grammer_parser.Equals, 0); }
		public Single_expressionContext single_expression() {
			return getRuleContext(Single_expressionContext.class,0);
		}
		public Single_decl_with_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_decl_with_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterSingle_decl_with_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitSingle_decl_with_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitSingle_decl_with_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_decl_with_initContext single_decl_with_init() throws RecognitionException {
		Single_decl_with_initContext _localctx = new Single_decl_with_initContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_single_decl_with_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			single_decl_with_type();
			setState(201);
			match(Equals);
			setState(202);
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
		public List<TerminalNode> Number() { return getTokens(grammer_parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(grammer_parser.Number, i);
		}
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public List<TerminalNode> ComputeSigns() { return getTokens(grammer_parser.ComputeSigns); }
		public TerminalNode ComputeSigns(int i) {
			return getToken(grammer_parser.ComputeSigns, i);
		}
		public Single_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterSingle_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitSingle_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitSingle_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_expressionContext single_expression() throws RecognitionException {
		Single_expressionContext _localctx = new Single_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_single_expression);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(Number);
				{
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					match(ComputeSigns);
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(212);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterMulti_declaratuon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitMulti_declaratuon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitMulti_declaratuon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_declaratuonContext multi_declaratuon() throws RecognitionException {
		Multi_declaratuonContext _localctx = new Multi_declaratuonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multi_declaratuon);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				multi_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(grammer_parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(grammer_parser.Comma, i);
		}
		public Multi_decl_with_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_decl_with_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterMulti_decl_with_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitMulti_decl_with_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitMulti_decl_with_type(this);
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
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(Identifier);
				setState(220);
				match(Comma);
				setState(221);
				match(Identifier);
				}
				}
				setState(224); 
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
		public TerminalNode Equals() { return getToken(grammer_parser.Equals, 0); }
		public Multi_expressionContext multi_expression() {
			return getRuleContext(Multi_expressionContext.class,0);
		}
		public Multi_decl_with_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_decl_with_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterMulti_decl_with_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitMulti_decl_with_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitMulti_decl_with_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_decl_with_initContext multi_decl_with_init() throws RecognitionException {
		Multi_decl_with_initContext _localctx = new Multi_decl_with_initContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multi_decl_with_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			multi_decl_with_type();
			setState(227);
			match(Equals);
			setState(228);
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
		public List<TerminalNode> Number() { return getTokens(grammer_parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(grammer_parser.Number, i);
		}
		public TerminalNode Comma() { return getToken(grammer_parser.Comma, 0); }
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<TerminalNode> ComputeSigns() { return getTokens(grammer_parser.ComputeSigns); }
		public TerminalNode ComputeSigns(int i) {
			return getToken(grammer_parser.ComputeSigns, i);
		}
		public Multi_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterMulti_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitMulti_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitMulti_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multi_expression);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(230);
				match(Number);
				setState(231);
				match(Comma);
				setState(232);
				match(Number);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(233);
				match(Identifier);
				setState(234);
				match(Comma);
				setState(235);
				match(Identifier);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(236);
				match(Number);
				{
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					match(ComputeSigns);
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(242);
				match(Number);
				}
				setState(244);
				match(Comma);
				{
				setState(245);
				match(Number);
				{
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					match(ComputeSigns);
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(251);
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
		public TerminalNode For() { return getToken(grammer_parser.For, 0); }
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(For);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(255);
				normal_for();
				}
				break;
			case 2:
				{
				setState(256);
				for_in();
				}
				break;
			case 3:
				{
				setState(257);
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
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode Comma() { return getToken(grammer_parser.Comma, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Normal_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterNormal_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitNormal_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitNormal_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_forContext normal_for() throws RecognitionException {
		Normal_forContext _localctx = new Normal_forContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_normal_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(OpenParen);
			setState(261);
			variable_declaration();
			setState(262);
			match(Comma);
			setState(263);
			condition();
			setState(264);
			match(SemiColon);
			setState(265);
			for_update();
			setState(266);
			match(CloseParen);
			setState(267);
			match(OpenBrace);
			setState(268);
			loop_block();
			setState(269);
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
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<TerminalNode> RelationalOperator() { return getTokens(grammer_parser.RelationalOperator); }
		public TerminalNode RelationalOperator(int i) {
			return getToken(grammer_parser.RelationalOperator, i);
		}
		public List<TerminalNode> Number() { return getTokens(grammer_parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(grammer_parser.Number, i);
		}
		public List<TerminalNode> LogicalOperator() { return getTokens(grammer_parser.LogicalOperator); }
		public TerminalNode LogicalOperator(int i) {
			return getToken(grammer_parser.LogicalOperator, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitCondition(this);
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
			setState(271);
			match(Identifier);
			setState(272);
			match(RelationalOperator);
			setState(273);
			match(Number);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOperator) {
				{
				{
				setState(274);
				match(LogicalOperator);
				setState(275);
				match(Identifier);
				setState(276);
				match(RelationalOperator);
				setState(277);
				match(Number);
				}
				}
				setState(282);
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
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode Des_In_CreamentOprators() { return getToken(grammer_parser.Des_In_CreamentOprators, 0); }
		public TerminalNode RelationalOprators() { return getToken(grammer_parser.RelationalOprators, 0); }
		public TerminalNode Number() { return getToken(grammer_parser.Number, 0); }
		public For_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterFor_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitFor_update(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitFor_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_updateContext for_update() throws RecognitionException {
		For_updateContext _localctx = new For_updateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_update);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(283);
				match(Identifier);
				setState(284);
				match(Des_In_CreamentOprators);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(285);
				match(Identifier);
				setState(286);
				match(RelationalOprators);
				setState(287);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterLoop_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitLoop_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitLoop_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_blockContext loop_block() throws RecognitionException {
		Loop_blockContext _localctx = new Loop_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public TerminalNode In() { return getToken(grammer_parser.In, 0); }
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public TerminalNode Char() { return getToken(grammer_parser.Char, 0); }
		public For_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterFor_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitFor_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitFor_in(this);
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
			setState(292);
			match(OpenParen);
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			match(In);
			setState(295);
			match(Identifier);
			setState(296);
			match(CloseParen);
			setState(297);
			match(OpenBrace);
			setState(298);
			loop_block();
			setState(299);
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
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public TerminalNode Of() { return getToken(grammer_parser.Of, 0); }
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(grammer_parser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(grammer_parser.CloseParen, i);
		}
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public TerminalNode Char() { return getToken(grammer_parser.Char, 0); }
		public For_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterFor_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitFor_of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitFor_of(this);
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
			setState(301);
			match(OpenParen);
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(303);
			match(Of);
			setState(304);
			match(Identifier);
			setState(305);
			match(CloseParen);
			setState(306);
			match(OpenBrace);
			setState(307);
			loop_block();
			setState(308);
			match(CloseParen);
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
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(grammer_parser.While, 0); }
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(While);
			setState(312);
			match(OpenParen);
			setState(313);
			condition();
			setState(314);
			match(CloseParen);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			do_statement();
			setState(320);
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
		public TerminalNode Do() { return getToken(grammer_parser.Do, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(Do);
			setState(323);
			match(OpenBrace);
			setState(324);
			loop_block();
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitIf_statement(this);
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
			setState(329);
			if_expression();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ElseIf) {
				{
				setState(330);
				elif_expression();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(331);
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
		public TerminalNode If() { return getToken(grammer_parser.If, 0); }
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(If);
			setState(337);
			match(OpenParen);
			setState(338);
			condition();
			setState(339);
			match(CloseParen);
			setState(340);
			match(OpenBrace);
			setState(341);
			if_block();
			setState(342);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		public TerminalNode ElseIf() { return getToken(grammer_parser.ElseIf, 0); }
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Elif_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterElif_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitElif_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitElif_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_expressionContext elif_expression() throws RecognitionException {
		Elif_expressionContext _localctx = new Elif_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elif_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(ElseIf);
			setState(347);
			match(OpenParen);
			setState(348);
			condition();
			setState(349);
			match(CloseParen);
			setState(350);
			match(OpenBrace);
			setState(351);
			if_block();
			setState(352);
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
		public TerminalNode Else() { return getToken(grammer_parser.Else, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(Else);
			setState(355);
			match(OpenBrace);
			setState(356);
			if_block();
			setState(357);
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
		public TerminalNode QuestionMark() { return getToken(grammer_parser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(grammer_parser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(grammer_parser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(grammer_parser.StringLiteral, i);
		}
		public List<TerminalNode> Number() { return getTokens(grammer_parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(grammer_parser.Number, i);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public TerminalNode Return() { return getToken(grammer_parser.Return, 0); }
		public Modern_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modern_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterModern_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitModern_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitModern_if_statement(this);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				{
				{
				setState(359);
				match(Return);
				setState(360);
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
				setState(361);
				assignments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			match(QuestionMark);
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(366);
			match(Colon);
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(368);
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
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Default_statementContext default_statement() {
			return getRuleContext(Default_statementContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public TerminalNode Switch() { return getToken(grammer_parser.Switch, 0); }
		public TerminalNode Match() { return getToken(grammer_parser.Match, 0); }
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterSwitch_case_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitSwitch_case_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitSwitch_case_statement(this);
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
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==Switch || _la==Match) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(371);
			match(Identifier);
			setState(372);
			match(OpenBrace);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(373);
				case_statement();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			default_statement();
			setState(380);
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
		public TerminalNode Case() { return getToken(grammer_parser.Case, 0); }
		public TerminalNode Colon() { return getToken(grammer_parser.Colon, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Break() { return getToken(grammer_parser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode Number() { return getToken(grammer_parser.Number, 0); }
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitCase_statement(this);
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
			setState(382);
			match(Case);
			setState(383);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(384);
			match(Colon);
			setState(385);
			statements();
			setState(386);
			match(Break);
			setState(387);
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
		public TerminalNode Default() { return getToken(grammer_parser.Default, 0); }
		public TerminalNode Colon() { return getToken(grammer_parser.Colon, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Break() { return getToken(grammer_parser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public Default_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterDefault_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitDefault_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitDefault_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_statementContext default_statement() throws RecognitionException {
		Default_statementContext _localctx = new Default_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_default_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(Default);
			setState(390);
			match(Colon);
			setState(391);
			statements();
			setState(392);
			match(Break);
			setState(393);
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
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(grammer_parser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public TerminalNode Number() { return getToken(grammer_parser.Number, 0); }
		public TerminalNode RelationalOprators() { return getToken(grammer_parser.RelationalOprators, 0); }
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(395);
				match(Identifier);
				setState(396);
				match(Assign);
				setState(397);
				match(StringLiteral);
				}
				}
				break;
			case 2:
				{
				{
				setState(398);
				match(Identifier);
				setState(399);
				match(Assign);
				setState(400);
				match(Number);
				}
				}
				break;
			case 3:
				{
				{
				setState(401);
				match(Identifier);
				setState(402);
				match(RelationalOprators);
				setState(403);
				match(Number);
				}
				}
				break;
			}
			setState(406);
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
		public TerminalNode Class() { return getToken(grammer_parser.Class, 0); }
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Class_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterClass_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitClass_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitClass_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementContext class_statement() throws RecognitionException {
		Class_statementContext _localctx = new Class_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_class_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Class);
			setState(409);
			match(Identifier);
			setState(410);
			match(OpenBrace);
			setState(411);
			constructor();
			setState(412);
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
		public TerminalNode Constructor() { return getToken(grammer_parser.Constructor, 0); }
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(grammer_parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(grammer_parser.Comma, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitConstructor(this);
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
			setState(414);
			match(Constructor);
			setState(415);
			match(OpenParen);
			{
			setState(416);
			match(Identifier);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(417);
				match(Comma);
				setState(418);
				match(Identifier);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(424);
			match(CloseParen);
			setState(425);
			match(OpenBrace);
			setState(426);
			statements();
			setState(427);
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
		public TerminalNode Function_() { return getToken(grammer_parser.Function_, 0); }
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Return() { return getToken(grammer_parser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<TerminalNode> DataTypes() { return getTokens(grammer_parser.DataTypes); }
		public TerminalNode DataTypes(int i) {
			return getToken(grammer_parser.DataTypes, i);
		}
		public List<TerminalNode> Comma() { return getTokens(grammer_parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(grammer_parser.Comma, i);
		}
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitFunction_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitFunction_statement(this);
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
			setState(429);
			match(Function_);
			setState(430);
			match(Identifier);
			setState(431);
			match(OpenParen);
			{
			setState(432);
			match(DataTypes);
			setState(433);
			match(Identifier);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(434);
				match(Comma);
				setState(435);
				match(DataTypes);
				setState(436);
				match(Identifier);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(442);
			match(CloseParen);
			setState(443);
			match(OpenBrace);
			setState(444);
			statements();
			setState(445);
			match(Return);
			setState(446);
			match(Identifier);
			setState(447);
			match(SemiColon);
			setState(448);
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
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterException_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitException_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitException_statement(this);
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
			setState(450);
			try_statement();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Catch) {
				{
				setState(451);
				catch_statement();
				}
			}

			setState(454);
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
		public TerminalNode Try() { return getToken(grammer_parser.Try, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Try);
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
	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(grammer_parser.Catch, 0); }
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Catch);
			setState(462);
			match(OpenParen);
			setState(463);
			match(Identifier);
			setState(464);
			match(CloseParen);
			setState(465);
			match(OpenBrace);
			setState(466);
			statements();
			setState(467);
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
		public TerminalNode Finally() { return getToken(grammer_parser.Finally, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitFinally_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitFinally_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(Finally);
			setState(470);
			match(OpenBrace);
			setState(471);
			statements();
			setState(472);
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
	public static class Comment_statementContext extends ParserRuleContext {
		public TerminalNode SingleLineComment() { return getToken(grammer_parser.SingleLineComment, 0); }
		public TerminalNode MultiLineComment() { return getToken(grammer_parser.MultiLineComment, 0); }
		public Comment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterComment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitComment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitComment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_statementContext comment_statement() throws RecognitionException {
		Comment_statementContext _localctx = new Comment_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_comment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==SingleLineComment || _la==MultiLineComment) ) {
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
	public static class Logical_expressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_logical_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			logicalOrExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(grammer_parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(grammer_parser.Number, i);
		}
		public TerminalNode Plus() { return getToken(grammer_parser.Plus, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_logicalOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(Number);
			setState(479);
			match(Plus);
			setState(480);
			match(Number);
			setState(481);
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

	public static final String _serializedATN =
		"\u0004\u0001H\u01e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0004\u0002o\b\u0002\u000b\u0002\f\u0002p\u0001"+
		"\u0002\u0005\u0002t\b\u0002\n\u0002\f\u0002w\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0086\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0091"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0099\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00a9\b\t\n\t\f\t\u00ac\t\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00b5\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00bd\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00c5\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00d1\b\u0010\u000b"+
		"\u0010\f\u0010\u00d2\u0001\u0010\u0003\u0010\u00d6\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00da\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u00df\b\u0012\u000b\u0012\f\u0012\u00e0\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00ef"+
		"\b\u0014\u000b\u0014\f\u0014\u00f0\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0004\u0014\u00f8\b\u0014\u000b\u0014\f\u0014"+
		"\u00f9\u0001\u0014\u0003\u0014\u00fd\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0103\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0117\b\u0017\n"+
		"\u0017\f\u0017\u011a\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0121\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u014d\b \u0003 \u014f\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0003%\u016b\b%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u0177\b&\n&\f&\u017a"+
		"\t&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0195\b)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u01a4\b+\n+\f+\u01a7\t+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u01b6"+
		"\b,\n,\f,\u01b9\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0003-\u01c5\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u0000\u00004\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0005\u0001\u0000\u0010\u0012\u0001\u0000"+
		"12\u0001\u000045\u0001\u0000#$\u0001\u00009:\u01dc\u0000h\u0001\u0000"+
		"\u0000\u0000\u0002k\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000"+
		"\u0006\u0085\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000\u0000\n"+
		"\u0090\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e\u0095"+
		"\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a5"+
		"\u0001\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00b8"+
		"\u0001\u0000\u0000\u0000\u0018\u00c0\u0001\u0000\u0000\u0000\u001a\u00c4"+
		"\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000\u0000\u0000\u001e\u00c8"+
		"\u0001\u0000\u0000\u0000 \u00d5\u0001\u0000\u0000\u0000\"\u00d9\u0001"+
		"\u0000\u0000\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000"+
		"\u0000(\u00fc\u0001\u0000\u0000\u0000*\u00fe\u0001\u0000\u0000\u0000,"+
		"\u0104\u0001\u0000\u0000\u0000.\u010f\u0001\u0000\u0000\u00000\u0120\u0001"+
		"\u0000\u0000\u00002\u0122\u0001\u0000\u0000\u00004\u0124\u0001\u0000\u0000"+
		"\u00006\u012d\u0001\u0000\u0000\u00008\u0137\u0001\u0000\u0000\u0000:"+
		"\u013f\u0001\u0000\u0000\u0000<\u0142\u0001\u0000\u0000\u0000>\u0147\u0001"+
		"\u0000\u0000\u0000@\u0149\u0001\u0000\u0000\u0000B\u0150\u0001\u0000\u0000"+
		"\u0000D\u0158\u0001\u0000\u0000\u0000F\u015a\u0001\u0000\u0000\u0000H"+
		"\u0162\u0001\u0000\u0000\u0000J\u016a\u0001\u0000\u0000\u0000L\u0172\u0001"+
		"\u0000\u0000\u0000N\u017e\u0001\u0000\u0000\u0000P\u0185\u0001\u0000\u0000"+
		"\u0000R\u0194\u0001\u0000\u0000\u0000T\u0198\u0001\u0000\u0000\u0000V"+
		"\u019e\u0001\u0000\u0000\u0000X\u01ad\u0001\u0000\u0000\u0000Z\u01c2\u0001"+
		"\u0000\u0000\u0000\\\u01c8\u0001\u0000\u0000\u0000^\u01cd\u0001\u0000"+
		"\u0000\u0000`\u01d5\u0001\u0000\u0000\u0000b\u01da\u0001\u0000\u0000\u0000"+
		"d\u01dc\u0001\u0000\u0000\u0000f\u01de\u0001\u0000\u0000\u0000hi\u0003"+
		"\u0002\u0001\u0000ij\u0005\u0000\u0000\u0001j\u0001\u0001\u0000\u0000"+
		"\u0000kl\u0003\u0004\u0002\u0000l\u0003\u0001\u0000\u0000\u0000mo\u0003"+
		"\b\u0004\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qu\u0001\u0000\u0000\u0000"+
		"rt\u0003\u0006\u0003\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0005\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x\u0086\u0003\u0016\u000b"+
		"\u0000y\u0086\u0003*\u0015\u0000z\u0086\u00038\u001c\u0000{\u0086\u0003"+
		":\u001d\u0000|\u0086\u0003@ \u0000}\u0086\u0003J%\u0000~\u0086\u0003R"+
		")\u0000\u007f\u0086\u0003L&\u0000\u0080\u0086\u0003T*\u0000\u0081\u0086"+
		"\u0003X,\u0000\u0082\u0086\u0003Z-\u0000\u0083\u0086\u0003b1\u0000\u0084"+
		"\u0086\u0003d2\u0000\u0085x\u0001\u0000\u0000\u0000\u0085y\u0001\u0000"+
		"\u0000\u0000\u0085z\u0001\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000"+
		"\u0085|\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000\u0085~"+
		"\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0080"+
		"\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0007\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0003\u0000\u0000\u0088\u0089\u0005\u000f\u0000\u0000\u0089\u008a"+
		"\u0003\n\u0005\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u0091\u0003"+
		"\f\u0006\u0000\u008c\u0091\u0003\u000e\u0007\u0000\u008d\u0091\u0003\u0010"+
		"\b\u0000\u008e\u0091\u0003\u0012\t\u0000\u008f\u0091\u0003\u0014\n\u0000"+
		"\u0090\u008b\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000"+
		"\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u000b\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u00054\u0000\u0000\u0093\u0094\u0005\u0001\u0000\u0000\u0094"+
		"\r\u0001\u0000\u0000\u0000\u0095\u0098\u00051\u0000\u0000\u0096\u0097"+
		"\u0005\r\u0000\u0000\u0097\u0099\u00051\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u009c\u0005"+
		"4\u0000\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u000f\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000\u009f\u00a0\u0005\r\u0000"+
		"\u0000\u00a0\u00a1\u00051\u0000\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000"+
		"\u00a2\u00a3\u00054\u0000\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000\u00a4"+
		"\u0011\u0001\u0000\u0000\u0000\u00a5\u00aa\u00051\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0002\u0000\u0000\u00a7\u00a9\u00051\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\u000e\u0000\u0000\u00ae\u00af\u00054\u0000\u0000\u00af\u00b0\u0005\u0001"+
		"\u0000\u0000\u00b0\u0013\u0001\u0000\u0000\u0000\u00b1\u00b4\u00054\u0000"+
		"\u0000\u00b2\u00b3\u0005\r\u0000\u0000\u00b3\u00b5\u00051\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000"+
		"\u00b7\u0015\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000"+
		"\u00b9\u00bc\u0003\u0018\f\u0000\u00ba\u00bd\u0003\u001a\r\u0000\u00bb"+
		"\u00bd\u0003\"\u0011\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u0001\u0000\u0000\u00bf\u0017\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0007\u0000\u0000\u0000\u00c1\u0019\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0003\u001c\u000e\u0000\u00c3\u00c5\u0003\u001e\u000f\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u001b"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u00051\u0000\u0000\u00c7\u001d\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0003\u001c\u000e\u0000\u00c9\u00ca\u0005"+
		"\f\u0000\u0000\u00ca\u00cb\u0003 \u0010\u0000\u00cb\u001f\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d6\u00055\u0000\u0000\u00cd\u00d6\u00051\u0000\u0000"+
		"\u00ce\u00d0\u00055\u0000\u0000\u00cf\u00d1\u0005\u0006\u0000\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u00055\u0000\u0000\u00d5\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d6!\u0001\u0000\u0000\u0000\u00d7\u00da\u0003"+
		"$\u0012\u0000\u00d8\u00da\u0003&\u0013\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da#\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u00051\u0000\u0000\u00dc\u00dd\u0005\u0002\u0000\u0000\u00dd"+
		"\u00df\u00051\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1%\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		"$\u0012\u0000\u00e3\u00e4\u0005\f\u0000\u0000\u00e4\u00e5\u0003(\u0014"+
		"\u0000\u00e5\'\u0001\u0000\u0000\u0000\u00e6\u00e7\u00055\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0002\u0000\u0000\u00e8\u00fd\u00055\u0000\u0000\u00e9"+
		"\u00ea\u00051\u0000\u0000\u00ea\u00eb\u0005\u0002\u0000\u0000\u00eb\u00fd"+
		"\u00051\u0000\u0000\u00ec\u00ee\u00055\u0000\u0000\u00ed\u00ef\u0005\u0006"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u00055\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0002\u0000"+
		"\u0000\u00f5\u00f7\u00055\u0000\u0000\u00f6\u00f8\u0005\u0006\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u00055\u0000\u0000\u00fc"+
		"\u00e6\u0001\u0000\u0000\u0000\u00fc\u00e9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00ec\u0001\u0000\u0000\u0000\u00fd)\u0001\u0000\u0000\u0000\u00fe\u0102"+
		"\u0005\u0019\u0000\u0000\u00ff\u0103\u0003,\u0016\u0000\u0100\u0103\u0003"+
		"4\u001a\u0000\u0101\u0103\u00036\u001b\u0000\u0102\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0103+\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0015\u0000\u0000"+
		"\u0105\u0106\u0003\u0016\u000b\u0000\u0106\u0107\u0005\u0002\u0000\u0000"+
		"\u0107\u0108\u0003.\u0017\u0000\u0108\u0109\u0005\u0001\u0000\u0000\u0109"+
		"\u010a\u00030\u0018\u0000\u010a\u010b\u0005\u0016\u0000\u0000\u010b\u010c"+
		"\u0005\u0017\u0000\u0000\u010c\u010d\u00032\u0019\u0000\u010d\u010e\u0005"+
		"\u0018\u0000\u0000\u010e-\u0001\u0000\u0000\u0000\u010f\u0110\u00051\u0000"+
		"\u0000\u0110\u0111\u0005\t\u0000\u0000\u0111\u0118\u00055\u0000\u0000"+
		"\u0112\u0113\u0005\b\u0000\u0000\u0113\u0114\u00051\u0000\u0000\u0114"+
		"\u0115\u0005\t\u0000\u0000\u0115\u0117\u00055\u0000\u0000\u0116\u0112"+
		"\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119/\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"1\u0000\u0000\u011c\u0121\u0005\u0007\u0000\u0000\u011d\u011e\u00051\u0000"+
		"\u0000\u011e\u011f\u0005\n\u0000\u0000\u011f\u0121\u00055\u0000\u0000"+
		"\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011d\u0001\u0000\u0000\u0000"+
		"\u01211\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u0006\u0003\u0000\u0123"+
		"3\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0015\u0000\u0000\u0125\u0126"+
		"\u0007\u0001\u0000\u0000\u0126\u0127\u0005\u001a\u0000\u0000\u0127\u0128"+
		"\u00051\u0000\u0000\u0128\u0129\u0005\u0016\u0000\u0000\u0129\u012a\u0005"+
		"\u0017\u0000\u0000\u012a\u012b\u00032\u0019\u0000\u012b\u012c\u0005\u0018"+
		"\u0000\u0000\u012c5\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0015\u0000"+
		"\u0000\u012e\u012f\u0007\u0001\u0000\u0000\u012f\u0130\u0005\u001b\u0000"+
		"\u0000\u0130\u0131\u00051\u0000\u0000\u0131\u0132\u0005\u0016\u0000\u0000"+
		"\u0132\u0133\u0005\u0017\u0000\u0000\u0133\u0134\u00032\u0019\u0000\u0134"+
		"\u0135\u0005\u0016\u0000\u0000\u0135\u0136\u0005\u0018\u0000\u0000\u0136"+
		"7\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u001e\u0000\u0000\u0138\u0139"+
		"\u0005\u0015\u0000\u0000\u0139\u013a\u0003.\u0017\u0000\u013a\u013b\u0005"+
		"\u0016\u0000\u0000\u013b\u013c\u0005\u0017\u0000\u0000\u013c\u013d\u0003"+
		"2\u0019\u0000\u013d\u013e\u0005\u0018\u0000\u0000\u013e9\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0003<\u001e\u0000\u0140\u0141\u0003>\u001f\u0000\u0141"+
		";\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u001f\u0000\u0000\u0143\u0144"+
		"\u0005\u0017\u0000\u0000\u0144\u0145\u00032\u0019\u0000\u0145\u0146\u0005"+
		"\u0018\u0000\u0000\u0146=\u0001\u0000\u0000\u0000\u0147\u0148\u00038\u001c"+
		"\u0000\u0148?\u0001\u0000\u0000\u0000\u0149\u014e\u0003B!\u0000\u014a"+
		"\u014c\u0003F#\u0000\u014b\u014d\u0003H$\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000"+
		"\u0000\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014fA\u0001\u0000\u0000\u0000\u0150\u0151\u0005 \u0000\u0000"+
		"\u0151\u0152\u0005\u0015\u0000\u0000\u0152\u0153\u0003.\u0017\u0000\u0153"+
		"\u0154\u0005\u0016\u0000\u0000\u0154\u0155\u0005\u0017\u0000\u0000\u0155"+
		"\u0156\u0003D\"\u0000\u0156\u0157\u0005\u0018\u0000\u0000\u0157C\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0003\u0006\u0003\u0000\u0159E\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005\"\u0000\u0000\u015b\u015c\u0005\u0015\u0000"+
		"\u0000\u015c\u015d\u0003.\u0017\u0000\u015d\u015e\u0005\u0016\u0000\u0000"+
		"\u015e\u015f\u0005\u0017\u0000\u0000\u015f\u0160\u0003D\"\u0000\u0160"+
		"\u0161\u0005\u0018\u0000\u0000\u0161G\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0005!\u0000\u0000\u0163\u0164\u0005\u0017\u0000\u0000\u0164\u0165\u0003"+
		"D\"\u0000\u0165\u0166\u0005\u0018\u0000\u0000\u0166I\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005,\u0000\u0000\u0168\u016b\u0007\u0002\u0000\u0000"+
		"\u0169\u016b\u0003R)\u0000\u016a\u0167\u0001\u0000\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0005\u0004\u0000\u0000\u016d\u016e\u0007\u0002\u0000\u0000\u016e\u016f"+
		"\u0005\u0005\u0000\u0000\u016f\u0170\u0007\u0002\u0000\u0000\u0170\u0171"+
		"\u0005\u0001\u0000\u0000\u0171K\u0001\u0000\u0000\u0000\u0172\u0173\u0007"+
		"\u0003\u0000\u0000\u0173\u0174\u00051\u0000\u0000\u0174\u0178\u0005\u0017"+
		"\u0000\u0000\u0175\u0177\u0003N\'\u0000\u0176\u0175\u0001\u0000\u0000"+
		"\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0003P(\u0000\u017c"+
		"\u017d\u0005\u0018\u0000\u0000\u017dM\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0005%\u0000\u0000\u017f\u0180\u0007\u0002\u0000\u0000\u0180\u0181\u0005"+
		"\u0005\u0000\u0000\u0181\u0182\u0003\u0006\u0003\u0000\u0182\u0183\u0005"+
		"\u001d\u0000\u0000\u0183\u0184\u0005\u0001\u0000\u0000\u0184O\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0005&\u0000\u0000\u0186\u0187\u0005\u0005\u0000"+
		"\u0000\u0187\u0188\u0003\u0006\u0003\u0000\u0188\u0189\u0005\u001d\u0000"+
		"\u0000\u0189\u018a\u0005\u0001\u0000\u0000\u018aQ\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u00051\u0000\u0000\u018c\u018d\u0005\u000b\u0000\u0000\u018d"+
		"\u0195\u00054\u0000\u0000\u018e\u018f\u00051\u0000\u0000\u018f\u0190\u0005"+
		"\u000b\u0000\u0000\u0190\u0195\u00055\u0000\u0000\u0191\u0192\u00051\u0000"+
		"\u0000\u0192\u0193\u0005\n\u0000\u0000\u0193\u0195\u00055\u0000\u0000"+
		"\u0194\u018b\u0001\u0000\u0000\u0000\u0194\u018e\u0001\u0000\u0000\u0000"+
		"\u0194\u0191\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0005\u0001\u0000\u0000\u0197S\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0005(\u0000\u0000\u0199\u019a\u00051\u0000\u0000\u019a\u019b\u0005"+
		"\u0017\u0000\u0000\u019b\u019c\u0003V+\u0000\u019c\u019d\u0005\u0018\u0000"+
		"\u0000\u019dU\u0001\u0000\u0000\u0000\u019e\u019f\u0005)\u0000\u0000\u019f"+
		"\u01a0\u0005\u0015\u0000\u0000\u01a0\u01a5\u00051\u0000\u0000\u01a1\u01a2"+
		"\u0005\u0002\u0000\u0000\u01a2\u01a4\u00051\u0000\u0000\u01a3\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005"+
		"\u0016\u0000\u0000\u01a9\u01aa\u0005\u0017\u0000\u0000\u01aa\u01ab\u0003"+
		"\u0006\u0003\u0000\u01ab\u01ac\u0005\u0018\u0000\u0000\u01acW\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005.\u0000\u0000\u01ae\u01af\u00051\u0000\u0000"+
		"\u01af\u01b0\u0005\u0015\u0000\u0000\u01b0\u01b1\u0005-\u0000\u0000\u01b1"+
		"\u01b7\u00051\u0000\u0000\u01b2\u01b3\u0005\u0002\u0000\u0000\u01b3\u01b4"+
		"\u0005-\u0000\u0000\u01b4\u01b6\u00051\u0000\u0000\u01b5\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u0016"+
		"\u0000\u0000\u01bb\u01bc\u0005\u0017\u0000\u0000\u01bc\u01bd\u0003\u0006"+
		"\u0003\u0000\u01bd\u01be\u0005,\u0000\u0000\u01be\u01bf\u00051\u0000\u0000"+
		"\u01bf\u01c0\u0005\u0001\u0000\u0000\u01c0\u01c1\u0005\u0018\u0000\u0000"+
		"\u01c1Y\u0001\u0000\u0000\u0000\u01c2\u01c4\u0003\\.\u0000\u01c3\u01c5"+
		"\u0003^/\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003`0\u0000"+
		"\u01c7[\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005/\u0000\u0000\u01c9\u01ca"+
		"\u0005\u0017\u0000\u0000\u01ca\u01cb\u0003\u0006\u0003\u0000\u01cb\u01cc"+
		"\u0005\u0018\u0000\u0000\u01cc]\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"0\u0000\u0000\u01ce\u01cf\u0005\u0015\u0000\u0000\u01cf\u01d0\u00051\u0000"+
		"\u0000\u01d0\u01d1\u0005\u0016\u0000\u0000\u01d1\u01d2\u0005\u0017\u0000"+
		"\u0000\u01d2\u01d3\u0003\u0006\u0003\u0000\u01d3\u01d4\u0005\u0018\u0000"+
		"\u0000\u01d4_\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005\'\u0000\u0000"+
		"\u01d6\u01d7\u0005\u0017\u0000\u0000\u01d7\u01d8\u0003\u0006\u0003\u0000"+
		"\u01d8\u01d9\u0005\u0018\u0000\u0000\u01d9a\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0007\u0004\u0000\u0000\u01dbc\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0003f3\u0000\u01dde\u0001\u0000\u0000\u0000\u01de\u01df\u00055\u0000"+
		"\u0000\u01df\u01e0\u0005;\u0000\u0000\u01e0\u01e1\u00055\u0000\u0000\u01e1"+
		"\u01e2\u0005\u0001\u0000\u0000\u01e2g\u0001\u0000\u0000\u0000\u001bpu"+
		"\u0085\u0090\u0098\u00aa\u00b4\u00bc\u00c4\u00d2\u00d5\u00d9\u00e0\u00f0"+
		"\u00f9\u00fc\u0102\u0118\u0120\u014c\u014e\u016a\u0178\u0194\u01a5\u01b7"+
		"\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}