// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/mine_codes/js_lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class js_lexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DolorSign=1, MultilineComment=2, SinglelineComment=3, OpenBracket=4, CloseBracket=5, 
		OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, SemiColon=10, Comma=11, 
		Assign=12, QuestionMark=13, QuestionMarkDot=14, Colon=15, Ellipsis=16, 
		Dot=17, PlusPlus=18, MinusMinus=19, Plus=20, Minus=21, BitNot=22, Not=23, 
		Multiply=24, Divide=25, Modulus=26, Power=27, NullCoalesce=28, Hashtag=29, 
		RightShiftArithmetic=30, LeftShiftArithmetic=31, RightShiftLogical=32, 
		LessThan=33, MoreThan=34, LessThanEquals=35, GreaterThanEquals=36, Equals_=37, 
		NotEquals=38, IdentityEquals=39, IdentityNotEquals=40, BitAnd=41, BitXOr=42, 
		BitOr=43, And=44, Or=45, MultiplyAssign=46, DivideAssign=47, ModulusAssign=48, 
		PlusAssign=49, MinusAssign=50, LeftShiftArithmeticAssign=51, RightShiftArithmeticAssign=52, 
		RightShiftLogicalAssign=53, BitAndAssign=54, BitXorAssign=55, BitOrAssign=56, 
		PowerAssign=57, ARROW=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DolorSign", "MultilineComment", "SinglelineComment", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "ARROW"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", null, "'//'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", 
			"'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", 
			"'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
			"'**='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DolorSign", "MultilineComment", "SinglelineComment", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "ARROW"
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


	public js_lexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "js_lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&"+
		"\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3\177\2<\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<\3\2\2\2\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2"+
		"\2\2\5y\3\2\2\2\7\u0085\3\2\2\2\t\u0088\3\2\2\2\13\u008a\3\2\2\2\r\u008c"+
		"\3\2\2\2\17\u008e\3\2\2\2\21\u0090\3\2\2\2\23\u0092\3\2\2\2\25\u0094\3"+
		"\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2"+
		"\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00aa"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2\67\u00bb\3\2\2\29\u00be"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c6\3\2\2\2A\u00c9\3\2\2\2C"+
		"\u00cd\3\2\2\2E\u00cf\3\2\2\2G\u00d1\3\2\2\2I\u00d4\3\2\2\2K\u00d7\3\2"+
		"\2\2M\u00da\3\2\2\2O\u00dd\3\2\2\2Q\u00e1\3\2\2\2S\u00e5\3\2\2\2U\u00e7"+
		"\3\2\2\2W\u00e9\3\2\2\2Y\u00eb\3\2\2\2[\u00ee\3\2\2\2]\u00f1\3\2\2\2_"+
		"\u00f4\3\2\2\2a\u00f7\3\2\2\2c\u00fa\3\2\2\2e\u00fd\3\2\2\2g\u0100\3\2"+
		"\2\2i\u0104\3\2\2\2k\u0108\3\2\2\2m\u010d\3\2\2\2o\u0110\3\2\2\2q\u0113"+
		"\3\2\2\2s\u0116\3\2\2\2u\u011a\3\2\2\2wx\7&\2\2x\4\3\2\2\2yz\7\61\2\2"+
		"z{\7,\2\2{\177\3\2\2\2|~\13\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177\u0080\3"+
		"\2\2\2\177}\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7,\2\2\u0083\u0084\7\61\2\2\u0084\6\3\2\2\2\u0085\u0086\7\61\2\2\u0086"+
		"\u0087\7\61\2\2\u0087\b\3\2\2\2\u0088\u0089\7]\2\2\u0089\n\3\2\2\2\u008a"+
		"\u008b\7_\2\2\u008b\f\3\2\2\2\u008c\u008d\7*\2\2\u008d\16\3\2\2\2\u008e"+
		"\u008f\7+\2\2\u008f\20\3\2\2\2\u0090\u0091\7}\2\2\u0091\22\3\2\2\2\u0092"+
		"\u0093\7\177\2\2\u0093\24\3\2\2\2\u0094\u0095\7=\2\2\u0095\26\3\2\2\2"+
		"\u0096\u0097\7.\2\2\u0097\30\3\2\2\2\u0098\u0099\7?\2\2\u0099\32\3\2\2"+
		"\2\u009a\u009b\7A\2\2\u009b\34\3\2\2\2\u009c\u009d\7A\2\2\u009d\u009e"+
		"\7\60\2\2\u009e\36\3\2\2\2\u009f\u00a0\7<\2\2\u00a0 \3\2\2\2\u00a1\u00a2"+
		"\7\60\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7\60\2\2\u00a4\"\3\2\2\2\u00a5"+
		"\u00a6\7\60\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\u00a9\7-\2\2\u00a9"+
		"&\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\7/\2\2\u00ac(\3\2\2\2\u00ad\u00ae"+
		"\7-\2\2\u00ae*\3\2\2\2\u00af\u00b0\7/\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7"+
		"\u0080\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\60\3\2\2\2\u00b5\u00b6"+
		"\7,\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\64\3\2\2\2\u00b9\u00ba"+
		"\7\'\2\2\u00ba\66\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\u00bd\7,\2\2\u00bd"+
		"8\3\2\2\2\u00be\u00bf\7A\2\2\u00bf\u00c0\7A\2\2\u00c0:\3\2\2\2\u00c1\u00c2"+
		"\7%\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7@\2\2\u00c5>\3"+
		"\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7>\2\2\u00c8@\3\2\2\2\u00c9\u00ca"+
		"\7@\2\2\u00ca\u00cb\7@\2\2\u00cb\u00cc\7@\2\2\u00ccB\3\2\2\2\u00cd\u00ce"+
		"\7>\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7"+
		">\2\2\u00d2\u00d3\7?\2\2\u00d3H\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6J\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8\u00d9\7?\2\2\u00d9L\3"+
		"\2\2\2\u00da\u00db\7#\2\2\u00db\u00dc\7?\2\2\u00dcN\3\2\2\2\u00dd\u00de"+
		"\7?\2\2\u00de\u00df\7?\2\2\u00df\u00e0\7?\2\2\u00e0P\3\2\2\2\u00e1\u00e2"+
		"\7#\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7?\2\2\u00e4R\3\2\2\2\u00e5\u00e6"+
		"\7(\2\2\u00e6T\3\2\2\2\u00e7\u00e8\7`\2\2\u00e8V\3\2\2\2\u00e9\u00ea\7"+
		"~\2\2\u00eaX\3\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\7(\2\2\u00edZ\3\2"+
		"\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f0\7~\2\2\u00f0\\\3\2\2\2\u00f1\u00f2"+
		"\7,\2\2\u00f2\u00f3\7?\2\2\u00f3^\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6`\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\7?\2\2\u00f9b\3"+
		"\2\2\2\u00fa\u00fb\7-\2\2\u00fb\u00fc\7?\2\2\u00fcd\3\2\2\2\u00fd\u00fe"+
		"\7/\2\2\u00fe\u00ff\7?\2\2\u00fff\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102"+
		"\7>\2\2\u0102\u0103\7?\2\2\u0103h\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106"+
		"\7@\2\2\u0106\u0107\7?\2\2\u0107j\3\2\2\2\u0108\u0109\7@\2\2\u0109\u010a"+
		"\7@\2\2\u010a\u010b\7@\2\2\u010b\u010c\7?\2\2\u010cl\3\2\2\2\u010d\u010e"+
		"\7(\2\2\u010e\u010f\7?\2\2\u010fn\3\2\2\2\u0110\u0111\7`\2\2\u0111\u0112"+
		"\7?\2\2\u0112p\3\2\2\2\u0113\u0114\7~\2\2\u0114\u0115\7?\2\2\u0115r\3"+
		"\2\2\2\u0116\u0117\7,\2\2\u0117\u0118\7,\2\2\u0118\u0119\7?\2\2\u0119"+
		"t\3\2\2\2\u011a\u011b\7?\2\2\u011b\u011c\7@\2\2\u011cv\3\2\2\2\4\2\177"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}