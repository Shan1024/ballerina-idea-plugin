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

public class SimpleReferenceTypeNameImpl extends ASTWrapperPsiElement implements SimpleReferenceTypeName {

  public SimpleReferenceTypeNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitReferenceTypeName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleAnonStructTypeName getAnonStructTypeName() {
    return findChildByClass(SimpleAnonStructTypeName.class);
  }

  @Override
  @Nullable
  public SimpleBuiltInReferenceTypeName getBuiltInReferenceTypeName() {
    return findChildByClass(SimpleBuiltInReferenceTypeName.class);
  }

  @Override
  @Nullable
  public SimpleUserDefineTypeName getUserDefineTypeName() {
    return findChildByClass(SimpleUserDefineTypeName.class);
  }

}
