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

public class SimpleServiceBodyImpl extends ASTWrapperPsiElement implements SimpleServiceBody {

  public SimpleServiceBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitServiceBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleResourceDefinition> getResourceDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleResourceDefinition.class);
  }

  @Override
  @NotNull
  public List<SimpleVariableDefinitionStatement> getVariableDefinitionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleVariableDefinitionStatement.class);
  }

}
