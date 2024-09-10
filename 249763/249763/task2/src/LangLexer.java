// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LParen=1, Comma=2, RParen=3, LBrace=4, Semicolon=5, RBrace=6, LessEq=7, 
		Plus=8, Minus=9, And=10, Xor=11, Assign=12, While=13, Do=14, Local=15, 
		IntLit=16, Idfr=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "LessEq", 
			"Plus", "Minus", "And", "Xor", "Assign", "While", "Do", "Local", "IntLit", 
			"Idfr", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "';'", "'}'", "'<='", "'+'", "'-'", 
			"'&'", "'^'", "':='", "'while'", "'do'", "'local'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "LessEq", 
			"Plus", "Minus", "And", "Xor", "Assign", "While", "Do", "Local", "IntLit", 
			"Idfr", "WS"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\u0004\u0000\u0012i\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000fQ\b\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000fU\b\u000f\n\u000f\f\u000fX\t\u000f\u0003\u000fZ\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0005\u0010^\b\u0010\n\u0010\f\u0010a\t\u0010\u0001\u0011"+
		"\u0004\u0011d\b\u0011\u000b\u0011\f\u0011e\u0001\u0011\u0001\u0011\u0000"+
		"\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0005\u0001\u0000"+
		"19\u0001\u000009\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r"+
		"  m\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001"+
		"\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000"+
		"\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000"+
		"\u000b/\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f4\u0001"+
		"\u0000\u0000\u0000\u00116\u0001\u0000\u0000\u0000\u00138\u0001\u0000\u0000"+
		"\u0000\u0015:\u0001\u0000\u0000\u0000\u0017<\u0001\u0000\u0000\u0000\u0019"+
		"?\u0001\u0000\u0000\u0000\u001bE\u0001\u0000\u0000\u0000\u001dH\u0001"+
		"\u0000\u0000\u0000\u001fY\u0001\u0000\u0000\u0000![\u0001\u0000\u0000"+
		"\u0000#c\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005,\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005"+
		")\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005{\u0000\u0000,\b\u0001"+
		"\u0000\u0000\u0000-.\u0005;\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005"+
		"}\u0000\u00000\f\u0001\u0000\u0000\u000012\u0005<\u0000\u000023\u0005"+
		"=\u0000\u00003\u000e\u0001\u0000\u0000\u000045\u0005+\u0000\u00005\u0010"+
		"\u0001\u0000\u0000\u000067\u0005-\u0000\u00007\u0012\u0001\u0000\u0000"+
		"\u000089\u0005&\u0000\u00009\u0014\u0001\u0000\u0000\u0000:;\u0005^\u0000"+
		"\u0000;\u0016\u0001\u0000\u0000\u0000<=\u0005:\u0000\u0000=>\u0005=\u0000"+
		"\u0000>\u0018\u0001\u0000\u0000\u0000?@\u0005w\u0000\u0000@A\u0005h\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005l\u0000\u0000CD\u0005e\u0000\u0000"+
		"D\u001a\u0001\u0000\u0000\u0000EF\u0005d\u0000\u0000FG\u0005o\u0000\u0000"+
		"G\u001c\u0001\u0000\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005o\u0000\u0000"+
		"JK\u0005c\u0000\u0000KL\u0005a\u0000\u0000LM\u0005l\u0000\u0000M\u001e"+
		"\u0001\u0000\u0000\u0000NZ\u00050\u0000\u0000OQ\u0005-\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RV\u0007\u0000\u0000\u0000SU\u0007\u0001\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YN\u0001"+
		"\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000Z \u0001\u0000\u0000\u0000"+
		"[_\u0007\u0002\u0000\u0000\\^\u0007\u0003\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\"\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0007"+
		"\u0004\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0006\u0011\u0000\u0000h$\u0001\u0000\u0000\u0000\u0006\u0000"+
		"PVY_e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}