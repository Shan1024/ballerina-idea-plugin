package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.completion.inserthandlers.ParenthesisInsertHandler;
import org.ballerinalang.plugins.idea.psi.BallerinaAnnotationAttachment;
import org.ballerinalang.plugins.idea.psi.BallerinaAnnotationDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BallerinaTopLevelScopeProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;

    public BallerinaTopLevelScopeProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element,
                                           boolean isCompletion) {
        super(element, isCompletion);
        myResult = result;
        myElement = element;
    }

    protected boolean accept(@NotNull PsiElement element) {
        return element instanceof BallerinaFile;
    }

    @Override
    public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
        if (accept(element)) {
            List<BallerinaDefinition> definitions = ((BallerinaFile) element).getDefinitions();

            if (myElement.getParent().getParent() instanceof BallerinaAnnotationAttachment) {
                for (BallerinaDefinition definition : definitions) {
                    PsiElement lastChild = definition.getLastChild();
                    if (lastChild instanceof BallerinaAnnotationDefinition) {
                        BallerinaAnnotationDefinition child = (BallerinaAnnotationDefinition) lastChild;
                        PsiElement identifier = child.getIdentifier();
                        if (identifier != null) {
                            if (myResult != null) {
                                myResult.addElement(BallerinaCompletionUtils.createAnnotationLookupElement(identifier));
                            } else if (myElement.getText().equals(identifier.getText())) {
                                add(identifier);
                            }
                        }
                    }
                }
                if (isCompletion() && getResult() != null) {
                    return false;
                }
                return true;
            }

            for (BallerinaDefinition definition : definitions) {
                PsiElement lastChild = definition.getLastChild();
                if (lastChild instanceof BallerinaFunctionDefinition) {
                    BallerinaFunctionDefinition child = (BallerinaFunctionDefinition) lastChild;
                    if (child.getAttachedObject() == null) {
                        PsiElement identifier = child.getIdentifier();
                        if (identifier != null) {
                            if (myResult != null) {
                                // Todo - Conside oncommit, onabort, etc and set the insert handler
                                // Note - Child is passed here instead of identifier because it is is top level
                                // definition.
                                myResult.addElement(BallerinaCompletionUtils.createFunctionLookupElement(child,
                                        ParenthesisInsertHandler.INSTANCE));
                            } else if (myElement.getText().equals(identifier.getText())) {
                                add(identifier);
                            }
                        }
                    }
                } else if (lastChild instanceof BallerinaGlobalVariableDefinition) {
                    BallerinaGlobalVariableDefinition child = (BallerinaGlobalVariableDefinition) lastChild;
                    PsiElement identifier = child.getIdentifier();
                    if (identifier != null) {
                        if (myResult != null) {
                            myResult.addElement(BallerinaCompletionUtils.createGlobalVariableLookupElement(child,
                                    BallerinaPsiImplUtil.formatBallerinaTypeName(child.getTypeName())));
                        } else if (myElement.getText().equals(identifier.getText())) {
                            add(identifier);
                        }
                    }
                } else if (lastChild instanceof BallerinaGlobalEndpointDefinition) {
                    BallerinaGlobalEndpointDefinition child = (BallerinaGlobalEndpointDefinition) lastChild;
                    PsiElement identifier = child.getIdentifier();
                    if (identifier != null) {
                        if (myResult != null) {
                            myResult.addElement(BallerinaCompletionUtils.createGlobalEndpointLookupElement(child));
                        } else if (myElement.getText().equals(identifier.getText())) {
                            add(identifier);
                        }
                    }
                } else if (lastChild instanceof BallerinaTypeDefinition) {
                    BallerinaTypeDefinition child = (BallerinaTypeDefinition) lastChild;
                    PsiElement identifier = child.getIdentifier();
                    if (identifier != null) {
                        if (myResult != null) {
                            myResult.addElement(BallerinaCompletionUtils.createTypeLookupElement(child));
                        } else if (myElement.getText().equals(identifier.getText())) {
                            add(identifier);
                        }
                    }
                }
                if (!isCompletion() && getResult() != null) {
                    return false;
                }
            }
        }
        return true;
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