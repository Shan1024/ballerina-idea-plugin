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

import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiPolyVariantReferenceBase;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.ResolveState;
import com.intellij.util.ObjectUtils;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaReferenceExpressionBase;
import org.ballerinalang.plugins.idea.psi.scopeprocessors.BallerinaScopeProcessor;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public abstract class BallerinaReferenceBase<T extends BallerinaReferenceExpressionBase> extends
        PsiPolyVariantReferenceBase<T> {

    public static final Key<List<PsiElement>> IMPORT_USERS = Key.create("IMPORT_USERS");
    public static final Key<String> ACTUAL_NAME = Key.create("ACTUAL_NAME");

    public BallerinaReferenceBase(T element, TextRange range) {
        super(element, range);
    }

//    @Nullable
//    protected static String getPath(@Nullable PsiFile file) {
//        if (file == null) return null;
//        VirtualFile virtualFile = file.getOriginalFile().getVirtualFile();
//        return virtualFile == null ? null : virtualFile.getPath();
//    }

    //  private static void putIfAbsent(@NotNull GoImportSpec importSpec, @NotNull PsiElement usage) {
    //    //noinspection SynchronizationOnLocalVariableOrMethodParameter
    //    synchronized (importSpec) {
    //      List<PsiElement> newUsages = ContainerUtil.newSmartList(usage);
    //      newUsages.addAll(IMPORT_USERS.get(importSpec, ContainerUtil.emptyList()));
    //      importSpec.putUserData(IMPORT_USERS, newUsages);
    //    }
    //}

//    protected boolean processDirectory(@Nullable PsiDirectory dir,
//                                       @Nullable BallerinaFile file,
//                                       @Nullable String packageName,
//                                       @NotNull BallerinaScopeProcessor processor,
//                                       @NotNull ResolveState state,
//                                       boolean localProcessing) {
//        //    if (dir == null) return true;
//        //    String filePath = getPath(file);
//        //    Module module = file != null ? ModuleUtilCore.findModuleForPsiElement(file) : null;
//        //    for (PsiFile f : dir.getFiles()) {
//        //      if (!(f instanceof BallerinaFile) || Comparing.equal(getPath(f), filePath)) continue;
//        //      if (packageName != null && !packageName.equals(((BallerinaFile)f).getPackageName())) continue;
//        //      if (!allowed(f, file, module)) continue;
//        //      if (!processFileEntities((BallerinaFile)f, processor, state, localProcessing)) return false;
//        //    }
//        return true;
//    }

//    protected boolean processBuiltin(@NotNull BallerinaScopeProcessor processor, @NotNull ResolveState state,
//                                     @NotNull BallerinaCompositeElement element) {
//        //        BallerinaFile builtin = GoSdkUtil.findBuiltinFile(element);
//        //        return builtin == null || processFileEntities(builtin, processor, state, true);
//        return false;
//    }

//    protected boolean processImports(@NotNull BallerinaFile file,
//                                     @NotNull BallerinaScopeProcessor processor,
//                                     @NotNull ResolveState state,
//                                     @NotNull BallerinaCompositeElement element) {
//        //        for (Map.Entry<String, Collection<GoImportSpec>> entry : file.getImportMap().entrySet()) {
//        //            for (GoImportSpec o : entry.getValue()) {
//        //                if (o.isForSideEffects()) continue;
//        //
//        //                GoImportString importString = o.getImportString();
//        //                if (o.isDot()) {
//        //                    PsiDirectory implicitDir = importString.resolve();
//        //                    boolean resolved = !processDirectory(implicitDir, file, null, processor, state, false);
//        //                    if (resolved && !processor.isCompletion()) {
//        //                        putIfAbsent(o, element);
//        //                    }
//        //                    if (resolved) return false;
//        //                } else {
//        //                    if (o.getAlias() == null) {
//        //                        PsiDirectory resolve = importString.resolve();
//        //                        if (resolve != null && !processor.execute(resolve, state.put(ACTUAL_NAME, entry
//        // .getKey())))
//        //                            return false;
//        //                    }
//        //                    // todo: multi-resolve into appropriate package clauses
//        //                    if (!processor.execute(o, state.put(ACTUAL_NAME, entry.getKey()))) return false;
//        //                }
//        //            }
//        //        }
//        return true;
//    }

    @NotNull
    protected BallerinaScopeProcessor createResolveProcessor(@NotNull Collection<ResolveResult> result,
                                                             @NotNull BallerinaReferenceExpressionBase o) {
        return new BallerinaScopeProcessor() {
            @Override
            public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
                if (element.equals(o)) {
                    return !result.add(new PsiElementResolveResult(element));
                }
                String name = ObjectUtils.chooseNotNull(state.get(ACTUAL_NAME),
                        element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null);
                if (name != null && o.getIdentifier().textMatches(name)) {
                    result.add(new PsiElementResolveResult(element));
                    return false;
                }
                return true;
            }
        };
    }

    protected abstract boolean processFileEntities(@NotNull BallerinaFile file,
                                                   @NotNull BallerinaScopeProcessor processor,
                                                   @NotNull ResolveState state,
                                                   boolean localProcessing);
}
