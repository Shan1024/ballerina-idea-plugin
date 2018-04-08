package org.ballerinalang.plugins.idea.marker;

import com.intellij.codeHighlighting.Pass;
import com.intellij.codeInsight.daemon.DaemonBundle;
import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProviderDescriptor;
import com.intellij.codeInsight.daemon.impl.PsiElementListNavigator;
import com.intellij.icons.AllIcons;
import com.intellij.ide.util.MethodCellRenderer;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.markup.GutterIconRenderer;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.FunctionUtil;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitBody;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectCallableUnitSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class BallerinaTypeFunctionMarker extends LineMarkerProviderDescriptor {


    private final Option myOverriddenOption = new Option("ballerina.overridden", "Overridden function",
            AllIcons.Gutter.OverridenMethod);
    private final Option myImplementedOption = new Option("ballerina.implemented", "Implemented function",
            AllIcons.Gutter.ImplementedMethod);

    @Nullable
    @Override
    public LineMarkerInfo getLineMarkerInfo(@NotNull PsiElement element) {
        return null;
    }

    @Override
    public void collectSlowLineMarkers(@NotNull List<PsiElement> elements, @NotNull Collection<LineMarkerInfo> result) {
        // This is used to prevent adding multiple line markers to the same line.
        Set<Integer> lines = ContainerUtil.newHashSet();
        for (PsiElement element : elements) {

            if (!(element instanceof BallerinaIdentifier)) {
                continue;
            }

            PsiElement parent = element.getParent();
            if (parent instanceof BallerinaObjectCallableUnitSignature) {
                if (parent.getNextSibling() instanceof BallerinaCallableUnitBody) {
                    continue;
                }
                addMarker(result, lines, element, true);
            } else if (parent instanceof BallerinaCallableUnitSignature) {
                BallerinaFunctionDefinition ballerinaFunctionDefinition = PsiTreeUtil.getParentOfType(parent,
                        BallerinaFunctionDefinition.class);
                if (ballerinaFunctionDefinition == null) {
                    continue;
                }
                if (ballerinaFunctionDefinition.getAttachedObject() == null) {
                    continue;
                }
                addMarker(result, lines, element, false);
            }
        }
    }

    private void addMarker(@NotNull Collection<LineMarkerInfo> result, Set<Integer> lines, PsiElement element,
                           boolean isOverridden) {
        // Get the document manager;
        PsiDocumentManager documentManager = PsiDocumentManager.getInstance(element.getProject());
        // Get the document.
        Document document = documentManager.getDocument(element.getContainingFile());
        if (document == null) {
            return;
        }

        // Get the offset of the current element.
        int textOffset = element.getTextOffset();
        // Get the line number of the current element.
        int lineNumber = document.getLineNumber(textOffset);

        if (!lines.contains(lineNumber)) {
            // Add the number to the set.
            lines.add(lineNumber);
            // Return a new line marker.
            if (isOverridden) {
                result.add(new BallerinaImplementedFunctionMarkerInfo(element));
            } else {
                result.add(new BallerinaImplementingFunctionMarkerInfo(element));
            }
        }
    }

    @Nullable
    @Override
    public String getName() {
        return "Ballerina Line Markers";
    }

    private static class BallerinaImplementedFunctionMarkerInfo extends LineMarkerInfo<PsiElement> {
        private BallerinaImplementedFunctionMarkerInfo(@NotNull PsiElement methodCall) {
            super(methodCall,
                    methodCall.getTextRange(),
                    AllIcons.Gutter.ImplementedMethod,
                    Pass.LINE_MARKERS,
                    FunctionUtil.constant("Implemented function"),
                    (e, elt) -> {
                        // Todo - Update navigation
                        navigateToOverridingMethod(e, ((NavigatablePsiElement) methodCall)/*, method != element
                        .getParent()*/);
                    }, GutterIconRenderer.Alignment.RIGHT
            );
        }
    }

    private static class BallerinaImplementingFunctionMarkerInfo extends LineMarkerInfo<PsiElement> {
        private BallerinaImplementingFunctionMarkerInfo(@NotNull PsiElement methodCall) {
            super(methodCall,
                    methodCall.getTextRange(),
                    AllIcons.Gutter.ImplementingMethod,
                    Pass.LINE_MARKERS,
                    FunctionUtil.constant("Implementing function"),
                    (e, elt) -> {
                        // Todo - Update navigation
                        navigateToOverridingMethod(e, ((NavigatablePsiElement) methodCall)/*, method != element
                        .getParent()*/);
                    }, GutterIconRenderer.Alignment.RIGHT
            );
        }
    }

    private static void navigateToOverridingMethod(MouseEvent e, @NotNull NavigatablePsiElement method/*, boolean
    acceptSelf*/) {
        PsiElementListNavigator.openTargets(e, new NavigatablePsiElement[]{method},
                DaemonBundle.message("navigation.title.super.method", method.getText()),
                DaemonBundle.message("navigation.findUsages.title.super.method", method.getText()),
                new MethodCellRenderer(true));
    }
}
