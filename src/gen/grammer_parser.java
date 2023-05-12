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
		SemiColon=1, Comma=2, DolorSign=3, QuestionMark=4, Colon=5, Star=6, ComputeSigns=7, 
		Des_In_CreamentOprators=8, LogicalOperator=9, RelationalOperator=10, RelationalOprators=11, 
		Assign=12, Equals=13, As=14, From=15, Import=16, Const=17, Var=18, Let=19, 
		OpenBracket=20, CloseBracket=21, OpenParen=22, CloseParen=23, OpenBrace=24, 
		CloseBrace=25, For=26, In=27, Of=28, Continue=29, Break=30, While=31, 
		Do=32, If=33, Else=34, ElseIf=35, Switch=36, Match=37, Case=38, Default=39, 
		Finally=40, Class=41, Constructor=42, This=43, New=44, Return=45, DataTypes=46, 
		Function_=47, Try=48, Catch=49, Identifier=50, Char=51, WS=52, StringLiteral=53, 
		Number=54, DecimalNumber=55, Exponent=56, Integer=57, SingleLineComment=58, 
		MultiLineComment=59, Plus=60, Minus=61, Multiply=62, Divide=63, IntegerDivide=64, 
		Power=65, LogicalAnd=66, LogicalOr=67, Equalsw=68, NotEquals=69, RelationalOperatorw=70, 
		InequalityOperator=71, UnaryOperator=72, Tt=73;
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
		RULE_logicalOrExpression = 51, RULE_logicalAndExpression = 52, RULE_equalityExpression = 53, 
		RULE_relationalExpression = 54, RULE_additiveExpression = 55, RULE_multiplicativeExpression = 56, 
		RULE_unaryExpression = 57, RULE_powerExpression = 58, RULE_primaryExpression = 59;
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
			"finally_statement", "comment_statement", "logical_expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"powerExpression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'$'", "'?'", "':'", null, null, null, null, null, 
			null, null, null, "'as'", "'from'", "'import'", "'const'", "'var'", "'let'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "'for'", "'in'", "'of'", "'continue'", 
			"'break'", "'while'", "'do'", "'if'", "'else'", "'elif'", "'switch'", 
			"'match'", "'case'", "'default'", "'finally'", "'class'", "'constructor'", 
			"'this'", "'new'", "'return'", null, "'function'", "'try'", "'catch'", 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			null, "'/'", "'//'", "'**'", "'&&'", "'||'", "'=='", "'!='", null, "'<>'", 
			null, "'###'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SemiColon", "Comma", "DolorSign", "QuestionMark", "Colon", "Star", 
			"ComputeSigns", "Des_In_CreamentOprators", "LogicalOperator", "RelationalOperator", 
			"RelationalOprators", "Assign", "Equals", "As", "From", "Import", "Const", 
			"Var", "Let", "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", 
			"OpenBrace", "CloseBrace", "For", "In", "Of", "Continue", "Break", "While", 
			"Do", "If", "Else", "ElseIf", "Switch", "Match", "Case", "Default", "Finally", 
			"Class", "Constructor", "This", "New", "Return", "DataTypes", "Function_", 
			"Try", "Catch", "Identifier", "Char", "WS", "StringLiteral", "Number", 
			"DecimalNumber", "Exponent", "Integer", "SingleLineComment", "MultiLineComment", 
			"Plus", "Minus", "Multiply", "Divide", "IntegerDivide", "Power", "LogicalAnd", 
			"LogicalOr", "Equalsw", "NotEquals", "RelationalOperatorw", "InequalityOperator", 
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
			setState(120);
			sourceElements();
			setState(121);
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
			setState(123);
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
			setState(126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125);
					import_statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(130);
				statements();
				}
				}
				setState(135);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				do_while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				modern_if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				assignments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				switch_case_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				class_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				function_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				exception_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				comment_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(148);
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
			setState(151);
			match(DolorSign);
			{
			setState(152);
			match(Import);
			setState(153);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				import_default();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				import_from();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				import_all();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				import_multiple_named();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
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
			setState(165);
			match(Identifier);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(166);
				match(As);
				setState(167);
				match(Identifier);
				}
			}

			setState(170);
			match(From);
			setState(171);
			match(StringLiteral);
			setState(172);
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
		public TerminalNode Star() { return getToken(grammer_parser.Star, 0); }
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
			setState(174);
			match(Star);
			setState(175);
			match(As);
			setState(176);
			match(Identifier);
			setState(177);
			match(From);
			setState(178);
			match(StringLiteral);
			setState(179);
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
			setState(181);
			match(Identifier);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(182);
				match(Comma);
				setState(183);
				match(Identifier);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(From);
			setState(190);
			match(StringLiteral);
			setState(191);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(StringLiteral);
			{
			setState(194);
			match(As);
			setState(195);
			match(Identifier);
			}
			setState(197);
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
			setState(199);
			match(DolorSign);
			setState(200);
			variable_type();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(201);
				single_declaration();
				}
				break;
			case 2:
				{
				setState(202);
				multi_declaratuon();
				}
				break;
			}
			setState(205);
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
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				single_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
			setState(213);
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
		public TerminalNode Assign() { return getToken(grammer_parser.Assign, 0); }
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
			setState(215);
			single_decl_with_type();
			setState(216);
			match(Assign);
			setState(217);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(Number);
				{
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					match(ComputeSigns);
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(227);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				multi_decl_with_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				match(Identifier);
				setState(235);
				match(Comma);
				setState(236);
				match(Identifier);
				}
				}
				setState(239); 
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
		public TerminalNode Assign() { return getToken(grammer_parser.Assign, 0); }
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
			setState(241);
			multi_decl_with_type();
			setState(242);
			match(Assign);
			setState(243);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(245);
				match(Number);
				setState(246);
				match(Comma);
				setState(247);
				match(Number);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(248);
				match(Identifier);
				setState(249);
				match(Comma);
				setState(250);
				match(Identifier);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(251);
				match(Number);
				{
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					match(ComputeSigns);
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(257);
				match(Number);
				}
				setState(259);
				match(Comma);
				{
				setState(260);
				match(Number);
				{
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(261);
					match(ComputeSigns);
					}
					}
					setState(264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ComputeSigns );
				}
				setState(266);
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
			setState(269);
			match(For);
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(270);
				normal_for();
				}
				break;
			case 2:
				{
				setState(271);
				for_in();
				}
				break;
			case 3:
				{
				setState(272);
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
		public List<TerminalNode> SemiColon() { return getTokens(grammer_parser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(grammer_parser.SemiColon, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(grammer_parser.OpenBrace, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode DataTypes() { return getToken(grammer_parser.DataTypes, 0); }
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
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
			setState(275);
			match(OpenParen);
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DolorSign:
				{
				setState(276);
				variable_declaration();
				}
				break;
			case DataTypes:
				{
				setState(277);
				match(DataTypes);
				setState(278);
				assignments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			match(SemiColon);
			setState(282);
			condition();
			setState(283);
			match(SemiColon);
			setState(284);
			for_update();
			setState(285);
			match(CloseParen);
			setState(286);
			match(OpenBrace);
			setState(287);
			loop_block();
			setState(288);
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
		public List<TerminalNode> RelationalOperator() { return getTokens(grammer_parser.RelationalOperator); }
		public TerminalNode RelationalOperator(int i) {
			return getToken(grammer_parser.RelationalOperator, i);
		}
		public List<TerminalNode> Number() { return getTokens(grammer_parser.Number); }
		public TerminalNode Number(int i) {
			return getToken(grammer_parser.Number, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<TerminalNode> Char() { return getTokens(grammer_parser.Char); }
		public TerminalNode Char(int i) {
			return getToken(grammer_parser.Char, i);
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
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			match(RelationalOperator);
			setState(292);
			match(Number);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOperator) {
				{
				{
				setState(293);
				match(LogicalOperator);
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
				match(RelationalOperator);
				setState(296);
				match(Number);
				}
				}
				setState(301);
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(302);
				match(Identifier);
				setState(303);
				match(Des_In_CreamentOprators);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(304);
				match(Identifier);
				setState(305);
				match(RelationalOprators);
				setState(306);
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
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(309);
				statements();
				}
				}
				setState(314);
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
			setState(315);
			match(OpenParen);
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			match(In);
			setState(318);
			match(Identifier);
			setState(319);
			match(CloseParen);
			setState(320);
			match(OpenBrace);
			setState(321);
			loop_block();
			setState(322);
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
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
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
			setState(324);
			match(OpenParen);
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Char) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(326);
			match(Of);
			setState(327);
			match(Identifier);
			setState(328);
			match(CloseParen);
			setState(329);
			match(OpenBrace);
			setState(330);
			loop_block();
			setState(331);
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
			setState(333);
			match(While);
			setState(334);
			match(OpenParen);
			setState(335);
			condition();
			setState(336);
			match(CloseParen);
			setState(337);
			match(OpenBrace);
			setState(338);
			loop_block();
			setState(339);
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
			setState(341);
			do_statement();
			setState(342);
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
			setState(344);
			match(Do);
			setState(345);
			match(OpenBrace);
			setState(346);
			loop_block();
			setState(347);
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
		public TerminalNode While() { return getToken(grammer_parser.While, 0); }
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
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
			setState(349);
			match(While);
			setState(350);
			match(OpenParen);
			setState(351);
			condition();
			setState(352);
			match(CloseParen);
			setState(353);
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
			setState(355);
			if_expression();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ElseIf) {
				{
				setState(356);
				elif_expression();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(357);
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
			setState(362);
			match(If);
			setState(363);
			match(OpenParen);
			setState(364);
			condition();
			setState(365);
			match(CloseParen);
			setState(366);
			match(OpenBrace);
			setState(367);
			if_block();
			setState(368);
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
			setState(370);
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
			setState(372);
			match(ElseIf);
			setState(373);
			match(OpenParen);
			setState(374);
			condition();
			setState(375);
			match(CloseParen);
			setState(376);
			match(OpenBrace);
			setState(377);
			if_block();
			setState(378);
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
			setState(380);
			match(Else);
			setState(381);
			match(OpenBrace);
			setState(382);
			if_block();
			setState(383);
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
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				{
				{
				setState(385);
				match(Return);
				setState(386);
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
				setState(387);
				assignments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390);
			match(QuestionMark);
			setState(391);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(392);
			match(Colon);
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(394);
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
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==Switch || _la==Match) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(397);
			match(Identifier);
			setState(398);
			match(OpenBrace);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(399);
				case_statement();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			default_statement();
			setState(406);
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
		public TerminalNode Break() { return getToken(grammer_parser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode Number() { return getToken(grammer_parser.Number, 0); }
		public TerminalNode StringLiteral() { return getToken(grammer_parser.StringLiteral, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
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
			setState(408);
			match(Case);
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(410);
			match(Colon);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(411);
				statements();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(Break);
			setState(418);
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
		public TerminalNode Break() { return getToken(grammer_parser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Default);
			setState(421);
			match(Colon);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(422);
				statements();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(Break);
			setState(429);
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
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				{
				setState(431);
				match(Identifier);
				setState(432);
				match(Assign);
				setState(433);
				match(StringLiteral);
				}
				}
				break;
			case 2:
				{
				{
				setState(434);
				match(Identifier);
				setState(435);
				match(Assign);
				setState(436);
				match(Number);
				}
				}
				break;
			case 3:
				{
				{
				setState(437);
				match(Identifier);
				setState(438);
				match(RelationalOprators);
				setState(439);
				match(Number);
				}
				}
				break;
			}
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(442);
				match(SemiColon);
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
			setState(445);
			match(Class);
			setState(446);
			match(Identifier);
			setState(447);
			match(OpenBrace);
			setState(448);
			constructor();
			setState(449);
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
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(grammer_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(grammer_parser.Identifier, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
			setState(451);
			match(Constructor);
			setState(452);
			match(OpenParen);
			{
			setState(453);
			match(Identifier);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(454);
				match(Comma);
				setState(455);
				match(Identifier);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(461);
			match(CloseParen);
			setState(462);
			match(OpenBrace);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(463);
				statements();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
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
		public TerminalNode Return() { return getToken(grammer_parser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(grammer_parser.SemiColon, 0); }
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<TerminalNode> DataTypes() { return getTokens(grammer_parser.DataTypes); }
		public TerminalNode DataTypes(int i) {
			return getToken(grammer_parser.DataTypes, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(Function_);
			setState(472);
			match(Identifier);
			setState(473);
			match(OpenParen);
			{
			setState(474);
			match(DataTypes);
			setState(475);
			match(Identifier);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(476);
				match(Comma);
				setState(477);
				match(DataTypes);
				setState(478);
				match(Identifier);
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(484);
			match(CloseParen);
			setState(485);
			match(OpenBrace);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					statements();
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(492);
			match(Return);
			setState(493);
			match(Identifier);
			setState(494);
			match(SemiColon);
			setState(495);
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
			setState(497);
			try_statement();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Catch) {
				{
				setState(498);
				catch_statement();
				}
			}

			setState(501);
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
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(Try);
			setState(504);
			match(OpenBrace);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(505);
				statements();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(Catch);
			setState(514);
			match(OpenParen);
			setState(515);
			match(Identifier);
			setState(516);
			match(CloseParen);
			setState(517);
			match(OpenBrace);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(518);
				statements();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
		public TerminalNode CloseBrace() { return getToken(grammer_parser.CloseBrace, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(Finally);
			setState(527);
			match(OpenBrace);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3190134253207683080L) != 0) || _la==UnaryOperator || _la==Tt) {
				{
				{
				setState(528);
				statements();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
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
			setState(536);
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
			setState(538);
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
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LogicalOr() { return getTokens(grammer_parser.LogicalOr); }
		public TerminalNode LogicalOr(int i) {
			return getToken(grammer_parser.LogicalOr, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			logicalAndExpression();
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541);
					match(LogicalOr);
					setState(542);
					logicalAndExpression();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LogicalAnd() { return getTokens(grammer_parser.LogicalAnd); }
		public TerminalNode LogicalAnd(int i) {
			return getToken(grammer_parser.LogicalAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			equalityExpression();
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					match(LogicalAnd);
					setState(550);
					equalityExpression();
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equalsw() { return getTokens(grammer_parser.Equalsw); }
		public TerminalNode Equalsw(int i) {
			return getToken(grammer_parser.Equalsw, i);
		}
		public List<TerminalNode> NotEquals() { return getTokens(grammer_parser.NotEquals); }
		public TerminalNode NotEquals(int i) {
			return getToken(grammer_parser.NotEquals, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			relationalExpression();
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557);
					_la = _input.LA(1);
					if ( !(_la==Equalsw || _la==NotEquals) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(558);
					relationalExpression();
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RelationalOperatorw() { return getTokens(grammer_parser.RelationalOperatorw); }
		public TerminalNode RelationalOperatorw(int i) {
			return getToken(grammer_parser.RelationalOperatorw, i);
		}
		public List<TerminalNode> InequalityOperator() { return getTokens(grammer_parser.InequalityOperator); }
		public TerminalNode InequalityOperator(int i) {
			return getToken(grammer_parser.InequalityOperator, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			additiveExpression();
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(565);
					_la = _input.LA(1);
					if ( !(_la==RelationalOperatorw || _la==InequalityOperator) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(566);
					additiveExpression();
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(grammer_parser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(grammer_parser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(grammer_parser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(grammer_parser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			multiplicativeExpression();
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(573);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(574);
					multiplicativeExpression();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(grammer_parser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(grammer_parser.Multiply, i);
		}
		public List<TerminalNode> Divide() { return getTokens(grammer_parser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(grammer_parser.Divide, i);
		}
		public List<TerminalNode> IntegerDivide() { return getTokens(grammer_parser.IntegerDivide); }
		public TerminalNode IntegerDivide(int i) {
			return getToken(grammer_parser.IntegerDivide, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			unaryExpression();
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					_la = _input.LA(1);
					if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(582);
					unaryExpression();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public TerminalNode UnaryOperator() { return getToken(grammer_parser.UnaryOperator, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unaryExpression);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case Identifier:
			case Number:
			case Minus:
			case Tt:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				powerExpression();
				}
				break;
			case UnaryOperator:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(UnaryOperator);
				setState(590);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PowerExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Power() { return getToken(grammer_parser.Power, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_powerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			primaryExpression();
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(594);
				match(Power);
				setState(595);
				unaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(grammer_parser.Identifier, 0); }
		public TerminalNode Number() { return getToken(grammer_parser.Number, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(grammer_parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(grammer_parser.CloseParen, 0); }
		public TerminalNode Minus() { return getToken(grammer_parser.Minus, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Tt() { return getToken(grammer_parser.Tt, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammer_parserListener ) ((grammer_parserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammer_parserVisitor ) return ((grammer_parserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primaryExpression);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(Identifier);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(Number);
				setState(600);
				logical_expression();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(OpenParen);
				setState(602);
				logical_expression();
				setState(603);
				match(CloseParen);
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				match(Minus);
				setState(606);
				primaryExpression();
				}
				break;
			case Tt:
				enterOuterAlt(_localctx, 5);
				{
				setState(607);
				match(Tt);
				setState(608);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001I\u0264\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004"+
		"\u0002\u007f\b\u0002\u000b\u0002\f\u0002\u0080\u0001\u0002\u0005\u0002"+
		"\u0084\b\u0002\n\u0002\f\u0002\u0087\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0096"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a1\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00b9\b\t\n\t\f\t\u00bc\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00cc\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00d4\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00e0\b\u0010\u000b\u0010\f\u0010"+
		"\u00e1\u0001\u0010\u0003\u0010\u00e5\b\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00e9\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00ee"+
		"\b\u0012\u000b\u0012\f\u0012\u00ef\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00fe\b\u0014\u000b\u0014"+
		"\f\u0014\u00ff\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u0107\b\u0014\u000b\u0014\f\u0014\u0108\u0001\u0014\u0003"+
		"\u0014\u010c\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0112\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0118\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u012a\b\u0017\n\u0017\f\u0017\u012d\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0134\b\u0018\u0001\u0019"+
		"\u0005\u0019\u0137\b\u0019\n\u0019\f\u0019\u013a\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0167\b \u0003"+
		" \u0169\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u0185\b%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u0191\b&\n&\f&\u0194\t&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u019d\b\'\n\'\f\'\u01a0\t\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0005(\u01a8\b(\n(\f(\u01ab\t(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01b9"+
		"\b)\u0001)\u0003)\u01bc\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u01c9\b+\n+\f+\u01cc\t+\u0001+\u0001"+
		"+\u0001+\u0005+\u01d1\b+\n+\f+\u01d4\t+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u01e0\b,\n,\f,\u01e3\t,\u0001"+
		",\u0001,\u0001,\u0005,\u01e8\b,\n,\f,\u01eb\t,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0003-\u01f4\b-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0005.\u01fb\b.\n.\f.\u01fe\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u0208\b/\n/\f/\u020b\t/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00050\u0212\b0\n0\f0\u0215\t0\u00010\u00010\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00013\u00053\u0220\b3\n3\f3\u0223\t3\u00014\u0001"+
		"4\u00014\u00054\u0228\b4\n4\f4\u022b\t4\u00015\u00015\u00015\u00055\u0230"+
		"\b5\n5\f5\u0233\t5\u00016\u00016\u00016\u00056\u0238\b6\n6\f6\u023b\t"+
		"6\u00017\u00017\u00017\u00057\u0240\b7\n7\f7\u0243\t7\u00018\u00018\u0001"+
		"8\u00058\u0248\b8\n8\f8\u024b\t8\u00019\u00019\u00019\u00039\u0250\b9"+
		"\u0001:\u0001:\u0001:\u0003:\u0255\b:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0262\b;\u0001;\u0000"+
		"\u0000<\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000"+
		"\t\u0001\u0000\u0011\u0013\u0001\u000023\u0001\u000056\u0001\u0000$%\u0001"+
		"\u0000:;\u0001\u0000DE\u0001\u0000FG\u0001\u0000<=\u0001\u0000>@\u0269"+
		"\u0000x\u0001\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004~"+
		"\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000\b\u0097\u0001"+
		"\u0000\u0000\u0000\n\u00a0\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000"+
		"\u0000\u0000\u000e\u00a5\u0001\u0000\u0000\u0000\u0010\u00ae\u0001\u0000"+
		"\u0000\u0000\u0012\u00b5\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000"+
		"\u0000\u0000\u0016\u00c7\u0001\u0000\u0000\u0000\u0018\u00cf\u0001\u0000"+
		"\u0000\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c\u00d5\u0001\u0000"+
		"\u0000\u0000\u001e\u00d7\u0001\u0000\u0000\u0000 \u00e4\u0001\u0000\u0000"+
		"\u0000\"\u00e8\u0001\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000"+
		"&\u00f1\u0001\u0000\u0000\u0000(\u010b\u0001\u0000\u0000\u0000*\u010d"+
		"\u0001\u0000\u0000\u0000,\u0113\u0001\u0000\u0000\u0000.\u0122\u0001\u0000"+
		"\u0000\u00000\u0133\u0001\u0000\u0000\u00002\u0138\u0001\u0000\u0000\u0000"+
		"4\u013b\u0001\u0000\u0000\u00006\u0144\u0001\u0000\u0000\u00008\u014d"+
		"\u0001\u0000\u0000\u0000:\u0155\u0001\u0000\u0000\u0000<\u0158\u0001\u0000"+
		"\u0000\u0000>\u015d\u0001\u0000\u0000\u0000@\u0163\u0001\u0000\u0000\u0000"+
		"B\u016a\u0001\u0000\u0000\u0000D\u0172\u0001\u0000\u0000\u0000F\u0174"+
		"\u0001\u0000\u0000\u0000H\u017c\u0001\u0000\u0000\u0000J\u0184\u0001\u0000"+
		"\u0000\u0000L\u018c\u0001\u0000\u0000\u0000N\u0198\u0001\u0000\u0000\u0000"+
		"P\u01a4\u0001\u0000\u0000\u0000R\u01b8\u0001\u0000\u0000\u0000T\u01bd"+
		"\u0001\u0000\u0000\u0000V\u01c3\u0001\u0000\u0000\u0000X\u01d7\u0001\u0000"+
		"\u0000\u0000Z\u01f1\u0001\u0000\u0000\u0000\\\u01f7\u0001\u0000\u0000"+
		"\u0000^\u0201\u0001\u0000\u0000\u0000`\u020e\u0001\u0000\u0000\u0000b"+
		"\u0218\u0001\u0000\u0000\u0000d\u021a\u0001\u0000\u0000\u0000f\u021c\u0001"+
		"\u0000\u0000\u0000h\u0224\u0001\u0000\u0000\u0000j\u022c\u0001\u0000\u0000"+
		"\u0000l\u0234\u0001\u0000\u0000\u0000n\u023c\u0001\u0000\u0000\u0000p"+
		"\u0244\u0001\u0000\u0000\u0000r\u024f\u0001\u0000\u0000\u0000t\u0251\u0001"+
		"\u0000\u0000\u0000v\u0261\u0001\u0000\u0000\u0000xy\u0003\u0002\u0001"+
		"\u0000yz\u0005\u0000\u0000\u0001z\u0001\u0001\u0000\u0000\u0000{|\u0003"+
		"\u0004\u0002\u0000|\u0003\u0001\u0000\u0000\u0000}\u007f\u0003\b\u0004"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0085"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0006\u0003\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0005"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0096"+
		"\u0003\u0016\u000b\u0000\u0089\u0096\u0003*\u0015\u0000\u008a\u0096\u0003"+
		"8\u001c\u0000\u008b\u0096\u0003:\u001d\u0000\u008c\u0096\u0003@ \u0000"+
		"\u008d\u0096\u0003J%\u0000\u008e\u0096\u0003R)\u0000\u008f\u0096\u0003"+
		"L&\u0000\u0090\u0096\u0003T*\u0000\u0091\u0096\u0003X,\u0000\u0092\u0096"+
		"\u0003Z-\u0000\u0093\u0096\u0003b1\u0000\u0094\u0096\u0003d2\u0000\u0095"+
		"\u0088\u0001\u0000\u0000\u0000\u0095\u0089\u0001\u0000\u0000\u0000\u0095"+
		"\u008a\u0001\u0000\u0000\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0095"+
		"\u008c\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095"+
		"\u008e\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095"+
		"\u0090\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0007\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005\u0010\u0000\u0000\u0099"+
		"\u009a\u0003\n\u0005\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u00a1"+
		"\u0003\f\u0006\u0000\u009c\u00a1\u0003\u000e\u0007\u0000\u009d\u00a1\u0003"+
		"\u0010\b\u0000\u009e\u00a1\u0003\u0012\t\u0000\u009f\u00a1\u0003\u0014"+
		"\n\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000"+
		"\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u000b\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u00055\u0000\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000"+
		"\u00a4\r\u0001\u0000\u0000\u0000\u00a5\u00a8\u00052\u0000\u0000\u00a6"+
		"\u00a7\u0005\u000e\u0000\u0000\u00a7\u00a9\u00052\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000f\u0000\u0000\u00ab\u00ac"+
		"\u00055\u0000\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u000f\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00b0\u0005"+
		"\u000e\u0000\u0000\u00b0\u00b1\u00052\u0000\u0000\u00b1\u00b2\u0005\u000f"+
		"\u0000\u0000\u00b2\u00b3\u00055\u0000\u0000\u00b3\u00b4\u0005\u0001\u0000"+
		"\u0000\u00b4\u0011\u0001\u0000\u0000\u0000\u00b5\u00ba\u00052\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00b9\u00052\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u000f\u0000\u0000\u00be\u00bf\u00055\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0001\u0000\u0000\u00c0\u0013\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u00055\u0000\u0000\u00c2\u00c3\u0005\u000e\u0000\u0000\u00c3\u00c4\u0005"+
		"2\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0001"+
		"\u0000\u0000\u00c6\u0015\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0003"+
		"\u0000\u0000\u00c8\u00cb\u0003\u0018\f\u0000\u00c9\u00cc\u0003\u001a\r"+
		"\u0000\u00ca\u00cc\u0003\"\u0011\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0001\u0000\u0000\u00ce\u0017\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0007\u0000\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0003\u001c\u000e\u0000\u00d2\u00d4\u0003\u001e\u000f\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u001b\u0001\u0000\u0000\u0000\u00d5\u00d6\u00052\u0000\u0000\u00d6"+
		"\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\u001c\u000e\u0000\u00d8"+
		"\u00d9\u0005\f\u0000\u0000\u00d9\u00da\u0003 \u0010\u0000\u00da\u001f"+
		"\u0001\u0000\u0000\u0000\u00db\u00e5\u00056\u0000\u0000\u00dc\u00e5\u0005"+
		"2\u0000\u0000\u00dd\u00df\u00056\u0000\u0000\u00de\u00e0\u0005\u0007\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u00056\u0000\u0000"+
		"\u00e4\u00db\u0001\u0000\u0000\u0000\u00e4\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e4\u00dd\u0001\u0000\u0000\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e9\u0003$\u0012\u0000\u00e7\u00e9\u0003&\u0013\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9#\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u00052\u0000\u0000\u00eb\u00ec\u0005\u0002\u0000"+
		"\u0000\u00ec\u00ee\u00052\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0%\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0003$\u0012\u0000\u00f2\u00f3\u0005\f\u0000\u0000\u00f3\u00f4"+
		"\u0003(\u0014\u0000\u00f4\'\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"6\u0000\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u010c\u00056\u0000"+
		"\u0000\u00f8\u00f9\u00052\u0000\u0000\u00f9\u00fa\u0005\u0002\u0000\u0000"+
		"\u00fa\u010c\u00052\u0000\u0000\u00fb\u00fd\u00056\u0000\u0000\u00fc\u00fe"+
		"\u0005\u0007\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u00056\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"\u0002\u0000\u0000\u0104\u0106\u00056\u0000\u0000\u0105\u0107\u0005\u0007"+
		"\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u00056\u0000"+
		"\u0000\u010b\u00f5\u0001\u0000\u0000\u0000\u010b\u00f8\u0001\u0000\u0000"+
		"\u0000\u010b\u00fb\u0001\u0000\u0000\u0000\u010c)\u0001\u0000\u0000\u0000"+
		"\u010d\u0111\u0005\u001a\u0000\u0000\u010e\u0112\u0003,\u0016\u0000\u010f"+
		"\u0112\u00034\u001a\u0000\u0110\u0112\u00036\u001b\u0000\u0111\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001"+
		"\u0000\u0000\u0000\u0112+\u0001\u0000\u0000\u0000\u0113\u0117\u0005\u0016"+
		"\u0000\u0000\u0114\u0118\u0003\u0016\u000b\u0000\u0115\u0116\u0005.\u0000"+
		"\u0000\u0116\u0118\u0003R)\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0001\u0000\u0000\u011a\u011b\u0003.\u0017\u0000\u011b\u011c"+
		"\u0005\u0001\u0000\u0000\u011c\u011d\u00030\u0018\u0000\u011d\u011e\u0005"+
		"\u0017\u0000\u0000\u011e\u011f\u0005\u0018\u0000\u0000\u011f\u0120\u0003"+
		"2\u0019\u0000\u0120\u0121\u0005\u0019\u0000\u0000\u0121-\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0007\u0001\u0000\u0000\u0123\u0124\u0005\n\u0000\u0000"+
		"\u0124\u012b\u00056\u0000\u0000\u0125\u0126\u0005\t\u0000\u0000\u0126"+
		"\u0127\u0007\u0001\u0000\u0000\u0127\u0128\u0005\n\u0000\u0000\u0128\u012a"+
		"\u00056\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u012a\u012d\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c/\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u00052\u0000\u0000\u012f\u0134\u0005\b\u0000"+
		"\u0000\u0130\u0131\u00052\u0000\u0000\u0131\u0132\u0005\u000b\u0000\u0000"+
		"\u0132\u0134\u00056\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133"+
		"\u0130\u0001\u0000\u0000\u0000\u01341\u0001\u0000\u0000\u0000\u0135\u0137"+
		"\u0003\u0006\u0003\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u01393\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0016\u0000\u0000\u013c\u013d\u0007"+
		"\u0001\u0000\u0000\u013d\u013e\u0005\u001b\u0000\u0000\u013e\u013f\u0005"+
		"2\u0000\u0000\u013f\u0140\u0005\u0017\u0000\u0000\u0140\u0141\u0005\u0018"+
		"\u0000\u0000\u0141\u0142\u00032\u0019\u0000\u0142\u0143\u0005\u0019\u0000"+
		"\u0000\u01435\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u0016\u0000\u0000"+
		"\u0145\u0146\u0007\u0001\u0000\u0000\u0146\u0147\u0005\u001c\u0000\u0000"+
		"\u0147\u0148\u00052\u0000\u0000\u0148\u0149\u0005\u0017\u0000\u0000\u0149"+
		"\u014a\u0005\u0018\u0000\u0000\u014a\u014b\u00032\u0019\u0000\u014b\u014c"+
		"\u0005\u0019\u0000\u0000\u014c7\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"\u001f\u0000\u0000\u014e\u014f\u0005\u0016\u0000\u0000\u014f\u0150\u0003"+
		".\u0017\u0000\u0150\u0151\u0005\u0017\u0000\u0000\u0151\u0152\u0005\u0018"+
		"\u0000\u0000\u0152\u0153\u00032\u0019\u0000\u0153\u0154\u0005\u0019\u0000"+
		"\u0000\u01549\u0001\u0000\u0000\u0000\u0155\u0156\u0003<\u001e\u0000\u0156"+
		"\u0157\u0003>\u001f\u0000\u0157;\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		" \u0000\u0000\u0159\u015a\u0005\u0018\u0000\u0000\u015a\u015b\u00032\u0019"+
		"\u0000\u015b\u015c\u0005\u0019\u0000\u0000\u015c=\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005\u001f\u0000\u0000\u015e\u015f\u0005\u0016\u0000\u0000"+
		"\u015f\u0160\u0003.\u0017\u0000\u0160\u0161\u0005\u0017\u0000\u0000\u0161"+
		"\u0162\u0005\u0001\u0000\u0000\u0162?\u0001\u0000\u0000\u0000\u0163\u0168"+
		"\u0003B!\u0000\u0164\u0166\u0003F#\u0000\u0165\u0167\u0003H$\u0000\u0166"+
		"\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169A\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0005!\u0000\u0000\u016b\u016c\u0005\u0016\u0000\u0000\u016c\u016d\u0003"+
		".\u0017\u0000\u016d\u016e\u0005\u0017\u0000\u0000\u016e\u016f\u0005\u0018"+
		"\u0000\u0000\u016f\u0170\u0003D\"\u0000\u0170\u0171\u0005\u0019\u0000"+
		"\u0000\u0171C\u0001\u0000\u0000\u0000\u0172\u0173\u0003\u0006\u0003\u0000"+
		"\u0173E\u0001\u0000\u0000\u0000\u0174\u0175\u0005#\u0000\u0000\u0175\u0176"+
		"\u0005\u0016\u0000\u0000\u0176\u0177\u0003.\u0017\u0000\u0177\u0178\u0005"+
		"\u0017\u0000\u0000\u0178\u0179\u0005\u0018\u0000\u0000\u0179\u017a\u0003"+
		"D\"\u0000\u017a\u017b\u0005\u0019\u0000\u0000\u017bG\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0005\"\u0000\u0000\u017d\u017e\u0005\u0018\u0000\u0000"+
		"\u017e\u017f\u0003D\"\u0000\u017f\u0180\u0005\u0019\u0000\u0000\u0180"+
		"I\u0001\u0000\u0000\u0000\u0181\u0182\u0005-\u0000\u0000\u0182\u0185\u0007"+
		"\u0002\u0000\u0000\u0183\u0185\u0003R)\u0000\u0184\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0005\u0004\u0000\u0000\u0187\u0188\u0007\u0002\u0000"+
		"\u0000\u0188\u0189\u0005\u0005\u0000\u0000\u0189\u018a\u0007\u0002\u0000"+
		"\u0000\u018a\u018b\u0005\u0001\u0000\u0000\u018bK\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0007\u0003\u0000\u0000\u018d\u018e\u00052\u0000\u0000\u018e"+
		"\u0192\u0005\u0018\u0000\u0000\u018f\u0191\u0003N\'\u0000\u0190\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0003P(\u0000\u0196\u0197\u0005\u0019\u0000\u0000\u0197M\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0005&\u0000\u0000\u0199\u019a\u0007\u0002\u0000"+
		"\u0000\u019a\u019e\u0005\u0005\u0000\u0000\u019b\u019d\u0003\u0006\u0003"+
		"\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000"+
		"\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000"+
		"\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0005\u001e\u0000\u0000\u01a2\u01a3\u0005\u0001\u0000"+
		"\u0000\u01a3O\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\'\u0000\u0000"+
		"\u01a5\u01a9\u0005\u0005\u0000\u0000\u01a6\u01a8\u0003\u0006\u0003\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0005\u001e\u0000\u0000\u01ad\u01ae\u0005\u0001\u0000\u0000"+
		"\u01aeQ\u0001\u0000\u0000\u0000\u01af\u01b0\u00052\u0000\u0000\u01b0\u01b1"+
		"\u0005\f\u0000\u0000\u01b1\u01b9\u00055\u0000\u0000\u01b2\u01b3\u0005"+
		"2\u0000\u0000\u01b3\u01b4\u0005\f\u0000\u0000\u01b4\u01b9\u00056\u0000"+
		"\u0000\u01b5\u01b6\u00052\u0000\u0000\u01b6\u01b7\u0005\u000b\u0000\u0000"+
		"\u01b7\u01b9\u00056\u0000\u0000\u01b8\u01af\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bb\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005\u0001\u0000\u0000\u01bb"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc"+
		"S\u0001\u0000\u0000\u0000\u01bd\u01be\u0005)\u0000\u0000\u01be\u01bf\u0005"+
		"2\u0000\u0000\u01bf\u01c0\u0005\u0018\u0000\u0000\u01c0\u01c1\u0003V+"+
		"\u0000\u01c1\u01c2\u0005\u0019\u0000\u0000\u01c2U\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0005*\u0000\u0000\u01c4\u01c5\u0005\u0016\u0000\u0000\u01c5"+
		"\u01ca\u00052\u0000\u0000\u01c6\u01c7\u0005\u0002\u0000\u0000\u01c7\u01c9"+
		"\u00052\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0005\u0017\u0000\u0000\u01ce\u01d2\u0005"+
		"\u0018\u0000\u0000\u01cf\u01d1\u0003\u0006\u0003\u0000\u01d0\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005"+
		"\u0019\u0000\u0000\u01d6W\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005/\u0000"+
		"\u0000\u01d8\u01d9\u00052\u0000\u0000\u01d9\u01da\u0005\u0016\u0000\u0000"+
		"\u01da\u01db\u0005.\u0000\u0000\u01db\u01e1\u00052\u0000\u0000\u01dc\u01dd"+
		"\u0005\u0002\u0000\u0000\u01dd\u01de\u0005.\u0000\u0000\u01de\u01e0\u0005"+
		"2\u0000\u0000\u01df\u01dc\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0005\u0017\u0000\u0000\u01e5\u01e9\u0005\u0018"+
		"\u0000\u0000\u01e6\u01e8\u0003\u0006\u0003\u0000\u01e7\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000"+
		"\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005-\u0000"+
		"\u0000\u01ed\u01ee\u00052\u0000\u0000\u01ee\u01ef\u0005\u0001\u0000\u0000"+
		"\u01ef\u01f0\u0005\u0019\u0000\u0000\u01f0Y\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f3\u0003\\.\u0000\u01f2\u01f4\u0003^/\u0000\u01f3\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0003`0\u0000\u01f6[\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u00050\u0000\u0000\u01f8\u01fc\u0005\u0018\u0000\u0000\u01f9"+
		"\u01fb\u0003\u0006\u0003\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe"+
		"\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\u0019\u0000\u0000\u0200"+
		"]\u0001\u0000\u0000\u0000\u0201\u0202\u00051\u0000\u0000\u0202\u0203\u0005"+
		"\u0016\u0000\u0000\u0203\u0204\u00052\u0000\u0000\u0204\u0205\u0005\u0017"+
		"\u0000\u0000\u0205\u0209\u0005\u0018\u0000\u0000\u0206\u0208\u0003\u0006"+
		"\u0003\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0005\u0019\u0000\u0000\u020d_\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0005(\u0000\u0000\u020f\u0213\u0005\u0018\u0000\u0000"+
		"\u0210\u0212\u0003\u0006\u0003\u0000\u0211\u0210\u0001\u0000\u0000\u0000"+
		"\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000"+
		"\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0019\u0000\u0000"+
		"\u0217a\u0001\u0000\u0000\u0000\u0218\u0219\u0007\u0004\u0000\u0000\u0219"+
		"c\u0001\u0000\u0000\u0000\u021a\u021b\u0003f3\u0000\u021be\u0001\u0000"+
		"\u0000\u0000\u021c\u0221\u0003h4\u0000\u021d\u021e\u0005C\u0000\u0000"+
		"\u021e\u0220\u0003h4\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0223"+
		"\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0001\u0000\u0000\u0000\u0222g\u0001\u0000\u0000\u0000\u0223\u0221\u0001"+
		"\u0000\u0000\u0000\u0224\u0229\u0003j5\u0000\u0225\u0226\u0005B\u0000"+
		"\u0000\u0226\u0228\u0003j5\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228"+
		"\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0001\u0000\u0000\u0000\u022ai\u0001\u0000\u0000\u0000\u022b\u0229"+
		"\u0001\u0000\u0000\u0000\u022c\u0231\u0003l6\u0000\u022d\u022e\u0007\u0005"+
		"\u0000\u0000\u022e\u0230\u0003l6\u0000\u022f\u022d\u0001\u0000\u0000\u0000"+
		"\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232k\u0001\u0000\u0000\u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0234\u0239\u0003n7\u0000\u0235\u0236\u0007"+
		"\u0006\u0000\u0000\u0236\u0238\u0003n7\u0000\u0237\u0235\u0001\u0000\u0000"+
		"\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023am\u0001\u0000\u0000\u0000"+
		"\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u0241\u0003p8\u0000\u023d\u023e"+
		"\u0007\u0007\u0000\u0000\u023e\u0240\u0003p8\u0000\u023f\u023d\u0001\u0000"+
		"\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242o\u0001\u0000\u0000"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0249\u0003r9\u0000\u0245"+
		"\u0246\u0007\b\u0000\u0000\u0246\u0248\u0003r9\u0000\u0247\u0245\u0001"+
		"\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024aq\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024c\u0250\u0003t:\u0000"+
		"\u024d\u024e\u0005H\u0000\u0000\u024e\u0250\u0003r9\u0000\u024f\u024c"+
		"\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250s\u0001"+
		"\u0000\u0000\u0000\u0251\u0254\u0003v;\u0000\u0252\u0253\u0005A\u0000"+
		"\u0000\u0253\u0255\u0003r9\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255u\u0001\u0000\u0000\u0000\u0256\u0262"+
		"\u00052\u0000\u0000\u0257\u0258\u00056\u0000\u0000\u0258\u0262\u0003d"+
		"2\u0000\u0259\u025a\u0005\u0016\u0000\u0000\u025a\u025b\u0003d2\u0000"+
		"\u025b\u025c\u0005\u0017\u0000\u0000\u025c\u0262\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0005=\u0000\u0000\u025e\u0262\u0003v;\u0000\u025f\u0260"+
		"\u0005I\u0000\u0000\u0260\u0262\u0003v;\u0000\u0261\u0256\u0001\u0000"+
		"\u0000\u0000\u0261\u0257\u0001\u0000\u0000\u0000\u0261\u0259\u0001\u0000"+
		"\u0000\u0000\u0261\u025d\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000"+
		"\u0000\u0000\u0262w\u0001\u0000\u0000\u0000-\u0080\u0085\u0095\u00a0\u00a8"+
		"\u00ba\u00cb\u00d3\u00e1\u00e4\u00e8\u00ef\u00ff\u0108\u010b\u0111\u0117"+
		"\u012b\u0133\u0138\u0166\u0168\u0184\u0192\u019e\u01a9\u01b8\u01bb\u01ca"+
		"\u01d2\u01e1\u01e9\u01f3\u01fc\u0209\u0213\u0221\u0229\u0231\u0239\u0241"+
		"\u0249\u024f\u0254\u0261";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}