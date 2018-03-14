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

package org.ballerinalang.plugins.idea.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ArrayFactory;
import com.intellij.util.ArrayUtil;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.containers.MultiMap;
import org.ballerinalang.plugins.idea.BallerinaFileType;
import org.ballerinalang.plugins.idea.BallerinaLanguage;
import org.ballerinalang.plugins.idea.stubs.BallerinaFileStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.Icon;

public class BallerinaFile extends PsiFileBase {

    public static final BallerinaImportDeclaration[] EMPTY_ARRAY = new BallerinaImportDeclaration[0];
    public static final ArrayFactory<BallerinaImportDeclaration> ARRAY_FACTORY = count -> count == 0 ?
            EMPTY_ARRAY : new BallerinaImportDeclaration[count];

    public BallerinaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BallerinaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return BallerinaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ballerina File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

    @Nullable
    public BallerinaPackageDeclaration getPackage() {
        return CachedValuesManager.getCachedValue(this, () -> {
            BallerinaFileStub stub = getStub();
            if (stub != null) {
                StubElement<BallerinaPackageDeclaration> packageClauseStub = stub.getPackageClauseStub();
                return CachedValueProvider.Result.create(packageClauseStub != null ? packageClauseStub.getPsi() :
                        null, this);
            }
            return CachedValueProvider.Result.create(findChildByClass(BallerinaPackageDeclaration.class), this);
        });
    }

    @Nullable
    @Override
    public BallerinaFileStub getStub() {
        //noinspection unchecked
        return (BallerinaFileStub) super.getStub();
    }

    @NotNull
    private static <E extends PsiElement> List<E> getChildrenByType(@NotNull StubElement<? extends PsiElement> stub,
                                                                    IElementType elementType,
                                                                    ArrayFactory<E> f) {
        return Arrays.asList(stub.getChildrenByType(elementType, f));
    }

    @NotNull
    public List<BallerinaImportDeclaration> getCachedImports() {
        return CachedValuesManager.getCachedValue(this, () -> {
            StubElement<BallerinaFile> stub = getStub();
            List<BallerinaImportDeclaration> imports = stub != null ? getChildrenByType(stub,
                    BallerinaTypes.IMPORT_DECLARATION, ARRAY_FACTORY) : getImports();
            return CachedValueProvider.Result.create(imports, this);
        });
    }

    @NotNull
    private List<BallerinaImportDeclaration> getImports() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, BallerinaImportDeclaration.class);
    }

    @NotNull
    public MultiMap<String, BallerinaImportDeclaration> getImportMap() {
        return CachedValuesManager.getCachedValue(this, () -> {
            MultiMap<String, BallerinaImportDeclaration> map = MultiMap.createLinked();
            List<Object> dependencies = ContainerUtil.newArrayList(this);
            //            Module module = ModuleUtilCore.findModuleForPsiElement(this);
            for (BallerinaImportDeclaration importDeclaration : getCachedImports()) {
                PsiElement shortPackageName = importDeclaration.getShortPackageName();
                if (shortPackageName != null) {
                    map.putValue(shortPackageName.getText(), importDeclaration);
                }

                //                GoImportString string = importDeclaration.getImportString();
                //                PsiDirectory dir = string.resolve();
                //                ContainerUtil.addIfNotNull(dependencies, dir);
                //                Collection<String> packagesInDirectory = GoPackageUtil.getAllPackagesInDirectory
                // (dir, module, true);
                //                if (!packagesInDirectory.isEmpty()) {
                //                    for (String packageNames : packagesInDirectory) {
                //                        if (!StringUtil.isEmpty(packageNames)) {
                //                            map.putValue(packageNames, importDeclaration);
                //                        }
                //                    }
                //                } else {
                //                    String key = importDeclaration.getLocalPackageName();
                //                    if (!StringUtil.isEmpty(key)) {
                //                        map.putValue(key, importDeclaration);
                //                    }
                //                }


            }
            return CachedValueProvider.Result.create(map, ArrayUtil.toObjectArray(dependencies));
        });
    }
}
