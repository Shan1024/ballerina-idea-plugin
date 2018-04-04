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

import com.intellij.codeInsight.completion.CompletionUtil;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileSystemItem;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class BallerinaCompletePackageNameReference extends FileReference {

    public static final String PACKAGE_VERSION_REGEX = "v\\d+\\.\\d+\\.\\d+";

    public BallerinaCompletePackageNameReference(@NotNull FileReferenceSet fileReferenceSet, TextRange range, int index,
                                                 String text) {
        super(fileReferenceSet, range, index, text);
    }

    public BallerinaCompletePackageNameReference(FileReference original) {
        super(original);
    }


    //    @Override
    //    protected Object createLookupItem(PsiElement candidate) {
    //        if (candidate instanceof PsiDirectory) {
    //            return BallerinaCompletionUtil.createPackageLookupElement((PsiDirectory) candidate);
    //        }
    //        return null;
    //    }

    @NotNull
    @Override
    protected ResolveResult[] innerResolve(boolean caseSensitive, @NotNull PsiFile containingFile) {
        //        if (isFirst()) {
        //            if (".".equals(getCanonicalText())) {
        //                PsiDirectory directory = getDirectory();
        //                return directory != null ? new PsiElementResolveResult[]{new PsiElementResolveResult
        // (directory)} : ResolveResult.EMPTY_ARRAY;
        //            }
        //            else if ("..".equals(getCanonicalText())) {
        //                PsiDirectory directory = getDirectory();
        //                PsiDirectory grandParent = directory != null ? directory.getParentDirectory() : null;
        //                return grandParent != null ? new PsiElementResolveResult[]{new PsiElementResolveResult
        // (grandParent)} : ResolveResult.EMPTY_ARRAY;
        //            }
        //        }

        String referenceText = getText();
        Set<ResolveResult> result = ContainerUtil.newLinkedHashSet();
        Set<ResolveResult> innerResult = ContainerUtil.newLinkedHashSet();
        for (PsiFileSystemItem context : getContexts()) {
            innerResolveInContext(referenceText, context, innerResult, caseSensitive);
            for (ResolveResult resolveResult : innerResult) {
                PsiElement element = resolveResult.getElement();
                if (element instanceof PsiDirectory) {
                    if (isLast()) {
                        return new ResolveResult[]{resolveResult};
                    }
                    result.add(resolveResult);
                }
            }
            innerResult.clear();
        }
        return result.isEmpty() ? ResolveResult.EMPTY_ARRAY : result.toArray(new ResolveResult[result.size()]);
    }

    @Override
    public PsiElement bindToElement(@NotNull PsiElement element, boolean absolute) throws IncorrectOperationException {
        //        if (!absolute) {
        //            FileReference firstReference = ArrayUtil.getFirstElement(getFileReferenceSet().getAllReferences
        // ());
        //            if (firstReference != null) {
        //                Collection<PsiFileSystemItem> contexts = getFileReferenceSet().getDefaultContexts();
        //                for (ResolveResult resolveResult : firstReference.multiResolve(false)) {
        //                    PsiElement resolveResultElement = resolveResult.getElement();
        //                    if (resolveResultElement instanceof PsiFileSystemItem) {
        //                        PsiFileSystemItem parentDirectory = ((PsiFileSystemItem)resolveResultElement)
        // .getParent();
        //                        if (parentDirectory != null && contexts.contains(parentDirectory)) {
        //                            return getElement();
        //                        }
        //                    }
        //                }
        //            }
        //        }
        return super.bindToElement(element, true);
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        return super.handleElementRename(newElementName);
    }

    private boolean isFirst() {
        return getIndex() <= 0;
    }

    @Nullable
    private PsiDirectory getDirectory() {
        PsiElement originalElement = CompletionUtil.getOriginalElement(getElement());
        PsiFile file = originalElement != null ? originalElement.getContainingFile() : getElement().getContainingFile();
        return file.getParent();
    }

    @NotNull
    @Override
    public Object[] getVariants() {

       return super.getVariants();
//        LinkedList<LookupElement> results = new LinkedList<>();
//
//        Collection<PsiFileSystemItem> contexts = getContexts();
//
//        for (PsiFileSystemItem context : contexts) {
//            PsiElement[] children = context.getChildren();
//            for (PsiElement child : children) {
//                if (!(child instanceof PsiDirectory) || ((PsiDirectory) child).getName().matches(PACKAGE_VERSION_REGEX)) {
//                    continue;
//                }
//                results.add(BallerinaCompletionUtil.createPackageLookupElement((PsiDirectory) child));
//            }
//        }
//
//        return results.toArray(new LookupElement[results.size()]);
    }
}
