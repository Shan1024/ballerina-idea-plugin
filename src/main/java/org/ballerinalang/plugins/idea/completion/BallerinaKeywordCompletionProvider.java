package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class BallerinaKeywordCompletionProvider extends CompletionProvider<CompletionParameters> {

    private final int myPriority;
    private final String[] myKeywords;

    public BallerinaKeywordCompletionProvider(int myPriority, String... myKeywords) {
        this.myPriority = myPriority;
        this.myKeywords = myKeywords;
    }

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        for (String myKeyword : myKeywords) {
            result.addElement(BallerinaCompletionUtils.createKeywordLookupElement(myKeyword));
        }
    }
}
