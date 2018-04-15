package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.psi.BallerinaExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaNamedPattern;
import org.ballerinalang.plugins.idea.psi.BallerinaRecordKey;
import org.ballerinalang.plugins.idea.psi.BallerinaRecordKeyValue;
import org.ballerinalang.plugins.idea.psi.BallerinaRecordLiteralExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
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

            // This is to suggest fields in when the caret is in a record literal.
            BallerinaRecordKey ballerinaRecordKey = PsiTreeUtil.getParentOfType(myElement, BallerinaRecordKey.class);
            // Todo - Check for record literal expression to find other types.
            if (ballerinaRecordKey != null) {

                BallerinaRecordLiteralExpression literalExpression = PsiTreeUtil.getParentOfType(ballerinaRecordKey,
                        BallerinaRecordLiteralExpression.class);
                if (literalExpression != null && literalExpression.getParent() instanceof BallerinaRecordKeyValue) {

                    BallerinaRecordKeyValue expressionParent = (BallerinaRecordKeyValue) literalExpression.getParent();
                    BallerinaRecordKey parentRecordKey = expressionParent.getRecordKey();


                    BallerinaExpression expression = parentRecordKey.getExpression();
                    PsiElement resolvedElement = BallerinaPsiImplUtil.getBallerinaTypeFromExpression(expression);

                    if (resolvedElement != null && resolvedElement.getParent() instanceof BallerinaTypeDefinition) {
                        BallerinaObjectFieldProcessor ballerinaFieldProcessor = new BallerinaObjectFieldProcessor
                                (myResult, myElement, isCompletion());
                        ballerinaFieldProcessor.execute(resolvedElement.getParent(), ResolveState.initial());
                        PsiElement result = ballerinaFieldProcessor.getResult();
                        if (!isCompletion() && result != null) {
                            add(result);
                            return false;
                        }
                    }
                    return false;

                }

                if (statement.getFirstChild() instanceof BallerinaVariableDefinitionStatement) {
                    PsiElement resolvedElement = BallerinaPsiImplUtil.resolveBallerinaType((
                            (BallerinaVariableDefinitionStatement) statement.getFirstChild()));
                    if (resolvedElement != null && resolvedElement.getParent() instanceof BallerinaTypeDefinition) {
                        BallerinaObjectFieldProcessor ballerinaFieldProcessor = new BallerinaObjectFieldProcessor
                                (myResult, myElement, isCompletion());
                        ballerinaFieldProcessor.execute(resolvedElement.getParent(), ResolveState.initial());
                        PsiElement result = ballerinaFieldProcessor.getResult();
                        if (!isCompletion() && result != null) {
                            add(result);
                            return false;
                        }
                    }
                }
                // We don't want to suggest any other completion since we are currently at the key of a record literal.
                return false;
            }

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
