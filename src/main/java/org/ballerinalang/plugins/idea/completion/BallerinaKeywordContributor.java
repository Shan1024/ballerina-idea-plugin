package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.openapi.project.DumbAware;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;
import org.ballerinalang.plugins.idea.psi.BallerinaDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;

import static com.intellij.patterns.PlatformPatterns.*;

public class BallerinaKeywordContributor extends CompletionContributor implements DumbAware{

    public BallerinaKeywordContributor() {
        extend(CompletionType.BASIC,importPattern(), new BallerinaKeywordCompletionProvider(BallerinaCompletionUtils
                .KEYWORDS_PRIORITY, "import"));
//        extend(CompletionType.BASIC,importPattern(), new BallerinaKeywordCompletionProvider(BallerinaCompletionUtils
//                .KEYWORDS_PRIORITY, "if"));
    }

//    public PsiElementPattern.Capture<PsiElement> importPattern() {
//        return  psiElement().and(psiElement().inside(BallerinaGlobalVariableDefinition.class));
//    }

    public PsiElementPattern.Capture<PsiElement> importPattern() {
        return  psiElement().inside(BallerinaDefinition.class);
    }

    public PsiElementPattern.Capture<PsiElement> afterElseKeyword() {
        return psiElement().inside(BallerinaGlobalVariableDefinition.class);
    }
}
