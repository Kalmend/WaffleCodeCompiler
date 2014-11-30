// Generated from C:/Users/Oliver/Documents/Java/IdeaProjects/WaffleCodeCompiler/src\Waffle.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WaffleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		INT=10, DBL=11, BOOL=12, STR=13, COMMENT=14, WS=15, GT=16, GTE=17, LT=18, 
		LTE=19, EQ=20, NEQ=21, PLUS=22, MINUS=23, MUL=24, DIV=25, NOT=26, HASH=27, 
		ARROW=28, INT_TYPE=29, DBL_TYPE=30, STR_TYPE=31, BOOL_TYPE=32, END=33, 
		LOOP=34, FOR=35, IN=36, OUT=37, SUB=38, IF=39, ELIF=40, ELSE=41, RANGE=42, 
		RETURN=43, BREAK=44, VAR=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"INT", "DBL", "BOOL", "STR", "COMMENT", "WS", "GT", "GTE", "LT", "LTE", 
		"EQ", "NEQ", "PLUS", "MINUS", "MUL", "DIV", "NOT", "HASH", "ARROW", "INT_TYPE", 
		"DBL_TYPE", "STR_TYPE", "BOOL_TYPE", "END", "LOOP", "FOR", "IN", "OUT", 
		"SUB", "IF", "ELIF", "ELSE", "RANGE", "RETURN", "BREAK", "VAR"
	};


	public WaffleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Waffle.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0169\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13u\n\13\r\13\16\13v\3\f\6\f"+
		"z\n\f\r\f\16\f{\3\f\3\f\6\f\u0080\n\f\r\f\16\f\u0081\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\7\16\u0093\n\16\f"+
		"\16\16\16\u0096\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u009e\n\17\f"+
		"\17\16\17\u00a1\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a9\n\17\f"+
		"\17\16\17\u00ac\13\17\3\17\5\17\u00af\n\17\3\17\3\17\3\20\6\20\u00b4\n"+
		"\20\r\20\16\20\u00b5\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00f9\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u0103\n#\3$\3$\3$\3$\3$\3$\5$\u010b\n$\3%\3%\3%\3%\5%\u0111\n%\3&\3"+
		"&\3&\3&\3&\3&\5&\u0119\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0121\n\'\3(\3("+
		"\3(\3(\5(\u0127\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0131\n)\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u013b\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0147\n+\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0155\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u0161\n-\3.\3.\7.\u0165\n.\f.\16.\u0168\13.\4\u009f\u00aa\2/\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\7\3\2\62;\4\2$$^^\5\2\13\f\17\17"+
		"\"\"\4\2C\\c|\6\2\62;C\\aac|\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\3]\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2"+
		"\2\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25t\3\2\2\2\27y\3\2\2\2\31\u008c"+
		"\3\2\2\2\33\u008e\3\2\2\2\35\u00ae\3\2\2\2\37\u00b3\3\2\2\2!\u00b9\3\2"+
		"\2\2#\u00bb\3\2\2\2%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c3\3\2\2\2+\u00c6"+
		"\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2"+
		"\2\65\u00d1\3\2\2\2\67\u00d3\3\2\2\29\u00d5\3\2\2\2;\u00d8\3\2\2\2=\u00dc"+
		"\3\2\2\2?\u00e3\3\2\2\2A\u00ea\3\2\2\2C\u00f8\3\2\2\2E\u0102\3\2\2\2G"+
		"\u010a\3\2\2\2I\u0110\3\2\2\2K\u0118\3\2\2\2M\u0120\3\2\2\2O\u0126\3\2"+
		"\2\2Q\u0130\3\2\2\2S\u013a\3\2\2\2U\u0146\3\2\2\2W\u0154\3\2\2\2Y\u0160"+
		"\3\2\2\2[\u0162\3\2\2\2]^\7C\2\2^_\7t\2\2_`\7t\2\2`a\7c\2\2ab\7{\2\2b"+
		"\4\3\2\2\2cd\7*\2\2d\6\3\2\2\2ef\7+\2\2f\b\3\2\2\2gh\7<\2\2h\n\3\2\2\2"+
		"ij\7]\2\2j\f\3\2\2\2kl\7=\2\2l\16\3\2\2\2mn\7.\2\2n\20\3\2\2\2op\7_\2"+
		"\2p\22\3\2\2\2qr\7?\2\2r\24\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3"+
		"\2\2\2vw\3\2\2\2w\26\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{"+
		"|\3\2\2\2|}\3\2\2\2}\177\7\60\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\30\3\2\2\2\u0083"+
		"\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086\u008d\7g\2\2"+
		"\u0087\u0088\7h\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\u008b"+
		"\7u\2\2\u008b\u008d\7g\2\2\u008c\u0083\3\2\2\2\u008c\u0087\3\2\2\2\u008d"+
		"\32\3\2\2\2\u008e\u0094\7$\2\2\u008f\u0090\7^\2\2\u0090\u0093\13\2\2\2"+
		"\u0091\u0093\n\3\2\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7$\2\2\u0098\34\3\2\2\2\u0099\u009a\7\61\2"+
		"\2\u009a\u009b\7,\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\u00af\7\61"+
		"\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00af\7\f\2\2\u00ae\u0099\3\2\2\2\u00ae\u00a4\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\b\17\2\2\u00b1\36\3\2\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\b\20\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7@\2\2"+
		"\u00ba\"\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7?\2\2\u00bd$\3\2\2\2"+
		"\u00be\u00bf\7>\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7?\2"+
		"\2\u00c2(\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\7?\2\2\u00c5*\3\2\2\2"+
		"\u00c6\u00c7\7#\2\2\u00c7\u00c8\7?\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7-\2"+
		"\2\u00ca.\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7,\2"+
		"\2\u00ce\62\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\64\3\2\2\2\u00d1\u00d2"+
		"\7#\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7%\2\2\u00d48\3\2\2\2\u00d5\u00d6"+
		"\7/\2\2\u00d6\u00d7\7@\2\2\u00d7:\3\2\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7v\2\2\u00db<\3\2\2\2\u00dc\u00dd\7F\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7i\2\2"+
		"\u00e9@\3\2\2\2\u00ea\u00eb\7D\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7q\2"+
		"\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f9"+
		"\7f\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7P\2\2\u00f7\u00f9\7F\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7q\2\2\u00fd\u0103\7r\2\2\u00fe\u00ff\7N\2\2"+
		"\u00ff\u0100\7Q\2\2\u0100\u0101\7Q\2\2\u0101\u0103\7R\2\2\u0102\u00fa"+
		"\3\2\2\2\u0102\u00fe\3\2\2\2\u0103F\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u010b\7t\2\2\u0107\u0108\7H\2\2\u0108\u0109\7Q\2\2\u0109"+
		"\u010b\7T\2\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010bH\3\2\2\2\u010c"+
		"\u010d\7k\2\2\u010d\u0111\7p\2\2\u010e\u010f\7K\2\2\u010f\u0111\7P\2\2"+
		"\u0110\u010c\3\2\2\2\u0110\u010e\3\2\2\2\u0111J\3\2\2\2\u0112\u0113\7"+
		"Q\2\2\u0113\u0114\7W\2\2\u0114\u0119\7V\2\2\u0115\u0116\7q\2\2\u0116\u0117"+
		"\7w\2\2\u0117\u0119\7v\2\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119"+
		"L\3\2\2\2\u011a\u011b\7U\2\2\u011b\u011c\7W\2\2\u011c\u0121\7D\2\2\u011d"+
		"\u011e\7u\2\2\u011e\u011f\7w\2\2\u011f\u0121\7d\2\2\u0120\u011a\3\2\2"+
		"\2\u0120\u011d\3\2\2\2\u0121N\3\2\2\2\u0122\u0123\7K\2\2\u0123\u0127\7"+
		"H\2\2\u0124\u0125\7k\2\2\u0125\u0127\7h\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127P\3\2\2\2\u0128\u0129\7G\2\2\u0129\u012a\7N\2\2\u012a"+
		"\u012b\7K\2\2\u012b\u0131\7H\2\2\u012c\u012d\7g\2\2\u012d\u012e\7n\2\2"+
		"\u012e\u012f\7k\2\2\u012f\u0131\7h\2\2\u0130\u0128\3\2\2\2\u0130\u012c"+
		"\3\2\2\2\u0131R\3\2\2\2\u0132\u0133\7G\2\2\u0133\u0134\7N\2\2\u0134\u0135"+
		"\7U\2\2\u0135\u013b\7G\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013b\7g\2\2\u013a\u0132\3\2\2\2\u013a\u0136\3\2\2"+
		"\2\u013bT\3\2\2\2\u013c\u013d\7t\2\2\u013d\u013e\7c\2\2\u013e\u013f\7"+
		"p\2\2\u013f\u0140\7i\2\2\u0140\u0147\7g\2\2\u0141\u0142\7T\2\2\u0142\u0143"+
		"\7C\2\2\u0143\u0144\7P\2\2\u0144\u0145\7I\2\2\u0145\u0147\7G\2\2\u0146"+
		"\u013c\3\2\2\2\u0146\u0141\3\2\2\2\u0147V\3\2\2\2\u0148\u0149\7t\2\2\u0149"+
		"\u014a\7g\2\2\u014a\u014b\7v\2\2\u014b\u014c\7w\2\2\u014c\u014d\7t\2\2"+
		"\u014d\u0155\7p\2\2\u014e\u014f\7T\2\2\u014f\u0150\7G\2\2\u0150\u0151"+
		"\7V\2\2\u0151\u0152\7W\2\2\u0152\u0153\7T\2\2\u0153\u0155\7P\2\2\u0154"+
		"\u0148\3\2\2\2\u0154\u014e\3\2\2\2\u0155X\3\2\2\2\u0156\u0157\7d\2\2\u0157"+
		"\u0158\7t\2\2\u0158\u0159\7g\2\2\u0159\u015a\7c\2\2\u015a\u0161\7m\2\2"+
		"\u015b\u015c\7D\2\2\u015c\u015d\7T\2\2\u015d\u015e\7G\2\2\u015e\u015f"+
		"\7C\2\2\u015f\u0161\7M\2\2\u0160\u0156\3\2\2\2\u0160\u015b\3\2\2\2\u0161"+
		"Z\3\2\2\2\u0162\u0166\t\5\2\2\u0163\u0165\t\6\2\2\u0164\u0163\3\2\2\2"+
		"\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\\\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\32\2v{\u0081\u008c\u0092\u0094\u009f\u00aa"+
		"\u00ae\u00b5\u00f8\u0102\u010a\u0110\u0118\u0120\u0126\u0130\u013a\u0146"+
		"\u0154\u0160\u0166\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}