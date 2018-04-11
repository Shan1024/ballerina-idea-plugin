package org.ballerinalang.plugins.idea.codeinsight.template.postfix;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplateProvider;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class BallerinaPostfixTemplateProvider implements PostfixTemplateProvider {

    private final Set<PostfixTemplate> templates;

    public BallerinaPostfixTemplateProvider() {
        templates = ContainerUtil.newHashSet(new MatchPostfixTemplate("match"));
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }

    @Override
    public boolean isTerminalSymbol(char currentChar) {
        return currentChar == '.';
    }

    @Override
    public void preExpand(@NotNull PsiFile file, @NotNull Editor editor) {

    }

    @Override
    public void afterExpand(@NotNull PsiFile file, @NotNull Editor editor) {

    }

    @NotNull
    @Override
    public PsiFile preCheck(@NotNull PsiFile copyFile, @NotNull Editor realEditor, int currentOffset) {
        Document document = copyFile.getViewProvider().getDocument();
        assert document != null;
        CharSequence sequence = document.getCharsSequence();
        StringBuilder fileContentWithSemicolon = new StringBuilder(sequence);
        //        if (isSemicolonNeeded(copyFile, realEditor)) {
        //            fileContentWithSemicolon.insert(currentOffset, ';');
        //            return PostfixLiveTemplate.copyFile(copyFile, fileContentWithSemicolon);
        //        }

        return copyFile;
    }
}
