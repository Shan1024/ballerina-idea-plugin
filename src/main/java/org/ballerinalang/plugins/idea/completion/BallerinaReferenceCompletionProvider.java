package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.ProcessingContext;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaNameReferenceReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaObjectFieldReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaObjectFunctionReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaTypeReference;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaBlockProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaObjectFieldProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaObjectFunctionProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaTopLevelScopeProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaTypeProcessor;
import org.jetbrains.annotations.NotNull;

public class BallerinaReferenceCompletionProvider extends CompletionProvider<CompletionParameters> {

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context,
                                  @NotNull CompletionResultSet result) {

        PsiElement element = parameters.getPosition();

        PsiReference reference = element.getReference();
        if (reference == null) {
            return;
        }

        if (reference instanceof BallerinaNameReferenceReference) {
            BallerinaNameReferenceReference nameReferenceReference = (BallerinaNameReferenceReference) reference;
            if (!nameReferenceReference.processResolveVariants(new BallerinaBlockProcessor(result, element, true))) {
                return;
            }
            nameReferenceReference.processResolveVariants(new BallerinaTopLevelScopeProcessor(result, element, true));
        } else if (reference instanceof BallerinaTypeReference) {
            BallerinaTypeReference ballerinaTypeReference = (BallerinaTypeReference) reference;
            ballerinaTypeReference.processResolveVariants(new BallerinaTypeProcessor(result, element));
        } else if (reference instanceof BallerinaObjectFunctionReference) {
            BallerinaObjectFunctionReference ballerinaTypeReference = (BallerinaObjectFunctionReference) reference;
            ballerinaTypeReference.processResolveVariants(new BallerinaObjectFunctionProcessor(result, element, false));
        }else if (reference instanceof BallerinaObjectFieldReference) {
            BallerinaObjectFieldReference ballerinaTypeReference = (BallerinaObjectFieldReference) reference;
            ballerinaTypeReference.processResolveVariants(new BallerinaObjectFieldProcessor(result, element, false));
        }
    }
}
