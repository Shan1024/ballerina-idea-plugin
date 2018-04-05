package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaNameReferenceReference;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class BallerinaCompletionContributor extends CompletionContributor {

    public BallerinaCompletionContributor() {
        extend(CompletionType.BASIC, isBallerinaReference(), new BallerinaReferenceCompletionProvider());
    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
    }

    public PsiElementPattern.Capture<PsiElement> isBallerinaReference() {
        return psiElement().withReference(BallerinaNameReferenceReference.class);
    }
}
