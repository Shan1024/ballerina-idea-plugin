package org.ballerinalang.plugins.idea.psi;

import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface BallerinaNamedElement extends BallerinaCompositeElement, BallerinaTypeOwner, PsiNameIdentifierOwner,
        NavigationItem {

    boolean isPublic();

    @Nullable
    PsiElement getIdentifier();

    @Nullable
    String getQualifiedName();

    @Override
    @NotNull
    BallerinaFile getContainingFile();

    @Nullable
    BallerinaTypeName findSiblingType();

    boolean isBlank();
}
