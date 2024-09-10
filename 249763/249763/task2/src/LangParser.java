// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LParen=1, Comma=2, RParen=3, LBrace=4, Semicolon=5, RBrace=6, LessEq=7, 
		Plus=8, Minus=9, And=10, Xor=11, Assign=12, While=13, Do=14, Local=15, 
		IntLit=16, Idfr=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_args = 1, RULE_body = 2, RULE_exp = 3, RULE_block = 4, 
		RULE_binop = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "args", "body", "exp", "block", "binop"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			args();
			setState(13);
			body();
			setState(14);
			match(EOF);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> Idfr() { return getTokens(LangParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(LangParser.Idfr, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Idfr) {
				{
				{
				setState(16);
				match(Idfr);
				}
				}
				setState(21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Token Idfr;
		public List<Token> localvars = new ArrayList<Token>();
		public ExpContext exp;
		public List<ExpContext> localvarsexps = new ArrayList<ExpContext>();
		public List<ExpContext> ene = new ArrayList<ExpContext>();
		public TerminalNode LBrace() { return getToken(LangParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(LangParser.RBrace, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Local() { return getTokens(LangParser.Local); }
		public TerminalNode Local(int i) {
			return getToken(LangParser.Local, i);
		}
		public List<TerminalNode> Assign() { return getTokens(LangParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(LangParser.Assign, i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(LangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(LangParser.Semicolon, i);
		}
		public List<TerminalNode> Idfr() { return getTokens(LangParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(LangParser.Idfr, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(LBrace);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Local) {
				{
				{
				setState(23);
				match(Local);
				setState(24);
				((BodyContext)_localctx).Idfr = match(Idfr);
				((BodyContext)_localctx).localvars.add(((BodyContext)_localctx).Idfr);
				setState(25);
				match(Assign);
				setState(26);
				((BodyContext)_localctx).exp = exp();
				((BodyContext)_localctx).localvarsexps.add(((BodyContext)_localctx).exp);
				setState(27);
				match(Semicolon);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			((BodyContext)_localctx).exp = exp();
			((BodyContext)_localctx).ene.add(((BodyContext)_localctx).exp);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(35);
				match(Semicolon);
				setState(36);
				((BodyContext)_localctx).exp = exp();
				((BodyContext)_localctx).ene.add(((BodyContext)_localctx).exp);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(RBrace);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileExprContext extends ExpContext {
		public TerminalNode While() { return getToken(LangParser.While, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Do() { return getToken(LangParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(LangParser.Idfr, 0); }
		public IdExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpExprContext extends ExpContext {
		public TerminalNode LParen() { return getToken(LangParser.LParen, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(LangParser.RParen, 0); }
		public BinOpExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpContext {
		public TerminalNode IntLit() { return getToken(LangParser.IntLit, 0); }
		public IntExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(LangParser.Idfr, 0); }
		public TerminalNode Assign() { return getToken(LangParser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(Idfr);
				setState(45);
				match(Assign);
				setState(46);
				exp();
				}
				break;
			case 2:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(LParen);
				setState(48);
				exp();
				setState(49);
				binop();
				setState(50);
				exp();
				setState(51);
				match(RParen);
				}
				break;
			case 3:
				_localctx = new WhileExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(While);
				setState(54);
				exp();
				setState(55);
				match(Do);
				setState(56);
				block();
				}
				break;
			case 4:
				_localctx = new IntExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(IntLit);
				}
				break;
			case 5:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(Idfr);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public ExpContext exp;
		public List<ExpContext> exps = new ArrayList<ExpContext>();
		public TerminalNode LBrace() { return getToken(LangParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(LangParser.RBrace, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(LangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(LangParser.Semicolon, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBrace);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 204802L) != 0) {
				{
				{
				setState(63);
				((BlockContext)_localctx).exp = exp();
				((BlockContext)_localctx).exps.add(((BlockContext)_localctx).exp);
				setState(64);
				match(Semicolon);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(RBrace);
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
	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
	 
		public BinopContext() { }
		public void copyFrom(BinopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndBinopContext extends BinopContext {
		public TerminalNode And() { return getToken(LangParser.And, 0); }
		public AndBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitAndBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusBinopContext extends BinopContext {
		public TerminalNode Plus() { return getToken(LangParser.Plus, 0); }
		public PlusBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitPlusBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorBinopContext extends BinopContext {
		public TerminalNode Xor() { return getToken(LangParser.Xor, 0); }
		public XorBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitXorBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqBinopContext extends BinopContext {
		public TerminalNode LessEq() { return getToken(LangParser.LessEq, 0); }
		public LessEqBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitLessEqBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusBinopContext extends BinopContext {
		public TerminalNode Minus() { return getToken(LangParser.Minus, 0); }
		public MinusBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor) return ((LangVisitor<? extends T>)visitor).visitMinusBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binop);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessEq:
				_localctx = new LessEqBinopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(LessEq);
				}
				break;
			case Plus:
				_localctx = new PlusBinopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(Plus);
				}
				break;
			case Minus:
				_localctx = new MinusBinopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(Minus);
				}
				break;
			case And:
				_localctx = new AndBinopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(And);
				}
				break;
			case Xor:
				_localctx = new XorBinopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(Xor);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003=\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004C\b\u0004\n\u0004\f\u0004F\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0000V\u0000\f\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000"+
		"\b>\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\f\r\u0003\u0002"+
		"\u0001\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u000f\u0005\u0000\u0000"+
		"\u0001\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0012\u0005\u0011\u0000"+
		"\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0016\u001f\u0005\u0004\u0000\u0000\u0017\u0018\u0005\u000f\u0000"+
		"\u0000\u0018\u0019\u0005\u0011\u0000\u0000\u0019\u001a\u0005\f\u0000\u0000"+
		"\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0005\u0005\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0017\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"\'\u0003\u0006\u0003\u0000#$\u0005\u0005\u0000\u0000$&\u0003"+
		"\u0006\u0003\u0000%#\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0006\u0000\u0000+\u0005\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0011\u0000\u0000-.\u0005\f\u0000\u0000.=\u0003"+
		"\u0006\u0003\u0000/0\u0005\u0001\u0000\u000001\u0003\u0006\u0003\u0000"+
		"12\u0003\n\u0005\u000023\u0003\u0006\u0003\u000034\u0005\u0003\u0000\u0000"+
		"4=\u0001\u0000\u0000\u000056\u0005\r\u0000\u000067\u0003\u0006\u0003\u0000"+
		"78\u0005\u000e\u0000\u000089\u0003\b\u0004\u00009=\u0001\u0000\u0000\u0000"+
		":=\u0005\u0010\u0000\u0000;=\u0005\u0011\u0000\u0000<,\u0001\u0000\u0000"+
		"\u0000</\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000"+
		">D\u0005\u0004\u0000\u0000?@\u0003\u0006\u0003\u0000@A\u0005\u0005\u0000"+
		"\u0000AC\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0006\u0000\u0000"+
		"H\t\u0001\u0000\u0000\u0000IO\u0005\u0007\u0000\u0000JO\u0005\b\u0000"+
		"\u0000KO\u0005\t\u0000\u0000LO\u0005\n\u0000\u0000MO\u0005\u000b\u0000"+
		"\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u000b"+
		"\u0001\u0000\u0000\u0000\u0006\u0013\u001f\'<DN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}