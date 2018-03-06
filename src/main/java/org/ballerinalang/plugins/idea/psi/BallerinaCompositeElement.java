package org.ballerinalang.plugins.idea.psi;

import com.intellij.psi.PsiElement;

public interface BallerinaCompositeElement extends PsiElement {

    boolean shouldGoDeeper();
}
