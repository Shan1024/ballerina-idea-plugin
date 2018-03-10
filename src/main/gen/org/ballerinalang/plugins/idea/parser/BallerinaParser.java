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
package org.ballerinalang.plugins.idea.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.*;
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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABORT_STATEMENT) {
      r = AbortStatement(b, 0);
    }
    else if (t == ACTION_DEFINITION) {
      r = ActionDefinition(b, 0);
    }
    else if (t == ACTION_INVOCATION) {
      r = ActionInvocation(b, 0);
    }
    else if (t == ALIAS) {
      r = Alias(b, 0);
    }
    else if (t == ANNOTATION_ATTACHMENT) {
      r = AnnotationAttachment(b, 0);
    }
    else if (t == ANNOTATION_DEFINITION) {
      r = AnnotationDefinition(b, 0);
    }
    else if (t == ANON_STRUCT_TYPE_NAME) {
      r = AnonStructTypeName(b, 0);
    }
    else if (t == ANY_IDENTIFIER_NAME) {
      r = AnyIdentifierName(b, 0);
    }
    else if (t == ASSIGNMENT_STATEMENT) {
      r = AssignmentStatement(b, 0);
    }
    else if (t == ATTACHMENT_POINT) {
      r = AttachmentPoint(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = Attribute(b, 0);
    }
    else if (t == BLOCK) {
      r = Block(b, 0);
    }
    else if (t == BLOCK_WITH_ENDPOINT) {
      r = BlockWithEndpoint(b, 0);
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
    else if (t == CLOSE_TAG) {
      r = CloseTag(b, 0);
    }
    else if (t == COMMENT) {
      r = Comment(b, 0);
    }
    else if (t == COMPLETE_PACKAGE_NAME) {
      r = CompletePackageName(b, 0);
    }
    else if (t == CONNECTOR_BODY) {
      r = ConnectorBody(b, 0);
    }
    else if (t == CONSTANT_DEFINITION) {
      r = ConstantDefinition(b, 0);
    }
    else if (t == CONTENT) {
      r = Content(b, 0);
    }
    else if (t == DEFINITION) {
      r = Definition(b, 0);
    }
    else if (t == ELEMENT) {
      r = Element(b, 0);
    }
    else if (t == ELSE_CLAUSE) {
      r = ElseClause(b, 0);
    }
    else if (t == ELSE_IF_CLAUSE) {
      r = ElseIfClause(b, 0);
    }
    else if (t == EMPTY_TAG) {
      r = EmptyTag(b, 0);
    }
    else if (t == ENDPOINT_DECLARATION) {
      r = EndpointDeclaration(b, 0);
    }
    else if (t == ENUMERATOR) {
      r = Enumerator(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0, -1);
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
    else if (t == GLOBAL_ENDPOINT_DEFINITION) {
      r = GlobalEndpointDefinition(b, 0);
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
    else if (t == JSON_TYPE_NAME) {
      r = JsonTypeName(b, 0);
    }
    else if (t == LAMBDA_FUNCTION) {
      r = LambdaFunction(b, 0);
    }
    else if (t == LOCK_STATEMENT) {
      r = LockStatement(b, 0);
    }
    else if (t == MAP_TYPE_NAME) {
      r = MapTypeName(b, 0);
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
    else if (t == NEXT_STATEMENT) {
      r = NextStatement(b, 0);
    }
    else if (t == PACKAGE_DECLARATION) {
      r = PackageDeclaration(b, 0);
    }
    else if (t == PACKAGE_NAME) {
      r = PackageName(b, 0);
    }
    else if (t == PACKAGE_REFERENCE) {
      r = PackageReference(b, 0);
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
    else if (t == PROC_INS) {
      r = ProcIns(b, 0);
    }
    else if (t == RECORD_KEY) {
      r = RecordKey(b, 0);
    }
    else if (t == RECORD_KEY_VALUE) {
      r = RecordKeyValue(b, 0);
    }
    else if (t == RESERVED_WORD) {
      r = ReservedWord(b, 0);
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
    else if (t == START_TAG) {
      r = StartTag(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STRING_TEMPLATE_CONTENT) {
      r = StringTemplateContent(b, 0);
    }
    else if (t == STRUCT_BODY) {
      r = StructBody(b, 0);
    }
    else if (t == STRUCT_DEFINITION) {
      r = StructDefinition(b, 0);
    }
    else if (t == TABLE_TYPE_NAME) {
      r = TableTypeName(b, 0);
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
      r = TypeName(b, 0, -1);
    }
    else if (t == USER_DEFINE_TYPE_NAME) {
      r = UserDefineTypeName(b, 0);
    }
    else if (t == VARIABLE_DEFINITION_STATEMENT) {
      r = VariableDefinitionStatement(b, 0);
    }
    else if (t == VARIABLE_REFERENCE) {
      r = VariableReference(b, 0, -1);
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
    else if (t == WORKER_INTERACTION_STATEMENT) {
      r = WorkerInteractionStatement(b, 0);
    }
    else if (t == WORKER_REPLY) {
      r = WorkerReply(b, 0);
    }
    else if (t == XML_ATTRIB) {
      r = XmlAttrib(b, 0);
    }
    else if (t == XML_DOUBLE_QUOTED_STRING) {
      r = XmlDoubleQuotedString(b, 0);
    }
    else if (t == XML_ITEM) {
      r = XmlItem(b, 0);
    }
    else if (t == XML_LOCAL_NAME) {
      r = XmlLocalName(b, 0);
    }
    else if (t == XML_NAMESPACE_NAME) {
      r = XmlNamespaceName(b, 0);
    }
    else if (t == XML_QUALIFIED_NAME) {
      r = XmlQualifiedName(b, 0);
    }
    else if (t == XML_QUOTED_STRING) {
      r = XmlQuotedString(b, 0);
    }
    else if (t == XML_SINGLE_QUOTED_STRING) {
      r = XmlSingleQuotedString(b, 0);
    }
    else if (t == XML_TEXT) {
      r = XmlText(b, 0);
    }
    else if (t == XML_TYPE_NAME) {
      r = XmlTypeName(b, 0);
    }
    else if (t == CONNECTOR_DEFINITION) {
      r = connectorDefinition(b, 0);
    }
    else if (t == DEPRECATED_ATTACHMENT) {
      r = deprecatedAttachment(b, 0);
    }
    else if (t == DEPRECATED_TEMPLATE_INLINE_CODE) {
      r = deprecatedTemplateInlineCode(b, 0);
    }
    else if (t == DEPRECATED_TEXT) {
      r = deprecatedText(b, 0);
    }
    else if (t == DOC_TEXT) {
      r = docText(b, 0);
    }
    else if (t == DOCUMENTATION_ATTACHMENT) {
      r = documentationAttachment(b, 0);
    }
    else if (t == DOCUMENTATION_TEMPLATE_ATTRIBUTE_DESCRIPTION) {
      r = documentationTemplateAttributeDescription(b, 0);
    }
    else if (t == DOCUMENTATION_TEMPLATE_CONTENT) {
      r = documentationTemplateContent(b, 0);
    }
    else if (t == DOCUMENTATION_TEMPLATE_INLINE_CODE) {
      r = documentationTemplateInlineCode(b, 0);
    }
    else if (t == DOUBLE_BACK_TICK_DEPRECATED_INLINE_CODE) {
      r = doubleBackTickDeprecatedInlineCode(b, 0);
    }
    else if (t == DOUBLE_BACK_TICK_DOC_INLINE_CODE) {
      r = doubleBackTickDocInlineCode(b, 0);
    }
    else if (t == ENUM_DEFINITION) {
      r = enumDefinition(b, 0);
    }
    else if (t == ORG_NAME) {
      r = orgName(b, 0);
    }
    else if (t == PARAMETER_TYPE_NAME) {
      r = parameterTypeName(b, 0);
    }
    else if (t == PARAMETER_TYPE_NAME_LIST) {
      r = parameterTypeNameList(b, 0);
    }
    else if (t == SINGLE_BACK_TICK_DEPRECATED_INLINE_CODE) {
      r = singleBackTickDeprecatedInlineCode(b, 0);
    }
    else if (t == SINGLE_BACK_TICK_DOC_INLINE_CODE) {
      r = singleBackTickDocInlineCode(b, 0);
    }
    else if (t == TRIPLE_BACK_TICK_DEPRECATED_INLINE_CODE) {
      r = tripleBackTickDeprecatedInlineCode(b, 0);
    }
    else if (t == TRIPLE_BACK_TICK_DOC_INLINE_CODE) {
      r = tripleBackTickDocInlineCode(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return CompilationUnit(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ANY_TYPE_NAME, ARRAY_TYPE_NAME, REFERENCE_TYPE_NAME, TYPE_NAME,
      TYPE_TYPE_NAME, VALUE_TYPE_NAME),
    create_token_set_(FIELD_VARIABLE_REFERENCE, FUNCTION_INVOCATION_REFERENCE, INVOCATION_REFERENCE, MAP_ARRAY_VARIABLE_REFERENCE,
      SIMPLE_VARIABLE_REFERENCE, VARIABLE_REFERENCE, XML_ATTRIB_VARIABLE_REFERENCE),
    create_token_set_(ARRAY_LITERAL, BINARY_ADD_SUB_EXPRESSION, BINARY_AND_EXPRESSION, BINARY_COMPARE_EXPRESSION,
      BINARY_DIV_MUL_MOD_EXPRESSION, BINARY_EQUAL_EXPRESSION, BINARY_OR_EXPRESSION, BINARY_POW_EXPRESSION,
      BRACED_EXPRESSION, BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION, EXPRESSION, LAMBDA_FUNCTION_EXPRESSION,
      RECORD_LITERAL, SIMPLE_LITERAL, STRING_TEMPLATE_LITERAL, TERNARY_EXPRESSION,
      TYPE_ACCESS_EXPRESSION, TYPE_CASTING_EXPRESSION, TYPE_CONVERSION_EXPRESSION, TYPE_INIT_EXPRESSION,
      UNARY_EXPRESSION, VALUE_TYPE_TYPE_EXPRESSION, VARIABLE_REFERENCE_EXPRESSION, XML_LITERAL),
  };

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
  // VariableReference RARROW FunctionInvocation
  public static boolean ActionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActionInvocation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ACTION_INVOCATION, null);
    r = VariableReference(b, l + 1, -1);
    r = r && consumeToken(b, RARROW);
    p = r; // pin = 2
    r = r && FunctionInvocation(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // AT NameReference RecordLiteral?
  public static boolean AnnotationAttachment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttachment")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && NameReference(b, l + 1);
    r = r && AnnotationAttachment_2(b, l + 1);
    exit_section_(b, m, ANNOTATION_ATTACHMENT, r);
    return r;
  }

  // RecordLiteral?
  private static boolean AnnotationAttachment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationAttachment_2")) return false;
    RecordLiteral(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? annotation (LT AttachmentPoint (COMMA AttachmentPoint)* GT)?  identifier UserDefineTypeName? SEMICOLON
  public static boolean AnnotationDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition")) return false;
    if (!nextTokenIs(b, "<annotation definition>", ANNOTATION, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_DEFINITION, "<annotation definition>");
    r = AnnotationDefinition_0(b, l + 1);
    r = r && consumeToken(b, ANNOTATION);
    p = r; // pin = 2
    r = r && report_error_(b, AnnotationDefinition_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && report_error_(b, AnnotationDefinition_4(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean AnnotationDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT AttachmentPoint (COMMA AttachmentPoint)* GT)?
  private static boolean AnnotationDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_2")) return false;
    AnnotationDefinition_2_0(b, l + 1);
    return true;
  }

  // LT AttachmentPoint (COMMA AttachmentPoint)* GT
  private static boolean AnnotationDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && AttachmentPoint(b, l + 1);
    r = r && AnnotationDefinition_2_0_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA AttachmentPoint)*
  private static boolean AnnotationDefinition_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationDefinition_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AnnotationDefinition_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA AttachmentPoint
  private static boolean AnnotationDefinition_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AttachmentPoint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UserDefineTypeName?
  private static boolean AnnotationDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotationDefinition_4")) return false;
    UserDefineTypeName(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // struct StructBody
  public static boolean AnonStructTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonStructTypeName")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANON_STRUCT_TYPE_NAME, null);
    r = consumeToken(b, STRUCT);
    p = r; // pin = 1
    r = r && StructBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier | ReservedWord
  public static boolean AnyIdentifierName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyIdentifierName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_IDENTIFIER_NAME, "<any identifier name>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = ReservedWord(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (var)? VariableReferenceList ASSIGN (Expression | ActionInvocation) SEMICOLON
  public static boolean AssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement")) return false;
    if (!nextTokenIs(b, "<assignment statement>", IDENTIFIER, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = AssignmentStatement_0(b, l + 1);
    r = r && VariableReferenceList(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && AssignmentStatement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (var)?
  private static boolean AssignmentStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_0")) return false;
    consumeToken(b, VAR);
    return true;
  }

  // Expression | ActionInvocation
  private static boolean AssignmentStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    if (!r) r = ActionInvocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // XmlQualifiedName EQUALS XmlQuotedString
  public static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    if (!nextTokenIs(b, "<attribute>", XMLQNAME, XMLTAGEXPRESSIONSTART)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, "<attribute>");
    r = XmlQualifiedName(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && XmlQuotedString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Statement*
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, StatementRecover_parser_);
    return true;
  }

  /* ********************************************************** */
  // EndpointDeclaration* Block
  public static boolean BlockWithEndpoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpoint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_WITH_ENDPOINT, "<block with endpoint>");
    r = BlockWithEndpoint_0(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EndpointDeclaration*
  private static boolean BlockWithEndpoint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpoint_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockWithEndpoint_0", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // MapTypeName | XmlTypeName | JsonTypeName | TableTypeName | FunctionTypeName
  public static boolean BuiltInReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_REFERENCE_TYPE_NAME, "<built in reference type name>");
    r = MapTypeName(b, l + 1);
    if (!r) r = XmlTypeName(b, l + 1);
    if (!r) r = JsonTypeName(b, l + 1);
    if (!r) r = TableTypeName(b, l + 1);
    if (!r) r = FunctionTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnyTypeName | TypeTypeName | ValueTypeName | BuiltInReferenceTypeName | arrayTypeName
  public static boolean BuiltInTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_TYPE_NAME, "<built in type name>");
    r = AnyTypeName(b, l + 1);
    if (!r) r = TypeTypeName(b, l + 1);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName(b, l + 1);
    if (!r) r = TypeName(b, l + 1, 3);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE BlockWithEndpoint RIGHT_BRACE | LEFT_BRACE EndpointDeclaration* WorkerDeclaration+ RIGHT_BRACE
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

  // LEFT_BRACE BlockWithEndpoint RIGHT_BRACE
  private static boolean CallableUnitBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && BlockWithEndpoint(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
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
  // catch LEFT_PARENTHESIS TypeName identifier RIGHT_PARENTHESIS LEFT_BRACE Block RIGHT_BRACE
  public static boolean CatchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClause")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CATCH_CLAUSE, null);
    r = consumeTokens(b, 1, CATCH, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, TypeName(b, l + 1, -1));
    r = p && report_error_(b, consumeTokens(b, -1, IDENTIFIER, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CatchClause+ FinallyClause? | FinallyClause
  public static boolean CatchClauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchClauses")) return false;
    if (!nextTokenIs(b, "<catch clauses>", CATCH, FINALLY)) return false;
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
  // XML_TAG_OPEN_SLASH XmlQualifiedName XML_TAG_CLOSE
  public static boolean CloseTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseTag")) return false;
    if (!nextTokenIs(b, XML_TAG_OPEN_SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TAG_OPEN_SLASH);
    r = r && XmlQualifiedName(b, l + 1);
    r = r && consumeToken(b, XML_TAG_CLOSE);
    exit_section_(b, m, CLOSE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // XML_COMMENT_START (XMLCommentTemplateText Expression ExpressionEnd)* XMLCommentText
  public static boolean Comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment")) return false;
    if (!nextTokenIs(b, XML_COMMENT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_COMMENT_START);
    r = r && Comment_1(b, l + 1);
    r = r && consumeToken(b, XMLCOMMENTTEXT);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  // (XMLCommentTemplateText Expression ExpressionEnd)*
  private static boolean Comment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Comment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Comment_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // XMLCommentTemplateText Expression ExpressionEnd
  private static boolean Comment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XMLCOMMENTTEMPLATETEXT);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PackageDeclaration? (ImportDeclaration | NamespaceDeclaration)* Definition* <<eof>>
  static boolean CompilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompilationUnit_0(b, l + 1);
    r = r && CompilationUnit_1(b, l + 1);
    r = r && CompilationUnit_2(b, l + 1);
    r = r && eof(b, l + 1);
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

  // Definition*
  private static boolean CompilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // PackageName (DOT PackageName)* PackageVersion?
  public static boolean CompletePackageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompletePackageName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMPLETE_PACKAGE_NAME, null);
    r = PackageName(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, CompletePackageName_1(b, l + 1));
    r = p && CompletePackageName_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT PackageName)*
  private static boolean CompletePackageName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompletePackageName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompletePackageName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompletePackageName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT PackageName
  private static boolean CompletePackageName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompletePackageName_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && PackageName(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // PackageVersion?
  private static boolean CompletePackageName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompletePackageName_2")) return false;
    PackageVersion(b, l + 1);
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
  // (public)? const ValueTypeName identifier ASSIGN Expression SEMICOLON
  public static boolean ConstantDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDefinition")) return false;
    if (!nextTokenIs(b, "<constant definition>", CONST, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DEFINITION, "<constant definition>");
    r = ConstantDefinition_0(b, l + 1);
    r = r && consumeToken(b, CONST);
    p = r; // pin = 2
    r = r && report_error_(b, ValueTypeName(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, IDENTIFIER, ASSIGN)) && r;
    r = p && report_error_(b, Expression(b, l + 1, -1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean ConstantDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // XmlText? ((Element | CDATA | ProcIns | Comment) XmlText?)*
  public static boolean Content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    r = Content_0(b, l + 1);
    r = r && Content_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // XmlText?
  private static boolean Content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content_0")) return false;
    XmlText(b, l + 1);
    return true;
  }

  // ((Element | CDATA | ProcIns | Comment) XmlText?)*
  private static boolean Content_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Content_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Content_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (Element | CDATA | ProcIns | Comment) XmlText?
  private static boolean Content_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Content_1_0_0(b, l + 1);
    r = r && Content_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Element | CDATA | ProcIns | Comment
  private static boolean Content_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Element(b, l + 1);
    if (!r) r = consumeToken(b, CDATA);
    if (!r) r = ProcIns(b, l + 1);
    if (!r) r = Comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // XmlText?
  private static boolean Content_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content_1_0_1")) return false;
    XmlText(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AnnotationAttachment* documentationAttachment? deprecatedAttachment? (
  //                     StructDefinition | GlobalVariableDefinition | ServiceDefinition | FunctionDefinition
  //                     | connectorDefinition | enumDefinition | AnnotationDefinition | TransformerDefinition
  //                     | ConstantDefinition | GlobalEndpointDefinition)
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = Definition_0(b, l + 1);
    r = r && Definition_1(b, l + 1);
    r = r && Definition_2(b, l + 1);
    r = r && Definition_3(b, l + 1);
    exit_section_(b, l, m, r, false, TopLevelDefinitionRecover_parser_);
    return r;
  }

  // AnnotationAttachment*
  private static boolean Definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Definition_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // documentationAttachment?
  private static boolean Definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_1")) return false;
    documentationAttachment(b, l + 1);
    return true;
  }

  // deprecatedAttachment?
  private static boolean Definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_2")) return false;
    deprecatedAttachment(b, l + 1);
    return true;
  }

  // StructDefinition | GlobalVariableDefinition | ServiceDefinition | FunctionDefinition
  //                     | connectorDefinition | enumDefinition | AnnotationDefinition | TransformerDefinition
  //                     | ConstantDefinition | GlobalEndpointDefinition
  private static boolean Definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructDefinition(b, l + 1);
    if (!r) r = GlobalVariableDefinition(b, l + 1);
    if (!r) r = ServiceDefinition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    if (!r) r = connectorDefinition(b, l + 1);
    if (!r) r = enumDefinition(b, l + 1);
    if (!r) r = AnnotationDefinition(b, l + 1);
    if (!r) r = TransformerDefinition(b, l + 1);
    if (!r) r = ConstantDefinition(b, l + 1);
    if (!r) r = GlobalEndpointDefinition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StartTag Content CloseTag | EmptyTag
  public static boolean Element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Element")) return false;
    if (!nextTokenIs(b, XML_TAG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Element_0(b, l + 1);
    if (!r) r = EmptyTag(b, l + 1);
    exit_section_(b, m, ELEMENT, r);
    return r;
  }

  // StartTag Content CloseTag
  private static boolean Element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StartTag(b, l + 1);
    r = r && Content(b, l + 1);
    r = r && CloseTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // else LEFT_BRACE Block RIGHT_BRACE
  public static boolean ElseClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseClause")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_CLAUSE, null);
    r = consumeTokens(b, 1, ELSE, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // else if LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_BRACE Block RIGHT_BRACE
  public static boolean ElseIfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfClause")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_IF_CLAUSE, null);
    r = consumeTokens(b, 2, ELSE, IF, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // XML_TAG_OPEN XmlQualifiedName Attribute* XML_TAG_SLASH_CLOSE
  public static boolean EmptyTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyTag")) return false;
    if (!nextTokenIs(b, XML_TAG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TAG_OPEN);
    r = r && XmlQualifiedName(b, l + 1);
    r = r && EmptyTag_2(b, l + 1);
    r = r && consumeToken(b, XML_TAG_SLASH_CLOSE);
    exit_section_(b, m, EMPTY_TAG, r);
    return r;
  }

  // Attribute*
  private static boolean EmptyTag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyTag_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EmptyTag_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // AnnotationAttachment* endpoint (LT NameReference GT) identifier RecordLiteral?
  public static boolean EndpointDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration")) return false;
    if (!nextTokenIs(b, "<endpoint declaration>", AT, ENDPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_DECLARATION, "<endpoint declaration>");
    r = EndpointDeclaration_0(b, l + 1);
    r = r && consumeToken(b, ENDPOINT);
    p = r; // pin = 2
    r = r && report_error_(b, EndpointDeclaration_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && EndpointDeclaration_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean EndpointDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EndpointDeclaration_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LT NameReference GT
  private static boolean EndpointDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // RecordLiteral?
  private static boolean EndpointDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDeclaration_4")) return false;
    RecordLiteral(b, l + 1);
    return true;
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
  // Expression (COMMA Expression)*
  public static boolean ExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = Expression(b, l + 1, -1);
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
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (VariableReference | ActionInvocation) SEMICOLON
  public static boolean ExpressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionStmt_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, EXPRESSION_STMT, r);
    return r;
  }

  // VariableReference | ActionInvocation
  private static boolean ExpressionStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1, -1);
    if (!r) r = ActionInvocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // failed LEFT_BRACE Block RIGHT_BRACE
  public static boolean FailedClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FailedClause")) return false;
    if (!nextTokenIs(b, FAILED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FAILED_CLAUSE, null);
    r = consumeTokens(b, 1, FAILED, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DOT identifier
  public static boolean Field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FIELD, null);
    r = consumeTokens(b, 1, DOT, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TypeName identifier (ASSIGN SimpleLiteral)? SEMICOLON
  public static boolean FieldDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DEFINITION, "<field definition>");
    r = TypeName(b, l + 1, -1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, FieldDefinition_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // finally LEFT_BRACE Block RIGHT_BRACE
  public static boolean FinallyClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyClause")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FINALLY_CLAUSE, null);
    r = consumeTokens(b, 1, FINALLY, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // foreach LEFT_PARENTHESIS? VariableReferenceList in (Expression | IntRangeExpression) RIGHT_PARENTHESIS? LEFT_BRACE Block RIGHT_BRACE
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
    r = p && report_error_(b, Block(b, l + 1)) && r;
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
    r = Expression(b, l + 1, -1);
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

  /* ********************************************************** */
  // fork LEFT_BRACE WorkerDeclaration* RIGHT_BRACE JoinClause? TimeoutClause?
  public static boolean ForkJoinStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForkJoinStatement")) return false;
    if (!nextTokenIs(b, FORK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FORK_JOIN_STATEMENT, null);
    r = consumeTokens(b, 1, FORK, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, ForkJoinStatement_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_BRACE)) && r;
    r = p && report_error_(b, ForkJoinStatement_4(b, l + 1)) && r;
    r = p && ForkJoinStatement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r;
    Marker m = enter_section_(b);
    r = NameReference(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && FunctionInvocation_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FUNCTION_INVOCATION, r);
    return r;
  }

  // ExpressionList?
  private static boolean FunctionInvocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_2")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // function LEFT_PARENTHESIS (ParameterList | TypeList)? RIGHT_PARENTHESIS ReturnParameters?
  public static boolean FunctionTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE_NAME, null);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && FunctionTypeName_2(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS));
    r = p && FunctionTypeName_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    if (!r) r = consumeToken(b, TYPELIST);
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
  // public? EndpointDeclaration
  public static boolean GlobalEndpointDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalEndpointDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_ENDPOINT_DEFINITION, "<global endpoint definition>");
    r = GlobalEndpointDefinition_0(b, l + 1);
    r = r && EndpointDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // public?
  private static boolean GlobalEndpointDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalEndpointDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // (public)? TypeName identifier (ASSIGN Expression )? SEMICOLON
  public static boolean GlobalVariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_VARIABLE_DEFINITION, "<global variable definition>");
    r = GlobalVariableDefinition_0(b, l + 1);
    r = r && TypeName(b, l + 1, -1);
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
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_BRACE Block RIGHT_BRACE
  public static boolean IfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfClause")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_CLAUSE, null);
    r = consumeTokens(b, 1, IF, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IfClause ElseIfClause* ElseClause?
  public static boolean IfElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfElseStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_ELSE_STATEMENT, null);
    r = IfClause(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, IfElseStatement_1(b, l + 1));
    r = p && IfElseStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // import (orgName DIV)? CompletePackageName Alias? SEMICOLON
  public static boolean ImportDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, null);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, ImportDeclaration_1(b, l + 1));
    r = p && report_error_(b, CompletePackageName(b, l + 1)) && r;
    r = p && report_error_(b, ImportDeclaration_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (orgName DIV)?
  private static boolean ImportDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_1")) return false;
    ImportDeclaration_1_0(b, l + 1);
    return true;
  }

  // orgName DIV
  private static boolean ImportDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = orgName(b, l + 1);
    r = r && consumeToken(b, DIV);
    exit_section_(b, m, null, r);
    return r;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INDEX, null);
    r = consumeToken(b, LEFT_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && consumeToken(b, RIGHT_BRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, RANGE);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET|LEFT_PARENTHESIS) Expression RANGE Expression (RIGHT_BRACKET|RIGHT_PARENTHESIS)
  private static boolean IntRangeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntRangeExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntRangeExpression_1_0(b, l + 1);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RANGE);
    r = r && Expression(b, l + 1, -1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INVOCATION, null);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && report_error_(b, AnyIdentifierName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, Invocation_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionList?
  private static boolean Invocation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invocation_3")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // join (LEFT_PARENTHESIS JoinConditions RIGHT_PARENTHESIS)? LEFT_PARENTHESIS TypeName identifier RIGHT_PARENTHESIS LEFT_BRACE Block RIGHT_BRACE
  public static boolean JoinClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinClause")) return false;
    if (!nextTokenIs(b, JOIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, JOIN_CLAUSE, null);
    r = consumeToken(b, JOIN);
    p = r; // pin = 1
    r = r && report_error_(b, JoinClause_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, TypeName(b, l + 1, -1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, IDENTIFIER, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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

  /* ********************************************************** */
  // (some integerLiteral | all) (identifier (COMMA identifier)*)?
  public static boolean JoinConditions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions")) return false;
    if (!nextTokenIs(b, "<join conditions>", ALL, SOME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, JOIN_CONDITIONS, "<join conditions>");
    r = JoinConditions_0(b, l + 1);
    p = r; // pin = 1
    r = r && JoinConditions_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // some integerLiteral | all
  private static boolean JoinConditions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, SOME, INTEGERLITERAL);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, m, null, r);
    return r;
  }

  // (identifier (COMMA identifier)*)?
  private static boolean JoinConditions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1")) return false;
    JoinConditions_1_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)*
  private static boolean JoinConditions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && JoinConditions_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean JoinConditions_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!JoinConditions_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JoinConditions_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA identifier
  private static boolean JoinConditions_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // json (LT NameReference GT)?
  public static boolean JsonTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonTypeName")) return false;
    if (!nextTokenIs(b, JSON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, JSON_TYPE_NAME, null);
    r = consumeToken(b, JSON);
    p = r; // pin = 1
    r = r && JsonTypeName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LT NameReference GT)?
  private static boolean JsonTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonTypeName_1")) return false;
    JsonTypeName_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean JsonTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS ReturnParameters? CallableUnitBody
  public static boolean LambdaFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_FUNCTION, null);
    r = consumeTokens(b, 1, FUNCTION, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, LambdaFunction_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && report_error_(b, LambdaFunction_4(b, l + 1)) && r;
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // lock LEFT_BRACE Block RIGHT_BRACE
  public static boolean LockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LockStatement")) return false;
    if (!nextTokenIs(b, LOCK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LOCK_STATEMENT, null);
    r = consumeTokens(b, 1, LOCK, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // map (LT TypeName GT)?
  public static boolean MapTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapTypeName")) return false;
    if (!nextTokenIs(b, MAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAP_TYPE_NAME, null);
    r = consumeToken(b, MAP);
    p = r; // pin = 1
    r = r && MapTypeName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LT TypeName GT)?
  private static boolean MapTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapTypeName_1")) return false;
    MapTypeName_1_0(b, l + 1);
    return true;
  }

  // LT TypeName GT
  private static boolean MapTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PackageReference? identifier
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

  // PackageReference?
  private static boolean NameReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference_0")) return false;
    PackageReference(b, l + 1);
    return true;
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
  // AnnotationAttachment* documentationAttachment? deprecatedAttachment? native action  CallableUnitSignature SEMICOLON
  static boolean NativeActionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeActionDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = NativeActionDefinition_0(b, l + 1);
    r = r && NativeActionDefinition_1(b, l + 1);
    r = r && NativeActionDefinition_2(b, l + 1);
    r = r && consumeTokens(b, 2, NATIVE, ACTION);
    p = r; // pin = 5
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

  // documentationAttachment?
  private static boolean NativeActionDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeActionDefinition_1")) return false;
    documentationAttachment(b, l + 1);
    return true;
  }

  // deprecatedAttachment?
  private static boolean NativeActionDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeActionDefinition_2")) return false;
    deprecatedAttachment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? native function (LT Parameter GT)? CallableUnitSignature SEMICOLON
  static boolean NativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "", NATIVE, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
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
  // AnnotationAttachment* documentationAttachment? deprecatedAttachment? action CallableUnitSignature CallableUnitBody
  static boolean NonNativeActionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeActionDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = NonNativeActionDefinition_0(b, l + 1);
    r = r && NonNativeActionDefinition_1(b, l + 1);
    r = r && NonNativeActionDefinition_2(b, l + 1);
    r = r && consumeToken(b, ACTION);
    p = r; // pin = 4
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

  // documentationAttachment?
  private static boolean NonNativeActionDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeActionDefinition_1")) return false;
    documentationAttachment(b, l + 1);
    return true;
  }

  // deprecatedAttachment?
  private static boolean NonNativeActionDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeActionDefinition_2")) return false;
    deprecatedAttachment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? function (LT Parameter GT)? CallableUnitSignature CallableUnitBody
  static boolean NonNativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "", FUNCTION, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
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
  // package CompletePackageName SEMICOLON
  public static boolean PackageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, null);
    r = consumeToken(b, PACKAGE);
    p = r; // pin = 1
    r = r && report_error_(b, CompletePackageName(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier
  public static boolean PackageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PACKAGE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON
  public static boolean PackageReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, PACKAGE_REFERENCE, r);
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
    r = r && TypeName(b, l + 1, -1);
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
  // private COLON FieldDefinition*
  public static boolean PrivateStructBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrivateStructBody")) return false;
    if (!nextTokenIs(b, PRIVATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRIVATE_STRUCT_BODY, null);
    r = consumeTokens(b, 1, PRIVATE, COLON);
    p = r; // pin = 1
    r = r && PrivateStructBody_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // XML_TAG_SPECIAL_OPEN (XMLPITemplateText Expression ExpressionEnd)* XMLPIText
  public static boolean ProcIns(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcIns")) return false;
    if (!nextTokenIs(b, XML_TAG_SPECIAL_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TAG_SPECIAL_OPEN);
    r = r && ProcIns_1(b, l + 1);
    r = r && consumeToken(b, XMLPITEXT);
    exit_section_(b, m, PROC_INS, r);
    return r;
  }

  // (XMLPITemplateText Expression ExpressionEnd)*
  private static boolean ProcIns_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcIns_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ProcIns_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProcIns_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // XMLPITemplateText Expression ExpressionEnd
  private static boolean ProcIns_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcIns_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XMLPITEMPLATETEXT);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
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
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // foreach | map
  public static boolean ReservedWord(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReservedWord")) return false;
    if (!nextTokenIs(b, "<reserved word>", FOREACH, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESERVED_WORD, "<reserved word>");
    r = consumeToken(b, FOREACH);
    if (!r) r = consumeToken(b, MAP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttachment* documentationAttachment? deprecatedAttachment? resource identifier LEFT_PARENTHESIS ParameterList RIGHT_PARENTHESIS CallableUnitBody
  public static boolean ResourceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_DEFINITION, "<resource definition>");
    r = ResourceDefinition_0(b, l + 1);
    r = r && ResourceDefinition_1(b, l + 1);
    r = r && ResourceDefinition_2(b, l + 1);
    r = r && consumeTokens(b, 1, RESOURCE, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 4
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

  // documentationAttachment?
  private static boolean ResourceDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition_1")) return false;
    documentationAttachment(b, l + 1);
    return true;
  }

  // deprecatedAttachment?
  private static boolean ResourceDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition_2")) return false;
    deprecatedAttachment(b, l + 1);
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
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RETURNS? LEFT_PARENTHESIS (ParameterList | parameterTypeNameList) RIGHT_PARENTHESIS
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

  // ParameterList | parameterTypeNameList
  private static boolean ReturnParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    if (!r) r = parameterTypeNameList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return ExpressionList? SEMICOLON
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, ReturnStatement_1(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // service (LT NameReference GT) identifier ServiceBody
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

  // LT NameReference GT
  private static boolean ServiceDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XML_TAG_OPEN XmlQualifiedName Attribute* XML_TAG_CLOSE
  public static boolean StartTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTag")) return false;
    if (!nextTokenIs(b, XML_TAG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TAG_OPEN);
    r = r && XmlQualifiedName(b, l + 1);
    r = r && StartTag_2(b, l + 1);
    r = r && consumeToken(b, XML_TAG_CLOSE);
    exit_section_(b, m, START_TAG, r);
    return r;
  }

  // Attribute*
  private static boolean StartTag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTag_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StartTag_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ExpressionStmt
  //     |   AssignmentStatement
  //     |   VariableDefinitionStatement
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
  //     |   TransactionStatement
  //     |   AbortStatement
  //     |   LockStatement
  //     |   NamespaceDeclarationStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = ExpressionStmt(b, l + 1);
    if (!r) r = AssignmentStatement(b, l + 1);
    if (!r) r = VariableDefinitionStatement(b, l + 1);
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
    if (!r) r = TransactionStatement(b, l + 1);
    if (!r) r = AbortStatement(b, l + 1);
    if (!r) r = LockStatement(b, l + 1);
    if (!r) r = NamespaceDeclarationStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(int | string | '}' | '=')
  static boolean StatementRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !StatementRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // int | string | '}' | '='
  private static boolean StatementRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, RIGHT_BRACE);
    if (!r) r = consumeToken(b, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (StringTemplateExpressionStart Expression ExpressionEnd)+ StringTemplateText? | StringTemplateText
  public static boolean StringTemplateContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateContent")) return false;
    if (!nextTokenIs(b, "<string template content>", STRINGTEMPLATEEXPRESSIONSTART, STRINGTEMPLATETEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_TEMPLATE_CONTENT, "<string template content>");
    r = StringTemplateContent_0(b, l + 1);
    if (!r) r = consumeToken(b, STRINGTEMPLATETEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (StringTemplateExpressionStart Expression ExpressionEnd)+ StringTemplateText?
  private static boolean StringTemplateContent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateContent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringTemplateContent_0_0(b, l + 1);
    r = r && StringTemplateContent_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (StringTemplateExpressionStart Expression ExpressionEnd)+
  private static boolean StringTemplateContent_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateContent_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringTemplateContent_0_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!StringTemplateContent_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringTemplateContent_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // StringTemplateExpressionStart Expression ExpressionEnd
  private static boolean StringTemplateContent_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateContent_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRINGTEMPLATEEXPRESSIONSTART);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
  }

  // StringTemplateText?
  private static boolean StringTemplateContent_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateContent_0_1")) return false;
    consumeToken(b, STRINGTEMPLATETEXT);
    return true;
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
  // (public)? struct identifier StructBody
  public static boolean StructDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition")) return false;
    if (!nextTokenIs(b, "<struct definition>", PUBLIC, STRUCT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DEFINITION, "<struct definition>");
    r = StructDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, STRUCT, IDENTIFIER);
    p = r; // pin = 2
    r = r && StructBody(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean StructDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // table (LT NameReference GT)?
  public static boolean TableTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableTypeName")) return false;
    if (!nextTokenIs(b, TABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TABLE_TYPE_NAME, null);
    r = consumeToken(b, TABLE);
    p = r; // pin = 1
    r = r && TableTypeName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LT NameReference GT)?
  private static boolean TableTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableTypeName_1")) return false;
    TableTypeName_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean TableTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // throw Expression SEMICOLON
  public static boolean ThrowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowStatement")) return false;
    if (!nextTokenIs(b, THROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, THROW_STATEMENT, null);
    r = consumeToken(b, THROW);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // timeout LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_PARENTHESIS TypeName identifier RIGHT_PARENTHESIS LEFT_BRACE Block RIGHT_BRACE
  public static boolean TimeoutClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimeoutClause")) return false;
    if (!nextTokenIs(b, TIMEOUT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TIMEOUT_CLAUSE, null);
    r = consumeTokens(b, 1, TIMEOUT, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, TypeName(b, l + 1, -1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, IDENTIFIER, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // !(service | function | connector | struct | enum | annotation | transformer | const | boolean | int | float | string | blob | identifier)
  static boolean TopLevelDefinitionRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TopLevelDefinitionRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // service | function | connector | struct | enum | annotation | transformer | const | boolean | int | float | string | blob | identifier
  private static boolean TopLevelDefinitionRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SERVICE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, CONNECTOR);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, ANNOTATION);
    if (!r) r = consumeToken(b, TRANSFORMER);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BLOB);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // transaction (WITH TransactionPropertyInitStatementList)? LEFT_BRACE Block RIGHT_BRACE
  public static boolean TransactionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionClause")) return false;
    if (!nextTokenIs(b, TRANSACTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRANSACTION_CLAUSE, null);
    r = consumeToken(b, TRANSACTION);
    p = r; // pin = 1
    r = r && report_error_(b, TransactionClause_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
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
  // ExpressionList RARROW (identifier | fork) SEMICOLON
  public static boolean TriggerWorker(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TriggerWorker")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRIGGER_WORKER, "<trigger worker>");
    r = ExpressionList(b, l + 1);
    r = r && consumeToken(b, RARROW);
    p = r; // pin = 2
    r = r && report_error_(b, TriggerWorker_2(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // identifier | fork
  private static boolean TriggerWorker_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TriggerWorker_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, FORK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // try LEFT_BRACE Block RIGHT_BRACE CatchClauses
  public static boolean TryCatchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryCatchStatement")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRY_CATCH_STATEMENT, null);
    r = consumeTokens(b, 1, TRY, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_BRACE)) && r;
    r = p && CatchClauses(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // TypeName identifier (ASSIGN (Expression | ActionInvocation))? SEMICOLON
  public static boolean VariableDefinitionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION_STATEMENT, "<variable definition statement>");
    r = TypeName(b, l + 1, -1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, VariableDefinitionStatement_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ASSIGN (Expression | ActionInvocation))?
  private static boolean VariableDefinitionStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2")) return false;
    VariableDefinitionStatement_2_0(b, l + 1);
    return true;
  }

  // ASSIGN (Expression | ActionInvocation)
  private static boolean VariableDefinitionStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ASSIGN);
    p = r; // pin = 1
    r = r && VariableDefinitionStatement_2_0_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Expression | ActionInvocation
  private static boolean VariableDefinitionStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    if (!r) r = ActionInvocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference (COMMA VariableReference)*
  public static boolean VariableReferenceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1, -1);
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
    r = r && VariableReference(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_BRACE Block RIGHT_BRACE
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeTokens(b, 2, WHILE, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeTokens(b, -1, RIGHT_PARENTHESIS, LEFT_BRACE)) && r;
    r = p && report_error_(b, Block(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // worker identifier LEFT_BRACE Block RIGHT_BRACE
  public static boolean WorkerDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerDeclaration")) return false;
    if (!nextTokenIs(b, WORKER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WORKER_DECLARATION, null);
    r = consumeTokens(b, 1, WORKER, IDENTIFIER, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WORKER_REPLY, "<worker reply>");
    r = ExpressionList(b, l + 1);
    r = r && consumeTokens(b, 1, LARROW, IDENTIFIER, SEMICOLON);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AT (LEFT_BRACKET Expression RIGHT_BRACKET)?
  public static boolean XmlAttrib(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlAttrib")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, XML_ATTRIB, null);
    r = consumeToken(b, AT);
    p = r; // pin = 1
    r = r && XmlAttrib_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTE (XMLDoubleQuotedTemplateString Expression ExpressionEnd)* XMLDoubleQuotedString? DOUBLE_QUOTE_END
  public static boolean XmlDoubleQuotedString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlDoubleQuotedString")) return false;
    if (!nextTokenIs(b, DOUBLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTE);
    r = r && XmlDoubleQuotedString_1(b, l + 1);
    r = r && XmlDoubleQuotedString_2(b, l + 1);
    r = r && consumeToken(b, DOUBLE_QUOTE_END);
    exit_section_(b, m, XML_DOUBLE_QUOTED_STRING, r);
    return r;
  }

  // (XMLDoubleQuotedTemplateString Expression ExpressionEnd)*
  private static boolean XmlDoubleQuotedString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlDoubleQuotedString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XmlDoubleQuotedString_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XmlDoubleQuotedString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // XMLDoubleQuotedTemplateString Expression ExpressionEnd
  private static boolean XmlDoubleQuotedString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlDoubleQuotedString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XMLDOUBLEQUOTEDTEMPLATESTRING);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
  }

  // XMLDoubleQuotedString?
  private static boolean XmlDoubleQuotedString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlDoubleQuotedString_2")) return false;
    consumeToken(b, XMLDOUBLEQUOTEDSTRING);
    return true;
  }

  /* ********************************************************** */
  // Element | ProcIns | Comment | XmlText | CDATA
  public static boolean XmlItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XML_ITEM, "<xml item>");
    r = Element(b, l + 1);
    if (!r) r = ProcIns(b, l + 1);
    if (!r) r = Comment(b, l + 1);
    if (!r) r = XmlText(b, l + 1);
    if (!r) r = consumeToken(b, CDATA);
    exit_section_(b, l, m, r, false, null);
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
  // (XMLQName QNAME_SEPARATOR)? XMLQName | XMLTagExpressionStart Expression ExpressionEnd
  public static boolean XmlQualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName")) return false;
    if (!nextTokenIs(b, "<xml qualified name>", XMLQNAME, XMLTAGEXPRESSIONSTART)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XML_QUALIFIED_NAME, "<xml qualified name>");
    r = XmlQualifiedName_0(b, l + 1);
    if (!r) r = XmlQualifiedName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (XMLQName QNAME_SEPARATOR)? XMLQName
  private static boolean XmlQualifiedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XmlQualifiedName_0_0(b, l + 1);
    r = r && consumeToken(b, XMLQNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // (XMLQName QNAME_SEPARATOR)?
  private static boolean XmlQualifiedName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_0_0")) return false;
    XmlQualifiedName_0_0_0(b, l + 1);
    return true;
  }

  // XMLQName QNAME_SEPARATOR
  private static boolean XmlQualifiedName_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XMLQNAME, QNAME_SEPARATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // XMLTagExpressionStart Expression ExpressionEnd
  private static boolean XmlQualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XMLTAGEXPRESSIONSTART);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XmlSingleQuotedString | XmlDoubleQuotedString
  public static boolean XmlQuotedString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQuotedString")) return false;
    if (!nextTokenIs(b, "<xml quoted string>", DOUBLE_QUOTE, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XML_QUOTED_STRING, "<xml quoted string>");
    r = XmlSingleQuotedString(b, l + 1);
    if (!r) r = XmlDoubleQuotedString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SINGLE_QUOTE (XMLSingleQuotedTemplateString Expression ExpressionEnd)* XMLSingleQuotedString? SINGLE_QUOTE_END
  public static boolean XmlSingleQuotedString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlSingleQuotedString")) return false;
    if (!nextTokenIs(b, SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTE);
    r = r && XmlSingleQuotedString_1(b, l + 1);
    r = r && XmlSingleQuotedString_2(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE_END);
    exit_section_(b, m, XML_SINGLE_QUOTED_STRING, r);
    return r;
  }

  // (XMLSingleQuotedTemplateString Expression ExpressionEnd)*
  private static boolean XmlSingleQuotedString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlSingleQuotedString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XmlSingleQuotedString_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XmlSingleQuotedString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // XMLSingleQuotedTemplateString Expression ExpressionEnd
  private static boolean XmlSingleQuotedString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlSingleQuotedString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XMLSINGLEQUOTEDTEMPLATESTRING);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
  }

  // XMLSingleQuotedString?
  private static boolean XmlSingleQuotedString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlSingleQuotedString_2")) return false;
    consumeToken(b, XMLSINGLEQUOTEDSTRING);
    return true;
  }

  /* ********************************************************** */
  // (XMLTemplateText Expression ExpressionEnd)+ XMLText? | XMLText
  public static boolean XmlText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText")) return false;
    if (!nextTokenIs(b, "<xml text>", XMLTEMPLATETEXT, XMLTEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XML_TEXT, "<xml text>");
    r = XmlText_0(b, l + 1);
    if (!r) r = consumeToken(b, XMLTEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (XMLTemplateText Expression ExpressionEnd)+ XMLText?
  private static boolean XmlText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XmlText_0_0(b, l + 1);
    r = r && XmlText_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (XMLTemplateText Expression ExpressionEnd)+
  private static boolean XmlText_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XmlText_0_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!XmlText_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XmlText_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // XMLTemplateText Expression ExpressionEnd
  private static boolean XmlText_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XMLTEMPLATETEXT);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSIONEND);
    exit_section_(b, m, null, r);
    return r;
  }

  // XMLText?
  private static boolean XmlText_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0_1")) return false;
    consumeToken(b, XMLTEXT);
    return true;
  }

  /* ********************************************************** */
  // xml (LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT)?
  public static boolean XmlTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlTypeName")) return false;
    if (!nextTokenIs(b, XML)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, XML_TYPE_NAME, null);
    r = consumeToken(b, XML);
    p = r; // pin = 1
    r = r && XmlTypeName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT)?
  private static boolean XmlTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlTypeName_1")) return false;
    XmlTypeName_1_0(b, l + 1);
    return true;
  }

  // LT (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)? XmlLocalName GT
  private static boolean XmlTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && XmlTypeName_1_0_1(b, l + 1);
    r = r && XmlLocalName(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACE XmlNamespaceName RIGHT_BRACE)?
  private static boolean XmlTypeName_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlTypeName_1_0_1")) return false;
    XmlTypeName_1_0_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACE XmlNamespaceName RIGHT_BRACE
  private static boolean XmlTypeName_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlTypeName_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && XmlNamespaceName(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
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
  // DeprecatedTemplateStart deprecatedText? DeprecatedTemplateEnd
  public static boolean deprecatedAttachment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedAttachment")) return false;
    if (!nextTokenIs(b, DEPRECATEDTEMPLATESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATEDTEMPLATESTART);
    r = r && deprecatedAttachment_1(b, l + 1);
    r = r && consumeToken(b, DEPRECATEDTEMPLATEEND);
    exit_section_(b, m, DEPRECATED_ATTACHMENT, r);
    return r;
  }

  // deprecatedText?
  private static boolean deprecatedAttachment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedAttachment_1")) return false;
    deprecatedText(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // singleBackTickDeprecatedInlineCode | doubleBackTickDeprecatedInlineCode | tripleBackTickDeprecatedInlineCode
  public static boolean deprecatedTemplateInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedTemplateInlineCode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEPRECATED_TEMPLATE_INLINE_CODE, "<deprecated template inline code>");
    r = singleBackTickDeprecatedInlineCode(b, l + 1);
    if (!r) r = doubleBackTickDeprecatedInlineCode(b, l + 1);
    if (!r) r = tripleBackTickDeprecatedInlineCode(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // deprecatedTemplateInlineCode (DeprecatedTemplateText | deprecatedTemplateInlineCode)*
  //                    | DeprecatedTemplateText (DeprecatedTemplateText | deprecatedTemplateInlineCode)*
  public static boolean deprecatedText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEPRECATED_TEXT, "<deprecated text>");
    r = deprecatedText_0(b, l + 1);
    if (!r) r = deprecatedText_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // deprecatedTemplateInlineCode (DeprecatedTemplateText | deprecatedTemplateInlineCode)*
  private static boolean deprecatedText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deprecatedTemplateInlineCode(b, l + 1);
    r = r && deprecatedText_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DeprecatedTemplateText | deprecatedTemplateInlineCode)*
  private static boolean deprecatedText_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!deprecatedText_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deprecatedText_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DeprecatedTemplateText | deprecatedTemplateInlineCode
  private static boolean deprecatedText_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATEDTEMPLATETEXT);
    if (!r) r = deprecatedTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DeprecatedTemplateText (DeprecatedTemplateText | deprecatedTemplateInlineCode)*
  private static boolean deprecatedText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATEDTEMPLATETEXT);
    r = r && deprecatedText_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DeprecatedTemplateText | deprecatedTemplateInlineCode)*
  private static boolean deprecatedText_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!deprecatedText_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deprecatedText_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DeprecatedTemplateText | deprecatedTemplateInlineCode
  private static boolean deprecatedText_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATEDTEMPLATETEXT);
    if (!r) r = deprecatedTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // documentationTemplateInlineCode (DocumentationTemplateText | documentationTemplateInlineCode)*
  //             | DocumentationTemplateText  (DocumentationTemplateText | documentationTemplateInlineCode)*
  public static boolean docText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOC_TEXT, "<doc text>");
    r = docText_0(b, l + 1);
    if (!r) r = docText_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // documentationTemplateInlineCode (DocumentationTemplateText | documentationTemplateInlineCode)*
  private static boolean docText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = documentationTemplateInlineCode(b, l + 1);
    r = r && docText_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DocumentationTemplateText | documentationTemplateInlineCode)*
  private static boolean docText_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!docText_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docText_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DocumentationTemplateText | documentationTemplateInlineCode
  private static boolean docText_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATIONTEMPLATETEXT);
    if (!r) r = documentationTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DocumentationTemplateText  (DocumentationTemplateText | documentationTemplateInlineCode)*
  private static boolean docText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATIONTEMPLATETEXT);
    r = r && docText_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DocumentationTemplateText | documentationTemplateInlineCode)*
  private static boolean docText_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!docText_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docText_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DocumentationTemplateText | documentationTemplateInlineCode
  private static boolean docText_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATIONTEMPLATETEXT);
    if (!r) r = documentationTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DocumentationTemplateStart documentationTemplateContent? DocumentationTemplateEnd
  public static boolean documentationAttachment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationAttachment")) return false;
    if (!nextTokenIs(b, DOCUMENTATIONTEMPLATESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATIONTEMPLATESTART);
    r = r && documentationAttachment_1(b, l + 1);
    r = r && consumeToken(b, DOCUMENTATIONTEMPLATEEND);
    exit_section_(b, m, DOCUMENTATION_ATTACHMENT, r);
    return r;
  }

  // documentationTemplateContent?
  private static boolean documentationAttachment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationAttachment_1")) return false;
    documentationTemplateContent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DocumentationTemplateAttributeStart Identifier DocumentationTemplateAttributeEnd docText?
  public static boolean documentationTemplateAttributeDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateAttributeDescription")) return false;
    if (!nextTokenIs(b, DOCUMENTATIONTEMPLATEATTRIBUTESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCUMENTATIONTEMPLATEATTRIBUTESTART, IDENTIFIER, DOCUMENTATIONTEMPLATEATTRIBUTEEND);
    r = r && documentationTemplateAttributeDescription_3(b, l + 1);
    exit_section_(b, m, DOCUMENTATION_TEMPLATE_ATTRIBUTE_DESCRIPTION, r);
    return r;
  }

  // docText?
  private static boolean documentationTemplateAttributeDescription_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateAttributeDescription_3")) return false;
    docText(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // docText? documentationTemplateAttributeDescription+ | docText
  public static boolean documentationTemplateContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateContent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOCUMENTATION_TEMPLATE_CONTENT, "<documentation template content>");
    r = documentationTemplateContent_0(b, l + 1);
    if (!r) r = docText(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docText? documentationTemplateAttributeDescription+
  private static boolean documentationTemplateContent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateContent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = documentationTemplateContent_0_0(b, l + 1);
    r = r && documentationTemplateContent_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // docText?
  private static boolean documentationTemplateContent_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateContent_0_0")) return false;
    docText(b, l + 1);
    return true;
  }

  // documentationTemplateAttributeDescription+
  private static boolean documentationTemplateContent_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateContent_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = documentationTemplateAttributeDescription(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!documentationTemplateAttributeDescription(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "documentationTemplateContent_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // singleBackTickDocInlineCode | doubleBackTickDocInlineCode | tripleBackTickDocInlineCode
  public static boolean documentationTemplateInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateInlineCode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOCUMENTATION_TEMPLATE_INLINE_CODE, "<documentation template inline code>");
    r = singleBackTickDocInlineCode(b, l + 1);
    if (!r) r = doubleBackTickDocInlineCode(b, l + 1);
    if (!r) r = tripleBackTickDocInlineCode(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DBDeprecatedInlineCodeStart DoubleBackTickInlineCode? DoubleBackTickInlineCodeEnd
  public static boolean doubleBackTickDeprecatedInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDeprecatedInlineCode")) return false;
    if (!nextTokenIs(b, DBDEPRECATEDINLINECODESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DBDEPRECATEDINLINECODESTART);
    r = r && doubleBackTickDeprecatedInlineCode_1(b, l + 1);
    r = r && consumeToken(b, DOUBLEBACKTICKINLINECODEEND);
    exit_section_(b, m, DOUBLE_BACK_TICK_DEPRECATED_INLINE_CODE, r);
    return r;
  }

  // DoubleBackTickInlineCode?
  private static boolean doubleBackTickDeprecatedInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDeprecatedInlineCode_1")) return false;
    consumeToken(b, DOUBLEBACKTICKINLINECODE);
    return true;
  }

  /* ********************************************************** */
  // DBDocInlineCodeStart DoubleBackTickInlineCode? DoubleBackTickInlineCodeEnd
  public static boolean doubleBackTickDocInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDocInlineCode")) return false;
    if (!nextTokenIs(b, DBDOCINLINECODESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DBDOCINLINECODESTART);
    r = r && doubleBackTickDocInlineCode_1(b, l + 1);
    r = r && consumeToken(b, DOUBLEBACKTICKINLINECODEEND);
    exit_section_(b, m, DOUBLE_BACK_TICK_DOC_INLINE_CODE, r);
    return r;
  }

  // DoubleBackTickInlineCode?
  private static boolean doubleBackTickDocInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDocInlineCode_1")) return false;
    consumeToken(b, DOUBLEBACKTICKINLINECODE);
    return true;
  }

  /* ********************************************************** */
  // (public)? enum identifier LEFT_BRACE Enumerator (COMMA Enumerator)* RIGHT_BRACE
  public static boolean enumDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDefinition")) return false;
    if (!nextTokenIs(b, "<enum definition>", ENUM, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DEFINITION, "<enum definition>");
    r = enumDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, ENUM, IDENTIFIER, LEFT_BRACE);
    p = r; // pin = 2
    r = r && report_error_(b, Enumerator(b, l + 1));
    r = p && report_error_(b, enumDefinition_5(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // identifier
  public static boolean orgName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orgName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ORG_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttachment* TypeName
  public static boolean parameterTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_TYPE_NAME, "<parameter type name>");
    r = parameterTypeName_0(b, l + 1);
    r = r && TypeName(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AnnotationAttachment*
  private static boolean parameterTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterTypeName_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterTypeName_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // parameterTypeName (COMMA parameterTypeName)*
  public static boolean parameterTypeNameList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterTypeNameList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_TYPE_NAME_LIST, "<parameter type name list>");
    r = parameterTypeName(b, l + 1);
    p = r; // pin = 1
    r = r && parameterTypeNameList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA parameterTypeName)*
  private static boolean parameterTypeNameList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterTypeNameList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parameterTypeNameList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterTypeNameList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA parameterTypeName
  private static boolean parameterTypeNameList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterTypeNameList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameterTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SBDeprecatedInlineCodeStart SingleBackTickInlineCode? SingleBackTickInlineCodeEnd
  public static boolean singleBackTickDeprecatedInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDeprecatedInlineCode")) return false;
    if (!nextTokenIs(b, SBDEPRECATEDINLINECODESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SBDEPRECATEDINLINECODESTART);
    r = r && singleBackTickDeprecatedInlineCode_1(b, l + 1);
    r = r && consumeToken(b, SINGLEBACKTICKINLINECODEEND);
    exit_section_(b, m, SINGLE_BACK_TICK_DEPRECATED_INLINE_CODE, r);
    return r;
  }

  // SingleBackTickInlineCode?
  private static boolean singleBackTickDeprecatedInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDeprecatedInlineCode_1")) return false;
    consumeToken(b, SINGLEBACKTICKINLINECODE);
    return true;
  }

  /* ********************************************************** */
  // SBDocInlineCodeStart SingleBackTickInlineCode? SingleBackTickInlineCodeEnd
  public static boolean singleBackTickDocInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDocInlineCode")) return false;
    if (!nextTokenIs(b, SBDOCINLINECODESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SBDOCINLINECODESTART);
    r = r && singleBackTickDocInlineCode_1(b, l + 1);
    r = r && consumeToken(b, SINGLEBACKTICKINLINECODEEND);
    exit_section_(b, m, SINGLE_BACK_TICK_DOC_INLINE_CODE, r);
    return r;
  }

  // SingleBackTickInlineCode?
  private static boolean singleBackTickDocInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDocInlineCode_1")) return false;
    consumeToken(b, SINGLEBACKTICKINLINECODE);
    return true;
  }

  /* ********************************************************** */
  // TBDeprecatedInlineCodeStart TripleBackTickInlineCode? TripleBackTickInlineCodeEnd
  public static boolean tripleBackTickDeprecatedInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDeprecatedInlineCode")) return false;
    if (!nextTokenIs(b, TBDEPRECATEDINLINECODESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBDEPRECATEDINLINECODESTART);
    r = r && tripleBackTickDeprecatedInlineCode_1(b, l + 1);
    r = r && consumeToken(b, TRIPLEBACKTICKINLINECODEEND);
    exit_section_(b, m, TRIPLE_BACK_TICK_DEPRECATED_INLINE_CODE, r);
    return r;
  }

  // TripleBackTickInlineCode?
  private static boolean tripleBackTickDeprecatedInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDeprecatedInlineCode_1")) return false;
    consumeToken(b, TRIPLEBACKTICKINLINECODE);
    return true;
  }

  /* ********************************************************** */
  // TBDocInlineCodeStart TripleBackTickInlineCode? TripleBackTickInlineCodeEnd
  public static boolean tripleBackTickDocInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDocInlineCode")) return false;
    if (!nextTokenIs(b, TBDOCINLINECODESTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBDOCINLINECODESTART);
    r = r && tripleBackTickDocInlineCode_1(b, l + 1);
    r = r && consumeToken(b, TRIPLEBACKTICKINLINECODEEND);
    exit_section_(b, m, TRIPLE_BACK_TICK_DOC_INLINE_CODE, r);
    return r;
  }

  // TripleBackTickInlineCode?
  private static boolean tripleBackTickDocInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDocInlineCode_1")) return false;
    consumeToken(b, TRIPLEBACKTICKINLINECODE);
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: ATOM(SimpleLiteral)
  // 1: ATOM(ArrayLiteral)
  // 2: ATOM(RecordLiteral)
  // 3: ATOM(XmlLiteral)
  // 4: ATOM(StringTemplateLiteral)
  // 5: ATOM(ValueTypeTypeExpression)
  // 6: ATOM(BuiltInReferenceTypeTypeExpression)
  // 7: ATOM(VariableReferenceExpression)
  // 8: ATOM(LambdaFunctionExpression)
  // 9: ATOM(TypeInitExpression)
  // 10: PREFIX(TypeCastingExpression)
  // 11: PREFIX(TypeConversionExpression)
  // 12: ATOM(TypeAccessExpression)
  // 13: PREFIX(UnaryExpression)
  // 14: PREFIX(BracedExpression)
  // 15: BINARY(BinaryPowExpression)
  // 16: BINARY(BinaryDivMulModExpression)
  // 17: BINARY(BinaryAddSubExpression)
  // 18: BINARY(BinaryCompareExpression)
  // 19: BINARY(BinaryEqualExpression)
  // 20: BINARY(BinaryAndExpression)
  // 21: BINARY(BinaryOrExpression)
  // 22: BINARY(TernaryExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = SimpleLiteral(b, l + 1);
    if (!r) r = ArrayLiteral(b, l + 1);
    if (!r) r = RecordLiteral(b, l + 1);
    if (!r) r = XmlLiteral(b, l + 1);
    if (!r) r = StringTemplateLiteral(b, l + 1);
    if (!r) r = ValueTypeTypeExpression(b, l + 1);
    if (!r) r = BuiltInReferenceTypeTypeExpression(b, l + 1);
    if (!r) r = VariableReferenceExpression(b, l + 1);
    if (!r) r = LambdaFunctionExpression(b, l + 1);
    if (!r) r = TypeInitExpression(b, l + 1);
    if (!r) r = TypeCastingExpression(b, l + 1);
    if (!r) r = TypeConversionExpression(b, l + 1);
    if (!r) r = TypeAccessExpression(b, l + 1);
    if (!r) r = UnaryExpression(b, l + 1);
    if (!r) r = BracedExpression(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 15 && consumeTokenSmart(b, POW)) {
        r = Expression(b, l, 15);
        exit_section_(b, l, m, BINARY_POW_EXPRESSION, r, true, null);
      }
      else if (g < 16 && BinaryDivMulModExpression_0(b, l + 1)) {
        r = Expression(b, l, 16);
        exit_section_(b, l, m, BINARY_DIV_MUL_MOD_EXPRESSION, r, true, null);
      }
      else if (g < 17 && BinaryAddSubExpression_0(b, l + 1)) {
        r = Expression(b, l, 17);
        exit_section_(b, l, m, BINARY_ADD_SUB_EXPRESSION, r, true, null);
      }
      else if (g < 18 && BinaryCompareExpression_0(b, l + 1)) {
        r = Expression(b, l, 18);
        exit_section_(b, l, m, BINARY_COMPARE_EXPRESSION, r, true, null);
      }
      else if (g < 19 && BinaryEqualExpression_0(b, l + 1)) {
        r = Expression(b, l, 19);
        exit_section_(b, l, m, BINARY_EQUAL_EXPRESSION, r, true, null);
      }
      else if (g < 20 && consumeTokenSmart(b, AND)) {
        r = Expression(b, l, 20);
        exit_section_(b, l, m, BINARY_AND_EXPRESSION, r, true, null);
      }
      else if (g < 21 && consumeTokenSmart(b, OR)) {
        r = Expression(b, l, 21);
        exit_section_(b, l, m, BINARY_OR_EXPRESSION, r, true, null);
      }
      else if (g < 22 && consumeTokenSmart(b, QUESTION_MARK)) {
        r = report_error_(b, Expression(b, l, 22));
        r = TernaryExpression_1(b, l + 1) && r;
        exit_section_(b, l, m, TERNARY_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // (ADD|SUB)? integerLiteral /*| (ADD|SUB)? floatingPointLiteral*/ | quotedStringLiteral
  public static boolean SimpleLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_LITERAL, "<simple literal>");
    r = SimpleLiteral_0(b, l + 1);
    if (!r) r = consumeTokenSmart(b, QUOTEDSTRINGLITERAL);
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
    r = consumeTokenSmart(b, ADD);
    if (!r) r = consumeTokenSmart(b, SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET ExpressionList? RIGHT_BRACKET
  public static boolean ArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_BRACKET);
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

  // LEFT_BRACE (RecordKeyValue (COMMA RecordKeyValue)*)? RIGHT_BRACE
  public static boolean RecordLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_BRACE);
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
    r = consumeTokenSmart(b, COMMA);
    r = r && RecordKeyValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // XMLLiteralStart XmlItem XMLLiteralEnd
  public static boolean XmlLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlLiteral")) return false;
    if (!nextTokenIsSmart(b, XMLLITERALSTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, XMLLITERALSTART);
    r = r && XmlItem(b, l + 1);
    r = r && consumeToken(b, XMLLITERALEND);
    exit_section_(b, m, XML_LITERAL, r);
    return r;
  }

  // StringTemplateLiteralStart StringTemplateContent? StringTemplateLiteralEnd
  public static boolean StringTemplateLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateLiteral")) return false;
    if (!nextTokenIsSmart(b, STRINGTEMPLATELITERALSTART)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, STRINGTEMPLATELITERALSTART);
    r = r && StringTemplateLiteral_1(b, l + 1);
    r = r && consumeToken(b, STRINGTEMPLATELITERALEND);
    exit_section_(b, m, STRING_TEMPLATE_LITERAL, r);
    return r;
  }

  // StringTemplateContent?
  private static boolean StringTemplateLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateLiteral_1")) return false;
    StringTemplateContent(b, l + 1);
    return true;
  }

  // ValueTypeName DOT identifier
  public static boolean ValueTypeTypeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueTypeTypeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPE_TYPE_EXPRESSION, "<value type type expression>");
    r = ValueTypeName(b, l + 1);
    r = r && consumeTokensSmart(b, 0, DOT, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BuiltInReferenceTypeName DOT identifier
  public static boolean BuiltInReferenceTypeTypeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeTypeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION, "<built in reference type type expression>");
    r = BuiltInReferenceTypeName(b, l + 1);
    r = r && consumeTokensSmart(b, 0, DOT, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VariableReference
  public static boolean VariableReferenceExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceExpression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1, -1);
    exit_section_(b, m, VARIABLE_REFERENCE_EXPRESSION, r);
    return r;
  }

  // LambdaFunction
  public static boolean LambdaFunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunctionExpression")) return false;
    if (!nextTokenIsSmart(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaFunction(b, l + 1);
    exit_section_(b, m, LAMBDA_FUNCTION_EXPRESSION, r);
    return r;
  }

  // new UserDefineTypeName LEFT_PARENTHESIS ExpressionList? RIGHT_PARENTHESIS
  public static boolean TypeInitExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpression")) return false;
    if (!nextTokenIsSmart(b, NEW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_INIT_EXPRESSION, null);
    r = consumeTokenSmart(b, NEW);
    p = r; // pin = 1
    r = r && report_error_(b, UserDefineTypeName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, TypeInitExpression_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionList?
  private static boolean TypeInitExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpression_3")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  public static boolean TypeCastingExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCastingExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = TypeCastingExpression_0(b, l + 1);
    p = r;
    r = p && Expression(b, l, 10);
    exit_section_(b, l, m, TYPE_CASTING_EXPRESSION, r, p, null);
    return r || p;
  }

  // LEFT_PARENTHESIS TypeName RIGHT_PARENTHESIS
  private static boolean TypeCastingExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCastingExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean TypeConversionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression")) return false;
    if (!nextTokenIsSmart(b, LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = TypeConversionExpression_0(b, l + 1);
    p = r;
    r = p && Expression(b, l, 11);
    exit_section_(b, l, m, TYPE_CONVERSION_EXPRESSION, r, p, null);
    return r || p;
  }

  // LT TypeName (COMMA FunctionInvocation)? GT
  private static boolean TypeConversionExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LT);
    r = r && TypeName(b, l + 1, -1);
    r = r && TypeConversionExpression_0_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA FunctionInvocation)?
  private static boolean TypeConversionExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression_0_2")) return false;
    TypeConversionExpression_0_2_0(b, l + 1);
    return true;
  }

  // COMMA FunctionInvocation
  private static boolean TypeConversionExpression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && FunctionInvocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeof BuiltInTypeName
  public static boolean TypeAccessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAccessExpression")) return false;
    if (!nextTokenIsSmart(b, TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TYPEOF);
    r = r && BuiltInTypeName(b, l + 1);
    exit_section_(b, m, TYPE_ACCESS_EXPRESSION, r);
    return r;
  }

  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = UnaryExpression_0(b, l + 1);
    p = r;
    r = p && Expression(b, l, 13);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, p, null);
    return r || p;
  }

  // ADD | SUB | NOT | lengthof | typeof
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ADD);
    if (!r) r = consumeTokenSmart(b, SUB);
    if (!r) r = consumeTokenSmart(b, NOT);
    if (!r) r = consumeTokenSmart(b, LENGTHOF);
    if (!r) r = consumeTokenSmart(b, TYPEOF);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean BracedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BracedExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    p = r;
    r = p && Expression(b, l, 14);
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    exit_section_(b, l, m, BRACED_EXPRESSION, r, p, null);
    return r || p;
  }

  // DIV | MUL | MOD
  private static boolean BinaryDivMulModExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryDivMulModExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DIV);
    if (!r) r = consumeTokenSmart(b, MUL);
    if (!r) r = consumeTokenSmart(b, MOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // ADD | SUB
  private static boolean BinaryAddSubExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryAddSubExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ADD);
    if (!r) r = consumeTokenSmart(b, SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  // LT_EQUAL | GT_EQUAL | GT | LT
  private static boolean BinaryCompareExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryCompareExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LT_EQUAL);
    if (!r) r = consumeTokenSmart(b, GT_EQUAL);
    if (!r) r = consumeTokenSmart(b, GT);
    if (!r) r = consumeTokenSmart(b, LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL | NOT_EQUAL
  private static boolean BinaryEqualExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryEqualExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EQUAL);
    if (!r) r = consumeTokenSmart(b, NOT_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON Expression
  private static boolean TernaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: TypeName
  // Operator priority table:
  // 0: ATOM(AnyTypeName)
  // 1: ATOM(TypeTypeName)
  // 2: ATOM(ValueTypeName)
  // 3: ATOM(ReferenceTypeName)
  // 4: POSTFIX(arrayTypeName)
  public static boolean TypeName(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    addVariant(b, "<type name>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type name>");
    r = AnyTypeName(b, l + 1);
    if (!r) r = TypeTypeName(b, l + 1);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = ReferenceTypeName(b, l + 1);
    p = r;
    r = r && TypeName_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean TypeName_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 4 && arrayTypeName_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARRAY_TYPE_NAME, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // any
  public static boolean AnyTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyTypeName")) return false;
    if (!nextTokenIsSmart(b, ANY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ANY);
    exit_section_(b, m, ANY_TYPE_NAME, r);
    return r;
  }

  // type
  public static boolean TypeTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeTypeName")) return false;
    if (!nextTokenIsSmart(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TYPE);
    exit_section_(b, m, TYPE_TYPE_NAME, r);
    return r;
  }

  // boolean | int | float | string | blob
  public static boolean ValueTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPE_NAME, "<value type name>");
    r = consumeTokenSmart(b, BOOLEAN);
    if (!r) r = consumeTokenSmart(b, INT);
    if (!r) r = consumeTokenSmart(b, FLOAT);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, BLOB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

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

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean arrayTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayTypeName_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!arrayTypeName_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayTypeName_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean arrayTypeName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayTypeName_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: VariableReference
  // Operator priority table:
  // 0: POSTFIX(InvocationReference)
  // 1: POSTFIX(MapArrayVariableReference)
  // 2: POSTFIX(FieldVariableReference)
  // 3: POSTFIX(XmlAttribVariableReference)
  // 4: ATOM(FunctionInvocationReference)
  // 5: ATOM(SimpleVariableReference)
  public static boolean VariableReference(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "VariableReference")) return false;
    addVariant(b, "<variable reference>");
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<variable reference>");
    r = FunctionInvocationReference(b, l + 1);
    if (!r) r = SimpleVariableReference(b, l + 1);
    p = r;
    r = r && VariableReference_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean VariableReference_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "VariableReference_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && Invocation(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INVOCATION_REFERENCE, r, true, null);
      }
      else if (g < 1 && Index(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MAP_ARRAY_VARIABLE_REFERENCE, r, true, null);
      }
      else if (g < 2 && Field(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FIELD_VARIABLE_REFERENCE, r, true, null);
      }
      else if (g < 3 && XmlAttrib(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, XML_ATTRIB_VARIABLE_REFERENCE, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // FunctionInvocation
  public static boolean FunctionInvocationReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocationReference")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionInvocation(b, l + 1);
    exit_section_(b, m, FUNCTION_INVOCATION_REFERENCE, r);
    return r;
  }

  // NameReference
  public static boolean SimpleVariableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleVariableReference")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameReference(b, l + 1);
    exit_section_(b, m, SIMPLE_VARIABLE_REFERENCE, r);
    return r;
  }

  final static Parser StatementRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return StatementRecover(b, l + 1);
    }
  };
  final static Parser TopLevelDefinitionRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TopLevelDefinitionRecover(b, l + 1);
    }
  };
}
