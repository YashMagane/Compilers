// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CourseWorkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Quality=10, LParen=11, Comma=12, RParen=13, LBrace=14, Semicolon=15, RBrace=16, 
		Divide=17, LessEq=18, MoreEq=19, Times=20, Plus=21, Minus=22, And=23, 
		Xor=24, LogicalOr=25, Less=26, More=27, Assign=28, While=29, Do=30, Local=31, 
		TYPE=32, IDFR=33, INTLIT=34, BOOLLIT=35, WS=36, Comment=37;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_body = 3, RULE_block = 4, 
		RULE_ene = 5, RULE_expr = 6, RULE_args = 7, RULE_binop = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "body", "block", "ene", "expr", "args", "binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'repeat'", "'until'", "'print'", "'space'", 
			"'newline'", "'skip'", "'=='", "'('", "','", "')'", "'{'", "';'", "'}'", 
			"'/'", "'<='", "'>='", "'*'", "'+'", "'-'", "'&'", "'^'", "'|'", "'<'", 
			"'>'", "':='", "'while'", "'do'", "'local'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Quality", 
			"LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "Divide", 
			"LessEq", "MoreEq", "Times", "Plus", "Minus", "And", "Xor", "LogicalOr", 
			"Less", "More", "Assign", "While", "Do", "Local", "TYPE", "IDFR", "INTLIT", 
			"BOOLLIT", "WS", "Comment"
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

	public CourseWorkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CourseWorkParser.EOF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(18);
					dec();
					}
					}
					setState(21); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TYPE );
				}
				break;
			case LBrace:
				{
				setState(23);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(26);
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
	public static class DecContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CourseWorkParser.TYPE, 0); }
		public TerminalNode IDFR() { return getToken(CourseWorkParser.IDFR, 0); }
		public TerminalNode LParen() { return getToken(CourseWorkParser.LParen, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode RParen() { return getToken(CourseWorkParser.RParen, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(TYPE);
			setState(29);
			match(IDFR);
			setState(30);
			match(LParen);
			setState(31);
			vardec();
			setState(32);
			match(RParen);
			setState(33);
			body();
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
	public static class VardecContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(CourseWorkParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CourseWorkParser.TYPE, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(CourseWorkParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(CourseWorkParser.IDFR, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CourseWorkParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CourseWorkParser.Comma, i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(35);
				match(TYPE);
				setState(36);
				match(IDFR);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(37);
					match(Comma);
					setState(38);
					match(TYPE);
					setState(39);
					match(IDFR);
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Token IDFR;
		public List<Token> localvar = new ArrayList<Token>();
		public ExprContext expr;
		public List<ExprContext> localvarexpr = new ArrayList<ExprContext>();
		public TerminalNode LBrace() { return getToken(CourseWorkParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(CourseWorkParser.RBrace, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CourseWorkParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CourseWorkParser.TYPE, i);
		}
		public List<TerminalNode> Assign() { return getTokens(CourseWorkParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(CourseWorkParser.Assign, i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(CourseWorkParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(CourseWorkParser.Semicolon, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(CourseWorkParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(CourseWorkParser.IDFR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(LBrace);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(48);
				match(TYPE);
				setState(49);
				((BodyContext)_localctx).IDFR = match(IDFR);
				((BodyContext)_localctx).localvar.add(((BodyContext)_localctx).IDFR);
				setState(50);
				match(Assign);
				setState(51);
				((BodyContext)_localctx).expr = expr();
				((BodyContext)_localctx).localvarexpr.add(((BodyContext)_localctx).expr);
				setState(52);
				match(Semicolon);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			ene();
			setState(60);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(CourseWorkParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(CourseWorkParser.RBrace, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBrace);
			setState(63);
			ene();
			setState(64);
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
	public static class EneContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(CourseWorkParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(CourseWorkParser.Semicolon, i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			expr();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(67);
				match(Semicolon);
				setState(68);
				expr();
				}
				}
				setState(73);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegersContext extends ExprContext {
		public TerminalNode INTLIT() { return getToken(CourseWorkParser.INTLIT, 0); }
		public IntegersContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterIntegers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitIntegers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitIntegers(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpaceContext extends ExprContext {
		public SpaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDFRargsContext extends ExprContext {
		public TerminalNode IDFR() { return getToken(CourseWorkParser.IDFR, 0); }
		public TerminalNode LParen() { return getToken(CourseWorkParser.LParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RParen() { return getToken(CourseWorkParser.RParen, 0); }
		public IDFRargsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterIDFRargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitIDFRargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitIDFArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IFThenElseContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IFThenElseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterIFThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitIFThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitIFThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewlineContext extends ExprContext {
		public NewlineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileDoContext extends ExprContext {
		public TerminalNode While() { return getToken(CourseWorkParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(CourseWorkParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileDoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterWhileDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitWhileDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitWhileDo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BOOLEANContext extends ExprContext {
		public TerminalNode BOOLLIT() { return getToken(CourseWorkParser.BOOLLIT, 0); }
		public BOOLEANContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExprContext {
		public TerminalNode IDFR() { return getToken(CourseWorkParser.IDFR, 0); }
		public TerminalNode Assign() { return getToken(CourseWorkParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatUntilContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatUntilContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterRepeatUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitRepeatUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitRepeatUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EXPRBlockContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EXPRBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterEXPRBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitEXPRBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitEXPRBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ExprContext {
		public SkipContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpExprContext extends ExprContext {
		public TerminalNode LParen() { return getToken(CourseWorkParser.LParen, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(CourseWorkParser.RParen, 0); }
		public BinOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitBinOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiersContext extends ExprContext {
		public TerminalNode IDFR() { return getToken(CourseWorkParser.IDFR, 0); }
		public IdentifiersContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IdentifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(IDFR);
				}
				break;
			case 2:
				_localctx = new IntegersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(INTLIT);
				}
				break;
			case 3:
				_localctx = new BOOLEANContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(BOOLLIT);
				}
				break;
			case 4:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(IDFR);
				setState(78);
				match(Assign);
				setState(79);
				expr();
				}
				break;
			case 5:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(LParen);
				setState(81);
				expr();
				setState(82);
				binop();
				setState(83);
				expr();
				setState(84);
				match(RParen);
				}
				break;
			case 6:
				_localctx = new IDFRargsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(IDFR);
				setState(87);
				match(LParen);
				setState(88);
				args();
				setState(89);
				match(RParen);
				}
				break;
			case 7:
				_localctx = new EXPRBlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				block();
				}
				break;
			case 8:
				_localctx = new IFThenElseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				match(T__0);
				setState(93);
				expr();
				setState(94);
				match(T__1);
				setState(95);
				block();
				setState(96);
				match(T__2);
				setState(97);
				block();
				}
				break;
			case 9:
				_localctx = new WhileDoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				match(While);
				setState(100);
				expr();
				setState(101);
				match(Do);
				setState(102);
				block();
				}
				break;
			case 10:
				_localctx = new RepeatUntilContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				match(T__3);
				setState(105);
				block();
				setState(106);
				match(T__4);
				setState(107);
				expr();
				}
				break;
			case 11:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(109);
				match(T__5);
				setState(110);
				expr();
				}
				break;
			case 12:
				_localctx = new SpaceContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(111);
				match(T__6);
				}
				break;
			case 13:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(112);
				match(T__7);
				}
				break;
			case 14:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(113);
				match(T__8);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CourseWorkParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CourseWorkParser.Comma, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(CourseWorkParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(CourseWorkParser.IDFR, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 60666432466L) != 0) {
				{
				setState(116);
				expr();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma || _la==IDFR) {
					{
					setState(120);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Comma:
						{
						setState(117);
						match(Comma);
						setState(118);
						expr();
						}
						break;
					case IDFR:
						{
						setState(119);
						match(IDFR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Quality() { return getToken(CourseWorkParser.Quality, 0); }
		public TerminalNode Less() { return getToken(CourseWorkParser.Less, 0); }
		public TerminalNode More() { return getToken(CourseWorkParser.More, 0); }
		public TerminalNode LessEq() { return getToken(CourseWorkParser.LessEq, 0); }
		public TerminalNode MoreEq() { return getToken(CourseWorkParser.MoreEq, 0); }
		public TerminalNode Plus() { return getToken(CourseWorkParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CourseWorkParser.Minus, 0); }
		public TerminalNode Times() { return getToken(CourseWorkParser.Times, 0); }
		public TerminalNode Divide() { return getToken(CourseWorkParser.Divide, 0); }
		public TerminalNode And() { return getToken(CourseWorkParser.And, 0); }
		public TerminalNode LogicalOr() { return getToken(CourseWorkParser.LogicalOr, 0); }
		public TerminalNode Xor() { return getToken(CourseWorkParser.Xor, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CourseWorkListener ) ((CourseWorkListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CourseWorkVisitor ) return ((CourseWorkVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 268305408L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001%\u0082\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		")\b\u0002\n\u0002\f\u0002,\t\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00037\b\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007y\b\u0007\n\u0007"+
		"\f\u0007|\t\u0007\u0003\u0007~\b\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0002\u0000\n"+
		"\n\u0011\u001b\u008e\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001c\u0001"+
		"\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000"+
		"\u0000\b>\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000"+
		"\u0000\u0000\u0017\u0019\u0003\u0006\u0003\u0000\u0018\u0013\u0001\u0000"+
		"\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005 \u0000\u0000\u001d\u001e\u0005!\u0000\u0000"+
		"\u001e\u001f\u0005\u000b\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !"+
		"\u0005\r\u0000\u0000!\"\u0003\u0006\u0003\u0000\"\u0003\u0001\u0000\u0000"+
		"\u0000#$\u0005 \u0000\u0000$*\u0005!\u0000\u0000%&\u0005\f\u0000\u0000"+
		"&\'\u0005 \u0000\u0000\')\u0005!\u0000\u0000(%\u0001\u0000\u0000\u0000"+
		"),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-#\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000\u0000"+
		"/8\u0005\u000e\u0000\u000001\u0005 \u0000\u000012\u0005!\u0000\u00002"+
		"3\u0005\u001c\u0000\u000034\u0003\f\u0006\u000045\u0005\u000f\u0000\u0000"+
		"57\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u00007:\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005\u0010"+
		"\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u000e\u0000\u0000"+
		"?@\u0003\n\u0005\u0000@A\u0005\u0010\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000BG\u0003\f\u0006\u0000CD\u0005\u000f\u0000\u0000DF\u0003\f\u0006"+
		"\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u000b\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000Js\u0005!\u0000\u0000Ks\u0005\"\u0000\u0000"+
		"Ls\u0005#\u0000\u0000MN\u0005!\u0000\u0000NO\u0005\u001c\u0000\u0000O"+
		"s\u0003\f\u0006\u0000PQ\u0005\u000b\u0000\u0000QR\u0003\f\u0006\u0000"+
		"RS\u0003\u0010\b\u0000ST\u0003\f\u0006\u0000TU\u0005\r\u0000\u0000Us\u0001"+
		"\u0000\u0000\u0000VW\u0005!\u0000\u0000WX\u0005\u000b\u0000\u0000XY\u0003"+
		"\u000e\u0007\u0000YZ\u0005\r\u0000\u0000Zs\u0001\u0000\u0000\u0000[s\u0003"+
		"\b\u0004\u0000\\]\u0005\u0001\u0000\u0000]^\u0003\f\u0006\u0000^_\u0005"+
		"\u0002\u0000\u0000_`\u0003\b\u0004\u0000`a\u0005\u0003\u0000\u0000ab\u0003"+
		"\b\u0004\u0000bs\u0001\u0000\u0000\u0000cd\u0005\u001d\u0000\u0000de\u0003"+
		"\f\u0006\u0000ef\u0005\u001e\u0000\u0000fg\u0003\b\u0004\u0000gs\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0004\u0000\u0000ij\u0003\b\u0004\u0000jk\u0005"+
		"\u0005\u0000\u0000kl\u0003\f\u0006\u0000ls\u0001\u0000\u0000\u0000mn\u0005"+
		"\u0006\u0000\u0000ns\u0003\f\u0006\u0000os\u0005\u0007\u0000\u0000ps\u0005"+
		"\b\u0000\u0000qs\u0005\t\u0000\u0000rJ\u0001\u0000\u0000\u0000rK\u0001"+
		"\u0000\u0000\u0000rL\u0001\u0000\u0000\u0000rM\u0001\u0000\u0000\u0000"+
		"rP\u0001\u0000\u0000\u0000rV\u0001\u0000\u0000\u0000r[\u0001\u0000\u0000"+
		"\u0000r\\\u0001\u0000\u0000\u0000rc\u0001\u0000\u0000\u0000rh\u0001\u0000"+
		"\u0000\u0000rm\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000"+
		"tz\u0003\f\u0006\u0000uv\u0005\f\u0000\u0000vy\u0003\f\u0006\u0000wy\u0005"+
		"!\u0000\u0000xu\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}t\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0007\u0000\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000\n\u0015"+
		"\u0018*-8Grxz}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}