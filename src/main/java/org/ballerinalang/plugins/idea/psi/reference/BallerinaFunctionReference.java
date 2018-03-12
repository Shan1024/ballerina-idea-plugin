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

package org.ballerinalang.plugins.idea.psi.reference;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaFunctionIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

//public class BallerinaFunctionReference extends BallerinaCachedReference<BallerinaIdentifier> {
//
////    public BallerinaFunctionReference(PsiElement element, TextRange rangeInElement, boolean soft) {
////        super(element, rangeInElement, soft);
////    }
////
////    public BallerinaFunctionReference(PsiElement element, TextRange rangeInElement) {
////        super(element, rangeInElement);
////    }
////
////    public BallerinaFunctionReference(PsiElement element, boolean soft) {
////        super(element, soft);
////    }
//
//    public BallerinaFunctionReference(@NotNull BallerinaIdentifier element) {
//        // Note - Range should be 0 - length. Without this, error will occur.
////        this(element, new TextRange(0, element.getText().length()));
//        super(element);
//    }
//
//    @Nullable
//    @Override
//    protected PsiElement resolveInner() {
//
//        BallerinaFunctionProcessor p = new BallerinaFunctionProcessor(myElement, myElement,false) {
//            @Override
//            protected boolean crossOff(@NotNull PsiElement e) {
//                return /*e instanceof GoFieldDefinition ||*/ super.crossOff(e);
//            }
//        };
//        processResolveVariants(p);
//        return p.getResult();
//
////        return null;
//    }
//
//    @Override
//    public boolean processResolveVariants(@NotNull BallerinaScopeProcessor processor) {
//        ResolveState state = BallerinaPsiImplUtil.createContextOnElement(myElement);
//        processor.execute(myElement,state);
//        return false;
//    }
//
//    @NotNull
//    @Override
//    public Object[] getVariants() {
//        return new Object[0];
//    }
//}

public class BallerinaFunctionReference extends PsiReferenceBase {

    public BallerinaFunctionReference(PsiElement element, TextRange rangeInElement, boolean soft) {
        super(element, rangeInElement, soft);
    }

    public BallerinaFunctionReference(PsiElement element, TextRange rangeInElement) {
        super(element, rangeInElement);
    }

    public BallerinaFunctionReference(PsiElement element, boolean soft) {
        super(element, soft);
    }

    public BallerinaFunctionReference(@NotNull BallerinaIdentifier element) {
        // Note - Range should be 0 - length. Without this, error will occur.
        this(element, new TextRange(0, element.getText().length()));
        //        super(element);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        Project project = myElement.getProject();

        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement, BallerinaNameReference.class);

        if (nameReference == null) {
            return null;
        }

        Collection<BallerinaFunctionDefinition> elements;
        if (nameReference.isLocalPackageReference()) {
            GlobalSearchScope scope = GlobalSearchScope.fileScope(myElement.getContainingFile());
            elements = StubIndex.getElements(BallerinaFunctionIndex.KEY, myElement.getText(), project, scope,
                    BallerinaFunctionDefinition.class);
        } else {
            GlobalSearchScope scope = GlobalSearchScope.fileScope(myElement.getContainingFile());
            elements = StubIndex.getElements(BallerinaFunctionIndex.KEY, myElement.getText(), project, scope,
                    BallerinaFunctionDefinition.class);
        }
        if (elements.isEmpty()) {
            return null;
        }
        return ContainerUtil.getFirstItem(elements).getIdentifier();
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        GlobalSearchScope scope = GlobalSearchScope.fileScope(myElement.getContainingFile());

        Collection<String> keys = StubIndex.getInstance().getAllKeys(BallerinaFunctionIndex.KEY, project);

        return keys.toArray(new String[keys.size()]);
    }
}

