package com.simpleplugin.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.simpleplugin.psi.SimpleTypes.*;

%%

%{
  public _SimpleLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SimpleLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LETTER=[a-zA-Z_]
LETTERORDIGIT=[a-zA-Z0-9_]
WS=[ \t]+
NEW_LINE=[\r\n\u000C]+
LINE_COMMENT="//"~[\r\n]*

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
  ";"                   { return SEMICOLON; }
  "="                   { return COLON; }
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
  "VERSION"             { return VERSION; }
  "structBody"          { return STRUCTBODY; }
  "xmlNamespaceName"    { return XMLNAMESPACENAME; }
  "xmlLocalName"        { return XMLLOCALNAME; }

  {LETTER}              { return LETTER; }
  {LETTERORDIGIT}       { return LETTERORDIGIT; }
  {WS}                  { return WS; }
  {NEW_LINE}            { return NEW_LINE; }
  {LINE_COMMENT}        { return LINE_COMMENT; }

}

[^] { return BAD_CHARACTER; }
