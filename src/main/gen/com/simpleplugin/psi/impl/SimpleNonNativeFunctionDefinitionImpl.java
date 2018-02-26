// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.simpleplugin.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.simpleplugin.psi.*;

public class SimpleNonNativeFunctionDefinitionImpl extends ASTWrapperPsiElement implements SimpleNonNativeFunctionDefinition {

  public SimpleNonNativeFunctionDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitNonNativeFunctionDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleCallableUnitBody getCallableUnitBody() {
    return findChildByClass(SimpleCallableUnitBody.class);
  }

  @Override
  @Nullable
  public SimpleCallableUnitSignature getCallableUnitSignature() {
    return findChildByClass(SimpleCallableUnitSignature.class);
  }

  @Override
  @Nullable
  public SimpleParameter getParameter() {
    return findChildByClass(SimpleParameter.class);
  }

}
