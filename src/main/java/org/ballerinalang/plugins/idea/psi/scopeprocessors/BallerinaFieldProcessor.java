package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaAttachedObject;
import org.ballerinalang.plugins.idea.psi.BallerinaField;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BallerinaFieldProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;

    public BallerinaFieldProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element,
                                   boolean isCompletion) {
        super(element, element, isCompletion);
        myResult = result;
        myElement = element;
    }

    @Override
    public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
        if (accept(element)) {
            PsiElement parent = element.getParent();
            PsiElement prevSibling = parent.getPrevSibling();
            if (prevSibling == null || !(prevSibling instanceof BallerinaVariableReference)) {
                return true;
            }

            // Note - This check should occur before resolving the type. Otherwise there will be a performance issue
            // when the "self" is tried to resolve to a definition.
            if (prevSibling instanceof BallerinaSimpleVariableReference && "self".equals(prevSibling.getText())) {
                BallerinaTypeDefinition ballerinaTypeDefinition = PsiTreeUtil.getParentOfType(prevSibling,
                        BallerinaTypeDefinition.class);
                if (ballerinaTypeDefinition != null) {
                    if (!processTypeDefinition(ballerinaTypeDefinition)) {
                        return false;
                    }
                }

                BallerinaFunctionDefinition functionDefinition = PsiTreeUtil.getParentOfType(prevSibling,
                        BallerinaFunctionDefinition.class);
                if (functionDefinition == null || functionDefinition.getAttachedObject() == null) {
                    return true;
                }
                BallerinaAttachedObject attachedObject = functionDefinition.getAttachedObject();
                if (attachedObject == null) {
                    return true;
                }
                PsiElement identifier = attachedObject.getIdentifier();
                PsiReference reference = identifier.getReference();
                if (reference == null) {
                    return true;
                }
                PsiElement resolvedElement = reference.resolve();
                if (resolvedElement == null || !(resolvedElement.getParent() instanceof BallerinaTypeDefinition)) {
                    return true;
                }
                return processTypeDefinition(((BallerinaTypeDefinition) resolvedElement.getParent()));
            }

            PsiElement type = ((BallerinaVariableReference) prevSibling).getType();

            // Todo - Refactor and remove duplication in BallerinaInvocationProcessor
            if (type != null) {
                PsiElement ballerinaTypeDefinition = type.getParent();
                if (ballerinaTypeDefinition instanceof BallerinaTypeDefinition) {
                    BallerinaObjectFieldProcessor ballerinaFieldProcessor = new BallerinaObjectFieldProcessor(myResult,
                            myElement, isCompletion());
                    ballerinaFieldProcessor.execute(ballerinaTypeDefinition, ResolveState.initial());
                    PsiElement result = ballerinaFieldProcessor.getResult();
                    if (!isCompletion() && result != null) {
                        add(result);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean processTypeDefinition(@NotNull BallerinaTypeDefinition ballerinaTypeDefinition) {
        BallerinaObjectFieldProcessor ballerinaFieldProcessor =
                new BallerinaObjectFieldProcessor(myResult, myElement, isCompletion());
        ballerinaFieldProcessor.execute(ballerinaTypeDefinition, ResolveState.initial());
        PsiElement result = ballerinaFieldProcessor.getResult();
        if (!isCompletion() && result != null) {
            add(result);
            return false;
        }

        // Note - This is needed for code completion.
        // Todo - Remove duplication in BallerinaInvocationProcessor
        BallerinaObjectFunctionProcessor ballerinaObjectFunctionProcessor
                = new BallerinaObjectFunctionProcessor(myResult, myElement, isCompletion());
        ballerinaObjectFunctionProcessor.execute(ballerinaTypeDefinition, ResolveState.initial());
        result = ballerinaObjectFunctionProcessor.getResult();
        if (!isCompletion() && result != null) {
            add(result);
            return false;
        }
        return true;
    }


    protected boolean accept(@NotNull PsiElement element) {
        return element.getParent() instanceof BallerinaField;
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