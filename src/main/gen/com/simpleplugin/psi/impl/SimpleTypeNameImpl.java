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

public class SimpleTypeNameImpl extends ASTWrapperPsiElement implements SimpleTypeName {

  public SimpleTypeNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitTypeName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleReferenceTypeName getReferenceTypeName() {
    return findChildByClass(SimpleReferenceTypeName.class);
  }

  @Override
  @Nullable
  public SimpleValueTypeName getValueTypeName() {
    return findChildByClass(SimpleValueTypeName.class);
  }

}
