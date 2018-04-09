package org.ballerinalang.plugins.idea.psi.scopeprocessors;

import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.psi.BallerinaAssignmentStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaBlock;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaDefaultableParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaFormalParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaParameterWithType;
import org.ballerinalang.plugins.idea.psi.BallerinaResourceDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaResourceParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaRestParameter;
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

            // Todo - check return value and continue only if needed
            processFunctionSignature(scopeElement);
            processResourceSignature(scopeElement);
        }
        return true;
    }

    private void processFunctionSignature(@NotNull PsiElement scopeElement) {
        BallerinaFunctionDefinition ballerinaFunctionDefinition = PsiTreeUtil.getParentOfType(scopeElement,
                BallerinaFunctionDefinition.class);
        if (ballerinaFunctionDefinition == null) {
            return;
        }
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition
                .getCallableUnitSignature();
        if (callableUnitSignature == null) {
            return;
        }
        BallerinaFormalParameterList formalParameterList = callableUnitSignature.getFormalParameterList();
        if (formalParameterList == null) {
            return;
        }
        List<BallerinaParameter> parameterList = formalParameterList.getParameterList();
        for (BallerinaParameter ballerinaParameter : parameterList) {
            List<BallerinaParameterWithType> parameterWithTypeList = ballerinaParameter.getParameterWithTypeList();
            for (BallerinaParameterWithType ballerinaParameterWithType : parameterWithTypeList) {
                PsiElement identifier = ballerinaParameterWithType.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createParameterLookupElement(identifier));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
            }
        }

        List<BallerinaDefaultableParameter> defaultableParameterList = formalParameterList
                .getDefaultableParameterList();
        for (BallerinaDefaultableParameter ballerinaDefaultableParameter : defaultableParameterList) {
            BallerinaParameter parameter = ballerinaDefaultableParameter.getParameter();
            List<BallerinaParameterWithType> parameterWithTypeList = parameter
                    .getParameterWithTypeList();
            for (BallerinaParameterWithType ballerinaParameterWithType : parameterWithTypeList) {
                PsiElement identifier = ballerinaParameterWithType.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createParameterLookupElement(identifier));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
            }
        }
        BallerinaRestParameter restParameter = formalParameterList.getRestParameter();
        if (restParameter != null) {
            PsiElement identifier = restParameter.getIdentifier();
            if (myResult != null) {
                myResult.addElement(BallerinaCompletionUtils.createParameterLookupElement(identifier));
            } else if (myElement.getText().equals(identifier.getText())) {
                add(identifier);
            }
        }

    }

    private void processResourceSignature(@NotNull PsiElement scopeElement) {
        BallerinaResourceDefinition ballerinaResourceDefinition = PsiTreeUtil.getParentOfType(scopeElement,
                BallerinaResourceDefinition.class);
        if (ballerinaResourceDefinition == null) {
            return;
        }
        BallerinaResourceParameterList resourceParameterList = ballerinaResourceDefinition.getResourceParameterList();
        if (resourceParameterList == null) {
            return;
        }
        BallerinaEndpointParameter endpointParameter = resourceParameterList.getEndpointParameter();
        if (endpointParameter != null) {
            PsiElement identifier = endpointParameter.getIdentifier();
            if (identifier != null) {
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createParameterLookupElement(identifier));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
            }
            BallerinaParameterList parameterList = endpointParameter.getParameterList();
            if (parameterList == null) {
                return;
            }
            List<BallerinaParameter> parameters = parameterList.getParameterList();
            for (BallerinaParameter parameter : parameters) {
                List<BallerinaParameterWithType> parameterWithTypeList = parameter.getParameterWithTypeList();
                for (BallerinaParameterWithType ballerinaParameterWithType : parameterWithTypeList) {
                     identifier = ballerinaParameterWithType.getIdentifier();
                    if (myResult != null) {
                        myResult.addElement(BallerinaCompletionUtils.createParameterLookupElement(identifier));
                    } else if (myElement.getText().equals(identifier.getText())) {
                        add(identifier);
                    }
                }
            }
        }
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
