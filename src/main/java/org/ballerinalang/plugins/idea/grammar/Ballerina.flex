package org.ballerinalang.plugins.idea.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.*;

%%

%{
  private boolean inXmlTemplate = false;
  private boolean inStringTemplate = false;
  private boolean inXmlTag = false;
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
// Also the strings can either be enclosed in single or double quotes or no quotes at all.
ESCAPE_SEQUENCE = \\ [btnfr\"'\\]
STRING_CHARACTER =  [^\"] | {ESCAPE_SEQUENCE}
STRING_CHARACTERS = {STRING_CHARACTER}+
QUOTED_STRING_LITERAL = \" {STRING_CHARACTERS}? \"?

DIGIT = [0-9]
DIGITS = {DIGIT}+
DECIMAL_INTEGER_LITERAL = {DIGITS}
INTIGER_LITERAL = {DECIMAL_INTEGER_LITERAL}

LETTER = [:letter:] | '_'
DIGIT =  [:digit:]

IDENTIFIER = {LETTER} ({LETTER} | {DIGIT})*

WHITE_SPACE=\s+

// Todo - Add inspection
LINE_COMMENT = "/" "/"? [^\r\n]*

XML_LITERAL_START = xml[ \t\n\x0B\f\r]*`

STRING_TEMPLATE_LITERAL_START = string[ \t\n\x0B\f\r]*`
STRING_TEMPLATE_LITERAL_END = "`"

EXPRESSION_START = "{{"
EXPRESSION_END = "}}"

STRING_LITERAL_ESCAPED_SEQUENCE = "\\" | "\{{"
STRING_TEMPLATE_VALID_CHAR_SEQUENCE = \{ | \\ ~\\
STRING_TEMPLATE_STRING_CHAR = [^`\{\\] | \\ [`\{] | {WHITE_SPACE} | {STRING_LITERAL_ESCAPED_SEQUENCE}
STRING_TEMPLATE_EXPRESSION_START = {STRING_TEMPLATE_TEXT}? {EXPRESSION_START}
STRING_TEMPLATE_TEXT = {STRING_TEMPLATE_VALID_CHAR_SEQUENCE}? ({STRING_TEMPLATE_STRING_CHAR} {STRING_TEMPLATE_VALID_CHAR_SEQUENCE}?)+
                       | {STRING_TEMPLATE_VALID_CHAR_SEQUENCE} ({STRING_TEMPLATE_STRING_CHAR} {STRING_TEMPLATE_VALID_CHAR_SEQUENCE}?)*

// XML
XML_COMMENT_START = "<!--"
CDATA = "<![CDATA[" .*? "]]>"
DTD = "<!" ([^-].|.[^-]).*? ">"
ENTITY_REF = '&' {XML_QNAME} ';'
CHAR_REF = '&#' {DIGIT}+ ';' | '&#x' {HEX_DIGITS}+ ';'
XML_WS = ' '|'\t'|'\r'? '\n'
XML_TAG_OPEN = "<"
XML_TAG_OPEN_SLASH = "</"
XML_TAG_SPECIAL_OPEN = <\? /*({XML_QNAME} {QNAME_SEPARATOR})? {XML_QNAME} {XML_WS}*/ // Todo - Fix
XML_LITERAL_END = "`"
XML_TEMPLATE_TEXT = {XML_TEXT_SEQUENCE}? {EXPRESSION_START}
XML_TEXT_SEQUENCE = {XML_BRACES_SEQUENCE}? ({XML_TEXT_CHAR} {XML_BRACES_SEQUENCE}?)+ | {XML_BRACES_SEQUENCE} ({XML_TEXT_CHAR} {XML_BRACES_SEQUENCE}?)*
XML_TEXT_CHAR = [^<&`{}] | '\\' [`] | {XML_WS} | {XML_ESCAPED_SEQUENCE}
XML_ESCAPED_SEQUENCE =  "\\" | "\{{" | "\}}"
XML_BRACES_SEQUENCE = "{}"+ | "}{" | ("{}")* "{" | "}" ("{}")*

// XML_TAG
XML_TAG_CLOSE = ">"
XML_TAG_SPECIAL_CLOSE = "?>"
XML_TAG_SLASH_CLOSE = "/>"
SLASH = "/"
QNAME_SEPARATOR = ":"
EQUALS = "="
DOUBLE_QUOTE = "\""
SINGLE_QUOTE = "'"
XML_QNAME = {NAME_START_CHAR} {NAME_CHAR}*
XML_TAG_WS = [ \t\r\n]
XML_TAG_EXPRESSION_START = {EXPRESSION_START}
HEX_DIGIT = [0-9a-fA-F]
NAME_CHAR = {NAME_START_CHAR} | "-" | "_" | "." | {DIGIT} | \u00B7 | [\u0300-\u036F] | [\u203F-\u2040]
NAME_START_CHAR = [a-zA-Z] | [\u2070-\u218F] | [\u2C00-\u2FEF] | [\u3001-\uD7FF] | [\uF900-\uFDCF] | [\uFDF0-\uFFFD]

// DOUBLE_QUOTED_XML_STRING
DOUBLE_QUOTE_END = "\""
XML_DOUBLE_QUOTED_TEMPLATE_STRING = {XML_DOUBLE_QUOTED_STRING_SEQUENCE}? {EXPRESSION_START}
XML_DOUBLE_QUOTED_STRING_SEQUENCE = {XML_BRACES_SEQUENCE}? ({XMLDoubleQuotedStringChar} {XML_BRACES_SEQUENCE}?)+ | {XML_BRACES_SEQUENCE} ({XMLDoubleQuotedStringChar} {XML_BRACES_SEQUENCE}?)*
XMLDoubleQuotedStringChar = [^<\"{}\\] | {XML_ESCAPED_SEQUENCE}

// SINGLE_QUOTED_XML_STRING
SINGLE_QUOTE_END = "'"
XML_SINGLE_QUOTED_TEMPLATE_STRING = {XML_SINGLE_QUOTED_STRING_SEQUENCE}? {EXPRESSION_START}
XML_SINGLE_QUOTED_STRING_SEQUENCE = {XML_BRACES_SEQUENCE}? ({XMLSingleQuotedStringChar} {XML_BRACES_SEQUENCE}?)+ | {XML_BRACES_SEQUENCE} ({XMLSingleQuotedStringChar} {XML_BRACES_SEQUENCE}?)*
XMLSingleQuotedStringChar = [^<'{}\\] | {XML_ESCAPED_SEQUENCE}

// XML_PI
XML_PI_END = {XML_TAG_SPECIAL_CLOSE}
XML_PI_TEXT = {XML_PI_TEXT_FRAGMENT} {XML_PI_END}
XML_PI_TEMPLATE_TEXT = {XML_PI_TEXT_FRAGMENT} {XML_ESCAPED_SEQUENCE}
XML_PI_TEXT_FRAGMENT = {XML_PI_ALLOWED_SEQUENCE}? ({XML_PI_CHAR} {XML_PI_ALLOWED_SEQUENCE}?)*
XML_PI_CHAR = [^{}?>] | {XML_ESCAPED_SEQUENCE}
XML_PI_ALLOWED_SEQUENCE = {XML_BRACES_SEQUENCE} | {XML_PI_SPECIAL_SEQUENCE} | ({XML_BRACES_SEQUENCE} {XML_PI_SPECIAL_SEQUENCE})+ {XML_BRACES_SEQUENCE}? | ({XML_PI_SPECIAL_SEQUENCE} {XML_BRACES_SEQUENCE})+ {XML_PI_SPECIAL_SEQUENCE}?
XML_PI_SPECIAL_SEQUENCE = ">"+ | ">"* "?"+

// XML_COMMENT
XML_COMMENT_END = "-->"
XML_COMMENT_TEXT = {XML_COMMENT_TEXT_FRAGMENT} {XML_COMMENT_END}
XML_COMMENT_TEMPLATE_TEXT = {XML_COMMENT_TEXT_FRAGMENT} {EXPRESSION_START}
XML_COMMENT_TEXT_FRAGMENT = {XML_COMMENT_ALLOWED_SEQUENCE}? ({XML_COMMENT_CHAR} {XML_COMMENT_ALLOWED_SEQUENCE}?)*
XML_COMMENT_CHAR = [^{}>\\-] | {XML_ESCAPED_SEQUENCE}
XML_COMMENT_ALLOWED_SEQUENCE = {XML_BRACES_SEQUENCE} | {XML_COMMENT_SPECIAL_SEQUENCE} | ({XML_BRACES_SEQUENCE} {XML_COMMENT_SPECIAL_SEQUENCE})+ {XML_BRACES_SEQUENCE}? | ({XML_COMMENT_SPECIAL_SEQUENCE} {XML_BRACES_SEQUENCE})+ {XML_COMMENT_SPECIAL_SEQUENCE}?
XML_COMMENT_SPECIAL_SEQUENCE = ">"+ | (">"* "-" ">"+)+ | "-"? ">"* "-"+

HEX_DIGITS = {HEX_DIGIT} ({HEX_DIGIT_OR_UNDERSCORE}* {HEX_DIGIT})?
HEX_DIGIT_OR_UNDERSCORE = {HEX_DIGIT} | "_"

%state XML_MODE
%state XML_TAG_MODE
%state DOUBLE_QUOTED_XML_STRING_MODE
%state SINGLE_QUOTED_XML_STRING_MODE
%state XML_PI_MODE
%state XML_COMMENT_MODE

%state STRING_TEMPLATE_MODE

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

    {QUOTED_STRING_LITERAL}                 { return QUOTEDSTRINGLITERAL; }
    {IDENTIFIER}                            { return IDENTIFIER; }
    {LINE_COMMENT}                          { return LINE_COMMENT; }
    {INTIGER_LITERAL}                       { return INTEGERLITERAL; }

    {XML_LITERAL_START}                     { inXmlTemplate = true; yybegin(XML_MODE); return XML_LITERAL_START; }
    {STRING_TEMPLATE_LITERAL_START}         { inStringTemplate = true; yybegin(STRING_TEMPLATE_MODE); return STRING_TEMPLATE_LITERAL_START; }
    // Todo - Move to a separate logic
    {EXPRESSION_END}                        { if(inXmlTag){ yybegin(XML_TAG_MODE); return EXPRESSION_END;} else if(inXmlTemplate) { yybegin(XML_MODE); return EXPRESSION_END; } else if(inStringTemplate){ yybegin(STRING_TEMPLATE_MODE); return EXPRESSION_END; } else { yypushback(1); return RIGHT_BRACE; } }
    .                                       { return BAD_CHARACTER; }
}

<XML_MODE>{
    {XML_COMMENT_START}                     { yybegin(XML_COMMENT_MODE); return XML_COMMENT_START; }
    {CDATA}                                 { return CDATA; }
    {DTD}                                   {} // Todo - Need to return a value?
    {ENTITY_REF}                            { /*return ENTITY_REF;*/ }
    {CHAR_REF}                              { /*return CHAR_REF;*/ }
    {XML_TAG_SPECIAL_OPEN}                  { yybegin(XML_PI_MODE); return XML_TAG_SPECIAL_OPEN; }
    {XML_TAG_OPEN_SLASH}                    { yybegin(XML_TAG_MODE); return XML_TAG_OPEN_SLASH; }
    {XML_TAG_OPEN}                          { yybegin(XML_TAG_MODE); return XML_TAG_OPEN; }
    {XML_LITERAL_END}                       { inXmlTemplate = false; yybegin(YYINITIAL); return XML_LITERAL_END; }
    {XML_TEMPLATE_TEXT}                     { yybegin(YYINITIAL); return XML_TEMPLATE_TEXT; }
    {XML_TEXT_SEQUENCE}                     { return XML_TEXT_SEQUENCE; }
    .                                       { inXmlTemplate = false; return BAD_CHARACTER; }
}

<XML_TAG_MODE>{
    {XML_TAG_CLOSE}                         { yybegin(XML_MODE); return XML_TAG_CLOSE; }
    {XML_TAG_SPECIAL_CLOSE}                 { /*yybegin(XML_MODE); return XML_TAG_SPECIAL_CLOSE;*/ }
    {XML_TAG_SLASH_CLOSE}                   { yybegin(XML_MODE); return XML_TAG_SLASH_CLOSE; }
    {SLASH}                                 { /*return SLASH;*/ }
    {QNAME_SEPARATOR}                       { return QNAME_SEPARATOR; }
    {EQUALS}                                { return EQUALS; }
    {DOUBLE_QUOTE}                          { yybegin(DOUBLE_QUOTED_XML_STRING_MODE); return DOUBLE_QUOTE; }
    {SINGLE_QUOTE}                          { yybegin(SINGLE_QUOTED_XML_STRING_MODE); return SINGLE_QUOTE; }
    {XML_QNAME}                             { return XML_QNAME; }
    {XML_TAG_WS}                            { } // Todo - Need to return a value?
    {XML_TAG_EXPRESSION_START}              { inXmlTag = true; yybegin(YYINITIAL); return XML_TAG_EXPRESSION_START; }
    .                                       { inXmlTemplate = false; return BAD_CHARACTER; }
}

<DOUBLE_QUOTED_XML_STRING_MODE>{
    {DOUBLE_QUOTE_END}                      { yybegin(XML_TAG_MODE); return DOUBLE_QUOTE_END; }
    {XML_DOUBLE_QUOTED_TEMPLATE_STRING}     { yybegin(YYINITIAL); return XML_DOUBLE_QUOTED_TEMPLATE_STRING; }
    {XML_DOUBLE_QUOTED_STRING_SEQUENCE}     { return XML_DOUBLE_QUOTED_STRING_SEQUENCE; }
    .                                       { inXmlTemplate = false; return BAD_CHARACTER; }
}

<SINGLE_QUOTED_XML_STRING_MODE>{
    {SINGLE_QUOTE_END}                      { yybegin(XML_TAG_MODE); return SINGLE_QUOTE_END; }
    {XML_SINGLE_QUOTED_TEMPLATE_STRING}     { yybegin(YYINITIAL); return XML_SINGLE_QUOTED_TEMPLATE_STRING; }
    {XML_SINGLE_QUOTED_STRING_SEQUENCE}     { return XML_SINGLE_QUOTED_STRING_SEQUENCE; }
    .                                       { inXmlTemplate = false; return BAD_CHARACTER; }
}

<XML_PI_MODE>{
    {XML_PI_TEXT}                           { yybegin(XML_MODE); return XML_PI_TEXT; }
    {XML_PI_TEMPLATE_TEXT}                  { yybegin(YYINITIAL); return XML_PI_TEMPLATE_TEXT; }
    .                                       { inXmlTemplate = false; return BAD_CHARACTER; }
}

<XML_COMMENT_MODE>{
    {XML_COMMENT_TEXT}                      { yybegin(XML_MODE); return XML_COMMENT_TEXT; }
    {XML_COMMENT_TEMPLATE_TEXT}             { yybegin(YYINITIAL); return XML_COMMENT_TEMPLATE_TEXT; }
    .                                       { inXmlTemplate = false; return BAD_CHARACTER; }
}

<STRING_TEMPLATE_MODE>{
    {STRING_TEMPLATE_LITERAL_END}           { inXmlTemplate = false; yybegin(YYINITIAL); return STRING_TEMPLATE_LITERAL_END; }
    {STRING_TEMPLATE_EXPRESSION_START}      { yybegin(YYINITIAL); return STRING_TEMPLATE_EXPRESSION_START; }
    {STRING_TEMPLATE_TEXT}                  { return STRING_TEMPLATE_TEXT; }
    .                                       { inXmlTemplate = false; yybegin(YYINITIAL); return BAD_CHARACTER; }
}

[^] { return BAD_CHARACTER; }
