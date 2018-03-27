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

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.util.Conditions;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileSystemItem;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class BallerinaCompletePackageNameReferenceSet extends FileReferenceSet {

    public BallerinaCompletePackageNameReferenceSet(String str, @NotNull PsiElement element, int startInElement,
                                                    PsiReferenceProvider provider, boolean caseSensitive,
                                                    boolean endingSlashNotAllowed, @Nullable FileType[] suitableFileTypes) {
        super(str, element, startInElement, provider, caseSensitive, endingSlashNotAllowed, suitableFileTypes);
    }

    public BallerinaCompletePackageNameReferenceSet(String str, @NotNull PsiElement element, int startInElement,
                                                    PsiReferenceProvider provider, boolean caseSensitive,
                                                    boolean endingSlashNotAllowed, @Nullable FileType[] suitableFileTypes,
                                                    boolean init) {
        super(str, element, startInElement, provider, caseSensitive, endingSlashNotAllowed, suitableFileTypes, init);
    }

    public BallerinaCompletePackageNameReferenceSet(String str, @NotNull PsiElement element, int startInElement,
                                                    @Nullable PsiReferenceProvider provider, boolean isCaseSensitive) {
        super(str, element, startInElement, provider, isCaseSensitive);
    }

    public BallerinaCompletePackageNameReferenceSet(@NotNull String str, @NotNull PsiElement element, int startInElement,
                                                    PsiReferenceProvider provider, boolean isCaseSensitive,
                                                    boolean endingSlashNotAllowed) {
        super(str, element, startInElement, provider, isCaseSensitive, endingSlashNotAllowed);
    }

    public BallerinaCompletePackageNameReferenceSet(@NotNull PsiElement element) {
        super(element);
    }

//    public String getSeparatorString() {
//        return ".";
//    }

    @NotNull
    @Override
    public Collection<PsiFileSystemItem> computeDefaultContexts() {
        PsiFile file = getContainingFile();
        if (file == null || !file.isValid() || isAbsolutePathReference()) {
            return Collections.emptyList();
        }

        PsiManager psiManager = file.getManager();
        Module module = ModuleUtilCore.findModuleForPsiElement(file);
        Project project = file.getProject();


        LinkedHashSet<VirtualFile> sourceRoots = new LinkedHashSet<>();
        sourceRoots.add(module.getModuleFile().getParent());
        // Todo - Add sdk and external
        //BallerinaSdkUtil.getSourcesPathsToLookup(project, module);
        // Todo - Consider org name.
        return ContainerUtil.mapNotNull(sourceRoots, psiManager::findDirectory);
    }

    @Override
    protected Condition<PsiFileSystemItem> getReferenceCompletionFilter() {
        //        if (!isRelativeImport()) {
        // Note - This will disable suggestions since it will contain files as well.
        return Conditions.alwaysFalse();
        //        }
        //        return super.getReferenceCompletionFilter();
    }

    public boolean absoluteUrlNeedsStartSlash() {
        return false;
    }

    @Override
    public boolean isEndingSlashNotAllowed() {
        return true;
    }

    @Override
    public boolean couldBeConvertedTo(boolean relative) {
        return false;
    }

    @Override
    public boolean isAbsolutePathReference() {
        return super.isAbsolutePathReference();
    }

    @NotNull
    @Override
    public FileReference createFileReference(TextRange range, int index, String text) {
        return new BallerinaCompletePackageNameReference(this, range, index, text);
    }
}
