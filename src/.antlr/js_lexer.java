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
public class js_lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DolorSign", "UnderLine", "MultilineComment", "SinglelineComment", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
			"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
			"Modulus", "Power", "Hashtag", "ThreeHashtag", "RightShiftArithmetic", 
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


	public js_lexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u01ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\7\4\u00ae\n\4\f\4\16\4\u00b1\13\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0135\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3"+
		";\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3"+
		"J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3"+
		"N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\6R\u01e1\n"+
		"R\rR\16R\u01e2\3R\7R\u01e6\nR\fR\16R\u01e9\13R\3\u00af\2S\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\3\2\4"+
		"\4\2C\\c|\6\2\62;C\\aac|\2\u01ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5"+
		"\3\2\2\2\5\u00a7\3\2\2\2\7\u00a9\3\2\2\2\t\u00b5\3\2\2\2\13\u00b8\3\2"+
		"\2\2\r\u00ba\3\2\2\2\17\u00bc\3\2\2\2\21\u00be\3\2\2\2\23\u00c0\3\2\2"+
		"\2\25\u00c2\3\2\2\2\27\u00c4\3\2\2\2\31\u00c6\3\2\2\2\33\u00c8\3\2\2\2"+
		"\35\u00ca\3\2\2\2\37\u00cc\3\2\2\2!\u00ce\3\2\2\2#\u00d0\3\2\2\2%\u00d3"+
		"\3\2\2\2\'\u00d6\3\2\2\2)\u00d8\3\2\2\2+\u00da\3\2\2\2-\u00dc\3\2\2\2"+
		"/\u00de\3\2\2\2\61\u00e0\3\2\2\2\63\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67"+
		"\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00ed\3\2\2\2=\u00f0\3\2\2\2?\u00f3\3\2"+
		"\2\2A\u00f5\3\2\2\2C\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00fd\3\2\2\2I\u0100"+
		"\3\2\2\2K\u0103\3\2\2\2M\u0107\3\2\2\2O\u010b\3\2\2\2Q\u010d\3\2\2\2S"+
		"\u010f\3\2\2\2U\u0111\3\2\2\2W\u0114\3\2\2\2Y\u0117\3\2\2\2[\u011a\3\2"+
		"\2\2]\u011d\3\2\2\2_\u0120\3\2\2\2a\u0123\3\2\2\2c\u0126\3\2\2\2e\u0134"+
		"\3\2\2\2g\u0136\3\2\2\2i\u013c\3\2\2\2k\u0140\3\2\2\2m\u0144\3\2\2\2o"+
		"\u014b\3\2\2\2q\u014e\3\2\2\2s\u0153\3\2\2\2u\u0157\3\2\2\2w\u015a\3\2"+
		"\2\2y\u015d\3\2\2\2{\u0166\3\2\2\2}\u016c\3\2\2\2\177\u0172\3\2\2\2\u0081"+
		"\u0175\3\2\2\2\u0083\u0178\3\2\2\2\u0085\u017d\3\2\2\2\u0087\u0184\3\2"+
		"\2\2\u0089\u018a\3\2\2\2\u008b\u018f\3\2\2\2\u008d\u0197\3\2\2\2\u008f"+
		"\u019f\3\2\2\2\u0091\u01a5\3\2\2\2\u0093\u01b1\3\2\2\2\u0095\u01b6\3\2"+
		"\2\2\u0097\u01ba\3\2\2\2\u0099\u01c3\3\2\2\2\u009b\u01ca\3\2\2\2\u009d"+
		"\u01d0\3\2\2\2\u009f\u01d4\3\2\2\2\u00a1\u01da\3\2\2\2\u00a3\u01e0\3\2"+
		"\2\2\u00a5\u00a6\7&\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\7a\2\2\u00a8\6\3\2"+
		"\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7,\2\2\u00ab\u00af\3\2\2\2\u00ac"+
		"\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7,\2\2\u00b3\u00b4\7\61\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7\61\2"+
		"\2\u00b6\u00b7\7\61\2\2\u00b7\n\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9\f\3\2"+
		"\2\2\u00ba\u00bb\7_\2\2\u00bb\16\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\20\3"+
		"\2\2\2\u00be\u00bf\7+\2\2\u00bf\22\3\2\2\2\u00c0\u00c1\7}\2\2\u00c1\24"+
		"\3\2\2\2\u00c2\u00c3\7\177\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5"+
		"\30\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9"+
		"\34\3\2\2\2\u00ca\u00cb\7A\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd"+
		" \3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1"+
		"\u00d2\7-\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\7/\2\2\u00d5"+
		"&\3\2\2\2\u00d6\u00d7\7-\2\2\u00d7(\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9*"+
		"\3\2\2\2\u00da\u00db\7\u0080\2\2\u00db,\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd"+
		".\3\2\2\2\u00de\u00df\7,\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1"+
		"\62\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3\64\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5"+
		"\u00e6\7,\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7%\2\2\u00e88\3\2\2\2\u00e9"+
		"\u00ea\7%\2\2\u00ea\u00eb\7%\2\2\u00eb\u00ec\7%\2\2\u00ec:\3\2\2\2\u00ed"+
		"\u00ee\7@\2\2\u00ee\u00ef\7@\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1"+
		"\u00f2\7>\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4@\3\2\2\2\u00f5\u00f6"+
		"\7@\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9D\3"+
		"\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fcF\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe\u00ff\7?\2\2\u00ffH\3\2\2\2\u0100\u0101\7#\2\2\u0101\u0102"+
		"\7?\2\2\u0102J\3\2\2\2\u0103\u0104\7?\2\2\u0104\u0105\7?\2\2\u0105\u0106"+
		"\7?\2\2\u0106L\3\2\2\2\u0107\u0108\7#\2\2\u0108\u0109\7?\2\2\u0109\u010a"+
		"\7?\2\2\u010aN\3\2\2\2\u010b\u010c\7(\2\2\u010cP\3\2\2\2\u010d\u010e\7"+
		"`\2\2\u010eR\3\2\2\2\u010f\u0110\7~\2\2\u0110T\3\2\2\2\u0111\u0112\7("+
		"\2\2\u0112\u0113\7(\2\2\u0113V\3\2\2\2\u0114\u0115\7~\2\2\u0115\u0116"+
		"\7~\2\2\u0116X\3\2\2\2\u0117\u0118\7,\2\2\u0118\u0119\7?\2\2\u0119Z\3"+
		"\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c\7?\2\2\u011c\\\3\2\2\2\u011d\u011e"+
		"\7\'\2\2\u011e\u011f\7?\2\2\u011f^\3\2\2\2\u0120\u0121\7-\2\2\u0121\u0122"+
		"\7?\2\2\u0122`\3\2\2\2\u0123\u0124\7/\2\2\u0124\u0125\7?\2\2\u0125b\3"+
		"\2\2\2\u0126\u0127\7p\2\2\u0127\u0128\7w\2\2\u0128\u0129\7n\2\2\u0129"+
		"\u012a\7n\2\2\u012ad\3\2\2\2\u012b\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d"+
		"\u012e\7w\2\2\u012e\u0135\7g\2\2\u012f\u0130\7h\2\2\u0130\u0131\7c\2\2"+
		"\u0131\u0132\7n\2\2\u0132\u0133\7u\2\2\u0133\u0135\7g\2\2\u0134\u012b"+
		"\3\2\2\2\u0134\u012f\3\2\2\2\u0135f\3\2\2\2\u0136\u0137\7e\2\2\u0137\u0138"+
		"\7q\2\2\u0138\u0139\7p\2\2\u0139\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b"+
		"h\3\2\2\2\u013c\u013d\7x\2\2\u013d\u013e\7c\2\2\u013e\u013f\7t\2\2\u013f"+
		"j\3\2\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2\u0142\u0143\7v\2\2\u0143"+
		"l\3\2\2\2\u0144\u0145\7k\2\2\u0145\u0146\7o\2\2\u0146\u0147\7r\2\2\u0147"+
		"\u0148\7q\2\2\u0148\u0149\7t\2\2\u0149\u014a\7v\2\2\u014an\3\2\2\2\u014b"+
		"\u014c\7c\2\2\u014c\u014d\7u\2\2\u014dp\3\2\2\2\u014e\u014f\7h\2\2\u014f"+
		"\u0150\7t\2\2\u0150\u0151\7q\2\2\u0151\u0152\7o\2\2\u0152r\3\2\2\2\u0153"+
		"\u0154\7h\2\2\u0154\u0155\7q\2\2\u0155\u0156\7t\2\2\u0156t\3\2\2\2\u0157"+
		"\u0158\7k\2\2\u0158\u0159\7p\2\2\u0159v\3\2\2\2\u015a\u015b\7q\2\2\u015b"+
		"\u015c\7h\2\2\u015cx\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\7q\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7v\2\2\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2"+
		"\u0163\u0164\7w\2\2\u0164\u0165\7g\2\2\u0165z\3\2\2\2\u0166\u0167\7d\2"+
		"\2\u0167\u0168\7t\2\2\u0168\u0169\7g\2\2\u0169\u016a\7c\2\2\u016a\u016b"+
		"\7m\2\2\u016b|\3\2\2\2\u016c\u016d\7y\2\2\u016d\u016e\7j\2\2\u016e\u016f"+
		"\7k\2\2\u016f\u0170\7n\2\2\u0170\u0171\7g\2\2\u0171~\3\2\2\2\u0172\u0173"+
		"\7f\2\2\u0173\u0174\7q\2\2\u0174\u0080\3\2\2\2\u0175\u0176\7k\2\2\u0176"+
		"\u0177\7h\2\2\u0177\u0082\3\2\2\2\u0178\u0179\7g\2\2\u0179\u017a\7n\2"+
		"\2\u017a\u017b\7u\2\2\u017b\u017c\7g\2\2\u017c\u0084\3\2\2\2\u017d\u017e"+
		"\7u\2\2\u017e\u017f\7y\2\2\u017f\u0180\7k\2\2\u0180\u0181\7v\2\2\u0181"+
		"\u0182\7e\2\2\u0182\u0183\7j\2\2\u0183\u0086\3\2\2\2\u0184\u0185\7o\2"+
		"\2\u0185\u0186\7c\2\2\u0186\u0187\7v\2\2\u0187\u0188\7e\2\2\u0188\u0189"+
		"\7j\2\2\u0189\u0088\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7c\2\2\u018c"+
		"\u018d\7u\2\2\u018d\u018e\7g\2\2\u018e\u008a\3\2\2\2\u018f\u0190\7f\2"+
		"\2\u0190\u0191\7g\2\2\u0191\u0192\7h\2\2\u0192\u0193\7c\2\2\u0193\u0194"+
		"\7w\2\2\u0194\u0195\7n\2\2\u0195\u0196\7v\2\2\u0196\u008c\3\2\2\2\u0197"+
		"\u0198\7h\2\2\u0198\u0199\7k\2\2\u0199\u019a\7p\2\2\u019a\u019b\7c\2\2"+
		"\u019b\u019c\7n\2\2\u019c\u019d\7n\2\2\u019d\u019e\7{\2\2\u019e\u008e"+
		"\3\2\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7c\2\2\u01a2"+
		"\u01a3\7u\2\2\u01a3\u01a4\7u\2\2\u01a4\u0090\3\2\2\2\u01a5\u01a6\7e\2"+
		"\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa"+
		"\7v\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7w\2\2\u01ac\u01ad\7e\2\2\u01ad"+
		"\u01ae\7v\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7t\2\2\u01b0\u0092\3\2\2"+
		"\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7j\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5"+
		"\7u\2\2\u01b5\u0094\3\2\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7g\2\2\u01b8"+
		"\u01b9\7y\2\2\u01b9\u0096\3\2\2\2\u01ba\u01bb\7h\2\2\u01bb\u01bc\7w\2"+
		"\2\u01bc\u01bd\7p\2\2\u01bd\u01be\7e\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0"+
		"\7k\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7p\2\2\u01c2\u0098\3\2\2\2\u01c3"+
		"\u01c4\7t\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7w\2\2"+
		"\u01c7\u01c8\7t\2\2\u01c8\u01c9\7p\2\2\u01c9\u009a\3\2\2\2\u01ca\u01cb"+
		"\7v\2\2\u01cb\u01cc\7j\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce\7q\2\2\u01ce"+
		"\u01cf\7y\2\2\u01cf\u009c\3\2\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7t\2"+
		"\2\u01d2\u01d3\7{\2\2\u01d3\u009e\3\2\2\2\u01d4\u01d5\7e\2\2\u01d5\u01d6"+
		"\7c\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7e\2\2\u01d8\u01d9\7j\2\2\u01d9"+
		"\u00a0\3\2\2\2\u01da\u01db\7x\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7k\2"+
		"\2\u01dd\u01de\7f\2\2\u01de\u00a2\3\2\2\2\u01df\u01e1\t\2\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e7\3\2\2\2\u01e4\u01e6\t\3\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u00a4\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\7\2\u00af\u0134\u01e2\u01e7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}