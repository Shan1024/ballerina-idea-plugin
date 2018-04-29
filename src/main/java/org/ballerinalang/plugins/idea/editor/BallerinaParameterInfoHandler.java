/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.ballerinalang.plugins.idea.editor;

import com.intellij.codeInsight.CodeInsightBundle;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.parameterInfo.CreateParameterInfoContext;
import com.intellij.lang.parameterInfo.ParameterInfoContext;
import com.intellij.lang.parameterInfo.ParameterInfoHandlerWithTabActionSupport;
import com.intellij.lang.parameterInfo.ParameterInfoUIContext;
import com.intellij.lang.parameterInfo.UpdateParameterInfoContext;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ArrayUtil;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaDefaultableParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaExpressionList;
import org.ballerinalang.plugins.idea.psi.BallerinaFormalParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionInvocation;
import org.ballerinalang.plugins.idea.psi.BallerinaInvocationArg;
import org.ballerinalang.plugins.idea.psi.BallerinaInvocationArgList;
import org.ballerinalang.plugins.idea.psi.BallerinaParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaRestParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Provides parameter info support.
 */
public class BallerinaParameterInfoHandler implements ParameterInfoHandlerWithTabActionSupport {

    @NotNull
    @Override
    public PsiElement[] getActualParameters(@NotNull PsiElement o) {
        return new PsiElement[0];
    }

    @NotNull
    @Override
    public IElementType getActualParameterDelimiterType() {
        return BallerinaTypes.COMMA;
    }

    @NotNull
    @Override
    public IElementType getActualParametersRBraceType() {
        return BallerinaTypes.RIGHT_PARENTHESIS;
    }

    @NotNull
    @Override
    public Set<Class> getArgumentListAllowedParentClasses() {
        return ContainerUtil.newHashSet();
    }

    @NotNull
    @Override
    public Set<? extends Class> getArgListStopSearchClasses() {
        return ContainerUtil.newHashSet();
    }

    @NotNull
    @Override
    public Class getArgumentListClass() {
        return BallerinaExpressionList.class;
    }

    @Override
    public boolean couldShowInLookup() {
        return true;
    }

    @Nullable
    @Override
    public Object[] getParametersForLookup(LookupElement item, ParameterInfoContext context) {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Nullable
    @Override
    public Object[] getParametersForDocumentation(Object p, ParameterInfoContext context) {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Nullable
    @Override
    public Object findElementForParameterInfo(@NotNull CreateParameterInfoContext context) {
        return findElement(context);
    }

    @Nullable
    private Object findElement(@NotNull ParameterInfoContext context) {
        PsiElement element = context.getFile().findElementAt(context.getOffset());
        if (element == null) {
            return null;
        }
        PsiElement prevElement = context.getFile().findElementAt(context.getOffset() - 1);
        return findElement(element, prevElement);
    }

    @Nullable
    public static Object findElement(@NotNull PsiElement element, @Nullable PsiElement prevElement) {
        // Return the element in the same file. Otherwise the hit will not be shown.
        BallerinaFunctionInvocation functionInvocation = PsiTreeUtil.getParentOfType(element,
                BallerinaFunctionInvocation.class);
        if (functionInvocation != null) {
            return functionInvocation;
        }
        return null;
    }

    @Override
    public void showParameterInfo(@NotNull Object element, @NotNull CreateParameterInfoContext context) {
        if (element instanceof BallerinaFunctionInvocation) {
            BallerinaFunctionInvocation functionInvocation = (BallerinaFunctionInvocation) element;
            BallerinaCallableUnitSignature callableUnitSignature =
                    BallerinaPsiImplUtil.getCallableUnitSignature(functionInvocation);
            if (callableUnitSignature != null) {
                BallerinaFormalParameterList formalParameterList = callableUnitSignature.getFormalParameterList();
                if (formalParameterList == null) {
                    context.setItemsToShow(new Object[]{"Empty"});
                } else {
                    context.setItemsToShow(new Object[]{formalParameterList});
                }
                context.showHint(functionInvocation, functionInvocation.getTextOffset(), this);
            }
        }
    }

    @Nullable
    @Override
    public Object findElementForUpdatingParameterInfo(@NotNull UpdateParameterInfoContext context) {
        return findElement(context);
    }

    @Override
    public void updateParameterInfo(@NotNull Object o, @NotNull UpdateParameterInfoContext context) {
        context.setPreservedOnHintHidden(false);
        int index = getCurrentParameterIndex(o, context.getOffset());
        if (index != -1) {
            context.setCurrentParameter(index);
        }
    }

    public static int getCurrentParameterIndex(@NotNull Object o, int offset) {
        if (o instanceof BallerinaFunctionInvocation) {
            BallerinaFunctionInvocation functionInvocation = (BallerinaFunctionInvocation) o;
            int index = 0;
            BallerinaInvocationArgList invocationArgs = functionInvocation.getInvocationArgList();
            if (invocationArgs != null) {
                List<BallerinaInvocationArg> invocationArgList = invocationArgs.getInvocationArgList();
                for (BallerinaInvocationArg arg : invocationArgList) {
                    TextRange textRange = arg.getTextRange();
                    if (textRange.getStartOffset() <= offset && offset <= textRange.getEndOffset()) {
                        return index;
                    }
                    index++;
                }
            }
        }
        return -1;
    }

    @Nullable
    @Override
    public String getParameterCloseChars() {
        return "(,";
    }

    @Override
    public boolean tracksParameterIndex() {
        return true;
    }

    @Override
    public void updateUI(Object p, @NotNull ParameterInfoUIContext context) {
        updatePresentation(p, context);
    }

    public static String updatePresentation(Object p, @NotNull ParameterInfoUIContext context) {

        System.out.println("x");

        //        // This method contains the logic which we use to show the parameters in the popup.
        //        // The object should be of type ParameterListNode. This method will be called for each element we
        // set using the
        //        // context.getItemsToShow() in showParameterInfo method.
        if (p instanceof BallerinaFormalParameterList) {
            // Caste the object.
            BallerinaFormalParameterList formalParameterList = (BallerinaFormalParameterList) p;

            List<BallerinaParameter> parameterList = formalParameterList.getParameterList();
            List<BallerinaDefaultableParameter> defaultableParameterList =
                    formalParameterList.getDefaultableParameterList();
            BallerinaRestParameter restParameter = formalParameterList.getRestParameter();

            // Get the parameter presentations.
            List<String> parameterPresentations = getParameterPresentations(formalParameterList);
            // These will be used to identify which parameter is selected. This will be highlighted in the popup.
            int start = 0;
            int end = 0;
            StringBuilder builder = new StringBuilder();
            // If there are no parameter nodes, set "no parameters" message.
            if (parameterPresentations.isEmpty()) {
                builder.append(CodeInsightBundle.message("parameter.info.no.parameters"));
            } else {
                boolean paramFound = false;
                // Get the current parameter index.
                int selected = context.getCurrentParameterIndex();
                // Iterate through each parameter presentation.
                for (int i = 0; i < parameterPresentations.size(); i++) {
                    // If i != 0, we need to add the , between parameters.
                    if (i != 0) {
                        builder.append(", ");
                    }

                    //                    if (i < parameterList.size()) {
                    //                        if (i == selected) {
                    //                            start = builder.length();
                    //                        }
                    //                    } else {
                    if (i == selected || (!paramFound && i >= parameterList.size())) {
                        start = builder.length();
                        paramFound = true;
                    }
                    //                    }
                    //                    // If the current parameter is the selected parameter, get the start index.
                    //                    if (i == selected && i < parameterList.size()) {
                    //                        start = builder.length();
                    //                    } else if (start == 0 && i > parameterList.size()) {
                    //                        start = builder.length();
                    //                    }
                    // Append the parameter.
                    builder.append(parameterPresentations.get(i));
                    // If the current parameter is the selected parameter, get the end index.
                    if (i == selected) {
                        end = builder.length();
                    }
                }
            }
            if (end == 0) {
                end = builder.length();
            }
            // Call setupUIComponentPresentation with necessary arguments.
            return context.setupUIComponentPresentation(builder.toString(), start, end, false, false, false,
                    context.getDefaultParameterColor());
        }
        return context.setupUIComponentPresentation(CodeInsightBundle.message("parameter.info.no.parameters"), 0, 0,
                false, false, false,
                context.getDefaultParameterColor());
    }

    /**
     * Creates a list of parameter presentations.
     *
     * @param node BallerinaFormalParameterList which contains the parameters
     * @return list of parameter presentations
     */
    public static List<String> getParameterPresentations(BallerinaFormalParameterList node) {
        List<String> params = new LinkedList<>();
        if (node == null) {
            return params;
        }
        // Get parameter nodes.
        List<BallerinaParameter> parameterList = node.getParameterList();
        for (BallerinaParameter parameter : parameterList) {
            params.add(formatParameter(parameter.getText()));
        }

        List<BallerinaDefaultableParameter> defaultableParameterList = node.getDefaultableParameterList();
        for (BallerinaDefaultableParameter parameter : defaultableParameterList) {
            params.add(formatParameter(parameter.getText()));
        }

        BallerinaRestParameter restParameter = node.getRestParameter();
        if (restParameter != null) {
            params.add(formatParameter(restParameter.getText()));
        }
        return params;
    }

    /**
     * Removes excess spaces in the provided string. This is used to format parameters and types.
     *
     * @param text text to be formatted
     * @return formatted string.
     */
    public static String formatParameter(String text) {
        return text.trim().replaceAll("\\s+", " ").replaceAll("( )?\\[ ]", "[]");
    }
}
