grammar Aardvark;

@header {
    package aardvark;
}
compilationUnit
    :
        importDeclaration*
        moduleDeclaration?
        (declaration | structDefinition)*
    ;

moduleDeclaration: MODULE moduleName SEMI;
importDeclaration:
IMPORT fileName (HASH importName)? SEMI
;



declarationFunction:
(PUBLIC)? Identifier
functionDeclarationArguments
typeAnnotation?
LBRACE statement* RBRACE;
functionDeclarationArguments: (LBRACKET ((variableName typeAnnotation) (COMMA (variableName typeAnnotation))*)? RBRACKET);

declarationVariable: (PUBLIC | MUTABLE)? variableName typeAnnotation? ('=' value)?;

functionCallParameters: LBRACKET (value (COMMA value)*)? RBRACKET;
functionCall: Identifier functionCallParameters;

importName: Identifier | STAR;
moduleName: Identifier;
fileName: Identifier (SLASH Identifier)*;
type: Identifier;
variableName: Identifier;
typeAnnotation: COLON type;
string : '"' ~('"')* '"' ;
value: string | variableName | functionCall | INTEGER | scope | structInstantiation;
returnExpression: 'return' value;

scope: if_statement;
if_statement: 'for' LBRACKET declarationVariable SEMI predicate SEMI statementNoSemi RBRACKET LBRACE statement* RBRACE;
declaration: (declarationVariable | declarationFunction) SEMI;
statement: (declaration | (functionCall | returnExpression | scope) SEMI);
statementNoSemi: (declaration | functionCall | returnExpression | scope);

structDefinition: 'struct' Identifier
(
    LBRACE
    ((PUBLIC | MUTABLE)? variableName typeAnnotation)?
    (',' ((PUBLIC | MUTABLE)? variableName typeAnnotation))*
    RBRACE
)? SEMI;

structInstantiation: Identifier LBRACE (variableName '=' value)? (',' variableName '=' value)* RBRACE;

lessThan: value '<' value;
greaterThan: value '>' value;
leq: value '<=' value;
geq: value '>=' value;
eq: value '==' value;
predicate: lessThan | greaterThan | leq | geq | eq;


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

