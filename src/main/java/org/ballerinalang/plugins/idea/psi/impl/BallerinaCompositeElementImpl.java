/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.ballerinalang.plugins.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import org.ballerinalang.plugins.idea.psi.BallerinaCompositeElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BallerinaCompositeElementImpl extends ASTWrapperPsiElement implements BallerinaCompositeElement {

    public BallerinaCompositeElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }

    @Override
    public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state,
                                       @Nullable PsiElement lastParent, @NotNull PsiElement place) {
        return processDeclarationsDefault(this, processor, state, lastParent, place);
    }

    public static boolean processDeclarationsDefault(@NotNull BallerinaCompositeElement o,
                                                     @NotNull PsiScopeProcessor processor,
                                                     @NotNull ResolveState state,
                                                     @Nullable PsiElement lastParent,
                                                     @NotNull PsiElement place) {
        //    if (o instanceof GoLeftHandExprList || o instanceof GoExpression) return true;
        //
        //    if (!o.shouldGoDeeper()) return processor.execute(o, state);
        //    if (!processor.execute(o, state)) return false;
        //    if ((
        //          o instanceof GoSwitchStatement ||
        //          o instanceof GoIfStatement ||
        //          o instanceof GoForStatement ||
        //          o instanceof GoCommClause ||
        //          o instanceof GoBlock ||
        //          o instanceof GoCaseClause
        //        )
        //        && processor instanceof GoScopeProcessorBase) {
        //      if (!PsiTreeUtil.isAncestor(o, ((GoScopeProcessorBase)processor).myOrigin, false)) return true;
        //    }
        //
        //    return o instanceof GoBlock
        //           ? processBlock((GoBlock)o, processor, state, lastParent, place)
        //           : ResolveUtil.processChildren(o, processor, state, lastParent, place);
        return false;
    }

    //    private static boolean processBlock(@NotNull GoBlock o,
    //                                        @NotNull PsiScopeProcessor processor,
    //                                        @NotNull ResolveState state,
    //                                        @Nullable PsiElement lastParent, @NotNull PsiElement place) {
    //        return ResolveUtil.processChildrenFromTop(o, processor, state, lastParent, place) && processParameters(o,
    //                processor);
    //    }
    //
    //    private static boolean processParameters(@NotNull GoBlock b, @NotNull PsiScopeProcessor processor) {
    //        if (processor instanceof GoScopeProcessorBase && b.getParent() instanceof GoSignatureOwner) {
    //            return GoPsiImplUtil.processSignatureOwner((GoSignatureOwner) b.getParent(), (GoScopeProcessorBase)
    // processor);
    //        }
    //        return true;
    //    }

    @Override
    public boolean shouldGoDeeper() {
        return true;
    }
}
