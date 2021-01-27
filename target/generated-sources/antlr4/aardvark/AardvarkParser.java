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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PUBLIC=16, 
		IMPORT=17, MODULE=18, SEMI=19, HASH=20, LBRACE=21, RBRACE=22, LBRACKET=23, 
		RBRACKET=24, SLASH=25, STAR=26, COLON=27, MUTABLE=28, COMMA=29, DQUOTE=30, 
		PLUS=31, INTEGER=32, Identifier=33, WS=34;
	public static final int
		RULE_compilationUnit = 0, RULE_moduleDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_declarationFunctionStub = 3, RULE_declarationFunction = 4, RULE_functionDeclarationArguments = 5, 
		RULE_declarationVariable = 6, RULE_functionCallParameters = 7, RULE_functionCall = 8, 
		RULE_importName = 9, RULE_moduleName = 10, RULE_fileName = 11, RULE_type = 12, 
		RULE_variableRef = 13, RULE_variableName = 14, RULE_typeAnnotation = 15, 
		RULE_string = 16, RULE_value = 17, RULE_expression = 18, RULE_returnExpression = 19, 
		RULE_for_statement = 20, RULE_declaration = 21, RULE_statement = 22, RULE_structDefinition = 23, 
		RULE_structInstantiation = 24, RULE_structImplementation = 25, RULE_contractDefinition = 26, 
		RULE_predicateOperator = 27, RULE_predicate = 28, RULE_infixOperator = 29, 
		RULE_infixOperation = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "moduleDeclaration", "importDeclaration", "declarationFunctionStub", 
			"declarationFunction", "functionDeclarationArguments", "declarationVariable", 
			"functionCallParameters", "functionCall", "importName", "moduleName", 
			"fileName", "type", "variableRef", "variableName", "typeAnnotation", 
			"string", "value", "expression", "returnExpression", "for_statement", 
			"declaration", "statement", "structDefinition", "structInstantiation", 
			"structImplementation", "contractDefinition", "predicateOperator", "predicate", 
			"infixOperator", "infixOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'.'", "'return'", "'for'", "'struct'", "'impl'", "'contract'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'-'", "'^'", "'public'", 
			"'import'", "'module'", "';'", "'#'", "'{'", "'}'", "'('", "')'", "'/'", 
			"'*'", "':'", "'mut'", "','", "'\"'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PUBLIC", "IMPORT", "MODULE", "SEMI", "HASH", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SLASH", "STAR", "COLON", 
			"MUTABLE", "COMMA", "DQUOTE", "PLUS", "INTEGER", "Identifier", "WS"
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(62);
				importDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODULE) {
				{
				setState(68);
				moduleDeclaration();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(71);
				declaration();
				setState(72);
				match(SEMI);
				}
				}
				setState(78);
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
			setState(79);
			match(MODULE);
			setState(80);
			moduleName();
			setState(81);
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
			setState(83);
			match(IMPORT);
			setState(84);
			fileName();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(85);
				match(HASH);
				setState(86);
				importName();
				}
			}

			setState(89);
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

	public static class DeclarationFunctionStubContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public FunctionDeclarationArgumentsContext functionDeclarationArguments() {
			return getRuleContext(FunctionDeclarationArgumentsContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AardvarkParser.PUBLIC, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public DeclarationFunctionStubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationFunctionStub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterDeclarationFunctionStub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitDeclarationFunctionStub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitDeclarationFunctionStub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationFunctionStubContext declarationFunctionStub() throws RecognitionException {
		DeclarationFunctionStubContext _localctx = new DeclarationFunctionStubContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationFunctionStub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(91);
				match(PUBLIC);
				}
			}

			setState(94);
			match(Identifier);
			setState(95);
			functionDeclarationArguments();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(96);
				typeAnnotation();
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
		enterRule(_localctx, 8, RULE_declarationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(99);
				match(PUBLIC);
				}
			}

			setState(102);
			match(Identifier);
			setState(103);
			functionDeclarationArguments();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(104);
				typeAnnotation();
				}
			}

			setState(107);
			match(LBRACE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(108);
				statement();
				setState(109);
				match(SEMI);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		enterRule(_localctx, 10, RULE_functionDeclarationArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			match(LBRACKET);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				{
				setState(119);
				variableName();
				setState(120);
				typeAnnotation();
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					{
					setState(123);
					variableName();
					setState(124);
					typeAnnotation();
					}
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
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
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
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
		enterRule(_localctx, 12, RULE_declarationVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==MUTABLE) {
					{
					setState(135);
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

				setState(138);
				variableName();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(139);
					typeAnnotation();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(142);
				variableRef();
				}
				break;
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(145);
				match(T__0);
				setState(146);
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
		enterRule(_localctx, 14, RULE_functionCallParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LBRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DQUOTE) | (1L << INTEGER) | (1L << Identifier))) != 0)) {
				{
				setState(150);
				expression();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					expression();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160);
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
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(Identifier);
			setState(163);
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
		enterRule(_localctx, 18, RULE_importName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 20, RULE_moduleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 22, RULE_fileName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(Identifier);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(170);
				match(SLASH);
				setState(171);
				match(Identifier);
				}
				}
				setState(176);
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
		enterRule(_localctx, 24, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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

	public static class VariableRefContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AardvarkParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AardvarkParser.Identifier, i);
		}
		public VariableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterVariableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitVariableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitVariableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(Identifier);
					setState(180);
					match(T__1);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(186);
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
		enterRule(_localctx, 28, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 30, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(COLON);
			setState(191);
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
		enterRule(_localctx, 32, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(DQUOTE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << PUBLIC) | (1L << IMPORT) | (1L << MODULE) | (1L << SEMI) | (1L << HASH) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << SLASH) | (1L << STAR) | (1L << COLON) | (1L << MUTABLE) | (1L << COMMA) | (1L << PLUS) | (1L << INTEGER) | (1L << Identifier) | (1L << WS))) != 0)) {
				{
				{
				setState(194);
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
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				variableRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				variableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
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
		public InfixOperationContext infixOperation() {
			return getRuleContext(InfixOperationContext.class,0);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				predicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				infixOperation();
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
		enterRule(_localctx, 38, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__2);
			setState(216);
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
		enterRule(_localctx, 40, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__3);
			setState(219);
			match(LBRACKET);
			setState(220);
			declarationVariable();
			setState(221);
			match(SEMI);
			setState(222);
			expression();
			setState(223);
			match(SEMI);
			setState(224);
			statement();
			setState(225);
			match(RBRACKET);
			setState(226);
			match(LBRACE);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(227);
				statement();
				setState(228);
				match(SEMI);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
		public ContractDefinitionContext contractDefinition() {
			return getRuleContext(ContractDefinitionContext.class,0);
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
		enterRule(_localctx, 42, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(237);
				declarationVariable();
				}
				break;
			case 2:
				{
				setState(238);
				declarationFunction();
				}
				break;
			case 3:
				{
				setState(239);
				structDefinition();
				}
				break;
			case 4:
				{
				setState(240);
				structImplementation();
				}
				break;
			case 5:
				{
				setState(241);
				contractDefinition();
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
		enterRule(_localctx, 44, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(244);
				declaration();
				}
				break;
			case 2:
				{
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(245);
					functionCall();
					}
					break;
				case T__2:
					{
					setState(246);
					returnExpression();
					}
					break;
				case T__3:
					{
					setState(247);
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
		enterRule(_localctx, 46, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__4);
			setState(253);
			match(Identifier);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(254);
				match(LBRACE);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
					{
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==MUTABLE) {
						{
						setState(255);
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

					setState(258);
					variableName();
					setState(259);
					typeAnnotation();
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					{
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==MUTABLE) {
						{
						setState(264);
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

					setState(267);
					variableName();
					setState(268);
					typeAnnotation();
					}
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
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
		enterRule(_localctx, 48, RULE_structInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Identifier);
			setState(279);
			match(LBRACE);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(280);
				variableName();
				setState(281);
				match(T__0);
				setState(282);
				expression();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				variableName();
				setState(288);
				match(T__0);
				setState(289);
				expression();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
		public List<DeclarationFunctionContext> declarationFunction() {
			return getRuleContexts(DeclarationFunctionContext.class);
		}
		public DeclarationFunctionContext declarationFunction(int i) {
			return getRuleContext(DeclarationFunctionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
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
		enterRule(_localctx, 50, RULE_structImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__5);
			setState(299);
			match(Identifier);
			setState(300);
			typeAnnotation();
			setState(301);
			match(LBRACE);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==Identifier) {
				{
				{
				setState(302);
				declarationFunction();
				setState(303);
				match(SEMI);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AardvarkParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public List<DeclarationFunctionStubContext> declarationFunctionStub() {
			return getRuleContexts(DeclarationFunctionStubContext.class);
		}
		public DeclarationFunctionStubContext declarationFunctionStub(int i) {
			return getRuleContext(DeclarationFunctionStubContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__6);
			setState(313);
			match(Identifier);
			setState(314);
			match(LBRACE);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==Identifier) {
				{
				{
				setState(315);
				declarationFunctionStub();
				setState(316);
				match(SEMI);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
		enterRule(_localctx, 54, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			value();
			setState(328);
			predicateOperator();
			setState(329);
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

	public static class InfixOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(AardvarkParser.PLUS, 0); }
		public TerminalNode STAR() { return getToken(AardvarkParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(AardvarkParser.SLASH, 0); }
		public InfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterInfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitInfixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitInfixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixOperatorContext infixOperator() throws RecognitionException {
		InfixOperatorContext _localctx = new InfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_infixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << SLASH) | (1L << STAR) | (1L << PLUS))) != 0)) ) {
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

	public static class InfixOperationContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public InfixOperatorContext infixOperator() {
			return getRuleContext(InfixOperatorContext.class,0);
		}
		public InfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterInfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitInfixOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitInfixOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixOperationContext infixOperation() throws RecognitionException {
		InfixOperationContext _localctx = new InfixOperationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_infixOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			value();
			setState(334);
			infixOperator();
			setState(335);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\5\2H\n\2\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\5\5\5_\n\5\3\5\3"+
		"\5\3\5\5\5d\n\5\3\6\5\6g\n\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\7\6"+
		"r\n\6\f\6\16\6u\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081"+
		"\n\7\f\7\16\7\u0084\13\7\5\7\u0086\n\7\3\7\3\7\3\b\5\b\u008b\n\b\3\b\3"+
		"\b\5\b\u008f\n\b\3\b\5\b\u0092\n\b\3\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\3"+
		"\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t\5\t\u00a1\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u00af\n\r\f\r\16\r\u00b2\13\r\3\16"+
		"\3\16\3\17\3\17\7\17\u00b8\n\17\f\17\16\17\u00bb\13\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24"+
		"\5\24\u00d8\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00e9\n\26\f\26\16\26\u00ec\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00f5\n\27\3\30\3\30\3\30\3\30\5\30\u00fb"+
		"\n\30\5\30\u00fd\n\30\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\31\3\31\3"+
		"\31\5\31\u0108\n\31\3\31\3\31\5\31\u010c\n\31\3\31\3\31\3\31\7\31\u0111"+
		"\n\31\f\31\16\31\u0114\13\31\3\31\5\31\u0117\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u011f\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u0126\n\32\f"+
		"\32\16\32\u0129\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0134\n\33\f\33\16\33\u0137\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u0141\n\34\f\34\16\34\u0144\13\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\4\2\22\22\36\36\4\2\34\34"+
		"##\3\2  \3\2\n\17\5\2\20\21\33\34!!\2\u0160\2C\3\2\2\2\4Q\3\2\2\2\6U\3"+
		"\2\2\2\b^\3\2\2\2\nf\3\2\2\2\fx\3\2\2\2\16\u0091\3\2\2\2\20\u0097\3\2"+
		"\2\2\22\u00a4\3\2\2\2\24\u00a7\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2"+
		"\2\32\u00b3\3\2\2\2\34\u00b9\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2\2\""+
		"\u00c3\3\2\2\2$\u00d2\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3\2\2\2*\u00dc\3\2"+
		"\2\2,\u00f4\3\2\2\2.\u00fc\3\2\2\2\60\u00fe\3\2\2\2\62\u0118\3\2\2\2\64"+
		"\u012c\3\2\2\2\66\u013a\3\2\2\28\u0147\3\2\2\2:\u0149\3\2\2\2<\u014d\3"+
		"\2\2\2>\u014f\3\2\2\2@B\5\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2FH\5\4\3\2GF\3\2\2\2GH\3\2\2\2HN\3\2\2\2IJ\5,\27"+
		"\2JK\7\25\2\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2"+
		"\2\2PN\3\2\2\2QR\7\24\2\2RS\5\26\f\2ST\7\25\2\2T\5\3\2\2\2UV\7\23\2\2"+
		"VY\5\30\r\2WX\7\26\2\2XZ\5\24\13\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7"+
		"\25\2\2\\\7\3\2\2\2]_\7\22\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7#\2\2"+
		"ac\5\f\7\2bd\5 \21\2cb\3\2\2\2cd\3\2\2\2d\t\3\2\2\2eg\7\22\2\2fe\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7#\2\2ik\5\f\7\2jl\5 \21\2kj\3\2\2\2kl\3\2\2"+
		"\2lm\3\2\2\2ms\7\27\2\2no\5.\30\2op\7\25\2\2pr\3\2\2\2qn\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\30\2\2w\13\3\2\2\2x\u0085"+
		"\7\31\2\2yz\5\36\20\2z{\5 \21\2{\u0082\3\2\2\2|}\7\37\2\2}~\5\36\20\2"+
		"~\177\5 \21\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085y\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\7\32\2\2\u0088\r\3\2\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\5\36\20\2\u008d\u008f\5"+
		" \21\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u0092\5\34\17\2\u0091\u008a\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0094\7\3\2\2\u0094\u0096\5&\24\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\17\3\2\2\2\u0097\u00a0\7\31\2\2\u0098\u009d\5&\24"+
		"\2\u0099\u009a\7\37\2\2\u009a\u009c\5&\24\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\7\32\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\7#\2"+
		"\2\u00a5\u00a6\5\20\t\2\u00a6\23\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8\25"+
		"\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\27\3\2\2\2\u00ab\u00b0\7#\2\2\u00ac"+
		"\u00ad\7\33\2\2\u00ad\u00af\7#\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6"+
		"\u00b8\7\4\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7#\2\2\u00bd\35\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00c1\7\35\2\2\u00c1\u00c2\5\32\16\2\u00c2!\3\2\2\2\u00c3\u00c7\7 \2"+
		"\2\u00c4\u00c6\n\4\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7 \2\2\u00cb#\3\2\2\2\u00cc\u00d3\5\"\22\2\u00cd\u00d3\5\34\17"+
		"\2\u00ce\u00d3\5\36\20\2\u00cf\u00d3\5\22\n\2\u00d0\u00d3\7\"\2\2\u00d1"+
		"\u00d3\5\62\32\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3"+
		"\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"%\3\2\2\2\u00d4\u00d8\5$\23\2\u00d5\u00d8\5:\36\2\u00d6\u00d8\5> \2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\'\3\2\2\2"+
		"\u00d9\u00da\7\5\2\2\u00da\u00db\5&\24\2\u00db)\3\2\2\2\u00dc\u00dd\7"+
		"\6\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\5\16\b\2\u00df\u00e0\7\25\2\2"+
		"\u00e0\u00e1\5&\24\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4"+
		"\7\32\2\2\u00e4\u00ea\7\27\2\2\u00e5\u00e6\5.\30\2\u00e6\u00e7\7\25\2"+
		"\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\30\2\2\u00ee+\3\2\2\2\u00ef\u00f5\5\16\b\2\u00f0\u00f5\5\n\6"+
		"\2\u00f1\u00f5\5\60\31\2\u00f2\u00f5\5\64\33\2\u00f3\u00f5\5\66\34\2\u00f4"+
		"\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5-\3\2\2\2\u00f6\u00fd\5,\27\2\u00f7\u00fb"+
		"\5\22\n\2\u00f8\u00fb\5(\25\2\u00f9\u00fb\5*\26\2\u00fa\u00f7\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f6"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd/\3\2\2\2\u00fe\u00ff\7\7\2\2\u00ff"+
		"\u0116\7#\2\2\u0100\u0107\7\27\2\2\u0101\u0103\t\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\5\36\20\2\u0105"+
		"\u0106\5 \21\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0112\3\2\2\2\u0109\u010b\7\37\2\2\u010a\u010c\t\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5\36"+
		"\20\2\u010e\u010f\5 \21\2\u010f\u0111\3\2\2\2\u0110\u0109\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\30\2\2\u0116\u0100\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\61\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011e\7\27\2"+
		"\2\u011a\u011b\5\36\20\2\u011b\u011c\7\3\2\2\u011c\u011d\5&\24\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0127\3\2"+
		"\2\2\u0120\u0121\7\37\2\2\u0121\u0122\5\36\20\2\u0122\u0123\7\3\2\2\u0123"+
		"\u0124\5&\24\2\u0124\u0126\3\2\2\2\u0125\u0120\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7\30\2\2\u012b\63\3\2\2\2\u012c\u012d\7\b\2"+
		"\2\u012d\u012e\7#\2\2\u012e\u012f\5 \21\2\u012f\u0135\7\27\2\2\u0130\u0131"+
		"\5\n\6\2\u0131\u0132\7\25\2\2\u0132\u0134\3\2\2\2\u0133\u0130\3\2\2\2"+
		"\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\30\2\2\u0139\65\3\2\2\2\u013a"+
		"\u013b\7\t\2\2\u013b\u013c\7#\2\2\u013c\u0142\7\27\2\2\u013d\u013e\5\b"+
		"\5\2\u013e\u013f\7\25\2\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\30\2\2\u0146\67\3\2\2\2\u0147\u0148"+
		"\t\5\2\2\u01489\3\2\2\2\u0149\u014a\5$\23\2\u014a\u014b\58\35\2\u014b"+
		"\u014c\5$\23\2\u014c;\3\2\2\2\u014d\u014e\t\6\2\2\u014e=\3\2\2\2\u014f"+
		"\u0150\5$\23\2\u0150\u0151\5<\37\2\u0151\u0152\5$\23\2\u0152?\3\2\2\2"+
		"%CGNY^cfks\u0082\u0085\u008a\u008e\u0091\u0095\u009d\u00a0\u00b0\u00b9"+
		"\u00c7\u00d2\u00d7\u00ea\u00f4\u00fa\u00fc\u0102\u0107\u010b\u0112\u0116"+
		"\u011e\u0127\u0135\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}