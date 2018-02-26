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

public class SimpleLambdaFunctionImpl extends ASTWrapperPsiElement implements SimpleLambdaFunction {

  public SimpleLambdaFunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitLambdaFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SimpleCallableUnitBody getCallableUnitBody() {
    return findNotNullChildByClass(SimpleCallableUnitBody.class);
  }

  @Override
  @Nullable
  public SimpleParameterList getParameterList() {
    return findChildByClass(SimpleParameterList.class);
  }

  @Override
  @Nullable
  public SimpleReturnParameters getReturnParameters() {
    return findChildByClass(SimpleReturnParameters.class);
  }

}
