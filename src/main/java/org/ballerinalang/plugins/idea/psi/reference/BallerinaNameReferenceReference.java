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
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.ballerinalang.plugins.idea.completion.BallerinaCompletionUtils;
import org.ballerinalang.plugins.idea.completion.inserthandlers.ParenthesisInsertHandler;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageReference;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaTopLevelDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

//public class BallerinaNameReferenceReference extends BallerinaCachedReference<BallerinaIdentifier> {
//
////    public BallerinaNameReferenceReference(PsiElement element, TextRange rangeInElement, boolean soft) {
////        super(element, rangeInElement, soft);
////    }
////
////    public BallerinaNameReferenceReference(PsiElement element, TextRange rangeInElement) {
////        super(element, rangeInElement);
////    }
////
////    public BallerinaNameReferenceReference(PsiElement element, boolean soft) {
////        super(element, soft);
////    }
//
//    public BallerinaNameReferenceReference(@NotNull BallerinaIdentifier element) {
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
// Note - Name is not a typo :)
public class BallerinaNameReferenceReference extends BallerinaCachedReference<BallerinaIdentifier> {

    private static int count = 0;

    public final List<String> IGNORED_DIRECTORIES = new LinkedList<>();

    public BallerinaNameReferenceReference(@NotNull BallerinaIdentifier element) {
        super(element);
        IGNORED_DIRECTORIES.add("resources");
        IGNORED_DIRECTORIES.add("tests");
    }

    //    public BallerinaNameReferenceReference(PsiElement element, TextRange rangeInElement, boolean soft) {
    //        super(element, rangeInElement, soft);
    //    }
    //
    //    public BallerinaNameReferenceReference(PsiElement element, TextRange rangeInElement) {
    //        super(element, rangeInElement);
    //    }
    //
    //    public BallerinaNameReferenceReference(PsiElement element, boolean soft) {
    //        super(element, soft);
    //    }
    //
    //    public BallerinaNameReferenceReference(@NotNull BallerinaIdentifier element) {
    //        // Note - Range should be 0 - length. Without this, error will occur.
    //        this(element, new TextRange(0, element.getText().length()));
    //        //        super(element);
    //    }

    //    @Override
    //    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
    //        myElement.replace(BallerinaElementFactory.createIdentifierFromText(myElement.getProject(),
    // newElementName));
    //        return myElement;
    //    }

    @Nullable
    @Override
    public PsiElement resolveInner() {
        Project project = myElement.getProject();

        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement, BallerinaNameReference.class);

        if (nameReference == null) {
            return null;
        }

        //        Collection<BallerinaFunctionDefinition> elements;

        if (nameReference.isInLocalPackage()) {

            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
            //            PsiDirectory directory = originalFile.getParent();
            //            if (directory == null) {
            //                return null;
            //            }
            //            List<VirtualFile> virtualFiles = Arrays.asList(directory.getVirtualFile().getChildren());

            //            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            //            elements = StubIndex.getTopLevelElements(BallerinaFunctionIndex.KEY, myElement.getText(),
            // project,
            // scope,
            //                    BallerinaFunctionDefinition.class);
            PsiDirectory directory = getPackageDirectory(originalFile);
            if (directory != null) {
                //                Collection<BallerinaTopLevelDefinition> elements = getTopLevelElements(directory,
                // true);
                return findInTopLevelElements(directory, true);
            }

        } else {
            // Todo - Get files in the corresponding package.
            // Todo - Filter public elements? Or show a warning?
            // Todo - Consider package version.

            BallerinaPackageReference packageReference = nameReference.getPackageReference();
            if (packageReference == null) {
                return null;
            }
            PsiReference reference = packageReference.getReference();
            if (reference == null) {
                return null;
            }
            PsiElement directory = reference.resolve();
            if (directory == null || !(directory instanceof PsiDirectory)) {
                return null;
            }


            //            List<VirtualFile> virtualFiles = Arrays.asList(((PsiDirectory) psiDirectory).getVirtualFile()
            //                    .getChildren());
            //            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            //            elements = StubIndex.getTopLevelElements(BallerinaFunctionIndex.KEY, myElement.getText(),
            // project,
            // scope,
            //                    BallerinaFunctionDefinition.class);

            //            Collection<BallerinaTopLevelDefinition> elements = getTopLevelElements(),
            //                    true);

            return findInTopLevelElements((PsiDirectory) directory, true);


        }
        //        BallerinaFunctionDefinition firstItem = ContainerUtil.getFirstItem(elements);
        //        if (elements.isEmpty() || firstItem == null || firstItem.getCallableUnitSignature() == null) {
        //            return null;
        //        }
        //        return firstItem.getCallableUnitSignature().getIdentifier();

        return null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        //        GlobalSearchScope scope = GlobalSearchScope.fileScope(myElement.getContainingFile());

        //        Collection<String> keys = StubIndex.getInstance().getAllKeys(BallerinaFunctionIndex.KEY, project);

        //        return keys.toArray(new String[keys.size()]);

        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement, BallerinaNameReference.class);

        if (nameReference == null) {
            return new Object[0];
        }

        if (nameReference.isInLocalPackage()) {

            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
            //            PsiDirectory parent = originalFile.getParent();
            //            if (parent == null) {
            //                return new Object[0];
            //            }
            //            List<VirtualFile> virtualFiles = Arrays.asList(parent.getVirtualFile().getChildren());
            //            Set<String> results = ContainerUtil.newHashSet();
            //            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY,  new
            // CancellableCollectProcessor<String>(results) {
            //                @Override
            //                protected boolean accept(String s) {
            //                    return !"_".equals(s) && StringUtil.isCapitalized(s);
            //                }
            //            },scope,);

            PsiDirectory directory = getPackageDirectory(originalFile);
            if (directory != null) {
                Collection<BallerinaTopLevelDefinition> elements = getTopLevelElements(directory, true);
                return getLookups(elements);
            }

            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, project, new
            //                    CancellableCollectProcessor<String>(results) {
            //                        @Override
            //                        protected boolean accept(String s) {
            //                            return !"_".equals(s) && StringUtil.isCapitalized(s);
            //                        }
            //                    });


        } else {
            // Todo - Get files in the corresponding package.
            // Todo - Filter public elements? Or show a warning?
            // Todo - Consider package version.

            BallerinaPackageReference packageReference = nameReference.getPackageReference();
            if (packageReference == null) {
                return new Object[0];
            }
            PsiReference reference = packageReference.getReference();
            if (reference == null) {
                return new Object[0];
            }
            PsiElement psiDirectory = reference.resolve();
            if (psiDirectory == null || !(psiDirectory instanceof PsiDirectory)) {
                return new Object[0];
            }
            long start = System.currentTimeMillis();

            PsiDirectory directory = (PsiDirectory) psiDirectory;

            count = 0;

            Collection<BallerinaTopLevelDefinition> elements = getTopLevelElements(directory, true);
            //            List<VirtualFile> virtualFiles = Arrays.asList(directory.getVirtualFile()
            //                    .getChildren());
            //            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            //            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, project);
            //
            //            Set<String> results = ContainerUtil.newHashSet();
            //
            //
            //
            //            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, project, new
            //            //                    CancellableCollectProcessor<String>(results) {
            //            //                        @Override
            //            //                        protected boolean accept(String s) {
            //            //                            count++;
            //            //                            return !"_".equals(s) && StringUtil.isCapitalized(s);
            //            //                        }
            //            //                    });
            //
            //            count = 0;
            //
            //            // Working approach
            //            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, new
            //            //                    CancellableCollectProcessor<String>(results) {
            //            //                        @Override
            //            //                        protected boolean accept(String s) {
            //            //                            count++;
            //            //                            return !"_".equals(s) && StringUtil.isCapitalized(s);
            //            //                        }
            //            //                    }, scope, BallerinaIdFilter.getFilesFilter(scope));
            //
            //            List<String> list = new LinkedList<>();
            //
            //            // Working approach
            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, new
            //                    CancellableCollectProcessor<String>(results) {
            //                        @Override
            //                        protected boolean accept(String s) {
            //                            count++;
            //                            list.add(s);
            //                            return true;
            //                        }
            //                    },new BallerinaSourceFilterScope(scope), null);
            //
            //
            //            //            // Working approach when we know the Key
            //            //            Set<BallerinaFunctionDefinition> results2 = ContainerUtil.newHashSet();
            //            //            StubIndex.getInstance().processElements(BallerinaFunctionIndex.KEY, "bar",
            // project, scope,
            //            //                    BallerinaFunctionDefinition.class, new
            //            //                            CancellableCollectProcessor<BallerinaFunctionDefinition>
            // (results2) {
            //            //
            //            //                                @Override
            //            //                                protected boolean accept(BallerinaFunctionDefinition s) {
            //            //                                    count++;
            //            //                                    return true;
            //            //                                }
            //            //                            });

            long end = System.currentTimeMillis();

            System.out.println("Processed: " + count + " in " + (end - start) + " ms");

            return getLookups(elements);

        }


        return new Object[0];
    }

    // Todo - Move to utils
    private Collection<BallerinaTopLevelDefinition> getTopLevelElements(PsiDirectory rootDirectory,
                                                                        boolean isTopLevel) {
        List<BallerinaTopLevelDefinition> results = new LinkedList<>();
        PsiElement[] children = rootDirectory.getChildren();

        for (PsiElement child : children) {
            count++;
            if (child instanceof PsiDirectory) {
                // Ignore top level resources and tests directories.
                if (isTopLevel && !IGNORED_DIRECTORIES.contains(((PsiDirectory) child).getName())) {
                    results.addAll(getTopLevelElements(((PsiDirectory) child), false));
                }
            } else if (child instanceof BallerinaFile) {
                Collection<BallerinaTopLevelDefinition> ballerinaDefinitions = PsiTreeUtil.findChildrenOfType(child,
                        BallerinaTopLevelDefinition.class);
                // Todo - Add as lookup elements
                results.addAll(ballerinaDefinitions);

                //                for (BallerinaFunctionDefinition definition : definitions) {
                //                    BallerinaCallableUnitSignature callableUnitSignature = definition
                // .getCallableUnitSignature();
                //                    if (callableUnitSignature != null) {
                //                        results.add(callableUnitSignature.getIdentifier());
                //                    }
                //                }
            }
        }
        return results;
    }

    private PsiElement findInTopLevelElements(PsiDirectory rootDirectory, boolean isTopLevel) {
        // We are doing a breadth first search here.
        List<PsiDirectory> directories = new LinkedList<>();
        PsiElement[] children = rootDirectory.getChildren();

        for (PsiElement child : children) {
            count++;
            if (child instanceof PsiDirectory) {
                // Ignore top level resources and tests directories.
                if (isTopLevel && !IGNORED_DIRECTORIES.contains(((PsiDirectory) child).getName())) {
                    directories.add(((PsiDirectory) child));
                }
                //results.addAll(getTopLevelElements(((PsiDirectory) child), false));
            } else if (child instanceof BallerinaFile) {
                Collection<BallerinaTopLevelDefinition> ballerinaDefinitions = PsiTreeUtil.findChildrenOfType(child,
                        BallerinaTopLevelDefinition.class);
                // Todo - Add as lookup elements


                for (BallerinaTopLevelDefinition ballerinaDefinition : ballerinaDefinitions) {
                    PsiElement identifier = ballerinaDefinition.getIdentifier();

                    if (isAMatch(identifier)) {
                        return identifier;
                    }
                }

                //                results.addAll(ballerinaDefinitions);

                //                for (BallerinaFunctionDefinition definition : definitions) {
                //                    BallerinaCallableUnitSignature callableUnitSignature = definition
                // .getCallableUnitSignature();
                //                    if (callableUnitSignature != null) {
                //                        results.add(callableUnitSignature.getIdentifier());
                //                    }
                //                }
            }
        }


        for (PsiDirectory directory : directories) {

            PsiElement element = findInTopLevelElements(directory, false);
            if (element != null) {
                return element;
            }
        }
        return null;
    }

    private PsiElement getMatchingElement(@NotNull Collection<BallerinaTopLevelDefinition> elements) {
        for (BallerinaTopLevelDefinition element : elements) {
            //            if (element instanceof BallerinaFunctionDefinition) {
            //                BallerinaCallableUnitSignature callableUnitSignature = ((BallerinaFunctionDefinition)
            // element)
            //                        .getCallableUnitSignature();
            //                if (callableUnitSignature != null) {
            //                    PsiElement identifier = callableUnitSignature.getIdentifier();
            //                    if (isAMatch(identifier)) {
            //                        return identifier;
            //                    }
            //                }
            //            }
            PsiElement identifier = element.getIdentifier();

            if (isAMatch(identifier)) {
                return identifier;
            }
            //            else if (element instanceof BallerinaConstantDefinition) {
            //                PsiElement identifier = ((BallerinaTopLevelDefinition) element).getIdentifier();
            //
            //                if (isAMatch(identifier)) {
            //                    return identifier;
            //                }
            //            } else if (element instanceof BallerinaGlobalVariableDefinition) {
            //                PsiElement identifier = ((BallerinaGlobalVariableDefinition) element).getIdentifier();
            //                if (isAMatch(identifier)) {
            //                    return identifier;
            //                }
            //            } else if (element instanceof BallerinaStructDefinition) {
            //                PsiElement identifier = ((BallerinaStructDefinition) element).getIdentifier();
            //                if (isAMatch(identifier)) {
            //                    return identifier;
            //                }
            //            }

        }
        return null;
    }

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
                // Todo - Add insert handler
                // We need to check whether the current element is a variable definition element. If so, we need to
                // update the insert handler.
                //                BallerinaExpressionStmt ballerinaExpressionStmt =
                //                        PsiTreeUtil.getParentOfType(myElement, BallerinaExpressionStmt.class);
                //                InsertHandler<LookupElement> insertHandler =
                //                        ballerinaExpressionStmt != null ? ParenthesisInsertHandler.INSTANCE : null;
                results.add(BallerinaCompletionUtils.createFunctionLookupElement(element, ParenthesisInsertHandler
                        .INSTANCE));
            } else if (element instanceof BallerinaGlobalVariableDefinition) {
                results.add(BallerinaCompletionUtils.createGlobalVariableLookupElement(element));
            } else if (element instanceof BallerinaTypeDefinition) {
                results.add(BallerinaCompletionUtils.createTypeLookupElement(element, null));
            }
        }
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
}
