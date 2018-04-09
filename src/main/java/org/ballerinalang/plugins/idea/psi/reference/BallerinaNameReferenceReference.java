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

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.completion.inserthandlers.ParenthesisInsertHandler;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaBlockProcessor;
import org.ballerinalang.plugins.idea.psi.BallerinaBlock;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageReference;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaTopLevelDefinition;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaScopeProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaScopeProcessorBase;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaTopLevelScopeProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
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
        //        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement,
        // BallerinaNameReference.class);
        //        if (nameReference == null) {
        //            return null;
        //        }
        //        if (nameReference.isInLocalPackage()) {
        //            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
        //            PsiDirectory parent = originalFile.getParent();
        //            if (parent != null) {
        //                if (isAContentRoot(parent)) {
        //                    return findInFile(originalFile);
        //                }
        //            }
        //            PsiDirectory directory = getPackageDirectory(originalFile);
        //            if (directory != null) {
        //                return findInPackage(directory, true);
        //            }
        //        } else {
        //            // Todo - Get files in the corresponding package.
        //            // Todo - Filter public elements? Or show a warning?
        //            // Todo - Consider package version.
        //
        //            BallerinaPackageReference packageReference = nameReference.getPackageReference();
        //            if (packageReference == null) {
        //                return null;
        //            }
        //            PsiReference reference = packageReference.getReference();
        //            if (reference == null) {
        //                return null;
        //            }
        //            PsiElement directory = reference.resolve();
        //            if (directory == null || !(directory instanceof PsiDirectory)) {
        //                return null;
        //            }
        //            return findInPackage((PsiDirectory) directory, true);
        //        }

        BallerinaScopeProcessorBase processor = new BallerinaBlockProcessor(null, myElement, false);

        processResolveVariants(processor);
        PsiElement result = processor.getResult();
        // Todo - change to consider return value
        if (result != null) {
            return result;
        }


        processor = new BallerinaTopLevelScopeProcessor(null, myElement, false);
        processResolveVariants(processor);
        result = processor.getResult();
        if (result != null) {
            return result;
        }
        return null;

    }

    @NotNull
    @Override
    public Object[] getVariants() {
        //        long start = System.currentTimeMillis();
        //        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement,
        //                BallerinaNameReference.class);
        //        if (nameReference == null) {
        //            return new Object[0];
        //        }
        //        if (nameReference.isInLocalPackage()) {
        //            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
        //            PsiDirectory directory = getPackageDirectory(originalFile);
        //            if (directory != null) {
        //                Collection<BallerinaTopLevelDefinition> elements = getTopLevelElements(directory, true);
        //                long end = System.currentTimeMillis();
        //                System.out.println("Time: " + (end - start));
        //                return getLookups(elements);
        //            }
        //        } else {
        //            // Todo - Get files in the corresponding package.
        //            // Todo - Filter public elements? Or show a warning?
        //            // Todo - Consider package version.
        //
        //            BallerinaPackageReference packageReference = nameReference.getPackageReference();
        //            if (packageReference == null) {
        //                return new Object[0];
        //            }
        //            PsiReference reference = packageReference.getReference();
        //            if (reference == null) {
        //                return new Object[0];
        //            }
        //            PsiElement psiDirectory = reference.resolve();
        //            if (psiDirectory == null || !(psiDirectory instanceof PsiDirectory)) {
        //                return new Object[0];
        //            }
        //
        //            PsiDirectory directory = (PsiDirectory) psiDirectory;
        //            Collection<BallerinaTopLevelDefinition> elements = getTopLevelElements(directory, true);
        //            long end = System.currentTimeMillis();
        //            System.out.println("Time: " + (end - start));
        //            return getLookups(elements);
        //        }
        return new Object[0];
    }

    public boolean processResolveVariants(@NotNull BallerinaScopeProcessor processor) {

        BallerinaBlock ballerinaBlock = PsiTreeUtil.getParentOfType(myElement, BallerinaBlock.class);
        if (ballerinaBlock != null && processor instanceof BallerinaBlockProcessor) {
            if (!processor.execute(ballerinaBlock, ResolveState.initial())) {
                System.out.println("Count: " + processor.getCount());
                return false;
            }
            System.out.println("Count: " + processor.getCount());
        }

        PsiFile file = myElement.getContainingFile().getOriginalFile();
        if (!(file instanceof BallerinaFile)) {
            return false;
        }

        //        ResolveState state = createContextOnElement(myElement);
        //        BallerinaReferenceExpressionBase qualifier = myElement.getQualifier();

        // Get suggestions from current file.
        if (!processor.execute(file, ResolveState.initial())) {
            System.out.println("Count: " + processor.getCount());
            return false;
        }
        // Recursively find definitions in the project starting from the current directory.
        if (file.getContainingDirectory() != null) {
            recursivelyFind(processor, file.getContainingDirectory(), file);
            System.out.println("Count: " + processor.getCount());
        }
        //        //        return qualifier != null
        //        //                ? processQualifierExpression((BallerinaFile) file, qualifier, processor, state)
        //        //                : processUnqualifiedResolve((BallerinaFile) file, processor, state);
        //
        //        PsiDirectory parent = file.getParent();
        //
        //        if (parent == null) {
        //            return true;
        //        }
        //        VirtualFile virtualFile = parent.getVirtualFile();
        //
        //        VirtualFile[] contentRoots = ProjectRootManager.getInstance(parent.getProject()).getContentRoots();
        //        for (VirtualFile contentRoot : contentRoots) {
        //            if (virtualFile.equals(contentRoot)) {
        //                return true;
        //            }
        //        }
        //
        //        for (PsiElement child : parent.getChildren()) {
        //            if (!child.equals(file)) {
        //                if (child instanceof PsiDirectory) {
        //
        //                } else {
        //                    if (!processor.execute(child, ResolveState.initial())) {
        //                        return false;
        //                    }
        //                }
        //            }
        //        }

        return true;
    }


    private boolean recursivelyFind(@NotNull PsiScopeProcessor processor, @NotNull PsiDirectory root,
                                    @Nullable PsiElement originToIgnore) {
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

        if (!isAContentRoot(root)) {
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
                if (!(isAContentRoot(superParent) && IGNORED_DIRECTORIES.contains(directory.getName()))) {
                    recursivelyFind(processor, directory, null);
                }
            }

            if (originToIgnore != null) {
                PsiDirectory parent = root.getParent();
                if (parent == null) {
                    return true;
                }
                //            PsiDirectory superParent = parent.getParent();
                //            if (superParent == null) {
                //                return true;
                //            }
                if (!isAContentRoot(parent)) {
                    return recursivelyFind(processor, parent, root);
                }
            }
        }
        return true;
    }


    // Todo - Move to utils
    @NotNull
    private Collection<BallerinaTopLevelDefinition> getTopLevelElements(@NotNull PsiDirectory rootDirectory,
                                                                        boolean isTopLevel) {
        List<BallerinaTopLevelDefinition> results = new LinkedList<>();
        PsiElement[] children = rootDirectory.getChildren();
        for (PsiElement child : children) {
            if (child instanceof PsiDirectory) {
                // Ignore top level resources and tests directories.
                if (isTopLevel && !IGNORED_DIRECTORIES.contains(((PsiDirectory) child).getName())) {
                    results.addAll(getTopLevelElements(((PsiDirectory) child), false));
                }
            } else if (child instanceof BallerinaFile) {
                Collection<BallerinaTopLevelDefinition> ballerinaDefinitions = PsiTreeUtil.findChildrenOfType(child,
                        BallerinaTopLevelDefinition.class);
                results.addAll(ballerinaDefinitions);
            }
        }
        return results;
    }

    @Nullable
    private PsiElement findInPackage(@NotNull PsiDirectory rootDirectory, boolean isTopLevel) {
        // We are doing a breadth first search here.
        List<PsiDirectory> directories = new LinkedList<>();
        PsiElement[] children = rootDirectory.getChildren();
        for (PsiElement child : children) {
            if (child instanceof PsiDirectory) {
                // Ignore top level resources and tests directories.
                if (isTopLevel && !IGNORED_DIRECTORIES.contains(((PsiDirectory) child).getName())) {
                    directories.add(((PsiDirectory) child));
                }
                //results.addAll(getTopLevelElements(((PsiDirectory) child), false));
            } else if (child instanceof BallerinaFile) {
                PsiElement element = findInFile(((PsiFile) child));
                if (element != null) {
                    return element;
                }
            }
        }

        for (PsiDirectory directory : directories) {
            PsiElement element = findInPackage(directory, false);
            if (element != null) {
                return element;
            }
        }
        return null;
    }

    @Nullable
    private PsiElement findInFile(@NotNull PsiFile file) {
        Collection<BallerinaTopLevelDefinition> ballerinaDefinitions = PsiTreeUtil.findChildrenOfType(file,
                BallerinaTopLevelDefinition.class);
        for (BallerinaTopLevelDefinition ballerinaDefinition : ballerinaDefinitions) {
            PsiElement identifier = ballerinaDefinition.getIdentifier();

            if (isAMatch(identifier)) {
                return identifier;
            }
        }
        return null;
    }

    @NotNull
    private LookupElement[] getLookups(@NotNull Collection<BallerinaTopLevelDefinition> elements) {
        List<LookupElement> results = new LinkedList<>();
        for (BallerinaTopLevelDefinition element : elements) {
            // Note - Identifier can be null in incomplete codes.
            PsiElement identifier = element.getIdentifier();
            if (identifier == null) {
                continue;
            }
            // Todo - Refactor code
            if (element instanceof BallerinaFunctionDefinition) {
                results.add(BallerinaCompletionUtils.createFunctionLookupElement(element,
                        ParenthesisInsertHandler.INSTANCE_WITH_AUTO_POPUP));
            } else if (element instanceof BallerinaGlobalVariableDefinition) {
                results.add(BallerinaCompletionUtils.createGlobalVariableLookupElement(element));
            } else if (element instanceof BallerinaTypeDefinition) {
                results.add(BallerinaCompletionUtils.createTypeLookupElement(element));
            }
        }
        System.out.println("Elements: " + results.size());
        return results.toArray(new LookupElement[results.size()]);
    }

    private boolean isAMatch(@Nullable PsiElement identifier) {
        return identifier != null && myElement.getText().equals(identifier.getText());
    }

    // Todo - Move to util
    @Nullable
    private PsiDirectory getPackageDirectory(@NotNull PsiFile file) {
        VirtualFile virtualFile = file.getVirtualFile();
        String canonicalFilePath = virtualFile.getCanonicalPath();
        if (canonicalFilePath == null) {
            return null;
        }
        PsiDirectory psiDirectory = file.getParent();
        if (psiDirectory == null) {
            return null;
        }
        VirtualFile parentDirectory = psiDirectory.getVirtualFile();
        VirtualFile[] contentRoots = ProjectRootManager.getInstance(file.getProject()).getContentRoots();
        for (VirtualFile contentRoot : contentRoots) {
            if (contentRoot == null || contentRoot.getCanonicalPath() == null) {
                continue;
            }
            if (canonicalFilePath.startsWith(contentRoot.getCanonicalPath())) {
                while (parentDirectory != null && parentDirectory.getParent() != null && !parentDirectory.getParent()
                        .equals(contentRoot)) {
                    parentDirectory = parentDirectory.getParent();
                }
                if (parentDirectory == null) {
                    return null;
                }
                return PsiManager.getInstance(file.getProject()).findDirectory(parentDirectory);
            }
        }
        return null;
    }

    private boolean isAContentRoot(@Nullable PsiDirectory directory) {
        if (directory == null) {
            return false;
        }
        VirtualFile[] contentRoots = ProjectRootManager.getInstance(directory.getProject()).getContentRoots();
        for (VirtualFile contentRoot : contentRoots) {
            if (contentRoot.equals(directory.getVirtualFile())) {
                return true;
            }
        }
        return false;
    }
}
