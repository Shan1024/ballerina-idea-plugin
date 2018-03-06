package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaFunctionIndex;
import org.jetbrains.annotations.NotNull;

public class BallerinaReferenceCompletionProvider extends CompletionContributor {

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        Project project = parameters.getOriginalFile().getProject();
        StubIndex.getElements(BallerinaFunctionIndex.KEY, "test", project, GlobalSearchScope.allScope(project),
                BallerinaFunctionDefinition.class);
    }
}
