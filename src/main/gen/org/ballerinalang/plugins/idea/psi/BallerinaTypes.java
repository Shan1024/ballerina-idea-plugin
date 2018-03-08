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
package org.ballerinalang.plugins.idea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.ballerinalang.plugins.idea.stubs.BallerinaElementTypeFactory;
import org.ballerinalang.plugins.idea.psi.impl.*;

public interface BallerinaTypes {

  IElementType ABORT_STATEMENT = new BallerinaCompositeElementType("ABORT_STATEMENT");
  IElementType ACTION_DEFINITION = new BallerinaCompositeElementType("ACTION_DEFINITION");
  IElementType ALIAS = new BallerinaCompositeElementType("ALIAS");
  IElementType ANNOTATION_ATTACHMENT = new BallerinaCompositeElementType("ANNOTATION_ATTACHMENT");
  IElementType ANNOTATION_ATTRIBUTE = new BallerinaCompositeElementType("ANNOTATION_ATTRIBUTE");
  IElementType ANNOTATION_ATTRIBUTE_ARRAY = new BallerinaCompositeElementType("ANNOTATION_ATTRIBUTE_ARRAY");
  IElementType ANNOTATION_ATTRIBUTE_LIST = new BallerinaCompositeElementType("ANNOTATION_ATTRIBUTE_LIST");
  IElementType ANNOTATION_ATTRIBUTE_VALUE = new BallerinaCompositeElementType("ANNOTATION_ATTRIBUTE_VALUE");
  IElementType ANNOTATION_BODY = new BallerinaCompositeElementType("ANNOTATION_BODY");
  IElementType ANNOTATION_DEFINITION = new BallerinaCompositeElementType("ANNOTATION_DEFINITION");
  IElementType ANON_STRUCT_TYPE_NAME = new BallerinaCompositeElementType("ANON_STRUCT_TYPE_NAME");
  IElementType ANY_IDENTIFIER_NAME = new BallerinaCompositeElementType("ANY_IDENTIFIER_NAME");
  IElementType ANY_TYPE_NAME = new BallerinaCompositeElementType("ANY_TYPE_NAME");
  IElementType ARRAY_LITERAL = new BallerinaCompositeElementType("ARRAY_LITERAL");
  IElementType ARRAY_TYPE_NAME = new BallerinaCompositeElementType("ARRAY_TYPE_NAME");
  IElementType ASSIGNMENT_STATEMENT = new BallerinaCompositeElementType("ASSIGNMENT_STATEMENT");
  IElementType ATTACHMENT_POINT = new BallerinaCompositeElementType("ATTACHMENT_POINT");
  IElementType BINARY_ADD_SUB_EXPRESSION = new BallerinaCompositeElementType("BINARY_ADD_SUB_EXPRESSION");
  IElementType BINARY_AND_EXPRESSION = new BallerinaCompositeElementType("BINARY_AND_EXPRESSION");
  IElementType BINARY_COMPARE_EXPRESSION = new BallerinaCompositeElementType("BINARY_COMPARE_EXPRESSION");
  IElementType BINARY_DIV_MUL_MOD_EXPRESSION = new BallerinaCompositeElementType("BINARY_DIV_MUL_MOD_EXPRESSION");
  IElementType BINARY_EQUAL_EXPRESSION = new BallerinaCompositeElementType("BINARY_EQUAL_EXPRESSION");
  IElementType BINARY_OR_EXPRESSION = new BallerinaCompositeElementType("BINARY_OR_EXPRESSION");
  IElementType BINARY_POW_EXPRESSION = new BallerinaCompositeElementType("BINARY_POW_EXPRESSION");
  IElementType BIND_STATEMENT = new BallerinaCompositeElementType("BIND_STATEMENT");
  IElementType BLOCK = new BallerinaCompositeElementType("BLOCK");
  IElementType BLOCK_WITH_ENDPOINT = new BallerinaCompositeElementType("BLOCK_WITH_ENDPOINT");
  IElementType BRACED_EXPRESSION = new BallerinaCompositeElementType("BRACED_EXPRESSION");
  IElementType BREAK_STATEMENT = new BallerinaCompositeElementType("BREAK_STATEMENT");
  IElementType BUILT_IN_REFERENCE_TYPE_NAME = new BallerinaCompositeElementType("BUILT_IN_REFERENCE_TYPE_NAME");
  IElementType BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION = new BallerinaCompositeElementType("BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION");
  IElementType BUILT_IN_TYPE_NAME = new BallerinaCompositeElementType("BUILT_IN_TYPE_NAME");
  IElementType CALLABLE_UNIT_BODY = new BallerinaCompositeElementType("CALLABLE_UNIT_BODY");
  IElementType CALLABLE_UNIT_SIGNATURE = new BallerinaCompositeElementType("CALLABLE_UNIT_SIGNATURE");
  IElementType CATCH_CLAUSE = new BallerinaCompositeElementType("CATCH_CLAUSE");
  IElementType CATCH_CLAUSES = new BallerinaCompositeElementType("CATCH_CLAUSES");
  IElementType CONNECTOR_BODY = new BallerinaCompositeElementType("CONNECTOR_BODY");
  IElementType CONNECTOR_DEFINITION = new BallerinaCompositeElementType("CONNECTOR_DEFINITION");
  IElementType CONNECTOR_INIT = new BallerinaCompositeElementType("CONNECTOR_INIT");
  IElementType CONNECTOR_INIT_EXPRESSION = new BallerinaCompositeElementType("CONNECTOR_INIT_EXPRESSION");
  IElementType CONSTANT_DEFINITION = new BallerinaCompositeElementType("CONSTANT_DEFINITION");
  IElementType DEFINITION = new BallerinaCompositeElementType("DEFINITION");
  IElementType ELSE_CLAUSE = new BallerinaCompositeElementType("ELSE_CLAUSE");
  IElementType ELSE_IF_CLAUSE = new BallerinaCompositeElementType("ELSE_IF_CLAUSE");
  IElementType ENDPOINT_DECLARATION = new BallerinaCompositeElementType("ENDPOINT_DECLARATION");
  IElementType ENDPOINT_DEFINITION = new BallerinaCompositeElementType("ENDPOINT_DEFINITION");
  IElementType ENUMERATOR = new BallerinaCompositeElementType("ENUMERATOR");
  IElementType ENUM_DEFINITION = new BallerinaCompositeElementType("ENUM_DEFINITION");
  IElementType EXPRESSION = new BallerinaCompositeElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new BallerinaCompositeElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STMT = new BallerinaCompositeElementType("EXPRESSION_STMT");
  IElementType FAILED_CLAUSE = new BallerinaCompositeElementType("FAILED_CLAUSE");
  IElementType FIELD = new BallerinaCompositeElementType("FIELD");
  IElementType FIELD_DEFINITION = new BallerinaCompositeElementType("FIELD_DEFINITION");
  IElementType FIELD_VARIABLE_REFERENCE = new BallerinaCompositeElementType("FIELD_VARIABLE_REFERENCE");
  IElementType FINALLY_CLAUSE = new BallerinaCompositeElementType("FINALLY_CLAUSE");
  IElementType FOREACH_STATEMENT = new BallerinaCompositeElementType("FOREACH_STATEMENT");
  IElementType FORK_JOIN_STATEMENT = new BallerinaCompositeElementType("FORK_JOIN_STATEMENT");
  IElementType FUNCTION_DEFINITION = BallerinaElementTypeFactory.stubFactory("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new BallerinaCompositeElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_INVOCATION_REFERENCE = new BallerinaCompositeElementType("FUNCTION_INVOCATION_REFERENCE");
  IElementType FUNCTION_TYPE_NAME = new BallerinaCompositeElementType("FUNCTION_TYPE_NAME");
  IElementType GLOBAL_VARIABLE_DEFINITION = new BallerinaCompositeElementType("GLOBAL_VARIABLE_DEFINITION");
  IElementType IF_CLAUSE = new BallerinaCompositeElementType("IF_CLAUSE");
  IElementType IF_ELSE_STATEMENT = new BallerinaCompositeElementType("IF_ELSE_STATEMENT");
  IElementType IMPORT_DECLARATION = new BallerinaCompositeElementType("IMPORT_DECLARATION");
  IElementType INDEX = new BallerinaCompositeElementType("INDEX");
  IElementType INT_RANGE_EXPRESSION = new BallerinaCompositeElementType("INT_RANGE_EXPRESSION");
  IElementType INVOCATION = new BallerinaCompositeElementType("INVOCATION");
  IElementType INVOCATION_REFERENCE = new BallerinaCompositeElementType("INVOCATION_REFERENCE");
  IElementType JOIN_CLAUSE = new BallerinaCompositeElementType("JOIN_CLAUSE");
  IElementType JOIN_CONDITIONS = new BallerinaCompositeElementType("JOIN_CONDITIONS");
  IElementType JSON_TYPE_NAME = new BallerinaCompositeElementType("JSON_TYPE_NAME");
  IElementType LAMBDA_FUNCTION = new BallerinaCompositeElementType("LAMBDA_FUNCTION");
  IElementType LAMBDA_FUNCTION_EXPRESSION = new BallerinaCompositeElementType("LAMBDA_FUNCTION_EXPRESSION");
  IElementType LOCK_STATEMENT = new BallerinaCompositeElementType("LOCK_STATEMENT");
  IElementType MAP_ARRAY_VARIABLE_REFERENCE = new BallerinaCompositeElementType("MAP_ARRAY_VARIABLE_REFERENCE");
  IElementType MAP_TYPE_NAME = new BallerinaCompositeElementType("MAP_TYPE_NAME");
  IElementType NAMESPACE_DECLARATION = new BallerinaCompositeElementType("NAMESPACE_DECLARATION");
  IElementType NAMESPACE_DECLARATION_STATEMENT = new BallerinaCompositeElementType("NAMESPACE_DECLARATION_STATEMENT");
  IElementType NAME_REFERENCE = new BallerinaCompositeElementType("NAME_REFERENCE");
  IElementType NEXT_STATEMENT = new BallerinaCompositeElementType("NEXT_STATEMENT");
  IElementType ORG_NAME = new BallerinaCompositeElementType("ORG_NAME");
  IElementType PACKAGE_DECLARATION = new BallerinaCompositeElementType("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = new BallerinaCompositeElementType("PACKAGE_NAME");
  IElementType PACKAGE_REFERENCE = new BallerinaCompositeElementType("PACKAGE_REFERENCE");
  IElementType PACKAGE_VERSION = new BallerinaCompositeElementType("PACKAGE_VERSION");
  IElementType PARAMETER = new BallerinaCompositeElementType("PARAMETER");
  IElementType PARAMETER_LIST = new BallerinaCompositeElementType("PARAMETER_LIST");
  IElementType PRIVATE_STRUCT_BODY = new BallerinaCompositeElementType("PRIVATE_STRUCT_BODY");
  IElementType RECEIVER = new BallerinaCompositeElementType("RECEIVER");
  IElementType RECORD_KEY = new BallerinaCompositeElementType("RECORD_KEY");
  IElementType RECORD_KEY_VALUE = new BallerinaCompositeElementType("RECORD_KEY_VALUE");
  IElementType RECORD_LITERAL = new BallerinaCompositeElementType("RECORD_LITERAL");
  IElementType REFERENCE_TYPE_NAME = new BallerinaCompositeElementType("REFERENCE_TYPE_NAME");
  IElementType RESERVED_WORD = new BallerinaCompositeElementType("RESERVED_WORD");
  IElementType RESOURCE_DEFINITION = new BallerinaCompositeElementType("RESOURCE_DEFINITION");
  IElementType RETRIES_STATEMENT = new BallerinaCompositeElementType("RETRIES_STATEMENT");
  IElementType RETURN_PARAMETERS = new BallerinaCompositeElementType("RETURN_PARAMETERS");
  IElementType RETURN_STATEMENT = new BallerinaCompositeElementType("RETURN_STATEMENT");
  IElementType SERVICE_BODY = new BallerinaCompositeElementType("SERVICE_BODY");
  IElementType SERVICE_DEFINITION = new BallerinaCompositeElementType("SERVICE_DEFINITION");
  IElementType SIMPLE_LITERAL = new BallerinaCompositeElementType("SIMPLE_LITERAL");
  IElementType SIMPLE_VARIABLE_REFERENCE = new BallerinaCompositeElementType("SIMPLE_VARIABLE_REFERENCE");
  IElementType STATEMENT = new BallerinaCompositeElementType("STATEMENT");
  IElementType STRUCT_BODY = new BallerinaCompositeElementType("STRUCT_BODY");
  IElementType STRUCT_DEFINITION = BallerinaElementTypeFactory.stubFactory("STRUCT_DEFINITION");
  IElementType TABLE_TYPE_NAME = new BallerinaCompositeElementType("TABLE_TYPE_NAME");
  IElementType TERNARY_EXPRESSION = new BallerinaCompositeElementType("TERNARY_EXPRESSION");
  IElementType THROW_STATEMENT = new BallerinaCompositeElementType("THROW_STATEMENT");
  IElementType TIMEOUT_CLAUSE = new BallerinaCompositeElementType("TIMEOUT_CLAUSE");
  IElementType TRANSACTION_CLAUSE = new BallerinaCompositeElementType("TRANSACTION_CLAUSE");
  IElementType TRANSACTION_PROPERTY_INIT_STATEMENT = new BallerinaCompositeElementType("TRANSACTION_PROPERTY_INIT_STATEMENT");
  IElementType TRANSACTION_PROPERTY_INIT_STATEMENT_LIST = new BallerinaCompositeElementType("TRANSACTION_PROPERTY_INIT_STATEMENT_LIST");
  IElementType TRANSACTION_STATEMENT = new BallerinaCompositeElementType("TRANSACTION_STATEMENT");
  IElementType TRANSFORMER_DEFINITION = new BallerinaCompositeElementType("TRANSFORMER_DEFINITION");
  IElementType TRIGGER_WORKER = new BallerinaCompositeElementType("TRIGGER_WORKER");
  IElementType TRY_CATCH_STATEMENT = new BallerinaCompositeElementType("TRY_CATCH_STATEMENT");
  IElementType TYPE_ACCESS_EXPRESSION = new BallerinaCompositeElementType("TYPE_ACCESS_EXPRESSION");
  IElementType TYPE_CASTING_EXPRESSION = new BallerinaCompositeElementType("TYPE_CASTING_EXPRESSION");
  IElementType TYPE_CONVERSION_EXPRESSION = new BallerinaCompositeElementType("TYPE_CONVERSION_EXPRESSION");
  IElementType TYPE_NAME = new BallerinaCompositeElementType("TYPE_NAME");
  IElementType TYPE_TYPE_NAME = new BallerinaCompositeElementType("TYPE_TYPE_NAME");
  IElementType UNARY_EXPRESSION = new BallerinaCompositeElementType("UNARY_EXPRESSION");
  IElementType USER_DEFINE_TYPE_NAME = new BallerinaCompositeElementType("USER_DEFINE_TYPE_NAME");
  IElementType VALUE_TYPE_NAME = new BallerinaCompositeElementType("VALUE_TYPE_NAME");
  IElementType VALUE_TYPE_TYPE_EXPRESSION = new BallerinaCompositeElementType("VALUE_TYPE_TYPE_EXPRESSION");
  IElementType VARIABLE_DEFINITION_STATEMENT = new BallerinaCompositeElementType("VARIABLE_DEFINITION_STATEMENT");
  IElementType VARIABLE_REFERENCE = new BallerinaCompositeElementType("VARIABLE_REFERENCE");
  IElementType VARIABLE_REFERENCE_EXPRESSION = new BallerinaCompositeElementType("VARIABLE_REFERENCE_EXPRESSION");
  IElementType VARIABLE_REFERENCE_LIST = new BallerinaCompositeElementType("VARIABLE_REFERENCE_LIST");
  IElementType WHILE_STATEMENT = new BallerinaCompositeElementType("WHILE_STATEMENT");
  IElementType WORKER_DECLARATION = new BallerinaCompositeElementType("WORKER_DECLARATION");
  IElementType WORKER_INTERACTION_STATEMENT = new BallerinaCompositeElementType("WORKER_INTERACTION_STATEMENT");
  IElementType WORKER_REPLY = new BallerinaCompositeElementType("WORKER_REPLY");
  IElementType XML_ATTRIB = new BallerinaCompositeElementType("XML_ATTRIB");
  IElementType XML_ATTRIB_VARIABLE_REFERENCE = new BallerinaCompositeElementType("XML_ATTRIB_VARIABLE_REFERENCE");
  IElementType XML_LOCAL_NAME = new BallerinaCompositeElementType("XML_LOCAL_NAME");
  IElementType XML_NAMESPACE_NAME = new BallerinaCompositeElementType("XML_NAMESPACE_NAME");
  IElementType XML_TYPE_NAME = new BallerinaCompositeElementType("XML_TYPE_NAME");

  IElementType ABORT = new BallerinaTokenType("abort");
  IElementType ACTION = new BallerinaTokenType("action");
  IElementType ADD = new BallerinaTokenType("+");
  IElementType ALL = new BallerinaTokenType("all");
  IElementType AND = new BallerinaTokenType("&&");
  IElementType ANNOTATION = new BallerinaTokenType("annotation");
  IElementType ANY = new BallerinaTokenType("any");
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
  IElementType INTEGERLITERAL = new BallerinaTokenType("integerLiteral");
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
      else if (type == ANY_IDENTIFIER_NAME) {
        return new BallerinaAnyIdentifierNameImpl(node);
      }
      else if (type == ANY_TYPE_NAME) {
        return new BallerinaAnyTypeNameImpl(node);
      }
      else if (type == ARRAY_LITERAL) {
        return new BallerinaArrayLiteralImpl(node);
      }
      else if (type == ARRAY_TYPE_NAME) {
        return new BallerinaArrayTypeNameImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new BallerinaAssignmentStatementImpl(node);
      }
      else if (type == ATTACHMENT_POINT) {
        return new BallerinaAttachmentPointImpl(node);
      }
      else if (type == BINARY_ADD_SUB_EXPRESSION) {
        return new BallerinaBinaryAddSubExpressionImpl(node);
      }
      else if (type == BINARY_AND_EXPRESSION) {
        return new BallerinaBinaryAndExpressionImpl(node);
      }
      else if (type == BINARY_COMPARE_EXPRESSION) {
        return new BallerinaBinaryCompareExpressionImpl(node);
      }
      else if (type == BINARY_DIV_MUL_MOD_EXPRESSION) {
        return new BallerinaBinaryDivMulModExpressionImpl(node);
      }
      else if (type == BINARY_EQUAL_EXPRESSION) {
        return new BallerinaBinaryEqualExpressionImpl(node);
      }
      else if (type == BINARY_OR_EXPRESSION) {
        return new BallerinaBinaryOrExpressionImpl(node);
      }
      else if (type == BINARY_POW_EXPRESSION) {
        return new BallerinaBinaryPowExpressionImpl(node);
      }
      else if (type == BIND_STATEMENT) {
        return new BallerinaBindStatementImpl(node);
      }
      else if (type == BLOCK) {
        return new BallerinaBlockImpl(node);
      }
      else if (type == BLOCK_WITH_ENDPOINT) {
        return new BallerinaBlockWithEndpointImpl(node);
      }
      else if (type == BRACED_EXPRESSION) {
        return new BallerinaBracedExpressionImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new BallerinaBreakStatementImpl(node);
      }
      else if (type == BUILT_IN_REFERENCE_TYPE_NAME) {
        return new BallerinaBuiltInReferenceTypeNameImpl(node);
      }
      else if (type == BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION) {
        return new BallerinaBuiltInReferenceTypeTypeExpressionImpl(node);
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
      else if (type == CONNECTOR_INIT_EXPRESSION) {
        return new BallerinaConnectorInitExpressionImpl(node);
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
      else if (type == FIELD_VARIABLE_REFERENCE) {
        return new BallerinaFieldVariableReferenceImpl(node);
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
      else if (type == FUNCTION_INVOCATION_REFERENCE) {
        return new BallerinaFunctionInvocationReferenceImpl(node);
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
      else if (type == INVOCATION_REFERENCE) {
        return new BallerinaInvocationReferenceImpl(node);
      }
      else if (type == JOIN_CLAUSE) {
        return new BallerinaJoinClauseImpl(node);
      }
      else if (type == JOIN_CONDITIONS) {
        return new BallerinaJoinConditionsImpl(node);
      }
      else if (type == JSON_TYPE_NAME) {
        return new BallerinaJsonTypeNameImpl(node);
      }
      else if (type == LAMBDA_FUNCTION) {
        return new BallerinaLambdaFunctionImpl(node);
      }
      else if (type == LAMBDA_FUNCTION_EXPRESSION) {
        return new BallerinaLambdaFunctionExpressionImpl(node);
      }
      else if (type == LOCK_STATEMENT) {
        return new BallerinaLockStatementImpl(node);
      }
      else if (type == MAP_ARRAY_VARIABLE_REFERENCE) {
        return new BallerinaMapArrayVariableReferenceImpl(node);
      }
      else if (type == MAP_TYPE_NAME) {
        return new BallerinaMapTypeNameImpl(node);
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
      else if (type == NEXT_STATEMENT) {
        return new BallerinaNextStatementImpl(node);
      }
      else if (type == ORG_NAME) {
        return new BallerinaOrgNameImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new BallerinaPackageDeclarationImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new BallerinaPackageNameImpl(node);
      }
      else if (type == PACKAGE_REFERENCE) {
        return new BallerinaPackageReferenceImpl(node);
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
      else if (type == RECEIVER) {
        return new BallerinaReceiverImpl(node);
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
      else if (type == RESERVED_WORD) {
        return new BallerinaReservedWordImpl(node);
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
      else if (type == SIMPLE_VARIABLE_REFERENCE) {
        return new BallerinaSimpleVariableReferenceImpl(node);
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
      else if (type == TABLE_TYPE_NAME) {
        return new BallerinaTableTypeNameImpl(node);
      }
      else if (type == TERNARY_EXPRESSION) {
        return new BallerinaTernaryExpressionImpl(node);
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
      else if (type == TYPE_ACCESS_EXPRESSION) {
        return new BallerinaTypeAccessExpressionImpl(node);
      }
      else if (type == TYPE_CASTING_EXPRESSION) {
        return new BallerinaTypeCastingExpressionImpl(node);
      }
      else if (type == TYPE_CONVERSION_EXPRESSION) {
        return new BallerinaTypeConversionExpressionImpl(node);
      }
      else if (type == TYPE_TYPE_NAME) {
        return new BallerinaTypeTypeNameImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new BallerinaUnaryExpressionImpl(node);
      }
      else if (type == USER_DEFINE_TYPE_NAME) {
        return new BallerinaUserDefineTypeNameImpl(node);
      }
      else if (type == VALUE_TYPE_NAME) {
        return new BallerinaValueTypeNameImpl(node);
      }
      else if (type == VALUE_TYPE_TYPE_EXPRESSION) {
        return new BallerinaValueTypeTypeExpressionImpl(node);
      }
      else if (type == VARIABLE_DEFINITION_STATEMENT) {
        return new BallerinaVariableDefinitionStatementImpl(node);
      }
      else if (type == VARIABLE_REFERENCE_EXPRESSION) {
        return new BallerinaVariableReferenceExpressionImpl(node);
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
      else if (type == WORKER_INTERACTION_STATEMENT) {
        return new BallerinaWorkerInteractionStatementImpl(node);
      }
      else if (type == WORKER_REPLY) {
        return new BallerinaWorkerReplyImpl(node);
      }
      else if (type == XML_ATTRIB) {
        return new BallerinaXmlAttribImpl(node);
      }
      else if (type == XML_ATTRIB_VARIABLE_REFERENCE) {
        return new BallerinaXmlAttribVariableReferenceImpl(node);
      }
      else if (type == XML_LOCAL_NAME) {
        return new BallerinaXmlLocalNameImpl(node);
      }
      else if (type == XML_NAMESPACE_NAME) {
        return new BallerinaXmlNamespaceNameImpl(node);
      }
      else if (type == XML_TYPE_NAME) {
        return new BallerinaXmlTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
