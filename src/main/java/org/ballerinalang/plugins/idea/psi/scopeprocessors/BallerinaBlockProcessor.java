package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.psi.BallerinaAssignmentStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaBlock;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BallerinaBlockProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;
    private int count;

    public BallerinaBlockProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element) {
        super(element);
        myResult = result;
        myElement = element;
    }

    @Override
    public boolean execute(@NotNull PsiElement scopeElement, @NotNull ResolveState state) {
        if (accept(scopeElement)) {
            BallerinaBlock block = (BallerinaBlock) scopeElement;
            while (block != null) {
                List<BallerinaStatement> statements = block.getStatementList();

                for (BallerinaStatement statement : statements) {

                    int statementEndOffset = statement.getTextRange().getEndOffset();
                    if (statementEndOffset >= myElement.getTextRange().getEndOffset()) {
                        continue;
                    }

                    PsiElement firstChild = statement.getFirstChild();
                    if (firstChild == null) {
                        continue;
                    }
                    if (firstChild instanceof BallerinaVariableDefinitionStatement) {
                        PsiElement identifier = ((BallerinaVariableDefinitionStatement) firstChild).getIdentifier();
                        if (myResult != null) {
                            myResult.addElement(BallerinaCompletionUtils.createVariableLookupElement(identifier));
                        } else if (myElement.getText().equals(identifier.getText())) {
                            add(identifier);
                        }
                        count++;
                    }
                    if (statement instanceof BallerinaAssignmentStatement) {

                    }
                }
                block = PsiTreeUtil.getParentOfType(block, BallerinaBlock.class);
            }
        }
        return true;
    }

    protected boolean accept(@NotNull PsiElement element) {
        return element instanceof BallerinaBlock;
    }

    @Override
    public boolean isCompletion() {
        return true;
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
