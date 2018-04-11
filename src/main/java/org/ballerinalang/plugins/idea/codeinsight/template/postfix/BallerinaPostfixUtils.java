package org.ballerinalang.plugins.idea.codeinsight.template.postfix;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplateExpressionSelector;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplateExpressionSelectorBase;
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.Condition;
import com.intellij.psi.CommonClassNames;
import com.intellij.psi.PsiArrayType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiExpression;
import com.intellij.psi.PsiExpressionStatement;
import com.intellij.psi.PsiType;
import com.intellij.psi.util.InheritanceUtil;
import com.intellij.psi.util.PsiExpressionTrimRenderer;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.Function;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaExpressionStmt;
import org.ballerinalang.plugins.idea.psi.BallerinaUnionTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReferenceExpression;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.intellij.openapi.util.Conditions.and;

public class BallerinaPostfixUtils {

    public static PostfixTemplateExpressionSelector selectorTopmost(Condition<PsiElement> additionalFilter) {

        return new PostfixTemplateExpressionSelectorBase(additionalFilter) {
            @Override
            protected List<PsiElement> getNonFilteredExpressions(@NotNull PsiElement context,
                                                                 @NotNull Document document, int offset) {
                return ContainerUtil.createMaybeSingletonList(getTopmostExpression(context));
            }

            @Override
            protected Condition<PsiElement> getFilters(int offset) {
                return and(super.getFilters(offset), getPsiErrorFilter());
            }

            @NotNull
            @Override
            public Function<PsiElement, String> getRenderer() {
                return BallerinaPostfixUtils.getRenderer();
            }
        };
    }

    @NotNull
    public static Function<PsiElement, String> getRenderer() {
        return element -> {
            return new RenderFunction().fun((BallerinaExpression) element);
        };
    }

    public static final Condition<PsiElement> IS_ITERABLE_OR_ARRAY = element ->
            getType(element) instanceof BallerinaUnionTypeName;

    //    @Contract("null -> false")
    //    public static boolean isIterable(@Nullable PsiType type) {
    //        return type != null && InheritanceUtil.isInheritor(type, CommonClassNames.JAVA_LANG_ITERABLE);
    //    }
    //
    //    @Contract("null -> false")
    //    public static boolean isArray(@Nullable PsiType type) {
    //        return type != null && type instanceof PsiArrayType;
    //    }

    @Nullable
    public static PsiElement getType(PsiElement context) {
        if (!(context instanceof BallerinaVariableReferenceExpression)) {
            return null;
        }
        return ((BallerinaVariableReferenceExpression) context).getVariableReference().getType();
    }

    @Nullable
    public static BallerinaExpression getTopmostExpression(PsiElement context) {
        BallerinaExpressionStmt statement = PsiTreeUtil.getNonStrictParentOfType(context,
                BallerinaExpressionStmt.class);
        return statement != null ? statement.getExpression() : null;
    }


    public static class RenderFunction implements Function<BallerinaExpression, String> {
        @Override
        public String fun(BallerinaExpression psiExpression) {
            return render(psiExpression);
        }
    }

    public static String render(BallerinaExpression expression) {
        return render(expression, 100);
    }

    public static String render(BallerinaExpression expression, int maxLength) {
        //        StringBuilder buf = new StringBuilder();
        //        expression.accept(new PsiExpressionTrimRenderer(buf));
        //        final String text = buf.toString();
        //        int firstNewLinePos = text.indexOf('\n');
        //        String trimmedText = text.substring(0, firstNewLinePos != -1 ? firstNewLinePos : Math.min
        // (maxLength, text.length()));
        //        if (trimmedText.length() != text.length()) trimmedText += " ...";
        return expression.getText();
    }
}