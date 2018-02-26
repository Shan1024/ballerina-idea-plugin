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

public class SimpleBuiltInReferenceTypeNameImpl extends ASTWrapperPsiElement implements SimpleBuiltInReferenceTypeName {

  public SimpleBuiltInReferenceTypeNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitBuiltInReferenceTypeName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleFunctionTypeName getFunctionTypeName() {
    return findChildByClass(SimpleFunctionTypeName.class);
  }

  @Override
  @Nullable
  public SimpleNameReference getNameReference() {
    return findChildByClass(SimpleNameReference.class);
  }

  @Override
  @Nullable
  public SimpleTypeName getTypeName() {
    return findChildByClass(SimpleTypeName.class);
  }

}
