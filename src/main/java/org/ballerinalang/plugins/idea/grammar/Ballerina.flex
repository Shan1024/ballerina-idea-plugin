package org.ballerinalang.plugins.idea.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.*;

%%

%{
  private boolean inTemplate = false;
  public BallerinaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class BallerinaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

//ESCAPE_SEQUENCE = "\\" [btnfr\"'\\]
//STRING_CHARACTER = ~[\"\\] | {ESCAPE_SEQUENCE}
//STRING_CHARACTERS = {STRING_CHARACTER}+
//QUOTED_STRING_LITERAL = "\"" {STRING_CHARACTERS}? "\""

//QUOTED_STRING_LITERAL ='\"' ((~[\"\\] | '\\' [btnfr\"'\\])+)? '\"'



//STR = "\""
//QUOTED_STRING_LITERAL = {STR} ( [^\"\\\n\r] | "\\" ("\\" | {STR} | {ESCAPES} | [0-8xuU] ) )* {STR}?
//ESCAPES = [abfnrtv]

//QUOTED_STRING_LITERAL = \" [^\"]* \"

// Note - Invalid escaped characters should be annotated at runtime.
// This is done becuase otherwise the string wont be identified correctly.
ESCAPE_SEQUENCE = \\ [btnfr\"'\\]
STRING_CHARACTER =  [^\"] | {ESCAPE_SEQUENCE}
STRING_CHARACTERS = {STRING_CHARACTER}+
QUOTED_STRING_LITERAL = \" {STRING_CHARACTERS}? \"?

DIGIT = [0-9]
DIGITS = {DIGIT}+
DECIMAL_INTEGER_LITERAL = {DIGITS}
INTIGER_LITERAL = {DECIMAL_INTEGER_LITERAL}

LETTER = [:letter:] | "_"
DIGIT =  [:digit:]

IDENTIFIER = {LETTER} ({LETTER} | {DIGIT})*

WHITE_SPACE=\s+

LINE_COMMENT = "//" [^\r\n]*

StringTemplateLiteralStart = string[ \t\n\x0B\f\r]*`
StringTemplateLiteralEnd = `

%state STRING_TEMPLATE

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return WHITE_SPACE; }

  "abort"                   { return ABORT; }
  "action"                  { return ACTION; }
  "all"                     { return ALL; }
  "annotation"              { return ANNOTATION; }
  "any"                     { return ANY; }
  "as"                      { return AS; }
  "attach"                  { return ATTACH; }
  "bind"                    { return BIND; }
  "blob"                    { return BLOB; }
  "boolean"                 { return BOOLEAN; }
  "break"                   { return BREAK; }
  "catch"                   { return CATCH; }
  "connector"               { return CONNECTOR; }
  "const"                   { return CONST; }
  "create"                  { return CREATE; }
  "else"                    { return ELSE; }
  "endpoint"                { return ENDPOINT; }
  "enum"                    { return ENUM; }
  "failed"                  { return FAILED; }
  "finally"                 { return FINALLY; }
  "float"                   { return FLOAT; }
  "foreach"                 { return FOREACH; }
  "fork"                    { return FORK; }
  "function"                { return FUNCTION; }
  "if"                      { return IF; }
  "import"                  { return IMPORT; }
  "in"                      { return IN; }
  "int"                     { return INT; }
  "join"                    { return JOIN; }
  "json"                    { return JSON; }
  "lengthof"                { return LENGTHOF; }
  "lock"                    { return LOCK; }
  "map"                     { return MAP; }
  "native"                  { return NATIVE; }
  "next"                    { return NEXT; }
  "package"                 { return PACKAGE; }
  "parameter"               { return TYPE_PARAMETER; }
  "private"                 { return PRIVATE; }
  "public"                  { return PUBLIC; }
  "resource"                { return RESOURCE; }
  "retries"                 { return RETRIES; }
  "return"                  { return RETURN; }
  "returns"                 { return RETURNS; }
  "service"                 { return SERVICE; }
  "some"                    { return SOME; }
  "string"                  { return STRING; }
  "struct"                  { return STRUCT; }
  "table"                   { return TABLE; }
  "timeout"                 { return TIMEOUT; }
  "transaction"             { return TRANSACTION; }
  "transformer"             { return TRANSFORMER; }
  "try"                     { return TRY; }
  "type"                    { return TYPE; }
  "typeof"                  { return TYPEOF; }
  "throw"                   { return THROW; }
  "while"                   { return WHILE; }
  "with"                    { return WITH; }
  "worker"                  { return WORKER; }
  "var"                     { return VAR; }
  "version"                 { return VERSION; }
  "xml"                     { return XML; }
  "xmlns"                   { return XMLNS; }

  ";"                       { return SEMICOLON; }
  ":"                       { return COLON; }
  "."                       { return DOT; }
  ","                       { return COMMA; }
  "{"                       { return LEFT_BRACE; }
  "}"                       { return RIGHT_BRACE; }
  "("                       { return LEFT_PARENTHESIS; }
  ")"                       { return RIGHT_PARENTHESIS; }
  "["                       { return LEFT_BRACKET; }
  "]"                       { return RIGHT_BRACKET; }
  "?"                       { return QUESTION_MARK; }
  "="                       { return ASSIGN; }
  "+"                       { return ADD; }
  "-"                       { return SUB; }
  "*"                       { return MUL; }
  "/"                       { return DIV; }
  "^"                       { return POW; }
  "%"                       { return MOD; }
  "!"                       { return NOT; }
  "=="                      { return EQUAL; }
  "!="                      { return NOT_EQUAL; }
  ">"                       { return GT; }
  "<"                       { return LT; }
  ">="                      { return GT_EQUAL; }
  "<="                      { return LT_EQUAL; }
  "&&"                      { return AND; }
  "||"                      { return OR; }
  "->"                      { return RARROW; }
  "<-"                      { return LARROW; }
  "@"                       { return AT; }
//  "`"                       { return BACKTICK; }
  ".."                      { return RANGE; }

  {QUOTED_STRING_LITERAL}   { return QUOTEDSTRINGLITERAL; }
  {IDENTIFIER}              { return IDENTIFIER; }
  {LINE_COMMENT}            { return LINE_COMMENT; }
  {INTIGER_LITERAL}         { return INTEGERLITERAL; }

  {StringTemplateLiteralStart} { inTemplate = true; yybegin(STRING_TEMPLATE); return STRINGTEMPLATELITERALSTART;}
  .                         { return BAD_CHARACTER; }
}

<STRING_TEMPLATE>{
  {StringTemplateLiteralEnd} {inTemplate = false; yybegin(YYINITIAL); return STRINGTEMPLATELITERALEND; }
   .                         {inTemplate = false; return BAD_CHARACTER; }
}

[^] { return BAD_CHARACTER; }
