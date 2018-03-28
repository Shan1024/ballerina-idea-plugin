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

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaElementFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BallerinaPackageNameReference extends BallerinaCachedReference<BallerinaIdentifier> {

    private PsiReference reference;

    public BallerinaPackageNameReference(@NotNull BallerinaIdentifier element, PsiReference reference) {
        super(element);
        this.reference = reference;
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        // Todo - Update rename logic to consider only the last part of the name (after the last ".").
        myElement.replace(BallerinaElementFactory.createIdentifierFromText(myElement.getProject(), newElementName));
        return myElement;
    }

    @Nullable
    @Override
    public PsiElement resolveInner() {
        //        Project project = myElement.getProject();
        //
        //        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement,
        // BallerinaNameReference.class);
        //
        //        if (nameReference == null) {
        //            return null;
        //        }
        //
        //        Collection<BallerinaFunctionDefinition> elements;
        //
        //        if (nameReference.isReferenceToLocalPackage()) {
        //
        //            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
        //            PsiDirectory parent = originalFile.getParent();
        //            if (parent == null) {
        //                return null;
        //            }
        //            List<VirtualFile> virtualFiles = Arrays.asList(parent.getVirtualFile().getChildren());
        //
        //            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
        //            elements = StubIndex.getElements(BallerinaFunctionIndex.KEY, myElement.getText(), project, scope,
        //                    BallerinaFunctionDefinition.class);
        //        } else {
        //            // Todo - Get files in the corresponding package.
        //            // Todo - Filter public elements? Or show a warning?
        //            // Todo - Consider package version.
        //            GlobalSearchScope scope = GlobalSearchScope.fileScope(myElement.getContainingFile());
        //            elements = StubIndex.getElements(BallerinaFunctionIndex.KEY, myElement.getText(), project, scope,
        //                    BallerinaFunctionDefinition.class);
        //        }
        //        BallerinaFunctionDefinition firstItem = ContainerUtil.getFirstItem(elements);
        //        if (elements.isEmpty() || firstItem == null) {
        //            return null;
        //        }
        //        return firstItem.getIdentifier();


        return reference.resolve();
//        return null;
    }

//    @Override
//    public boolean isReferenceTo(PsiElement element) {
//        return true;
//    }

    @NotNull
    @Override
    public Object[] getVariants() {
        //        Project project = myElement.getProject();
        //        GlobalSearchScope scope = GlobalSearchScope.fileScope(myElement.getContainingFile());
        //
        //        Collection<String> keys = StubIndex.getInstance().getAllKeys(BallerinaFunctionIndex.KEY, project);

        //        return keys.toArray(new String[keys.size()]);
        return new Object[0];
    }
}
