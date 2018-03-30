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
import org.ballerinalang.plugins.idea.stubs.factory.BallerinaElementTypeFactory;
import org.ballerinalang.plugins.idea.psi.impl.*;

public interface BallerinaTypes {

  IElementType ABORT_STATEMENT = new BallerinaCompositeElementType("ABORT_STATEMENT");
  IElementType ACTION_INVOCATION = new BallerinaCompositeElementType("ACTION_INVOCATION");
  IElementType ALIAS = BallerinaElementTypeFactory.stubFactory("ALIAS");
  IElementType ANNOTATED_TYPE_NAME = new BallerinaCompositeElementType("ANNOTATED_TYPE_NAME");
  IElementType ANNOTATION_ATTACHMENT = new BallerinaCompositeElementType("ANNOTATION_ATTACHMENT");
  IElementType ANNOTATION_DEFINITION = BallerinaElementTypeFactory.stubFactory("ANNOTATION_DEFINITION");
  IElementType ANON_STRUCT_TYPE_NAME = new BallerinaCompositeElementType("ANON_STRUCT_TYPE_NAME");
  IElementType ANY_IDENTIFIER_NAME = new BallerinaCompositeElementType("ANY_IDENTIFIER_NAME");
  IElementType ANY_TYPE_NAME = new BallerinaCompositeElementType("ANY_TYPE_NAME");
  IElementType ARRAY_LITERAL = new BallerinaCompositeElementType("ARRAY_LITERAL");
  IElementType ARRAY_LITERAL_EXPRESSION = new BallerinaCompositeElementType("ARRAY_LITERAL_EXPRESSION");
  IElementType ARRAY_TYPE_NAME = new BallerinaCompositeElementType("ARRAY_TYPE_NAME");
  IElementType ASSIGNMENT_STATEMENT = new BallerinaCompositeElementType("ASSIGNMENT_STATEMENT");
  IElementType ATTACHMENT_POINT = new BallerinaCompositeElementType("ATTACHMENT_POINT");
  IElementType ATTRIBUTE = new BallerinaCompositeElementType("ATTRIBUTE");
  IElementType AWAIT_EXPRESSION = new BallerinaCompositeElementType("AWAIT_EXPRESSION");
  IElementType AWAIT_EXPRESSION_REFERENCE = new BallerinaCompositeElementType("AWAIT_EXPRESSION_REFERENCE");
  IElementType BINARY_ADD_SUB_EXPRESSION = new BallerinaCompositeElementType("BINARY_ADD_SUB_EXPRESSION");
  IElementType BINARY_AND_EXPRESSION = new BallerinaCompositeElementType("BINARY_AND_EXPRESSION");
  IElementType BINARY_COMPARE_EXPRESSION = new BallerinaCompositeElementType("BINARY_COMPARE_EXPRESSION");
  IElementType BINARY_DIV_MUL_MOD_EXPRESSION = new BallerinaCompositeElementType("BINARY_DIV_MUL_MOD_EXPRESSION");
  IElementType BINARY_EQUAL_EXPRESSION = new BallerinaCompositeElementType("BINARY_EQUAL_EXPRESSION");
  IElementType BINARY_OR_EXPRESSION = new BallerinaCompositeElementType("BINARY_OR_EXPRESSION");
  IElementType BINARY_POW_EXPRESSION = new BallerinaCompositeElementType("BINARY_POW_EXPRESSION");
  IElementType BLOCK = new BallerinaCompositeElementType("BLOCK");
  IElementType BRACED_OR_TUPLE_EXPRESSION = new BallerinaCompositeElementType("BRACED_OR_TUPLE_EXPRESSION");
  IElementType BREAK_STATEMENT = new BallerinaCompositeElementType("BREAK_STATEMENT");
  IElementType BUILT_IN_REFERENCE_TYPE_NAME = new BallerinaCompositeElementType("BUILT_IN_REFERENCE_TYPE_NAME");
  IElementType BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION = new BallerinaCompositeElementType("BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION");
  IElementType BUILT_IN_TYPE_NAME = new BallerinaCompositeElementType("BUILT_IN_TYPE_NAME");
  IElementType CALLABLE_UNIT_BODY = new BallerinaCompositeElementType("CALLABLE_UNIT_BODY");
  IElementType CALLABLE_UNIT_SIGNATURE = new BallerinaCompositeElementType("CALLABLE_UNIT_SIGNATURE");
  IElementType CATCH_CLAUSE = new BallerinaCompositeElementType("CATCH_CLAUSE");
  IElementType CATCH_CLAUSES = new BallerinaCompositeElementType("CATCH_CLAUSES");
  IElementType CLOSE_TAG = new BallerinaCompositeElementType("CLOSE_TAG");
  IElementType COMMENT = new BallerinaCompositeElementType("COMMENT");
  IElementType COMPLETE_PACKAGE_NAME = new BallerinaCompositeElementType("COMPLETE_PACKAGE_NAME");
  IElementType COMPOUND_ASSIGNMENT_STATEMENT = new BallerinaCompositeElementType("COMPOUND_ASSIGNMENT_STATEMENT");
  IElementType COMPOUND_OPERATOR = new BallerinaCompositeElementType("COMPOUND_OPERATOR");
  IElementType CONSTANT_DEFINITION = BallerinaElementTypeFactory.stubFactory("CONSTANT_DEFINITION");
  IElementType CONTENT = new BallerinaCompositeElementType("CONTENT");
  IElementType DEFAULTABLE_PARAMETER = new BallerinaCompositeElementType("DEFAULTABLE_PARAMETER");
  IElementType DEFINITION = new BallerinaCompositeElementType("DEFINITION");
  IElementType DEPRECATED_ATTACHMENT = new BallerinaCompositeElementType("DEPRECATED_ATTACHMENT");
  IElementType DEPRECATED_TEMPLATE_INLINE_CODE = new BallerinaCompositeElementType("DEPRECATED_TEMPLATE_INLINE_CODE");
  IElementType DEPRECATED_TEXT = new BallerinaCompositeElementType("DEPRECATED_TEXT");
  IElementType DOCUMENTATION_ATTACHMENT = new BallerinaCompositeElementType("DOCUMENTATION_ATTACHMENT");
  IElementType DOCUMENTATION_TEMPLATE_ATTRIBUTE_DESCRIPTION = new BallerinaCompositeElementType("DOCUMENTATION_TEMPLATE_ATTRIBUTE_DESCRIPTION");
  IElementType DOCUMENTATION_TEMPLATE_CONTENT = new BallerinaCompositeElementType("DOCUMENTATION_TEMPLATE_CONTENT");
  IElementType DOCUMENTATION_TEMPLATE_INLINE_CODE = new BallerinaCompositeElementType("DOCUMENTATION_TEMPLATE_INLINE_CODE");
  IElementType DOC_TEXT = new BallerinaCompositeElementType("DOC_TEXT");
  IElementType DOUBLE_BACK_TICK_DEPRECATED_INLINE_CODE = new BallerinaCompositeElementType("DOUBLE_BACK_TICK_DEPRECATED_INLINE_CODE");
  IElementType DOUBLE_BACK_TICK_DOC_INLINE_CODE = new BallerinaCompositeElementType("DOUBLE_BACK_TICK_DOC_INLINE_CODE");
  IElementType ELEMENT = new BallerinaCompositeElementType("ELEMENT");
  IElementType ELSE_CLAUSE = new BallerinaCompositeElementType("ELSE_CLAUSE");
  IElementType ELSE_IF_CLAUSE = new BallerinaCompositeElementType("ELSE_IF_CLAUSE");
  IElementType EMPTY_TAG = new BallerinaCompositeElementType("EMPTY_TAG");
  IElementType ENDPOINT_DEFINITION = BallerinaElementTypeFactory.stubFactory("ENDPOINT_DEFINITION");
  IElementType ENDPOINT_INITLIZATION = new BallerinaCompositeElementType("ENDPOINT_INITLIZATION");
  IElementType ENDPOINT_PARAMETER = new BallerinaCompositeElementType("ENDPOINT_PARAMETER");
  IElementType ENDPOINT_TYPE = new BallerinaCompositeElementType("ENDPOINT_TYPE");
  IElementType ENUMERATOR = BallerinaElementTypeFactory.stubFactory("ENUMERATOR");
  IElementType ENUM_DEFINITION = BallerinaElementTypeFactory.stubFactory("ENUM_DEFINITION");
  IElementType EXPRESSION = new BallerinaCompositeElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new BallerinaCompositeElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STMT = new BallerinaCompositeElementType("EXPRESSION_STMT");
  IElementType FAIL_STATEMENT = new BallerinaCompositeElementType("FAIL_STATEMENT");
  IElementType FIELD = BallerinaElementTypeFactory.stubFactory("FIELD");
  IElementType FIELD_DEFINITION = BallerinaElementTypeFactory.stubFactory("FIELD_DEFINITION");
  IElementType FIELD_VARIABLE_REFERENCE = new BallerinaCompositeElementType("FIELD_VARIABLE_REFERENCE");
  IElementType FINALLY_CLAUSE = new BallerinaCompositeElementType("FINALLY_CLAUSE");
  IElementType FOREACH_STATEMENT = new BallerinaCompositeElementType("FOREACH_STATEMENT");
  IElementType FORK_JOIN_STATEMENT = new BallerinaCompositeElementType("FORK_JOIN_STATEMENT");
  IElementType FORMAL_PARAMETER_LIST = new BallerinaCompositeElementType("FORMAL_PARAMETER_LIST");
  IElementType FUNCTION_DEFINITION = BallerinaElementTypeFactory.stubFactory("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new BallerinaCompositeElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_INVOCATION_REFERENCE = new BallerinaCompositeElementType("FUNCTION_INVOCATION_REFERENCE");
  IElementType FUNCTION_TYPE_NAME = new BallerinaCompositeElementType("FUNCTION_TYPE_NAME");
  IElementType FUTURE_TYPE_NAME = new BallerinaCompositeElementType("FUTURE_TYPE_NAME");
  IElementType GLOBAL_ENDPOINT_DEFINITION = BallerinaElementTypeFactory.stubFactory("GLOBAL_ENDPOINT_DEFINITION");
  IElementType GLOBAL_VARIABLE_DEFINITION = BallerinaElementTypeFactory.stubFactory("GLOBAL_VARIABLE_DEFINITION");
  IElementType GROUP_TYPE_NAME = new BallerinaCompositeElementType("GROUP_TYPE_NAME");
  IElementType IF_CLAUSE = new BallerinaCompositeElementType("IF_CLAUSE");
  IElementType IF_ELSE_STATEMENT = new BallerinaCompositeElementType("IF_ELSE_STATEMENT");
  IElementType IMPORT_DECLARATION = new BallerinaCompositeElementType("IMPORT_DECLARATION");
  IElementType INDEX = new BallerinaCompositeElementType("INDEX");
  IElementType INTEGER_LITERAL = new BallerinaCompositeElementType("INTEGER_LITERAL");
  IElementType INT_RANGE_EXPRESSION = new BallerinaCompositeElementType("INT_RANGE_EXPRESSION");
  IElementType INVOCATION = new BallerinaCompositeElementType("INVOCATION");
  IElementType INVOCATION_ARG = new BallerinaCompositeElementType("INVOCATION_ARG");
  IElementType INVOCATION_ARG_LIST = new BallerinaCompositeElementType("INVOCATION_ARG_LIST");
  IElementType INVOCATION_REFERENCE = new BallerinaCompositeElementType("INVOCATION_REFERENCE");
  IElementType JOIN_CLAUSE = new BallerinaCompositeElementType("JOIN_CLAUSE");
  IElementType JOIN_CONDITIONS = new BallerinaCompositeElementType("JOIN_CONDITIONS");
  IElementType JSON_TYPE_NAME = new BallerinaCompositeElementType("JSON_TYPE_NAME");
  IElementType LAMBDA_FUNCTION = new BallerinaCompositeElementType("LAMBDA_FUNCTION");
  IElementType LAMBDA_FUNCTION_EXPRESSION = new BallerinaCompositeElementType("LAMBDA_FUNCTION_EXPRESSION");
  IElementType LOCK_STATEMENT = new BallerinaCompositeElementType("LOCK_STATEMENT");
  IElementType MAP_ARRAY_VARIABLE_REFERENCE = new BallerinaCompositeElementType("MAP_ARRAY_VARIABLE_REFERENCE");
  IElementType MAP_TYPE_NAME = new BallerinaCompositeElementType("MAP_TYPE_NAME");
  IElementType MATCH_PATTERN_CLAUSE = new BallerinaCompositeElementType("MATCH_PATTERN_CLAUSE");
  IElementType MATCH_STATEMENT = new BallerinaCompositeElementType("MATCH_STATEMENT");
  IElementType NAMED_ARGS = new BallerinaCompositeElementType("NAMED_ARGS");
  IElementType NAMESPACE_DECLARATION = BallerinaElementTypeFactory.stubFactory("NAMESPACE_DECLARATION");
  IElementType NAMESPACE_DECLARATION_STATEMENT = new BallerinaCompositeElementType("NAMESPACE_DECLARATION_STATEMENT");
  IElementType NAME_REFERENCE = BallerinaElementTypeFactory.stubFactory("NAME_REFERENCE");
  IElementType NEXT_STATEMENT = new BallerinaCompositeElementType("NEXT_STATEMENT");
  IElementType NULLABLE_TYPE_NAME = new BallerinaCompositeElementType("NULLABLE_TYPE_NAME");
  IElementType OBJECT_BODY = new BallerinaCompositeElementType("OBJECT_BODY");
  IElementType OBJECT_CALLABLE_UNIT_SIGNATURE = new BallerinaCompositeElementType("OBJECT_CALLABLE_UNIT_SIGNATURE");
  IElementType OBJECT_DEFAULTABLE_PARAMETER = new BallerinaCompositeElementType("OBJECT_DEFAULTABLE_PARAMETER");
  IElementType OBJECT_FIELD_DEFINITION = new BallerinaCompositeElementType("OBJECT_FIELD_DEFINITION");
  IElementType OBJECT_FUNCTIONS = new BallerinaCompositeElementType("OBJECT_FUNCTIONS");
  IElementType OBJECT_FUNCTION_DEFINITION = new BallerinaCompositeElementType("OBJECT_FUNCTION_DEFINITION");
  IElementType OBJECT_INITIALIZER = new BallerinaCompositeElementType("OBJECT_INITIALIZER");
  IElementType OBJECT_INITIALIZER_PARAMETER_LIST = new BallerinaCompositeElementType("OBJECT_INITIALIZER_PARAMETER_LIST");
  IElementType OBJECT_PARAMETER = new BallerinaCompositeElementType("OBJECT_PARAMETER");
  IElementType OBJECT_PARAMETER_LIST = new BallerinaCompositeElementType("OBJECT_PARAMETER_LIST");
  IElementType OBJECT_TYPE_NAME = new BallerinaCompositeElementType("OBJECT_TYPE_NAME");
  IElementType ONABORT_STATEMENT = new BallerinaCompositeElementType("ONABORT_STATEMENT");
  IElementType ONCOMMIT_STATEMENT = new BallerinaCompositeElementType("ONCOMMIT_STATEMENT");
  IElementType ONRETRY_CLAUSE = new BallerinaCompositeElementType("ONRETRY_CLAUSE");
  IElementType ORG_NAME = BallerinaElementTypeFactory.stubFactory("ORG_NAME");
  IElementType PACKAGE_DECLARATION = BallerinaElementTypeFactory.stubFactory("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = BallerinaElementTypeFactory.stubFactory("PACKAGE_NAME");
  IElementType PACKAGE_REFERENCE = BallerinaElementTypeFactory.stubFactory("PACKAGE_REFERENCE");
  IElementType PACKAGE_VERSION = BallerinaElementTypeFactory.stubFactory("PACKAGE_VERSION");
  IElementType PARAMETER = new BallerinaCompositeElementType("PARAMETER");
  IElementType PARAMETER_LIST = new BallerinaCompositeElementType("PARAMETER_LIST");
  IElementType PARAMETER_TYPE_NAME = new BallerinaCompositeElementType("PARAMETER_TYPE_NAME");
  IElementType PARAMETER_TYPE_NAME_LIST = new BallerinaCompositeElementType("PARAMETER_TYPE_NAME_LIST");
  IElementType POST_ARITHMETIC_OPERATOR = new BallerinaCompositeElementType("POST_ARITHMETIC_OPERATOR");
  IElementType POST_INCREMENT_STATEMENT = new BallerinaCompositeElementType("POST_INCREMENT_STATEMENT");
  IElementType PRIVATE_OBJECT_FIELDS = new BallerinaCompositeElementType("PRIVATE_OBJECT_FIELDS");
  IElementType PRIVATE_STRUCT_BODY = new BallerinaCompositeElementType("PRIVATE_STRUCT_BODY");
  IElementType PROC_INS = new BallerinaCompositeElementType("PROC_INS");
  IElementType PUBLIC_OBJECT_FIELDS = new BallerinaCompositeElementType("PUBLIC_OBJECT_FIELDS");
  IElementType RECORD_KEY = new BallerinaCompositeElementType("RECORD_KEY");
  IElementType RECORD_KEY_VALUE = new BallerinaCompositeElementType("RECORD_KEY_VALUE");
  IElementType RECORD_LITERAL = new BallerinaCompositeElementType("RECORD_LITERAL");
  IElementType RECORD_LITERAL_EXPRESSION = new BallerinaCompositeElementType("RECORD_LITERAL_EXPRESSION");
  IElementType REFERENCE_TYPE_NAME = new BallerinaCompositeElementType("REFERENCE_TYPE_NAME");
  IElementType RESERVED_WORD = new BallerinaCompositeElementType("RESERVED_WORD");
  IElementType RESOURCE_DEFINITION = new BallerinaCompositeElementType("RESOURCE_DEFINITION");
  IElementType RESOURCE_PARAMETER_LIST = new BallerinaCompositeElementType("RESOURCE_PARAMETER_LIST");
  IElementType REST_ARGS = new BallerinaCompositeElementType("REST_ARGS");
  IElementType REST_PARAMETER = new BallerinaCompositeElementType("REST_PARAMETER");
  IElementType RETRIES_STATEMENT = new BallerinaCompositeElementType("RETRIES_STATEMENT");
  IElementType RETURN_PARAMETER = new BallerinaCompositeElementType("RETURN_PARAMETER");
  IElementType RETURN_STATEMENT = new BallerinaCompositeElementType("RETURN_STATEMENT");
  IElementType SERVICE_BODY = new BallerinaCompositeElementType("SERVICE_BODY");
  IElementType SERVICE_DEFINITION = new BallerinaCompositeElementType("SERVICE_DEFINITION");
  IElementType SERVICE_ENDPOINT_ATTACHMENTS = new BallerinaCompositeElementType("SERVICE_ENDPOINT_ATTACHMENTS");
  IElementType SIMPLE_LITERAL = new BallerinaCompositeElementType("SIMPLE_LITERAL");
  IElementType SIMPLE_LITERAL_EXPRESSION = new BallerinaCompositeElementType("SIMPLE_LITERAL_EXPRESSION");
  IElementType SIMPLE_TYPE_NAME = new BallerinaCompositeElementType("SIMPLE_TYPE_NAME");
  IElementType SIMPLE_VARIABLE_REFERENCE = new BallerinaCompositeElementType("SIMPLE_VARIABLE_REFERENCE");
  IElementType SINGLE_BACK_TICK_DEPRECATED_INLINE_CODE = new BallerinaCompositeElementType("SINGLE_BACK_TICK_DEPRECATED_INLINE_CODE");
  IElementType SINGLE_BACK_TICK_DOC_INLINE_CODE = new BallerinaCompositeElementType("SINGLE_BACK_TICK_DOC_INLINE_CODE");
  IElementType START_TAG = new BallerinaCompositeElementType("START_TAG");
  IElementType STATEMENT = new BallerinaCompositeElementType("STATEMENT");
  IElementType STREAM_TYPE_NAME = new BallerinaCompositeElementType("STREAM_TYPE_NAME");
  IElementType STRING_TEMPLATE_CONTENT = new BallerinaCompositeElementType("STRING_TEMPLATE_CONTENT");
  IElementType STRING_TEMPLATE_LITERAL = new BallerinaCompositeElementType("STRING_TEMPLATE_LITERAL");
  IElementType STRING_TEMPLATE_LITERAL_EXPRESSION = new BallerinaCompositeElementType("STRING_TEMPLATE_LITERAL_EXPRESSION");
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
  IElementType TRANSFORMER_DEFINITION = BallerinaElementTypeFactory.stubFactory("TRANSFORMER_DEFINITION");
  IElementType TRIGGER_WORKER = new BallerinaCompositeElementType("TRIGGER_WORKER");
  IElementType TRIPLE_BACK_TICK_DEPRECATED_INLINE_CODE = new BallerinaCompositeElementType("TRIPLE_BACK_TICK_DEPRECATED_INLINE_CODE");
  IElementType TRIPLE_BACK_TICK_DOC_INLINE_CODE = new BallerinaCompositeElementType("TRIPLE_BACK_TICK_DOC_INLINE_CODE");
  IElementType TRY_CATCH_STATEMENT = new BallerinaCompositeElementType("TRY_CATCH_STATEMENT");
  IElementType TUPLE_DESTRUCTURING_STATEMENT = new BallerinaCompositeElementType("TUPLE_DESTRUCTURING_STATEMENT");
  IElementType TUPLE_TYPE_NAME = new BallerinaCompositeElementType("TUPLE_TYPE_NAME");
  IElementType TYPE_ACCESS_EXPRESSION = new BallerinaCompositeElementType("TYPE_ACCESS_EXPRESSION");
  IElementType TYPE_CONVERSION_EXPRESSION = new BallerinaCompositeElementType("TYPE_CONVERSION_EXPRESSION");
  IElementType TYPE_DEFINITION = new BallerinaCompositeElementType("TYPE_DEFINITION");
  IElementType TYPE_DESC_TYPE_NAME = new BallerinaCompositeElementType("TYPE_DESC_TYPE_NAME");
  IElementType TYPE_INIT_EXPR = new BallerinaCompositeElementType("TYPE_INIT_EXPR");
  IElementType TYPE_INIT_EXPRESSION = new BallerinaCompositeElementType("TYPE_INIT_EXPRESSION");
  IElementType TYPE_NAME = new BallerinaCompositeElementType("TYPE_NAME");
  IElementType UNARY_EXPRESSION = new BallerinaCompositeElementType("UNARY_EXPRESSION");
  IElementType UNION_TYPE_NAME = new BallerinaCompositeElementType("UNION_TYPE_NAME");
  IElementType USER_DEFINE_TYPE_NAME = new BallerinaCompositeElementType("USER_DEFINE_TYPE_NAME");
  IElementType VALUE_TYPE_NAME = new BallerinaCompositeElementType("VALUE_TYPE_NAME");
  IElementType VALUE_TYPE_TYPE_EXPRESSION = new BallerinaCompositeElementType("VALUE_TYPE_TYPE_EXPRESSION");
  IElementType VARIABLE_DEFINITION_STATEMENT = BallerinaElementTypeFactory.stubFactory("VARIABLE_DEFINITION_STATEMENT");
  IElementType VARIABLE_DEFINITION_STATEMENT_IN_SERVICE = new BallerinaCompositeElementType("VARIABLE_DEFINITION_STATEMENT_IN_SERVICE");
  IElementType VARIABLE_REFERENCE = new BallerinaCompositeElementType("VARIABLE_REFERENCE");
  IElementType VARIABLE_REFERENCE_EXPRESSION = new BallerinaCompositeElementType("VARIABLE_REFERENCE_EXPRESSION");
  IElementType VARIABLE_REFERENCE_LIST = new BallerinaCompositeElementType("VARIABLE_REFERENCE_LIST");
  IElementType WHILE_STATEMENT = new BallerinaCompositeElementType("WHILE_STATEMENT");
  IElementType WORKER_DEFINITION = BallerinaElementTypeFactory.stubFactory("WORKER_DEFINITION");
  IElementType WORKER_INTERACTION_STATEMENT = new BallerinaCompositeElementType("WORKER_INTERACTION_STATEMENT");
  IElementType WORKER_REPLY = new BallerinaCompositeElementType("WORKER_REPLY");
  IElementType XML_ATTRIB = new BallerinaCompositeElementType("XML_ATTRIB");
  IElementType XML_ATTRIB_VARIABLE_REFERENCE = new BallerinaCompositeElementType("XML_ATTRIB_VARIABLE_REFERENCE");
  IElementType XML_DOUBLE_QUOTED_STRING = new BallerinaCompositeElementType("XML_DOUBLE_QUOTED_STRING");
  IElementType XML_ITEM = new BallerinaCompositeElementType("XML_ITEM");
  IElementType XML_LITERAL = new BallerinaCompositeElementType("XML_LITERAL");
  IElementType XML_LITERAL_EXPRESSION = new BallerinaCompositeElementType("XML_LITERAL_EXPRESSION");
  IElementType XML_LOCAL_NAME = new BallerinaCompositeElementType("XML_LOCAL_NAME");
  IElementType XML_NAMESPACE_NAME = new BallerinaCompositeElementType("XML_NAMESPACE_NAME");
  IElementType XML_QUALIFIED_NAME = new BallerinaCompositeElementType("XML_QUALIFIED_NAME");
  IElementType XML_QUOTED_STRING = new BallerinaCompositeElementType("XML_QUOTED_STRING");
  IElementType XML_SINGLE_QUOTED_STRING = new BallerinaCompositeElementType("XML_SINGLE_QUOTED_STRING");
  IElementType XML_TEXT = new BallerinaCompositeElementType("XML_TEXT");
  IElementType XML_TYPE_NAME = new BallerinaCompositeElementType("XML_TYPE_NAME");

  IElementType ABORT = new BallerinaTokenType("abort");
  IElementType ADD = new BallerinaTokenType("+");
  IElementType ALL = new BallerinaTokenType("all");
  IElementType AND = new BallerinaTokenType("&&");
  IElementType ANNOTATION = new BallerinaTokenType("annotation");
  IElementType ANY = new BallerinaTokenType("any");
  IElementType AS = new BallerinaTokenType("as");
  IElementType ASSIGN = new BallerinaTokenType("=");
  IElementType ASYNC = new BallerinaTokenType("async");
  IElementType AT = new BallerinaTokenType("@");
  IElementType AWAIT = new BallerinaTokenType("await");
  IElementType BACKTICK = new BallerinaTokenType("`");
  IElementType BINARY_INTEGER_LITERAL = new BallerinaTokenType("BINARY_INTEGER_LITERAL");
  IElementType BIND = new BallerinaTokenType("bind");
  IElementType BLOB = new BallerinaTokenType("blob");
  IElementType BOOLEAN = new BallerinaTokenType("boolean");
  IElementType BOOLEAN_LITERAL = new BallerinaTokenType("BOOLEAN_LITERAL");
  IElementType BREAK = new BallerinaTokenType("break");
  IElementType CATCH = new BallerinaTokenType("catch");
  IElementType CDATA = new BallerinaTokenType("cdata");
  IElementType COLON = new BallerinaTokenType(":");
  IElementType COMMA = new BallerinaTokenType(",");
  IElementType COMPOUND_ADD = new BallerinaTokenType("+=");
  IElementType COMPOUND_DIV = new BallerinaTokenType("/=");
  IElementType COMPOUND_MUL = new BallerinaTokenType("*=");
  IElementType COMPOUND_SUB = new BallerinaTokenType("-=");
  IElementType CONST = new BallerinaTokenType("const");
  IElementType DB_DEPRECATED_INLINE_CODE_START = new BallerinaTokenType("DB_DEPRECATED_INLINE_CODE_START");
  IElementType DB_DOC_INLINE_CODE_START = new BallerinaTokenType("DB_DOC_INLINE_CODE_START");
  IElementType DECIMAL_INTEGER_LITERAL = new BallerinaTokenType("DECIMAL_INTEGER_LITERAL");
  IElementType DECREMENT = new BallerinaTokenType("--");
  IElementType DEPRECATED = new BallerinaTokenType("deprecated");
  IElementType DEPRECATED_TEMPLATE_END = new BallerinaTokenType("DEPRECATED_TEMPLATE_END");
  IElementType DEPRECATED_TEMPLATE_START = new BallerinaTokenType("DEPRECATED_TEMPLATE_START");
  IElementType DEPRECATED_TEMPLATE_TEXT = new BallerinaTokenType("DEPRECATED_TEMPLATE_TEXT");
  IElementType DIV = new BallerinaTokenType("/");
  IElementType DOCUMENTATION = new BallerinaTokenType("documentation");
  IElementType DOCUMENTATION_TEMPLATE_ATTRIBUTE_END = new BallerinaTokenType("DOCUMENTATION_TEMPLATE_ATTRIBUTE_END");
  IElementType DOCUMENTATION_TEMPLATE_ATTRIBUTE_START = new BallerinaTokenType("DOCUMENTATION_TEMPLATE_ATTRIBUTE_START");
  IElementType DOCUMENTATION_TEMPLATE_END = new BallerinaTokenType("DOCUMENTATION_TEMPLATE_END");
  IElementType DOCUMENTATION_TEMPLATE_START = new BallerinaTokenType("DOCUMENTATION_TEMPLATE_START");
  IElementType DOCUMENTATION_TEMPLATE_TEXT = new BallerinaTokenType("DOCUMENTATION_TEMPLATE_TEXT");
  IElementType DOT = new BallerinaTokenType(".");
  IElementType DOUBLE_BACK_TICK_INLINE_CODE = new BallerinaTokenType("DOUBLE_BACK_TICK_INLINE_CODE");
  IElementType DOUBLE_BACK_TICK_INLINE_CODE_END = new BallerinaTokenType("DOUBLE_BACK_TICK_INLINE_CODE_END");
  IElementType DOUBLE_COLON = new BallerinaTokenType("::");
  IElementType DOUBLE_QUOTE = new BallerinaTokenType("DOUBLE_QUOTE");
  IElementType DOUBLE_QUOTE_END = new BallerinaTokenType("DOUBLE_QUOTE_END");
  IElementType ELLIPSIS = new BallerinaTokenType("...");
  IElementType ELSE = new BallerinaTokenType("else");
  IElementType ENDPOINT = new BallerinaTokenType("endpoint");
  IElementType ENUM = new BallerinaTokenType("enum");
  IElementType EQUAL = new BallerinaTokenType("==");
  IElementType EQUALS = new BallerinaTokenType("EQUALS");
  IElementType EQUAL_GT = new BallerinaTokenType("=>");
  IElementType EXPRESSION_END = new BallerinaTokenType("EXPRESSION_END");
  IElementType FAIL = new BallerinaTokenType("fail");
  IElementType FINALLY = new BallerinaTokenType("finally");
  IElementType FLOAT = new BallerinaTokenType("float");
  IElementType FLOATING_POINT_LITERAL = new BallerinaTokenType("FLOATING_POINT_LITERAL");
  IElementType FOREACH = new BallerinaTokenType("foreach");
  IElementType FORK = new BallerinaTokenType("fork");
  IElementType FUNCTION = new BallerinaTokenType("function");
  IElementType FUTURE = new BallerinaTokenType("future");
  IElementType GT = new BallerinaTokenType(">");
  IElementType GT_EQUAL = new BallerinaTokenType(">=");
  IElementType HEX_INTEGER_LITERAL = new BallerinaTokenType("HEX_INTEGER_LITERAL");
  IElementType IDENTIFIER = new BallerinaTokenType("identifier");
  IElementType IF = new BallerinaTokenType("if");
  IElementType IMPORT = new BallerinaTokenType("import");
  IElementType IN = new BallerinaTokenType("in");
  IElementType INCREMENT = new BallerinaTokenType("++");
  IElementType INT = new BallerinaTokenType("int");
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
  IElementType MATCH = new BallerinaTokenType("match");
  IElementType MOD = new BallerinaTokenType("%");
  IElementType MUL = new BallerinaTokenType("*");
  IElementType NATIVE = new BallerinaTokenType("native");
  IElementType NEW = new BallerinaTokenType("new");
  IElementType NEXT = new BallerinaTokenType("next");
  IElementType NOT = new BallerinaTokenType("!");
  IElementType NOT_EQUAL = new BallerinaTokenType("!=");
  IElementType NULL_LITERAL = new BallerinaTokenType("NULL_LITERAL");
  IElementType OBJECT = new BallerinaTokenType("object");
  IElementType OCTAL_INTEGER_LITERAL = new BallerinaTokenType("OCTAL_INTEGER_LITERAL");
  IElementType ONABORT = new BallerinaTokenType("onabort");
  IElementType ONCOMMIT = new BallerinaTokenType("oncommit");
  IElementType ONRETRY = new BallerinaTokenType("onretry");
  IElementType OR = new BallerinaTokenType("||");
  IElementType PACKAGE = new BallerinaTokenType("package");
  IElementType PIPE = new BallerinaTokenType("|");
  IElementType POW = new BallerinaTokenType("^");
  IElementType PRIVATE = new BallerinaTokenType("private");
  IElementType PUBLIC = new BallerinaTokenType("public");
  IElementType QNAME_SEPARATOR = new BallerinaTokenType("QNAME_SEPARATOR");
  IElementType QUESTION_MARK = new BallerinaTokenType("?");
  IElementType QUOTED_STRING_LITERAL = new BallerinaTokenType("QUOTED_STRING_LITERAL");
  IElementType RANGE = new BallerinaTokenType("..");
  IElementType RARROW = new BallerinaTokenType("->");
  IElementType RESOURCE = new BallerinaTokenType("resource");
  IElementType RETRIES = new BallerinaTokenType("retries");
  IElementType RETURN = new BallerinaTokenType("return");
  IElementType RETURNS = new BallerinaTokenType("returns");
  IElementType RIGHT_BRACE = new BallerinaTokenType("}");
  IElementType RIGHT_BRACKET = new BallerinaTokenType("]");
  IElementType RIGHT_PARENTHESIS = new BallerinaTokenType(")");
  IElementType SAFE_ASSIGNMENT = new BallerinaTokenType("=?");
  IElementType SB_DEPRECATED_INLINE_CODE_START = new BallerinaTokenType("SB_DEPRECATED_INLINE_CODE_START");
  IElementType SB_DOC_INLINE_CODE_START = new BallerinaTokenType("SB_DOC_INLINE_CODE_START");
  IElementType SEMICOLON = new BallerinaTokenType(";");
  IElementType SERVICE = new BallerinaTokenType("service");
  IElementType SINGLE_BACK_TICK_INLINE_CODE = new BallerinaTokenType("SINGLE_BACK_TICK_INLINE_CODE");
  IElementType SINGLE_BACK_TICK_INLINE_CODE_END = new BallerinaTokenType("SINGLE_BACK_TICK_INLINE_CODE_END");
  IElementType SINGLE_QUOTE = new BallerinaTokenType("SINGLE_QUOTE");
  IElementType SINGLE_QUOTE_END = new BallerinaTokenType("SINGLE_QUOTE_END");
  IElementType SOME = new BallerinaTokenType("some");
  IElementType STREAM = new BallerinaTokenType("stream");
  IElementType STRING = new BallerinaTokenType("string");
  IElementType STRING_TEMPLATE_EXPRESSION_START = new BallerinaTokenType("STRING_TEMPLATE_EXPRESSION_START");
  IElementType STRING_TEMPLATE_LITERAL_END = new BallerinaTokenType("STRING_TEMPLATE_LITERAL_END");
  IElementType STRING_TEMPLATE_LITERAL_START = new BallerinaTokenType("STRING_TEMPLATE_LITERAL_START");
  IElementType STRING_TEMPLATE_TEXT = new BallerinaTokenType("STRING_TEMPLATE_TEXT");
  IElementType STRUCT = new BallerinaTokenType("struct");
  IElementType SUB = new BallerinaTokenType("-");
  IElementType TABLE = new BallerinaTokenType("table");
  IElementType TB_DEPRECATED_INLINE_CODE_START = new BallerinaTokenType("TB_DEPRECATED_INLINE_CODE_START");
  IElementType TB_DOC_INLINE_CODE_START = new BallerinaTokenType("TB_DOC_INLINE_CODE_START");
  IElementType THROW = new BallerinaTokenType("throw");
  IElementType TIMEOUT = new BallerinaTokenType("timeout");
  IElementType TRANSACTION = new BallerinaTokenType("transaction");
  IElementType TRANSFORMER = new BallerinaTokenType("transformer");
  IElementType TRIPLE_BACK_TICK_INLINE_CODE = new BallerinaTokenType("TRIPLE_BACK_TICK_INLINE_CODE");
  IElementType TRIPLE_BACK_TICK_INLINE_CODE_END = new BallerinaTokenType("TRIPLE_BACK_TICK_INLINE_CODE_END");
  IElementType TRY = new BallerinaTokenType("try");
  IElementType TYPE = new BallerinaTokenType("type");
  IElementType TYPEDESC = new BallerinaTokenType("typedesc");
  IElementType TYPEOF = new BallerinaTokenType("typeof");
  IElementType TYPE_PARAMETER = new BallerinaTokenType("TYPE_PARAMETER");
  IElementType UNTAINT = new BallerinaTokenType("untaint");
  IElementType VAR = new BallerinaTokenType("var");
  IElementType VERSION = new BallerinaTokenType("version");
  IElementType WHILE = new BallerinaTokenType("while");
  IElementType WITH = new BallerinaTokenType("WITH");
  IElementType WORKER = new BallerinaTokenType("worker");
  IElementType XML = new BallerinaTokenType("xml");
  IElementType XMLNS = new BallerinaTokenType("xmlns");
  IElementType XML_COMMENT_START = new BallerinaTokenType("XML_COMMENT_START");
  IElementType XML_COMMENT_TEMPLATE_TEXT = new BallerinaTokenType("XML_COMMENT_TEMPLATE_TEXT");
  IElementType XML_COMMENT_TEXT = new BallerinaTokenType("XML_COMMENT_TEXT");
  IElementType XML_DOUBLE_QUOTED_STRING_SEQUENCE = new BallerinaTokenType("XML_DOUBLE_QUOTED_STRING_SEQUENCE");
  IElementType XML_DOUBLE_QUOTED_TEMPLATE_STRING = new BallerinaTokenType("XML_DOUBLE_QUOTED_TEMPLATE_STRING");
  IElementType XML_LITERAL_END = new BallerinaTokenType("XML_LITERAL_END");
  IElementType XML_LITERAL_START = new BallerinaTokenType("XML_LITERAL_START");
  IElementType XML_PI_TEMPLATE_TEXT = new BallerinaTokenType("XML_PI_TEMPLATE_TEXT");
  IElementType XML_PI_TEXT = new BallerinaTokenType("XML_PI_TEXT");
  IElementType XML_QNAME = new BallerinaTokenType("XML_QNAME");
  IElementType XML_SINGLE_QUOTED_STRING_SEQUENCE = new BallerinaTokenType("XML_SINGLE_QUOTED_STRING_SEQUENCE");
  IElementType XML_SINGLE_QUOTED_TEMPLATE_STRING = new BallerinaTokenType("XML_SINGLE_QUOTED_TEMPLATE_STRING");
  IElementType XML_TAG_CLOSE = new BallerinaTokenType("XML_TAG_CLOSE");
  IElementType XML_TAG_EXPRESSION_START = new BallerinaTokenType("XML_TAG_EXPRESSION_START");
  IElementType XML_TAG_OPEN = new BallerinaTokenType("XML_TAG_OPEN");
  IElementType XML_TAG_OPEN_SLASH = new BallerinaTokenType("XML_TAG_OPEN_SLASH");
  IElementType XML_TAG_SLASH_CLOSE = new BallerinaTokenType("XML_TAG_SLASH_CLOSE");
  IElementType XML_TAG_SPECIAL_OPEN = new BallerinaTokenType("XML_TAG_SPECIAL_OPEN");
  IElementType XML_TEMPLATE_TEXT = new BallerinaTokenType("XML_TEMPLATE_TEXT");
  IElementType XML_TEXT_SEQUENCE = new BallerinaTokenType("XML_TEXT_SEQUENCE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ABORT_STATEMENT) {
        return new BallerinaAbortStatementImpl(node);
      }
      else if (type == ACTION_INVOCATION) {
        return new BallerinaActionInvocationImpl(node);
      }
      else if (type == ALIAS) {
        return new BallerinaAliasImpl(node);
      }
      else if (type == ANNOTATED_TYPE_NAME) {
        return new BallerinaAnnotatedTypeNameImpl(node);
      }
      else if (type == ANNOTATION_ATTACHMENT) {
        return new BallerinaAnnotationAttachmentImpl(node);
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
      else if (type == ARRAY_LITERAL_EXPRESSION) {
        return new BallerinaArrayLiteralExpressionImpl(node);
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
      else if (type == ATTRIBUTE) {
        return new BallerinaAttributeImpl(node);
      }
      else if (type == AWAIT_EXPRESSION) {
        return new BallerinaAwaitExpressionImpl(node);
      }
      else if (type == AWAIT_EXPRESSION_REFERENCE) {
        return new BallerinaAwaitExpressionReferenceImpl(node);
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
      else if (type == BLOCK) {
        return new BallerinaBlockImpl(node);
      }
      else if (type == BRACED_OR_TUPLE_EXPRESSION) {
        return new BallerinaBracedOrTupleExpressionImpl(node);
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
      else if (type == CLOSE_TAG) {
        return new BallerinaCloseTagImpl(node);
      }
      else if (type == COMMENT) {
        return new BallerinaCommentImpl(node);
      }
      else if (type == COMPLETE_PACKAGE_NAME) {
        return new BallerinaCompletePackageNameImpl(node);
      }
      else if (type == COMPOUND_ASSIGNMENT_STATEMENT) {
        return new BallerinaCompoundAssignmentStatementImpl(node);
      }
      else if (type == COMPOUND_OPERATOR) {
        return new BallerinaCompoundOperatorImpl(node);
      }
      else if (type == CONSTANT_DEFINITION) {
        return new BallerinaConstantDefinitionImpl(node);
      }
      else if (type == CONTENT) {
        return new BallerinaContentImpl(node);
      }
      else if (type == DEFAULTABLE_PARAMETER) {
        return new BallerinaDefaultableParameterImpl(node);
      }
      else if (type == DEFINITION) {
        return new BallerinaDefinitionImpl(node);
      }
      else if (type == DEPRECATED_ATTACHMENT) {
        return new BallerinaDeprecatedAttachmentImpl(node);
      }
      else if (type == DEPRECATED_TEMPLATE_INLINE_CODE) {
        return new BallerinaDeprecatedTemplateInlineCodeImpl(node);
      }
      else if (type == DEPRECATED_TEXT) {
        return new BallerinaDeprecatedTextImpl(node);
      }
      else if (type == DOCUMENTATION_ATTACHMENT) {
        return new BallerinaDocumentationAttachmentImpl(node);
      }
      else if (type == DOCUMENTATION_TEMPLATE_ATTRIBUTE_DESCRIPTION) {
        return new BallerinaDocumentationTemplateAttributeDescriptionImpl(node);
      }
      else if (type == DOCUMENTATION_TEMPLATE_CONTENT) {
        return new BallerinaDocumentationTemplateContentImpl(node);
      }
      else if (type == DOCUMENTATION_TEMPLATE_INLINE_CODE) {
        return new BallerinaDocumentationTemplateInlineCodeImpl(node);
      }
      else if (type == DOC_TEXT) {
        return new BallerinaDocTextImpl(node);
      }
      else if (type == DOUBLE_BACK_TICK_DEPRECATED_INLINE_CODE) {
        return new BallerinaDoubleBackTickDeprecatedInlineCodeImpl(node);
      }
      else if (type == DOUBLE_BACK_TICK_DOC_INLINE_CODE) {
        return new BallerinaDoubleBackTickDocInlineCodeImpl(node);
      }
      else if (type == ELEMENT) {
        return new BallerinaElementImpl(node);
      }
      else if (type == ELSE_CLAUSE) {
        return new BallerinaElseClauseImpl(node);
      }
      else if (type == ELSE_IF_CLAUSE) {
        return new BallerinaElseIfClauseImpl(node);
      }
      else if (type == EMPTY_TAG) {
        return new BallerinaEmptyTagImpl(node);
      }
      else if (type == ENDPOINT_DEFINITION) {
        return new BallerinaEndpointDefinitionImpl(node);
      }
      else if (type == ENDPOINT_INITLIZATION) {
        return new BallerinaEndpointInitlizationImpl(node);
      }
      else if (type == ENDPOINT_PARAMETER) {
        return new BallerinaEndpointParameterImpl(node);
      }
      else if (type == ENDPOINT_TYPE) {
        return new BallerinaEndpointTypeImpl(node);
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
      else if (type == FAIL_STATEMENT) {
        return new BallerinaFailStatementImpl(node);
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
      else if (type == FORMAL_PARAMETER_LIST) {
        return new BallerinaFormalParameterListImpl(node);
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
      else if (type == FUTURE_TYPE_NAME) {
        return new BallerinaFutureTypeNameImpl(node);
      }
      else if (type == GLOBAL_ENDPOINT_DEFINITION) {
        return new BallerinaGlobalEndpointDefinitionImpl(node);
      }
      else if (type == GLOBAL_VARIABLE_DEFINITION) {
        return new BallerinaGlobalVariableDefinitionImpl(node);
      }
      else if (type == GROUP_TYPE_NAME) {
        return new BallerinaGroupTypeNameImpl(node);
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
      else if (type == INTEGER_LITERAL) {
        return new BallerinaIntegerLiteralImpl(node);
      }
      else if (type == INT_RANGE_EXPRESSION) {
        return new BallerinaIntRangeExpressionImpl(node);
      }
      else if (type == INVOCATION) {
        return new BallerinaInvocationImpl(node);
      }
      else if (type == INVOCATION_ARG) {
        return new BallerinaInvocationArgImpl(node);
      }
      else if (type == INVOCATION_ARG_LIST) {
        return new BallerinaInvocationArgListImpl(node);
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
      else if (type == MATCH_PATTERN_CLAUSE) {
        return new BallerinaMatchPatternClauseImpl(node);
      }
      else if (type == MATCH_STATEMENT) {
        return new BallerinaMatchStatementImpl(node);
      }
      else if (type == NAMED_ARGS) {
        return new BallerinaNamedArgsImpl(node);
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
      else if (type == NULLABLE_TYPE_NAME) {
        return new BallerinaNullableTypeNameImpl(node);
      }
      else if (type == OBJECT_BODY) {
        return new BallerinaObjectBodyImpl(node);
      }
      else if (type == OBJECT_CALLABLE_UNIT_SIGNATURE) {
        return new BallerinaObjectCallableUnitSignatureImpl(node);
      }
      else if (type == OBJECT_DEFAULTABLE_PARAMETER) {
        return new BallerinaObjectDefaultableParameterImpl(node);
      }
      else if (type == OBJECT_FIELD_DEFINITION) {
        return new BallerinaObjectFieldDefinitionImpl(node);
      }
      else if (type == OBJECT_FUNCTIONS) {
        return new BallerinaObjectFunctionsImpl(node);
      }
      else if (type == OBJECT_FUNCTION_DEFINITION) {
        return new BallerinaObjectFunctionDefinitionImpl(node);
      }
      else if (type == OBJECT_INITIALIZER) {
        return new BallerinaObjectInitializerImpl(node);
      }
      else if (type == OBJECT_INITIALIZER_PARAMETER_LIST) {
        return new BallerinaObjectInitializerParameterListImpl(node);
      }
      else if (type == OBJECT_PARAMETER) {
        return new BallerinaObjectParameterImpl(node);
      }
      else if (type == OBJECT_PARAMETER_LIST) {
        return new BallerinaObjectParameterListImpl(node);
      }
      else if (type == OBJECT_TYPE_NAME) {
        return new BallerinaObjectTypeNameImpl(node);
      }
      else if (type == ONABORT_STATEMENT) {
        return new BallerinaOnabortStatementImpl(node);
      }
      else if (type == ONCOMMIT_STATEMENT) {
        return new BallerinaOncommitStatementImpl(node);
      }
      else if (type == ONRETRY_CLAUSE) {
        return new BallerinaOnretryClauseImpl(node);
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
      else if (type == PARAMETER_TYPE_NAME) {
        return new BallerinaParameterTypeNameImpl(node);
      }
      else if (type == PARAMETER_TYPE_NAME_LIST) {
        return new BallerinaParameterTypeNameListImpl(node);
      }
      else if (type == POST_ARITHMETIC_OPERATOR) {
        return new BallerinaPostArithmeticOperatorImpl(node);
      }
      else if (type == POST_INCREMENT_STATEMENT) {
        return new BallerinaPostIncrementStatementImpl(node);
      }
      else if (type == PRIVATE_OBJECT_FIELDS) {
        return new BallerinaPrivateObjectFieldsImpl(node);
      }
      else if (type == PRIVATE_STRUCT_BODY) {
        return new BallerinaPrivateStructBodyImpl(node);
      }
      else if (type == PROC_INS) {
        return new BallerinaProcInsImpl(node);
      }
      else if (type == PUBLIC_OBJECT_FIELDS) {
        return new BallerinaPublicObjectFieldsImpl(node);
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
      else if (type == RECORD_LITERAL_EXPRESSION) {
        return new BallerinaRecordLiteralExpressionImpl(node);
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
      else if (type == RESOURCE_PARAMETER_LIST) {
        return new BallerinaResourceParameterListImpl(node);
      }
      else if (type == REST_ARGS) {
        return new BallerinaRestArgsImpl(node);
      }
      else if (type == REST_PARAMETER) {
        return new BallerinaRestParameterImpl(node);
      }
      else if (type == RETRIES_STATEMENT) {
        return new BallerinaRetriesStatementImpl(node);
      }
      else if (type == RETURN_PARAMETER) {
        return new BallerinaReturnParameterImpl(node);
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
      else if (type == SERVICE_ENDPOINT_ATTACHMENTS) {
        return new BallerinaServiceEndpointAttachmentsImpl(node);
      }
      else if (type == SIMPLE_LITERAL) {
        return new BallerinaSimpleLiteralImpl(node);
      }
      else if (type == SIMPLE_LITERAL_EXPRESSION) {
        return new BallerinaSimpleLiteralExpressionImpl(node);
      }
      else if (type == SIMPLE_TYPE_NAME) {
        return new BallerinaSimpleTypeNameImpl(node);
      }
      else if (type == SIMPLE_VARIABLE_REFERENCE) {
        return new BallerinaSimpleVariableReferenceImpl(node);
      }
      else if (type == SINGLE_BACK_TICK_DEPRECATED_INLINE_CODE) {
        return new BallerinaSingleBackTickDeprecatedInlineCodeImpl(node);
      }
      else if (type == SINGLE_BACK_TICK_DOC_INLINE_CODE) {
        return new BallerinaSingleBackTickDocInlineCodeImpl(node);
      }
      else if (type == START_TAG) {
        return new BallerinaStartTagImpl(node);
      }
      else if (type == STATEMENT) {
        return new BallerinaStatementImpl(node);
      }
      else if (type == STREAM_TYPE_NAME) {
        return new BallerinaStreamTypeNameImpl(node);
      }
      else if (type == STRING_TEMPLATE_CONTENT) {
        return new BallerinaStringTemplateContentImpl(node);
      }
      else if (type == STRING_TEMPLATE_LITERAL) {
        return new BallerinaStringTemplateLiteralImpl(node);
      }
      else if (type == STRING_TEMPLATE_LITERAL_EXPRESSION) {
        return new BallerinaStringTemplateLiteralExpressionImpl(node);
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
      else if (type == TRIPLE_BACK_TICK_DEPRECATED_INLINE_CODE) {
        return new BallerinaTripleBackTickDeprecatedInlineCodeImpl(node);
      }
      else if (type == TRIPLE_BACK_TICK_DOC_INLINE_CODE) {
        return new BallerinaTripleBackTickDocInlineCodeImpl(node);
      }
      else if (type == TRY_CATCH_STATEMENT) {
        return new BallerinaTryCatchStatementImpl(node);
      }
      else if (type == TUPLE_DESTRUCTURING_STATEMENT) {
        return new BallerinaTupleDestructuringStatementImpl(node);
      }
      else if (type == TUPLE_TYPE_NAME) {
        return new BallerinaTupleTypeNameImpl(node);
      }
      else if (type == TYPE_ACCESS_EXPRESSION) {
        return new BallerinaTypeAccessExpressionImpl(node);
      }
      else if (type == TYPE_CONVERSION_EXPRESSION) {
        return new BallerinaTypeConversionExpressionImpl(node);
      }
      else if (type == TYPE_DEFINITION) {
        return new BallerinaTypeDefinitionImpl(node);
      }
      else if (type == TYPE_DESC_TYPE_NAME) {
        return new BallerinaTypeDescTypeNameImpl(node);
      }
      else if (type == TYPE_INIT_EXPR) {
        return new BallerinaTypeInitExprImpl(node);
      }
      else if (type == TYPE_INIT_EXPRESSION) {
        return new BallerinaTypeInitExpressionImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new BallerinaUnaryExpressionImpl(node);
      }
      else if (type == UNION_TYPE_NAME) {
        return new BallerinaUnionTypeNameImpl(node);
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
      else if (type == VARIABLE_DEFINITION_STATEMENT_IN_SERVICE) {
        return new BallerinaVariableDefinitionStatementInServiceImpl(node);
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
      else if (type == XML_ATTRIB_VARIABLE_REFERENCE) {
        return new BallerinaXmlAttribVariableReferenceImpl(node);
      }
      else if (type == XML_DOUBLE_QUOTED_STRING) {
        return new BallerinaXmlDoubleQuotedStringImpl(node);
      }
      else if (type == XML_ITEM) {
        return new BallerinaXmlItemImpl(node);
      }
      else if (type == XML_LITERAL) {
        return new BallerinaXmlLiteralImpl(node);
      }
      else if (type == XML_LITERAL_EXPRESSION) {
        return new BallerinaXmlLiteralExpressionImpl(node);
      }
      else if (type == XML_LOCAL_NAME) {
        return new BallerinaXmlLocalNameImpl(node);
      }
      else if (type == XML_NAMESPACE_NAME) {
        return new BallerinaXmlNamespaceNameImpl(node);
      }
      else if (type == XML_QUALIFIED_NAME) {
        return new BallerinaXmlQualifiedNameImpl(node);
      }
      else if (type == XML_QUOTED_STRING) {
        return new BallerinaXmlQuotedStringImpl(node);
      }
      else if (type == XML_SINGLE_QUOTED_STRING) {
        return new BallerinaXmlSingleQuotedStringImpl(node);
      }
      else if (type == XML_TEXT) {
        return new BallerinaXmlTextImpl(node);
      }
      else if (type == XML_TYPE_NAME) {
        return new BallerinaXmlTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
