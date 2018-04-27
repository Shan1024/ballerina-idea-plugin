package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;
import org.ballerinalang.plugins.idea.psi.BallerinaDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaServiceEndpointAttachments;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaUserDefineTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.jetbrains.annotations.NotNull;

public class BallerinaKeywordCompletionProvider extends CompletionProvider<CompletionParameters> {

    private int myPriority;
    private String[] myKeywords;

    public BallerinaKeywordCompletionProvider() {

    }

    public BallerinaKeywordCompletionProvider(int myPriority, String... myKeywords) {
        this.myPriority = myPriority;
        this.myKeywords = myKeywords;
    }

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        PsiElement position = parameters.getPosition();
        PsiElement parent = position.getParent();

        // Todo - Add bind
        //        if (parent instanceof BallerinaServiceEndpointAttachments) {
        //            if (parent.getFirstChild().equals(position)) {
        //                BallerinaCompletionUtils.addBindAsLookup(result);
        //                return;
        //            }
        //        }

        BallerinaExpression expression = PsiTreeUtil.getParentOfType(position, BallerinaExpression.class);
        if (expression != null) {
            BallerinaSimpleVariableReference simpleVariableReference = PsiTreeUtil.getParentOfType(position,
                    BallerinaSimpleVariableReference.class);
            if (simpleVariableReference != null) {
                while (parent != null) {
                    PsiElement superParent = parent.getParent();
                    if (!superParent.getFirstChild().equals(parent)) {
                        break;
                    }
                    parent = superParent;
                }
                // Todo - 'new' keyword in Object initialization
                // Todo - 'but' keyword in matching
                if (parent != null && parent.equals(expression)) {

                    PsiElement superParent = parent.getParent();
                    if(superParent!=null && superParent instanceof BallerinaVariableDefinitionStatement){
                        PsiElement type = BallerinaPsiImplUtil.getType(((BallerinaVariableDefinitionStatement)
                                superParent));
                        if(type!=null && type.getParent() instanceof BallerinaTypeDefinition){
                            BallerinaCompletionUtils.addNewAsLookup(result,type);
                            return;
                        }
                    }
                    BallerinaCompletionUtils.addExpressionKeywordsAsLookups(result);
                    return;
                }
            }
        }

        BallerinaStatement statement = PsiTreeUtil.getParentOfType(position, BallerinaStatement.class);
        if (statement != null) {
            BallerinaSimpleVariableReference simpleVariableReference = PsiTreeUtil.getParentOfType(position,
                    BallerinaSimpleVariableReference.class);
            if (simpleVariableReference != null) {
                while (parent != null) {
                    PsiElement superParent = parent.getParent();
                    if (!superParent.getFirstChild().equals(parent)) {
                        break;
                    }
                    parent = superParent;
                }
                if (parent != null && parent.equals(statement)) {
                    BallerinaCompletionUtils.addValueTypesAsLookups(result);
                    BallerinaCompletionUtils.addReferenceTypesAsLookups(result);
                    BallerinaCompletionUtils.addVarAsLookup(result);
                    BallerinaCompletionUtils.addReturnAsLookup(result);
                    BallerinaCompletionUtils.addLockAsLookup(result);
                    BallerinaCompletionUtils.addCommonKeywords(result);
                    return;
                }
            }
        }

        BallerinaGlobalVariableDefinition globalVariableDefinition = PsiTreeUtil.getParentOfType(position,
                BallerinaGlobalVariableDefinition.class);
        if (globalVariableDefinition != null) {

            // Todo - Consider situations where import statement is added after.
            BallerinaUserDefineTypeName userDefineTypeName = PsiTreeUtil.getParentOfType(position,
                    BallerinaUserDefineTypeName.class);
            if (userDefineTypeName != null) {
                while (parent != null) {
                    PsiElement superParent = parent.getParent();
                    if (!superParent.getFirstChild().equals(parent)) {
                        break;
                    }
                    parent = superParent;
                    if (superParent.equals(globalVariableDefinition)) {
                        break;
                    }
                }

                if (parent != null && parent.equals(globalVariableDefinition)) {
                    BallerinaCompletionUtils.addValueTypesAsLookups(result);
                    BallerinaCompletionUtils.addReferenceTypesAsLookups(result);
                }
            }

            BallerinaDefinition prevDefinition = PsiTreeUtil.getPrevSiblingOfType(globalVariableDefinition.getParent(),
                    BallerinaDefinition.class);

            if (prevDefinition == null) {
                BallerinaCompletionUtils.addPublicAsLookup(result);
                BallerinaCompletionUtils.addImportAsLookup(result);
                return;
            }
        }
    }
}
