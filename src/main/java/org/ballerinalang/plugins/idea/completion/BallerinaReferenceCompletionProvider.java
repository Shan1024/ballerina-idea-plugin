package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class BallerinaReferenceCompletionProvider extends CompletionProvider<CompletionParameters> {

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        //        System.out.println("XXXXX");
    }
}
