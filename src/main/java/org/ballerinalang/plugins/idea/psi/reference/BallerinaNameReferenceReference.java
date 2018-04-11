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

import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.ResolveState;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaBlock;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaBlockProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaScopeProcessorBase;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaStatementProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaTopLevelScopeProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;

// Note - Name is not a typo :)
public class BallerinaNameReferenceReference extends BallerinaCachedReference<BallerinaIdentifier> {

    public BallerinaNameReferenceReference(@NotNull BallerinaIdentifier element) {
        super(element);
    }

    @Nullable
    @Override
    public PsiElement resolveInner() {
        BallerinaScopeProcessorBase processor = new BallerinaStatementProcessor(null, myElement, false);
        processResolveVariants(processor);
        PsiElement result = processor.getResult();
        if (result != null) {
            return result;
        }

        processor = new BallerinaBlockProcessor(null, myElement, false);
        processResolveVariants(processor);
        result = processor.getResult();
        if (result != null) {
            return result;
        }

        processor = new BallerinaTopLevelScopeProcessor(null, myElement, false);
        processResolveVariants(processor);
        return processor.getResult();
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    public boolean processResolveVariants(@NotNull BallerinaScopeProcessorBase processor) {
        // Note - Execute BallerinaStatementProcessor first.
        BallerinaStatement ballerinaStatement = PsiTreeUtil.getParentOfType(myElement, BallerinaStatement.class);
        if (ballerinaStatement != null && processor instanceof BallerinaStatementProcessor) {
            if (!processor.execute(ballerinaStatement, ResolveState.initial())) {
                return false;
            }
        }

        BallerinaBlock ballerinaBlock = PsiTreeUtil.getParentOfType(myElement, BallerinaBlock.class);
        if (ballerinaBlock != null && processor instanceof BallerinaBlockProcessor) {
            if (!processor.execute(ballerinaBlock, ResolveState.initial())) {
                return false;
            }
        }

        PsiFile file = myElement.getContainingFile().getOriginalFile();
        if (!(file instanceof BallerinaFile)) {
            return false;
        }

        // Get suggestions from current file.
        if (!processor.execute(file, ResolveState.initial())) {
            return false;
        }
        // Recursively find definitions in the project starting from the current directory.
        if (file.getContainingDirectory() != null) {
            recursivelyFind(processor, file.getContainingDirectory(), file);
        }
        return true;
    }

    // Todo - Merge with method in BallerinaTypeReference
    private boolean recursivelyFind(@NotNull BallerinaScopeProcessorBase processor, @NotNull PsiDirectory root,
                                    @Nullable PsiElement originToIgnore) {
        if (!processor.isCompletion() && processor.getResult() != null) {
            return false;
        }
        // We use breadth first search kind of approach here. First process in all files in the current directory,
        // then process all subdirectories.
        List<PsiDirectory> directories = new LinkedList<>();

        // Iterate through all elements in the current directory.
        for (PsiElement child : root.getChildren()) {
            // If the current child is the source of the completion, we ignore it since it is already processed.
            if (child.equals(originToIgnore)) {
                continue;
            }

            if (child instanceof PsiDirectory) {
                // If the child is a directory, we add it to the directories list to process later.
                directories.add(((PsiDirectory) child));
            } else if (child instanceof BallerinaFile) {
                // If the child is a Ballerina file, process the file.
                if (/*!isAContentRoot(root) &&*/ !processor.execute(child, ResolveState.initial())) {
                    return false;
                }
            }
        }

        if (!BallerinaPsiImplUtil.isAContentRoot(root)) {
            // Iterate though all directories and process them.
            for (PsiDirectory directory : directories) {
                PsiDirectory parent = directory.getParentDirectory();
                if (parent == null) {
                    continue;
                }
                PsiDirectory superParent = parent.getParent();
                if (superParent == null) {
                    continue;
                }
                if (!(BallerinaPsiImplUtil.isAContentRoot(superParent) && IGNORED_DIRECTORIES.contains(directory
                        .getName()))) {
                    recursivelyFind(processor, directory, null);
                }
            }

            if (originToIgnore != null) {
                PsiDirectory parent = root.getParent();
                if (parent == null) {
                    return true;
                }
                if (!BallerinaPsiImplUtil.isAContentRoot(parent)) {
                    return recursivelyFind(processor, parent, root);
                }
            }
        }
        return true;
    }
}
