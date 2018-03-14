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
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.containers.ContainerUtil;
import org.apache.commons.lang.ArrayUtils;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageReference;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaElementFactory;
import org.ballerinalang.plugins.idea.stubs.filter.BallerinaIdFilter;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaFunctionIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

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

public class BallerinaFunctionReference extends BallerinaCachedReference<BallerinaIdentifier> {

    static int count = 0;

    public BallerinaFunctionReference(@NotNull BallerinaIdentifier element) {
        super(element);
    }

    //    public BallerinaFunctionReference(PsiElement element, TextRange rangeInElement, boolean soft) {
    //        super(element, rangeInElement, soft);
    //    }
    //
    //    public BallerinaFunctionReference(PsiElement element, TextRange rangeInElement) {
    //        super(element, rangeInElement);
    //    }
    //
    //    public BallerinaFunctionReference(PsiElement element, boolean soft) {
    //        super(element, soft);
    //    }
    //
    //    public BallerinaFunctionReference(@NotNull BallerinaIdentifier element) {
    //        // Note - Range should be 0 - length. Without this, error will occur.
    //        this(element, new TextRange(0, element.getText().length()));
    //        //        super(element);
    //    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        myElement.replace(BallerinaElementFactory.createIdentifierFromText(myElement.getProject(), newElementName));
        return myElement;
    }

    @Nullable
    @Override
    public PsiElement resolveInner() {
        Project project = myElement.getProject();

        BallerinaNameReference nameReference = PsiTreeUtil.getParentOfType(myElement, BallerinaNameReference.class);

        if (nameReference == null) {
            return null;
        }

        Collection<BallerinaFunctionDefinition> elements;

        if (nameReference.isReferenceToLocalPackage()) {

            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
            PsiDirectory parent = originalFile.getParent();
            if (parent == null) {
                return null;
            }
            List<VirtualFile> virtualFiles = Arrays.asList(parent.getVirtualFile().getChildren());

            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            elements = StubIndex.getElements(BallerinaFunctionIndex.KEY, myElement.getText(), project, scope,
                    BallerinaFunctionDefinition.class);
        } else {
            // Todo - Get files in the corresponding package.
            // Todo - Filter public elements? Or show a warning?
            // Todo - Consider package version.

            BallerinaPackageReference packageReference = nameReference.getPackageReference();
            PsiReference reference = packageReference.getReference();
            PsiElement psiDirectory = reference.resolve();

            List<VirtualFile> virtualFiles = Arrays.asList(((PsiDirectory) psiDirectory).getVirtualFile().getChildren
                    ());
            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            elements = StubIndex.getElements(BallerinaFunctionIndex.KEY, myElement.getText(), project, scope,
                    BallerinaFunctionDefinition.class);
        }
        BallerinaFunctionDefinition firstItem = ContainerUtil.getFirstItem(elements);
        if (elements.isEmpty() || firstItem == null) {
            return null;
        }
        return firstItem.getIdentifier();
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

        if (nameReference.isReferenceToLocalPackage()) {

            PsiFile originalFile = myElement.getContainingFile().getOriginalFile();
            PsiDirectory parent = originalFile.getParent();
            if (parent == null) {
                return new Object[0];
            }
            List<VirtualFile> virtualFiles = Arrays.asList(parent.getVirtualFile().getChildren());
            Set<String> results = ContainerUtil.newHashSet();
            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY,  new
            // CancellableCollectProcessor<String>(results) {
            //                @Override
            //                protected boolean accept(String s) {
            //                    return !"_".equals(s) && StringUtil.isCapitalized(s);
            //                }
            //            },scope,);

            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, project, new
                    CancellableCollectProcessor<String>(results) {
                        @Override
                        protected boolean accept(String s) {
                            return !"_".equals(s) && StringUtil.isCapitalized(s);
                        }
                    });


        } else {
            // Todo - Get files in the corresponding package.
            // Todo - Filter public elements? Or show a warning?
            // Todo - Consider package version.

            BallerinaPackageReference packageReference = nameReference.getPackageReference();
            PsiReference reference = packageReference.getReference();
            PsiElement psiDirectory = reference.resolve();

            List<VirtualFile> virtualFiles = Arrays.asList(((PsiDirectory) psiDirectory).getVirtualFile()
                    .getChildren());
            GlobalSearchScope scope = GlobalSearchScope.filesScope(project, virtualFiles);
            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, project);

            Set<String> results = ContainerUtil.newHashSet();

            long start = System.currentTimeMillis();

            //            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, project, new
            //                    CancellableCollectProcessor<String>(results) {
            //                        @Override
            //                        protected boolean accept(String s) {
            //                            count++;
            //                            return !"_".equals(s) && StringUtil.isCapitalized(s);
            //                        }
            //                    });

            count=0;

            StubIndex.getInstance().processAllKeys(BallerinaFunctionIndex.KEY, new
                    CancellableCollectProcessor<String>(results) {
                        @Override
                        protected boolean accept(String s) {
                            count++;
                            return !"_".equals(s) && StringUtil.isCapitalized(s);
                        }
                    }, scope, BallerinaIdFilter.getFilesFilter(scope));

            long end = System.currentTimeMillis();

            System.out.println("Processed: " + count + " in " + (end - start) + " ms");
        }


        return new Object[0];
    }
}
