grammar Aardvark;

@header {
    package aardvark;
}
compilationUnit
    :
        importDeclaration*
        moduleDeclaration?
        (declaration SEMI)*
    ;

moduleDeclaration: MODULE moduleName SEMI;
importDeclaration:
IMPORT fileName (HASH importName)? SEMI
;

declarationFunctionStub:
                         (PUBLIC)? Identifier
                         functionDeclarationArguments
                         typeAnnotation?;

declarationFunction:
(PUBLIC)? Identifier
functionDeclarationArguments
typeAnnotation?
LBRACE (statement SEMI)* RBRACE;
functionDeclarationArguments: (LBRACKET ((variableName typeAnnotation) (COMMA (variableName typeAnnotation))*)? RBRACKET);

declarationVariable: (((PUBLIC | MUTABLE)? variableName typeAnnotation?) | variableRef)  ('=' expression)?;

functionCallParameters: LBRACKET (expression (COMMA expression)*)? RBRACKET;
functionCall: Identifier functionCallParameters;

importName: Identifier | STAR;
moduleName: Identifier;
fileName: Identifier (SLASH Identifier)*;
type: Identifier;
variableName: Identifier;
variableRef: ( Identifier '.')* Identifier;
typeAnnotation: COLON type;
string : '"' ~('"')* '"' ;
value: string | variableRef | variableName | functionCall | INTEGER | structInstantiation;
expression: value | predicate | infixOperation;
returnExpression: 'return' expression;

for_statement: 'for' LBRACKET declarationVariable SEMI expression SEMI statement RBRACKET LBRACE (statement SEMI)* RBRACE;
declaration: (declarationVariable | declarationFunction | structDefinition | structImplementation | contractDefinition) ;
statement: (declaration | (functionCall | returnExpression | for_statement));

structDefinition: 'struct' Identifier
(
    LBRACE
    ((PUBLIC | MUTABLE)? variableName typeAnnotation)?
    (',' ((PUBLIC | MUTABLE)? variableName typeAnnotation))*
    RBRACE
)?;

structInstantiation: Identifier LBRACE (variableName '=' expression)? (',' variableName '=' expression)* RBRACE;
structImplementation: 'impl' Identifier typeAnnotation LBRACE (declarationFunction SEMI)* RBRACE;

contractDefinition: 'contract' Identifier LBRACE (declarationFunctionStub SEMI)* RBRACE;

predicateOperator: '<' | '>' | '<=' | '>=' | '==' | '!=';
predicate: value predicateOperator value;

infixOperator: '+' | '-' | '*' | '^' | '/';
infixOperation: value infixOperator value;


// lexer shit
PUBLIC: 'public';
IMPORT : 'import';
MODULE : 'module';
SEMI : ';';
HASH: '#';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '(';
RBRACKET: ')';
SLASH: '/';
STAR: '*';
COLON: ':';
MUTABLE: 'mut';
COMMA: ',';
DQUOTE: '"';
PLUS: '+';

INTEGER: Digit+;
Identifier : Letter (LetterOrDigit)* ; // simplified
WS       : (' ' | '\n' | '\t' | '\r')+ -> skip;
fragment
Letter
    :    '\u0024'           // $
    |    '\u0041'..'\u005a' // A-Z
    |    '\u005f'           // _
    |    '\u0061'..'\u007a' // a-z
    |    '\u00c0'..'\u00d6' // À-Ö
    |    '\u00d8'..'\u00f6' // Ø-ö
    |    '\u00f8'..'\u00ff' // ø-ÿ

    ;
fragment
Digit
    :    '\u0030'..'\u0039'   // 0-9
    ;
fragment
Escape
    :    '\\b' /* \u0008: backspace BS */
    |    '\\t' /* \u0009: horizontal tab HT */
    |    '\\n' /* \u000a: linefeed LF */
    |    '\\f' /* \u000c: form feed FF */
    |    '\\r' /* \u000d: carriage return CR */
    |    '\\"' /* \u0022: double quote " */
    |    '\\\'' /* \u0027: single quote ' */
    |    '\\\\' /* \u005c: backslash \ */
    ;
fragment
LetterOrDigit
    :    Letter
    |    Digit
    ;

