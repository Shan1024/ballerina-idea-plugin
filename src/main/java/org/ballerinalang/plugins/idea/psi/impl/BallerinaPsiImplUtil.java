package org.ballerinalang.plugins.idea.psi.impl;

import com.intellij.psi.PsiElement;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.jetbrains.annotations.Nullable;

public class BallerinaPsiImplUtil {

    //    @Nullable
    //    public static String getName(@NotNull BallerinaPackageDeclaration packageClause) {
    //        BallerinaPackageDeclarationStub stub = packageClause.getStub();
    //        if (stub != null) return stub.getName();
    //        PsiElement packageIdentifier = packageClause.getPackageName();
    //        return packageIdentifier != null ? packageIdentifier.getText().trim() : null;
    //    }

    @Nullable
    public static PsiElement getIdentifier(BallerinaFunctionDefinition ballerinaFunctionDefinition) {
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null ? callableUnitSignature.getIdentifier() : null;
    }

    @Nullable
    public static String getName(BallerinaFunctionDefinition ballerinaFunctionDefinition) {
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null ? callableUnitSignature.getIdentifier().getText() : "";
    }
}
