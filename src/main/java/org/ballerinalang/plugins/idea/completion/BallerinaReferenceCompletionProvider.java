package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.ProcessingContext;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaBlockProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaTopLevelScopeProcessor;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaNameReferenceReference;
import org.jetbrains.annotations.NotNull;

public class BallerinaReferenceCompletionProvider extends CompletionProvider<CompletionParameters> {

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context,
                                  @NotNull CompletionResultSet result) {

        PsiElement element = parameters.getPosition();

        PsiReference reference = element.getReference();
        if (reference == null || !(reference instanceof BallerinaNameReferenceReference)) {
            return;
        }


        //        PsiFile containingFile = element.getContainingFile().getOriginalFile();
        //
        //        PsiDirectory parent = containingFile.getParent();
        //
        //        if (parent != null) {
        //            PsiElement[] children = parent.getChildren();
        //            for (PsiElement child : children) {
        //                topLevelScopeProcessor.execute(child, state);
        //            }
        //        }

        BallerinaNameReferenceReference nameReferenceReference = (BallerinaNameReferenceReference) reference;

        //        BallerinaBlock ballerinaBlock = PsiTreeUtil.getParentOfType(element, BallerinaBlock.class);
        //        if (ballerinaBlock != null) {
        if (!nameReferenceReference.processResolveVariants(new BallerinaBlockProcessor(result, element))) {
            return;
        }

        //        }

        if (!nameReferenceReference.processResolveVariants(new BallerinaTopLevelScopeProcessor(result, element))) {
            return;
        }
    }
}
