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
package org.ballerina.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.ballerina.psi.BallerinaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BallerinaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABORT_STATEMENT) {
      r = AbortStatement(b, 0);
    }
    else if (t == ACTION_DEFINITION) {
      r = ActionDefinition(b, 0);
    }
    else if (t == ALIAS) {
      r = Alias(b, 0);
    }
    else if (t == ANNOTATION_ATTACHMENT) {
      r = AnnotationAttachment(b, 0);
    }
    else if (t == ANNOTATION_ATTRIBUTE) {
      r = AnnotationAttribute(b, 0);
    }
    else if (t == ANNOTATION_ATTRIBUTE_ARRAY) {
      r = AnnotationAttributeArray(b, 0);
    }
    else if (t == ANNOTATION_ATTRIBUTE_VALUE) {
      r = AnnotationAttributeValue(b, 0);
    }
    else if (t == ANNOTATION_BODY) {
      r = AnnotationBody(b, 0);
    }
    else if (t == ANNOTATION_DEFINITION) {
      r = AnnotationDefinition(b, 0);
    }
    else if (t == ANON_STRUCT_TYPE_NAME) {
      r = AnonStructTypeName(b, 0);
    }
    else if (t == ARRAY_LITERAL) {
      r = ArrayLiteral(b, 0);
    }
    else if (t == ASSIGNMENT_STATEMENT) {
      r = AssignmentStatement(b, 0);
    }
    else if (t == ATTACHMENT_POINT) {
      r = AttachmentPoint(b, 0);
    }
    else if (t == BIND_STATEMENT) {
      r = BindStatement(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = BreakStatement(b, 0);
    }
    else if (t == BUILT_IN_REFERENCE_TYPE_NAME) {
      r = BuiltInReferenceTypeName(b, 0);
    }
    else if (t == BUILT_IN_TYPE_NAME) {
      r = BuiltInTypeName(b, 0);
    }
    else if (t == CALLABLE_UNIT_BODY) {
      r = CallableUnitBody(b, 0);
    }
    else if (t == CALLABLE_UNIT_SIGNATURE) {
      r = CallableUnitSignature(b, 0);
    }
    else if (t == CATCH_CLAUSE) {
      r = CatchClause(b, 0);
    }
    else if (t == CATCH_CLAUSES) {
      r = CatchClauses(b, 0);
    }
    else if (t == CONNECTOR_BODY) {
      r = ConnectorBody(b, 0);
    }
    else if (t == CONNECTOR_INIT) {
      r = ConnectorInit(b, 0);
    }
    else if (t == DEFINITION) {
      r = Definition(b, 0);
    }
    else if (t == ELSE_CLAUSE) {
      r = ElseClause(b, 0);
    }
    else if (t == ELSE_IF_CLAUSE) {
      r = ElseIfClause(b, 0);
    }
    else if (t == ENDPOINT_DECLARATION) {
      r = EndpointDeclaration(b, 0);
    }
    else if (t == ENDPOINT_DEFINITION) {
      r = EndpointDefinition(b, 0);
    }
    else if (t == ENUMERATOR) {
      r = Enumerator(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = ExpressionList(b, 0);
    }
    else if (t == EXPRESSION_STMT) {
      r = ExpressionStmt(b, 0);
    }
    else if (t == FAILED_CLAUSE) {
      r = FailedClause(b, 0);
    }
    else if (t == FIELD) {
      r = Field(b, 0);
    }
    else if (t == FIELD_DEFINITION) {
      r = FieldDefinition(b, 0);
    }
    else if (t == FINALLY_CLAUSE) {
      r = FinallyClause(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = ForeachStatement(b, 0);
    }
    else if (t == FORK_JOIN_STATEMENT) {
      r = ForkJoinStatement(b, 0);
    }
    else if (t == FUNCTION_DEFINITION) {
      r = FunctionDefinition(b, 0);
    }
    else if (t == FUNCTION_INVOCATION) {
      r = FunctionInvocation(b, 0);
    }
    else if (t == FUNCTION_TYPE_NAME) {
      r = FunctionTypeName(b, 0);
    }
    else if (t == GLOBAL_VARIABLE_DEFINITION) {
      r = GlobalVariableDefinition(b, 0);
    }
    else if (t == IF_CLAUSE) {
      r = IfClause(b, 0);
    }
    else if (t == IF_ELSE_STATEMENT) {
      r = IfElseStatement(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = ImportDeclaration(b, 0);
    }
    else if (t == INDEX) {
      r = Index(b, 0);
    }
    else if (t == INT_RANGE_EXPRESSION) {
      r = IntRangeExpression(b, 0);
    }
    else if (t == INVOCATION) {
      r = Invocation(b, 0);
    }
    else if (t == JOIN_CLAUSE) {
      r = JoinClause(b, 0);
    }
    else if (t == JOIN_CONDITIONS) {
      r = JoinConditions(b, 0);
    }
    else if (t == LAMBDA_FUNCTION) {
      r = LambdaFunction(b, 0);
    }
    else if (t == LOCK_STATEMENT) {
      r = LockStatement(b, 0);
    }
    else if (t == NAME_REFERENCE) {
      r = NameReference(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION) {
      r = NamespaceDeclaration(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION_STATEMENT) {
      r = NamespaceDeclarationStatement(b, 0);
    }
    else if (t == NATIVE_ACTION_DEFINITION) {
      r = NativeActionDefinition(b, 0);
    }
    else if (t == NATIVE_FUNCTION_DEFINITION) {
      r = NativeFunctionDefinition(b, 0);
    }
    else if (t == NEXT_STATEMENT) {
      r = NextStatement(b, 0);
    }
    else if (t == NON_NATIVE_ACTION_DEFINITION) {
      r = NonNativeActionDefinition(b, 0);
    }
    else if (t == NON_NATIVE_FUNCTION_DEFINITION) {
      r = NonNativeFunctionDefinition(b, 0);
    }
    else if (t == PACKAGE_DECLARATION) {
      r = PackageDeclaration(b, 0);
    }
    else if (t == PACKAGE_NAME) {
      r = PackageName(b, 0);
    }
    else if (t == PACKAGE_VERSION) {
      r = PackageVersion(b, 0);
    }
    else if (t == PARAMETER) {
      r = Parameter(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = ParameterList(b, 0);
    }
    else if (t == PRIVATE_STRUCT_BODY) {
      r = PrivateStructBody(b, 0);
    }
    else if (t == RECORD_KEY) {
      r = RecordKey(b, 0);
    }
    else if (t == RECORD_KEY_VALUE) {
      r = RecordKeyValue(b, 0);
    }
    else if (t == RECORD_LITERAL) {
      r = RecordLiteral(b, 0);
    }
    else if (t == REFERENCE_TYPE_NAME) {
      r = ReferenceTypeName(b, 0);
    }
    else if (t == RESOURCE_DEFINITION) {
      r = ResourceDefinition(b, 0);
    }
    else if (t == RETRIES_STATEMENT) {
      r = RetriesStatement(b, 0);
    }
    else if (t == RETURN_PARAMETERS) {
      r = ReturnParameters(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = ReturnStatement(b, 0);
    }
    else if (t == SERVICE_BODY) {
      r = ServiceBody(b, 0);
    }
    else if (t == SERVICE_DEFINITION) {
      r = ServiceDefinition(b, 0);
    }
    else if (t == SIMPLE_LITERAL) {
      r = SimpleLiteral(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STRUCT_BODY) {
      r = StructBody(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = ThrowStatement(b, 0);
    }
    else if (t == TIMEOUT_CLAUSE) {
      r = TimeoutClause(b, 0);
    }
    else if (t == TRANSACTION_CLAUSE) {
      r = TransactionClause(b, 0);
    }
    else if (t == TRANSACTION_PROPERTY_INIT_STATEMENT) {
      r = TransactionPropertyInitStatement(b, 0);
    }
    else if (t == TRANSACTION_PROPERTY_INIT_STATEMENT_LIST) {
      r = TransactionPropertyInitStatementList(b, 0);
    }
    else if (t == TRANSACTION_STATEMENT) {
      r = TransactionStatement(b, 0);
    }
    else if (t == TRANSFORMER_DEFINITION) {
      r = TransformerDefinition(b, 0);
    }
    else if (t == TRIGGER_WORKER) {
      r = TriggerWorker(b, 0);
    }
    else if (t == TRY_CATCH_STATEMENT) {
      r = TryCatchStatement(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = TypeName(b, 0);
    }
    else if (t == USER_DEFINE_TYPE_NAME) {
      r = UserDefineTypeName(b, 0);
    }
    else if (t == VALUE_TYPE_NAME) {
      r = ValueTypeName(b, 0);
    }
    else if (t == VARIABLE_DEFINITION_STATEMENT) {
      r = VariableDefinitionStatement(b, 0);
    }
    else if (t == VARIABLE_REFERENCE) {
      r = VariableReference(b, 0);
    }
    else if (t == VARIABLE_REFERENCE_LIST) {
      r = VariableReferenceList(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else if (t == WORKER_DECLARATION) {
      r = WorkerDeclaration(b, 0);
    }
    else if (t == WORKER_DEFINITION) {
      r = WorkerDefinition(b, 0);
    }
    else if (t == WORKER_INTERACTION_STATEMENT) {
      r = WorkerInteractionStatement(b, 0);
    }
    else if (t == WORKER_REPLY) {
      r = WorkerReply(b, 0);
    }
    else if (t == XML_ATTRIB) {
      r = XmlAttrib(b, 0);
    }
    else if (t == XML_LOCAL_NAME) {
      r = XmlLocalName(b, 0);
    }
    else if (t == XML_NAMESPACE_NAME) {
      r = XmlNamespaceName(b, 0);
    }
    else if (t == ANNOTATION_ATTRIBUTE_LIST) {
      r = annotationAttributeList(b, 0);
    }
    else if (t == CONNECTOR_DEFINITION) {
      r = connectorDefinition(b, 0);
    }
    else if (t == CONSTANT_DEFINITION) {
      r = constantDefinition(b, 0);
    }
    else if (t == ENUM_DEFINITION) {
      r = enumDefinition(b, 0);
    }
    else if (t == STRUCT_DEFINITION) {
      r = structDefinition(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return CompilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // abort SEMICOLON
  public static boolean AbortStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbortStatement")) return false;
    if (!nextTokenIs(b, ABORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ABORT_STATEMENT, null);
    r = consumeTokens(b, 1, ABORT, SEMICOLON);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // NativeActionDefinition | NonNativeActionDefinition
  public static boolean ActionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION_DEFINITION, "<action definition>");
    r = NativeActionDefinition(b, l + 1);
    if (!r) r = NonNativeActionDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // as identifier
  public static boolean Alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alias")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ALIAS, null);
    r = consumeTokens(b, 1, AS, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AT NameReference LEFT_BRACE annotationAttributeList? RIGHT_BRACE
  public static boolean AnnotationAttachment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttachment")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_ATTACHMENT, null);
    r = consumeToken(b, AT);
    p = r; // pin = 1
    r = r && report_error_(b, NameReference(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, AnnotationAttachment_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // annotationAttributeList?
  private static boolean AnnotationAttachment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttachment_3")) return false;
    annotationAttributeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier COLON AnnotationAttributeValue
  public static boolean AnnotationAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttribute")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && AnnotationAttributeValue(b, l + 1);
    exit_section_(b, m, ANNOTATION_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET (AnnotationAttributeValue (COMMA AnnotationAttributeValue)*)? RIGHT_BRACKET
  public static boolean AnnotationAttributeArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttributeArray")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && AnnotationAttributeArray_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, ANNOTATION_ATTRIBUTE_ARRAY, r);
    return r;
  }

  // (AnnotationAttributeValue (COMMA AnnotationAttributeValue)*)?
  private static boolean AnnotationAttributeArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttributeArray_1")) return false;
    AnnotationAttributeArray_1_0(b, l + 1);
    return true;
  }

  // AnnotationAttributeValue (COMMA AnnotationAttributeValue)*
  private static boolean AnnotationAttributeArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttributeArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnnotationAttributeValue(b, l + 1);
    r = r && AnnotationAttributeArray_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA AnnotationAttributeValue)*
  private static boolean AnnotationAttributeArray_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttributeArray_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttributeArray_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AnnotationAttributeArray_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA AnnotationAttributeValue
  private static boolean AnnotationAttributeArray_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttributeArray_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AnnotationAttributeValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SimpleLiteral | NameReference | AnnotationAttachment | AnnotationAttributeArray
  public static boolean AnnotationAttributeValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttributeValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_ATTRIBUTE_VALUE, "<annotation attribute value>");
    r = SimpleLiteral(b, l + 1);
    if (!r) r = NameReference(b, l + 1);
    if (!r) r = AnnotationAttachment(b, l + 1);
    if (!r) r = AnnotationAttributeArray(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE FieldDefinition* RIGHT_BRACE
  public static boolean AnnotationBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && AnnotationBody_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, ANNOTATION_BODY, r);
    return r;
  }

  // FieldDefinition*
  private static boolean AnnotationBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FieldDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AnnotationBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (public)? annotation identifier (attach AttachmentPoint (COMMA AttachmentPoint)*)? AnnotationBody
  public static boolean AnnotationDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition")) return false;
    if (!nextTokenIs(b, "<annotation definition>", ANNOTATION, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_DEFINITION, "<annotation definition>");
    r = AnnotationDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, ANNOTATION, IDENTIFIER);
    p = r; // pin = 2
    r = r && report_error_(b, AnnotationDefinition_3(b, l + 1));
    r = p && AnnotationBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean AnnotationDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (attach AttachmentPoint (COMMA AttachmentPoint)*)?
  private static boolean AnnotationDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_3")) return false;
    AnnotationDefinition_3_0(b, l + 1);
    return true;
  }

  // attach AttachmentPoint (COMMA AttachmentPoint)*
  private static boolean AnnotationDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTACH);
    r = r && AttachmentPoint(b, l + 1);
    r = r && AnnotationDefinition_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA AttachmentPoint)*
  private static boolean AnnotationDefinition_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_3_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationDefinition_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AnnotationDefinition_3_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA AttachmentPoint
  private static boolean AnnotationDefinition_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AttachmentPoint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // struct StructBody
  public static boolean AnonStructTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonStructTypeName")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRUCT);
    r = r && StructBody(b, l + 1);
    exit_section_(b, m, ANON_STRUCT_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET ExpressionList? RIGHT_BRACKET
  public static boolean ArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && ArrayLiteral_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, ARRAY_LITERAL, r);
    return r;
  }

  // ExpressionList?
  private static boolean ArrayLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (var)? VariableReferenceList ASSIGN Expression SEMICOLON
  public static boolean AssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement")) return false;
    if (!nextTokenIs(b, "<assignment statement>", IDENTIFIER, VAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = AssignmentStatement_0(b, l + 1);
    r = r && VariableReferenceList(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, ASSIGN));
    r = p && report_error_(b, Expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (var)?
  private static boolean AssignmentStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_0")) return false;
    consumeToken(b, VAR);
    return true;
  }

  /* ********************************************************** */
  // service (LT identifier? GT)? | resource | connector | action | function | struct | enum | const | TYPE_PARAMETER | annotation | transformer
  public static boolean AttachmentPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTACHMENT_POINT, "<attachment point>");
    r = AttachmentPoint_0(b, l + 1);
    if (!r) r = consumeToken(b, RESOURCE);
    if (!r) r = consumeToken(b, CONNECTOR);
    if (!r) r = consumeToken(b, ACTION);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, TYPE_PARAMETER);
    if (!r) r = consumeToken(b, ANNOTATION);
    if (!r) r = consumeToken(b, TRANSFORMER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // service (LT identifier? GT)?
  private static boolean AttachmentPoint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SERVICE);
    r = r && AttachmentPoint_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT identifier? GT)?
  private static boolean AttachmentPoint_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint_0_1")) return false;
    AttachmentPoint_0_1_0(b, l + 1);
    return true;
  }

  // LT identifier? GT
  private static boolean AttachmentPoint_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && AttachmentPoint_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean AttachmentPoint_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint_0_1_0_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // bind Expression WITH identifier SEMICOLON
  public static boolean BindStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindStatement")) return false;
    if (!nextTokenIs(b, BIND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BIND_STATEMENT, null);
    r = consumeToken(b, BIND);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, WITH, IDENTIFIER, SEMICOLON)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // break SEMICOLON
  public static boolean BreakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STATEMENT, null);
    r = consumeTokens(b, 1, BREAK, SEMICOLON);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // map (LT TypeName GT)?
  // | xml (LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT)?
  // | json (LT NameReference GT)?
  // | table (LT NameReference GT)?
  // | FunctionTypeName
  public static boolean BuiltInReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_REFERENCE_TYPE_NAME, "<built in reference type name>");
    r = BuiltInReferenceTypeName_0(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName_1(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName_2(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName_3(b, l + 1);
    if (!r) r = FunctionTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // map (LT TypeName GT)?
  private static boolean BuiltInReferenceTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAP);
    r = r && BuiltInReferenceTypeName_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT TypeName GT)?
  private static boolean BuiltInReferenceTypeName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_0_1")) return false;
    BuiltInReferenceTypeName_0_1_0(b, l + 1);
    return true;
  }

  // LT TypeName GT
  private static boolean BuiltInReferenceTypeName_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeName(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // xml (LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT)?
  private static boolean BuiltInReferenceTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML);
    r = r && BuiltInReferenceTypeName_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT)?
  private static boolean BuiltInReferenceTypeName_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1")) return false;
    BuiltInReferenceTypeName_1_1_0(b, l + 1);
    return true;
  }

  // LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT
  private static boolean BuiltInReferenceTypeName_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && BuiltInReferenceTypeName_1_1_0_1(b, l + 1);
    r = r && XmlLocalName(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)?
  private static boolean BuiltInReferenceTypeName_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1_0_1")) return false;
    BuiltInReferenceTypeName_1_1_0_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACE XmlNamespaceName RIGHT_BRACE
  private static boolean BuiltInReferenceTypeName_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && XmlNamespaceName(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // json (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JSON);
    r = r && BuiltInReferenceTypeName_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_2_1")) return false;
    BuiltInReferenceTypeName_2_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean BuiltInReferenceTypeName_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // table (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TABLE);
    r = r && BuiltInReferenceTypeName_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_3_1")) return false;
    BuiltInReferenceTypeName_3_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean BuiltInReferenceTypeName_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // any | type | ValueTypeName | BuiltInReferenceTypeName | TypeName (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean BuiltInTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_TYPE_NAME, "<built in type name>");
    r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName(b, l + 1);
    if (!r) r = BuiltInTypeName_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeName (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean BuiltInTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1);
    r = r && BuiltInTypeName_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean BuiltInTypeName_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BuiltInTypeName_4_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!BuiltInTypeName_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BuiltInTypeName_4_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean BuiltInTypeName_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE EndpointDeclaration* Statement* RIGHT_BRACE | LEFT_BRACE EndpointDeclaration* WorkerDeclaration+ RIGHT_BRACE
  public static boolean CallableUnitBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallableUnitBody_0(b, l + 1);
    if (!r) r = CallableUnitBody_1(b, l + 1);
    exit_section_(b, m, CALLABLE_UNIT_BODY, r);
    return r;
  }

  // LEFT_BRACE EndpointDeclaration* Statement* RIGHT_BRACE
  private static boolean CallableUnitBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && CallableUnitBody_0_1(b, l + 1);
    r = r && CallableUnitBody_0_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // EndpointDeclaration*
  private static boolean CallableUnitBody_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallableUnitBody_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Statement*
  private static boolean CallableUnitBody_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallableUnitBody_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LEFT_BRACE EndpointDeclaration* WorkerDeclaration+ RIGHT_BRACE
  private static boolean CallableUnitBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && CallableUnitBody_1_1(b, l + 1);
    r = r && CallableUnitBody_1_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // EndpointDeclaration*
  private static boolean CallableUnitBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallableUnitBody_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WorkerDeclaration+
  private static boolean CallableUnitBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WorkerDeclaration(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!WorkerDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallableUnitBody_1_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS ReturnParameters?
  public static boolean CallableUnitSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALLABLE_UNIT_SIGNATURE, null);
    r = consumeTokens(b, 1, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, CallableUnitSignature_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && CallableUnitSignature_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ParameterList?
  private static boolean CallableUnitSignature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature_2")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // ReturnParameters?
  private static boolean CallableUnitSignature_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature_4")) return false;
    ReturnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // catch LEFT_PARENTHESIS TypeName identifier RIGHT_PARENTHESIS LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean CatchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClause")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CATCH, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, RIGHT_PARENTHESIS, LEFT_BRACE);
    r = r && CatchClause_6(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, CATCH_CLAUSE, r);
    return r;
  }

  // Statement*
  private static boolean CatchClause_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClause_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CatchClause_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CatchClause+ FinallyClause? | FinallyClause
  public static boolean CatchClauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClauses")) return false;
    if (!nextTokenIs(b, "<catch clauses>", FINALLY, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATCH_CLAUSES, "<catch clauses>");
    r = CatchClauses_0(b, l + 1);
    if (!r) r = FinallyClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CatchClause+ FinallyClause?
  private static boolean CatchClauses_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClauses_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CatchClauses_0_0(b, l + 1);
    r = r && CatchClauses_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CatchClause+
  private static boolean CatchClauses_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClauses_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CatchClause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!CatchClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CatchClauses_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // FinallyClause?
  private static boolean CatchClauses_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClauses_0_1")) return false;
    FinallyClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PackageDeclaration? (ImportDeclaration | NamespaceDeclaration)* (AnnotationAttachment* Definition)*
  static boolean CompilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompilationUnit_0(b, l + 1);
    r = r && CompilationUnit_1(b, l + 1);
    r = r && CompilationUnit_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PackageDeclaration?
  private static boolean CompilationUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_0")) return false;
    PackageDeclaration(b, l + 1);
    return true;
  }

  // (ImportDeclaration | NamespaceDeclaration)*
  private static boolean CompilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompilationUnit_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ImportDeclaration | NamespaceDeclaration
  private static boolean CompilationUnit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDeclaration(b, l + 1);
    if (!r) r = NamespaceDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AnnotationAttachment* Definition)*
  private static boolean CompilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompilationUnit_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // AnnotationAttachment* Definition
  private static boolean CompilationUnit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompilationUnit_2_0_0(b, l + 1);
    r = r && Definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AnnotationAttachment*
  private static boolean CompilationUnit_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_2_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LEFT_BRACE EndpointDeclaration* VariableDefinitionStatement* ActionDefinition* RIGHT_BRACE
  public static boolean ConnectorBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectorBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && ConnectorBody_1(b, l + 1);
    r = r && ConnectorBody_2(b, l + 1);
    r = r && ConnectorBody_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, CONNECTOR_BODY, r);
    return r;
  }

  // EndpointDeclaration*
  private static boolean ConnectorBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectorBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConnectorBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VariableDefinitionStatement*
  private static boolean ConnectorBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectorBody_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableDefinitionStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConnectorBody_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ActionDefinition*
  private static boolean ConnectorBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectorBody_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ActionDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConnectorBody_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // create UserDefineTypeName LEFT_PARENTHESIS ExpressionList? RIGHT_PARENTHESIS
  public static boolean ConnectorInit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectorInit")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONNECTOR_INIT, null);
    r = consumeToken(b, CREATE);
    p = r; // pin = 1
    r = r && report_error_(b, UserDefineTypeName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, ConnectorInit_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionList?
  private static boolean ConnectorInit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectorInit_3")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ServiceDefinition | FunctionDefinition | connectorDefinition | structDefinition | enumDefinition |
  // constantDefinition | AnnotationDefinition | GlobalVariableDefinition | TransformerDefinition
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = ServiceDefinition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    if (!r) r = connectorDefinition(b, l + 1);
    if (!r) r = structDefinition(b, l + 1);
    if (!r) r = enumDefinition(b, l + 1);
    if (!r) r = constantDefinition(b, l + 1);
    if (!r) r = AnnotationDefinition(b, l + 1);
    if (!r) r = GlobalVariableDefinition(b, l + 1);
    if (!r) r = TransformerDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, TopLevelDefinitionRecover_parser_);
    return r;
  }

  /* ********************************************************** */
  // else LEFT_BRACE Statement*RIGHT_BRACE
  public static boolean ElseClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseClause")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_CLAUSE, null);
    r = consumeTokens(b, 1, ELSE, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, ElseClause_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement*
  private static boolean ElseClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseClause_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseClause_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // else if LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean ElseIfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfClause")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_IF_CLAUSE, null);
    r = consumeTokens(b, 2, ELSE, IF, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, ElseIfClause_6(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement*
  private static boolean ElseIfClause_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfClause_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseIfClause_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EndpointDefinition LEFT_BRACE ((VariableReference | ConnectorInit) SEMICOLON)? RIGHT_BRACE
  public static boolean EndpointDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration")) return false;
    if (!nextTokenIs(b, ENDPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_DECLARATION, null);
    r = EndpointDefinition(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LEFT_BRACE));
    r = p && report_error_(b, EndpointDeclaration_2(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ((VariableReference | ConnectorInit) SEMICOLON)?
  private static boolean EndpointDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration_2")) return false;
    EndpointDeclaration_2_0(b, l + 1);
    return true;
  }

  // (VariableReference | ConnectorInit) SEMICOLON
  private static boolean EndpointDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = EndpointDeclaration_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // VariableReference | ConnectorInit
  private static boolean EndpointDeclaration_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    if (!r) r = ConnectorInit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // endpoint (LT NameReference GT) identifier
  public static boolean EndpointDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDefinition")) return false;
    if (!nextTokenIs(b, ENDPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_DEFINITION, null);
    r = consumeToken(b, ENDPOINT);
    p = r; // pin = 1
    r = r && report_error_(b, EndpointDefinition_1(b, l + 1));
    r = p && consumeToken(b, IDENTIFIER) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LT NameReference GT
  private static boolean EndpointDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean Enumerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Enumerator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUMERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // SimpleLiteral
  //     |   ArrayLiteral
  //     |   RecordLiteral
  // //    |   XmlLiteral
  // //    |   StringTemplateLiteral
  //     |   ValueTypeName DOT identifier
  //     |   BuiltInReferenceTypeName DOT identifier
  //     |   VariableReference
  //     |   LambdaFunction
  //     |   ConnectorInit
  //     |   LEFT_PARENTHESIS TypeName RIGHT_PARENTHESIS Expression
  //     |   LT TypeName (COMMA FunctionInvocation)? GT Expression
  //     |   typeof BuiltInTypeName
  //     |   (ADD | SUB | NOT | lengthof | typeof) Expression
  //     |   LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = SimpleLiteral(b, l + 1);
    if (!r) r = ArrayLiteral(b, l + 1);
    if (!r) r = RecordLiteral(b, l + 1);
    if (!r) r = Expression_3(b, l + 1);
    if (!r) r = Expression_4(b, l + 1);
    if (!r) r = VariableReference(b, l + 1);
    if (!r) r = LambdaFunction(b, l + 1);
    if (!r) r = ConnectorInit(b, l + 1);
    if (!r) r = Expression_8(b, l + 1);
    if (!r) r = Expression_9(b, l + 1);
    if (!r) r = Expression_10(b, l + 1);
    if (!r) r = Expression_11(b, l + 1);
    if (!r) r = Expression_12(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ValueTypeName DOT identifier
  private static boolean Expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValueTypeName(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // BuiltInReferenceTypeName DOT identifier
  private static boolean Expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BuiltInReferenceTypeName(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PARENTHESIS TypeName RIGHT_PARENTHESIS Expression
  private static boolean Expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LT TypeName (COMMA FunctionInvocation)? GT Expression
  private static boolean Expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeName(b, l + 1);
    r = r && Expression_9_2(b, l + 1);
    r = r && consumeToken(b, GT);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA FunctionInvocation)?
  private static boolean Expression_9_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_9_2")) return false;
    Expression_9_2_0(b, l + 1);
    return true;
  }

  // COMMA FunctionInvocation
  private static boolean Expression_9_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_9_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FunctionInvocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeof BuiltInTypeName
  private static boolean Expression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPEOF);
    r = r && BuiltInTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ADD | SUB | NOT | lengthof | typeof) Expression
  private static boolean Expression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression_11_0(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ADD | SUB | NOT | lengthof | typeof
  private static boolean Expression_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, LENGTHOF);
    if (!r) r = consumeToken(b, TYPEOF);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS
  private static boolean Expression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression (COMMA Expression)*
  public static boolean ExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = Expression(b, l + 1);
    r = r && ExpressionList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Expression)*
  private static boolean ExpressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ExpressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Expression
  private static boolean ExpressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference SEMICOLON
  public static boolean ExpressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, EXPRESSION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // failed LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean FailedClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FailedClause")) return false;
    if (!nextTokenIs(b, FAILED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FAILED_CLAUSE, null);
    r = consumeTokens(b, 1, FAILED, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, FailedClause_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement*
  private static boolean FailedClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FailedClause_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FailedClause_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // DOT identifier
  public static boolean Field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // TypeName identifier (ASSIGN SimpleLiteral)? SEMICOLON
  public static boolean FieldDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DEFINITION, "<field definition>");
    r = TypeName(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && FieldDefinition_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ASSIGN SimpleLiteral)?
  private static boolean FieldDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDefinition_2")) return false;
    FieldDefinition_2_0(b, l + 1);
    return true;
  }

  // ASSIGN SimpleLiteral
  private static boolean FieldDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && SimpleLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FINALLY LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean FinallyClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyClause")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FINALLY, LEFT_BRACE);
    r = r && FinallyClause_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, FINALLY_CLAUSE, r);
    return r;
  }

  // Statement*
  private static boolean FinallyClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyClause_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FinallyClause_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // foreach LEFT_PARENTHESIS? VariableReferenceList in (Expression | IntRangeExpression) RIGHT_PARENTHESIS? LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean ForeachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement")) return false;
    if (!nextTokenIs(b, FOREACH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_STATEMENT, null);
    r = consumeToken(b, FOREACH);
    p = r; // pin = 1
    r = r && report_error_(b, ForeachStatement_1(b, l + 1));
    r = p && report_error_(b, VariableReferenceList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, IN)) && r;
    r = p && report_error_(b, ForeachStatement_4(b, l + 1)) && r;
    r = p && report_error_(b, ForeachStatement_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, ForeachStatement_7(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LEFT_PARENTHESIS?
  private static boolean ForeachStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_1")) return false;
    consumeToken(b, LEFT_PARENTHESIS);
    return true;
  }

  // Expression | IntRangeExpression
  private static boolean ForeachStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = IntRangeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RIGHT_PARENTHESIS?
  private static boolean ForeachStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_5")) return false;
    consumeToken(b, RIGHT_PARENTHESIS);
    return true;
  }

  // Statement*
  private static boolean ForeachStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeachStatement_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // fork LEFT_BRACE WorkerDeclaration* RIGHT_BRACE JoinClause? TimeoutClause?
  public static boolean ForkJoinStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForkJoinStatement")) return false;
    if (!nextTokenIs(b, FORK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FORK, LEFT_BRACE);
    r = r && ForkJoinStatement_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    r = r && ForkJoinStatement_4(b, l + 1);
    r = r && ForkJoinStatement_5(b, l + 1);
    exit_section_(b, m, FORK_JOIN_STATEMENT, r);
    return r;
  }

  // WorkerDeclaration*
  private static boolean ForkJoinStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForkJoinStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!WorkerDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForkJoinStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // JoinClause?
  private static boolean ForkJoinStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForkJoinStatement_4")) return false;
    JoinClause(b, l + 1);
    return true;
  }

  // TimeoutClause?
  private static boolean ForkJoinStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForkJoinStatement_5")) return false;
    TimeoutClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NativeFunctionDefinition | NonNativeFunctionDefinition
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = NativeFunctionDefinition(b, l + 1);
    if (!r) r = NonNativeFunctionDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NameReference LEFT_PARENTHESIS ExpressionList? RIGHT_PARENTHESIS
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION, null);
    r = NameReference(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, FunctionInvocation_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionList?
  private static boolean FunctionInvocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_2")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FUNCTION LEFT_PARENTHESIS (ParameterList | TypeList)? RIGHT_PARENTHESIS ReturnParameters?
  public static boolean FunctionTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && FunctionTypeName_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && FunctionTypeName_4(b, l + 1);
    exit_section_(b, m, FUNCTION_TYPE_NAME, r);
    return r;
  }

  // (ParameterList | TypeList)?
  private static boolean FunctionTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2")) return false;
    FunctionTypeName_2_0(b, l + 1);
    return true;
  }

  // ParameterList | TypeList
  private static boolean FunctionTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    if (!r) r = TypeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnParameters?
  private static boolean FunctionTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_4")) return false;
    ReturnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? TypeName identifier (ASSIGN Expression )? SEMICOLON
  public static boolean GlobalVariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_VARIABLE_DEFINITION, "<global variable definition>");
    r = GlobalVariableDefinition_0(b, l + 1);
    r = r && TypeName(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, GlobalVariableDefinition_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean GlobalVariableDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (ASSIGN Expression )?
  private static boolean GlobalVariableDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition_3")) return false;
    GlobalVariableDefinition_3_0(b, l + 1);
    return true;
  }

  // ASSIGN Expression
  private static boolean GlobalVariableDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean IfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfClause")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_CLAUSE, null);
    r = consumeTokens(b, 1, IF, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, IfClause_5(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement*
  private static boolean IfClause_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfClause_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfClause_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IfClause ElseIfClause* ElseClause?
  public static boolean IfElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfClause(b, l + 1);
    r = r && IfElseStatement_1(b, l + 1);
    r = r && IfElseStatement_2(b, l + 1);
    exit_section_(b, m, IF_ELSE_STATEMENT, r);
    return r;
  }

  // ElseIfClause*
  private static boolean IfElseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ElseIfClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfElseStatement_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ElseClause?
  private static boolean IfElseStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement_2")) return false;
    ElseClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // import PackageName PackageVersion? Alias? SEMICOLON
  public static boolean ImportDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, null);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, PackageName(b, l + 1));
    r = p && report_error_(b, ImportDeclaration_2(b, l + 1)) && r;
    r = p && report_error_(b, ImportDeclaration_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // PackageVersion?
  private static boolean ImportDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_2")) return false;
    PackageVersion(b, l + 1);
    return true;
  }

  // Alias?
  private static boolean ImportDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_3")) return false;
    Alias(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LEFT_BRACKET Expression RIGHT_BRACKET
  public static boolean Index(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Index")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // Expression RANGE Expression | (LEFT_BRACKET|LEFT_PARENTHESIS) Expression RANGE Expression (RIGHT_BRACKET|RIGHT_PARENTHESIS)
  public static boolean IntRangeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntRangeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INT_RANGE_EXPRESSION, "<int range expression>");
    r = IntRangeExpression_0(b, l + 1);
    if (!r) r = IntRangeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Expression RANGE Expression
  private static boolean IntRangeExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntRangeExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, RANGE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET|LEFT_PARENTHESIS) Expression RANGE Expression (RIGHT_BRACKET|RIGHT_PARENTHESIS)
  private static boolean IntRangeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntRangeExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntRangeExpression_1_0(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RANGE);
    r = r && Expression(b, l + 1);
    r = r && IntRangeExpression_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET|LEFT_PARENTHESIS
  private static boolean IntRangeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntRangeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    if (!r) r = consumeToken(b, LEFT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // RIGHT_BRACKET|RIGHT_PARENTHESIS
  private static boolean IntRangeExpression_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntRangeExpression_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RIGHT_BRACKET);
    if (!r) r = consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOT AnyIdentifierName LEFT_PARENTHESIS ExpressionList? RIGHT_PARENTHESIS
  public static boolean Invocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invocation")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ANYIDENTIFIERNAME, LEFT_PARENTHESIS);
    r = r && Invocation_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, INVOCATION, r);
    return r;
  }

  // ExpressionList?
  private static boolean Invocation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invocation_3")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // join (LEFT_PARENTHESIS JoinConditions RIGHT_PARENTHESIS)? LEFT_PARENTHESIS TypeName identifier RIGHT_PARENTHESIS LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean JoinClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinClause")) return false;
    if (!nextTokenIs(b, JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JOIN);
    r = r && JoinClause_1(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, RIGHT_PARENTHESIS, LEFT_BRACE);
    r = r && JoinClause_7(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, JOIN_CLAUSE, r);
    return r;
  }

  // (LEFT_PARENTHESIS JoinConditions RIGHT_PARENTHESIS)?
  private static boolean JoinClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinClause_1")) return false;
    JoinClause_1_0(b, l + 1);
    return true;
  }

  // LEFT_PARENTHESIS JoinConditions RIGHT_PARENTHESIS
  private static boolean JoinClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && JoinConditions(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement*
  private static boolean JoinClause_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinClause_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JoinClause_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // some IntegerLiteral (identifier (COMMA identifier)*)? | all (identifier (COMMA identifier)*)?
  public static boolean JoinConditions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions")) return false;
    if (!nextTokenIs(b, "<join conditions>", ALL, SOME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_CONDITIONS, "<join conditions>");
    r = JoinConditions_0(b, l + 1);
    if (!r) r = JoinConditions_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // some IntegerLiteral (identifier (COMMA identifier)*)?
  private static boolean JoinConditions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SOME, INTEGERLITERAL);
    r = r && JoinConditions_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (identifier (COMMA identifier)*)?
  private static boolean JoinConditions_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0_2")) return false;
    JoinConditions_0_2_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)*
  private static boolean JoinConditions_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && JoinConditions_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean JoinConditions_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!JoinConditions_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JoinConditions_0_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA identifier
  private static boolean JoinConditions_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // all (identifier (COMMA identifier)*)?
  private static boolean JoinConditions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALL);
    r = r && JoinConditions_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (identifier (COMMA identifier)*)?
  private static boolean JoinConditions_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_1")) return false;
    JoinConditions_1_1_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)*
  private static boolean JoinConditions_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && JoinConditions_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean JoinConditions_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!JoinConditions_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JoinConditions_1_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA identifier
  private static boolean JoinConditions_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS ReturnParameters? CallableUnitBody
  public static boolean LambdaFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && LambdaFunction_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && LambdaFunction_4(b, l + 1);
    r = r && CallableUnitBody(b, l + 1);
    exit_section_(b, m, LAMBDA_FUNCTION, r);
    return r;
  }

  // ParameterList?
  private static boolean LambdaFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_2")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // ReturnParameters?
  private static boolean LambdaFunction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_4")) return false;
    ReturnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // lock LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean LockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LockStatement")) return false;
    if (!nextTokenIs(b, LOCK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LOCK_STATEMENT, null);
    r = consumeTokens(b, 1, LOCK, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, LockStatement_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement*
  private static boolean LockStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LockStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LockStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (identifier COLON)? identifier
  public static boolean NameReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameReference_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, NAME_REFERENCE, r);
    return r;
  }

  // (identifier COLON)?
  private static boolean NameReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference_0")) return false;
    NameReference_0_0(b, l + 1);
    return true;
  }

  // identifier COLON
  private static boolean NameReference_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xmlns quotedStringLiteral (as identifier)? SEMICOLON
  public static boolean NamespaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration")) return false;
    if (!nextTokenIs(b, XMLNS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_DECLARATION, null);
    r = consumeTokens(b, 1, XMLNS, QUOTEDSTRINGLITERAL);
    p = r; // pin = 1
    r = r && report_error_(b, NamespaceDeclaration_2(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (as identifier)?
  private static boolean NamespaceDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_2")) return false;
    NamespaceDeclaration_2_0(b, l + 1);
    return true;
  }

  // as identifier
  private static boolean NamespaceDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NamespaceDeclaration
  public static boolean NamespaceDeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclarationStatement")) return false;
    if (!nextTokenIs(b, XMLNS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NamespaceDeclaration(b, l + 1);
    exit_section_(b, m, NAMESPACE_DECLARATION_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttachment* native action  CallableUnitSignature SEMICOLON
  public static boolean NativeActionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeActionDefinition")) return false;
    if (!nextTokenIs(b, "<native action definition>", AT, NATIVE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NATIVE_ACTION_DEFINITION, "<native action definition>");
    r = NativeActionDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 2, NATIVE, ACTION);
    p = r; // pin = 3
    r = r && report_error_(b, CallableUnitSignature(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean NativeActionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeActionDefinition_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NativeActionDefinition_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (public)? native function (LT Parameter GT)? CallableUnitSignature SEMICOLON
  public static boolean NativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "<native function definition>", NATIVE, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NATIVE_FUNCTION_DEFINITION, "<native function definition>");
    r = NativeFunctionDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 2, NATIVE, FUNCTION);
    p = r; // pin = 3
    r = r && report_error_(b, NativeFunctionDefinition_3(b, l + 1));
    r = p && report_error_(b, CallableUnitSignature(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean NativeFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT Parameter GT)?
  private static boolean NativeFunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition_3")) return false;
    NativeFunctionDefinition_3_0(b, l + 1);
    return true;
  }

  // LT Parameter GT
  private static boolean NativeFunctionDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // next SEMICOLON
  public static boolean NextStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NextStatement")) return false;
    if (!nextTokenIs(b, NEXT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NEXT_STATEMENT, null);
    r = consumeTokens(b, 1, NEXT, SEMICOLON);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AnnotationAttachment* action CallableUnitSignature CallableUnitBody
  public static boolean NonNativeActionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeActionDefinition")) return false;
    if (!nextTokenIs(b, "<non native action definition>", AT, ACTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NON_NATIVE_ACTION_DEFINITION, "<non native action definition>");
    r = NonNativeActionDefinition_0(b, l + 1);
    r = r && consumeToken(b, ACTION);
    p = r; // pin = 2
    r = r && report_error_(b, CallableUnitSignature(b, l + 1));
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean NonNativeActionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeActionDefinition_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NonNativeActionDefinition_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (public)? function (LT Parameter GT)? CallableUnitSignature CallableUnitBody
  public static boolean NonNativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "<non native function definition>", FUNCTION, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NON_NATIVE_FUNCTION_DEFINITION, "<non native function definition>");
    r = NonNativeFunctionDefinition_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, NonNativeFunctionDefinition_2(b, l + 1));
    r = p && report_error_(b, CallableUnitSignature(b, l + 1)) && r;
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean NonNativeFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT Parameter GT)?
  private static boolean NonNativeFunctionDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition_2")) return false;
    NonNativeFunctionDefinition_2_0(b, l + 1);
    return true;
  }

  // LT Parameter GT
  private static boolean NonNativeFunctionDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // package PackageName PackageVersion? SEMICOLON
  public static boolean PackageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, null);
    r = consumeToken(b, PACKAGE);
    p = r; // pin = 1
    r = r && report_error_(b, PackageName(b, l + 1));
    r = p && report_error_(b, PackageDeclaration_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // PackageVersion?
  private static boolean PackageDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration_2")) return false;
    PackageVersion(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean PackageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, null);
    r = consumeToken(b, IDENTIFIER);
    p = r; // pin = 1
    r = r && PackageName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT identifier)*
  private static boolean PackageName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PackageName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PackageName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT identifier
  private static boolean PackageName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // version identifier
  public static boolean PackageVersion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageVersion")) return false;
    if (!nextTokenIs(b, VERSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_VERSION, null);
    r = consumeTokens(b, 1, VERSION, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AnnotationAttachment* TypeName identifier
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = Parameter_0(b, l + 1);
    r = r && TypeName(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AnnotationAttachment*
  private static boolean Parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Parameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Parameter (COMMA Parameter)*
  public static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = Parameter(b, l + 1);
    p = r; // pin = 1
    r = r && ParameterList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA Parameter)*
  private static boolean ParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Parameter
  private static boolean ParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PRIVATE COLON FieldDefinition*
  public static boolean PrivateStructBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrivateStructBody")) return false;
    if (!nextTokenIs(b, PRIVATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PRIVATE, COLON);
    r = r && PrivateStructBody_2(b, l + 1);
    exit_section_(b, m, PRIVATE_STRUCT_BODY, r);
    return r;
  }

  // FieldDefinition*
  private static boolean PrivateStructBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrivateStructBody_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FieldDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PrivateStructBody_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // identifier | SimpleLiteral
  public static boolean RecordKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordKey")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_KEY, "<record key>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = SimpleLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RecordKey COLON Expression
  public static boolean RecordKeyValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordKeyValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_KEY_VALUE, "<record key value>");
    r = RecordKey(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE (RecordKeyValue (COMMA RecordKeyValue)*)? RIGHT_BRACE
  public static boolean RecordLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && RecordLiteral_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, RECORD_LITERAL, r);
    return r;
  }

  // (RecordKeyValue (COMMA RecordKeyValue)*)?
  private static boolean RecordLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral_1")) return false;
    RecordLiteral_1_0(b, l + 1);
    return true;
  }

  // RecordKeyValue (COMMA RecordKeyValue)*
  private static boolean RecordLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordKeyValue(b, l + 1);
    r = r && RecordLiteral_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA RecordKeyValue)*
  private static boolean RecordLiteral_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RecordLiteral_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RecordLiteral_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA RecordKeyValue
  private static boolean RecordLiteral_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && RecordKeyValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BuiltInReferenceTypeName | UserDefineTypeName | AnonStructTypeName
  public static boolean ReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REFERENCE_TYPE_NAME, "<reference type name>");
    r = BuiltInReferenceTypeName(b, l + 1);
    if (!r) r = UserDefineTypeName(b, l + 1);
    if (!r) r = AnonStructTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttachment* resource identifier LEFT_PARENTHESIS ParameterList RIGHT_PARENTHESIS CallableUnitBody
  public static boolean ResourceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition")) return false;
    if (!nextTokenIs(b, "<resource definition>", AT, RESOURCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_DEFINITION, "<resource definition>");
    r = ResourceDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, RESOURCE, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, ParameterList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean ResourceDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ResourceDefinition_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // retries LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS
  public static boolean RetriesStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetriesStatement")) return false;
    if (!nextTokenIs(b, RETRIES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETRIES_STATEMENT, null);
    r = consumeTokens(b, 1, RETRIES, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RETURNS? LEFT_PARENTHESIS (ParameterList | TypeList) RIGHT_PARENTHESIS
  public static boolean ReturnParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters")) return false;
    if (!nextTokenIs(b, "<return parameters>", LEFT_PARENTHESIS, RETURNS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_PARAMETERS, "<return parameters>");
    r = ReturnParameters_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && ReturnParameters_2(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RETURNS?
  private static boolean ReturnParameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters_0")) return false;
    consumeToken(b, RETURNS);
    return true;
  }

  // ParameterList | TypeList
  private static boolean ReturnParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    if (!r) r = TypeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN ExpressionList? SEMICOLON
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // ExpressionList?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LEFT_BRACE EndpointDeclaration* VariableDefinitionStatement* ResourceDefinition* RIGHT_BRACE
  public static boolean ServiceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && ServiceBody_1(b, l + 1);
    r = r && ServiceBody_2(b, l + 1);
    r = r && ServiceBody_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, SERVICE_BODY, r);
    return r;
  }

  // EndpointDeclaration*
  private static boolean ServiceBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VariableDefinitionStatement*
  private static boolean ServiceBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableDefinitionStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ResourceDefinition*
  private static boolean ServiceBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ResourceDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // service (LT identifier GT) identifier ServiceBody
  public static boolean ServiceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition")) return false;
    if (!nextTokenIs(b, SERVICE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_DEFINITION, null);
    r = consumeToken(b, SERVICE);
    p = r; // pin = 1
    r = r && report_error_(b, ServiceDefinition_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && ServiceBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LT identifier GT
  private static boolean ServiceDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LT, IDENTIFIER, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ADD|SUB)? integerLiteral /*| (ADD|SUB)? floatingPointLiteral*/ | quotedStringLiteral
  public static boolean SimpleLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_LITERAL, "<simple literal>");
    r = SimpleLiteral_0(b, l + 1);
    if (!r) r = consumeToken(b, QUOTEDSTRINGLITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ADD|SUB)? integerLiteral
  private static boolean SimpleLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleLiteral_0_0(b, l + 1);
    r = r && consumeToken(b, INTEGERLITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ADD|SUB)?
  private static boolean SimpleLiteral_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_0_0")) return false;
    SimpleLiteral_0_0_0(b, l + 1);
    return true;
  }

  // ADD|SUB
  private static boolean SimpleLiteral_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableDefinitionStatement
  //     |   AssignmentStatement
  //     |   BindStatement
  //     |   IfElseStatement
  //     |   ForeachStatement
  //     |   WhileStatement
  //     |   NextStatement
  //     |   BreakStatement
  //     |   ForkJoinStatement
  //     |   TryCatchStatement
  //     |   ThrowStatement
  //     |   ReturnStatement
  //     |   WorkerInteractionStatement
  //     |   ExpressionStmt
  //     |   TransactionStatement
  //     |   AbortStatement
  //     |   LockStatement
  //     |   NamespaceDeclarationStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = VariableDefinitionStatement(b, l + 1);
    if (!r) r = AssignmentStatement(b, l + 1);
    if (!r) r = BindStatement(b, l + 1);
    if (!r) r = IfElseStatement(b, l + 1);
    if (!r) r = ForeachStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = NextStatement(b, l + 1);
    if (!r) r = BreakStatement(b, l + 1);
    if (!r) r = ForkJoinStatement(b, l + 1);
    if (!r) r = TryCatchStatement(b, l + 1);
    if (!r) r = ThrowStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = WorkerInteractionStatement(b, l + 1);
    if (!r) r = ExpressionStmt(b, l + 1);
    if (!r) r = TransactionStatement(b, l + 1);
    if (!r) r = AbortStatement(b, l + 1);
    if (!r) r = LockStatement(b, l + 1);
    if (!r) r = NamespaceDeclarationStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE FieldDefinition* PrivateStructBody? RIGHT_BRACE
  public static boolean StructBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && StructBody_1(b, l + 1);
    r = r && StructBody_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, STRUCT_BODY, r);
    return r;
  }

  // FieldDefinition*
  private static boolean StructBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FieldDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PrivateStructBody?
  private static boolean StructBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructBody_2")) return false;
    PrivateStructBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // throw Expression SEMICOLON
  public static boolean ThrowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowStatement")) return false;
    if (!nextTokenIs(b, THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, THROW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // timeout LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_PARENTHESIS TypeName identifier RIGHT_PARENTHESIS LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean TimeoutClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimeoutClause")) return false;
    if (!nextTokenIs(b, TIMEOUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TIMEOUT, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, RIGHT_PARENTHESIS, LEFT_BRACE);
    r = r && TimeoutClause_9(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, TIMEOUT_CLAUSE, r);
    return r;
  }

  // Statement*
  private static boolean TimeoutClause_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimeoutClause_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TimeoutClause_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // !(service | function | connector | struct | enum | const | annotation | transformer)
  static boolean TopLevelDefinitionRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TopLevelDefinitionRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // service | function | connector | struct | enum | const | annotation | transformer
  private static boolean TopLevelDefinitionRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SERVICE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, CONNECTOR);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, ANNOTATION);
    if (!r) r = consumeToken(b, TRANSFORMER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // transaction (WITH TransactionPropertyInitStatementList)? LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean TransactionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionClause")) return false;
    if (!nextTokenIs(b, TRANSACTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRANSACTION_CLAUSE, null);
    r = consumeToken(b, TRANSACTION);
    p = r; // pin = 1
    r = r && report_error_(b, TransactionClause_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, TransactionClause_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (WITH TransactionPropertyInitStatementList)?
  private static boolean TransactionClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionClause_1")) return false;
    TransactionClause_1_0(b, l + 1);
    return true;
  }

  // WITH TransactionPropertyInitStatementList
  private static boolean TransactionClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && TransactionPropertyInitStatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement*
  private static boolean TransactionClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionClause_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TransactionClause_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RetriesStatement
  public static boolean TransactionPropertyInitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionPropertyInitStatement")) return false;
    if (!nextTokenIs(b, RETRIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RetriesStatement(b, l + 1);
    exit_section_(b, m, TRANSACTION_PROPERTY_INIT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TransactionPropertyInitStatement (COMMA TransactionPropertyInitStatement)*
  public static boolean TransactionPropertyInitStatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionPropertyInitStatementList")) return false;
    if (!nextTokenIs(b, RETRIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TransactionPropertyInitStatement(b, l + 1);
    r = r && TransactionPropertyInitStatementList_1(b, l + 1);
    exit_section_(b, m, TRANSACTION_PROPERTY_INIT_STATEMENT_LIST, r);
    return r;
  }

  // (COMMA TransactionPropertyInitStatement)*
  private static boolean TransactionPropertyInitStatementList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionPropertyInitStatementList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TransactionPropertyInitStatementList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TransactionPropertyInitStatementList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA TransactionPropertyInitStatement
  private static boolean TransactionPropertyInitStatementList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionPropertyInitStatementList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TransactionPropertyInitStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TransactionClause FailedClause?
  public static boolean TransactionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionStatement")) return false;
    if (!nextTokenIs(b, TRANSACTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TransactionClause(b, l + 1);
    r = r && TransactionStatement_1(b, l + 1);
    exit_section_(b, m, TRANSACTION_STATEMENT, r);
    return r;
  }

  // FailedClause?
  private static boolean TransactionStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionStatement_1")) return false;
    FailedClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? transformer LT ParameterList GT (identifier LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS)? CallableUnitBody
  public static boolean TransformerDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformerDefinition")) return false;
    if (!nextTokenIs(b, "<transformer definition>", PUBLIC, TRANSFORMER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRANSFORMER_DEFINITION, "<transformer definition>");
    r = TransformerDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, TRANSFORMER, LT);
    p = r; // pin = 2
    r = r && report_error_(b, ParameterList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, GT)) && r;
    r = p && report_error_(b, TransformerDefinition_5(b, l + 1)) && r;
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean TransformerDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformerDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (identifier LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS)?
  private static boolean TransformerDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformerDefinition_5")) return false;
    TransformerDefinition_5_0(b, l + 1);
    return true;
  }

  // identifier LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS
  private static boolean TransformerDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformerDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LEFT_PARENTHESIS);
    r = r && TransformerDefinition_5_0_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParameterList?
  private static boolean TransformerDefinition_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransformerDefinition_5_0_2")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ExpressionList RARROW identifier SEMICOLON | ExpressionList RARROW fork SEMICOLON
  public static boolean TriggerWorker(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TriggerWorker")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRIGGER_WORKER, "<trigger worker>");
    r = TriggerWorker_0(b, l + 1);
    if (!r) r = TriggerWorker_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ExpressionList RARROW identifier SEMICOLON
  private static boolean TriggerWorker_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TriggerWorker_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionList(b, l + 1);
    r = r && consumeTokens(b, 0, RARROW, IDENTIFIER, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExpressionList RARROW fork SEMICOLON
  private static boolean TriggerWorker_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TriggerWorker_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionList(b, l + 1);
    r = r && consumeTokens(b, 0, RARROW, FORK, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // try LEFT_BRACE Statement* RIGHT_BRACE CatchClauses
  public static boolean TryCatchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryCatchStatement")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TRY, LEFT_BRACE);
    r = r && TryCatchStatement_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    r = r && CatchClauses(b, l + 1);
    exit_section_(b, m, TRY_CATCH_STATEMENT, r);
    return r;
  }

  // Statement*
  private static boolean TryCatchStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryCatchStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TryCatchStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TypeName (COMMA TypeName)*
  static boolean TypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = TypeName(b, l + 1);
    p = r; // pin = 1
    r = r && TypeList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA TypeName)*
  private static boolean TypeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TypeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA TypeName
  private static boolean TypeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // any |type | ValueTypeName | ReferenceTypeName | /*TypeName*/ (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean TypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = ReferenceTypeName(b, l + 1);
    if (!r) r = TypeName_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean TypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName_4_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!TypeName_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeName_4", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean TypeName_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NameReference
  public static boolean UserDefineTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefineTypeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameReference(b, l + 1);
    exit_section_(b, m, USER_DEFINE_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // boolean | int | float | string | blob
  public static boolean ValueTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPE_NAME, "<value type name>");
    r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BLOB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeName identifier (ASSIGN Expression)? SEMICOLON
  public static boolean VariableDefinitionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION_STATEMENT, "<variable definition statement>");
    r = TypeName(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, VariableDefinitionStatement_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ASSIGN Expression)?
  private static boolean VariableDefinitionStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2")) return false;
    VariableDefinitionStatement_2_0(b, l + 1);
    return true;
  }

  // ASSIGN Expression
  private static boolean VariableDefinitionStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ASSIGN);
    p = r; // pin = 1
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FunctionInvocation | NameReference
  public static boolean VariableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionInvocation(b, l + 1);
    if (!r) r = NameReference(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference (COMMA VariableReference)*
  public static boolean VariableReferenceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && VariableReferenceList_1(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE_LIST, r);
    return r;
  }

  // (COMMA VariableReference)*
  private static boolean VariableReferenceList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableReferenceList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableReferenceList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA VariableReference
  private static boolean VariableReferenceList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeTokens(b, 1, WHILE, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, WhileStatement_5(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement*
  private static boolean WhileStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStatement_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // WorkerDefinition LEFT_BRACE Statement* RIGHT_BRACE
  public static boolean WorkerDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerDeclaration")) return false;
    if (!nextTokenIs(b, WORKER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WorkerDefinition(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACE);
    r = r && WorkerDeclaration_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, WORKER_DECLARATION, r);
    return r;
  }

  // Statement*
  private static boolean WorkerDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerDeclaration_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WorkerDeclaration_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // worker identifier
  public static boolean WorkerDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerDefinition")) return false;
    if (!nextTokenIs(b, WORKER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORKER, IDENTIFIER);
    exit_section_(b, m, WORKER_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // TriggerWorker | WorkerReply
  public static boolean WorkerInteractionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerInteractionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WORKER_INTERACTION_STATEMENT, "<worker interaction statement>");
    r = TriggerWorker(b, l + 1);
    if (!r) r = WorkerReply(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExpressionList LARROW identifier SEMICOLON
  public static boolean WorkerReply(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerReply")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WORKER_REPLY, "<worker reply>");
    r = ExpressionList(b, l + 1);
    r = r && consumeTokens(b, 0, LARROW, IDENTIFIER, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AT (LEFT_BRACKET Expression RIGHT_BRACKET)?
  public static boolean XmlAttrib(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlAttrib")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && XmlAttrib_1(b, l + 1);
    exit_section_(b, m, XML_ATTRIB, r);
    return r;
  }

  // (LEFT_BRACKET Expression RIGHT_BRACKET)?
  private static boolean XmlAttrib_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlAttrib_1")) return false;
    XmlAttrib_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACKET Expression RIGHT_BRACKET
  private static boolean XmlAttrib_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlAttrib_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean XmlLocalName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlLocalName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, XML_LOCAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // quotedStringLiteral
  public static boolean XmlNamespaceName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlNamespaceName")) return false;
    if (!nextTokenIs(b, QUOTEDSTRINGLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTEDSTRINGLITERAL);
    exit_section_(b, m, XML_NAMESPACE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttribute (COMMA AnnotationAttribute)*
  public static boolean annotationAttributeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationAttributeList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnnotationAttribute(b, l + 1);
    r = r && annotationAttributeList_1(b, l + 1);
    exit_section_(b, m, ANNOTATION_ATTRIBUTE_LIST, r);
    return r;
  }

  // (COMMA AnnotationAttribute)*
  private static boolean annotationAttributeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationAttributeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotationAttributeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotationAttributeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA AnnotationAttribute
  private static boolean annotationAttributeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationAttributeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AnnotationAttribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (public)? connector identifier LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS ConnectorBody
  public static boolean connectorDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectorDefinition")) return false;
    if (!nextTokenIs(b, "<connector definition>", CONNECTOR, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONNECTOR_DEFINITION, "<connector definition>");
    r = connectorDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, CONNECTOR, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, connectorDefinition_4(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && ConnectorBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean connectorDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectorDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // ParameterList?
  private static boolean connectorDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectorDefinition_4")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? const ValueTypeName identifier ASSIGN Expression SEMICOLON
  public static boolean constantDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDefinition")) return false;
    if (!nextTokenIs(b, "<constant definition>", CONST, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DEFINITION, "<constant definition>");
    r = constantDefinition_0(b, l + 1);
    r = r && consumeToken(b, CONST);
    p = r; // pin = 2
    r = r && report_error_(b, ValueTypeName(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, IDENTIFIER, ASSIGN)) && r;
    r = p && report_error_(b, Expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean constantDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // (public)? enum identifier LEFT_BRACE Enumerator (COMMA Enumerator)* RIGHT_BRACE
  public static boolean enumDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDefinition")) return false;
    if (!nextTokenIs(b, "<enum definition>", ENUM, PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DEFINITION, "<enum definition>");
    r = enumDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 0, ENUM, IDENTIFIER, LEFT_BRACE);
    r = r && Enumerator(b, l + 1);
    r = r && enumDefinition_5(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (public)?
  private static boolean enumDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (COMMA Enumerator)*
  private static boolean enumDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDefinition_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enumDefinition_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumDefinition_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Enumerator
  private static boolean enumDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Enumerator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (public)? struct identifier StructBody
  public static boolean structDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDefinition")) return false;
    if (!nextTokenIs(b, "<struct definition>", PUBLIC, STRUCT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DEFINITION, "<struct definition>");
    r = structDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, STRUCT, IDENTIFIER);
    p = r; // pin = 2
    r = r && StructBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean structDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  final static Parser TopLevelDefinitionRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TopLevelDefinitionRecover(b, l + 1);
    }
  };
}
