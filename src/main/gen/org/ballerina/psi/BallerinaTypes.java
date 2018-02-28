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

  IElementType ABORT_STATEMENT = new BallerinaElementType("ABORT_STATEMENT");
  IElementType ACTION_DEFINITION = new BallerinaElementType("ACTION_DEFINITION");
  IElementType ALIAS = new BallerinaElementType("ALIAS");
  IElementType ANNOTATION_ATTACHMENT = new BallerinaElementType("ANNOTATION_ATTACHMENT");
  IElementType ANNOTATION_ATTRIBUTE = new BallerinaElementType("ANNOTATION_ATTRIBUTE");
  IElementType ANNOTATION_ATTRIBUTE_ARRAY = new BallerinaElementType("ANNOTATION_ATTRIBUTE_ARRAY");
  IElementType ANNOTATION_ATTRIBUTE_LIST = new BallerinaElementType("ANNOTATION_ATTRIBUTE_LIST");
  IElementType ANNOTATION_ATTRIBUTE_VALUE = new BallerinaElementType("ANNOTATION_ATTRIBUTE_VALUE");
  IElementType ANNOTATION_BODY = new BallerinaElementType("ANNOTATION_BODY");
  IElementType ANNOTATION_DEFINITION = new BallerinaElementType("ANNOTATION_DEFINITION");
  IElementType ANON_STRUCT_TYPE_NAME = new BallerinaElementType("ANON_STRUCT_TYPE_NAME");
  IElementType ARRAY_LITERAL = new BallerinaElementType("ARRAY_LITERAL");
  IElementType ASSIGNMENT_STATEMENT = new BallerinaElementType("ASSIGNMENT_STATEMENT");
  IElementType ATTACHMENT_POINT = new BallerinaElementType("ATTACHMENT_POINT");
  IElementType BIND_STATEMENT = new BallerinaElementType("BIND_STATEMENT");
  IElementType BREAK_STATEMENT = new BallerinaElementType("BREAK_STATEMENT");
  IElementType BUILT_IN_REFERENCE_TYPE_NAME = new BallerinaElementType("BUILT_IN_REFERENCE_TYPE_NAME");
  IElementType BUILT_IN_TYPE_NAME = new BallerinaElementType("BUILT_IN_TYPE_NAME");
  IElementType CALLABLE_UNIT_BODY = new BallerinaElementType("CALLABLE_UNIT_BODY");
  IElementType CALLABLE_UNIT_SIGNATURE = new BallerinaElementType("CALLABLE_UNIT_SIGNATURE");
  IElementType CATCH_CLAUSE = new BallerinaElementType("CATCH_CLAUSE");
  IElementType CATCH_CLAUSES = new BallerinaElementType("CATCH_CLAUSES");
  IElementType CONNECTOR_BODY = new BallerinaElementType("CONNECTOR_BODY");
  IElementType CONNECTOR_DEFINITION = new BallerinaElementType("CONNECTOR_DEFINITION");
  IElementType CONNECTOR_INIT = new BallerinaElementType("CONNECTOR_INIT");
  IElementType CONSTANT_DEFINITION = new BallerinaElementType("CONSTANT_DEFINITION");
  IElementType DEFINITION = new BallerinaElementType("DEFINITION");
  IElementType ELSE_CLAUSE = new BallerinaElementType("ELSE_CLAUSE");
  IElementType ELSE_IF_CLAUSE = new BallerinaElementType("ELSE_IF_CLAUSE");
  IElementType ENDPOINT_DECLARATION = new BallerinaElementType("ENDPOINT_DECLARATION");
  IElementType ENDPOINT_DEFINITION = new BallerinaElementType("ENDPOINT_DEFINITION");
  IElementType ENUMERATOR = new BallerinaElementType("ENUMERATOR");
  IElementType ENUM_DEFINITION = new BallerinaElementType("ENUM_DEFINITION");
  IElementType EXPRESSION = new BallerinaElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new BallerinaElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STMT = new BallerinaElementType("EXPRESSION_STMT");
  IElementType FAILED_CLAUSE = new BallerinaElementType("FAILED_CLAUSE");
  IElementType FIELD = new BallerinaElementType("FIELD");
  IElementType FIELD_DEFINITION = new BallerinaElementType("FIELD_DEFINITION");
  IElementType FINALLY_CLAUSE = new BallerinaElementType("FINALLY_CLAUSE");
  IElementType FOREACH_STATEMENT = new BallerinaElementType("FOREACH_STATEMENT");
  IElementType FORK_JOIN_STATEMENT = new BallerinaElementType("FORK_JOIN_STATEMENT");
  IElementType FUNCTION_DEFINITION = new BallerinaElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new BallerinaElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_TYPE_NAME = new BallerinaElementType("FUNCTION_TYPE_NAME");
  IElementType GLOBAL_VARIABLE_DEFINITION = new BallerinaElementType("GLOBAL_VARIABLE_DEFINITION");
  IElementType IF_CLAUSE = new BallerinaElementType("IF_CLAUSE");
  IElementType IF_ELSE_STATEMENT = new BallerinaElementType("IF_ELSE_STATEMENT");
  IElementType IMPORT_DECLARATION = new BallerinaElementType("IMPORT_DECLARATION");
  IElementType INDEX = new BallerinaElementType("INDEX");
  IElementType INT_RANGE_EXPRESSION = new BallerinaElementType("INT_RANGE_EXPRESSION");
  IElementType INVOCATION = new BallerinaElementType("INVOCATION");
  IElementType JOIN_CLAUSE = new BallerinaElementType("JOIN_CLAUSE");
  IElementType JOIN_CONDITIONS = new BallerinaElementType("JOIN_CONDITIONS");
  IElementType LAMBDA_FUNCTION = new BallerinaElementType("LAMBDA_FUNCTION");
  IElementType LOCK_STATEMENT = new BallerinaElementType("LOCK_STATEMENT");
  IElementType NAMESPACE_DECLARATION = new BallerinaElementType("NAMESPACE_DECLARATION");
  IElementType NAMESPACE_DECLARATION_STATEMENT = new BallerinaElementType("NAMESPACE_DECLARATION_STATEMENT");
  IElementType NAME_REFERENCE = new BallerinaElementType("NAME_REFERENCE");
  IElementType NATIVE_ACTION_DEFINITION = new BallerinaElementType("NATIVE_ACTION_DEFINITION");
  IElementType NATIVE_FUNCTION_DEFINITION = new BallerinaElementType("NATIVE_FUNCTION_DEFINITION");
  IElementType NEXT_STATEMENT = new BallerinaElementType("NEXT_STATEMENT");
  IElementType NON_NATIVE_ACTION_DEFINITION = new BallerinaElementType("NON_NATIVE_ACTION_DEFINITION");
  IElementType NON_NATIVE_FUNCTION_DEFINITION = new BallerinaElementType("NON_NATIVE_FUNCTION_DEFINITION");
  IElementType PACKAGE_DECLARATION = new BallerinaElementType("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = new BallerinaElementType("PACKAGE_NAME");
  IElementType PACKAGE_VERSION = new BallerinaElementType("PACKAGE_VERSION");
  IElementType PARAMETER = new BallerinaElementType("PARAMETER");
  IElementType PARAMETER_LIST = new BallerinaElementType("PARAMETER_LIST");
  IElementType PRIVATE_STRUCT_BODY = new BallerinaElementType("PRIVATE_STRUCT_BODY");
  IElementType RECORD_KEY = new BallerinaElementType("RECORD_KEY");
  IElementType RECORD_KEY_VALUE = new BallerinaElementType("RECORD_KEY_VALUE");
  IElementType RECORD_LITERAL = new BallerinaElementType("RECORD_LITERAL");
  IElementType REFERENCE_TYPE_NAME = new BallerinaElementType("REFERENCE_TYPE_NAME");
  IElementType RESOURCE_DEFINITION = new BallerinaElementType("RESOURCE_DEFINITION");
  IElementType RETRIES_STATEMENT = new BallerinaElementType("RETRIES_STATEMENT");
  IElementType RETURN_PARAMETERS = new BallerinaElementType("RETURN_PARAMETERS");
  IElementType RETURN_STATEMENT = new BallerinaElementType("RETURN_STATEMENT");
  IElementType SERVICE_BODY = new BallerinaElementType("SERVICE_BODY");
  IElementType SERVICE_DEFINITION = new BallerinaElementType("SERVICE_DEFINITION");
  IElementType SIMPLE_LITERAL = new BallerinaElementType("SIMPLE_LITERAL");
  IElementType STATEMENT = new BallerinaElementType("STATEMENT");
  IElementType STRUCT_BODY = new BallerinaElementType("STRUCT_BODY");
  IElementType STRUCT_DEFINITION = new BallerinaElementType("STRUCT_DEFINITION");
  IElementType THROW_STATEMENT = new BallerinaElementType("THROW_STATEMENT");
  IElementType TIMEOUT_CLAUSE = new BallerinaElementType("TIMEOUT_CLAUSE");
  IElementType TRANSACTION_CLAUSE = new BallerinaElementType("TRANSACTION_CLAUSE");
  IElementType TRANSACTION_PROPERTY_INIT_STATEMENT = new BallerinaElementType("TRANSACTION_PROPERTY_INIT_STATEMENT");
  IElementType TRANSACTION_PROPERTY_INIT_STATEMENT_LIST = new BallerinaElementType("TRANSACTION_PROPERTY_INIT_STATEMENT_LIST");
  IElementType TRANSACTION_STATEMENT = new BallerinaElementType("TRANSACTION_STATEMENT");
  IElementType TRANSFORMER_DEFINITION = new BallerinaElementType("TRANSFORMER_DEFINITION");
  IElementType TRIGGER_WORKER = new BallerinaElementType("TRIGGER_WORKER");
  IElementType TRY_CATCH_STATEMENT = new BallerinaElementType("TRY_CATCH_STATEMENT");
  IElementType TYPE_NAME = new BallerinaElementType("TYPE_NAME");
  IElementType USER_DEFINE_TYPE_NAME = new BallerinaElementType("USER_DEFINE_TYPE_NAME");
  IElementType VALUE_TYPE_NAME = new BallerinaElementType("VALUE_TYPE_NAME");
  IElementType VARIABLE_DEFINITION_STATEMENT = new BallerinaElementType("VARIABLE_DEFINITION_STATEMENT");
  IElementType VARIABLE_REFERENCE = new BallerinaElementType("VARIABLE_REFERENCE");
  IElementType VARIABLE_REFERENCE_LIST = new BallerinaElementType("VARIABLE_REFERENCE_LIST");
  IElementType WHILE_STATEMENT = new BallerinaElementType("WHILE_STATEMENT");
  IElementType WORKER_DECLARATION = new BallerinaElementType("WORKER_DECLARATION");
  IElementType WORKER_DEFINITION = new BallerinaElementType("WORKER_DEFINITION");
  IElementType WORKER_INTERACTION_STATEMENT = new BallerinaElementType("WORKER_INTERACTION_STATEMENT");
  IElementType WORKER_REPLY = new BallerinaElementType("WORKER_REPLY");
  IElementType XML_ATTRIB = new BallerinaElementType("XML_ATTRIB");
  IElementType XML_LOCAL_NAME = new BallerinaElementType("XML_LOCAL_NAME");
  IElementType XML_NAMESPACE_NAME = new BallerinaElementType("XML_NAMESPACE_NAME");

  IElementType ABORT = new BallerinaTokenType("abort");
  IElementType ACTION = new BallerinaTokenType("action");
  IElementType ADD = new BallerinaTokenType("+");
  IElementType ALL = new BallerinaTokenType("all");
  IElementType AND = new BallerinaTokenType("&&");
  IElementType ANNOTATION = new BallerinaTokenType("annotation");
  IElementType ANY = new BallerinaTokenType("any");
  IElementType ANYIDENTIFIERNAME = new BallerinaTokenType("AnyIdentifierName");
  IElementType AS = new BallerinaTokenType("as");
  IElementType ASSIGN = new BallerinaTokenType("=");
  IElementType AT = new BallerinaTokenType("@");
  IElementType ATTACH = new BallerinaTokenType("attach");
  IElementType BACKTICK = new BallerinaTokenType("`");
  IElementType BIND = new BallerinaTokenType("bind");
  IElementType BLOB = new BallerinaTokenType("blob");
  IElementType BOOLEAN = new BallerinaTokenType("boolean");
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
  IElementType FLOAT = new BallerinaTokenType("float");
  IElementType FOREACH = new BallerinaTokenType("foreach");
  IElementType FORK = new BallerinaTokenType("fork");
  IElementType FUNCTION = new BallerinaTokenType("function");
  IElementType GT = new BallerinaTokenType(">");
  IElementType GT_EQUAL = new BallerinaTokenType(">=");
  IElementType IDENTIFIER = new BallerinaTokenType("identifier");
  IElementType IF = new BallerinaTokenType("if");
  IElementType IMPORT = new BallerinaTokenType("import");
  IElementType IN = new BallerinaTokenType("in");
  IElementType INT = new BallerinaTokenType("int");
  IElementType INTEGERLITERAL = new BallerinaTokenType("IntegerLiteral");
  IElementType JOIN = new BallerinaTokenType("join");
  IElementType JSON = new BallerinaTokenType("json");
  IElementType LARROW = new BallerinaTokenType("<-");
  IElementType LEFT_BRACE = new BallerinaTokenType("{");
  IElementType LEFT_BRACKET = new BallerinaTokenType("[");
  IElementType LEFT_PARENTHESIS = new BallerinaTokenType("(");
  IElementType LENGTHOF = new BallerinaTokenType("lengthof");
  IElementType LINE_COMMENT = new BallerinaTokenType("LINE_COMMENT");
  IElementType LOCK = new BallerinaTokenType("lock");
  IElementType LT = new BallerinaTokenType("<");
  IElementType LT_EQUAL = new BallerinaTokenType("<=");
  IElementType MAP = new BallerinaTokenType("map");
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
  IElementType QUOTEDSTRINGLITERAL = new BallerinaTokenType("quotedStringLiteral");
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
  IElementType STRING = new BallerinaTokenType("string");
  IElementType STRUCT = new BallerinaTokenType("struct");
  IElementType SUB = new BallerinaTokenType("-");
  IElementType TABLE = new BallerinaTokenType("table");
  IElementType THROW = new BallerinaTokenType("throw");
  IElementType TIMEOUT = new BallerinaTokenType("timeout");
  IElementType TRANSACTION = new BallerinaTokenType("transaction");
  IElementType TRANSFORMER = new BallerinaTokenType("transformer");
  IElementType TRY = new BallerinaTokenType("try");
  IElementType TYPE = new BallerinaTokenType("type");
  IElementType TYPEOF = new BallerinaTokenType("typeof");
  IElementType TYPE_PARAMETER = new BallerinaTokenType("parameter");
  IElementType VAR = new BallerinaTokenType("var");
  IElementType VERSION = new BallerinaTokenType("version");
  IElementType WHILE = new BallerinaTokenType("while");
  IElementType WITH = new BallerinaTokenType("with");
  IElementType WORKER = new BallerinaTokenType("worker");
  IElementType XML = new BallerinaTokenType("xml");
  IElementType XMLNS = new BallerinaTokenType("xmlns");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ABORT_STATEMENT) {
        return new BallerinaAbortStatementImpl(node);
      }
      else if (type == ACTION_DEFINITION) {
        return new BallerinaActionDefinitionImpl(node);
      }
      else if (type == ALIAS) {
        return new BallerinaAliasImpl(node);
      }
      else if (type == ANNOTATION_ATTACHMENT) {
        return new BallerinaAnnotationAttachmentImpl(node);
      }
      else if (type == ANNOTATION_ATTRIBUTE) {
        return new BallerinaAnnotationAttributeImpl(node);
      }
      else if (type == ANNOTATION_ATTRIBUTE_ARRAY) {
        return new BallerinaAnnotationAttributeArrayImpl(node);
      }
      else if (type == ANNOTATION_ATTRIBUTE_LIST) {
        return new BallerinaAnnotationAttributeListImpl(node);
      }
      else if (type == ANNOTATION_ATTRIBUTE_VALUE) {
        return new BallerinaAnnotationAttributeValueImpl(node);
      }
      else if (type == ANNOTATION_BODY) {
        return new BallerinaAnnotationBodyImpl(node);
      }
      else if (type == ANNOTATION_DEFINITION) {
        return new BallerinaAnnotationDefinitionImpl(node);
      }
      else if (type == ANON_STRUCT_TYPE_NAME) {
        return new BallerinaAnonStructTypeNameImpl(node);
      }
      else if (type == ARRAY_LITERAL) {
        return new BallerinaArrayLiteralImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new BallerinaAssignmentStatementImpl(node);
      }
      else if (type == ATTACHMENT_POINT) {
        return new BallerinaAttachmentPointImpl(node);
      }
      else if (type == BIND_STATEMENT) {
        return new BallerinaBindStatementImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new BallerinaBreakStatementImpl(node);
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
      else if (type == CATCH_CLAUSE) {
        return new BallerinaCatchClauseImpl(node);
      }
      else if (type == CATCH_CLAUSES) {
        return new BallerinaCatchClausesImpl(node);
      }
      else if (type == CONNECTOR_BODY) {
        return new BallerinaConnectorBodyImpl(node);
      }
      else if (type == CONNECTOR_DEFINITION) {
        return new BallerinaConnectorDefinitionImpl(node);
      }
      else if (type == CONNECTOR_INIT) {
        return new BallerinaConnectorInitImpl(node);
      }
      else if (type == CONSTANT_DEFINITION) {
        return new BallerinaConstantDefinitionImpl(node);
      }
      else if (type == DEFINITION) {
        return new BallerinaDefinitionImpl(node);
      }
      else if (type == ELSE_CLAUSE) {
        return new BallerinaElseClauseImpl(node);
      }
      else if (type == ELSE_IF_CLAUSE) {
        return new BallerinaElseIfClauseImpl(node);
      }
      else if (type == ENDPOINT_DECLARATION) {
        return new BallerinaEndpointDeclarationImpl(node);
      }
      else if (type == ENDPOINT_DEFINITION) {
        return new BallerinaEndpointDefinitionImpl(node);
      }
      else if (type == ENUMERATOR) {
        return new BallerinaEnumeratorImpl(node);
      }
      else if (type == ENUM_DEFINITION) {
        return new BallerinaEnumDefinitionImpl(node);
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
      else if (type == FAILED_CLAUSE) {
        return new BallerinaFailedClauseImpl(node);
      }
      else if (type == FIELD) {
        return new BallerinaFieldImpl(node);
      }
      else if (type == FIELD_DEFINITION) {
        return new BallerinaFieldDefinitionImpl(node);
      }
      else if (type == FINALLY_CLAUSE) {
        return new BallerinaFinallyClauseImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new BallerinaForeachStatementImpl(node);
      }
      else if (type == FORK_JOIN_STATEMENT) {
        return new BallerinaForkJoinStatementImpl(node);
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
      else if (type == GLOBAL_VARIABLE_DEFINITION) {
        return new BallerinaGlobalVariableDefinitionImpl(node);
      }
      else if (type == IF_CLAUSE) {
        return new BallerinaIfClauseImpl(node);
      }
      else if (type == IF_ELSE_STATEMENT) {
        return new BallerinaIfElseStatementImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new BallerinaImportDeclarationImpl(node);
      }
      else if (type == INDEX) {
        return new BallerinaIndexImpl(node);
      }
      else if (type == INT_RANGE_EXPRESSION) {
        return new BallerinaIntRangeExpressionImpl(node);
      }
      else if (type == INVOCATION) {
        return new BallerinaInvocationImpl(node);
      }
      else if (type == JOIN_CLAUSE) {
        return new BallerinaJoinClauseImpl(node);
      }
      else if (type == JOIN_CONDITIONS) {
        return new BallerinaJoinConditionsImpl(node);
      }
      else if (type == LAMBDA_FUNCTION) {
        return new BallerinaLambdaFunctionImpl(node);
      }
      else if (type == LOCK_STATEMENT) {
        return new BallerinaLockStatementImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION) {
        return new BallerinaNamespaceDeclarationImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION_STATEMENT) {
        return new BallerinaNamespaceDeclarationStatementImpl(node);
      }
      else if (type == NAME_REFERENCE) {
        return new BallerinaNameReferenceImpl(node);
      }
      else if (type == NATIVE_ACTION_DEFINITION) {
        return new BallerinaNativeActionDefinitionImpl(node);
      }
      else if (type == NATIVE_FUNCTION_DEFINITION) {
        return new BallerinaNativeFunctionDefinitionImpl(node);
      }
      else if (type == NEXT_STATEMENT) {
        return new BallerinaNextStatementImpl(node);
      }
      else if (type == NON_NATIVE_ACTION_DEFINITION) {
        return new BallerinaNonNativeActionDefinitionImpl(node);
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
      else if (type == PACKAGE_VERSION) {
        return new BallerinaPackageVersionImpl(node);
      }
      else if (type == PARAMETER) {
        return new BallerinaParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new BallerinaParameterListImpl(node);
      }
      else if (type == PRIVATE_STRUCT_BODY) {
        return new BallerinaPrivateStructBodyImpl(node);
      }
      else if (type == RECORD_KEY) {
        return new BallerinaRecordKeyImpl(node);
      }
      else if (type == RECORD_KEY_VALUE) {
        return new BallerinaRecordKeyValueImpl(node);
      }
      else if (type == RECORD_LITERAL) {
        return new BallerinaRecordLiteralImpl(node);
      }
      else if (type == REFERENCE_TYPE_NAME) {
        return new BallerinaReferenceTypeNameImpl(node);
      }
      else if (type == RESOURCE_DEFINITION) {
        return new BallerinaResourceDefinitionImpl(node);
      }
      else if (type == RETRIES_STATEMENT) {
        return new BallerinaRetriesStatementImpl(node);
      }
      else if (type == RETURN_PARAMETERS) {
        return new BallerinaReturnParametersImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new BallerinaReturnStatementImpl(node);
      }
      else if (type == SERVICE_BODY) {
        return new BallerinaServiceBodyImpl(node);
      }
      else if (type == SERVICE_DEFINITION) {
        return new BallerinaServiceDefinitionImpl(node);
      }
      else if (type == SIMPLE_LITERAL) {
        return new BallerinaSimpleLiteralImpl(node);
      }
      else if (type == STATEMENT) {
        return new BallerinaStatementImpl(node);
      }
      else if (type == STRUCT_BODY) {
        return new BallerinaStructBodyImpl(node);
      }
      else if (type == STRUCT_DEFINITION) {
        return new BallerinaStructDefinitionImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new BallerinaThrowStatementImpl(node);
      }
      else if (type == TIMEOUT_CLAUSE) {
        return new BallerinaTimeoutClauseImpl(node);
      }
      else if (type == TRANSACTION_CLAUSE) {
        return new BallerinaTransactionClauseImpl(node);
      }
      else if (type == TRANSACTION_PROPERTY_INIT_STATEMENT) {
        return new BallerinaTransactionPropertyInitStatementImpl(node);
      }
      else if (type == TRANSACTION_PROPERTY_INIT_STATEMENT_LIST) {
        return new BallerinaTransactionPropertyInitStatementListImpl(node);
      }
      else if (type == TRANSACTION_STATEMENT) {
        return new BallerinaTransactionStatementImpl(node);
      }
      else if (type == TRANSFORMER_DEFINITION) {
        return new BallerinaTransformerDefinitionImpl(node);
      }
      else if (type == TRIGGER_WORKER) {
        return new BallerinaTriggerWorkerImpl(node);
      }
      else if (type == TRY_CATCH_STATEMENT) {
        return new BallerinaTryCatchStatementImpl(node);
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
      else if (type == WHILE_STATEMENT) {
        return new BallerinaWhileStatementImpl(node);
      }
      else if (type == WORKER_DECLARATION) {
        return new BallerinaWorkerDeclarationImpl(node);
      }
      else if (type == WORKER_DEFINITION) {
        return new BallerinaWorkerDefinitionImpl(node);
      }
      else if (type == WORKER_INTERACTION_STATEMENT) {
        return new BallerinaWorkerInteractionStatementImpl(node);
      }
      else if (type == WORKER_REPLY) {
        return new BallerinaWorkerReplyImpl(node);
      }
      else if (type == XML_ATTRIB) {
        return new BallerinaXmlAttribImpl(node);
      }
      else if (type == XML_LOCAL_NAME) {
        return new BallerinaXmlLocalNameImpl(node);
      }
      else if (type == XML_NAMESPACE_NAME) {
        return new BallerinaXmlNamespaceNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
