// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleFunctionTypeName extends PsiElement {

  @Nullable
  SimpleParameterList getParameterList();

  @Nullable
  SimpleReturnParameters getReturnParameters();

  @NotNull
  List<SimpleTypeName> getTypeNameList();

}
