// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/mine_codes/js_parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class js_parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DolorSign=1, UnderLine=2, MultilineComment=3, SinglelineComment=4, OpenBracket=5, 
		CloseBracket=6, OpenParen=7, CloseParen=8, OpenBrace=9, CloseBrace=10, 
		SemiColon=11, Comma=12, Assign=13, QuestionMark=14, Colon=15, Dot=16, 
		PlusPlus=17, MinusMinus=18, Plus=19, Minus=20, BitNot=21, Not=22, Multiply=23, 
		Divide=24, Modulus=25, Power=26, Hashtag=27, ThreeHashtag=28, RightShiftArithmetic=29, 
		LeftShiftArithmetic=30, LessThan=31, MoreThan=32, LessThanEquals=33, GreaterThanEquals=34, 
		Equals_=35, NotEquals=36, IdentityEquals=37, IdentityNotEquals=38, BitAnd=39, 
		BitXOr=40, BitOr=41, And=42, Or=43, MultiplyAssign=44, DivideAssign=45, 
		ModulusAssign=46, PlusAssign=47, MinusAssign=48, NullLiteral=49, BooleanLiteral=50, 
		Const=51, Var=52, Let=53, Import=54, As=55, From=56, For=57, In=58, Of=59, 
		Continue=60, Break=61, While=62, Do=63, If=64, Else=65, Switch=66, Match=67, 
		Case=68, Default=69, Finally=70, Class=71, Constructor=72, This=73, New=74, 
		Function_=75, Return=76, Throw=77, Try=78, Catch=79, Void=80, Identifier=81;
	public static final int
		RULE_importStatement = 0, RULE_importFrom = 1, RULE_importAs = 2, RULE_importDefault = 3, 
		RULE_identifierList = 4, RULE_identifierName = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"importStatement", "importFrom", "importAs", "importDefault", "identifierList", 
			"identifierName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'_'", null, "'//'", "'['", "']'", "'('", "')'", "'{'", 
			"'}'", "';'", "','", "'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", 
			"'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'#'", "'###'", "'>>'", 
			"'<<'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'null'", null, "'const'", "'var'", "'let'", "'import'", "'as'", 
			"'from'", "'for'", "'in'", "'of'", "'continue'", "'break'", "'while'", 
			"'do'", "'if'", "'else'", "'switch'", "'match'", "'case'", "'default'", 
			"'finally'", "'class'", "'constructor'", "'this'", "'new'", "'function'", 
			"'return'", "'throw'", "'try'", "'catch'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DolorSign", "UnderLine", "MultilineComment", "SinglelineComment", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
			"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Modulus", "Power", "Hashtag", "ThreeHashtag", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
			"Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
			"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "NullLiteral", "BooleanLiteral", "Const", 
			"Var", "Let", "Import", "As", "From", "For", "In", "Of", "Continue", 
			"Break", "While", "Do", "If", "Else", "Switch", "Match", "Case", "Default", 
			"Finally", "Class", "Constructor", "This", "New", "Function_", "Return", 
			"Throw", "Try", "Catch", "Void", "Identifier"
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

	public js_parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode DolorSign() { return getToken(js_parser.DolorSign, 0); }
		public TerminalNode Identifier() { return getToken(js_parser.Identifier, 0); }
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public ImportAsContext importAs() {
			return getRuleContext(ImportAsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(DolorSign);
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(13);
				importFrom();
				}
				break;
			case 2:
				{
				setState(14);
				importAs();
				}
				break;
			case 3:
				{
				setState(15);
				importDefault();
				}
				break;
			}
			setState(18);
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

	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(js_parser.From, 0); }
		public TerminalNode Identifier() { return getToken(js_parser.Identifier, 0); }
		public TerminalNode Import() { return getToken(js_parser.Import, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(From);
			setState(21);
			match(Identifier);
			setState(22);
			match(Import);
			setState(23);
			identifierList();
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

	public static class ImportAsContext extends ParserRuleContext {
		public TerminalNode As() { return getToken(js_parser.As, 0); }
		public TerminalNode Identifier() { return getToken(js_parser.Identifier, 0); }
		public ImportAsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAs; }
	}

	public final ImportAsContext importAs() throws RecognitionException {
		ImportAsContext _localctx = new ImportAsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importAs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(As);
			setState(26);
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

	public static class ImportDefaultContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(js_parser.Identifier, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(js_parser.OpenBrace, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(js_parser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(js_parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(js_parser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifierList);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(OpenBrace);
				setState(31);
				identifierName();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(32);
					match(Comma);
					setState(33);
					identifierName();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(CloseBrace);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				identifierName();
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(js_parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(js_parser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(js_parser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(js_parser.Dot, i);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifierName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Identifier);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(45);
				match(Dot);
				setState(46);
				match(Identifier);
				}
				}
				setState(51);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\67\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6%\n\6\f\6"+
		"\16\6(\13\6\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65\13"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2\66\2\16\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2"+
		"\2\b\36\3\2\2\2\n,\3\2\2\2\f.\3\2\2\2\16\22\7\3\2\2\17\23\5\4\3\2\20\23"+
		"\5\6\4\2\21\23\5\b\5\2\22\17\3\2\2\2\22\20\3\2\2\2\22\21\3\2\2\2\22\23"+
		"\3\2\2\2\23\24\3\2\2\2\24\25\7S\2\2\25\3\3\2\2\2\26\27\7:\2\2\27\30\7"+
		"S\2\2\30\31\78\2\2\31\32\5\n\6\2\32\5\3\2\2\2\33\34\79\2\2\34\35\7S\2"+
		"\2\35\7\3\2\2\2\36\37\7S\2\2\37\t\3\2\2\2 !\7\13\2\2!&\5\f\7\2\"#\7\16"+
		"\2\2#%\5\f\7\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&"+
		"\3\2\2\2)*\7\f\2\2*-\3\2\2\2+-\5\f\7\2, \3\2\2\2,+\3\2\2\2-\13\3\2\2\2"+
		".\63\7S\2\2/\60\7\22\2\2\60\62\7S\2\2\61/\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\r\3\2\2\2\65\63\3\2\2\2\6\22&,\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}