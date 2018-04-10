package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.completion.inserthandlers.ParenthesisInsertHandler;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class BallerinaObjectFunctionProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;
    private int count;

    public BallerinaObjectFunctionProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element,
                                            boolean isCompletion) {
        super(element, element, isCompletion);
        myResult = result;
        myElement = element;
    }

    @Override
    public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
        if (accept(element)) {

            Collection<BallerinaObjectFunctionDefinition> objectFunctionDefinitions =
                    PsiTreeUtil.findChildrenOfType(element, BallerinaObjectFunctionDefinition.class);

            for (BallerinaObjectFunctionDefinition objectFunctionDefinition : objectFunctionDefinitions) {
                BallerinaObjectCallableUnitSignature objectCallableUnitSignature =
                        objectFunctionDefinition.getObjectCallableUnitSignature();
                if (objectCallableUnitSignature == null) {
                    continue;
                }

                PsiElement identifier = objectCallableUnitSignature.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createFunctionLookupElement(identifier,
                            ParenthesisInsertHandler.INSTANCE_WITH_AUTO_POPUP));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
                count++;
            }

        }
        return true;
    }

    protected boolean accept(@NotNull PsiElement element) {
        return element instanceof BallerinaTypeDefinition;
    }

    @Override
    public boolean isCompletion() {
        return myIsCompletion;
    }

    @Override
    protected boolean crossOff(@NotNull PsiElement e) {
        return false;
    }

    @Override
    public int getCount() {
        return count;
    }
}
