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

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class BallerinaVisitor extends PsiElementVisitor {

  public void visitAbortStatement(@NotNull BallerinaAbortStatement o) {
    visitCompositeElement(o);
  }

  public void visitActionInvocation(@NotNull BallerinaActionInvocation o) {
    visitCompositeElement(o);
  }

  public void visitAlias(@NotNull BallerinaAlias o) {
    visitNamedElement(o);
  }

  public void visitAnnotationAttachment(@NotNull BallerinaAnnotationAttachment o) {
    visitCompositeElement(o);
  }

  public void visitAnnotationDefinition(@NotNull BallerinaAnnotationDefinition o) {
    visitNamedElement(o);
  }

  public void visitAnonStructTypeName(@NotNull BallerinaAnonStructTypeName o) {
    visitCompositeElement(o);
  }

  public void visitAnyIdentifierName(@NotNull BallerinaAnyIdentifierName o) {
    visitCompositeElement(o);
  }

  public void visitAnyTypeName(@NotNull BallerinaAnyTypeName o) {
    visitCompositeElement(o);
  }

  public void visitArrayLiteral(@NotNull BallerinaArrayLiteral o) {
    visitCompositeElement(o);
  }

  public void visitArrayLiteralExpression(@NotNull BallerinaArrayLiteralExpression o) {
    visitExpression(o);
  }

  public void visitArrayTypeName(@NotNull BallerinaArrayTypeName o) {
    visitTypeName(o);
  }

  public void visitAssignmentStatement(@NotNull BallerinaAssignmentStatement o) {
    visitCompositeElement(o);
  }

  public void visitAttachmentPoint(@NotNull BallerinaAttachmentPoint o) {
    visitCompositeElement(o);
  }

  public void visitAttribute(@NotNull BallerinaAttribute o) {
    visitCompositeElement(o);
  }

  public void visitAwaitExpression(@NotNull BallerinaAwaitExpression o) {
    visitExpression(o);
  }

  public void visitAwaitExpressionReference(@NotNull BallerinaAwaitExpressionReference o) {
    visitVariableReference(o);
  }

  public void visitBinaryAddSubExpression(@NotNull BallerinaBinaryAddSubExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBinaryAndExpression(@NotNull BallerinaBinaryAndExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBinaryCompareExpression(@NotNull BallerinaBinaryCompareExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBinaryDivMulModExpression(@NotNull BallerinaBinaryDivMulModExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBinaryEqualExpression(@NotNull BallerinaBinaryEqualExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBinaryExpression(@NotNull BallerinaBinaryExpression o) {
    visitExpression(o);
  }

  public void visitBinaryOrExpression(@NotNull BallerinaBinaryOrExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBinaryPowExpression(@NotNull BallerinaBinaryPowExpression o) {
    visitBinaryExpression(o);
  }

  public void visitBlock(@NotNull BallerinaBlock o) {
    visitCompositeElement(o);
  }

  public void visitBracedOrTupleExpression(@NotNull BallerinaBracedOrTupleExpression o) {
    visitExpression(o);
  }

  public void visitBreakStatement(@NotNull BallerinaBreakStatement o) {
    visitCompositeElement(o);
  }

  public void visitBuiltInReferenceTypeName(@NotNull BallerinaBuiltInReferenceTypeName o) {
    visitCompositeElement(o);
  }

  public void visitBuiltInReferenceTypeTypeExpression(@NotNull BallerinaBuiltInReferenceTypeTypeExpression o) {
    visitExpression(o);
  }

  public void visitBuiltInTypeName(@NotNull BallerinaBuiltInTypeName o) {
    visitCompositeElement(o);
  }

  public void visitCallableUnitBody(@NotNull BallerinaCallableUnitBody o) {
    visitCompositeElement(o);
  }

  public void visitCallableUnitSignature(@NotNull BallerinaCallableUnitSignature o) {
    visitCompositeElement(o);
  }

  public void visitCatchClause(@NotNull BallerinaCatchClause o) {
    visitCompositeElement(o);
  }

  public void visitCatchClauses(@NotNull BallerinaCatchClauses o) {
    visitCompositeElement(o);
  }

  public void visitCloseTag(@NotNull BallerinaCloseTag o) {
    visitCompositeElement(o);
  }

  public void visitComment(@NotNull BallerinaComment o) {
    visitCompositeElement(o);
  }

  public void visitCompletePackageName(@NotNull BallerinaCompletePackageName o) {
    visitCompositeElement(o);
  }

  public void visitCompoundAssignmentStatement(@NotNull BallerinaCompoundAssignmentStatement o) {
    visitCompositeElement(o);
  }

  public void visitCompoundOperator(@NotNull BallerinaCompoundOperator o) {
    visitCompositeElement(o);
  }

  public void visitConstantDefinition(@NotNull BallerinaConstantDefinition o) {
    visitNamedElement(o);
  }

  public void visitContent(@NotNull BallerinaContent o) {
    visitCompositeElement(o);
  }

  public void visitDefaultableParameter(@NotNull BallerinaDefaultableParameter o) {
    visitCompositeElement(o);
  }

  public void visitDefinition(@NotNull BallerinaDefinition o) {
    visitCompositeElement(o);
  }

  public void visitElement(@NotNull BallerinaElement o) {
    visitCompositeElement(o);
  }

  public void visitElseClause(@NotNull BallerinaElseClause o) {
    visitCompositeElement(o);
  }

  public void visitElseIfClause(@NotNull BallerinaElseIfClause o) {
    visitCompositeElement(o);
  }

  public void visitEmptyTag(@NotNull BallerinaEmptyTag o) {
    visitCompositeElement(o);
  }

  public void visitEndpointDefinition(@NotNull BallerinaEndpointDefinition o) {
    visitNamedElement(o);
  }

  public void visitEndpointInitlization(@NotNull BallerinaEndpointInitlization o) {
    visitCompositeElement(o);
  }

  public void visitEndpointType(@NotNull BallerinaEndpointType o) {
    visitCompositeElement(o);
  }

  public void visitEnumBody(@NotNull BallerinaEnumBody o) {
    visitCompositeElement(o);
  }

  public void visitEnumDefinition(@NotNull BallerinaEnumDefinition o) {
    visitNamedElement(o);
  }

  public void visitEnumerator(@NotNull BallerinaEnumerator o) {
    visitNamedElement(o);
  }

  public void visitExpression(@NotNull BallerinaExpression o) {
    visitCompositeElement(o);
  }

  public void visitExpressionList(@NotNull BallerinaExpressionList o) {
    visitCompositeElement(o);
  }

  public void visitExpressionStmt(@NotNull BallerinaExpressionStmt o) {
    visitCompositeElement(o);
  }

  public void visitField(@NotNull BallerinaField o) {
    visitNamedElement(o);
  }

  public void visitFieldDefinition(@NotNull BallerinaFieldDefinition o) {
    visitNamedElement(o);
  }

  public void visitFieldVariableReference(@NotNull BallerinaFieldVariableReference o) {
    visitVariableReference(o);
  }

  public void visitFinallyClause(@NotNull BallerinaFinallyClause o) {
    visitCompositeElement(o);
  }

  public void visitForeachStatement(@NotNull BallerinaForeachStatement o) {
    visitCompositeElement(o);
  }

  public void visitForkJoinStatement(@NotNull BallerinaForkJoinStatement o) {
    visitCompositeElement(o);
  }

  public void visitForkStatementBody(@NotNull BallerinaForkStatementBody o) {
    visitCompositeElement(o);
  }

  public void visitFormalParameterList(@NotNull BallerinaFormalParameterList o) {
    visitCompositeElement(o);
  }

  public void visitFunctionDefinition(@NotNull BallerinaFunctionDefinition o) {
    visitNamedElement(o);
  }

  public void visitFunctionInvocation(@NotNull BallerinaFunctionInvocation o) {
    visitCompositeElement(o);
  }

  public void visitFunctionInvocationReference(@NotNull BallerinaFunctionInvocationReference o) {
    visitVariableReference(o);
  }

  public void visitFunctionTypeName(@NotNull BallerinaFunctionTypeName o) {
    visitCompositeElement(o);
  }

  public void visitFutureTypeName(@NotNull BallerinaFutureTypeName o) {
    visitCompositeElement(o);
  }

  public void visitGlobalEndpointDefinition(@NotNull BallerinaGlobalEndpointDefinition o) {
    visitNamedElement(o);
  }

  public void visitGlobalVariableDefinition(@NotNull BallerinaGlobalVariableDefinition o) {
    visitNamedElement(o);
  }

  public void visitGroupTypeName(@NotNull BallerinaGroupTypeName o) {
    visitTypeName(o);
  }

  public void visitIfClause(@NotNull BallerinaIfClause o) {
    visitCompositeElement(o);
  }

  public void visitIfElseStatement(@NotNull BallerinaIfElseStatement o) {
    visitCompositeElement(o);
  }

  public void visitImportDeclaration(@NotNull BallerinaImportDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitIndex(@NotNull BallerinaIndex o) {
    visitCompositeElement(o);
  }

  public void visitIntRangeExpression(@NotNull BallerinaIntRangeExpression o) {
    visitCompositeElement(o);
  }

  public void visitIntegerLiteral(@NotNull BallerinaIntegerLiteral o) {
    visitCompositeElement(o);
  }

  public void visitInvocation(@NotNull BallerinaInvocation o) {
    visitCompositeElement(o);
  }

  public void visitInvocationArg(@NotNull BallerinaInvocationArg o) {
    visitCompositeElement(o);
  }

  public void visitInvocationArgList(@NotNull BallerinaInvocationArgList o) {
    visitCompositeElement(o);
  }

  public void visitInvocationReference(@NotNull BallerinaInvocationReference o) {
    visitVariableReference(o);
  }

  public void visitJoinClause(@NotNull BallerinaJoinClause o) {
    visitCompositeElement(o);
  }

  public void visitJoinClauseBody(@NotNull BallerinaJoinClauseBody o) {
    visitCompositeElement(o);
  }

  public void visitJoinConditions(@NotNull BallerinaJoinConditions o) {
    visitCompositeElement(o);
  }

  public void visitJsonTypeName(@NotNull BallerinaJsonTypeName o) {
    visitCompositeElement(o);
  }

  public void visitLambdaFunction(@NotNull BallerinaLambdaFunction o) {
    visitCompositeElement(o);
  }

  public void visitLambdaFunctionExpression(@NotNull BallerinaLambdaFunctionExpression o) {
    visitExpression(o);
  }

  public void visitLockStatement(@NotNull BallerinaLockStatement o) {
    visitCompositeElement(o);
  }

  public void visitMapArrayVariableReference(@NotNull BallerinaMapArrayVariableReference o) {
    visitVariableReference(o);
  }

  public void visitMapTypeName(@NotNull BallerinaMapTypeName o) {
    visitCompositeElement(o);
  }

  public void visitNameReference(@NotNull BallerinaNameReference o) {
    visitNamedElement(o);
    // visitReferenceExpressionBase(o);
  }

  public void visitNamedArgs(@NotNull BallerinaNamedArgs o) {
    visitCompositeElement(o);
  }

  public void visitNamespaceDeclaration(@NotNull BallerinaNamespaceDeclaration o) {
    visitNamedElement(o);
  }

  public void visitNamespaceDeclarationStatement(@NotNull BallerinaNamespaceDeclarationStatement o) {
    visitCompositeElement(o);
  }

  public void visitNextStatement(@NotNull BallerinaNextStatement o) {
    visitCompositeElement(o);
  }

  public void visitNullableTypeName(@NotNull BallerinaNullableTypeName o) {
    visitTypeName(o);
  }

  public void visitObjectBody(@NotNull BallerinaObjectBody o) {
    visitCompositeElement(o);
  }

  public void visitObjectCallableUnitSignature(@NotNull BallerinaObjectCallableUnitSignature o) {
    visitCompositeElement(o);
  }

  public void visitObjectDefaultableParameter(@NotNull BallerinaObjectDefaultableParameter o) {
    visitCompositeElement(o);
  }

  public void visitObjectFieldDefinition(@NotNull BallerinaObjectFieldDefinition o) {
    visitCompositeElement(o);
  }

  public void visitObjectFunctionDefinition(@NotNull BallerinaObjectFunctionDefinition o) {
    visitCompositeElement(o);
  }

  public void visitObjectFunctions(@NotNull BallerinaObjectFunctions o) {
    visitCompositeElement(o);
  }

  public void visitObjectInitializer(@NotNull BallerinaObjectInitializer o) {
    visitCompositeElement(o);
  }

  public void visitObjectInitializerParameterList(@NotNull BallerinaObjectInitializerParameterList o) {
    visitCompositeElement(o);
  }

  public void visitObjectParameter(@NotNull BallerinaObjectParameter o) {
    visitCompositeElement(o);
  }

  public void visitObjectParameterList(@NotNull BallerinaObjectParameterList o) {
    visitCompositeElement(o);
  }

  public void visitObjectTypeName(@NotNull BallerinaObjectTypeName o) {
    visitTypeName(o);
  }

  public void visitOnabortStatement(@NotNull BallerinaOnabortStatement o) {
    visitCompositeElement(o);
  }

  public void visitOncommitStatement(@NotNull BallerinaOncommitStatement o) {
    visitCompositeElement(o);
  }

  public void visitOnretryClause(@NotNull BallerinaOnretryClause o) {
    visitCompositeElement(o);
  }

  public void visitOrgName(@NotNull BallerinaOrgName o) {
    visitNamedElement(o);
  }

  public void visitPackageDeclaration(@NotNull BallerinaPackageDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitPackageName(@NotNull BallerinaPackageName o) {
    visitNamedElement(o);
  }

  public void visitPackageReference(@NotNull BallerinaPackageReference o) {
    visitNamedElement(o);
  }

  public void visitPackageVersion(@NotNull BallerinaPackageVersion o) {
    visitNamedElement(o);
  }

  public void visitParameter(@NotNull BallerinaParameter o) {
    visitCompositeElement(o);
  }

  public void visitParameterList(@NotNull BallerinaParameterList o) {
    visitCompositeElement(o);
  }

  public void visitParameterTypeNameList(@NotNull BallerinaParameterTypeNameList o) {
    visitCompositeElement(o);
  }

  public void visitPostArithmeticOperator(@NotNull BallerinaPostArithmeticOperator o) {
    visitCompositeElement(o);
  }

  public void visitPostIncrementStatement(@NotNull BallerinaPostIncrementStatement o) {
    visitCompositeElement(o);
  }

  public void visitPrivateObjectFields(@NotNull BallerinaPrivateObjectFields o) {
    visitCompositeElement(o);
  }

  public void visitPrivateStructBody(@NotNull BallerinaPrivateStructBody o) {
    visitCompositeElement(o);
  }

  public void visitProcIns(@NotNull BallerinaProcIns o) {
    visitCompositeElement(o);
  }

  public void visitPublicObjectFields(@NotNull BallerinaPublicObjectFields o) {
    visitCompositeElement(o);
  }

  public void visitRecordKey(@NotNull BallerinaRecordKey o) {
    visitCompositeElement(o);
  }

  public void visitRecordKeyValue(@NotNull BallerinaRecordKeyValue o) {
    visitCompositeElement(o);
  }

  public void visitRecordLiteral(@NotNull BallerinaRecordLiteral o) {
    visitCompositeElement(o);
  }

  public void visitRecordLiteralBody(@NotNull BallerinaRecordLiteralBody o) {
    visitCompositeElement(o);
  }

  public void visitRecordLiteralExpression(@NotNull BallerinaRecordLiteralExpression o) {
    visitExpression(o);
  }

  public void visitReferenceTypeName(@NotNull BallerinaReferenceTypeName o) {
    visitCompositeElement(o);
  }

  public void visitReservedWord(@NotNull BallerinaReservedWord o) {
    visitCompositeElement(o);
  }

  public void visitResourceDefinition(@NotNull BallerinaResourceDefinition o) {
    visitCompositeElement(o);
  }

  public void visitRestArgs(@NotNull BallerinaRestArgs o) {
    visitCompositeElement(o);
  }

  public void visitRestParameter(@NotNull BallerinaRestParameter o) {
    visitCompositeElement(o);
  }

  public void visitRetriesStatement(@NotNull BallerinaRetriesStatement o) {
    visitCompositeElement(o);
  }

  public void visitReturnParameter(@NotNull BallerinaReturnParameter o) {
    visitCompositeElement(o);
  }

  public void visitReturnStatement(@NotNull BallerinaReturnStatement o) {
    visitCompositeElement(o);
  }

  public void visitReturnType(@NotNull BallerinaReturnType o) {
    visitCompositeElement(o);
  }

  public void visitServiceBody(@NotNull BallerinaServiceBody o) {
    visitCompositeElement(o);
  }

  public void visitServiceDefinition(@NotNull BallerinaServiceDefinition o) {
    visitCompositeElement(o);
  }

  public void visitServiceEndpointAttachments(@NotNull BallerinaServiceEndpointAttachments o) {
    visitCompositeElement(o);
  }

  public void visitSimpleLiteral(@NotNull BallerinaSimpleLiteral o) {
    visitCompositeElement(o);
  }

  public void visitSimpleLiteralExpression(@NotNull BallerinaSimpleLiteralExpression o) {
    visitExpression(o);
  }

  public void visitSimpleTypeName(@NotNull BallerinaSimpleTypeName o) {
    visitTypeName(o);
  }

  public void visitSimpleVariableReference(@NotNull BallerinaSimpleVariableReference o) {
    visitVariableReference(o);
  }

  public void visitStartTag(@NotNull BallerinaStartTag o) {
    visitCompositeElement(o);
  }

  public void visitStatement(@NotNull BallerinaStatement o) {
    visitCompositeElement(o);
  }

  public void visitStreamTypeName(@NotNull BallerinaStreamTypeName o) {
    visitCompositeElement(o);
  }

  public void visitStringTemplateContent(@NotNull BallerinaStringTemplateContent o) {
    visitCompositeElement(o);
  }

  public void visitStringTemplateLiteral(@NotNull BallerinaStringTemplateLiteral o) {
    visitCompositeElement(o);
  }

  public void visitStringTemplateLiteralExpression(@NotNull BallerinaStringTemplateLiteralExpression o) {
    visitExpression(o);
  }

  public void visitStructBody(@NotNull BallerinaStructBody o) {
    visitCompositeElement(o);
  }

  public void visitStructDefinition(@NotNull BallerinaStructDefinition o) {
    visitNamedElement(o);
  }

  public void visitTableTypeName(@NotNull BallerinaTableTypeName o) {
    visitCompositeElement(o);
  }

  public void visitTernaryExpression(@NotNull BallerinaTernaryExpression o) {
    visitExpression(o);
  }

  public void visitThrowStatement(@NotNull BallerinaThrowStatement o) {
    visitCompositeElement(o);
  }

  public void visitTimeoutClause(@NotNull BallerinaTimeoutClause o) {
    visitCompositeElement(o);
  }

  public void visitTimeoutClauseBody(@NotNull BallerinaTimeoutClauseBody o) {
    visitCompositeElement(o);
  }

  public void visitTransactionClause(@NotNull BallerinaTransactionClause o) {
    visitCompositeElement(o);
  }

  public void visitTransactionPropertyInitStatement(@NotNull BallerinaTransactionPropertyInitStatement o) {
    visitCompositeElement(o);
  }

  public void visitTransactionPropertyInitStatementList(@NotNull BallerinaTransactionPropertyInitStatementList o) {
    visitCompositeElement(o);
  }

  public void visitTransactionStatement(@NotNull BallerinaTransactionStatement o) {
    visitCompositeElement(o);
  }

  public void visitTransformerDefinition(@NotNull BallerinaTransformerDefinition o) {
    visitNamedElement(o);
  }

  public void visitTriggerWorker(@NotNull BallerinaTriggerWorker o) {
    visitCompositeElement(o);
  }

  public void visitTryCatchStatement(@NotNull BallerinaTryCatchStatement o) {
    visitCompositeElement(o);
  }

  public void visitTupleTypeName(@NotNull BallerinaTupleTypeName o) {
    visitTypeName(o);
  }

  public void visitTypeAccessExpression(@NotNull BallerinaTypeAccessExpression o) {
    visitExpression(o);
  }

  public void visitTypeConversionExpression(@NotNull BallerinaTypeConversionExpression o) {
    visitExpression(o);
  }

  public void visitTypeDefinition(@NotNull BallerinaTypeDefinition o) {
    visitCompositeElement(o);
  }

  public void visitTypeDescTypeName(@NotNull BallerinaTypeDescTypeName o) {
    visitCompositeElement(o);
  }

  public void visitTypeInitExpr(@NotNull BallerinaTypeInitExpr o) {
    visitCompositeElement(o);
  }

  public void visitTypeInitExpression(@NotNull BallerinaTypeInitExpression o) {
    visitExpression(o);
  }

  public void visitTypeName(@NotNull BallerinaTypeName o) {
    visitCompositeElement(o);
  }

  public void visitUnaryExpression(@NotNull BallerinaUnaryExpression o) {
    visitExpression(o);
  }

  public void visitUnionTypeName(@NotNull BallerinaUnionTypeName o) {
    visitTypeName(o);
  }

  public void visitUserDefineTypeName(@NotNull BallerinaUserDefineTypeName o) {
    visitCompositeElement(o);
  }

  public void visitValueTypeName(@NotNull BallerinaValueTypeName o) {
    visitCompositeElement(o);
  }

  public void visitValueTypeTypeExpression(@NotNull BallerinaValueTypeTypeExpression o) {
    visitExpression(o);
  }

  public void visitVariableDefinitionStatement(@NotNull BallerinaVariableDefinitionStatement o) {
    visitNamedElement(o);
  }

  public void visitVariableDefinitionStatementInService(@NotNull BallerinaVariableDefinitionStatementInService o) {
    visitCompositeElement(o);
  }

  public void visitVariableReference(@NotNull BallerinaVariableReference o) {
    visitCompositeElement(o);
  }

  public void visitVariableReferenceExpression(@NotNull BallerinaVariableReferenceExpression o) {
    visitExpression(o);
  }

  public void visitVariableReferenceList(@NotNull BallerinaVariableReferenceList o) {
    visitCompositeElement(o);
  }

  public void visitWhileStatement(@NotNull BallerinaWhileStatement o) {
    visitCompositeElement(o);
  }

  public void visitWhileStatementBody(@NotNull BallerinaWhileStatementBody o) {
    visitCompositeElement(o);
  }

  public void visitWorkerBody(@NotNull BallerinaWorkerBody o) {
    visitCompositeElement(o);
  }

  public void visitWorkerDefinition(@NotNull BallerinaWorkerDefinition o) {
    visitNamedElement(o);
  }

  public void visitWorkerInteractionStatement(@NotNull BallerinaWorkerInteractionStatement o) {
    visitCompositeElement(o);
  }

  public void visitWorkerReply(@NotNull BallerinaWorkerReply o) {
    visitCompositeElement(o);
  }

  public void visitXmlAttrib(@NotNull BallerinaXmlAttrib o) {
    visitCompositeElement(o);
  }

  public void visitXmlAttribVariableReference(@NotNull BallerinaXmlAttribVariableReference o) {
    visitVariableReference(o);
  }

  public void visitXmlDoubleQuotedString(@NotNull BallerinaXmlDoubleQuotedString o) {
    visitCompositeElement(o);
  }

  public void visitXmlItem(@NotNull BallerinaXmlItem o) {
    visitCompositeElement(o);
  }

  public void visitXmlLiteral(@NotNull BallerinaXmlLiteral o) {
    visitCompositeElement(o);
  }

  public void visitXmlLiteralExpression(@NotNull BallerinaXmlLiteralExpression o) {
    visitExpression(o);
  }

  public void visitXmlLocalName(@NotNull BallerinaXmlLocalName o) {
    visitCompositeElement(o);
  }

  public void visitXmlNamespaceName(@NotNull BallerinaXmlNamespaceName o) {
    visitCompositeElement(o);
  }

  public void visitXmlQualifiedName(@NotNull BallerinaXmlQualifiedName o) {
    visitCompositeElement(o);
  }

  public void visitXmlQuotedString(@NotNull BallerinaXmlQuotedString o) {
    visitCompositeElement(o);
  }

  public void visitXmlSingleQuotedString(@NotNull BallerinaXmlSingleQuotedString o) {
    visitCompositeElement(o);
  }

  public void visitXmlText(@NotNull BallerinaXmlText o) {
    visitCompositeElement(o);
  }

  public void visitXmlTypeName(@NotNull BallerinaXmlTypeName o) {
    visitCompositeElement(o);
  }

  public void visitDeprecatedAttachment(@NotNull BallerinaDeprecatedAttachment o) {
    visitCompositeElement(o);
  }

  public void visitDeprecatedTemplateInlineCode(@NotNull BallerinaDeprecatedTemplateInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitDeprecatedText(@NotNull BallerinaDeprecatedText o) {
    visitCompositeElement(o);
  }

  public void visitDocText(@NotNull BallerinaDocText o) {
    visitCompositeElement(o);
  }

  public void visitDocumentationAttachment(@NotNull BallerinaDocumentationAttachment o) {
    visitCompositeElement(o);
  }

  public void visitDocumentationTemplateAttributeDescription(@NotNull BallerinaDocumentationTemplateAttributeDescription o) {
    visitCompositeElement(o);
  }

  public void visitDocumentationTemplateContent(@NotNull BallerinaDocumentationTemplateContent o) {
    visitCompositeElement(o);
  }

  public void visitDocumentationTemplateInlineCode(@NotNull BallerinaDocumentationTemplateInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitDoubleBackTickDeprecatedInlineCode(@NotNull BallerinaDoubleBackTickDeprecatedInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitDoubleBackTickDocInlineCode(@NotNull BallerinaDoubleBackTickDocInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitEndpointParameter(@NotNull BallerinaEndpointParameter o) {
    visitCompositeElement(o);
  }

  public void visitFailStatement(@NotNull BallerinaFailStatement o) {
    visitCompositeElement(o);
  }

  public void visitMatchPatternClause(@NotNull BallerinaMatchPatternClause o) {
    visitCompositeElement(o);
  }

  public void visitMatchStatement(@NotNull BallerinaMatchStatement o) {
    visitCompositeElement(o);
  }

  public void visitMatchStatementBody(@NotNull BallerinaMatchStatementBody o) {
    visitCompositeElement(o);
  }

  public void visitNamedPattern(@NotNull BallerinaNamedPattern o) {
    visitCompositeElement(o);
  }

  public void visitParameterTypeName(@NotNull BallerinaParameterTypeName o) {
    visitCompositeElement(o);
  }

  public void visitResourceParameterList(@NotNull BallerinaResourceParameterList o) {
    visitCompositeElement(o);
  }

  public void visitSingleBackTickDeprecatedInlineCode(@NotNull BallerinaSingleBackTickDeprecatedInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitSingleBackTickDocInlineCode(@NotNull BallerinaSingleBackTickDocInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitTripleBackTickDeprecatedInlineCode(@NotNull BallerinaTripleBackTickDeprecatedInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitTripleBackTickDocInlineCode(@NotNull BallerinaTripleBackTickDocInlineCode o) {
    visitCompositeElement(o);
  }

  public void visitTupleDestructuringStatement(@NotNull BallerinaTupleDestructuringStatement o) {
    visitCompositeElement(o);
  }

  public void visitUnnamedPattern(@NotNull BallerinaUnnamedPattern o) {
    visitCompositeElement(o);
  }

  public void visitNamedElement(@NotNull BallerinaNamedElement o) {
    visitCompositeElement(o);
  }

  public void visitCompositeElement(@NotNull BallerinaCompositeElement o) {
    visitElement(o);
  }

}
