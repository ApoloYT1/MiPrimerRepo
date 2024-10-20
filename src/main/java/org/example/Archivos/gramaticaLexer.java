// Generated from C:/Users/abrah/IdeaProjects/proyectoU3/src/main/java/org/example/gramatica.g4 by ANTLR 4.13.1
package org.example.Archivos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, ELSE=2, IF=3, ENTERO=4, TIPO=5, P_ABRE=6, P_CIERRA=7, LL_ABRE=8, 
		LL_CIERRA=9, MAYOR=10, MENOR=11, MAYOR_IGUAL=12, MENOR_IGUAL=13, FR=14, 
		ID=15, COMA=16, PYC=17, IGUAL=18, O=19, Y=20, DIF=21, NEGACION=22, PUNTO=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "ELSE", "IF", "ENTERO", "TIPO", "P_ABRE", "P_CIERRA", "LL_ABRE", 
			"LL_CIERRA", "MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "FR", "ID", 
			"COMA", "PYC", "IGUAL", "O", "Y", "DIF", "NEGACION", "PUNTO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'else'", "'if'", null, null, "'('", "')'", "'{'", "'}'", 
			"'>'", "'<'", "'>='", "'<='", null, null, "','", "';'", "'='", "'||'", 
			"'&&'", "'!='", "'!'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "ELSE", "IF", "ENTERO", "TIPO", "P_ABRE", "P_CIERRA", 
			"LL_ABRE", "LL_CIERRA", "MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", 
			"FR", "ID", "COMA", "PYC", "IGUAL", "O", "Y", "DIF", "NEGACION", "PUNTO", 
			"WS"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\u0004\u0000\u0018\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0004\u0003F\b\u0003\u000b\u0003\f\u0003G\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0004\rl\b\r\u000b\r\f\rm\u0001\r\u0001\r\u0004\rr\b\r\u000b\r\f\r"+
		"s\u0001\u000e\u0001\u000e\u0005\u000ex\b\u000e\n\u000e\f\u000e{\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0004\u0017\u0091\b\u0017\u000b\u0017\f\u0017"+
		"\u0092\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0001"+
		"\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u009d"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u0001:\u0001\u0000\u0000\u0000\u0003<\u0001\u0000"+
		"\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007E\u0001\u0000\u0000\u0000"+
		"\tV\u0001\u0000\u0000\u0000\u000bX\u0001\u0000\u0000\u0000\rZ\u0001\u0000"+
		"\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011^\u0001\u0000\u0000"+
		"\u0000\u0013`\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017"+
		"d\u0001\u0000\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001bk\u0001"+
		"\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000"+
		"\u0000!~\u0001\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0082"+
		"\u0001\u0000\u0000\u0000\'\u0085\u0001\u0000\u0000\u0000)\u0088\u0001"+
		"\u0000\u0000\u0000+\u008b\u0001\u0000\u0000\u0000-\u008d\u0001\u0000\u0000"+
		"\u0000/\u0090\u0001\u0000\u0000\u000012\u0005t\u0000\u000023\u0005r\u0000"+
		"\u000034\u0005u\u0000\u00004;\u0005e\u0000\u000056\u0005f\u0000\u0000"+
		"67\u0005a\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009;\u0005"+
		"e\u0000\u0000:1\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000;\u0002"+
		"\u0001\u0000\u0000\u0000<=\u0005e\u0000\u0000=>\u0005l\u0000\u0000>?\u0005"+
		"s\u0000\u0000?@\u0005e\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005"+
		"i\u0000\u0000BC\u0005f\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DF\u0007"+
		"\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\b\u0001\u0000\u0000"+
		"\u0000IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000KW\u0005t\u0000\u0000"+
		"LM\u0005d\u0000\u0000MN\u0005o\u0000\u0000NO\u0005u\u0000\u0000OP\u0005"+
		"b\u0000\u0000PQ\u0005l\u0000\u0000QW\u0005e\u0000\u0000RS\u0005b\u0000"+
		"\u0000ST\u0005o\u0000\u0000TU\u0005o\u0000\u0000UW\u0005l\u0000\u0000"+
		"VI\u0001\u0000\u0000\u0000VL\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000"+
		"\u0000W\n\u0001\u0000\u0000\u0000XY\u0005(\u0000\u0000Y\f\u0001\u0000"+
		"\u0000\u0000Z[\u0005)\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005"+
		"{\u0000\u0000]\u0010\u0001\u0000\u0000\u0000^_\u0005}\u0000\u0000_\u0012"+
		"\u0001\u0000\u0000\u0000`a\u0005>\u0000\u0000a\u0014\u0001\u0000\u0000"+
		"\u0000bc\u0005<\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0005>\u0000"+
		"\u0000ef\u0005=\u0000\u0000f\u0018\u0001\u0000\u0000\u0000gh\u0005<\u0000"+
		"\u0000hi\u0005=\u0000\u0000i\u001a\u0001\u0000\u0000\u0000jl\u0007\u0000"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0005.\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000t\u001c\u0001\u0000\u0000\u0000uy\u0007\u0001\u0000\u0000vx\u0007"+
		"\u0002\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u001e\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005,\u0000\u0000} \u0001\u0000"+
		"\u0000\u0000~\u007f\u0005;\u0000\u0000\u007f\"\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005=\u0000\u0000\u0081$\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005|\u0000\u0000\u0083\u0084\u0005|\u0000\u0000\u0084&\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005&\u0000\u0000\u0086\u0087\u0005&\u0000\u0000"+
		"\u0087(\u0001\u0000\u0000\u0000\u0088\u0089\u0005!\u0000\u0000\u0089\u008a"+
		"\u0005=\u0000\u0000\u008a*\u0001\u0000\u0000\u0000\u008b\u008c\u0005!"+
		"\u0000\u0000\u008c,\u0001\u0000\u0000\u0000\u008d\u008e\u0005.\u0000\u0000"+
		"\u008e.\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0003\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0017\u0000\u0000\u0095"+
		"0\u0001\u0000\u0000\u0000\b\u0000:GVmsy\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}