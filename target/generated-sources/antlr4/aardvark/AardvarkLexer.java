// Generated from Aardvark.g4 by ANTLR 4.9

    package aardvark;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AardvarkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PUBLIC=10, IMPORT=11, MODULE=12, SEMI=13, HASH=14, LBRACE=15, RBRACE=16, 
		LBRACKET=17, RBRACKET=18, SLASH=19, STAR=20, COLON=21, MUTABLE=22, COMMA=23, 
		DQUOTE=24, PLUS=25, INTEGER=26, Identifier=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"PUBLIC", "IMPORT", "MODULE", "SEMI", "HASH", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "SLASH", "STAR", "COLON", "MUTABLE", "COMMA", "DQUOTE", "PLUS", 
			"INTEGER", "Identifier", "WS", "Letter", "Digit", "Escape", "LetterOrDigit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'return'", "'for'", "'struct'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'public'", "'import'", "'module'", "';'", "'#'", "'{'", "'}'", 
			"'('", "')'", "'/'", "'*'", "':'", "'mut'", "','", "'\"'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "PUBLIC", 
			"IMPORT", "MODULE", "SEMI", "HASH", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"SLASH", "STAR", "COLON", "MUTABLE", "COMMA", "DQUOTE", "PLUS", "INTEGER", 
			"Identifier", "WS"
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


	public AardvarkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aardvark.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\6\33\u0097\n\33\r\33\16\33\u0098\3\34\3\34"+
		"\7\34\u009d\n\34\f\34\16\34\u00a0\13\34\3\35\6\35\u00a3\n\35\r\35\16\35"+
		"\u00a4\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \5 \u00bd\n \3!\3!\5!\u00c1\n!\2\2\"\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\2\3\2\4\5\2"+
		"\13\f\17\17\"\"\t\2&&C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u0101\2\u00c8"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3C\3"+
		"\2\2\2\5E\3\2\2\2\7L\3\2\2\2\tP\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17[\3\2"+
		"\2\2\21^\3\2\2\2\23a\3\2\2\2\25d\3\2\2\2\27k\3\2\2\2\31r\3\2\2\2\33y\3"+
		"\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2"+
		"\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u008f"+
		"\3\2\2\2\61\u0091\3\2\2\2\63\u0093\3\2\2\2\65\u0096\3\2\2\2\67\u009a\3"+
		"\2\2\29\u00a2\3\2\2\2;\u00a8\3\2\2\2=\u00aa\3\2\2\2?\u00bc\3\2\2\2A\u00c0"+
		"\3\2\2\2CD\7?\2\2D\4\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7v\2\2HI\7w\2\2IJ\7t"+
		"\2\2JK\7p\2\2K\6\3\2\2\2LM\7h\2\2MN\7q\2\2NO\7t\2\2O\b\3\2\2\2PQ\7u\2"+
		"\2QR\7v\2\2RS\7t\2\2ST\7w\2\2TU\7e\2\2UV\7v\2\2V\n\3\2\2\2WX\7>\2\2X\f"+
		"\3\2\2\2YZ\7@\2\2Z\16\3\2\2\2[\\\7>\2\2\\]\7?\2\2]\20\3\2\2\2^_\7@\2\2"+
		"_`\7?\2\2`\22\3\2\2\2ab\7?\2\2bc\7?\2\2c\24\3\2\2\2de\7r\2\2ef\7w\2\2"+
		"fg\7d\2\2gh\7n\2\2hi\7k\2\2ij\7e\2\2j\26\3\2\2\2kl\7k\2\2lm\7o\2\2mn\7"+
		"r\2\2no\7q\2\2op\7t\2\2pq\7v\2\2q\30\3\2\2\2rs\7o\2\2st\7q\2\2tu\7f\2"+
		"\2uv\7w\2\2vw\7n\2\2wx\7g\2\2x\32\3\2\2\2yz\7=\2\2z\34\3\2\2\2{|\7%\2"+
		"\2|\36\3\2\2\2}~\7}\2\2~ \3\2\2\2\177\u0080\7\177\2\2\u0080\"\3\2\2\2"+
		"\u0081\u0082\7*\2\2\u0082$\3\2\2\2\u0083\u0084\7+\2\2\u0084&\3\2\2\2\u0085"+
		"\u0086\7\61\2\2\u0086(\3\2\2\2\u0087\u0088\7,\2\2\u0088*\3\2\2\2\u0089"+
		"\u008a\7<\2\2\u008a,\3\2\2\2\u008b\u008c\7o\2\2\u008c\u008d\7w\2\2\u008d"+
		"\u008e\7v\2\2\u008e.\3\2\2\2\u008f\u0090\7.\2\2\u0090\60\3\2\2\2\u0091"+
		"\u0092\7$\2\2\u0092\62\3\2\2\2\u0093\u0094\7-\2\2\u0094\64\3\2\2\2\u0095"+
		"\u0097\5=\37\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\66\3\2\2\2\u009a\u009e\5;\36\2\u009b\u009d"+
		"\5A!\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f8\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\t\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\35\2\2\u00a7:\3\2\2\2\u00a8"+
		"\u00a9\t\3\2\2\u00a9<\3\2\2\2\u00aa\u00ab\4\62;\2\u00ab>\3\2\2\2\u00ac"+
		"\u00ad\7^\2\2\u00ad\u00bd\7d\2\2\u00ae\u00af\7^\2\2\u00af\u00bd\7v\2\2"+
		"\u00b0\u00b1\7^\2\2\u00b1\u00bd\7p\2\2\u00b2\u00b3\7^\2\2\u00b3\u00bd"+
		"\7h\2\2\u00b4\u00b5\7^\2\2\u00b5\u00bd\7t\2\2\u00b6\u00b7\7^\2\2\u00b7"+
		"\u00bd\7$\2\2\u00b8\u00b9\7^\2\2\u00b9\u00bd\7)\2\2\u00ba\u00bb\7^\2\2"+
		"\u00bb\u00bd\7^\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b0"+
		"\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd@\3\2\2\2\u00be\u00c1\5;\36\2"+
		"\u00bf\u00c1\5=\37\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1B\3"+
		"\2\2\2\b\2\u0098\u009e\u00a4\u00bc\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}