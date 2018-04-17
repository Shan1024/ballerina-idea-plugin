package org.ballerinalang.plugins.idea.codeinsight.template.postfix;

import com.intellij.codeInsight.template.Template;
import com.intellij.codeInsight.template.impl.MacroCallNode;
import com.intellij.codeInsight.template.impl.VariableNode;
import com.intellij.codeInsight.template.macro.IterableComponentTypeMacro;
import com.intellij.codeInsight.template.macro.SuggestVariableNameMacro;
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.psi.PsiElement;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaUnionTypeName;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static org.ballerinalang.plugins.idea.codeinsight.template.postfix.BallerinaPostfixUtils.IS_ITERABLE_OR_ARRAY;
import static org.ballerinalang.plugins.idea.codeinsight.template.postfix.BallerinaPostfixUtils.getType;
import static org.ballerinalang.plugins.idea.codeinsight.template.postfix.BallerinaPostfixUtils.selectorTopmost;

public class MatchPostfixTemplate extends StringBasedPostfixTemplate {

    public MatchPostfixTemplate(String name) {
        super(name, "match expr { }", selectorTopmost(IS_ITERABLE_OR_ARRAY));
    }

    @Override
    public void setVariables(@NotNull Template template, @NotNull PsiElement element) {
        MacroCallNode node = new MacroCallNode(new IterableComponentTypeMacro());
        MacroCallNode name = new MacroCallNode(new SuggestVariableNameMacro());
        node.addParameter(new VariableNode("expr", null));
        //        template.addVariable("type", type, type, false);
        PsiElement type = getType(element);
        if (type != null && type instanceof BallerinaUnionTypeName) {
            BallerinaUnionTypeName ballerinaUnionTypeName = (BallerinaUnionTypeName) type;
            List<BallerinaTypeName> typeNameList = ballerinaUnionTypeName.getTypeNameList();
            // Todo - Consider package as well.
            for (int i = 0; i < typeNameList.size(); i++) {
                template.addVariable("name" + i, name, name, true);
                template.addVariable("value" + i, name, name, true);
            }
        }
    }

    @Override
    public String getTemplateString(@NotNull PsiElement element) {
        StringBuilder template = new StringBuilder("match $expr$ {\n");
        PsiElement type = getType(element);
        if (type != null && type instanceof BallerinaUnionTypeName) {
            BallerinaUnionTypeName ballerinaUnionTypeName = (BallerinaUnionTypeName) type;
            List<BallerinaTypeName> typeNameList = ballerinaUnionTypeName.getTypeNameList();

            for (int i = 0; i < typeNameList.size(); i++) {
                template.append("    ").append(typeNameList.get(i).getText()).append(" $name").append(i)
                        .append("$ => {\n").append("$value").append(i).append("$").append("\n}");
                if (i != typeNameList.size() - 1) {
                    template.append("\n");
                }
            }
        } else {
            template.append("$END$");
        }
        return template.append("    \n}").toString();
    }
}
