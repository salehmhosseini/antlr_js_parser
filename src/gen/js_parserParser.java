// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/mine_codes/js_parser.g4 by ANTLR 4.12.0
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
		T__0=1, SemiColon=2, DolorSign=3, As=4, From=5, Identifier=6, WS=7, IMPORT_WS=8, 
		Dot=9;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_statement = 2, RULE_import_statement = 3, 
		RULE_import_default = 4, RULE_import_alias = 5, RULE_import_from = 6, 
		RULE_import_from_alias = 7, RULE_identifierName = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "statement", "import_statement", "import_default", 
			"import_alias", "import_from", "import_from_alias", "identifierName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "';'", "'$'", "'as'", "'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SemiColon", "DolorSign", "As", "From", "Identifier", "WS", 
			"IMPORT_WS", "Dot"
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
			setState(18);
			sourceElements();
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
			setState(20);
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
		public Import_statementContext import_statement() {
			return getRuleContext(Import_statementContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			import_statement();
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
		public Import_defaultContext import_default() {
			return getRuleContext(Import_defaultContext.class,0);
		}
		public Import_aliasContext import_alias() {
			return getRuleContext(Import_aliasContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_from_aliasContext import_from_alias() {
			return getRuleContext(Import_from_aliasContext.class,0);
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
		enterRule(_localctx, 6, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DolorSign);
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(25);
				import_default();
				}
				break;
			case 2:
				{
				setState(26);
				import_alias();
				}
				break;
			case 3:
				{
				setState(27);
				import_from();
				}
				break;
			case 4:
				{
				setState(28);
				import_from_alias();
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
	public static class Import_defaultContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_import_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			identifierName();
			setState(33);
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
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode As() { return getToken(js_parserParser.As, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(js_parserParser.SemiColon, 0); }
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
		enterRule(_localctx, 10, RULE_import_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			identifierName();
			setState(37);
			match(As);
			setState(38);
			match(Identifier);
			setState(39);
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
		public TerminalNode From() { return getToken(js_parserParser.From, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public Import_defaultContext import_default() {
			return getRuleContext(Import_defaultContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_import_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(From);
			setState(42);
			match(Identifier);
			setState(43);
			import_default();
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
	public static class Import_from_aliasContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(js_parserParser.From, 0); }
		public TerminalNode Identifier() { return getToken(js_parserParser.Identifier, 0); }
		public Import_aliasContext import_alias() {
			return getRuleContext(Import_aliasContext.class,0);
		}
		public Import_from_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterImport_from_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitImport_from_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitImport_from_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_from_aliasContext import_from_alias() throws RecognitionException {
		Import_from_aliasContext _localctx = new Import_from_aliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_from_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(From);
			setState(46);
			match(Identifier);
			setState(47);
			import_alias();
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
	public static class IdentifierNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(js_parserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parserParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(js_parserParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(js_parserParser.Dot, i);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof js_parserListener ) ((js_parserListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof js_parserVisitor ) return ((js_parserVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Identifier);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(50);
				match(Dot);
				setState(51);
				match(Identifier);
				}
				}
				setState(56);
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

	public static final String _serializedATN =
		"\u0004\u0001\t:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u001e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b5\b\b\n\b\f\b"+
		"8\t\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u00004\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000"+
		"\u0000\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006\u0018\u0001\u0000"+
		"\u0000\u0000\b\u001f\u0001\u0000\u0000\u0000\n#\u0001\u0000\u0000\u0000"+
		"\f)\u0001\u0000\u0000\u0000\u000e-\u0001\u0000\u0000\u0000\u00101\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0001\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0003\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u0005\u0001"+
		"\u0000\u0000\u0000\u0018\u001d\u0005\u0003\u0000\u0000\u0019\u001e\u0003"+
		"\b\u0004\u0000\u001a\u001e\u0003\n\u0005\u0000\u001b\u001e\u0003\f\u0006"+
		"\u0000\u001c\u001e\u0003\u000e\u0007\u0000\u001d\u0019\u0001\u0000\u0000"+
		"\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0007\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u0001\u0000\u0000 !\u0003\u0010\b\u0000!\"\u0005\u0002"+
		"\u0000\u0000\"\t\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003"+
		"\u0010\b\u0000%&\u0005\u0004\u0000\u0000&\'\u0005\u0006\u0000\u0000\'"+
		"(\u0005\u0002\u0000\u0000(\u000b\u0001\u0000\u0000\u0000)*\u0005\u0005"+
		"\u0000\u0000*+\u0005\u0006\u0000\u0000+,\u0003\b\u0004\u0000,\r\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000./\u0005\u0006\u0000\u0000"+
		"/0\u0003\n\u0005\u00000\u000f\u0001\u0000\u0000\u000016\u0005\u0006\u0000"+
		"\u000023\u0005\t\u0000\u000035\u0005\u0006\u0000\u000042\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u0011\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"\u0002\u001d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}