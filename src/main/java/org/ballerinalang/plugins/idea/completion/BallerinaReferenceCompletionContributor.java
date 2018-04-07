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

package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.SmartPointerManager;
import com.intellij.psi.SmartPsiElementPointer;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaNameReferenceReference;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaReference;
import org.ballerinalang.plugins.idea.psi.scope.BallerinaScopeProcessor;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaAnnotationIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaEndpointIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaFunctionIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaGlobalEndpointIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaGlobalVariableIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaNamespaceIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaPackageIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaWorkerIndex;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class BallerinaReferenceCompletionContributor extends CompletionContributor {

    //    private static class NamedElementProcessor implements Processor<GoNamedElement> {
    //        @NotNull private final Collection<ElementProcessor> myProcessors;
    //        @NotNull private final CompletionResultSet myResult;
    //        @NotNull private String myName = "";
    //        @NotNull private final Map<String, GoImportSpec> myImportedPackages;
    //        @Nullable
    //        private final Module myModule;
    //        private final boolean myVendoringEnabled;
    //
    //        public NamedElementProcessor(@NotNull Collection<ElementProcessor> processors,
    //                                     @NotNull GoFile contextFile,
    //                                     @NotNull CompletionResultSet result,
    //                                     @Nullable Module module) {
    //            myProcessors = processors;
    //            myVendoringEnabled = GoVendoringUtil.isVendoringEnabled(module);
    //            myImportedPackages = contextFile.getImportedPackagesMap();
    //            myModule = module;
    //            myResult = result;
    //        }
    //
    //        public void setName(@NotNull String name) {
    //            myName = name;
    //        }
    //
    //        @Override
    //        public boolean process(@NotNull GoNamedElement element) {
    //            ProgressManager.checkCanceled();
    //            Boolean allowed = null;
    //            ExistingImportData importData = null;
    //            for (ElementProcessor processor : myProcessors) {
    //                if (processor.isMine(myName, element)) {
    //                    importData = cachedImportData(element, importData);
    //                    allowed = cachedAllowed(element, allowed);
    //                    if (allowed == Boolean.FALSE || importData.isDot) break;
    //                    if (!processor.process(myName, element, importData, myResult)) {
    //                        return false;
    //                    }
    //                }
    //            }
    //            return true;
    //        }
    //
    //        @NotNull
    //        private Boolean cachedAllowed(@NotNull GoNamedElement element, @Nullable Boolean existingValue) {
    //            if (existingValue != null) return existingValue;
    //            return GoPsiImplUtil.canBeAutoImported(element.getContainingFile(), false, myModule);
    //        }
    //
    //        @NotNull
    //        private ExistingImportData cachedImportData(@NotNull GoNamedElement element, @Nullable
    // ExistingImportData existingValue) {
    //            if (existingValue != null) return existingValue;
    //
    //            GoFile declarationFile = element.getContainingFile();
    //            String importPath = declarationFile.getImportPath(myVendoringEnabled);
    //            GoImportSpec existingImport = myImportedPackages.get(importPath);
    //
    //            boolean exists = existingImport != null;
    //            boolean isDot = exists && existingImport.isDot();
    //            String alias = existingImport != null ? existingImport.getAlias() : null;
    //            return new ExistingImportData(exists, isDot, alias, importPath);
    //        }
    //    }

    static int count = 0;

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
//        Project project = parameters.getOriginalFile().getProject();
//
//        Collection<BallerinaFile> ballerinaPackage = StubIndex.getElements(BallerinaPackageIndex.KEY,
//                "samples.parser", project, GlobalSearchScope.allScope(project), BallerinaFile.class);
//
//        Collection<BallerinaFunctionDefinition> ballerinaFunction = StubIndex.getElements(BallerinaFunctionIndex
//                .KEY, "test", project, GlobalSearchScope.allScope(project), BallerinaFunctionDefinition.class);
//
////        Collection<BallerinaStructDefinition> ballerinaStruct = StubIndex.getElements(BallerinaStructIndex.KEY, "test",
////                project, GlobalSearchScope.allScope(project), BallerinaStructDefinition.class);
//
//        Collection<BallerinaGlobalVariableDefinition> ballerinaGlobalVariable =
//                StubIndex.getElements(BallerinaGlobalVariableIndex.KEY, "test", project, GlobalSearchScope.allScope
//                        (project), BallerinaGlobalVariableDefinition.class);
//
//        //        Collection<BallerinaConnectorDefinition> ballerinaConnector = StubIndex.getElements
//        // (BallerinaConnectorIndex.KEY,
//        //                "test", project, GlobalSearchScope.allScope(project), BallerinaConnectorDefinition.class);
//
//        Collection<String> allPackages = StubIndex.getInstance().getAllKeys(BallerinaPackageIndex.KEY, project);
//        Collection<String> allFunctions = StubIndex.getInstance().getAllKeys(BallerinaFunctionIndex.KEY, project);
////        Collection<String> allStructs = StubIndex.getInstance().getAllKeys(BallerinaStructIndex.KEY, project);
//        Collection<String> allGlobalVariables = StubIndex.getInstance().getAllKeys(BallerinaGlobalVariableIndex.KEY,
//                project);
//        //        Collection<String> allConnectors = StubIndex.getInstance().getAllKeys(BallerinaConnectorIndex.KEY,
//        // project);
////        Collection<String> allEnums = StubIndex.getInstance().getAllKeys(BallerinaEnumIndex.KEY, project);
//        Collection<String> allAnnotations = StubIndex.getInstance().getAllKeys(BallerinaAnnotationIndex.KEY, project);
////        Collection<String> allTransformers = StubIndex.getInstance().getAllKeys(BallerinaTransformerIndex.KEY, project);
////        Collection<String> allConstants = StubIndex.getInstance().getAllKeys(BallerinaConstantIndex.KEY, project);
//        Collection<String> allGlobalEndpoints = StubIndex.getInstance().getAllKeys(BallerinaGlobalEndpointIndex.KEY,
//                project);
//        Collection<String> allEndpoints = StubIndex.getInstance().getAllKeys(BallerinaEndpointIndex.KEY, project);
//        //        Collection<String> allActions = StubIndex.getInstance().getAllKeys(BallerinaActionIndex.KEY, project);
//        Collection<String> allWorkers = StubIndex.getInstance().getAllKeys(BallerinaWorkerIndex.KEY, project);
//        Collection<String> allNamespaces = StubIndex.getInstance().getAllKeys(BallerinaNamespaceIndex.KEY, project);
//
//        //        long start = System.currentTimeMillis();
//        //
//        //        Collection<BallerinaStructDefinition> ballerinaStructDefinitions = StubIndex.getElements
//        // (BallerinaStructIndex
//        //                .KEY, "user2", project, GlobalSearchScope.allScope(project), BallerinaStructDefinition.class);
//        //        /*.forEach(def -> System.out.println(def.getIdentifier().getText()));*/
//        //
//        //        //        ballerinaStructDefinitions.forEach(def -> def.isPublic());
//        //
//        //        long end = System.currentTimeMillis();
//        //
//        //        System.out.println("Found " + ballerinaStructDefinitions.size() + " in " + (end - start) + " ms");
//        //        System.out.println("....");
//
        long start = System.currentTimeMillis();

        count = 0;
        PsiElement position = parameters.getPosition();

        PsiReference reference = position.getReference();
        if (reference==null) {
            return;
        }

//        ResolveState state = createContextOnElement(position);
        MyBallerinaScopeProcessor myBallerinaScopeProcessor = new MyBallerinaScopeProcessor(result);

//        PsiFile containingFile = position.getContainingFile().getOriginalFile();
//
//        PsiDirectory parent = containingFile.getParent();
//
//        if (parent != null) {
//            PsiElement[] children = parent.getChildren();
//            for (PsiElement child : children) {
//                myBallerinaScopeProcessor.execute(child, state);
//            }
//        }

        ((BallerinaNameReferenceReference)reference).processResolveVariants(myBallerinaScopeProcessor);


        long end = System.currentTimeMillis();
        System.out.println("Found " + count + " in " + (end - start) + " ms");
    }

    private static final Key<SmartPsiElementPointer<PsiElement>> CONTEXT = Key.create("CONTEXT");

    @NotNull
    public static ResolveState createContextOnElement(@NotNull PsiElement element) {
        return ResolveState.initial().put(CONTEXT, SmartPointerManager.getInstance(element.getProject())
                .createSmartPsiElementPointer(element.getContainingFile()));
    }

    private static class MyBallerinaScopeProcessor extends BallerinaScopeProcessor {

        @NotNull
        private final CompletionResultSet myResult;
        private final Set<String> myProcessedNames = ContainerUtil.newHashSet();

        public MyBallerinaScopeProcessor(@NotNull CompletionResultSet result) {
            myResult = result;
        }

        @Override
        public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
            if (accept(element)) {
                List<BallerinaDefinition> definitions = ((BallerinaFile) element).getDefinitions();
                for (BallerinaDefinition definition : definitions) {
                    PsiElement firstChild = definition.getFirstChild();
                    if (firstChild instanceof BallerinaFunctionDefinition) {
                        BallerinaFunctionDefinition child = (BallerinaFunctionDefinition) firstChild;
                        PsiElement identifier = child.getIdentifier();
                        if (identifier != null) {
                            myResult.addElement(BallerinaCompletionUtils.createFunctionLookupElement(child,null));
                            count++;
                        }
                    }
                }
            }
            return true;
        }

        protected boolean accept(@NotNull PsiElement element) {
            return element instanceof BallerinaFile;
        }

        @Override
        public boolean isCompletion() {
            return true;
        }
    }

    @Override
    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar) {
        return typeChar == ':' || typeChar == '@';
    }
}
