package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaServiceDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaServiceEndpointAttachments;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BallerinaActionInvocationProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;

    public BallerinaActionInvocationProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element,
                                              boolean isCompletion) {
        super(element, element, isCompletion);
        myResult = result;
        myElement = element;
    }

    protected boolean accept(@NotNull PsiElement element) {
        return true;
    }

    @Override
    public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
        if (accept(element)) {
            PsiElement prevVisibleLeaf = PsiTreeUtil.prevVisibleLeaf(myElement);
            if (prevVisibleLeaf != null && prevVisibleLeaf instanceof LeafPsiElement) {
                if (((LeafPsiElement) prevVisibleLeaf).getElementType() == BallerinaTypes.RARROW) {
                    PsiElement connector = PsiTreeUtil.prevVisibleLeaf(prevVisibleLeaf);
                    if (connector == null) {
                        return true;
                    }
                    PsiReference reference = connector.getReference();
                    if (reference == null) {
                        return true;
                    }
                    PsiElement resolvedElement = reference.resolve();
                    if (resolvedElement == null) {
                        return true;
                    }
                    if (!(resolvedElement.getParent() instanceof BallerinaEndpointParameter)) {
                        return true;
                    }

                    BallerinaServiceDefinition ballerinaServiceDefinition = PsiTreeUtil.getParentOfType(resolvedElement,
                            BallerinaServiceDefinition.class);
                    if (ballerinaServiceDefinition == null) {
                        return true;
                    }

                    BallerinaServiceEndpointAttachments serviceEndpointAttachments = ballerinaServiceDefinition
                            .getServiceEndpointAttachments();
                    if (serviceEndpointAttachments == null) {
                        return true;
                    }
                    List<BallerinaNameReference> nameReferenceList = serviceEndpointAttachments.getNameReferenceList();


                    BallerinaNameReference ballerinaNameReference = nameReferenceList.get(0);


                    PsiElement type = BallerinaPsiImplUtil.getCachedType(ballerinaNameReference);

                    if (type == null) {
                        return true;
                    }

                    PsiElement parent = type.getParent();
                    if (parent instanceof BallerinaTypeDefinition) {
                        BallerinaTypeDefinition clientConnector =
                                BallerinaPsiImplUtil.getClientConnector(((BallerinaTypeDefinition) parent));

                        if (clientConnector != null) {

                            BallerinaObjectFunctionProcessor ballerinaObjectFunctionProcessor
                                    = new BallerinaObjectFunctionProcessor(myResult, myElement, isCompletion());
                            ballerinaObjectFunctionProcessor.execute(clientConnector, ResolveState.initial());
                            PsiElement result = ballerinaObjectFunctionProcessor.getResult();
                            if (!isCompletion() && result != null) {
                                add(result);

                            }
                            return false;
                        }
                    }
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