// Generated from /home/heimir/workspace/linkedit/src/main/antlr4/com/coolprimes/linkedit/LinkGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinkGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MemoryType=12, Whitespace=13, Newline=14, BlockComment=15, 
		LineComment=16, HexInt=17, Retain=18, Name=19, ErrorCharacter=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MemoryType", "Whitespace", "Newline", "BlockComment", 
			"LineComment", "HexInt", "Retain", "Name", "ErrorCharacter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MEMORY'", "'{'", "'}'", "':'", "'origin='", "'length='", "'SECTIONS'", 
			"'('", "')'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MemoryType", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"HexInt", "Retain", "Name", "ErrorCharacter"
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


	public LinkGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LinkGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\6\r\\\n\r\r\r\16\r]\3\r\3\r\3\16\6\16c\n\16\r\16"+
		"\16\16d\3\16\3\16\3\17\3\17\5\17k\n\17\3\17\5\17n\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\7\20v\n\20\f\20\16\20y\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\7\21\u0084\n\21\f\21\16\21\u0087\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\6\22\u008f\n\22\r\22\16\22\u0090\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u009e\n\23\f\23\16\23\u00a1"+
		"\13\23\3\23\3\23\3\23\3\23\3\24\6\24\u00a8\n\24\r\24\16\24\u00a9\3\24"+
		"\7\24\u00ad\n\24\f\24\16\24\u00b0\13\24\3\25\3\25\3\25\3\25\4w\u009f\2"+
		"\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26\3\2\b\4\2TTYZ\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\5\2\62;CHch\3\2C\\\3\2\62;\2\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3+\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r"+
		"@\3\2\2\2\17H\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2"+
		"\31Y\3\2\2\2\33b\3\2\2\2\35m\3\2\2\2\37q\3\2\2\2!\177\3\2\2\2#\u008a\3"+
		"\2\2\2%\u0092\3\2\2\2\'\u00a7\3\2\2\2)\u00b1\3\2\2\2+,\7O\2\2,-\7G\2\2"+
		"-.\7O\2\2./\7Q\2\2/\60\7T\2\2\60\61\7[\2\2\61\4\3\2\2\2\62\63\7}\2\2\63"+
		"\6\3\2\2\2\64\65\7\177\2\2\65\b\3\2\2\2\66\67\7<\2\2\67\n\3\2\2\289\7"+
		"q\2\29:\7t\2\2:;\7k\2\2;<\7i\2\2<=\7k\2\2=>\7p\2\2>?\7?\2\2?\f\3\2\2\2"+
		"@A\7n\2\2AB\7g\2\2BC\7p\2\2CD\7i\2\2DE\7v\2\2EF\7j\2\2FG\7?\2\2G\16\3"+
		"\2\2\2HI\7U\2\2IJ\7G\2\2JK\7E\2\2KL\7V\2\2LM\7K\2\2MN\7Q\2\2NO\7P\2\2"+
		"OP\7U\2\2P\20\3\2\2\2QR\7*\2\2R\22\3\2\2\2ST\7+\2\2T\24\3\2\2\2UV\7-\2"+
		"\2V\26\3\2\2\2WX\7/\2\2X\30\3\2\2\2Y[\7*\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7+\2\2`\32\3\2\2\2ac\t\3\2\2ba"+
		"\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\16\2\2g\34\3\2\2"+
		"\2hj\7\17\2\2ik\7\f\2\2ji\3\2\2\2jk\3\2\2\2kn\3\2\2\2ln\7\f\2\2mh\3\2"+
		"\2\2ml\3\2\2\2no\3\2\2\2op\b\17\2\2p\36\3\2\2\2qr\7\61\2\2rs\7,\2\2sw"+
		"\3\2\2\2tv\13\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2"+
		"yw\3\2\2\2z{\7,\2\2{|\7\61\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2\177\u0080"+
		"\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\n\4\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\21\2\2"+
		"\u0089\"\3\2\2\2\u008a\u008b\7\62\2\2\u008b\u008c\7z\2\2\u008c\u008e\3"+
		"\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091$\3\2\2\2\u0092\u0093\7/\2\2\u0093"+
		"\u0094\7/\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2"+
		"\u0097\u0098\7c\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7?\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\35\17\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\b\23\2\2\u00a5&\3\2\2\2\u00a6\u00a8\t\6\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae"+
		"\3\2\2\2\u00ab\u00ad\t\7\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af(\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b1\u00b2\13\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\25\2\2\u00b4*"+
		"\3\2\2\2\r\2]djmw\u0085\u0090\u009f\u00a9\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}