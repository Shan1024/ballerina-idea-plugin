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

public class SimpleFunctionDefinitionImpl extends ASTWrapperPsiElement implements SimpleFunctionDefinition {

  public SimpleFunctionDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitFunctionDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleNativeFunctionDefinition getNativeFunctionDefinition() {
    return findChildByClass(SimpleNativeFunctionDefinition.class);
  }

  @Override
  @Nullable
  public SimpleNonNativeFunctionDefinition getNonNativeFunctionDefinition() {
    return findChildByClass(SimpleNonNativeFunctionDefinition.class);
  }

}
