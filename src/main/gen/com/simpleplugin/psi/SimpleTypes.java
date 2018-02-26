// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.simpleplugin.psi.impl.*;

public interface SimpleTypes {

  IElementType ANON_STRUCT_TYPE_NAME = new SimpleElementType("ANON_STRUCT_TYPE_NAME");
  IElementType ASSIGNMENT_STATEMENT = new SimpleElementType("ASSIGNMENT_STATEMENT");
  IElementType BUILT_IN_REFERENCE_TYPE_NAME = new SimpleElementType("BUILT_IN_REFERENCE_TYPE_NAME");
  IElementType BUILT_IN_TYPE_NAME = new SimpleElementType("BUILT_IN_TYPE_NAME");
  IElementType CALLABLE_UNIT_BODY = new SimpleElementType("CALLABLE_UNIT_BODY");
  IElementType CALLABLE_UNIT_SIGNATURE = new SimpleElementType("CALLABLE_UNIT_SIGNATURE");
  IElementType DEFINITION = new SimpleElementType("DEFINITION");
  IElementType EXPRESSION = new SimpleElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new SimpleElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STMT = new SimpleElementType("EXPRESSION_STMT");
  IElementType FUNCTION_DEFINITION = new SimpleElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new SimpleElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_TYPE_NAME = new SimpleElementType("FUNCTION_TYPE_NAME");
  IElementType IDENTIFIER = new SimpleElementType("IDENTIFIER");
  IElementType IMPORT_DECLARATION = new SimpleElementType("IMPORT_DECLARATION");
  IElementType LAMBDA_FUNCTION = new SimpleElementType("LAMBDA_FUNCTION");
  IElementType NAME_REFERENCE = new SimpleElementType("NAME_REFERENCE");
  IElementType NATIVE_FUNCTION_DEFINITION = new SimpleElementType("NATIVE_FUNCTION_DEFINITION");
  IElementType NON_NATIVE_FUNCTION_DEFINITION = new SimpleElementType("NON_NATIVE_FUNCTION_DEFINITION");
  IElementType PACKAGE_DECLARATION = new SimpleElementType("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = new SimpleElementType("PACKAGE_NAME");
  IElementType PARAMETER = new SimpleElementType("PARAMETER");
  IElementType PARAMETER_LIST = new SimpleElementType("PARAMETER_LIST");
  IElementType REFERENCE_TYPE_NAME = new SimpleElementType("REFERENCE_TYPE_NAME");
  IElementType RESOURCE_DEFINITION = new SimpleElementType("RESOURCE_DEFINITION");
  IElementType RETURN_PARAMETERS = new SimpleElementType("RETURN_PARAMETERS");
  IElementType SERVICE_BODY = new SimpleElementType("SERVICE_BODY");
  IElementType SERVICE_DEFINITION = new SimpleElementType("SERVICE_DEFINITION");
  IElementType STATEMENT = new SimpleElementType("STATEMENT");
  IElementType TYPE_NAME = new SimpleElementType("TYPE_NAME");
  IElementType USER_DEFINE_TYPE_NAME = new SimpleElementType("USER_DEFINE_TYPE_NAME");
  IElementType VALUE_TYPE_NAME = new SimpleElementType("VALUE_TYPE_NAME");
  IElementType VARIABLE_DEFINITION_STATEMENT = new SimpleElementType("VARIABLE_DEFINITION_STATEMENT");
  IElementType VARIABLE_REFERENCE = new SimpleElementType("VARIABLE_REFERENCE");
  IElementType VARIABLE_REFERENCE_LIST = new SimpleElementType("VARIABLE_REFERENCE_LIST");
  IElementType VERSION = new SimpleElementType("VERSION");

  IElementType ABORT = new SimpleTokenType("abort");
  IElementType ACTION = new SimpleTokenType("action");
  IElementType ADD = new SimpleTokenType("+");
  IElementType ALL = new SimpleTokenType("all");
  IElementType AND = new SimpleTokenType("&&");
  IElementType ANNOTATION = new SimpleTokenType("annotation");
  IElementType AS = new SimpleTokenType("as");
  IElementType ASSIGN = new SimpleTokenType("=");
  IElementType AT = new SimpleTokenType("@");
  IElementType ATTACH = new SimpleTokenType("attach");
  IElementType BACKTICK = new SimpleTokenType("`");
  IElementType BIND = new SimpleTokenType("bind");
  IElementType BREAK = new SimpleTokenType("break");
  IElementType CATCH = new SimpleTokenType("catch");
  IElementType COLON = new SimpleTokenType("COLON");
  IElementType COMMA = new SimpleTokenType(",");
  IElementType CONNECTOR = new SimpleTokenType("connector");
  IElementType CONST = new SimpleTokenType("const");
  IElementType CREATE = new SimpleTokenType("create");
  IElementType DIV = new SimpleTokenType("/");
  IElementType DOT = new SimpleTokenType(".");
  IElementType ELSE = new SimpleTokenType("else");
  IElementType ENDPOINT = new SimpleTokenType("endpoint");
  IElementType ENUM = new SimpleTokenType("enum");
  IElementType EQUAL = new SimpleTokenType("==");
  IElementType FAILED = new SimpleTokenType("failed");
  IElementType FINALLY = new SimpleTokenType("finally");
  IElementType FOREACH = new SimpleTokenType("foreach");
  IElementType FORK = new SimpleTokenType("fork");
  IElementType FUNCTION = new SimpleTokenType("function");
  IElementType GT = new SimpleTokenType(">");
  IElementType GT_EQUAL = new SimpleTokenType(">=");
  IElementType IF = new SimpleTokenType("if");
  IElementType IMPORT = new SimpleTokenType("import");
  IElementType IN = new SimpleTokenType("in");
  IElementType JOIN = new SimpleTokenType("join");
  IElementType LARROW = new SimpleTokenType("<-");
  IElementType LEFT_BRACE = new SimpleTokenType("{");
  IElementType LEFT_BRACKET = new SimpleTokenType("[");
  IElementType LEFT_PARENTHESIS = new SimpleTokenType("(");
  IElementType LENGTHOF = new SimpleTokenType("lengthof");
  IElementType LETTER = new SimpleTokenType("Letter");
  IElementType LETTERORDIGIT = new SimpleTokenType("LetterOrDigit");
  IElementType LINE_COMMENT = new SimpleTokenType("LINE_COMMENT");
  IElementType LOCK = new SimpleTokenType("lock");
  IElementType LT = new SimpleTokenType("<");
  IElementType LT_EQUAL = new SimpleTokenType("<=");
  IElementType MOD = new SimpleTokenType("%");
  IElementType MUL = new SimpleTokenType("*");
  IElementType NATIVE = new SimpleTokenType("native");
  IElementType NEXT = new SimpleTokenType("next");
  IElementType NOT = new SimpleTokenType("!");
  IElementType NOT_EQUAL = new SimpleTokenType("!=");
  IElementType OR = new SimpleTokenType("||");
  IElementType PACKAGE = new SimpleTokenType("package");
  IElementType POW = new SimpleTokenType("^");
  IElementType PRIVATE = new SimpleTokenType("private");
  IElementType PUBLIC = new SimpleTokenType("public");
  IElementType QUESTION_MARK = new SimpleTokenType("?");
  IElementType RANGE = new SimpleTokenType("..");
  IElementType RARROW = new SimpleTokenType("->");
  IElementType RESOURCE = new SimpleTokenType("resource");
  IElementType RETRIES = new SimpleTokenType("retries");
  IElementType RETURN = new SimpleTokenType("return");
  IElementType RETURNS = new SimpleTokenType("returns");
  IElementType RIGHT_BRACE = new SimpleTokenType("}");
  IElementType RIGHT_BRACKET = new SimpleTokenType("]");
  IElementType RIGHT_PARENTHESIS = new SimpleTokenType(")");
  IElementType SEMICOLON = new SimpleTokenType(";");
  IElementType SERVICE = new SimpleTokenType("service");
  IElementType SOME = new SimpleTokenType("some");
  IElementType STRUCT = new SimpleTokenType("struct");
  IElementType STRUCTBODY = new SimpleTokenType("structBody");
  IElementType SUB = new SimpleTokenType("-");
  IElementType THROW = new SimpleTokenType("throw");
  IElementType TIMEOUT = new SimpleTokenType("timeout");
  IElementType TRANSACTION = new SimpleTokenType("transaction");
  IElementType TRANSFORMER = new SimpleTokenType("transformer");
  IElementType TRY = new SimpleTokenType("try");
  IElementType TYPEOF = new SimpleTokenType("typeof");
  IElementType TYPE_ANY = new SimpleTokenType("any");
  IElementType TYPE_BLOB = new SimpleTokenType("blob");
  IElementType TYPE_BOOL = new SimpleTokenType("boolean");
  IElementType TYPE_FLOAT = new SimpleTokenType("float");
  IElementType TYPE_INT = new SimpleTokenType("int");
  IElementType TYPE_JSON = new SimpleTokenType("json");
  IElementType TYPE_MAP = new SimpleTokenType("map");
  IElementType TYPE_STRING = new SimpleTokenType("string");
  IElementType TYPE_TABLE = new SimpleTokenType("table");
  IElementType TYPE_TYPE = new SimpleTokenType("type");
  IElementType TYPE_XML = new SimpleTokenType("xml");
  IElementType VAR = new SimpleTokenType("var");
  IElementType WHILE = new SimpleTokenType("while");
  IElementType WITH = new SimpleTokenType("with");
  IElementType WORKER = new SimpleTokenType("worker");
  IElementType XMLLOCALNAME = new SimpleTokenType("xmlLocalName");
  IElementType XMLNAMESPACENAME = new SimpleTokenType("xmlNamespaceName");
  IElementType XMLNS = new SimpleTokenType("xmlns");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANON_STRUCT_TYPE_NAME) {
        return new SimpleAnonStructTypeNameImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new SimpleAssignmentStatementImpl(node);
      }
      else if (type == BUILT_IN_REFERENCE_TYPE_NAME) {
        return new SimpleBuiltInReferenceTypeNameImpl(node);
      }
      else if (type == BUILT_IN_TYPE_NAME) {
        return new SimpleBuiltInTypeNameImpl(node);
      }
      else if (type == CALLABLE_UNIT_BODY) {
        return new SimpleCallableUnitBodyImpl(node);
      }
      else if (type == CALLABLE_UNIT_SIGNATURE) {
        return new SimpleCallableUnitSignatureImpl(node);
      }
      else if (type == DEFINITION) {
        return new SimpleDefinitionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SimpleExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new SimpleExpressionListImpl(node);
      }
      else if (type == EXPRESSION_STMT) {
        return new SimpleExpressionStmtImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new SimpleFunctionDefinitionImpl(node);
      }
      else if (type == FUNCTION_INVOCATION) {
        return new SimpleFunctionInvocationImpl(node);
      }
      else if (type == FUNCTION_TYPE_NAME) {
        return new SimpleFunctionTypeNameImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new SimpleIdentifierImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new SimpleImportDeclarationImpl(node);
      }
      else if (type == LAMBDA_FUNCTION) {
        return new SimpleLambdaFunctionImpl(node);
      }
      else if (type == NAME_REFERENCE) {
        return new SimpleNameReferenceImpl(node);
      }
      else if (type == NATIVE_FUNCTION_DEFINITION) {
        return new SimpleNativeFunctionDefinitionImpl(node);
      }
      else if (type == NON_NATIVE_FUNCTION_DEFINITION) {
        return new SimpleNonNativeFunctionDefinitionImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new SimplePackageDeclarationImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new SimplePackageNameImpl(node);
      }
      else if (type == PARAMETER) {
        return new SimpleParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new SimpleParameterListImpl(node);
      }
      else if (type == REFERENCE_TYPE_NAME) {
        return new SimpleReferenceTypeNameImpl(node);
      }
      else if (type == RESOURCE_DEFINITION) {
        return new SimpleResourceDefinitionImpl(node);
      }
      else if (type == RETURN_PARAMETERS) {
        return new SimpleReturnParametersImpl(node);
      }
      else if (type == SERVICE_BODY) {
        return new SimpleServiceBodyImpl(node);
      }
      else if (type == SERVICE_DEFINITION) {
        return new SimpleServiceDefinitionImpl(node);
      }
      else if (type == STATEMENT) {
        return new SimpleStatementImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new SimpleTypeNameImpl(node);
      }
      else if (type == USER_DEFINE_TYPE_NAME) {
        return new SimpleUserDefineTypeNameImpl(node);
      }
      else if (type == VALUE_TYPE_NAME) {
        return new SimpleValueTypeNameImpl(node);
      }
      else if (type == VARIABLE_DEFINITION_STATEMENT) {
        return new SimpleVariableDefinitionStatementImpl(node);
      }
      else if (type == VARIABLE_REFERENCE) {
        return new SimpleVariableReferenceImpl(node);
      }
      else if (type == VARIABLE_REFERENCE_LIST) {
        return new SimpleVariableReferenceListImpl(node);
      }
      else if (type == VERSION) {
        return new SimpleVersionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
