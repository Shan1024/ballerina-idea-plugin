package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.psi.BallerinaNamedPattern;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BallerinaStatementProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;

    public BallerinaStatementProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element,
                                       boolean isCompletion) {
        super(element, element, isCompletion);
        myResult = result;
        myElement = element;
    }

    @Override
    public boolean execute(@NotNull PsiElement scopeElement, @NotNull ResolveState state) {
        if (accept(scopeElement)) {
            BallerinaStatement statement = (BallerinaStatement) scopeElement;
            BallerinaNamedPattern ballerinaNamedPattern = PsiTreeUtil.getParentOfType(statement,
                    BallerinaNamedPattern.class);
            while (ballerinaNamedPattern != null) {
                PsiElement identifier = ballerinaNamedPattern.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createVariableLookupElement(identifier,
                            BallerinaPsiImplUtil.formatBallerinaTypeName(ballerinaNamedPattern.getTypeName())));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
                if (!isCompletion() && getResult() != null) {
                    return false;
                }
                ballerinaNamedPattern = PsiTreeUtil.getParentOfType(ballerinaNamedPattern, BallerinaNamedPattern.class);
            }
        }
        return true;
    }

    protected boolean accept(@NotNull PsiElement element) {
        return element instanceof BallerinaStatement;
    }

    @Override
    public boolean isCompletion() {
        return myIsCompletion;
    }

    @Override
    protected boolean crossOff(@NotNull PsiElement e) {
        return false;
    }
}
