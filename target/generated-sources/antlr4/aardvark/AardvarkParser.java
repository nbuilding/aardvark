// Generated from Aardvark.g4 by ANTLR 4.9

    package aardvark;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AardvarkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PUBLIC=11, IMPORT=12, MODULE=13, SEMI=14, HASH=15, LBRACE=16, 
		RBRACE=17, LBRACKET=18, RBRACKET=19, SLASH=20, STAR=21, COLON=22, MUTABLE=23, 
		COMMA=24, DQUOTE=25, PLUS=26, INTEGER=27, Identifier=28, WS=29;
	public static final int
		RULE_compilationUnit = 0, RULE_moduleDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_declarationFunction = 3, RULE_functionDeclarationArguments = 4, RULE_declarationVariable = 5, 
		RULE_functionCallParameters = 6, RULE_functionCall = 7, RULE_importName = 8, 
		RULE_moduleName = 9, RULE_fileName = 10, RULE_type = 11, RULE_variableName = 12, 
		RULE_typeAnnotation = 13, RULE_string = 14, RULE_value = 15, RULE_expression = 16, 
		RULE_returnExpression = 17, RULE_for_statement = 18, RULE_declaration = 19, 
		RULE_statement = 20, RULE_structDefinition = 21, RULE_structInstantiation = 22, 
		RULE_structImplementation = 23, RULE_predicateOperator = 24, RULE_predicate = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "moduleDeclaration", "importDeclaration", "declarationFunction", 
			"functionDeclarationArguments", "declarationVariable", "functionCallParameters", 
			"functionCall", "importName", "moduleName", "fileName", "type", "variableName", 
			"typeAnnotation", "string", "value", "expression", "returnExpression", 
			"for_statement", "declaration", "statement", "structDefinition", "structInstantiation", 
			"structImplementation", "predicateOperator", "predicate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'return'", "'for'", "'struct'", "'impl'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'public'", "'import'", "'module'", "';'", "'#'", 
			"'{'", "'}'", "'('", "')'", "'/'", "'*'", "':'", "'mut'", "','", "'\"'", 
			"'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PUBLIC", 
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

	@Override
	public String getGrammarFileName() { return "Aardvark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AardvarkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(52);
				importDeclaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODULE) {
				{
				setState(58);
				moduleDeclaration();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(61);
				declaration();
				setState(62);
				match(SEMI);
				}
				}
				setState(68);
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

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(AardvarkParser.MODULE, 0); }
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AardvarkParser.SEMI, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(MODULE);
			setState(70);
			moduleName();
			setState(71);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AardvarkParser.IMPORT, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AardvarkParser.SEMI, 0); }
		public TerminalNode HASH() { return getToken(AardvarkParser.HASH, 0); }
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IMPORT);
			setState(74);
			fileName();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(75);
				match(HASH);
				setState(76);
				importName();
				}
			}

			setState(79);
			match(SEMI);
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

	public static class DeclarationFunctionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public FunctionDeclarationArgumentsContext functionDeclarationArguments() {
			return getRuleContext(FunctionDeclarationArgumentsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public TerminalNode PUBLIC() { return getToken(AardvarkParser.PUBLIC, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
		}
		public DeclarationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterDeclarationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitDeclarationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitDeclarationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationFunctionContext declarationFunction() throws RecognitionException {
		DeclarationFunctionContext _localctx = new DeclarationFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(81);
				match(PUBLIC);
				}
			}

			setState(84);
			match(Identifier);
			setState(85);
			functionDeclarationArguments();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(86);
				typeAnnotation();
				}
			}

			setState(89);
			match(LBRACE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(90);
				statement();
				setState(91);
				match(SEMI);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(RBRACE);
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

	public static class FunctionDeclarationArgumentsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(AardvarkParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AardvarkParser.RBRACKET, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TypeAnnotationContext> typeAnnotation() {
			return getRuleContexts(TypeAnnotationContext.class);
		}
		public TypeAnnotationContext typeAnnotation(int i) {
			return getRuleContext(TypeAnnotationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AardvarkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AardvarkParser.COMMA, i);
		}
		public FunctionDeclarationArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterFunctionDeclarationArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitFunctionDeclarationArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitFunctionDeclarationArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationArgumentsContext functionDeclarationArguments() throws RecognitionException {
		FunctionDeclarationArgumentsContext _localctx = new FunctionDeclarationArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclarationArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			match(LBRACKET);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				{
				setState(101);
				variableName();
				setState(102);
				typeAnnotation();
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					{
					setState(105);
					variableName();
					setState(106);
					typeAnnotation();
					}
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(115);
			match(RBRACKET);
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

	public static class DeclarationVariableContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AardvarkParser.PUBLIC, 0); }
		public TerminalNode MUTABLE() { return getToken(AardvarkParser.MUTABLE, 0); }
		public DeclarationVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterDeclarationVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitDeclarationVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitDeclarationVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationVariableContext declarationVariable() throws RecognitionException {
		DeclarationVariableContext _localctx = new DeclarationVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==MUTABLE) {
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==MUTABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(120);
			variableName();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(121);
				typeAnnotation();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(124);
				match(T__0);
				setState(125);
				expression();
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

	public static class FunctionCallParametersContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(AardvarkParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AardvarkParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AardvarkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AardvarkParser.COMMA, i);
		}
		public FunctionCallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterFunctionCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitFunctionCallParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitFunctionCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParametersContext functionCallParameters() throws RecognitionException {
		FunctionCallParametersContext _localctx = new FunctionCallParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCallParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LBRACKET);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DQUOTE) | (1L << INTEGER) | (1L << Identifier))) != 0)) {
				{
				setState(129);
				expression();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(130);
					match(COMMA);
					setState(131);
					expression();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(139);
			match(RBRACKET);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public FunctionCallParametersContext functionCallParameters() {
			return getRuleContext(FunctionCallParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Identifier);
			setState(142);
			functionCallParameters();
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

	public static class ImportNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public TerminalNode STAR() { return getToken(AardvarkParser.STAR, 0); }
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==Identifier) ) {
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

	public static class ModuleNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Identifier);
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

	public static class FileNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AardvarkParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AardvarkParser.Identifier, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(AardvarkParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AardvarkParser.SLASH, i);
		}
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fileName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Identifier);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(149);
				match(SLASH);
				setState(150);
				match(Identifier);
				}
				}
				setState(155);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(Identifier);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Identifier);
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

	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AardvarkParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(COLON);
			setState(161);
			type();
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
		public List<TerminalNode> DQUOTE() { return getTokens(AardvarkParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AardvarkParser.DQUOTE, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DQUOTE);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << PUBLIC) | (1L << IMPORT) | (1L << MODULE) | (1L << SEMI) | (1L << HASH) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << SLASH) | (1L << STAR) | (1L << COLON) | (1L << MUTABLE) | (1L << COMMA) | (1L << PLUS) | (1L << INTEGER) | (1L << Identifier) | (1L << WS))) != 0)) {
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DQUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(DQUOTE);
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

	public static class ValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(AardvarkParser.INTEGER, 0); }
		public StructInstantiationContext structInstantiation() {
			return getRuleContext(StructInstantiationContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(INTEGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				structInstantiation();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				predicate();
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__1);
			setState(184);
			expression();
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
		public TerminalNode LBRACKET() { return getToken(AardvarkParser.LBRACKET, 0); }
		public DeclarationVariableContext declarationVariable() {
			return getRuleContext(DeclarationVariableContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(AardvarkParser.RBRACKET, 0); }
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__2);
			setState(187);
			match(LBRACKET);
			setState(188);
			declarationVariable();
			setState(189);
			match(SEMI);
			setState(190);
			expression();
			setState(191);
			match(SEMI);
			setState(192);
			statement();
			setState(193);
			match(RBRACKET);
			setState(194);
			match(LBRACE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(195);
				statement();
				setState(196);
				match(SEMI);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(RBRACE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationVariableContext declarationVariable() {
			return getRuleContext(DeclarationVariableContext.class,0);
		}
		public DeclarationFunctionContext declarationFunction() {
			return getRuleContext(DeclarationFunctionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public StructImplementationContext structImplementation() {
			return getRuleContext(StructImplementationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(205);
				declarationVariable();
				}
				break;
			case 2:
				{
				setState(206);
				declarationFunction();
				}
				break;
			case 3:
				{
				setState(207);
				structDefinition();
				}
				break;
			case 4:
				{
				setState(208);
				structImplementation();
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(211);
				declaration();
				}
				break;
			case 2:
				{
				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(212);
					functionCall();
					}
					break;
				case T__1:
					{
					setState(213);
					returnExpression();
					}
					break;
				case T__2:
					{
					setState(214);
					for_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TypeAnnotationContext> typeAnnotation() {
			return getRuleContexts(TypeAnnotationContext.class);
		}
		public TypeAnnotationContext typeAnnotation(int i) {
			return getRuleContext(TypeAnnotationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AardvarkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AardvarkParser.COMMA, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(AardvarkParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(AardvarkParser.PUBLIC, i);
		}
		public List<TerminalNode> MUTABLE() { return getTokens(AardvarkParser.MUTABLE); }
		public TerminalNode MUTABLE(int i) {
			return getToken(AardvarkParser.MUTABLE, i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__3);
			setState(220);
			match(Identifier);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(221);
				match(LBRACE);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
					{
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==MUTABLE) {
						{
						setState(222);
						_la = _input.LA(1);
						if ( !(_la==PUBLIC || _la==MUTABLE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(225);
					variableName();
					setState(226);
					typeAnnotation();
					}
				}

				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230);
					match(COMMA);
					{
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==MUTABLE) {
						{
						setState(231);
						_la = _input.LA(1);
						if ( !(_la==PUBLIC || _la==MUTABLE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(234);
					variableName();
					setState(235);
					typeAnnotation();
					}
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(RBRACE);
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

	public static class StructInstantiationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AardvarkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AardvarkParser.COMMA, i);
		}
		public StructInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterStructInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitStructInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitStructInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructInstantiationContext structInstantiation() throws RecognitionException {
		StructInstantiationContext _localctx = new StructInstantiationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_structInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Identifier);
			setState(246);
			match(LBRACE);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(247);
				variableName();
				setState(248);
				match(T__0);
				setState(249);
				expression();
				}
			}

			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				variableName();
				setState(255);
				match(T__0);
				setState(256);
				expression();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(RBRACE);
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

	public static class StructImplementationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
		}
		public List<DeclarationFunctionContext> declarationFunction() {
			return getRuleContexts(DeclarationFunctionContext.class);
		}
		public DeclarationFunctionContext declarationFunction(int i) {
			return getRuleContext(DeclarationFunctionContext.class,i);
		}
		public StructImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterStructImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitStructImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitStructImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructImplementationContext structImplementation() throws RecognitionException {
		StructImplementationContext _localctx = new StructImplementationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__4);
			setState(266);
			match(Identifier);
			setState(267);
			typeAnnotation();
			setState(268);
			match(LBRACE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==Identifier) {
				{
				{
				setState(269);
				declarationFunction();
				setState(270);
				match(SEMI);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(RBRACE);
			setState(278);
			match(SEMI);
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class PredicateContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			value();
			setState(283);
			predicateOperator();
			setState(284);
			value();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0121\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\5\2>\n\2\3\2\3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4P\n\4"+
		"\3\4\3\4\3\5\5\5U\n\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\7\5`\n\5\f"+
		"\5\16\5c\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16"+
		"\6r\13\6\5\6t\n\6\3\6\3\6\3\7\5\7y\n\7\3\7\3\7\5\7}\n\7\3\7\3\7\5\7\u0081"+
		"\n\7\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\5\b\u008c\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\f\u009a\n\f\f\f\16"+
		"\f\u009d\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\7\20\u00a8\n"+
		"\20\f\20\16\20\u00ab\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00b4"+
		"\n\21\3\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00c9\n\24\f\24\16\24\u00cc\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00d4\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u00da\n\26\5\26\u00dc\n\26\3\27\3\27\3\27\3\27\5\27\u00e2\n\27\3"+
		"\27\3\27\3\27\5\27\u00e7\n\27\3\27\3\27\5\27\u00eb\n\27\3\27\3\27\3\27"+
		"\7\27\u00f0\n\27\f\27\16\27\u00f3\13\27\3\27\5\27\u00f6\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00fe\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u0105"+
		"\n\30\f\30\16\30\u0108\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\7\31\u0113\n\31\f\31\16\31\u0116\13\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\6\4\2\r\r\31\31\4\2\27\27\36\36\3\2\33\33\3\2\b\f"+
		"\2\u012a\29\3\2\2\2\4G\3\2\2\2\6K\3\2\2\2\bT\3\2\2\2\nf\3\2\2\2\fx\3\2"+
		"\2\2\16\u0082\3\2\2\2\20\u008f\3\2\2\2\22\u0092\3\2\2\2\24\u0094\3\2\2"+
		"\2\26\u0096\3\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a2\3\2\2\2"+
		"\36\u00a5\3\2\2\2 \u00b3\3\2\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00bc"+
		"\3\2\2\2(\u00d3\3\2\2\2*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00f7\3\2\2\2\60"+
		"\u010b\3\2\2\2\62\u011a\3\2\2\2\64\u011c\3\2\2\2\668\5\6\4\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3"+
		"\2\2\2=>\3\2\2\2>D\3\2\2\2?@\5(\25\2@A\7\20\2\2AC\3\2\2\2B?\3\2\2\2CF"+
		"\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FD\3\2\2\2GH\7\17\2\2HI\5\24\13"+
		"\2IJ\7\20\2\2J\5\3\2\2\2KL\7\16\2\2LO\5\26\f\2MN\7\21\2\2NP\5\22\n\2O"+
		"M\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\20\2\2R\7\3\2\2\2SU\7\r\2\2TS\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\7\36\2\2WY\5\n\6\2XZ\5\34\17\2YX\3\2\2\2YZ\3"+
		"\2\2\2Z[\3\2\2\2[a\7\22\2\2\\]\5*\26\2]^\7\20\2\2^`\3\2\2\2_\\\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\23\2\2e\t\3\2\2"+
		"\2fs\7\24\2\2gh\5\32\16\2hi\5\34\17\2ip\3\2\2\2jk\7\32\2\2kl\5\32\16\2"+
		"lm\5\34\17\2mo\3\2\2\2nj\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2sg\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\25\2\2v\13\3\2\2\2wy\t"+
		"\2\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\5\32\16\2{}\5\34\17\2|{\3\2\2\2"+
		"|}\3\2\2\2}\u0080\3\2\2\2~\177\7\3\2\2\177\u0081\5\"\22\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u008b\7\24\2\2\u0083\u0088"+
		"\5\"\22\2\u0084\u0085\7\32\2\2\u0085\u0087\5\"\22\2\u0086\u0084\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\7\25\2\2\u008e\17\3\2\2\2\u008f\u0090\7\36"+
		"\2\2\u0090\u0091\5\16\b\2\u0091\21\3\2\2\2\u0092\u0093\t\3\2\2\u0093\23"+
		"\3\2\2\2\u0094\u0095\7\36\2\2\u0095\25\3\2\2\2\u0096\u009b\7\36\2\2\u0097"+
		"\u0098\7\26\2\2\u0098\u009a\7\36\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\36\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\36"+
		"\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\5\30\r\2\u00a4"+
		"\35\3\2\2\2\u00a5\u00a9\7\33\2\2\u00a6\u00a8\n\4\2\2\u00a7\u00a6\3\2\2"+
		"\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad\37\3\2\2\2\u00ae"+
		"\u00b4\5\36\20\2\u00af\u00b4\5\32\16\2\u00b0\u00b4\5\20\t\2\u00b1\u00b4"+
		"\7\35\2\2\u00b2\u00b4\5.\30\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2"+
		"\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4!\3"+
		"\2\2\2\u00b5\u00b8\5 \21\2\u00b6\u00b8\5\64\33\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\5\"\22\2"+
		"\u00bb%\3\2\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00be\7\24\2\2\u00be\u00bf\5"+
		"\f\7\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\20\2\2"+
		"\u00c2\u00c3\5*\26\2\u00c3\u00c4\7\25\2\2\u00c4\u00ca\7\22\2\2\u00c5\u00c6"+
		"\5*\26\2\u00c6\u00c7\7\20\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\23\2\2\u00ce\'\3\2\2\2\u00cf"+
		"\u00d4\5\f\7\2\u00d0\u00d4\5\b\5\2\u00d1\u00d4\5,\27\2\u00d2\u00d4\5\60"+
		"\31\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4)\3\2\2\2\u00d5\u00dc\5(\25\2\u00d6\u00da\5\20\t\2"+
		"\u00d7\u00da\5$\23\2\u00d8\u00da\5&\24\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00de\7\6\2\2\u00de\u00f5\7\36\2\2"+
		"\u00df\u00e6\7\22\2\2\u00e0\u00e2\t\2\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\32\16\2\u00e4\u00e5\5\34\17"+
		"\2\u00e5\u00e7\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f1"+
		"\3\2\2\2\u00e8\u00ea\7\32\2\2\u00e9\u00eb\t\2\2\2\u00ea\u00e9\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee"+
		"\5\34\17\2\u00ee\u00f0\3\2\2\2\u00ef\u00e8\3\2\2\2\u00f0\u00f3\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f6\7\23\2\2\u00f5\u00df\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6-\3\2\2\2\u00f7\u00f8\7\36\2\2\u00f8\u00fd\7\22\2\2\u00f9\u00fa"+
		"\5\32\16\2\u00fa\u00fb\7\3\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fe\3\2\2"+
		"\2\u00fd\u00f9\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0106\3\2\2\2\u00ff\u0100"+
		"\7\32\2\2\u0100\u0101\5\32\16\2\u0101\u0102\7\3\2\2\u0102\u0103\5\"\22"+
		"\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\23\2\2\u010a/\3\2\2\2\u010b\u010c\7\7\2\2\u010c\u010d\7\36\2"+
		"\2\u010d\u010e\5\34\17\2\u010e\u0114\7\22\2\2\u010f\u0110\5\b\5\2\u0110"+
		"\u0111\7\20\2\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7\23\2\2\u0118\u0119\7\20\2\2\u0119\61\3\2"+
		"\2\2\u011a\u011b\t\5\2\2\u011b\63\3\2\2\2\u011c\u011d\5 \21\2\u011d\u011e"+
		"\5\62\32\2\u011e\u011f\5 \21\2\u011f\65\3\2\2\2 9=DOTYapsx|\u0080\u0088"+
		"\u008b\u009b\u00a9\u00b3\u00b7\u00ca\u00d3\u00d9\u00db\u00e1\u00e6\u00ea"+
		"\u00f1\u00f5\u00fd\u0106\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}