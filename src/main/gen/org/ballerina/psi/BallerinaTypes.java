/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package org.ballerina.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.ballerina.psi.impl.*;

public interface BallerinaTypes {

  IElementType ANON_STRUCT_TYPE_NAME = new BallerinaElementType("ANON_STRUCT_TYPE_NAME");
  IElementType ASSIGNMENT_STATEMENT = new BallerinaElementType("ASSIGNMENT_STATEMENT");
  IElementType BUILT_IN_REFERENCE_TYPE_NAME = new BallerinaElementType("BUILT_IN_REFERENCE_TYPE_NAME");
  IElementType BUILT_IN_TYPE_NAME = new BallerinaElementType("BUILT_IN_TYPE_NAME");
  IElementType CALLABLE_UNIT_BODY = new BallerinaElementType("CALLABLE_UNIT_BODY");
  IElementType CALLABLE_UNIT_SIGNATURE = new BallerinaElementType("CALLABLE_UNIT_SIGNATURE");
  IElementType DEFINITION = new BallerinaElementType("DEFINITION");
  IElementType EXPRESSION = new BallerinaElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new BallerinaElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STMT = new BallerinaElementType("EXPRESSION_STMT");
  IElementType FUNCTION_DEFINITION = new BallerinaElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new BallerinaElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_TYPE_NAME = new BallerinaElementType("FUNCTION_TYPE_NAME");
  IElementType IMPORT_DECLARATION = new BallerinaElementType("IMPORT_DECLARATION");
  IElementType LAMBDA_FUNCTION = new BallerinaElementType("LAMBDA_FUNCTION");
  IElementType NAME_REFERENCE = new BallerinaElementType("NAME_REFERENCE");
  IElementType NATIVE_FUNCTION_DEFINITION = new BallerinaElementType("NATIVE_FUNCTION_DEFINITION");
  IElementType NON_NATIVE_FUNCTION_DEFINITION = new BallerinaElementType("NON_NATIVE_FUNCTION_DEFINITION");
  IElementType PACKAGE_DECLARATION = new BallerinaElementType("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = new BallerinaElementType("PACKAGE_NAME");
  IElementType PARAMETER = new BallerinaElementType("PARAMETER");
  IElementType PARAMETER_LIST = new BallerinaElementType("PARAMETER_LIST");
  IElementType REFERENCE_TYPE_NAME = new BallerinaElementType("REFERENCE_TYPE_NAME");
  IElementType RESOURCE_DEFINITION = new BallerinaElementType("RESOURCE_DEFINITION");
  IElementType RETURN_PARAMETERS = new BallerinaElementType("RETURN_PARAMETERS");
  IElementType SERVICE_BODY = new BallerinaElementType("SERVICE_BODY");
  IElementType SERVICE_DEFINITION = new BallerinaElementType("SERVICE_DEFINITION");
  IElementType STATEMENT = new BallerinaElementType("STATEMENT");
  IElementType TYPE_NAME = new BallerinaElementType("TYPE_NAME");
  IElementType USER_DEFINE_TYPE_NAME = new BallerinaElementType("USER_DEFINE_TYPE_NAME");
  IElementType VALUE_TYPE_NAME = new BallerinaElementType("VALUE_TYPE_NAME");
  IElementType VARIABLE_DEFINITION_STATEMENT = new BallerinaElementType("VARIABLE_DEFINITION_STATEMENT");
  IElementType VARIABLE_REFERENCE = new BallerinaElementType("VARIABLE_REFERENCE");
  IElementType VARIABLE_REFERENCE_LIST = new BallerinaElementType("VARIABLE_REFERENCE_LIST");

  IElementType ABORT = new BallerinaTokenType("abort");
  IElementType ACTION = new BallerinaTokenType("action");
  IElementType ADD = new BallerinaTokenType("+");
  IElementType ALL = new BallerinaTokenType("all");
  IElementType AND = new BallerinaTokenType("&&");
  IElementType ANNOTATION = new BallerinaTokenType("annotation");
  IElementType AS = new BallerinaTokenType("as");
  IElementType ASSIGN = new BallerinaTokenType("=");
  IElementType AT = new BallerinaTokenType("@");
  IElementType ATTACH = new BallerinaTokenType("attach");
  IElementType BACKTICK = new BallerinaTokenType("`");
  IElementType BIND = new BallerinaTokenType("bind");
  IElementType BREAK = new BallerinaTokenType("break");
  IElementType CATCH = new BallerinaTokenType("catch");
  IElementType COLON = new BallerinaTokenType(":");
  IElementType COMMA = new BallerinaTokenType(",");
  IElementType CONNECTOR = new BallerinaTokenType("connector");
  IElementType CONST = new BallerinaTokenType("const");
  IElementType CREATE = new BallerinaTokenType("create");
  IElementType DIV = new BallerinaTokenType("/");
  IElementType DOT = new BallerinaTokenType(".");
  IElementType ELSE = new BallerinaTokenType("else");
  IElementType ENDPOINT = new BallerinaTokenType("endpoint");
  IElementType ENUM = new BallerinaTokenType("enum");
  IElementType EQUAL = new BallerinaTokenType("==");
  IElementType FAILED = new BallerinaTokenType("failed");
  IElementType FINALLY = new BallerinaTokenType("finally");
  IElementType FOREACH = new BallerinaTokenType("foreach");
  IElementType FORK = new BallerinaTokenType("fork");
  IElementType FUNCTION = new BallerinaTokenType("function");
  IElementType GT = new BallerinaTokenType(">");
  IElementType GT_EQUAL = new BallerinaTokenType(">=");
  IElementType IDENTIFIER = new BallerinaTokenType("identifier");
  IElementType IF = new BallerinaTokenType("if");
  IElementType IMPORT = new BallerinaTokenType("import");
  IElementType IN = new BallerinaTokenType("in");
  IElementType INDEX = new BallerinaTokenType("index");
  IElementType JOIN = new BallerinaTokenType("join");
  IElementType LARROW = new BallerinaTokenType("<-");
  IElementType LEFT_BRACE = new BallerinaTokenType("{");
  IElementType LEFT_BRACKET = new BallerinaTokenType("[");
  IElementType LEFT_PARENTHESIS = new BallerinaTokenType("(");
  IElementType LENGTHOF = new BallerinaTokenType("lengthof");
  IElementType LINE_COMMENT = new BallerinaTokenType("LINE_COMMENT");
  IElementType LOCK = new BallerinaTokenType("lock");
  IElementType LT = new BallerinaTokenType("<");
  IElementType LT_EQUAL = new BallerinaTokenType("<=");
  IElementType MOD = new BallerinaTokenType("%");
  IElementType MUL = new BallerinaTokenType("*");
  IElementType NATIVE = new BallerinaTokenType("native");
  IElementType NEXT = new BallerinaTokenType("next");
  IElementType NOT = new BallerinaTokenType("!");
  IElementType NOT_EQUAL = new BallerinaTokenType("!=");
  IElementType OR = new BallerinaTokenType("||");
  IElementType PACKAGE = new BallerinaTokenType("package");
  IElementType POW = new BallerinaTokenType("^");
  IElementType PRIVATE = new BallerinaTokenType("private");
  IElementType PUBLIC = new BallerinaTokenType("public");
  IElementType QUESTION_MARK = new BallerinaTokenType("?");
  IElementType RANGE = new BallerinaTokenType("..");
  IElementType RARROW = new BallerinaTokenType("->");
  IElementType RESOURCE = new BallerinaTokenType("resource");
  IElementType RETRIES = new BallerinaTokenType("retries");
  IElementType RETURN = new BallerinaTokenType("return");
  IElementType RETURNS = new BallerinaTokenType("returns");
  IElementType RIGHT_BRACE = new BallerinaTokenType("}");
  IElementType RIGHT_BRACKET = new BallerinaTokenType("]");
  IElementType RIGHT_PARENTHESIS = new BallerinaTokenType(")");
  IElementType SEMICOLON = new BallerinaTokenType(";");
  IElementType SERVICE = new BallerinaTokenType("service");
  IElementType SOME = new BallerinaTokenType("some");
  IElementType STRUCT = new BallerinaTokenType("struct");
  IElementType STRUCTBODY = new BallerinaTokenType("structBody");
  IElementType SUB = new BallerinaTokenType("-");
  IElementType THROW = new BallerinaTokenType("throw");
  IElementType TIMEOUT = new BallerinaTokenType("timeout");
  IElementType TRANSACTION = new BallerinaTokenType("transaction");
  IElementType TRANSFORMER = new BallerinaTokenType("transformer");
  IElementType TRY = new BallerinaTokenType("try");
  IElementType TYPEOF = new BallerinaTokenType("typeof");
  IElementType TYPE_ANY = new BallerinaTokenType("any");
  IElementType TYPE_BLOB = new BallerinaTokenType("blob");
  IElementType TYPE_BOOL = new BallerinaTokenType("boolean");
  IElementType TYPE_FLOAT = new BallerinaTokenType("float");
  IElementType TYPE_INT = new BallerinaTokenType("int");
  IElementType TYPE_JSON = new BallerinaTokenType("json");
  IElementType TYPE_MAP = new BallerinaTokenType("map");
  IElementType TYPE_STRING = new BallerinaTokenType("string");
  IElementType TYPE_TABLE = new BallerinaTokenType("table");
  IElementType TYPE_TYPE = new BallerinaTokenType("type");
  IElementType TYPE_XML = new BallerinaTokenType("xml");
  IElementType VAR = new BallerinaTokenType("var");
  IElementType VERSION = new BallerinaTokenType("VERSION");
  IElementType WHILE = new BallerinaTokenType("while");
  IElementType WITH = new BallerinaTokenType("with");
  IElementType WORKER = new BallerinaTokenType("worker");
  IElementType XMLLOCALNAME = new BallerinaTokenType("xmlLocalName");
  IElementType XMLNAMESPACENAME = new BallerinaTokenType("xmlNamespaceName");
  IElementType XMLNS = new BallerinaTokenType("xmlns");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANON_STRUCT_TYPE_NAME) {
        return new BallerinaAnonStructTypeNameImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new BallerinaAssignmentStatementImpl(node);
      }
      else if (type == BUILT_IN_REFERENCE_TYPE_NAME) {
        return new BallerinaBuiltInReferenceTypeNameImpl(node);
      }
      else if (type == BUILT_IN_TYPE_NAME) {
        return new BallerinaBuiltInTypeNameImpl(node);
      }
      else if (type == CALLABLE_UNIT_BODY) {
        return new BallerinaCallableUnitBodyImpl(node);
      }
      else if (type == CALLABLE_UNIT_SIGNATURE) {
        return new BallerinaCallableUnitSignatureImpl(node);
      }
      else if (type == DEFINITION) {
        return new BallerinaDefinitionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new BallerinaExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new BallerinaExpressionListImpl(node);
      }
      else if (type == EXPRESSION_STMT) {
        return new BallerinaExpressionStmtImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new BallerinaFunctionDefinitionImpl(node);
      }
      else if (type == FUNCTION_INVOCATION) {
        return new BallerinaFunctionInvocationImpl(node);
      }
      else if (type == FUNCTION_TYPE_NAME) {
        return new BallerinaFunctionTypeNameImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new BallerinaImportDeclarationImpl(node);
      }
      else if (type == LAMBDA_FUNCTION) {
        return new BallerinaLambdaFunctionImpl(node);
      }
      else if (type == NAME_REFERENCE) {
        return new BallerinaNameReferenceImpl(node);
      }
      else if (type == NATIVE_FUNCTION_DEFINITION) {
        return new BallerinaNativeFunctionDefinitionImpl(node);
      }
      else if (type == NON_NATIVE_FUNCTION_DEFINITION) {
        return new BallerinaNonNativeFunctionDefinitionImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new BallerinaPackageDeclarationImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new BallerinaPackageNameImpl(node);
      }
      else if (type == PARAMETER) {
        return new BallerinaParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new BallerinaParameterListImpl(node);
      }
      else if (type == REFERENCE_TYPE_NAME) {
        return new BallerinaReferenceTypeNameImpl(node);
      }
      else if (type == RESOURCE_DEFINITION) {
        return new BallerinaResourceDefinitionImpl(node);
      }
      else if (type == RETURN_PARAMETERS) {
        return new BallerinaReturnParametersImpl(node);
      }
      else if (type == SERVICE_BODY) {
        return new BallerinaServiceBodyImpl(node);
      }
      else if (type == SERVICE_DEFINITION) {
        return new BallerinaServiceDefinitionImpl(node);
      }
      else if (type == STATEMENT) {
        return new BallerinaStatementImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new BallerinaTypeNameImpl(node);
      }
      else if (type == USER_DEFINE_TYPE_NAME) {
        return new BallerinaUserDefineTypeNameImpl(node);
      }
      else if (type == VALUE_TYPE_NAME) {
        return new BallerinaValueTypeNameImpl(node);
      }
      else if (type == VARIABLE_DEFINITION_STATEMENT) {
        return new BallerinaVariableDefinitionStatementImpl(node);
      }
      else if (type == VARIABLE_REFERENCE) {
        return new BallerinaVariableReferenceImpl(node);
      }
      else if (type == VARIABLE_REFERENCE_LIST) {
        return new BallerinaVariableReferenceListImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
