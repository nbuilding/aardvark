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
		PUBLIC=10, IMPORT=11, MODULE=12, SEMI=13, HASH=14, LBRACE=15, RBRACE=16, 
		LBRACKET=17, RBRACKET=18, SLASH=19, STAR=20, COLON=21, MUTABLE=22, COMMA=23, 
		DQUOTE=24, PLUS=25, INTEGER=26, Identifier=27, WS=28;
	public static final int
		RULE_compilationUnit = 0, RULE_moduleDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_declarationFunction = 3, RULE_functionDeclarationArguments = 4, RULE_declarationVariable = 5, 
		RULE_functionCallParameters = 6, RULE_functionCall = 7, RULE_importName = 8, 
		RULE_moduleName = 9, RULE_fileName = 10, RULE_type = 11, RULE_variableName = 12, 
		RULE_typeAnnotation = 13, RULE_string = 14, RULE_value = 15, RULE_returnExpression = 16, 
		RULE_scope = 17, RULE_if_statement = 18, RULE_declaration = 19, RULE_statement = 20, 
		RULE_statementNoSemi = 21, RULE_structDefinition = 22, RULE_structInstantiation = 23, 
		RULE_lessThan = 24, RULE_greaterThan = 25, RULE_leq = 26, RULE_geq = 27, 
		RULE_eq = 28, RULE_predicate = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "moduleDeclaration", "importDeclaration", "declarationFunction", 
			"functionDeclarationArguments", "declarationVariable", "functionCallParameters", 
			"functionCall", "importName", "moduleName", "fileName", "type", "variableName", 
			"typeAnnotation", "string", "value", "returnExpression", "scope", "if_statement", 
			"declaration", "statement", "statementNoSemi", "structDefinition", "structInstantiation", 
			"lessThan", "greaterThan", "leq", "geq", "eq", "predicate"
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
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(60);
				importDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODULE) {
				{
				setState(66);
				moduleDeclaration();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUBLIC:
				case MUTABLE:
				case Identifier:
					{
					setState(69);
					declaration();
					}
					break;
				case T__3:
					{
					setState(70);
					structDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
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
			setState(76);
			match(MODULE);
			setState(77);
			moduleName();
			setState(78);
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
			setState(80);
			match(IMPORT);
			setState(81);
			fileName();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(82);
				match(HASH);
				setState(83);
				importName();
				}
			}

			setState(86);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(88);
				match(PUBLIC);
				}
			}

			setState(91);
			match(Identifier);
			setState(92);
			functionDeclarationArguments();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(93);
				typeAnnotation();
				}
			}

			setState(96);
			match(LBRACE);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
			setState(105);
			match(LBRACKET);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				{
				setState(106);
				variableName();
				setState(107);
				typeAnnotation();
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					{
					setState(110);
					variableName();
					setState(111);
					typeAnnotation();
					}
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==MUTABLE) {
				{
				setState(122);
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

			setState(125);
			variableName();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(126);
				typeAnnotation();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(129);
				match(T__0);
				setState(130);
				value();
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
			setState(133);
			match(LBRACKET);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << DQUOTE) | (1L << INTEGER) | (1L << Identifier))) != 0)) {
				{
				setState(134);
				value();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135);
					match(COMMA);
					setState(136);
					value();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(144);
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
			setState(146);
			match(Identifier);
			setState(147);
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
			setState(149);
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
			setState(151);
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
			setState(153);
			match(Identifier);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(154);
				match(SLASH);
				setState(155);
				match(Identifier);
				}
				}
				setState(160);
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
			setState(161);
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
			setState(163);
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
			setState(165);
			match(COLON);
			setState(166);
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
			setState(168);
			match(DQUOTE);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << PUBLIC) | (1L << IMPORT) | (1L << MODULE) | (1L << SEMI) | (1L << HASH) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << SLASH) | (1L << STAR) | (1L << COLON) | (1L << MUTABLE) | (1L << COMMA) | (1L << PLUS) | (1L << INTEGER) | (1L << Identifier) | (1L << WS))) != 0)) {
				{
				{
				setState(169);
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
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(INTEGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				scope();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 32, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__1);
			setState(186);
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

	public static class ScopeContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			if_statement();
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
		public TerminalNode LBRACKET() { return getToken(AardvarkParser.LBRACKET, 0); }
		public DeclarationVariableContext declarationVariable() {
			return getRuleContext(DeclarationVariableContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(AardvarkParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AardvarkParser.SEMI, i);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StatementNoSemiContext statementNoSemi() {
			return getRuleContext(StatementNoSemiContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(AardvarkParser.RBRACKET, 0); }
		public TerminalNode LBRACE() { return getToken(AardvarkParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AardvarkParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__2);
			setState(191);
			match(LBRACKET);
			setState(192);
			declarationVariable();
			setState(193);
			match(SEMI);
			setState(194);
			predicate();
			setState(195);
			match(SEMI);
			setState(196);
			statementNoSemi();
			setState(197);
			match(RBRACKET);
			setState(198);
			match(LBRACE);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
		public TerminalNode SEMI() { return getToken(AardvarkParser.SEMI, 0); }
		public DeclarationVariableContext declarationVariable() {
			return getRuleContext(DeclarationVariableContext.class,0);
		}
		public DeclarationFunctionContext declarationFunction() {
			return getRuleContext(DeclarationFunctionContext.class,0);
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
				setState(207);
				declarationVariable();
				}
				break;
			case 2:
				{
				setState(208);
				declarationFunction();
				}
				break;
			}
			setState(211);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AardvarkParser.SEMI, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(213);
				declaration();
				}
				break;
			case 2:
				{
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(214);
					functionCall();
					}
					break;
				case T__1:
					{
					setState(215);
					returnExpression();
					}
					break;
				case T__2:
					{
					setState(216);
					scope();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219);
				match(SEMI);
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

	public static class StatementNoSemiContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public StatementNoSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoSemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterStatementNoSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitStatementNoSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitStatementNoSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoSemiContext statementNoSemi() throws RecognitionException {
		StatementNoSemiContext _localctx = new StatementNoSemiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementNoSemi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(223);
				declaration();
				}
				break;
			case 2:
				{
				setState(224);
				functionCall();
				}
				break;
			case 3:
				{
				setState(225);
				returnExpression();
				}
				break;
			case 4:
				{
				setState(226);
				scope();
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
		public TerminalNode SEMI() { return getToken(AardvarkParser.SEMI, 0); }
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
		enterRule(_localctx, 44, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__3);
			setState(230);
			match(Identifier);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(231);
				match(LBRACE);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << MUTABLE) | (1L << Identifier))) != 0)) {
					{
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==MUTABLE) {
						{
						setState(232);
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

					setState(235);
					variableName();
					setState(236);
					typeAnnotation();
					}
				}

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(240);
					match(COMMA);
					{
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==MUTABLE) {
						{
						setState(241);
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

					setState(244);
					variableName();
					setState(245);
					typeAnnotation();
					}
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(RBRACE);
				}
			}

			setState(255);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 46, RULE_structInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(Identifier);
			setState(258);
			match(LBRACE);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(259);
				variableName();
				setState(260);
				match(T__0);
				setState(261);
				value();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				variableName();
				setState(267);
				match(T__0);
				setState(268);
				value();
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

	public static class LessThanContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			value();
			setState(278);
			match(T__4);
			setState(279);
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

	public static class GreaterThanContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			value();
			setState(282);
			match(T__5);
			setState(283);
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

	public static class LeqContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitLeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitLeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeqContext leq() throws RecognitionException {
		LeqContext _localctx = new LeqContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_leq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			value();
			setState(286);
			match(T__6);
			setState(287);
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

	public static class GeqContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public GeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitGeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitGeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeqContext geq() throws RecognitionException {
		GeqContext _localctx = new GeqContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_geq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			value();
			setState(290);
			match(T__7);
			setState(291);
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

	public static class EqContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AardvarkListener ) ((AardvarkListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AardvarkVisitor ) return ((AardvarkVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			value();
			setState(294);
			match(T__8);
			setState(295);
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

	public static class PredicateContext extends ParserRuleContext {
		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class,0);
		}
		public GreaterThanContext greaterThan() {
			return getRuleContext(GreaterThanContext.class,0);
		}
		public LeqContext leq() {
			return getRuleContext(LeqContext.class,0);
		}
		public GeqContext geq() {
			return getRuleContext(GeqContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
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
		enterRule(_localctx, 58, RULE_predicate);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				lessThan();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				greaterThan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				leq();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				geq();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				eq();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0133\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\5\2F\n\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\5\5\5\\\n\5\3\5\3\5\3\5"+
		"\5\5a\n\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6t\n\6\f\6\16\6w\13\6\5\6y\n\6\3\6\3\6\3\7\5\7~\n\7\3\7"+
		"\3\7\5\7\u0082\n\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\3\b\3\b\7\b\u008c\n\b"+
		"\f\b\16\b\u008f\13\b\5\b\u0091\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\7\20\u00ad\n\20\f\20\16\20\u00b0\13\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00cb\n\24"+
		"\f\24\16\24\u00ce\13\24\3\24\3\24\3\25\3\25\5\25\u00d4\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\5\26\u00dc\n\26\3\26\3\26\5\26\u00e0\n\26\3\27\3"+
		"\27\3\27\3\27\5\27\u00e6\n\27\3\30\3\30\3\30\3\30\5\30\u00ec\n\30\3\30"+
		"\3\30\3\30\5\30\u00f1\n\30\3\30\3\30\5\30\u00f5\n\30\3\30\3\30\3\30\7"+
		"\30\u00fa\n\30\f\30\16\30\u00fd\13\30\3\30\5\30\u0100\n\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u010a\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u0111\n\31\f\31\16\31\u0114\13\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0131\n\37\3\37\2\2 \2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\4\2\f\f\30"+
		"\30\4\2\26\26\35\35\3\2\32\32\2\u013d\2A\3\2\2\2\4N\3\2\2\2\6R\3\2\2\2"+
		"\b[\3\2\2\2\nk\3\2\2\2\f}\3\2\2\2\16\u0087\3\2\2\2\20\u0094\3\2\2\2\22"+
		"\u0097\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00a3\3\2\2\2\32\u00a5"+
		"\3\2\2\2\34\u00a7\3\2\2\2\36\u00aa\3\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2"+
		"\2\2$\u00be\3\2\2\2&\u00c0\3\2\2\2(\u00d3\3\2\2\2*\u00df\3\2\2\2,\u00e5"+
		"\3\2\2\2.\u00e7\3\2\2\2\60\u0103\3\2\2\2\62\u0117\3\2\2\2\64\u011b\3\2"+
		"\2\2\66\u011f\3\2\2\28\u0123\3\2\2\2:\u0127\3\2\2\2<\u0130\3\2\2\2>@\5"+
		"\6\4\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2DF\5"+
		"\4\3\2ED\3\2\2\2EF\3\2\2\2FK\3\2\2\2GJ\5(\25\2HJ\5.\30\2IG\3\2\2\2IH\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\3\3\2\2\2MK\3\2\2\2NO\7\16\2\2O"+
		"P\5\24\13\2PQ\7\17\2\2Q\5\3\2\2\2RS\7\r\2\2SV\5\26\f\2TU\7\20\2\2UW\5"+
		"\22\n\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\17\2\2Y\7\3\2\2\2Z\\\7\f\2\2"+
		"[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\35\2\2^`\5\n\6\2_a\5\34\17\2`_\3"+
		"\2\2\2`a\3\2\2\2ab\3\2\2\2bf\7\21\2\2ce\5*\26\2dc\3\2\2\2eh\3\2\2\2fd"+
		"\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\22\2\2j\t\3\2\2\2kx\7\23\2"+
		"\2lm\5\32\16\2mn\5\34\17\2nu\3\2\2\2op\7\31\2\2pq\5\32\16\2qr\5\34\17"+
		"\2rt\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2xl\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\24\2\2{\13\3\2\2\2|~\t\2\2\2}|\3"+
		"\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\5\32\16\2\u0080\u0082\5\34\17"+
		"\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084"+
		"\7\3\2\2\u0084\u0086\5 \21\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\r\3\2\2\2\u0087\u0090\7\23\2\2\u0088\u008d\5 \21\2\u0089\u008a\7\31\2"+
		"\2\u008a\u008c\5 \21\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\24"+
		"\2\2\u0093\17\3\2\2\2\u0094\u0095\7\35\2\2\u0095\u0096\5\16\b\2\u0096"+
		"\21\3\2\2\2\u0097\u0098\t\3\2\2\u0098\23\3\2\2\2\u0099\u009a\7\35\2\2"+
		"\u009a\25\3\2\2\2\u009b\u00a0\7\35\2\2\u009c\u009d\7\25\2\2\u009d\u009f"+
		"\7\35\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\7\35\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\35\2\2\u00a6\33\3\2\2\2\u00a7"+
		"\u00a8\7\27\2\2\u00a8\u00a9\5\30\r\2\u00a9\35\3\2\2\2\u00aa\u00ae\7\32"+
		"\2\2\u00ab\u00ad\n\4\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7\32\2\2\u00b2\37\3\2\2\2\u00b3\u00ba\5\36\20\2\u00b4"+
		"\u00ba\5\32\16\2\u00b5\u00ba\5\20\t\2\u00b6\u00ba\7\34\2\2\u00b7\u00ba"+
		"\5$\23\2\u00b8\u00ba\5\60\31\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2"+
		"\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd\5 \21\2\u00bd"+
		"#\3\2\2\2\u00be\u00bf\5&\24\2\u00bf%\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1"+
		"\u00c2\7\23\2\2\u00c2\u00c3\5\f\7\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\5"+
		"<\37\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7\5,\27\2\u00c7\u00c8\7\24\2\2\u00c8"+
		"\u00cc\7\21\2\2\u00c9\u00cb\5*\26\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\22\2\2\u00d0\'\3\2\2\2\u00d1\u00d4\5\f\7"+
		"\2\u00d2\u00d4\5\b\5\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6)\3\2\2\2\u00d7\u00e0\5(\25\2\u00d8"+
		"\u00dc\5\20\t\2\u00d9\u00dc\5\"\22\2\u00da\u00dc\5$\23\2\u00db\u00d8\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7\17\2\2\u00de\u00e0\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00db\3"+
		"\2\2\2\u00e0+\3\2\2\2\u00e1\u00e6\5(\25\2\u00e2\u00e6\5\20\t\2\u00e3\u00e6"+
		"\5\"\22\2\u00e4\u00e6\5$\23\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6-\3\2\2\2\u00e7\u00e8\7"+
		"\6\2\2\u00e8\u00ff\7\35\2\2\u00e9\u00f0\7\21\2\2\u00ea\u00ec\t\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\32"+
		"\16\2\u00ee\u00ef\5\34\17\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00fb\3\2\2\2\u00f2\u00f4\7\31\2\2\u00f3\u00f5\t"+
		"\2\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\5\32\16\2\u00f7\u00f8\5\34\17\2\u00f8\u00fa\3\2\2\2\u00f9\u00f2"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7\22\2\2\u00ff\u00e9\3"+
		"\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\17\2\2\u0102"+
		"/\3\2\2\2\u0103\u0104\7\35\2\2\u0104\u0109\7\21\2\2\u0105\u0106\5\32\16"+
		"\2\u0106\u0107\7\3\2\2\u0107\u0108\5 \21\2\u0108\u010a\3\2\2\2\u0109\u0105"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0112\3\2\2\2\u010b\u010c\7\31\2\2"+
		"\u010c\u010d\5\32\16\2\u010d\u010e\7\3\2\2\u010e\u010f\5 \21\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010b\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\22"+
		"\2\2\u0116\61\3\2\2\2\u0117\u0118\5 \21\2\u0118\u0119\7\7\2\2\u0119\u011a"+
		"\5 \21\2\u011a\63\3\2\2\2\u011b\u011c\5 \21\2\u011c\u011d\7\b\2\2\u011d"+
		"\u011e\5 \21\2\u011e\65\3\2\2\2\u011f\u0120\5 \21\2\u0120\u0121\7\t\2"+
		"\2\u0121\u0122\5 \21\2\u0122\67\3\2\2\2\u0123\u0124\5 \21\2\u0124\u0125"+
		"\7\n\2\2\u0125\u0126\5 \21\2\u01269\3\2\2\2\u0127\u0128\5 \21\2\u0128"+
		"\u0129\7\13\2\2\u0129\u012a\5 \21\2\u012a;\3\2\2\2\u012b\u0131\5\62\32"+
		"\2\u012c\u0131\5\64\33\2\u012d\u0131\5\66\34\2\u012e\u0131\58\35\2\u012f"+
		"\u0131\5:\36\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131=\3\2\2\2!AEIKV[`fu"+
		"x}\u0081\u0085\u008d\u0090\u00a0\u00ae\u00b9\u00cc\u00d3\u00db\u00df\u00e5"+
		"\u00eb\u00f0\u00f4\u00fb\u00ff\u0109\u0112\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}