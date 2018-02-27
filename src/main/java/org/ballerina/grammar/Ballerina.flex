package org.ballerina.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.ballerina.psi.BallerinaTypes.*;

%%

%{
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

LETTER = [:letter:] | "_"
DIGIT =  [:digit:]

IDENTIFIER = {LETTER} ({LETTER} | {DIGIT})*

WHITE_SPACE=\s+

LINE_COMMENT = "//" [^\r\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "package"             { return PACKAGE; }
  "import"              { return IMPORT; }
  "as"                  { return AS; }
  "public"              { return PUBLIC; }
  "private"             { return PRIVATE; }
  "native"              { return NATIVE; }
  "service"             { return SERVICE; }
  "resource"            { return RESOURCE; }
  "function"            { return FUNCTION; }
  "connector"           { return CONNECTOR; }
  "action"              { return ACTION; }
  "struct"              { return STRUCT; }
  "annotation"          { return ANNOTATION; }
  "enum"                { return ENUM; }
  "const"               { return CONST; }
  "transformer"         { return TRANSFORMER; }
  "worker"              { return WORKER; }
  "endpoint"            { return ENDPOINT; }
  "xmlns"               { return XMLNS; }
  "returns"             { return RETURNS; }
  "int"                 { return TYPE_INT; }
  "float"               { return TYPE_FLOAT; }
  "boolean"             { return TYPE_BOOL; }
  "string"              { return TYPE_STRING; }
  "blob"                { return TYPE_BLOB; }
  "map"                 { return TYPE_MAP; }
  "json"                { return TYPE_JSON; }
  "xml"                 { return TYPE_XML; }
  "table"               { return TYPE_TABLE; }
  "any"                 { return TYPE_ANY; }
  "type"                { return TYPE_TYPE; }
  "var"                 { return VAR; }
  "create"              { return CREATE; }
  "attach"              { return ATTACH; }
  "if"                  { return IF; }
  "else"                { return ELSE; }
  "foreach"             { return FOREACH; }
  "while"               { return WHILE; }
  "next"                { return NEXT; }
  "break"               { return BREAK; }
  "fork"                { return FORK; }
  "join"                { return JOIN; }
  "some"                { return SOME; }
  "all"                 { return ALL; }
  "timeout"             { return TIMEOUT; }
  "try"                 { return TRY; }
  "catch"               { return CATCH; }
  "finally"             { return FINALLY; }
  "throw"               { return THROW; }
  "return"              { return RETURN; }
  "transaction"         { return TRANSACTION; }
  "abort"               { return ABORT; }
  "failed"              { return FAILED; }
  "retries"             { return RETRIES; }
  "lengthof"            { return LENGTHOF; }
  "typeof"              { return TYPEOF; }
  "with"                { return WITH; }
  "bind"                { return BIND; }
  "in"                  { return IN; }
  "lock"                { return LOCK; }
  "version"             { return VERSION; }
  ";"                   { return SEMICOLON; }
  ":"                   { return COLON; }
  "."                   { return DOT; }
  ","                   { return COMMA; }
  "{"                   { return LEFT_BRACE; }
  "}"                   { return RIGHT_BRACE; }
  "("                   { return LEFT_PARENTHESIS; }
  ")"                   { return RIGHT_PARENTHESIS; }
  "["                   { return LEFT_BRACKET; }
  "]"                   { return RIGHT_BRACKET; }
  "?"                   { return QUESTION_MARK; }
  "="                   { return ASSIGN; }
  "+"                   { return ADD; }
  "-"                   { return SUB; }
  "*"                   { return MUL; }
  "/"                   { return DIV; }
  "^"                   { return POW; }
  "%"                   { return MOD; }
  "!"                   { return NOT; }
  "=="                  { return EQUAL; }
  "!="                  { return NOT_EQUAL; }
  ">"                   { return GT; }
  "<"                   { return LT; }
  ">="                  { return GT_EQUAL; }
  "<="                  { return LT_EQUAL; }
  "&&"                  { return AND; }
  "||"                  { return OR; }
  "->"                  { return RARROW; }
  "<-"                  { return LARROW; }
  "@"                   { return AT; }
  "`"                   { return BACKTICK; }
  ".."                  { return RANGE; }
  "structBody"          { return STRUCTBODY; }
  "xmlNamespaceName"    { return XMLNAMESPACENAME; }
  "xmlLocalName"        { return XMLLOCALNAME; }
  "index"               { return INDEX; }

  {IDENTIFIER}          { return IDENTIFIER; }
  {LINE_COMMENT}        { return LINE_COMMENT; }

}

[^] { return BAD_CHARACTER; }
