// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleVariableDefinitionStatement extends PsiElement {

  @NotNull
  SimpleIdentifier getIdentifier();

  @Nullable
  SimpleExpression getExpression();

  @NotNull
  SimpleTypeName getTypeName();

}
