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
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaFieldDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFormalParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaLambdaFunction;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectBody;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaParameterWithType;
import org.ballerinalang.plugins.idea.psi.BallerinaPrivateObjectFields;
import org.ballerinalang.plugins.idea.psi.BallerinaPublicObjectFields;
import org.ballerinalang.plugins.idea.psi.BallerinaResourceDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaResourceParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaRestParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaTupleDestructuringStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReferenceList;
import org.ballerinalang.plugins.idea.psi.BallerinaWorkerDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BallerinaBlockProcessor extends BallerinaScopeProcessorBase {

    @Nullable
    private final CompletionResultSet myResult;
    @NotNull
    private final PsiElement myElement;
    private int count;

    public BallerinaBlockProcessor(@Nullable CompletionResultSet result, @NotNull PsiElement element,
                                   boolean isCompletion) {
        super(element, element, isCompletion);
        myResult = result;
        myElement = element;
    }

    @Override
    public boolean execute(@NotNull PsiElement scopeElement, @NotNull ResolveState state) {
        if (accept(scopeElement)) {
            BallerinaBlock block = (BallerinaBlock) scopeElement;

            while (block != null) {
                // Check for workers in all blocks.
                List<BallerinaWorkerDefinition> ballerinaWorkerDefinitions = PsiTreeUtil.getChildrenOfTypeAsList(block,
                        BallerinaWorkerDefinition.class);
                for (BallerinaWorkerDefinition ballerinaWorkerDefinition : ballerinaWorkerDefinitions) {
                    PsiElement identifier = ballerinaWorkerDefinition.getIdentifier();
                    if (identifier == null) {
                        continue;
                    }
                    if (myResult != null) {
                        myResult.addElement(BallerinaCompletionUtils.createWorkerLookupElement(identifier));
                    } else if (myElement.getText().equals(identifier.getText())) {
                        add(identifier);
                    }
                }
                // Check endpoints in the current block.
                List<BallerinaEndpointDefinition> ballerinaEndpointDefinitions = PsiTreeUtil.getChildrenOfTypeAsList
                        (block, BallerinaEndpointDefinition.class);
                for (BallerinaEndpointDefinition ballerinaEndpointDefinition : ballerinaEndpointDefinitions) {
                    PsiElement identifier = ballerinaEndpointDefinition.getIdentifier();
                    if (identifier == null) {
                        continue;
                    }
                    if (myResult != null) {
                        myResult.addElement(BallerinaCompletionUtils.createEndpointLookupElement(identifier));
                    } else if (myElement.getText().equals(identifier.getText())) {
                        add(identifier);
                    }
                }

                // Check for enclosing lambda function.
                BallerinaLambdaFunction ballerinaLambdaFunction = PsiTreeUtil.getParentOfType(block,
                        BallerinaLambdaFunction.class);
                if (ballerinaLambdaFunction != null) {
                    BallerinaFormalParameterList formalParameterList = ballerinaLambdaFunction.getFormalParameterList();
                    if (formalParameterList != null) {
                        processFormalParameterList(formalParameterList);
                    }
                }

                // Get variable definitions from statements.
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

                    } else if (firstChild instanceof BallerinaAssignmentStatement) {
                        BallerinaVariableReference variableReference = ((BallerinaAssignmentStatement) firstChild)
                                .getVariableReference();
                        if (variableReference instanceof BallerinaSimpleVariableReference) {
                            BallerinaNameReference nameReference = ((BallerinaSimpleVariableReference)
                                    variableReference).getNameReference();
                            PsiElement identifier = nameReference.getIdentifier();
                            if (myResult != null) {
                                myResult.addElement(BallerinaCompletionUtils.createVariableLookupElement(identifier));
                            } else if (myElement.getText().equals(identifier.getText())) {
                                add(identifier);
                            }
                        }
                    } else if (firstChild instanceof BallerinaTupleDestructuringStatement) {
                        BallerinaVariableReferenceList variableReferenceList =
                                ((BallerinaTupleDestructuringStatement) firstChild).getVariableReferenceList();
                        if (variableReferenceList != null) {
                            List<BallerinaVariableReference> referenceList =
                                    variableReferenceList.getVariableReferenceList();

                            for (BallerinaVariableReference ballerinaVariableReference : referenceList) {
                                if (ballerinaVariableReference instanceof BallerinaSimpleVariableReference) {
                                    BallerinaNameReference nameReference = ((BallerinaSimpleVariableReference)
                                            ballerinaVariableReference).getNameReference();
                                    PsiElement identifier = nameReference.getIdentifier();
                                    if (myResult != null) {
                                        myResult.addElement(BallerinaCompletionUtils.createVariableLookupElement
                                                (identifier));
                                    } else if (myElement.getText().equals(identifier.getText())) {
                                        add(identifier);
                                    }
                                }
                            }
                        }
                    }
                }

                count++;

                if (!isCompletion() && getResult() != null) {
                    return false;
                }

                block = PsiTreeUtil.getParentOfType(block, BallerinaBlock.class);
            }

            // Todo - check return value and continue only if needed
            processObjectFields(scopeElement);
            if (!isCompletion() && getResult() != null) {
                return false;
            }
            processFunctionSignature(scopeElement);
            if (!isCompletion() && getResult() != null) {
                return false;
            }
            processResourceSignature(scopeElement);
        }
        return true;
    }

    private void processObjectFields(@NotNull PsiElement scopeElement) {
        BallerinaObjectFunctionDefinition ballerinaObjectFunctionDefinition = PsiTreeUtil.getParentOfType(scopeElement,
                BallerinaObjectFunctionDefinition.class);
        if (ballerinaObjectFunctionDefinition == null) {
            return;
        }

        BallerinaObjectBody ballerinaObjectBody = PsiTreeUtil.getParentOfType(ballerinaObjectFunctionDefinition,
                BallerinaObjectBody.class);
        if (ballerinaObjectBody == null) {
            return;
        }

        BallerinaTypeDefinition ballerinaTypeDefinition = PsiTreeUtil.getParentOfType(ballerinaObjectBody,
                BallerinaTypeDefinition.class);
        if (ballerinaTypeDefinition == null || ballerinaTypeDefinition.getIdentifier() == null) {
            return;
        }

        BallerinaPublicObjectFields publicObjectFields = ballerinaObjectBody.getPublicObjectFields();
        if (publicObjectFields != null) {
            List<BallerinaFieldDefinition> fieldDefinitionList = publicObjectFields.getFieldDefinitionList();
            for (BallerinaFieldDefinition ballerinaFieldDefinition : fieldDefinitionList) {
                PsiElement identifier = ballerinaFieldDefinition.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createFieldLookupElement(identifier,
                            ballerinaTypeDefinition.getIdentifier(), ballerinaFieldDefinition.getTypeName().getText(),
                            true));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
            }
        }
        BallerinaPrivateObjectFields privateObjectFields = ballerinaObjectBody.getPrivateObjectFields();
        if (privateObjectFields != null) {
            List<BallerinaFieldDefinition> fieldDefinitionList = privateObjectFields.getFieldDefinitionList();
            for (BallerinaFieldDefinition ballerinaFieldDefinition : fieldDefinitionList) {
                PsiElement identifier = ballerinaFieldDefinition.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createFieldLookupElement(identifier,
                            ballerinaTypeDefinition.getIdentifier(), ballerinaFieldDefinition.getTypeName().getText(),
                            false));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
            }
        }
    }

    private void processFunctionSignature(@NotNull PsiElement scopeElement) {
        BallerinaFunctionDefinition ballerinaFunctionDefinition = PsiTreeUtil.getParentOfType(scopeElement,
                BallerinaFunctionDefinition.class);
        if (ballerinaFunctionDefinition == null) {
            return;
        }
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        if (callableUnitSignature == null) {
            return;
        }
        BallerinaFormalParameterList formalParameterList = callableUnitSignature.getFormalParameterList();
        if (formalParameterList == null) {
            return;
        }
        processFormalParameterList(formalParameterList);
    }

    private void processFormalParameterList(BallerinaFormalParameterList formalParameterList) {
        processParameterList(formalParameterList.getParameterList());

        List<BallerinaDefaultableParameter> defaultableParameterList =
                formalParameterList.getDefaultableParameterList();
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

    private void processParameterList(List<BallerinaParameter> parameterList) {
        for (BallerinaParameter parameter : parameterList) {
            List<BallerinaParameterWithType> parameterWithTypeList = parameter.getParameterWithTypeList();
            for (BallerinaParameterWithType ballerinaParameterWithType : parameterWithTypeList) {
                PsiElement identifier = ballerinaParameterWithType.getIdentifier();
                if (myResult != null) {
                    myResult.addElement(BallerinaCompletionUtils.createParameterLookupElement(identifier));
                } else if (myElement.getText().equals(identifier.getText())) {
                    add(identifier);
                }
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
            processParameterList(parameterList.getParameterList());
        }
    }

    protected boolean accept(@NotNull PsiElement element) {
        return element instanceof BallerinaBlock;
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
