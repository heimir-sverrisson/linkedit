// Generated from /home/heimir/workspace/linkedit/src/main/antlr4/com/coolprimes/linkedit/LinkGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinkGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MemoryType=12, Whitespace=13, Newline=14, BlockComment=15, 
		LineComment=16, HexInt=17, Retain=18, Name=19, ErrorCharacter=20;
	public static final int
		RULE_spec = 0, RULE_memoryList = 1, RULE_memoryArea = 2, RULE_sectionList = 3, 
		RULE_expr = 4, RULE_termOperator = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"spec", "memoryList", "memoryArea", "sectionList", "expr", "termOperator"
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

	@Override
	public String getGrammarFileName() { return "LinkGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinkGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecContext extends ParserRuleContext {
		public MemoryListContext memoryList() {
			return getRuleContext(MemoryListContext.class,0);
		}
		public SectionListContext sectionList() {
			return getRuleContext(SectionListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LinkGrammarParser.EOF, 0); }
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				memoryList();
				setState(13);
				sectionList();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(EOF);
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

	public static class MemoryListContext extends ParserRuleContext {
		public List<MemoryAreaContext> memoryArea() {
			return getRuleContexts(MemoryAreaContext.class);
		}
		public MemoryAreaContext memoryArea(int i) {
			return getRuleContext(MemoryAreaContext.class,i);
		}
		public MemoryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryList; }
	}

	public final MemoryListContext memoryList() throws RecognitionException {
		MemoryListContext _localctx = new MemoryListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_memoryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(T__1);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(20);
				memoryArea();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(T__2);
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

	public static class MemoryAreaContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LinkGrammarParser.Name, 0); }
		public TerminalNode MemoryType() { return getToken(LinkGrammarParser.MemoryType, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MemoryAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryArea; }
	}

	public final MemoryAreaContext memoryArea() throws RecognitionException {
		MemoryAreaContext _localctx = new MemoryAreaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_memoryArea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(Name);
			setState(29);
			match(MemoryType);
			setState(30);
			match(T__3);
			setState(31);
			match(T__4);
			setState(32);
			expr(0);
			setState(33);
			match(T__5);
			setState(34);
			expr(0);
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

	public static class SectionListContext extends ParserRuleContext {
		public SectionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionList; }
	}

	public final SectionListContext sectionList() throws RecognitionException {
		SectionListContext _localctx = new SectionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sectionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__6);
			setState(37);
			match(T__1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(38);
					matchWildcard();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(44);
			match(T__2);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode HexInt() { return getToken(LinkGrammarParser.HexInt, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TermOperatorContext termOperator() {
			return getRuleContext(TermOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HexInt:
				{
				setState(47);
				match(HexInt);
				}
				break;
			case T__7:
				{
				setState(48);
				match(T__7);
				setState(49);
				expr(0);
				setState(50);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(54);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(55);
					termOperator();
					setState(56);
					expr(4);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TermOperatorContext extends ParserRuleContext {
		public TermOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termOperator; }
	}

	public final TermOperatorContext termOperator() throws RecognitionException {
		TermOperatorContext _localctx = new TermOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_termOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\67\n\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3+\3\n"+
		"\b\2\4\6\b\n\f\2\3\3\2\f\r\2B\2\22\3\2\2\2\4\24\3\2\2\2\6\36\3\2\2\2\b"+
		"&\3\2\2\2\n\66\3\2\2\2\fA\3\2\2\2\16\17\5\4\3\2\17\20\5\b\5\2\20\23\3"+
		"\2\2\2\21\23\7\2\2\3\22\16\3\2\2\2\22\21\3\2\2\2\23\3\3\2\2\2\24\25\7"+
		"\3\2\2\25\31\7\4\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\5\2\2\35\5\3"+
		"\2\2\2\36\37\7\25\2\2\37 \7\16\2\2 !\7\6\2\2!\"\7\7\2\2\"#\5\n\6\2#$\7"+
		"\b\2\2$%\5\n\6\2%\7\3\2\2\2&\'\7\t\2\2\'+\7\4\2\2(*\13\2\2\2)(\3\2\2\2"+
		"*-\3\2\2\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\5\2\2/\t\3\2\2"+
		"\2\60\61\b\6\1\2\61\67\7\23\2\2\62\63\7\n\2\2\63\64\5\n\6\2\64\65\7\13"+
		"\2\2\65\67\3\2\2\2\66\60\3\2\2\2\66\62\3\2\2\2\67>\3\2\2\289\f\5\2\29"+
		":\5\f\7\2:;\5\n\6\6;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\13\3\2\2\2@>\3\2\2\2AB\t\2\2\2B\r\3\2\2\2\7\22\31+\66>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}