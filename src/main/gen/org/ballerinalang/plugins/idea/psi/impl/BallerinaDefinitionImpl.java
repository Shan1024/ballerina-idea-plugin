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
package org.ballerinalang.plugins.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.*;
import org.ballerinalang.plugins.idea.psi.*;

public class BallerinaDefinitionImpl extends BallerinaCompositeElementImpl implements BallerinaDefinition {

  public BallerinaDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BallerinaVisitor visitor) {
    visitor.visitDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BallerinaVisitor) accept((BallerinaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BallerinaAnnotationAttachment> getAnnotationAttachmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BallerinaAnnotationAttachment.class);
  }

  @Override
  @Nullable
  public BallerinaAnnotationDefinition getAnnotationDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaAnnotationDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaConnectorDefinition getConnectorDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaConnectorDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaConstantDefinition getConstantDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaConstantDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaEnumDefinition getEnumDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaEnumDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaFunctionDefinition getFunctionDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaFunctionDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaGlobalEndpointDefinition getGlobalEndpointDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaGlobalEndpointDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaGlobalVariableDefinition getGlobalVariableDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaGlobalVariableDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaServiceDefinition getServiceDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaServiceDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaStructDefinition getStructDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaStructDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaTransformerDefinition getTransformerDefinition() {
    return PsiTreeUtil.getChildOfType(this, BallerinaTransformerDefinition.class);
  }

  @Override
  @Nullable
  public BallerinaDeprecatedAttachment getDeprecatedAttachment() {
    return PsiTreeUtil.getChildOfType(this, BallerinaDeprecatedAttachment.class);
  }

  @Override
  @Nullable
  public BallerinaDocumentationAttachment getDocumentationAttachment() {
    return PsiTreeUtil.getChildOfType(this, BallerinaDocumentationAttachment.class);
  }

}
