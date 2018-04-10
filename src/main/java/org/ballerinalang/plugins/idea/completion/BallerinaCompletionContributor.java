package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaNameReferenceReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaObjectFieldReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaObjectFunctionReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaTypeReference;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class BallerinaCompletionContributor extends CompletionContributor {

    public BallerinaCompletionContributor() {
        extend(CompletionType.BASIC, isBallerinaNameReference(), new BallerinaReferenceCompletionProvider());
        extend(CompletionType.BASIC, isBallerinaTypeReference(), new BallerinaReferenceCompletionProvider());
        extend(CompletionType.BASIC, isBallerinaObjectFunctionReference(), new BallerinaReferenceCompletionProvider());
        extend(CompletionType.BASIC, isBallerinaObjectFieldReference(), new BallerinaReferenceCompletionProvider());
    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
    }

    public PsiElementPattern.Capture<PsiElement> isBallerinaNameReference() {
        return psiElement().withReference(BallerinaNameReferenceReference.class);
    }

    public PsiElementPattern.Capture<PsiElement> isBallerinaTypeReference() {
        return psiElement().withReference(BallerinaTypeReference.class);
    }

    public PsiElementPattern.Capture<PsiElement> isBallerinaObjectFunctionReference() {
        return psiElement().withReference(BallerinaObjectFunctionReference.class);
    }

    public PsiElementPattern.Capture<PsiElement> isBallerinaObjectFieldReference() {
        return psiElement().withReference(BallerinaObjectFieldReference.class);
    }

    @Override
    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar) {
        // To ignore auto popup when typing :: in function signature.
        if (position.getParent() instanceof BallerinaCallableUnitSignature) {
            return false;
        }
        return typeChar == ':' || typeChar == '@';
    }
}
