package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaField;
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
    private int count;

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
            long start = System.nanoTime();
            PsiElement type = ((BallerinaVariableReference) prevSibling).getType();
            long end = System.nanoTime();
            System.out.println("Time: " + (end - start));

            if (type != null) {
                PsiElement ballerinaTypeDefinition = type.getParent();
                if (ballerinaTypeDefinition instanceof BallerinaTypeDefinition) {
                    BallerinaObjectFieldProcessor ballerinaFieldProcessor = new BallerinaObjectFieldProcessor(myResult,
                            myElement, isCompletion());
                    ballerinaFieldProcessor.execute(ballerinaTypeDefinition, ResolveState.initial());
                    PsiElement result = ballerinaFieldProcessor.getResult();
                    if (!isCompletion() && result != null) {
                        add(result);
                    }
                }
            } else {
                if (prevSibling instanceof BallerinaSimpleVariableReference && "self".equals(prevSibling.getText())) {
                    BallerinaTypeDefinition ballerinaTypeDefinition = PsiTreeUtil.getParentOfType(prevSibling,
                            BallerinaTypeDefinition.class);
                    if(ballerinaTypeDefinition!=null){
                        BallerinaObjectFieldProcessor ballerinaFieldProcessor = new BallerinaObjectFieldProcessor(myResult,
                                myElement, isCompletion());
                        ballerinaFieldProcessor.execute(ballerinaTypeDefinition, ResolveState.initial());
                        PsiElement result = ballerinaFieldProcessor.getResult();
                        if (!isCompletion() && result != null) {
                            add(result);
                        }
                    }
                }
            }

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

    @Override
    public int getCount() {
        return count;
    }
}