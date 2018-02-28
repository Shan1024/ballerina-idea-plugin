package org.ballerinalang.plugins.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.ballerinalang.plugins.idea.psi.BallerinaNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class BallerinaNamedElementImpl extends ASTWrapperPsiElement implements BallerinaNamedElement {

    public BallerinaNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
