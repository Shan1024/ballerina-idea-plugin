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
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaAnyIdentifierName;
import org.ballerinalang.plugins.idea.psi.BallerinaAssignmentStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaBlock;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageReference;
import org.ballerinalang.plugins.idea.psi.BallerinaRecordKey;
import org.ballerinalang.plugins.idea.psi.BallerinaStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaActionInvocationProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaBlockProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaObjectFieldProcessor;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaPackageNameProcessor;
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
        BallerinaScopeProcessorBase processor;
        PsiElement result;

        processor = new BallerinaActionInvocationProcessor(null, myElement, false);
        processResolveVariants(processor);
        result = processor.getResult();
        if (result != null) {
            return result;
        }

        BallerinaRecordKey recordKey = PsiTreeUtil.getParentOfType(myElement, BallerinaRecordKey.class);
        if (recordKey == null) {
            processor = new BallerinaStatementProcessor(null, myElement, false);
            processResolveVariants(processor);
            result = processor.getResult();
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
        } else {
            BallerinaVariableDefinitionStatement definitionStatement = PsiTreeUtil.getParentOfType(recordKey,
                    BallerinaVariableDefinitionStatement.class);
            if (definitionStatement != null) {
                PsiElement type = definitionStatement.getType();
                if (type != null && type.getParent() instanceof BallerinaTypeDefinition) {
                    BallerinaObjectFieldProcessor ballerinaFieldProcessor =
                            new BallerinaObjectFieldProcessor(null, myElement, false);
                    ballerinaFieldProcessor.execute(type.getParent(), ResolveState.initial());
                    result = ballerinaFieldProcessor.getResult();
                    if (result != null) {
                        return result;
                    }
                }
            }
            BallerinaAssignmentStatement assignmentStatement = PsiTreeUtil.getParentOfType(recordKey,
                    BallerinaAssignmentStatement.class);
            if (assignmentStatement != null) {
                PsiElement type = BallerinaPsiImplUtil.getType(assignmentStatement);
                if (type != null && type.getParent() instanceof BallerinaTypeDefinition) {
                    BallerinaObjectFieldProcessor ballerinaFieldProcessor =
                            new BallerinaObjectFieldProcessor(null, myElement, false);
                    ballerinaFieldProcessor.execute(type.getParent(), ResolveState.initial());
                    result = ballerinaFieldProcessor.getResult();
                    if (result != null) {
                        return result;
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    public boolean processResolveVariants(@NotNull BallerinaScopeProcessorBase processor) {
        PsiFile containingFile = myElement.getContainingFile();
        if (!(containingFile instanceof BallerinaFile)) {
            return false;
        }

        if (processor instanceof BallerinaActionInvocationProcessor) {
            PsiElement prevVisibleLeaf = PsiTreeUtil.prevVisibleLeaf(myElement);
            if (prevVisibleLeaf != null && prevVisibleLeaf instanceof LeafPsiElement) {
                if (((LeafPsiElement) prevVisibleLeaf).getElementType() == BallerinaTypes.RARROW) {
                    if (!processor.execute(containingFile, ResolveState.initial())) {
                        return false;
                    }
                }
            }
        }

        if (processor instanceof BallerinaPackageNameProcessor) {
            if (!processor.execute(containingFile, ResolveState.initial())) {
                return false;
            }
        }

        boolean inLocalPackage = true;
        PsiElement parent = myElement.getParent();
        if (parent instanceof BallerinaNameReference) {
            BallerinaNameReference nameReference = (BallerinaNameReference) parent;
            inLocalPackage = nameReference.isInLocalPackage();
        } else if (parent instanceof BallerinaAnyIdentifierName) {
            PsiElement prevSibling = parent.getPrevSibling();
            if (prevSibling instanceof BallerinaPackageReference) {
                inLocalPackage = false;
            }
        }

        if (inLocalPackage) {
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

            // Get suggestions from current file. This is needed sometimes because without the dummy identifier inserted
            // by the IDEA, the file might not generate the PSI tree correctly.
            if (!processor.execute(containingFile, ResolveState.initial())) {
                return false;
            }
            if (processor instanceof BallerinaTopLevelScopeProcessor) {
                if (!((BallerinaTopLevelScopeProcessor) processor).isLookupElementsFound()) {
                    PsiFile originalFile = containingFile.getOriginalFile();
                    // Get suggestions from current file.
                    if (!processor.execute(originalFile, ResolveState.initial())) {
                        return false;
                    }

                    // Recursively find definitions in the project starting from the current directory.
                    if (originalFile.getContainingDirectory() != null) {
                        recursivelyFindOutwards(processor, originalFile.getContainingDirectory(), originalFile);
                    }
                }
            }
        } else {
            BallerinaPackageReference packageReference = null;

            if (parent instanceof BallerinaAnyIdentifierName) {
                PsiElement prevSibling = parent.getPrevSibling();
                if (prevSibling instanceof BallerinaPackageReference) {
                    packageReference = ((BallerinaPackageReference) prevSibling);
                }
            } else if (parent instanceof BallerinaNameReference) {
                packageReference = ((BallerinaNameReference) parent).getPackageReference();
            }

            if (packageReference == null) {
                return false;
            }
            PsiReference reference = packageReference.getReference();
            if (reference == null) {
                return false;
            }
            PsiElement resolvedElement = reference.resolve();
            if (resolvedElement == null || !(resolvedElement instanceof PsiDirectory)) {
                return true;
            }
            return recursivelyFindInPackage(processor, ((PsiDirectory) resolvedElement));
        }
        return true;
    }

    // Todo - Merge with method in BallerinaTypeReference
    private boolean recursivelyFindOutwards(@NotNull BallerinaScopeProcessorBase processor, @NotNull PsiDirectory root,
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
                    recursivelyFindOutwards(processor, directory, null);
                }
            }

            if (originToIgnore != null) {
                PsiDirectory parent = root.getParent();
                if (parent == null) {
                    return true;
                }
                if (!BallerinaPsiImplUtil.isAContentRoot(parent)) {
                    return recursivelyFindOutwards(processor, parent, root);
                }
            }
        }
        return true;
    }

    // Todo - Merge with method in BallerinaTypeReference
    private boolean recursivelyFindInPackage(@NotNull BallerinaScopeProcessorBase processor,
                                             @NotNull PsiDirectory root) {
        if (!processor.isCompletion() && processor.getResult() != null) {
            return false;
        }
        // We use breadth first search kind of approach here. First process in all files in the current directory,
        // then process all subdirectories.
        List<PsiDirectory> directories = new LinkedList<>();

        // Iterate through all elements in the current directory.
        for (PsiElement child : root.getChildren()) {
            if (child instanceof PsiDirectory) {
                // If the child is a directory, we add it to the directories list to process later.
                directories.add(((PsiDirectory) child));
            } else if (child instanceof BallerinaFile) {
                // If the child is a Ballerina file, process the file.
                if (!processor.execute(child, ResolveState.initial())) {
                    return false;
                }
            }
        }
        // Iterate though all directories and process them.
        for (PsiDirectory directory : directories) {
            recursivelyFindInPackage(processor, directory);
        }
        return true;
    }
}
