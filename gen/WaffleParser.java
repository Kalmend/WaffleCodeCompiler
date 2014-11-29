// Generated from C:/Users/Viljar/IdeaProjects/WaffleCodeCompiler/src\Waffle.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WaffleParser extends Parser {
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
		RETURN=43, VAR=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'Array'", "'('", "')'", "':'", "'['", "';'", "','", "']'", 
		"'='", "INT", "DBL", "BOOL", "STR", "COMMENT", "WS", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'!'", "'#'", "'->'", 
		"'Int'", "'Double'", "'String'", "'Boolean'", "END", "LOOP", "FOR", "IN", 
		"OUT", "SUB", "IF", "ELIF", "ELSE", "RANGE", "RETURN", "VAR"
	};
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_code_block = 2, RULE_subroutine = 3, 
		RULE_subroutine_header = 4, RULE_routine_name = 5, RULE_type_decl = 6, 
		RULE_type = 7, RULE_scalar_type = 8, RULE_param = 9, RULE_var_decl = 10, 
		RULE_statement = 11, RULE_if_statement = 12, RULE_condition = 13, RULE_for_statement = 14, 
		RULE_for_header = 15, RULE_range_exp = 16, RULE_assign_statement = 17, 
		RULE_decl_statement = 18, RULE_return_statement = 19, RULE_call_statement = 20, 
		RULE_expression = 21, RULE_call_expression = 22, RULE_bin_op = 23, RULE_un_op = 24, 
		RULE_variable_expression = 25, RULE_indexed_expression = 26, RULE_literal_expression = 27, 
		RULE_list_expression = 28, RULE_string_literal = 29, RULE_numeric_literal = 30, 
		RULE_boolean_literal = 31, RULE_variable = 32, RULE_integer = 33, RULE_dooble = 34, 
		RULE_string = 35, RULE_buulean = 36;
	public static final String[] ruleNames = {
		"program", "body", "code_block", "subroutine", "subroutine_header", "routine_name", 
		"type_decl", "type", "scalar_type", "param", "var_decl", "statement", 
		"if_statement", "condition", "for_statement", "for_header", "range_exp", 
		"assign_statement", "decl_statement", "return_statement", "call_statement", 
		"expression", "call_expression", "bin_op", "un_op", "variable_expression", 
		"indexed_expression", "literal_expression", "list_expression", "string_literal", 
		"numeric_literal", "boolean_literal", "variable", "integer", "dooble", 
		"string", "buulean"
	};

	@Override
	public String getGrammarFileName() { return "Waffle.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WaffleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << FOR) | (1L << SUB) | (1L << IF) | (1L << RETURN) | (1L << VAR))) != 0)) {
				{
				{
				setState(74); code_block();
				}
				}
				setState(79);
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

	public static class BodyContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80); statement();
				setState(81); match(T__3);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << VAR))) != 0) );
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

	public static class Code_blockContext extends ParserRuleContext {
		public SubroutineContext subroutine() {
			return getRuleContext(SubroutineContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code_block);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case T__3:
			case FOR:
			case IF:
			case RETURN:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(87); statement();
				setState(88); match(T__3);
				}
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); subroutine();
				setState(91); match(T__3);
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

	public static class SubroutineContext extends ParserRuleContext {
		public Subroutine_headerContext subroutine_header() {
			return getRuleContext(Subroutine_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(WaffleParser.END, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public SubroutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterSubroutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitSubroutine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitSubroutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineContext subroutine() throws RecognitionException {
		SubroutineContext _localctx = new SubroutineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subroutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); subroutine_header();
			setState(96); body();
			setState(97); match(END);
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

	public static class Subroutine_headerContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public TerminalNode SUB() { return getToken(WaffleParser.SUB, 0); }
		public Routine_nameContext routine_name() {
			return getRuleContext(Routine_nameContext.class,0);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Subroutine_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterSubroutine_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitSubroutine_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitSubroutine_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutine_headerContext subroutine_header() throws RecognitionException {
		Subroutine_headerContext _localctx = new Subroutine_headerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subroutine_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(SUB);
			setState(100); routine_name();
			setState(101); match(T__7);
			setState(102); param();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(103); match(T__2);
				setState(104); param();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(T__6);
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

	public static class Routine_nameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(WaffleParser.VAR, 0); }
		public Routine_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterRoutine_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitRoutine_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitRoutine_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routine_nameContext routine_name() throws RecognitionException {
		Routine_nameContext _localctx = new Routine_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_routine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(VAR);
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

	public static class Type_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(LT);
			setState(115); type();
			setState(116); match(GT);
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

	public static class TypeContext extends ParserRuleContext {
		public Scalar_typeContext scalar_type() {
			return getRuleContext(Scalar_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case DBL_TYPE:
			case STR_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); scalar_type();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(T__8);
				setState(120); match(LT);
				setState(121); type();
				setState(122); match(GT);
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

	public static class Scalar_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(WaffleParser.INT_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(WaffleParser.STR_TYPE, 0); }
		public TerminalNode DBL_TYPE() { return getToken(WaffleParser.DBL_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(WaffleParser.BOOL_TYPE, 0); }
		public Scalar_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterScalar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitScalar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitScalar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_typeContext scalar_type() throws RecognitionException {
		Scalar_typeContext _localctx = new Scalar_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scalar_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DBL_TYPE) | (1L << STR_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(WaffleParser.IN, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode OUT() { return getToken(WaffleParser.OUT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OUT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(131); var_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); variable();
				setState(134); type_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); variable();
				setState(137); type_decl();
				setState(138); match(T__0);
				setState(139); expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Decl_statementContext decl_statement() {
			return getRuleContext(Decl_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); for_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146); return_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147); call_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148); decl_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> ELIF() { return getTokens(WaffleParser.ELIF); }
		public TerminalNode ELSE() { return getToken(WaffleParser.ELSE, 0); }
		public List<TerminalNode> IF() { return getTokens(WaffleParser.IF); }
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode IF(int i) {
			return getToken(WaffleParser.IF, i);
		}
		public TerminalNode ELIF(int i) {
			return getToken(WaffleParser.ELIF, i);
		}
		public TerminalNode END() { return getToken(WaffleParser.END, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		int _la;
		try {
			setState(174);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(IF);
				setState(153); condition();
				setState(154); match(T__5);
				setState(155); body();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(156); match(ELIF);
					setState(157); condition();
					setState(158); match(T__5);
					setState(159); body();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(166); match(ELSE);
					setState(167); match(T__5);
					setState(168); body();
					}
				}

				setState(171); match(END);
				setState(172); match(IF);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); expression(0);
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

	public static class For_statementContext extends ParserRuleContext {
		public For_headerContext for_header() {
			return getRuleContext(For_headerContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(WaffleParser.LOOP, 0); }
		public TerminalNode END() { return getToken(WaffleParser.END, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); for_header();
			setState(179); body();
			setState(180); match(END);
			setState(181); match(LOOP);
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

	public static class For_headerContext extends ParserRuleContext {
		public Var_declContext iterator;
		public TerminalNode FOR() { return getToken(WaffleParser.FOR, 0); }
		public TerminalNode IN() { return getToken(WaffleParser.IN, 0); }
		public Range_expContext range_exp() {
			return getRuleContext(Range_expContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public For_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterFor_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitFor_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitFor_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_headerContext for_header() throws RecognitionException {
		For_headerContext _localctx = new For_headerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(FOR);
			setState(184); ((For_headerContext)_localctx).iterator = var_decl();
			setState(185); match(IN);
			setState(186); range_exp();
			setState(187); match(T__5);
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

	public static class Range_expContext extends ParserRuleContext {
		public ExpressionContext start;
		public ExpressionContext stop;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ARROW() { return getToken(WaffleParser.ARROW, 0); }
		public Range_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterRange_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitRange_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitRange_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_expContext range_exp() throws RecognitionException {
		Range_expContext _localctx = new Range_expContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_range_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); ((Range_expContext)_localctx).start = expression(0);
			setState(190); match(ARROW);
			setState(191); ((Range_expContext)_localctx).stop = expression(0);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public Variable_expressionContext left;
		public ExpressionContext right;
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); ((Assign_statementContext)_localctx).left = variable_expression();
			setState(194); match(T__0);
			setState(195); ((Assign_statementContext)_localctx).right = expression(0);
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

	public static class Decl_statementContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Decl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterDecl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitDecl_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitDecl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_statementContext decl_statement() throws RecognitionException {
		Decl_statementContext _localctx = new Decl_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); var_decl();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(WaffleParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(RETURN);
			setState(201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__4) | (1L << INT) | (1L << DBL) | (1L << BOOL) | (1L << STR) | (1L << MINUS) | (1L << NOT) | (1L << HASH) | (1L << VAR))) != 0)) {
				{
				setState(200); expression(0);
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

	public static class Call_statementContext extends ParserRuleContext {
		public Call_expressionContext call_expression() {
			return getRuleContext(Call_expressionContext.class,0);
		}
		public Call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterCall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitCall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitCall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_statementContext call_statement() throws RecognitionException {
		Call_statementContext _localctx = new Call_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); call_expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpUnaryContext extends ExpressionContext {
		public Un_opContext operator;
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpListContext extends ExpressionContext {
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public ExpListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NOTIMPLEMENTED1Context extends ExpressionContext {
		public Call_expressionContext call_expression() {
			return getRuleContext(Call_expressionContext.class,0);
		}
		public NOTIMPLEMENTED1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterNOTIMPLEMENTED1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitNOTIMPLEMENTED1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitNOTIMPLEMENTED1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLiteralContext extends ExpressionContext {
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public ExpLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpVariableContext extends ExpressionContext {
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public ExpVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpBinaryContext extends ExpressionContext {
		public ExpressionContext left;
		public Bin_opContext operator;
		public ExpressionContext right;
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpBinaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ExpUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206); ((ExpUnaryContext)_localctx).operator = un_op();
				setState(207); expression(3);
				}
				break;
			case 2:
				{
				_localctx = new ExpParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(T__7);
				setState(210); expression(0);
				setState(211); match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new ExpLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213); literal_expression();
				}
				break;
			case 4:
				{
				_localctx = new ExpVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); variable_expression();
				}
				break;
			case 5:
				{
				_localctx = new NOTIMPLEMENTED1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); call_expression();
				}
				break;
			case 6:
				{
				_localctx = new ExpListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216); list_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpBinaryContext(new ExpressionContext(_parentctx, _parentState));
					((ExpBinaryContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(219);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(220); ((ExpBinaryContext)_localctx).operator = bin_op();
					setState(221); ((ExpBinaryContext)_localctx).right = expression(7);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Call_expressionContext extends ParserRuleContext {
		public Call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expression; }
	 
		public Call_expressionContext() { }
		public void copyFrom(Call_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpCallContext extends Call_expressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpCallContext(Call_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterExpCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitExpCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitExpCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_expressionContext call_expression() throws RecognitionException {
		Call_expressionContext _localctx = new Call_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_call_expression);
		int _la;
		try {
			_localctx = new ExpCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228); variable();
			setState(229); match(T__7);
			setState(230); expression(0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(231); match(T__2);
				setState(232); expression(0);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); match(T__6);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(WaffleParser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(WaffleParser.GTE, 0); }
		public TerminalNode LT() { return getToken(WaffleParser.LT, 0); }
		public TerminalNode GT() { return getToken(WaffleParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(WaffleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(WaffleParser.MINUS, 0); }
		public TerminalNode EQ() { return getToken(WaffleParser.EQ, 0); }
		public TerminalNode LTE() { return getToken(WaffleParser.LTE, 0); }
		public TerminalNode DIV() { return getToken(WaffleParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(WaffleParser.MUL, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQ) | (1L << NEQ) | (1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Un_opContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(WaffleParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(WaffleParser.MINUS, 0); }
		public TerminalNode HASH() { return getToken(WaffleParser.HASH, 0); }
		public Un_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterUn_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitUn_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitUn_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Un_opContext un_op() throws RecognitionException {
		Un_opContext _localctx = new Un_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_un_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << HASH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Variable_expressionContext extends ParserRuleContext {
		public Indexed_expressionContext indexed_expression() {
			return getRuleContext(Indexed_expressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Variable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterVariable_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitVariable_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitVariable_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_expressionContext variable_expression() throws RecognitionException {
		Variable_expressionContext _localctx = new Variable_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable_expression);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); indexed_expression();
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

	public static class Indexed_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Indexed_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterIndexed_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitIndexed_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitIndexed_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_expressionContext indexed_expression() throws RecognitionException {
		Indexed_expressionContext _localctx = new Indexed_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_indexed_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); variable();
			setState(249); match(T__4);
			setState(250); expression(0);
			setState(251); match(T__1);
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

	public static class Literal_expressionContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal_expression);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); string_literal();
				}
				break;
			case INT:
			case DBL:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); numeric_literal();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); boolean_literal();
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

	public static class List_expressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterList_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitList_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitList_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_expressionContext list_expression() throws RecognitionException {
		List_expressionContext _localctx = new List_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(T__4);
			setState(267);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__4) | (1L << INT) | (1L << DBL) | (1L << BOOL) | (1L << STR) | (1L << MINUS) | (1L << NOT) | (1L << HASH) | (1L << VAR))) != 0)) {
				{
				setState(259); expression(0);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(260); match(T__2);
					setState(261); expression(0);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269); match(T__1);
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

	public static class String_literalContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); string();
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DoobleContext dooble() {
			return getRuleContext(DoobleContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numeric_literal);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); integer();
				}
				break;
			case DBL:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); dooble();
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public BuuleanContext buulean() {
			return getRuleContext(BuuleanContext.class,0);
		}
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolean_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); buulean();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(WaffleParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(VAR);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(WaffleParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(INT);
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

	public static class DoobleContext extends ParserRuleContext {
		public TerminalNode DBL() { return getToken(WaffleParser.DBL, 0); }
		public DoobleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dooble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterDooble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitDooble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitDooble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoobleContext dooble() throws RecognitionException {
		DoobleContext _localctx = new DoobleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dooble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(DBL);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(WaffleParser.STR, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(STR);
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

	public static class BuuleanContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(WaffleParser.BOOL, 0); }
		public BuuleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buulean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).enterBuulean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WaffleListener ) ((WaffleListener)listener).exitBuulean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaffleVisitor ) return ((WaffleVisitor<? extends T>)visitor).visitBuulean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuuleanContext buulean() throws RecognitionException {
		BuuleanContext _localctx = new BuuleanContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_buulean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(BOOL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\6\3V\n\3\r\3\16\3W\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\13\5\13\u0084"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13\16\3\16\3\16\3\16\5\16"+
		"\u00ac\n\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\5\25\u00cc\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00dc\n\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00e2\n\27\f\27\16\27\u00e5\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00ec\n\30\f\30\16\30\u00ef\13\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\5\33\u00f9\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\5\35\u0103\n\35\3\36\3\36\3\36\3\36\7\36\u0109\n\36\f\36\16\36\u010c"+
		"\13\36\5\36\u010e\n\36\3\36\3\36\3\37\3\37\3 \3 \5 \u0116\n \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\2\3,\'\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2\37\"\3\2&\'\3\2\22\33\4"+
		"\2\31\31\34\35\u011b\2O\3\2\2\2\4U\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\ne\3"+
		"\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u0083\3"+
		"\2\2\2\26\u008f\3\2\2\2\30\u0097\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2"+
		"\2\2\36\u00b4\3\2\2\2 \u00b9\3\2\2\2\"\u00bf\3\2\2\2$\u00c3\3\2\2\2&\u00c7"+
		"\3\2\2\2(\u00c9\3\2\2\2*\u00cd\3\2\2\2,\u00db\3\2\2\2.\u00e6\3\2\2\2\60"+
		"\u00f2\3\2\2\2\62\u00f4\3\2\2\2\64\u00f8\3\2\2\2\66\u00fa\3\2\2\28\u0102"+
		"\3\2\2\2:\u0104\3\2\2\2<\u0111\3\2\2\2>\u0115\3\2\2\2@\u0117\3\2\2\2B"+
		"\u0119\3\2\2\2D\u011b\3\2\2\2F\u011d\3\2\2\2H\u011f\3\2\2\2J\u0121\3\2"+
		"\2\2LN\5\6\4\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3"+
		"\2\2\2RS\5\30\r\2ST\7\b\2\2TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX"+
		"\3\2\2\2X\5\3\2\2\2YZ\5\30\r\2Z[\7\b\2\2[`\3\2\2\2\\]\5\b\5\2]^\7\b\2"+
		"\2^`\3\2\2\2_Y\3\2\2\2_\\\3\2\2\2`\7\3\2\2\2ab\5\n\6\2bc\5\4\3\2cd\7#"+
		"\2\2d\t\3\2\2\2ef\7(\2\2fg\5\f\7\2gh\7\4\2\2hm\5\24\13\2ij\7\t\2\2jl\5"+
		"\24\13\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2p"+
		"q\7\5\2\2q\13\3\2\2\2rs\7.\2\2s\r\3\2\2\2tu\7\24\2\2uv\5\20\t\2vw\7\22"+
		"\2\2w\17\3\2\2\2x\177\5\22\n\2yz\7\3\2\2z{\7\24\2\2{|\5\20\t\2|}\7\22"+
		"\2\2}\177\3\2\2\2~x\3\2\2\2~y\3\2\2\2\177\21\3\2\2\2\u0080\u0081\t\2\2"+
		"\2\u0081\23\3\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\26\f\2\u0086\25\3\2\2\2\u0087"+
		"\u0088\5B\"\2\u0088\u0089\5\16\b\2\u0089\u0090\3\2\2\2\u008a\u008b\5B"+
		"\"\2\u008b\u008c\5\16\b\2\u008c\u008d\7\13\2\2\u008d\u008e\5,\27\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008a\3\2\2\2\u0090\27\3\2\2"+
		"\2\u0091\u0098\5$\23\2\u0092\u0098\5\36\20\2\u0093\u0098\5\32\16\2\u0094"+
		"\u0098\5(\25\2\u0095\u0098\5*\26\2\u0096\u0098\5&\24\2\u0097\u0091\3\2"+
		"\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\31\3\2\2\2\u0099\u00b1\3\2\2"+
		"\2\u009a\u009b\7)\2\2\u009b\u009c\5\34\17\2\u009c\u009d\7\6\2\2\u009d"+
		"\u00a5\5\4\3\2\u009e\u009f\7*\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7"+
		"\6\2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a4\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ab\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9\u00aa\7\6\2\2\u00aa"+
		"\u00ac\5\4\3\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7)\2\2\u00af\u00b1\3\2\2\2\u00b0\u0099"+
		"\3\2\2\2\u00b0\u009a\3\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b3\5,\27\2\u00b3"+
		"\35\3\2\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7#\2\2"+
		"\u00b7\u00b8\7$\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb\5"+
		"\26\f\2\u00bb\u00bc\7&\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\6\2\2\u00be"+
		"!\3\2\2\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\5,\27\2"+
		"\u00c2#\3\2\2\2\u00c3\u00c4\5\64\33\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6"+
		"\5,\27\2\u00c6%\3\2\2\2\u00c7\u00c8\5\26\f\2\u00c8\'\3\2\2\2\u00c9\u00cb"+
		"\7-\2\2\u00ca\u00cc\5,\27\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		")\3\2\2\2\u00cd\u00ce\5.\30\2\u00ce+\3\2\2\2\u00cf\u00d0\b\27\1\2\u00d0"+
		"\u00d1\5\62\32\2\u00d1\u00d2\5,\27\5\u00d2\u00dc\3\2\2\2\u00d3\u00d4\7"+
		"\4\2\2\u00d4\u00d5\5,\27\2\u00d5\u00d6\7\5\2\2\u00d6\u00dc\3\2\2\2\u00d7"+
		"\u00dc\58\35\2\u00d8\u00dc\5\64\33\2\u00d9\u00dc\5.\30\2\u00da\u00dc\5"+
		":\36\2\u00db\u00cf\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00e3\3\2"+
		"\2\2\u00dd\u00de\f\b\2\2\u00de\u00df\5\60\31\2\u00df\u00e0\5,\27\t\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7"+
		"\5B\"\2\u00e7\u00e8\7\4\2\2\u00e8\u00ed\5,\27\2\u00e9\u00ea\7\t\2\2\u00ea"+
		"\u00ec\5,\27\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7\5\2\2\u00f1/\3\2\2\2\u00f2\u00f3\t\4\2\2\u00f3\61\3\2\2\2\u00f4"+
		"\u00f5\t\5\2\2\u00f5\63\3\2\2\2\u00f6\u00f9\5B\"\2\u00f7\u00f9\5\66\34"+
		"\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\65\3\2\2\2\u00fa\u00fb"+
		"\5B\"\2\u00fb\u00fc\7\7\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\n\2\2\u00fe"+
		"\67\3\2\2\2\u00ff\u0103\5<\37\2\u0100\u0103\5> \2\u0101\u0103\5@!\2\u0102"+
		"\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u01039\3\2\2\2"+
		"\u0104\u010d\7\7\2\2\u0105\u010a\5,\27\2\u0106\u0107\7\t\2\2\u0107\u0109"+
		"\5,\27\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0105\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\n\2\2\u0110"+
		";\3\2\2\2\u0111\u0112\5H%\2\u0112=\3\2\2\2\u0113\u0116\5D#\2\u0114\u0116"+
		"\5F$\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116?\3\2\2\2\u0117\u0118"+
		"\5J&\2\u0118A\3\2\2\2\u0119\u011a\7.\2\2\u011aC\3\2\2\2\u011b\u011c\7"+
		"\f\2\2\u011cE\3\2\2\2\u011d\u011e\7\r\2\2\u011eG\3\2\2\2\u011f\u0120\7"+
		"\17\2\2\u0120I\3\2\2\2\u0121\u0122\7\16\2\2\u0122K\3\2\2\2\26OW_m~\u0083"+
		"\u008f\u0097\u00a5\u00ab\u00b0\u00cb\u00db\u00e3\u00ed\u00f8\u0102\u010a"+
		"\u010d\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}