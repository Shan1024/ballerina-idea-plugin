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
import static org.ballerinalang.plugins.idea.parser.BallerinaParserUtil.*;
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
    else if (t == ANY_TYPE_NAME) {
      r = AnyTypeName(b, 0);
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
    else if (t == ATTRIBUTE) {
      r = Attribute(b, 0);
    }
    else if (t == BLOCK) {
      r = Block(b, 0);
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
    else if (t == COMPOUND_ASSIGNMENT_STATEMENT) {
      r = CompoundAssignmentStatement(b, 0);
    }
    else if (t == COMPOUND_OPERATOR) {
      r = CompoundOperator(b, 0);
    }
    else if (t == CONSTANT_DEFINITION) {
      r = ConstantDefinition(b, 0);
    }
    else if (t == CONTENT) {
      r = Content(b, 0);
    }
    else if (t == DEFAULTABLE_PARAMETER) {
      r = DefaultableParameter(b, 0);
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
    else if (t == ENDPOINT_DEFINITION) {
      r = EndpointDefinition(b, 0);
    }
    else if (t == ENDPOINT_INITLIZATION) {
      r = EndpointInitlization(b, 0);
    }
    else if (t == ENDPOINT_TYPE) {
      r = EndpointType(b, 0);
    }
    else if (t == ENUM_DEFINITION) {
      r = EnumDefinition(b, 0);
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
    else if (t == FORMAL_PARAMETER_LIST) {
      r = FormalParameterList(b, 0);
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
    else if (t == FUTURE_TYPE_NAME) {
      r = FutureTypeName(b, 0);
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
    else if (t == INTEGER_LITERAL) {
      r = IntegerLiteral(b, 0);
    }
    else if (t == INVOCATION) {
      r = Invocation(b, 0);
    }
    else if (t == INVOCATION_ARG) {
      r = InvocationArg(b, 0);
    }
    else if (t == INVOCATION_ARG_LIST) {
      r = InvocationArgList(b, 0);
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
    else if (t == NAMED_ARGS) {
      r = NamedArgs(b, 0);
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
    else if (t == OBJECT_BODY) {
      r = ObjectBody(b, 0);
    }
    else if (t == OBJECT_CALLABLE_UNIT_SIGNATURE) {
      r = ObjectCallableUnitSignature(b, 0);
    }
    else if (t == OBJECT_DEFAULTABLE_PARAMETER) {
      r = ObjectDefaultableParameter(b, 0);
    }
    else if (t == OBJECT_FIELD_DEFINITION) {
      r = ObjectFieldDefinition(b, 0);
    }
    else if (t == OBJECT_FUNCTION_DEFINITION) {
      r = ObjectFunctionDefinition(b, 0);
    }
    else if (t == OBJECT_FUNCTIONS) {
      r = ObjectFunctions(b, 0);
    }
    else if (t == OBJECT_INITIALIZER) {
      r = ObjectInitializer(b, 0);
    }
    else if (t == OBJECT_INITIALIZER_PARAMETER_LIST) {
      r = ObjectInitializerParameterList(b, 0);
    }
    else if (t == OBJECT_PARAMETER) {
      r = ObjectParameter(b, 0);
    }
    else if (t == OBJECT_PARAMETER_LIST) {
      r = ObjectParameterList(b, 0);
    }
    else if (t == ONABORT_STATEMENT) {
      r = OnabortStatement(b, 0);
    }
    else if (t == ONCOMMIT_STATEMENT) {
      r = OncommitStatement(b, 0);
    }
    else if (t == ONRETRY_CLAUSE) {
      r = OnretryClause(b, 0);
    }
    else if (t == ORG_NAME) {
      r = OrgName(b, 0);
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
    else if (t == PARAMETER_TYPE_NAME_LIST) {
      r = ParameterTypeNameList(b, 0);
    }
    else if (t == POST_ARITHMETIC_OPERATOR) {
      r = PostArithmeticOperator(b, 0);
    }
    else if (t == POST_INCREMENT_STATEMENT) {
      r = PostIncrementStatement(b, 0);
    }
    else if (t == PRIVATE_OBJECT_FIELDS) {
      r = PrivateObjectFields(b, 0);
    }
    else if (t == PRIVATE_STRUCT_BODY) {
      r = PrivateStructBody(b, 0);
    }
    else if (t == PROC_INS) {
      r = ProcIns(b, 0);
    }
    else if (t == PUBLIC_OBJECT_FIELDS) {
      r = PublicObjectFields(b, 0);
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
    else if (t == RESERVED_WORD) {
      r = ReservedWord(b, 0);
    }
    else if (t == RESOURCE_DEFINITION) {
      r = ResourceDefinition(b, 0);
    }
    else if (t == REST_ARGS) {
      r = RestArgs(b, 0);
    }
    else if (t == REST_PARAMETER) {
      r = RestParameter(b, 0);
    }
    else if (t == RETRIES_STATEMENT) {
      r = RetriesStatement(b, 0);
    }
    else if (t == RETURN_PARAMETER) {
      r = ReturnParameter(b, 0);
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
    else if (t == SERVICE_ENDPOINT_ATTACHMENTS) {
      r = ServiceEndpointAttachments(b, 0);
    }
    else if (t == SIMPLE_LITERAL) {
      r = SimpleLiteral(b, 0);
    }
    else if (t == START_TAG) {
      r = StartTag(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STREAM_TYPE_NAME) {
      r = StreamTypeName(b, 0);
    }
    else if (t == STRING_TEMPLATE_CONTENT) {
      r = StringTemplateContent(b, 0);
    }
    else if (t == STRING_TEMPLATE_LITERAL) {
      r = StringTemplateLiteral(b, 0);
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
    else if (t == TYPE_DEFINITION) {
      r = TypeDefinition(b, 0);
    }
    else if (t == TYPE_DESC_TYPE_NAME) {
      r = TypeDescTypeName(b, 0);
    }
    else if (t == TYPE_INIT_EXPR) {
      r = TypeInitExpr(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = TypeName(b, 0, -1);
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
    else if (t == VARIABLE_DEFINITION_STATEMENT_IN_SERVICE) {
      r = VariableDefinitionStatementInService(b, 0);
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
    else if (t == XML_DOUBLE_QUOTED_STRING) {
      r = XmlDoubleQuotedString(b, 0);
    }
    else if (t == XML_ITEM) {
      r = XmlItem(b, 0);
    }
    else if (t == XML_LITERAL) {
      r = XmlLiteral(b, 0);
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
    else if (t == ENDPOINT_PARAMETER) {
      r = endpointParameter(b, 0);
    }
    else if (t == FAIL_STATEMENT) {
      r = failStatement(b, 0);
    }
    else if (t == MATCH_PATTERN_CLAUSE) {
      r = matchPatternClause(b, 0);
    }
    else if (t == MATCH_STATEMENT) {
      r = matchStatement(b, 0);
    }
    else if (t == PARAMETER_TYPE_NAME) {
      r = parameterTypeName(b, 0);
    }
    else if (t == RESOURCE_PARAMETER_LIST) {
      r = resourceParameterList(b, 0);
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
    else if (t == TUPLE_DESTRUCTURING_STATEMENT) {
      r = tupleDestructuringStatement(b, 0);
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
    create_token_set_(AWAIT_EXPRESSION_REFERENCE, FIELD_VARIABLE_REFERENCE, FUNCTION_INVOCATION_REFERENCE, INVOCATION_REFERENCE,
      MAP_ARRAY_VARIABLE_REFERENCE, SIMPLE_VARIABLE_REFERENCE, VARIABLE_REFERENCE, XML_ATTRIB_VARIABLE_REFERENCE),
    create_token_set_(ANNOTATED_TYPE_NAME, ARRAY_TYPE_NAME, GROUP_TYPE_NAME, NULLABLE_TYPE_NAME,
      OBJECT_TYPE_NAME, SIMPLE_TYPE_NAME, TUPLE_TYPE_NAME, TYPE_NAME,
      UNION_TYPE_NAME),
    create_token_set_(ARRAY_LITERAL_EXPRESSION, AWAIT_EXPRESSION, BINARY_ADD_SUB_EXPRESSION, BINARY_AND_EXPRESSION,
      BINARY_COMPARE_EXPRESSION, BINARY_DIV_MUL_MOD_EXPRESSION, BINARY_EQUAL_EXPRESSION, BINARY_OR_EXPRESSION,
      BINARY_POW_EXPRESSION, BRACED_OR_TUPLE_EXPRESSION, BUILT_IN_REFERENCE_TYPE_TYPE_EXPRESSION, EXPRESSION,
      LAMBDA_FUNCTION_EXPRESSION, RECORD_LITERAL_EXPRESSION, SIMPLE_LITERAL_EXPRESSION, STRING_TEMPLATE_LITERAL_EXPRESSION,
      TERNARY_EXPRESSION, TYPE_ACCESS_EXPRESSION, TYPE_CONVERSION_EXPRESSION, TYPE_INIT_EXPRESSION,
      UNARY_EXPRESSION, VALUE_TYPE_TYPE_EXPRESSION, VARIABLE_REFERENCE_EXPRESSION, XML_LITERAL_EXPRESSION),
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
  // VariableReference RARROW FunctionInvocation
  public static boolean ActionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActionInvocation")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ACTION_INVOCATION, "<action invocation>");
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
  // (public)? annotation (LT AttachmentPoint (COMMA AttachmentPoint)* GT)? identifier UserDefineTypeName? SEMICOLON
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
  // any
  public static boolean AnyTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyTypeName")) return false;
    if (!nextTokenIs(b, ANY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANY);
    exit_section_(b, m, ANY_TYPE_NAME, r);
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
  // (var)? VariableReference (ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression) SEMICOLON
  public static boolean AssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = AssignmentStatement_0(b, l + 1);
    r = r && VariableReference(b, l + 1, -1);
    r = r && AssignmentStatement_2(b, l + 1);
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

  // ASSIGN | SAFE_ASSIGNMENT
  private static boolean AssignmentStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, SAFE_ASSIGNMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ActionInvocation | Expression
  private static boolean AssignmentStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ActionInvocation(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // service | resource | function | struct | enum | endpoint | const | TYPE_PARAMETER | annotation | transformer {
  //     /*recoverWhile=AttachmentPointRecover*/
  // }
  public static boolean AttachmentPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTACHMENT_POINT, "<attachment point>");
    r = consumeToken(b, SERVICE);
    if (!r) r = consumeToken(b, RESOURCE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, ENDPOINT);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, TYPE_PARAMETER);
    if (!r) r = consumeToken(b, ANNOTATION);
    if (!r) r = AttachmentPoint_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // transformer {
  //     /*recoverWhile=AttachmentPointRecover*/
  // }
  private static boolean AttachmentPoint_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachmentPoint_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRANSFORMER);
    r = r && AttachmentPoint_9_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //     /*recoverWhile=AttachmentPointRecover*/
  // }
  private static boolean AttachmentPoint_9_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // XmlQualifiedName EQUALS XmlQuotedString
  public static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    if (!nextTokenIs(b, "<attribute>", XML_QNAME, XML_TAG_EXPRESSION_START)) return false;
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
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // EndpointDefinition* Statement*
  public static boolean BlockWithEndpoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpoint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block with endpoint>");
    r = BlockWithEndpoint_0(b, l + 1);
    r = r && BlockWithEndpoint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EndpointDefinition*
  private static boolean BlockWithEndpoint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpoint_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockWithEndpoint_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Statement*
  private static boolean BlockWithEndpoint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpoint_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockWithEndpoint_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EndpointDefinition* WorkerDefinition+
  public static boolean BlockWithEndpointAndWorker(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpointAndWorker")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block with endpoint and worker>");
    r = BlockWithEndpointAndWorker_0(b, l + 1);
    r = r && BlockWithEndpointAndWorker_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EndpointDefinition*
  private static boolean BlockWithEndpointAndWorker_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpointAndWorker_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockWithEndpointAndWorker_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WorkerDefinition+
  private static boolean BlockWithEndpointAndWorker_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockWithEndpointAndWorker_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WorkerDefinition(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!WorkerDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockWithEndpointAndWorker_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
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
  // MapTypeName
  //                              | FutureTypeName
  //                              | XmlTypeName
  //                              | JsonTypeName
  //                              | TableTypeName
  //                              | StreamTypeName
  //                              | FunctionTypeName
  public static boolean BuiltInReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_REFERENCE_TYPE_NAME, "<built in reference type name>");
    r = MapTypeName(b, l + 1);
    if (!r) r = FutureTypeName(b, l + 1);
    if (!r) r = XmlTypeName(b, l + 1);
    if (!r) r = JsonTypeName(b, l + 1);
    if (!r) r = TableTypeName(b, l + 1);
    if (!r) r = StreamTypeName(b, l + 1);
    if (!r) r = FunctionTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnyTypeName
  //                     | TypeDescTypeName
  //                     | ValueTypeName
  //                     | BuiltInReferenceTypeName
  //                     | SimpleTypeName (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean BuiltInTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_TYPE_NAME, "<built in type name>");
    r = AnyTypeName(b, l + 1);
    if (!r) r = TypeDescTypeName(b, l + 1);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName(b, l + 1);
    if (!r) r = BuiltInTypeName_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SimpleTypeName (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean BuiltInTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleTypeName(b, l + 1);
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
  // LEFT_BRACE (BlockWithEndpoint RIGHT_BRACE | BlockWithEndpointAndWorker RIGHT_BRACE)
  public static boolean CallableUnitBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALLABLE_UNIT_BODY, null);
    r = consumeToken(b, LEFT_BRACE);
    p = r; // pin = 1
    r = r && CallableUnitBody_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // BlockWithEndpoint RIGHT_BRACE | BlockWithEndpointAndWorker RIGHT_BRACE
  private static boolean CallableUnitBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallableUnitBody_1_0(b, l + 1);
    if (!r) r = CallableUnitBody_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BlockWithEndpoint RIGHT_BRACE
  private static boolean CallableUnitBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockWithEndpoint(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // BlockWithEndpointAndWorker RIGHT_BRACE
  private static boolean CallableUnitBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockWithEndpointAndWorker(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier LEFT_PARENTHESIS FormalParameterList? RIGHT_PARENTHESIS ReturnParameter?
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

  // FormalParameterList?
  private static boolean CallableUnitSignature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature_2")) return false;
    FormalParameterList(b, l + 1);
    return true;
  }

  // ReturnParameter?
  private static boolean CallableUnitSignature_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature_4")) return false;
    ReturnParameter(b, l + 1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_TAG, null);
    r = consumeToken(b, XML_TAG_OPEN_SLASH);
    p = r; // pin = 1
    r = r && report_error_(b, XmlQualifiedName(b, l + 1));
    r = p && consumeToken(b, XML_TAG_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // XML_COMMENT_START (XML_COMMENT_TEMPLATE_TEXT Expression EXPRESSION_END)* XML_COMMENT_TEXT
  public static boolean Comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment")) return false;
    if (!nextTokenIs(b, XML_COMMENT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_COMMENT_START);
    r = r && Comment_1(b, l + 1);
    r = r && consumeToken(b, XML_COMMENT_TEXT);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  // (XML_COMMENT_TEMPLATE_TEXT Expression EXPRESSION_END)*
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

  // XML_COMMENT_TEMPLATE_TEXT Expression EXPRESSION_END
  private static boolean Comment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_COMMENT_TEMPLATE_TEXT);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
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
  // PackageName (DOT PackageName)*
  public static boolean CompletePackageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompletePackageName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMPLETE_PACKAGE_NAME, null);
    r = PackageName(b, l + 1);
    p = r; // pin = 1
    r = r && CompletePackageName_1(b, l + 1);
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

  /* ********************************************************** */
  // VariableReference CompoundOperator Expression SEMICOLON
  public static boolean CompoundAssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompoundAssignmentStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_ASSIGNMENT_STATEMENT, "<compound assignment statement>");
    r = VariableReference(b, l + 1, -1);
    r = r && CompoundOperator(b, l + 1);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMPOUND_ADD | COMPOUND_SUB | COMPOUND_MUL | COMPOUND_DIV
  public static boolean CompoundOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompoundOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_OPERATOR, "<compound operator>");
    r = consumeToken(b, COMPOUND_ADD);
    if (!r) r = consumeToken(b, COMPOUND_SUB);
    if (!r) r = consumeToken(b, COMPOUND_MUL);
    if (!r) r = consumeToken(b, COMPOUND_DIV);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (public)? const ValueTypeName identifier (ASSIGN | SAFE_ASSIGNMENT) Expression SEMICOLON
  public static boolean ConstantDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDefinition")) return false;
    if (!nextTokenIs(b, "<constant definition>", CONST, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DEFINITION, "<constant definition>");
    r = ConstantDefinition_0(b, l + 1);
    r = r && consumeToken(b, CONST);
    p = r; // pin = 2
    r = r && report_error_(b, ValueTypeName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && report_error_(b, ConstantDefinition_4(b, l + 1)) && r;
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

  // ASSIGN | SAFE_ASSIGNMENT
  private static boolean ConstantDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDefinition_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, SAFE_ASSIGNMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XmlText? ((Element | cdata | ProcIns | Comment) XmlText?)*
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

  // ((Element | cdata | ProcIns | Comment) XmlText?)*
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

  // (Element | cdata | ProcIns | Comment) XmlText?
  private static boolean Content_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Content_1_0_0(b, l + 1);
    r = r && Content_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Element | cdata | ProcIns | Comment
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
  // Parameter ASSIGN Expression
  public static boolean DefaultableParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefaultableParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFAULTABLE_PARAMETER, "<defaultable parameter>");
    r = Parameter(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttachment* documentationAttachment? deprecatedAttachment?
  //                ( TypeDefinition
  //                | StructDefinition
  //                | GlobalVariableDefinition
  //                | ServiceDefinition
  //                | FunctionDefinition
  //                | EnumDefinition
  //                | AnnotationDefinition
  //                | TransformerDefinition
  //                | ConstantDefinition
  //                | GlobalEndpointDefinition
  //                )
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

  // TypeDefinition
  //                | StructDefinition
  //                | GlobalVariableDefinition
  //                | ServiceDefinition
  //                | FunctionDefinition
  //                | EnumDefinition
  //                | AnnotationDefinition
  //                | TransformerDefinition
  //                | ConstantDefinition
  //                | GlobalEndpointDefinition
  private static boolean Definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeDefinition(b, l + 1);
    if (!r) r = StructDefinition(b, l + 1);
    if (!r) r = GlobalVariableDefinition(b, l + 1);
    if (!r) r = ServiceDefinition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    if (!r) r = EnumDefinition(b, l + 1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EMPTY_TAG, null);
    r = consumeToken(b, XML_TAG_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, XmlQualifiedName(b, l + 1));
    r = p && report_error_(b, EmptyTag_2(b, l + 1)) && r;
    r = p && consumeToken(b, XML_TAG_SLASH_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // AnnotationAttachment* endpoint EndpointType identifier EndpointInitlization? SEMICOLON
  public static boolean EndpointDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDefinition")) return false;
    if (!nextTokenIs(b, "<endpoint definition>", AT, ENDPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_DEFINITION, "<endpoint definition>");
    r = EndpointDefinition_0(b, l + 1);
    r = r && consumeToken(b, ENDPOINT);
    p = r; // pin = 2
    r = r && report_error_(b, EndpointType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && report_error_(b, EndpointDefinition_4(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean EndpointDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDefinition_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EndpointDefinition_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EndpointInitlization?
  private static boolean EndpointDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointDefinition_4")) return false;
    EndpointInitlization(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // RecordLiteral | ASSIGN VariableReference
  public static boolean EndpointInitlization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointInitlization")) return false;
    if (!nextTokenIs(b, "<endpoint initlization>", ASSIGN, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_INITLIZATION, "<endpoint initlization>");
    r = RecordLiteral(b, l + 1);
    if (!r) r = EndpointInitlization_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ASSIGN VariableReference
  private static boolean EndpointInitlization_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointInitlization_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && VariableReference(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NameReference
  public static boolean EndpointType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndpointType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_TYPE, "<endpoint type>");
    r = NameReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (public)? enum identifier LEFT_BRACE Enumerator (COMMA Enumerator)* RIGHT_BRACE
  public static boolean EnumDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition")) return false;
    if (!nextTokenIs(b, "<enum definition>", ENUM, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DEFINITION, "<enum definition>");
    r = EnumDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, ENUM, IDENTIFIER, LEFT_BRACE);
    p = r; // pin = 2
    r = r && report_error_(b, Enumerator(b, l + 1));
    r = p && report_error_(b, EnumDefinition_5(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean EnumDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (COMMA Enumerator)*
  private static boolean EnumDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EnumDefinition_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDefinition_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Enumerator
  private static boolean EnumDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Enumerator(b, l + 1);
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
  // Expression (COMMA Expression)*
  public static boolean ExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = Expression(b, l + 1, -1);
    p = r; // pin = 1
    r = r && ExpressionList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // !(int | string | float | boolean | blob |any| '}' | ';'|var |while|match|foreach|next|break|fork|try|throw|return|abort|fail|lock|xmlns|transaction|if)
  static boolean ExpressionRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !ExpressionRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // int | string | float | boolean | blob |any| '}' | ';'|var |while|match|foreach|next|break|fork|try|throw|return|abort|fail|lock|xmlns|transaction|if
  private static boolean ExpressionRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, BLOB);
    if (!r) r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, RIGHT_BRACE);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, MATCH);
    if (!r) r = consumeToken(b, FOREACH);
    if (!r) r = consumeToken(b, NEXT);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, FORK);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, THROW);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, ABORT);
    if (!r) r = consumeToken(b, FAIL);
    if (!r) r = consumeToken(b, LOCK);
    if (!r) r = consumeToken(b, XMLNS);
    if (!r) r = consumeToken(b, TRANSACTION);
    if (!r) r = consumeToken(b, IF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ActionInvocation | VariableReference) SEMICOLON
  public static boolean ExpressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STMT, "<expression stmt>");
    r = ExpressionStmt_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ActionInvocation | VariableReference
  private static boolean ExpressionStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ActionInvocation(b, l + 1);
    if (!r) r = VariableReference(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
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
  // TypeName identifier (ASSIGN Expression)? SEMICOLON
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

  // (ASSIGN Expression)?
  private static boolean FieldDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDefinition_2")) return false;
    FieldDefinition_2_0(b, l + 1);
    return true;
  }

  // ASSIGN Expression
  private static boolean FieldDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1, -1);
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
  // fork LEFT_BRACE WorkerDefinition* RIGHT_BRACE JoinClause? TimeoutClause?
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

  // WorkerDefinition*
  private static boolean ForkJoinStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForkJoinStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!WorkerDefinition(b, l + 1)) break;
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
  // (DefaultableParameter | Parameter) (COMMA (DefaultableParameter | Parameter))* (COMMA RestParameter)? | RestParameter
  public static boolean FormalParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = FormalParameterList_0(b, l + 1);
    if (!r) r = RestParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DefaultableParameter | Parameter) (COMMA (DefaultableParameter | Parameter))* (COMMA RestParameter)?
  private static boolean FormalParameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalParameterList_0_0(b, l + 1);
    r = r && FormalParameterList_0_1(b, l + 1);
    r = r && FormalParameterList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DefaultableParameter | Parameter
  private static boolean FormalParameterList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DefaultableParameter(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA (DefaultableParameter | Parameter))*
  private static boolean FormalParameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FormalParameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FormalParameterList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA (DefaultableParameter | Parameter)
  private static boolean FormalParameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FormalParameterList_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DefaultableParameter | Parameter
  private static boolean FormalParameterList_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DefaultableParameter(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA RestParameter)?
  private static boolean FormalParameterList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0_2")) return false;
    FormalParameterList_0_2_0(b, l + 1);
    return true;
  }

  // COMMA RestParameter
  private static boolean FormalParameterList_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalParameterList_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && RestParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionWithReceiver | FunctionWithoutReceiver
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = FunctionWithReceiver(b, l + 1);
    if (!r) r = FunctionWithoutReceiver(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // async? NameReference LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION, "<function invocation>");
    r = FunctionInvocation_0(b, l + 1);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && FunctionInvocation_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // async?
  private static boolean FunctionInvocation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_0")) return false;
    consumeToken(b, ASYNC);
    return true;
  }

  // InvocationArgList?
  private static boolean FunctionInvocation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_3")) return false;
    InvocationArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // function LEFT_PARENTHESIS (ParameterList | ParameterTypeNameList)? RIGHT_PARENTHESIS ReturnParameter?
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

  // (ParameterList | ParameterTypeNameList)?
  private static boolean FunctionTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2")) return false;
    FunctionTypeName_2_0(b, l + 1);
    return true;
  }

  // ParameterList | ParameterTypeNameList
  private static boolean FunctionTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    if (!r) r = ParameterTypeNameList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnParameter?
  private static boolean FunctionTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_4")) return false;
    ReturnParameter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (public)? (native)? function (LT Parameter GT)? CallableUnitSignature (CallableUnitBody | SEMICOLON)
  static boolean FunctionWithReceiver(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithReceiver")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = FunctionWithReceiver_0(b, l + 1);
    r = r && FunctionWithReceiver_1(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    p = r; // pin = 3
    r = r && report_error_(b, FunctionWithReceiver_3(b, l + 1));
    r = p && report_error_(b, CallableUnitSignature(b, l + 1)) && r;
    r = p && FunctionWithReceiver_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean FunctionWithReceiver_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithReceiver_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (native)?
  private static boolean FunctionWithReceiver_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithReceiver_1")) return false;
    consumeToken(b, NATIVE);
    return true;
  }

  // (LT Parameter GT)?
  private static boolean FunctionWithReceiver_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithReceiver_3")) return false;
    FunctionWithReceiver_3_0(b, l + 1);
    return true;
  }

  // LT Parameter GT
  private static boolean FunctionWithReceiver_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithReceiver_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // CallableUnitBody | SEMICOLON
  private static boolean FunctionWithReceiver_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithReceiver_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallableUnitBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (public)? (native)? function identifier DOUBLE_COLON CallableUnitSignature CallableUnitBody
  static boolean FunctionWithoutReceiver(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithoutReceiver")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = FunctionWithoutReceiver_0(b, l + 1);
    r = r && FunctionWithoutReceiver_1(b, l + 1);
    r = r && consumeTokens(b, 1, FUNCTION, IDENTIFIER, DOUBLE_COLON);
    p = r; // pin = 3
    r = r && report_error_(b, CallableUnitSignature(b, l + 1));
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean FunctionWithoutReceiver_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithoutReceiver_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (native)?
  private static boolean FunctionWithoutReceiver_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionWithoutReceiver_1")) return false;
    consumeToken(b, NATIVE);
    return true;
  }

  /* ********************************************************** */
  // future (LT TypeName GT)?
  public static boolean FutureTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FutureTypeName")) return false;
    if (!nextTokenIs(b, FUTURE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUTURE_TYPE_NAME, null);
    r = consumeToken(b, FUTURE);
    p = r; // pin = 1
    r = r && FutureTypeName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LT TypeName GT)?
  private static boolean FutureTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FutureTypeName_1")) return false;
    FutureTypeName_1_0(b, l + 1);
    return true;
  }

  // LT TypeName GT
  private static boolean FutureTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FutureTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // public? EndpointDefinition
  public static boolean GlobalEndpointDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalEndpointDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_ENDPOINT_DEFINITION, "<global endpoint definition>");
    r = GlobalEndpointDefinition_0(b, l + 1);
    r = r && EndpointDefinition(b, l + 1);
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
  // (public)? TypeName identifier ((ASSIGN | SAFE_ASSIGNMENT) Expression)? SEMICOLON
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

  // ((ASSIGN | SAFE_ASSIGNMENT) Expression)?
  private static boolean GlobalVariableDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition_3")) return false;
    GlobalVariableDefinition_3_0(b, l + 1);
    return true;
  }

  // (ASSIGN | SAFE_ASSIGNMENT) Expression
  private static boolean GlobalVariableDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GlobalVariableDefinition_3_0_0(b, l + 1);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASSIGN | SAFE_ASSIGNMENT
  private static boolean GlobalVariableDefinition_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVariableDefinition_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, SAFE_ASSIGNMENT);
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
  // import (OrgName DIV)? CompletePackageName PackageVersion? Alias? SEMICOLON
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
    r = p && report_error_(b, ImportDeclaration_4(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (OrgName DIV)?
  private static boolean ImportDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_1")) return false;
    ImportDeclaration_1_0(b, l + 1);
    return true;
  }

  // OrgName DIV
  private static boolean ImportDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrgName(b, l + 1);
    r = r && consumeToken(b, DIV);
    exit_section_(b, m, null, r);
    return r;
  }

  // PackageVersion?
  private static boolean ImportDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_3")) return false;
    PackageVersion(b, l + 1);
    return true;
  }

  // Alias?
  private static boolean ImportDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_4")) return false;
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
    r = r && Expression(b, l + 1, -1);
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
  // DECIMAL_INTEGER_LITERAL | HEX_INTEGER_LITERAL | OCTAL_INTEGER_LITERAL | BINARY_INTEGER_LITERAL
  public static boolean IntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = consumeToken(b, DECIMAL_INTEGER_LITERAL);
    if (!r) r = consumeToken(b, HEX_INTEGER_LITERAL);
    if (!r) r = consumeToken(b, OCTAL_INTEGER_LITERAL);
    if (!r) r = consumeToken(b, BINARY_INTEGER_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOT AnyIdentifierName LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS
  public static boolean Invocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invocation")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && AnyIdentifierName(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && Invocation_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, INVOCATION, r);
    return r;
  }

  // InvocationArgList?
  private static boolean Invocation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Invocation_3")) return false;
    InvocationArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NamedArgs | RestArgs | Expression
  public static boolean InvocationArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InvocationArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INVOCATION_ARG, "<invocation arg>");
    r = NamedArgs(b, l + 1);
    if (!r) r = RestArgs(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // InvocationArg (COMMA InvocationArg)*
  public static boolean InvocationArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InvocationArgList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INVOCATION_ARG_LIST, "<invocation arg list>");
    r = InvocationArg(b, l + 1);
    p = r; // pin = 1
    r = r && InvocationArgList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA InvocationArg)*
  private static boolean InvocationArgList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InvocationArgList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InvocationArgList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InvocationArgList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA InvocationArg
  private static boolean InvocationArgList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InvocationArgList_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && InvocationArg(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // (some IntegerLiteral | all) (identifier (COMMA identifier)*)?
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

  // some IntegerLiteral | all
  private static boolean JoinConditions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JoinConditions_0_0(b, l + 1);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, m, null, r);
    return r;
  }

  // some IntegerLiteral
  private static boolean JoinConditions_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinConditions_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SOME);
    r = r && IntegerLiteral(b, l + 1);
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
  // function LEFT_PARENTHESIS FormalParameterList? RIGHT_PARENTHESIS ReturnParameter? CallableUnitBody
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

  // FormalParameterList?
  private static boolean LambdaFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_2")) return false;
    FormalParameterList(b, l + 1);
    return true;
  }

  // ReturnParameter?
  private static boolean LambdaFunction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_4")) return false;
    ReturnParameter(b, l + 1);
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
  // <<isPackageExpected>> PackageReference identifier | identifier
  public static boolean NameReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAME_REFERENCE, "<name reference>");
    r = NameReference_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<isPackageExpected>> PackageReference identifier
  private static boolean NameReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isPackageExpected(b, l + 1);
    r = r && PackageReference(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ASSIGN Expression
  public static boolean NamedArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedArgs")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMED_ARGS, null);
    r = consumeTokens(b, 2, IDENTIFIER, ASSIGN);
    p = r; // pin = 2
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // xmlns QUOTED_STRING_LITERAL (as identifier)? SEMICOLON
  public static boolean NamespaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration")) return false;
    if (!nextTokenIs(b, XMLNS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_DECLARATION, null);
    r = consumeTokens(b, 1, XMLNS, QUOTED_STRING_LITERAL);
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
  // PublicObjectFields? PrivateObjectFields? ObjectInitializer? ObjectFunctions?
  public static boolean ObjectBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BODY, "<object body>");
    r = ObjectBody_0(b, l + 1);
    r = r && ObjectBody_1(b, l + 1);
    r = r && ObjectBody_2(b, l + 1);
    r = r && ObjectBody_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PublicObjectFields?
  private static boolean ObjectBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody_0")) return false;
    PublicObjectFields(b, l + 1);
    return true;
  }

  // PrivateObjectFields?
  private static boolean ObjectBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody_1")) return false;
    PrivateObjectFields(b, l + 1);
    return true;
  }

  // ObjectInitializer?
  private static boolean ObjectBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody_2")) return false;
    ObjectInitializer(b, l + 1);
    return true;
  }

  // ObjectFunctions?
  private static boolean ObjectBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectBody_3")) return false;
    ObjectFunctions(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier LEFT_PARENTHESIS FormalParameterList? RIGHT_PARENTHESIS ReturnParameter?
  public static boolean ObjectCallableUnitSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectCallableUnitSignature")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LEFT_PARENTHESIS);
    r = r && ObjectCallableUnitSignature_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && ObjectCallableUnitSignature_4(b, l + 1);
    exit_section_(b, m, OBJECT_CALLABLE_UNIT_SIGNATURE, r);
    return r;
  }

  // FormalParameterList?
  private static boolean ObjectCallableUnitSignature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectCallableUnitSignature_2")) return false;
    FormalParameterList(b, l + 1);
    return true;
  }

  // ReturnParameter?
  private static boolean ObjectCallableUnitSignature_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectCallableUnitSignature_4")) return false;
    ReturnParameter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ObjectParameter COLON Expression
  public static boolean ObjectDefaultableParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectDefaultableParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_DEFAULTABLE_PARAMETER, "<object defaultable parameter>");
    r = ObjectParameter(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeName identifier (COLON SimpleLiteral)? (COMMA | SEMICOLON)
  public static boolean ObjectFieldDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFieldDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_FIELD_DEFINITION, "<object field definition>");
    r = TypeName(b, l + 1, -1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && ObjectFieldDefinition_2(b, l + 1);
    r = r && ObjectFieldDefinition_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COLON SimpleLiteral)?
  private static boolean ObjectFieldDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFieldDefinition_2")) return false;
    ObjectFieldDefinition_2_0(b, l + 1);
    return true;
  }

  // COLON SimpleLiteral
  private static boolean ObjectFieldDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFieldDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && SimpleLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA | SEMICOLON
  private static boolean ObjectFieldDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFieldDefinition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (public)? (native)? function ObjectCallableUnitSignature (CallableUnitBody | SEMICOLON)
  public static boolean ObjectFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_FUNCTION_DEFINITION, "<object function definition>");
    r = ObjectFunctionDefinition_0(b, l + 1);
    r = r && ObjectFunctionDefinition_1(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    r = r && ObjectCallableUnitSignature(b, l + 1);
    r = r && ObjectFunctionDefinition_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (public)?
  private static boolean ObjectFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (native)?
  private static boolean ObjectFunctionDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctionDefinition_1")) return false;
    consumeToken(b, NATIVE);
    return true;
  }

  // CallableUnitBody | SEMICOLON
  private static boolean ObjectFunctionDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctionDefinition_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallableUnitBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (AnnotationAttachment* documentationAttachment? deprecatedAttachment? ObjectFunctionDefinition)+
  public static boolean ObjectFunctions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_FUNCTIONS, "<object functions>");
    r = ObjectFunctions_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ObjectFunctions_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectFunctions", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AnnotationAttachment* documentationAttachment? deprecatedAttachment? ObjectFunctionDefinition
  private static boolean ObjectFunctions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectFunctions_0_0(b, l + 1);
    r = r && ObjectFunctions_0_1(b, l + 1);
    r = r && ObjectFunctions_0_2(b, l + 1);
    r = r && ObjectFunctionDefinition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AnnotationAttachment*
  private static boolean ObjectFunctions_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctions_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectFunctions_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // documentationAttachment?
  private static boolean ObjectFunctions_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctions_0_1")) return false;
    documentationAttachment(b, l + 1);
    return true;
  }

  // deprecatedAttachment?
  private static boolean ObjectFunctions_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectFunctions_0_2")) return false;
    deprecatedAttachment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AnnotationAttachment* documentationAttachment? (public)? (native)? new ObjectInitializerParameterList CallableUnitBody
  public static boolean ObjectInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializer")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_INITIALIZER, "<object initializer>");
    r = ObjectInitializer_0(b, l + 1);
    r = r && ObjectInitializer_1(b, l + 1);
    r = r && ObjectInitializer_2(b, l + 1);
    r = r && ObjectInitializer_3(b, l + 1);
    r = r && consumeToken(b, NEW);
    p = r; // pin = 5
    r = r && report_error_(b, ObjectInitializerParameterList(b, l + 1));
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean ObjectInitializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializer_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectInitializer_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // documentationAttachment?
  private static boolean ObjectInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializer_1")) return false;
    documentationAttachment(b, l + 1);
    return true;
  }

  // (public)?
  private static boolean ObjectInitializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializer_2")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (native)?
  private static boolean ObjectInitializer_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializer_3")) return false;
    consumeToken(b, NATIVE);
    return true;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS ObjectParameterList? RIGHT_PARENTHESIS
  public static boolean ObjectInitializerParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerParameterList")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && ObjectInitializerParameterList_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, OBJECT_INITIALIZER_PARAMETER_LIST, r);
    return r;
  }

  // ObjectParameterList?
  private static boolean ObjectInitializerParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerParameterList_1")) return false;
    ObjectParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AnnotationAttachment* (identifier | TypeName identifier)
  public static boolean ObjectParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PARAMETER, "<object parameter>");
    r = ObjectParameter_0(b, l + 1);
    r = r && ObjectParameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AnnotationAttachment*
  private static boolean ObjectParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectParameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // identifier | TypeName identifier
  private static boolean ObjectParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = ObjectParameter_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeName identifier
  private static boolean ObjectParameter_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameter_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1, -1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ObjectParameter | ObjectDefaultableParameter) (COMMA (ObjectParameter | ObjectDefaultableParameter))* (COMMA RestParameter)? | RestParameter
  public static boolean ObjectParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PARAMETER_LIST, "<object parameter list>");
    r = ObjectParameterList_0(b, l + 1);
    if (!r) r = RestParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ObjectParameter | ObjectDefaultableParameter) (COMMA (ObjectParameter | ObjectDefaultableParameter))* (COMMA RestParameter)?
  private static boolean ObjectParameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectParameterList_0_0(b, l + 1);
    r = r && ObjectParameterList_0_1(b, l + 1);
    r = r && ObjectParameterList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ObjectParameter | ObjectDefaultableParameter
  private static boolean ObjectParameterList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectParameter(b, l + 1);
    if (!r) r = ObjectDefaultableParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA (ObjectParameter | ObjectDefaultableParameter))*
  private static boolean ObjectParameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ObjectParameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectParameterList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA (ObjectParameter | ObjectDefaultableParameter)
  private static boolean ObjectParameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ObjectParameterList_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ObjectParameter | ObjectDefaultableParameter
  private static boolean ObjectParameterList_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectParameter(b, l + 1);
    if (!r) r = ObjectDefaultableParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA RestParameter)?
  private static boolean ObjectParameterList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0_2")) return false;
    ObjectParameterList_0_2_0(b, l + 1);
    return true;
  }

  // COMMA RestParameter
  private static boolean ObjectParameterList_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectParameterList_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && RestParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onabort ASSIGN Expression
  public static boolean OnabortStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OnabortStatement")) return false;
    if (!nextTokenIs(b, ONABORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ONABORT, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, ONABORT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // oncommit ASSIGN Expression
  public static boolean OncommitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OncommitStatement")) return false;
    if (!nextTokenIs(b, ONCOMMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ONCOMMIT, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, ONCOMMIT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // onretry LEFT_BRACE Block RIGHT_BRACE
  public static boolean OnretryClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OnretryClause")) return false;
    if (!nextTokenIs(b, ONRETRY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ONRETRY_CLAUSE, null);
    r = consumeTokens(b, 1, ONRETRY, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier
  public static boolean OrgName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrgName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ORG_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // package CompletePackageName PackageVersion? SEMICOLON
  public static boolean PackageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, null);
    r = consumeToken(b, PACKAGE);
    p = r; // pin = 1
    r = r && report_error_(b, CompletePackageName(b, l + 1));
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
    r = consumeTokens(b, 2, IDENTIFIER, COLON);
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
  // SimpleParameter | TupleParameter
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = SimpleParameter(b, l + 1);
    if (!r) r = TupleParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Parameter(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // parameterTypeName (COMMA parameterTypeName)*
  public static boolean ParameterTypeNameList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterTypeNameList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_TYPE_NAME_LIST, "<parameter type name list>");
    r = parameterTypeName(b, l + 1);
    p = r; // pin = 1
    r = r && ParameterTypeNameList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA parameterTypeName)*
  private static boolean ParameterTypeNameList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterTypeNameList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterTypeNameList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterTypeNameList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA parameterTypeName
  private static boolean ParameterTypeNameList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterTypeNameList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameterTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INCREMENT | DECREMENT
  public static boolean PostArithmeticOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostArithmeticOperator")) return false;
    if (!nextTokenIs(b, "<post arithmetic operator>", DECREMENT, INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POST_ARITHMETIC_OPERATOR, "<post arithmetic operator>");
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VariableReference PostArithmeticOperator SEMICOLON
  public static boolean PostIncrementStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostIncrementStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POST_INCREMENT_STATEMENT, "<post increment statement>");
    r = VariableReference(b, l + 1, -1);
    r = r && PostArithmeticOperator(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // private LEFT_BRACE ObjectFieldDefinition* RIGHT_BRACE
  public static boolean PrivateObjectFields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrivateObjectFields")) return false;
    if (!nextTokenIs(b, PRIVATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRIVATE_OBJECT_FIELDS, null);
    r = consumeTokens(b, 1, PRIVATE, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, PrivateObjectFields_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ObjectFieldDefinition*
  private static boolean PrivateObjectFields_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrivateObjectFields_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ObjectFieldDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PrivateObjectFields_2", c)) break;
      c = current_position_(b);
    }
    return true;
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
  // XML_TAG_SPECIAL_OPEN (XML_PI_TEMPLATE_TEXT Expression EXPRESSION_END)* XML_PI_TEXT
  public static boolean ProcIns(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcIns")) return false;
    if (!nextTokenIs(b, XML_TAG_SPECIAL_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TAG_SPECIAL_OPEN);
    r = r && ProcIns_1(b, l + 1);
    r = r && consumeToken(b, XML_PI_TEXT);
    exit_section_(b, m, PROC_INS, r);
    return r;
  }

  // (XML_PI_TEMPLATE_TEXT Expression EXPRESSION_END)*
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

  // XML_PI_TEMPLATE_TEXT Expression EXPRESSION_END
  private static boolean ProcIns_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcIns_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_PI_TEMPLATE_TEXT);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // public LEFT_BRACE ObjectFieldDefinition* RIGHT_BRACE
  public static boolean PublicObjectFields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PublicObjectFields")) return false;
    if (!nextTokenIs(b, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PUBLIC_OBJECT_FIELDS, null);
    r = consumeTokens(b, 1, PUBLIC, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, PublicObjectFields_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ObjectFieldDefinition*
  private static boolean PublicObjectFields_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PublicObjectFields_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ObjectFieldDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PublicObjectFields_2", c)) break;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_KEY_VALUE, "<record key value>");
    r = RecordKey(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COLON));
    r = p && Expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LEFT_BRACE (RecordKeyValue (COMMA RecordKeyValue)*)? RIGHT_BRACE
  public static boolean RecordLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteral")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_LITERAL, null);
    r = consumeToken(b, LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, RecordLiteral_1(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = RecordKeyValue(b, l + 1);
    p = r; // pin = 1
    r = r && RecordLiteral_1_0_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && RecordKeyValue(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BuiltInReferenceTypeName
  //                       | UserDefineTypeName
  //                       | AnonStructTypeName
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
  // AnnotationAttachment* documentationAttachment? deprecatedAttachment? identifier LEFT_PARENTHESIS resourceParameterList? RIGHT_PARENTHESIS CallableUnitBody
  public static boolean ResourceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_DEFINITION, "<resource definition>");
    r = ResourceDefinition_0(b, l + 1);
    r = r && ResourceDefinition_1(b, l + 1);
    r = r && ResourceDefinition_2(b, l + 1);
    r = r && consumeTokens(b, 1, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 4
    r = r && report_error_(b, ResourceDefinition_5(b, l + 1));
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

  // resourceParameterList?
  private static boolean ResourceDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition_5")) return false;
    resourceParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ELLIPSIS Expression
  public static boolean RestArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestArgs")) return false;
    if (!nextTokenIs(b, ELLIPSIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REST_ARGS, null);
    r = consumeToken(b, ELLIPSIS);
    p = r; // pin = 1
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AnnotationAttachment* TypeName ELLIPSIS identifier
  public static boolean RestParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REST_PARAMETER, "<rest parameter>");
    r = RestParameter_0(b, l + 1);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeTokens(b, 0, ELLIPSIS, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AnnotationAttachment*
  private static boolean RestParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestParameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RestParameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // retries ASSIGN Expression
  public static boolean RetriesStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetriesStatement")) return false;
    if (!nextTokenIs(b, RETRIES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETRIES_STATEMENT, null);
    r = consumeTokens(b, 1, RETRIES, ASSIGN);
    p = r; // pin = 1
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // returns TypeName
  public static boolean ReturnParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameter")) return false;
    if (!nextTokenIs(b, RETURNS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_PARAMETER, null);
    r = consumeToken(b, RETURNS);
    p = r; // pin = 1
    r = r && TypeName(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // LEFT_BRACE (/*ResourceDefinition+ | EndpointDefinition+ ResourceDefinition* |*/ EndpointDefinition* VariableDefinitionStatementInService* ResourceDefinition*) RIGHT_BRACE
  public static boolean ServiceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && ServiceBody_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, SERVICE_BODY, r);
    return r;
  }

  // EndpointDefinition* VariableDefinitionStatementInService* ResourceDefinition*
  private static boolean ServiceBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ServiceBody_1_0(b, l + 1);
    r = r && ServiceBody_1_1(b, l + 1);
    r = r && ServiceBody_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EndpointDefinition*
  private static boolean ServiceBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EndpointDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VariableDefinitionStatementInService*
  private static boolean ServiceBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableDefinitionStatementInService(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ResourceDefinition*
  private static boolean ServiceBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ResourceDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // service (LT NameReference GT) identifier ServiceEndpointAttachments?  ServiceBody
  public static boolean ServiceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition")) return false;
    if (!nextTokenIs(b, SERVICE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_DEFINITION, null);
    r = consumeToken(b, SERVICE);
    p = r; // pin = 1
    r = r && report_error_(b, ServiceDefinition_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && report_error_(b, ServiceDefinition_3(b, l + 1)) && r;
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

  // ServiceEndpointAttachments?
  private static boolean ServiceDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition_3")) return false;
    ServiceEndpointAttachments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // bind NameReference (COMMA NameReference)*
  public static boolean ServiceEndpointAttachments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceEndpointAttachments")) return false;
    if (!nextTokenIs(b, BIND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_ENDPOINT_ATTACHMENTS, null);
    r = consumeToken(b, BIND);
    p = r; // pin = 1
    r = r && report_error_(b, NameReference(b, l + 1));
    r = p && ServiceEndpointAttachments_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA NameReference)*
  private static boolean ServiceEndpointAttachments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceEndpointAttachments_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ServiceEndpointAttachments_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceEndpointAttachments_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA NameReference
  private static boolean ServiceEndpointAttachments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceEndpointAttachments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && NameReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ADD|SUB)? IntegerLiteral
  //                   | (ADD|SUB)? FLOATING_POINT_LITERAL
  //                   | QUOTED_STRING_LITERAL
  //                   | BOOLEAN_LITERAL
  //                   | NULL_LITERAL
  public static boolean SimpleLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_LITERAL, "<simple literal>");
    r = SimpleLiteral_0(b, l + 1);
    if (!r) r = SimpleLiteral_1(b, l + 1);
    if (!r) r = consumeToken(b, QUOTED_STRING_LITERAL);
    if (!r) r = consumeToken(b, BOOLEAN_LITERAL);
    if (!r) r = consumeToken(b, NULL_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ADD|SUB)? IntegerLiteral
  private static boolean SimpleLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleLiteral_0_0(b, l + 1);
    r = r && IntegerLiteral(b, l + 1);
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

  // (ADD|SUB)? FLOATING_POINT_LITERAL
  private static boolean SimpleLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleLiteral_1_0(b, l + 1);
    r = r && consumeToken(b, FLOATING_POINT_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ADD|SUB)?
  private static boolean SimpleLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_1_0")) return false;
    SimpleLiteral_1_0_0(b, l + 1);
    return true;
  }

  // ADD|SUB
  private static boolean SimpleLiteral_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteral_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AnnotationAttachment* TypeName identifier
  static boolean SimpleParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleParameter")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = SimpleParameter_0(b, l + 1);
    r = r && TypeName(b, l + 1, -1);
    p = r; // pin = 2
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnnotationAttachment*
  private static boolean SimpleParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleParameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SimpleParameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // XML_TAG_OPEN XmlQualifiedName Attribute* XML_TAG_CLOSE
  public static boolean StartTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTag")) return false;
    if (!nextTokenIs(b, XML_TAG_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, START_TAG, null);
    r = consumeToken(b, XML_TAG_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, XmlQualifiedName(b, l + 1));
    r = p && report_error_(b, StartTag_2(b, l + 1)) && r;
    r = p && consumeToken(b, XML_TAG_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // WhileStatement
  //     |   NextStatement
  //     |   ForeachStatement
  //     |   matchStatement
  //     |   BreakStatement
  //     |   ThrowStatement
  //     |   ReturnStatement
  //     |   AbortStatement
  //     |   failStatement
  //     |   LockStatement
  //     |   NamespaceDeclarationStatement
  //     |   TransactionStatement
  //     |   IfElseStatement
  //     |   TryCatchStatement
  //     |   ForkJoinStatement
  //     |   ExpressionStmt
  //     |   AssignmentStatement
  //     |   tupleDestructuringStatement
  //     |   CompoundAssignmentStatement
  //     |   PostIncrementStatement
  //     |   VariableDefinitionStatement
  //     |   WorkerInteractionStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = WhileStatement(b, l + 1);
    if (!r) r = NextStatement(b, l + 1);
    if (!r) r = ForeachStatement(b, l + 1);
    if (!r) r = matchStatement(b, l + 1);
    if (!r) r = BreakStatement(b, l + 1);
    if (!r) r = ThrowStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = AbortStatement(b, l + 1);
    if (!r) r = failStatement(b, l + 1);
    if (!r) r = LockStatement(b, l + 1);
    if (!r) r = NamespaceDeclarationStatement(b, l + 1);
    if (!r) r = TransactionStatement(b, l + 1);
    if (!r) r = IfElseStatement(b, l + 1);
    if (!r) r = TryCatchStatement(b, l + 1);
    if (!r) r = ForkJoinStatement(b, l + 1);
    if (!r) r = ExpressionStmt(b, l + 1);
    if (!r) r = AssignmentStatement(b, l + 1);
    if (!r) r = tupleDestructuringStatement(b, l + 1);
    if (!r) r = CompoundAssignmentStatement(b, l + 1);
    if (!r) r = PostIncrementStatement(b, l + 1);
    if (!r) r = VariableDefinitionStatement(b, l + 1);
    if (!r) r = WorkerInteractionStatement(b, l + 1);
    exit_section_(b, l, m, r, false, StatementRecover_parser_);
    return r;
  }

  /* ********************************************************** */
  // !(int|string|float|boolean|blob|any|'}'|';'|var|while|match|foreach|next|break|fork|try|throw|return|abort|fail|lock|xmlns|transaction|if|identifier)
  static boolean StatementRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !StatementRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // int|string|float|boolean|blob|any|'}'|';'|var|while|match|foreach|next|break|fork|try|throw|return|abort|fail|lock|xmlns|transaction|if|identifier
  private static boolean StatementRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, BLOB);
    if (!r) r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, RIGHT_BRACE);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, MATCH);
    if (!r) r = consumeToken(b, FOREACH);
    if (!r) r = consumeToken(b, NEXT);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, FORK);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, THROW);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, ABORT);
    if (!r) r = consumeToken(b, FAIL);
    if (!r) r = consumeToken(b, LOCK);
    if (!r) r = consumeToken(b, XMLNS);
    if (!r) r = consumeToken(b, TRANSACTION);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // stream (LT NameReference GT)?
  public static boolean StreamTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StreamTypeName")) return false;
    if (!nextTokenIs(b, STREAM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STREAM_TYPE_NAME, null);
    r = consumeToken(b, STREAM);
    p = r; // pin = 1
    r = r && StreamTypeName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LT NameReference GT)?
  private static boolean StreamTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StreamTypeName_1")) return false;
    StreamTypeName_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean StreamTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StreamTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringTemplateExpressionContent | StringTemplateTextContent
  public static boolean StringTemplateContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateContent")) return false;
    if (!nextTokenIs(b, "<string template content>", STRING_TEMPLATE_EXPRESSION_START, STRING_TEMPLATE_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_TEMPLATE_CONTENT, "<string template content>");
    r = StringTemplateExpressionContent(b, l + 1);
    if (!r) r = StringTemplateTextContent(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_TEMPLATE_EXPRESSION_START Expression EXPRESSION_END
  static boolean StringTemplateExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateExpression")) return false;
    if (!nextTokenIs(b, STRING_TEMPLATE_EXPRESSION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TEMPLATE_EXPRESSION_START);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringTemplateExpression+ STRING_TEMPLATE_TEXT?
  static boolean StringTemplateExpressionContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateExpressionContent")) return false;
    if (!nextTokenIs(b, STRING_TEMPLATE_EXPRESSION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringTemplateExpressionContent_0(b, l + 1);
    r = r && StringTemplateExpressionContent_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StringTemplateExpression+
  private static boolean StringTemplateExpressionContent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateExpressionContent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringTemplateExpression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!StringTemplateExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringTemplateExpressionContent_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_TEMPLATE_TEXT?
  private static boolean StringTemplateExpressionContent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateExpressionContent_1")) return false;
    consumeToken(b, STRING_TEMPLATE_TEXT);
    return true;
  }

  /* ********************************************************** */
  // STRING_TEMPLATE_LITERAL_START StringTemplateContent? STRING_TEMPLATE_LITERAL_END
  public static boolean StringTemplateLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateLiteral")) return false;
    if (!nextTokenIs(b, STRING_TEMPLATE_LITERAL_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRING_TEMPLATE_LITERAL, null);
    r = consumeToken(b, STRING_TEMPLATE_LITERAL_START);
    p = r; // pin = 1
    r = r && report_error_(b, StringTemplateLiteral_1(b, l + 1));
    r = p && consumeToken(b, STRING_TEMPLATE_LITERAL_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // StringTemplateContent?
  private static boolean StringTemplateLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateLiteral_1")) return false;
    StringTemplateContent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_TEMPLATE_TEXT
  static boolean StringTemplateTextContent(PsiBuilder b, int l) {
    return consumeToken(b, STRING_TEMPLATE_TEXT);
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
  // !(DOCUMENTATION_TEMPLATE_START|DEPRECATED_TEMPLATE_START|'@'| public | type | struct | service | function | enum | annotation | transformer | const | endpoint | boolean | int | float | string | blob | identifier)
  static boolean TopLevelDefinitionRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TopLevelDefinitionRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DOCUMENTATION_TEMPLATE_START|DEPRECATED_TEMPLATE_START|'@'| public | type | struct | service | function | enum | annotation | transformer | const | endpoint | boolean | int | float | string | blob | identifier
  private static boolean TopLevelDefinitionRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATION_TEMPLATE_START);
    if (!r) r = consumeToken(b, DEPRECATED_TEMPLATE_START);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, SERVICE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, ANNOTATION);
    if (!r) r = consumeToken(b, TRANSFORMER);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, ENDPOINT);
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
  // RetriesStatement | OncommitStatement | OnabortStatement
  public static boolean TransactionPropertyInitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionPropertyInitStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRANSACTION_PROPERTY_INIT_STATEMENT, "<transaction property init statement>");
    r = RetriesStatement(b, l + 1);
    if (!r) r = OncommitStatement(b, l + 1);
    if (!r) r = OnabortStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TransactionPropertyInitStatement (COMMA TransactionPropertyInitStatement)*
  public static boolean TransactionPropertyInitStatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionPropertyInitStatementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRANSACTION_PROPERTY_INIT_STATEMENT_LIST, "<transaction property init statement list>");
    r = TransactionPropertyInitStatement(b, l + 1);
    r = r && TransactionPropertyInitStatementList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // TransactionClause OnretryClause?
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

  // OnretryClause?
  private static boolean TransactionStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TransactionStatement_1")) return false;
    OnretryClause(b, l + 1);
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
  // AnnotationAttachment* LEFT_PARENTHESIS TypeName identifier (COMMA TypeName identifier)* RIGHT_PARENTHESIS
  static boolean TupleParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleParameter")) return false;
    if (!nextTokenIs(b, "", AT, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TupleParameter_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && TupleParameter_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // AnnotationAttachment*
  private static boolean TupleParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleParameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleParameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (COMMA TypeName identifier)*
  private static boolean TupleParameter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleParameter_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TupleParameter_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleParameter_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA TypeName identifier
  private static boolean TupleParameter_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleParameter_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (public)? type identifier TypeName
  public static boolean TypeDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefinition")) return false;
    if (!nextTokenIs(b, "<type definition>", PUBLIC, TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEFINITION, "<type definition>");
    r = TypeDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, TYPE, IDENTIFIER);
    p = r; // pin = 2
    r = r && TypeName(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (public)?
  private static boolean TypeDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // typedesc
  public static boolean TypeDescTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDescTypeName")) return false;
    if (!nextTokenIs(b, TYPEDESC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPEDESC);
    exit_section_(b, m, TYPE_DESC_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // new (LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS)? | new UserDefineTypeName LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS
  public static boolean TypeInitExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeInitExpr_0(b, l + 1);
    if (!r) r = TypeInitExpr_1(b, l + 1);
    exit_section_(b, m, TYPE_INIT_EXPR, r);
    return r;
  }

  // new (LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS)?
  private static boolean TypeInitExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && TypeInitExpr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS)?
  private static boolean TypeInitExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr_0_1")) return false;
    TypeInitExpr_0_1_0(b, l + 1);
    return true;
  }

  // LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS
  private static boolean TypeInitExpr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && TypeInitExpr_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // InvocationArgList?
  private static boolean TypeInitExpr_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr_0_1_0_1")) return false;
    InvocationArgList(b, l + 1);
    return true;
  }

  // new UserDefineTypeName LEFT_PARENTHESIS InvocationArgList? RIGHT_PARENTHESIS
  private static boolean TypeInitExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && UserDefineTypeName(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && TypeInitExpr_1_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // InvocationArgList?
  private static boolean TypeInitExpr_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpr_1_3")) return false;
    InvocationArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NameReference
  public static boolean UserDefineTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefineTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USER_DEFINE_TYPE_NAME, "<user define type name>");
    r = NameReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // TypeName identifier ((ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression))? SEMICOLON
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

  // ((ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression))?
  private static boolean VariableDefinitionStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2")) return false;
    VariableDefinitionStatement_2_0(b, l + 1);
    return true;
  }

  // (ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression)
  private static boolean VariableDefinitionStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = VariableDefinitionStatement_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && VariableDefinitionStatement_2_0_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ASSIGN | SAFE_ASSIGNMENT
  private static boolean VariableDefinitionStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, SAFE_ASSIGNMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ActionInvocation | Expression
  private static boolean VariableDefinitionStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ActionInvocation(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeName identifier ((ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression))? SEMICOLON
  public static boolean VariableDefinitionStatementInService(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatementInService")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION_STATEMENT_IN_SERVICE, "<variable definition statement in service>");
    r = TypeName(b, l + 1, -1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && VariableDefinitionStatementInService_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression))?
  private static boolean VariableDefinitionStatementInService_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatementInService_2")) return false;
    VariableDefinitionStatementInService_2_0(b, l + 1);
    return true;
  }

  // (ASSIGN | SAFE_ASSIGNMENT) (ActionInvocation | Expression)
  private static boolean VariableDefinitionStatementInService_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatementInService_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinitionStatementInService_2_0_0(b, l + 1);
    r = r && VariableDefinitionStatementInService_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASSIGN | SAFE_ASSIGNMENT
  private static boolean VariableDefinitionStatementInService_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatementInService_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, SAFE_ASSIGNMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ActionInvocation | Expression
  private static boolean VariableDefinitionStatementInService_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatementInService_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ActionInvocation(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference (COMMA VariableReference)*
  public static boolean VariableReferenceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_REFERENCE_LIST, "<variable reference list>");
    r = VariableReference(b, l + 1, -1);
    r = r && VariableReferenceList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_BRACE);
    r = r && Block(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // worker identifier LEFT_BRACE Block RIGHT_BRACE
  public static boolean WorkerDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkerDefinition")) return false;
    if (!nextTokenIs(b, WORKER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WORKER_DEFINITION, null);
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
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTE (XML_DOUBLE_QUOTED_TEMPLATE_STRING Expression EXPRESSION_END)* XML_DOUBLE_QUOTED_STRING_SEQUENCE? DOUBLE_QUOTE_END
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

  // (XML_DOUBLE_QUOTED_TEMPLATE_STRING Expression EXPRESSION_END)*
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

  // XML_DOUBLE_QUOTED_TEMPLATE_STRING Expression EXPRESSION_END
  private static boolean XmlDoubleQuotedString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlDoubleQuotedString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_DOUBLE_QUOTED_TEMPLATE_STRING);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // XML_DOUBLE_QUOTED_STRING_SEQUENCE?
  private static boolean XmlDoubleQuotedString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlDoubleQuotedString_2")) return false;
    consumeToken(b, XML_DOUBLE_QUOTED_STRING_SEQUENCE);
    return true;
  }

  /* ********************************************************** */
  // Element | ProcIns | Comment | XmlText | cdata
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
  // XML_LITERAL_START XmlItem XML_LITERAL_END
  public static boolean XmlLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlLiteral")) return false;
    if (!nextTokenIs(b, XML_LITERAL_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, XML_LITERAL, null);
    r = consumeToken(b, XML_LITERAL_START);
    p = r; // pin = 1
    r = r && report_error_(b, XmlItem(b, l + 1));
    r = p && consumeToken(b, XML_LITERAL_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // QUOTED_STRING_LITERAL
  public static boolean XmlNamespaceName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlNamespaceName")) return false;
    if (!nextTokenIs(b, QUOTED_STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_STRING_LITERAL);
    exit_section_(b, m, XML_NAMESPACE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // (XML_QNAME QNAME_SEPARATOR)? XML_QNAME | XML_TAG_EXPRESSION_START Expression EXPRESSION_END
  public static boolean XmlQualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName")) return false;
    if (!nextTokenIs(b, "<xml qualified name>", XML_QNAME, XML_TAG_EXPRESSION_START)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XML_QUALIFIED_NAME, "<xml qualified name>");
    r = XmlQualifiedName_0(b, l + 1);
    if (!r) r = XmlQualifiedName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (XML_QNAME QNAME_SEPARATOR)? XML_QNAME
  private static boolean XmlQualifiedName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XmlQualifiedName_0_0(b, l + 1);
    r = r && consumeToken(b, XML_QNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // (XML_QNAME QNAME_SEPARATOR)?
  private static boolean XmlQualifiedName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_0_0")) return false;
    XmlQualifiedName_0_0_0(b, l + 1);
    return true;
  }

  // XML_QNAME QNAME_SEPARATOR
  private static boolean XmlQualifiedName_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XML_QNAME, QNAME_SEPARATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // XML_TAG_EXPRESSION_START Expression EXPRESSION_END
  private static boolean XmlQualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlQualifiedName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TAG_EXPRESSION_START);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
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
  // SINGLE_QUOTE (XML_SINGLE_QUOTED_TEMPLATE_STRING Expression EXPRESSION_END)* XML_SINGLE_QUOTED_STRING_SEQUENCE? SINGLE_QUOTE_END
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

  // (XML_SINGLE_QUOTED_TEMPLATE_STRING Expression EXPRESSION_END)*
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

  // XML_SINGLE_QUOTED_TEMPLATE_STRING Expression EXPRESSION_END
  private static boolean XmlSingleQuotedString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlSingleQuotedString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_SINGLE_QUOTED_TEMPLATE_STRING);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // XML_SINGLE_QUOTED_STRING_SEQUENCE?
  private static boolean XmlSingleQuotedString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlSingleQuotedString_2")) return false;
    consumeToken(b, XML_SINGLE_QUOTED_STRING_SEQUENCE);
    return true;
  }

  /* ********************************************************** */
  // (XML_TEMPLATE_TEXT Expression EXPRESSION_END)+ XML_TEXT_SEQUENCE? | XML_TEXT_SEQUENCE
  public static boolean XmlText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText")) return false;
    if (!nextTokenIs(b, "<xml text>", XML_TEMPLATE_TEXT, XML_TEXT_SEQUENCE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XML_TEXT, "<xml text>");
    r = XmlText_0(b, l + 1);
    if (!r) r = consumeToken(b, XML_TEXT_SEQUENCE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (XML_TEMPLATE_TEXT Expression EXPRESSION_END)+ XML_TEXT_SEQUENCE?
  private static boolean XmlText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XmlText_0_0(b, l + 1);
    r = r && XmlText_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (XML_TEMPLATE_TEXT Expression EXPRESSION_END)+
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

  // XML_TEMPLATE_TEXT Expression EXPRESSION_END
  private static boolean XmlText_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_TEMPLATE_TEXT);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, EXPRESSION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // XML_TEXT_SEQUENCE?
  private static boolean XmlText_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlText_0_1")) return false;
    consumeToken(b, XML_TEXT_SEQUENCE);
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
  // DEPRECATED_TEMPLATE_START deprecatedText? DEPRECATED_TEMPLATE_END
  public static boolean deprecatedAttachment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedAttachment")) return false;
    if (!nextTokenIs(b, DEPRECATED_TEMPLATE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATED_TEMPLATE_START);
    r = r && deprecatedAttachment_1(b, l + 1);
    r = r && consumeToken(b, DEPRECATED_TEMPLATE_END);
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
  // deprecatedTemplateInlineCode (DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode)*
  //                    | DEPRECATED_TEMPLATE_TEXT (DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode)*
  public static boolean deprecatedText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEPRECATED_TEXT, "<deprecated text>");
    r = deprecatedText_0(b, l + 1);
    if (!r) r = deprecatedText_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // deprecatedTemplateInlineCode (DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode)*
  private static boolean deprecatedText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deprecatedTemplateInlineCode(b, l + 1);
    r = r && deprecatedText_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode)*
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

  // DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode
  private static boolean deprecatedText_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATED_TEMPLATE_TEXT);
    if (!r) r = deprecatedTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEPRECATED_TEMPLATE_TEXT (DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode)*
  private static boolean deprecatedText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATED_TEMPLATE_TEXT);
    r = r && deprecatedText_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode)*
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

  // DEPRECATED_TEMPLATE_TEXT | deprecatedTemplateInlineCode
  private static boolean deprecatedText_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecatedText_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPRECATED_TEMPLATE_TEXT);
    if (!r) r = deprecatedTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // documentationTemplateInlineCode (DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode)*
  //             | DOCUMENTATION_TEMPLATE_TEXT  (DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode)*
  public static boolean docText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOC_TEXT, "<doc text>");
    r = docText_0(b, l + 1);
    if (!r) r = docText_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // documentationTemplateInlineCode (DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode)*
  private static boolean docText_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = documentationTemplateInlineCode(b, l + 1);
    r = r && docText_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode)*
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

  // DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode
  private static boolean docText_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATION_TEMPLATE_TEXT);
    if (!r) r = documentationTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOCUMENTATION_TEMPLATE_TEXT  (DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode)*
  private static boolean docText_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATION_TEMPLATE_TEXT);
    r = r && docText_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode)*
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

  // DOCUMENTATION_TEMPLATE_TEXT | documentationTemplateInlineCode
  private static boolean docText_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docText_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATION_TEMPLATE_TEXT);
    if (!r) r = documentationTemplateInlineCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCUMENTATION_TEMPLATE_START documentationTemplateContent? DOCUMENTATION_TEMPLATE_END
  public static boolean documentationAttachment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationAttachment")) return false;
    if (!nextTokenIs(b, DOCUMENTATION_TEMPLATE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOCUMENTATION_TEMPLATE_START);
    r = r && documentationAttachment_1(b, l + 1);
    r = r && consumeToken(b, DOCUMENTATION_TEMPLATE_END);
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
  // DOCUMENTATION_TEMPLATE_ATTRIBUTE_START identifier DOCUMENTATION_TEMPLATE_ATTRIBUTE_END docText?
  public static boolean documentationTemplateAttributeDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentationTemplateAttributeDescription")) return false;
    if (!nextTokenIs(b, DOCUMENTATION_TEMPLATE_ATTRIBUTE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCUMENTATION_TEMPLATE_ATTRIBUTE_START, IDENTIFIER, DOCUMENTATION_TEMPLATE_ATTRIBUTE_END);
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
  // DB_DEPRECATED_INLINE_CODE_START DOUBLE_BACK_TICK_INLINE_CODE? DOUBLE_BACK_TICK_INLINE_CODE_END
  public static boolean doubleBackTickDeprecatedInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDeprecatedInlineCode")) return false;
    if (!nextTokenIs(b, DB_DEPRECATED_INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DB_DEPRECATED_INLINE_CODE_START);
    r = r && doubleBackTickDeprecatedInlineCode_1(b, l + 1);
    r = r && consumeToken(b, DOUBLE_BACK_TICK_INLINE_CODE_END);
    exit_section_(b, m, DOUBLE_BACK_TICK_DEPRECATED_INLINE_CODE, r);
    return r;
  }

  // DOUBLE_BACK_TICK_INLINE_CODE?
  private static boolean doubleBackTickDeprecatedInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDeprecatedInlineCode_1")) return false;
    consumeToken(b, DOUBLE_BACK_TICK_INLINE_CODE);
    return true;
  }

  /* ********************************************************** */
  // DB_DOC_INLINE_CODE_START DOUBLE_BACK_TICK_INLINE_CODE? DOUBLE_BACK_TICK_INLINE_CODE_END
  public static boolean doubleBackTickDocInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDocInlineCode")) return false;
    if (!nextTokenIs(b, DB_DOC_INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DB_DOC_INLINE_CODE_START);
    r = r && doubleBackTickDocInlineCode_1(b, l + 1);
    r = r && consumeToken(b, DOUBLE_BACK_TICK_INLINE_CODE_END);
    exit_section_(b, m, DOUBLE_BACK_TICK_DOC_INLINE_CODE, r);
    return r;
  }

  // DOUBLE_BACK_TICK_INLINE_CODE?
  private static boolean doubleBackTickDocInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doubleBackTickDocInlineCode_1")) return false;
    consumeToken(b, DOUBLE_BACK_TICK_INLINE_CODE);
    return true;
  }

  /* ********************************************************** */
  // endpoint identifier (COMMA ParameterList)?
  public static boolean endpointParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endpointParameter")) return false;
    if (!nextTokenIs(b, ENDPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENDPOINT_PARAMETER, null);
    r = consumeTokens(b, 1, ENDPOINT, IDENTIFIER);
    p = r; // pin = 1
    r = r && endpointParameter_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA ParameterList)?
  private static boolean endpointParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endpointParameter_2")) return false;
    endpointParameter_2_0(b, l + 1);
    return true;
  }

  // COMMA ParameterList
  private static boolean endpointParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endpointParameter_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && ParameterList(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // fail SEMICOLON
  public static boolean failStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "failStatement")) return false;
    if (!nextTokenIs(b, FAIL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FAIL_STATEMENT, null);
    r = consumeTokens(b, 1, FAIL, SEMICOLON);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // namedPattern | unnamedPattern
  public static boolean matchPatternClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPatternClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_PATTERN_CLAUSE, "<match pattern clause>");
    r = namedPattern(b, l + 1);
    if (!r) r = unnamedPattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // match Expression LEFT_BRACE matchPatternClause+ RIGHT_BRACE
  public static boolean matchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchStatement")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MATCH_STATEMENT, null);
    r = consumeToken(b, MATCH);
    p = r; // pin = 1
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACE)) && r;
    r = p && report_error_(b, matchStatement_3(b, l + 1)) && r;
    r = p && consumeToken(b, RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // matchPatternClause+
  private static boolean matchStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchPatternClause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!matchPatternClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "matchStatement_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeName identifier EQUAL_GT (Statement | (LEFT_BRACE Statement+ RIGHT_BRACE))
  static boolean namedPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedPattern")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = TypeName(b, l + 1, -1);
    r = r && consumeTokens(b, 2, IDENTIFIER, EQUAL_GT);
    p = r; // pin = 3
    r = r && namedPattern_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement | (LEFT_BRACE Statement+ RIGHT_BRACE)
  private static boolean namedPattern_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedPattern_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    if (!r) r = namedPattern_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACE Statement+ RIGHT_BRACE
  private static boolean namedPattern_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedPattern_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && namedPattern_3_1_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement+
  private static boolean namedPattern_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedPattern_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namedPattern_3_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
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
  // endpointParameter | ParameterList
  public static boolean resourceParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resourceParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_PARAMETER_LIST, "<resource parameter list>");
    r = endpointParameter(b, l + 1);
    if (!r) r = ParameterList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SB_DEPRECATED_INLINE_CODE_START SINGLE_BACK_TICK_INLINE_CODE? SINGLE_BACK_TICK_INLINE_CODE_END
  public static boolean singleBackTickDeprecatedInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDeprecatedInlineCode")) return false;
    if (!nextTokenIs(b, SB_DEPRECATED_INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SB_DEPRECATED_INLINE_CODE_START);
    r = r && singleBackTickDeprecatedInlineCode_1(b, l + 1);
    r = r && consumeToken(b, SINGLE_BACK_TICK_INLINE_CODE_END);
    exit_section_(b, m, SINGLE_BACK_TICK_DEPRECATED_INLINE_CODE, r);
    return r;
  }

  // SINGLE_BACK_TICK_INLINE_CODE?
  private static boolean singleBackTickDeprecatedInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDeprecatedInlineCode_1")) return false;
    consumeToken(b, SINGLE_BACK_TICK_INLINE_CODE);
    return true;
  }

  /* ********************************************************** */
  // SB_DOC_INLINE_CODE_START SINGLE_BACK_TICK_INLINE_CODE? SINGLE_BACK_TICK_INLINE_CODE_END
  public static boolean singleBackTickDocInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDocInlineCode")) return false;
    if (!nextTokenIs(b, SB_DOC_INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SB_DOC_INLINE_CODE_START);
    r = r && singleBackTickDocInlineCode_1(b, l + 1);
    r = r && consumeToken(b, SINGLE_BACK_TICK_INLINE_CODE_END);
    exit_section_(b, m, SINGLE_BACK_TICK_DOC_INLINE_CODE, r);
    return r;
  }

  // SINGLE_BACK_TICK_INLINE_CODE?
  private static boolean singleBackTickDocInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleBackTickDocInlineCode_1")) return false;
    consumeToken(b, SINGLE_BACK_TICK_INLINE_CODE);
    return true;
  }

  /* ********************************************************** */
  // TB_DEPRECATED_INLINE_CODE_START TRIPLE_BACK_TICK_INLINE_CODE? TRIPLE_BACK_TICK_INLINE_CODE_END
  public static boolean tripleBackTickDeprecatedInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDeprecatedInlineCode")) return false;
    if (!nextTokenIs(b, TB_DEPRECATED_INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TB_DEPRECATED_INLINE_CODE_START);
    r = r && tripleBackTickDeprecatedInlineCode_1(b, l + 1);
    r = r && consumeToken(b, TRIPLE_BACK_TICK_INLINE_CODE_END);
    exit_section_(b, m, TRIPLE_BACK_TICK_DEPRECATED_INLINE_CODE, r);
    return r;
  }

  // TRIPLE_BACK_TICK_INLINE_CODE?
  private static boolean tripleBackTickDeprecatedInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDeprecatedInlineCode_1")) return false;
    consumeToken(b, TRIPLE_BACK_TICK_INLINE_CODE);
    return true;
  }

  /* ********************************************************** */
  // TB_DOC_INLINE_CODE_START TRIPLE_BACK_TICK_INLINE_CODE? TRIPLE_BACK_TICK_INLINE_CODE_END
  public static boolean tripleBackTickDocInlineCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDocInlineCode")) return false;
    if (!nextTokenIs(b, TB_DOC_INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TB_DOC_INLINE_CODE_START);
    r = r && tripleBackTickDocInlineCode_1(b, l + 1);
    r = r && consumeToken(b, TRIPLE_BACK_TICK_INLINE_CODE_END);
    exit_section_(b, m, TRIPLE_BACK_TICK_DOC_INLINE_CODE, r);
    return r;
  }

  // TRIPLE_BACK_TICK_INLINE_CODE?
  private static boolean tripleBackTickDocInlineCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleBackTickDocInlineCode_1")) return false;
    consumeToken(b, TRIPLE_BACK_TICK_INLINE_CODE);
    return true;
  }

  /* ********************************************************** */
  // var? LEFT_PARENTHESIS VariableReferenceList RIGHT_PARENTHESIS ASSIGN (ActionInvocation | Expression) SEMICOLON
  //                                 | LEFT_PARENTHESIS ParameterList RIGHT_PARENTHESIS ASSIGN (ActionInvocation | Expression) SEMICOLON
  public static boolean tupleDestructuringStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleDestructuringStatement")) return false;
    if (!nextTokenIs(b, "<tuple destructuring statement>", LEFT_PARENTHESIS, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_DESTRUCTURING_STATEMENT, "<tuple destructuring statement>");
    r = tupleDestructuringStatement_0(b, l + 1);
    if (!r) r = tupleDestructuringStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var? LEFT_PARENTHESIS VariableReferenceList RIGHT_PARENTHESIS ASSIGN (ActionInvocation | Expression) SEMICOLON
  private static boolean tupleDestructuringStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleDestructuringStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tupleDestructuringStatement_0_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && VariableReferenceList(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, ASSIGN);
    r = r && tupleDestructuringStatement_0_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // var?
  private static boolean tupleDestructuringStatement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleDestructuringStatement_0_0")) return false;
    consumeToken(b, VAR);
    return true;
  }

  // ActionInvocation | Expression
  private static boolean tupleDestructuringStatement_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleDestructuringStatement_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ActionInvocation(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PARENTHESIS ParameterList RIGHT_PARENTHESIS ASSIGN (ActionInvocation | Expression) SEMICOLON
  private static boolean tupleDestructuringStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleDestructuringStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && ParameterList(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, ASSIGN);
    r = r && tupleDestructuringStatement_1_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ActionInvocation | Expression
  private static boolean tupleDestructuringStatement_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleDestructuringStatement_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ActionInvocation(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeName EQUAL_GT (Statement | (LEFT_BRACE Statement+ RIGHT_BRACE))
  static boolean unnamedPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unnamedPattern")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = TypeName(b, l + 1, -1);
    r = r && consumeToken(b, EQUAL_GT);
    p = r; // pin = 2
    r = r && unnamedPattern_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Statement | (LEFT_BRACE Statement+ RIGHT_BRACE)
  private static boolean unnamedPattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unnamedPattern_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    if (!r) r = unnamedPattern_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACE Statement+ RIGHT_BRACE
  private static boolean unnamedPattern_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unnamedPattern_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && unnamedPattern_2_1_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement+
  private static boolean unnamedPattern_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unnamedPattern_2_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unnamedPattern_2_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: ATOM(SimpleLiteralExpression)
  // 1: ATOM(StringTemplateLiteralExpression)
  // 2: ATOM(XmlLiteralExpression)
  // 3: ATOM(RecordLiteralExpression)
  // 4: ATOM(BracedOrTupleExpression)
  // 5: BINARY(TernaryExpression)
  // 6: ATOM(ArrayLiteralExpression)
  // 7: ATOM(ValueTypeTypeExpression)
  // 8: ATOM(BuiltInReferenceTypeTypeExpression)
  // 9: ATOM(VariableReferenceExpression)
  // 10: ATOM(LambdaFunctionExpression)
  // 11: ATOM(TypeInitExpression)
  // 12: ATOM(TypeConversionExpression)
  // 13: ATOM(TypeAccessExpression)
  // 14: ATOM(UnaryExpression)
  // 15: BINARY(BinaryPowExpression)
  // 16: BINARY(BinaryDivMulModExpression)
  // 17: BINARY(BinaryAddSubExpression)
  // 18: BINARY(BinaryCompareExpression)
  // 19: BINARY(BinaryEqualExpression)
  // 20: BINARY(BinaryAndExpression)
  // 21: BINARY(BinaryOrExpression)
  // 22: PREFIX(AwaitExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = SimpleLiteralExpression(b, l + 1);
    if (!r) r = StringTemplateLiteralExpression(b, l + 1);
    if (!r) r = XmlLiteralExpression(b, l + 1);
    if (!r) r = RecordLiteralExpression(b, l + 1);
    if (!r) r = BracedOrTupleExpression(b, l + 1);
    if (!r) r = ArrayLiteralExpression(b, l + 1);
    if (!r) r = ValueTypeTypeExpression(b, l + 1);
    if (!r) r = BuiltInReferenceTypeTypeExpression(b, l + 1);
    if (!r) r = VariableReferenceExpression(b, l + 1);
    if (!r) r = LambdaFunctionExpression(b, l + 1);
    if (!r) r = TypeInitExpression(b, l + 1);
    if (!r) r = TypeConversionExpression(b, l + 1);
    if (!r) r = TypeAccessExpression(b, l + 1);
    if (!r) r = UnaryExpression(b, l + 1);
    if (!r) r = AwaitExpression(b, l + 1);
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
      if (g < 5 && consumeTokenSmart(b, QUESTION_MARK)) {
        r = report_error_(b, Expression(b, l, 5));
        r = TernaryExpression_1(b, l + 1) && r;
        exit_section_(b, l, m, TERNARY_EXPRESSION, r, true, null);
      }
      else if (g < 15 && consumeTokenSmart(b, POW)) {
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
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // SimpleLiteral
  public static boolean SimpleLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLiteralExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_LITERAL_EXPRESSION, "<simple literal expression>");
    r = SimpleLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // StringTemplateLiteral
  public static boolean StringTemplateLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringTemplateLiteralExpression")) return false;
    if (!nextTokenIsSmart(b, STRING_TEMPLATE_LITERAL_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringTemplateLiteral(b, l + 1);
    exit_section_(b, m, STRING_TEMPLATE_LITERAL_EXPRESSION, r);
    return r;
  }

  // XmlLiteral
  public static boolean XmlLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XmlLiteralExpression")) return false;
    if (!nextTokenIsSmart(b, XML_LITERAL_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XmlLiteral(b, l + 1);
    exit_section_(b, m, XML_LITERAL_EXPRESSION, r);
    return r;
  }

  // RecordLiteral
  public static boolean RecordLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordLiteralExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordLiteral(b, l + 1);
    exit_section_(b, m, RECORD_LITERAL_EXPRESSION, r);
    return r;
  }

  // LEFT_PARENTHESIS Expression (COMMA Expression)* RIGHT_PARENTHESIS
  public static boolean BracedOrTupleExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BracedOrTupleExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && BracedOrTupleExpression_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, BRACED_OR_TUPLE_EXPRESSION, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean BracedOrTupleExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BracedOrTupleExpression_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BracedOrTupleExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BracedOrTupleExpression_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Expression
  private static boolean BracedOrTupleExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BracedOrTupleExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && Expression(b, l + 1, -1);
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

  // ArrayLiteral
  public static boolean ArrayLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteralExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayLiteral(b, l + 1);
    exit_section_(b, m, ARRAY_LITERAL_EXPRESSION, r);
    return r;
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
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_REFERENCE_EXPRESSION, "<variable reference expression>");
    r = VariableReference(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
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

  // TypeInitExpr
  public static boolean TypeInitExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeInitExpression")) return false;
    if (!nextTokenIsSmart(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeInitExpr(b, l + 1);
    exit_section_(b, m, TYPE_INIT_EXPRESSION, r);
    return r;
  }

  // LT TypeName (COMMA FunctionInvocation)? GT Expression
  public static boolean TypeConversionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression")) return false;
    if (!nextTokenIsSmart(b, LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CONVERSION_EXPRESSION, null);
    r = consumeTokenSmart(b, LT);
    p = r; // pin = 1
    r = r && report_error_(b, TypeName(b, l + 1, -1));
    r = p && report_error_(b, TypeConversionExpression_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, GT)) && r;
    r = p && Expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA FunctionInvocation)?
  private static boolean TypeConversionExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression_2")) return false;
    TypeConversionExpression_2_0(b, l + 1);
    return true;
  }

  // COMMA FunctionInvocation
  private static boolean TypeConversionExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeConversionExpression_2_0")) return false;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ACCESS_EXPRESSION, null);
    r = consumeTokenSmart(b, TYPEOF);
    p = r; // pin = 1
    r = r && BuiltInTypeName(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ADD | SUB | NOT | lengthof | typeof | untaint) Expression
  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, UNARY_EXPRESSION, "<unary expression>");
    r = UnaryExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ADD | SUB | NOT | lengthof | typeof | untaint
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ADD);
    if (!r) r = consumeTokenSmart(b, SUB);
    if (!r) r = consumeTokenSmart(b, NOT);
    if (!r) r = consumeTokenSmart(b, LENGTHOF);
    if (!r) r = consumeTokenSmart(b, TYPEOF);
    if (!r) r = consumeTokenSmart(b, UNTAINT);
    exit_section_(b, m, null, r);
    return r;
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

  public static boolean AwaitExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AwaitExpression")) return false;
    if (!nextTokenIsSmart(b, AWAIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, AWAIT);
    p = r;
    r = p && Expression(b, l, -1);
    exit_section_(b, l, m, AWAIT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Expression root: TypeName
  // Operator priority table:
  // 0: ATOM(TupleTypeName)
  // 1: PREFIX(GroupTypeName)
  // 2: N_ARY(UnionTypeName)
  // 3: ATOM(ObjectTypeName)
  // 4: POSTFIX(ArrayTypeName)
  // 5: ATOM(SimpleTypeName)
  // 6: PREFIX(AnnotatedTypeName)
  // 7: POSTFIX(NullableTypeName)
  public static boolean TypeName(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    addVariant(b, "<type name>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type name>");
    r = TupleTypeName(b, l + 1);
    if (!r) r = GroupTypeName(b, l + 1);
    if (!r) r = ObjectTypeName(b, l + 1);
    if (!r) r = SimpleTypeName(b, l + 1);
    if (!r) r = AnnotatedTypeName(b, l + 1);
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
      if (g < 2 && consumeTokenSmart(b, PIPE)) {
        while (true) {
          r = report_error_(b, TypeName(b, l, 2));
          if (!consumeTokenSmart(b, PIPE)) break;
        }
        exit_section_(b, l, m, UNION_TYPE_NAME, r, true, null);
      }
      else if (g < 4 && ArrayTypeName_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARRAY_TYPE_NAME, r, true, null);
      }
      else if (g < 7 && parseTokensSmart(b, 0, PIPE, NULL_LITERAL)) {
        r = true;
        exit_section_(b, l, m, NULLABLE_TYPE_NAME, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // LEFT_PARENTHESIS TypeName (COMMA TypeName)* RIGHT_PARENTHESIS
  public static boolean TupleTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleTypeName")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    r = r && TypeName(b, l + 1, -1);
    r = r && TupleTypeName_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, TUPLE_TYPE_NAME, r);
    return r;
  }

  // (COMMA TypeName)*
  private static boolean TupleTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleTypeName_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TupleTypeName_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleTypeName_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA TypeName
  private static boolean TupleTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleTypeName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && TypeName(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean GroupTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupTypeName")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    p = r;
    r = p && TypeName(b, l, 1);
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    exit_section_(b, l, m, GROUP_TYPE_NAME, r, p, null);
    return r || p;
  }

  // object LEFT_BRACE ObjectBody RIGHT_BRACE
  public static boolean ObjectTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectTypeName")) return false;
    if (!nextTokenIsSmart(b, OBJECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, OBJECT, LEFT_BRACE);
    r = r && ObjectBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, OBJECT_TYPE_NAME, r);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean ArrayTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayTypeName_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ArrayTypeName_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayTypeName_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean ArrayTypeName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // NULL_LITERAL
  //                    | AnyTypeName
  //                    | TypeDescTypeName
  //                    | ValueTypeName
  //                    | ReferenceTypeName
  public static boolean SimpleTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_TYPE_NAME, "<simple type name>");
    r = consumeTokenSmart(b, NULL_LITERAL);
    if (!r) r = AnyTypeName(b, l + 1);
    if (!r) r = TypeDescTypeName(b, l + 1);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = ReferenceTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  public static boolean AnnotatedTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotatedTypeName")) return false;
    if (!nextTokenIsSmart(b, AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = AnnotatedTypeName_0(b, l + 1);
    p = r;
    r = p && TypeName(b, l, 4);
    exit_section_(b, l, m, ANNOTATED_TYPE_NAME, r, p, null);
    return r || p;
  }

  // AnnotationAttachment+
  private static boolean AnnotatedTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnnotatedTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnnotationAttachment(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!AnnotationAttachment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AnnotatedTypeName_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: VariableReference
  // Operator priority table:
  // 0: POSTFIX(MapArrayVariableReference)
  // 1: POSTFIX(InvocationReference)
  // 2: POSTFIX(FieldVariableReference)
  // 3: POSTFIX(XmlAttribVariableReference)
  // 4: ATOM(FunctionInvocationReference)
  // 5: ATOM(SimpleVariableReference)
  // 6: ATOM(AwaitExpressionReference)
  public static boolean VariableReference(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "VariableReference")) return false;
    addVariant(b, "<variable reference>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<variable reference>");
    r = FunctionInvocationReference(b, l + 1);
    if (!r) r = SimpleVariableReference(b, l + 1);
    if (!r) r = AwaitExpressionReference(b, l + 1);
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
      if (g < 0 && Index(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MAP_ARRAY_VARIABLE_REFERENCE, r, true, null);
      }
      else if (g < 1 && Invocation(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INVOCATION_REFERENCE, r, true, null);
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
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION_REFERENCE, "<function invocation reference>");
    r = FunctionInvocation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NameReference
  public static boolean SimpleVariableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleVariableReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_VARIABLE_REFERENCE, "<simple variable reference>");
    r = NameReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AwaitExpression
  public static boolean AwaitExpressionReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AwaitExpressionReference")) return false;
    if (!nextTokenIsSmart(b, AWAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AwaitExpression(b, l + 1);
    exit_section_(b, m, AWAIT_EXPRESSION_REFERENCE, r);
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
