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

package org.ballerinalang.plugins.idea.psi.impl;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.SmartPointerManager;
import com.intellij.psi.SmartPsiElementPointer;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.util.ArrayUtil;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.containers.MultiMap;
import org.ballerinalang.plugins.idea.psi.BallerinaAlias;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaCompletePackageName;
import org.ballerinalang.plugins.idea.psi.BallerinaCompositeElement;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaField;
import org.ballerinalang.plugins.idea.psi.BallerinaFieldDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFieldVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaFormalParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaImportDeclaration;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaNullableTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaOrgName;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageDeclaration;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageName;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageReference;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageVersion;
import org.ballerinalang.plugins.idea.psi.BallerinaParameterWithType;
import org.ballerinalang.plugins.idea.psi.BallerinaReturnType;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaTupleTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaUnionTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReferenceExpression;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaCompletePackageNameReferenceSet;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaPackageNameReference;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageDeclarationStub;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageReferenceStub;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageVersionStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

public class BallerinaPsiImplUtil {

    private static final Key<SmartPsiElementPointer<PsiElement>> CONTEXT = Key.create("CONTEXT");

    @Nullable
    public static String getName(@NotNull BallerinaPackageDeclaration packageClause) {
        BallerinaPackageDeclarationStub stub = packageClause.getStub();
        if (stub != null) {
            return stub.getName();
        }
        PsiElement identifier = packageClause.getCompletePackageName();
        return identifier != null ? identifier.getText() : null;
    }

    @Nullable
    public static String getName(@NotNull BallerinaPackageName ballerinaPackageName) {
        PsiElement identifier = ballerinaPackageName.getIdentifier();
        return identifier.getText();
    }

    @Nullable
    public static String getName(@NotNull BallerinaOrgName ballerinaOrgName) {
        PsiElement identifier = ballerinaOrgName.getIdentifier();
        return identifier.getText();
    }

    @Nullable
    public static String getName(@NotNull BallerinaAlias ballerinaAlias) {
        PsiElement identifier = ballerinaAlias.getIdentifier();
        return identifier != null ? identifier.getText() : null;
    }

    @Nullable
    public static String getName(@NotNull BallerinaPackageVersion ballerinaPackageVersion) {
        BallerinaPackageVersionStub stub = ballerinaPackageVersion.getStub();
        if (stub != null) {
            return stub.getName();
        }
        PsiElement identifier = ballerinaPackageVersion.getIdentifier();
        return identifier != null ? identifier.getText() : null;
    }

    @Nullable
    public static PsiElement getIdentifier(BallerinaFunctionDefinition ballerinaFunctionDefinition) {
        //        BallerinaAttachedObject attachedObject = ballerinaFunctionDefinition.getAttachedObject();
        //        if (attachedObject != null) {
        //            return attachedObject.getIdentifier();
        //        }
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null ? callableUnitSignature.getAnyIdentifierName().getIdentifier() : null;
    }

    @Nullable
    public static PsiElement getIdentifier(BallerinaGlobalEndpointDefinition ballerinaGlobalEndpointDefinition) {
        BallerinaEndpointDefinition endpointDeclaration = ballerinaGlobalEndpointDefinition.getEndpointDefinition();
        return endpointDeclaration.getIdentifier();
    }

    @Nullable
    public static String getText(BallerinaGlobalEndpointDefinition ballerinaGlobalEndpointDefinition) {
        BallerinaEndpointDefinition endpointDeclaration = ballerinaGlobalEndpointDefinition.getEndpointDefinition();
        PsiElement identifier = endpointDeclaration.getIdentifier();
        if (identifier != null) {
            return identifier.getText();
        } else {
            return "";
        }
    }

    //    @Nullable
    //    public static PsiElement getIdentifier(BallerinaActionDefinition ballerinaActionDefinition) {
    //        BallerinaCallableUnitSignature callableUnitSignature = ballerinaActionDefinition
    // .getCallableUnitSignature();
    //        return callableUnitSignature != null ? callableUnitSignature.getIdentifier() : null;
    //    }

    @Nullable
    public static String getName(BallerinaFunctionDefinition ballerinaFunctionDefinition) {
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null && callableUnitSignature.getAnyIdentifierName().getIdentifier() != null ?
                callableUnitSignature.getAnyIdentifierName().getIdentifier().getText() : "";
    }

    //    @NotNull
    //    public static PsiReference getReference(@NotNull BallerinaNameReference ballerinaNameReference) {
    //        // Todo
    //        if (ballerinaNameReference.getParent() instanceof BallerinaFunctionInvocation) {
    //            return new BallerinaNameReferenceReference(ballerinaNameReference.getIdentifier());
    //        }
    //        return new BallerinaReference(ballerinaNameReference);
    //    }

    @Nullable
    public static BallerinaNameReference getQualifier(@NotNull BallerinaNameReference ballerinaNameReference) {
        // Todo
        //        return PsiTreeUtil.getChildOfType(ballerinaNameReference, BallerinaNameReference.class);
        return null;
    }

    // todo: ?
    public static PsiElement resolve(@NotNull BallerinaNameReference ballerinaNameReference) {
        return ballerinaNameReference.getReference().resolve();
    }

    @Nullable
    public static BallerinaTypeName resolveType(@NotNull BallerinaNameReference ballerinaNameReference) {
        //        PsiElement resolve = ballerinaNameReference.resolve();
        //        if (resolve instanceof GoTypeSpec) return ((GoTypeSpec) resolve).getSpecType();
        //        // hacky C resolve
        //        return resolve == ballerinaNameReference ? new GoCType(ballerinaNameReference) : null;
        return null;
    }

    public static boolean isInLocalPackage(@NotNull BallerinaNameReference ballerinaNameReference) {
        //        PsiElement resolve = ballerinaNameReference.resolve();
        //        if (resolve instanceof GoTypeSpec) return ((GoTypeSpec) resolve).getSpecType();
        //        // hacky C resolve
        //        return resolve == ballerinaNameReference ? new GoCType(ballerinaNameReference) : null;
        return ballerinaNameReference.getPackageReference() == null;
    }

    @Nullable
    public static PsiElement getContextElement(@Nullable ResolveState state) {
        SmartPsiElementPointer<PsiElement> context = state != null ? state.get(CONTEXT) : null;
        return context != null ? context.getElement() : null;
    }

    @NotNull
    public static ResolveState createContextOnElement(@NotNull PsiElement element) {
        return ResolveState.initial().put(CONTEXT, SmartPointerManager.getInstance(element.getProject())
                .createSmartPsiElementPointer(element));
    }

    @Nullable
    public static BallerinaTypeName getType(BallerinaVariableDefinitionStatement ballerinaVariableDefinitionStatement) {
        return ballerinaVariableDefinitionStatement.getTypeName();
    }

    @Nullable
    public static PsiElement getType(@NotNull BallerinaVariableReference ballerinaVariableReference) {
        return CachedValuesManager.getCachedValue(ballerinaVariableReference,
                () -> CachedValueProvider.Result.create(getBallerinaType(ballerinaVariableReference),
                        ProjectRootManager.getInstance(ballerinaVariableReference.getProject())));
    }

    @Nullable
    public static PsiElement getBallerinaType(@Nullable BallerinaExpression expression) {
        if (expression instanceof BallerinaVariableReferenceExpression) {
            BallerinaVariableReference variableReference = ((BallerinaVariableReferenceExpression)
                    expression).getVariableReference();
            //            if (variableReference instanceof BallerinaSimpleVariableReference) {
            //                BallerinaNameReference nameReference = ((BallerinaSimpleVariableReference)
            //                        variableReference).getNameReference();
            return BallerinaPsiImplUtil.getBallerinaType(variableReference);
            //            }
        }
        return null;
    }

    @Nullable
    private static PsiElement getBallerinaType(@NotNull BallerinaVariableReference ballerinaVariableReference) {
        if (ballerinaVariableReference instanceof BallerinaSimpleVariableReference) {
            BallerinaNameReference nameReference =
                    ((BallerinaSimpleVariableReference) ballerinaVariableReference).getNameReference();
            PsiElement identifier = nameReference.getIdentifier();
            PsiReference reference = identifier.getReference();
            if (reference == null) {
                return null;
            }
            PsiElement resolvedElement = reference.resolve();
            if (resolvedElement == null) {
                return null;
            }
            // Todo - Move to util
            PsiElement parent = resolvedElement.getParent();
            if (parent instanceof BallerinaVariableDefinitionStatement) {
                return resolveBallerinaType(((BallerinaVariableDefinitionStatement) parent));
            } else if (parent instanceof BallerinaFieldDefinition) {
                return getTypeNameFromField(((BallerinaFieldDefinition) parent));
            } else if (parent instanceof BallerinaParameterWithType) {
                return getTypeNameFromParameter(((BallerinaParameterWithType) parent));
            }
        } else if (ballerinaVariableReference instanceof BallerinaFieldVariableReference) {
            BallerinaField field = ((BallerinaFieldVariableReference) ballerinaVariableReference).getField();
            PsiElement identifier = field.getIdentifier();
            if (identifier == null) {
                return null;
            }
            PsiReference reference = identifier.getReference();
            if (reference == null) {
                return null;
            }
            PsiElement resolvedElement = reference.resolve();
            if (resolvedElement == null) {
                return null;
            }
            PsiElement parent = resolvedElement.getParent();
            if (parent instanceof BallerinaFieldDefinition) {
                return getTypeNameFromField(((BallerinaFieldDefinition) parent));
            }
        }
        return null;
    }

    @Nullable
    public static PsiElement resolveBallerinaType(@NotNull BallerinaVariableDefinitionStatement statement) {
        BallerinaTypeName type = statement.getTypeName();

        PsiReference reference = type.findReferenceAt(type.getTextLength());
        if (reference == null) {
            return null;
        }
        return reference.resolve();
    }

    @Nullable
    public static PsiElement getTypeNameFromField(@NotNull BallerinaFieldDefinition fieldDefinition) {
        BallerinaTypeName typeName = fieldDefinition.getTypeName();
        if (typeName instanceof BallerinaSimpleTypeName) {

        } else if (typeName instanceof BallerinaUnionTypeName) {
            BallerinaTypeName ballerinaTypeName = getTypeNameFromNillableType(((BallerinaUnionTypeName) typeName));
            if (ballerinaTypeName == null) {
                return null;
            }
            // Todo - Use a util method
            PsiReference reference = ballerinaTypeName.findReferenceAt(ballerinaTypeName.getTextLength());
            if (reference == null) {
                return null;
            }
            return reference.resolve();
        } else if (typeName instanceof BallerinaNullableTypeName) {
            BallerinaTypeName typeNameFromNillableType = getTypeNameFromNillableType((BallerinaNullableTypeName)
                    typeName);
            PsiReference reference = typeNameFromNillableType.findReferenceAt(typeNameFromNillableType.getTextLength());
            if (reference == null) {
                return null;
            }
            return reference.resolve();
        }
        return null;
    }

    //    public static boolean isNillableType(@NotNull BallerinaTypeName typeName) {
    //        if (typeName instanceof BallerinaUnionTypeName) {
    //            return true;
    //        } else if (typeName instanceof BallerinaNullableTypeName) {
    //            return true;
    //        }
    //        return true;
    //    }

    @Nullable
    public static PsiElement getTypeNameFromParameter(@NotNull BallerinaParameterWithType parameter) {
        BallerinaTypeName typeName = parameter.getTypeName();
        PsiReference reference = typeName.findReferenceAt(typeName.getTextLength());
        if (reference == null) {
            return null;
        }
        return reference.resolve();
    }

    @Nullable
    public static BallerinaTypeName getTypeNameFromNillableType(@NotNull BallerinaUnionTypeName ballerinaTypeName) {
        List<BallerinaTypeName> typeNameList = ballerinaTypeName.getTypeNameList();
        if (typeNameList.size() != 2) {
            return null;
        }
        BallerinaTypeName typeName1 = typeNameList.get(0);
        if (!(typeName1 instanceof BallerinaSimpleTypeName)) {
            return null;
        }
        BallerinaTypeName typeName2 = typeNameList.get(1);
        if (!(typeName2 instanceof BallerinaSimpleTypeName)) {
            return null;
        }

        BallerinaSimpleTypeName simpleTypeName1 = (BallerinaSimpleTypeName) typeName1;
        BallerinaSimpleTypeName simpleTypeName2 = (BallerinaSimpleTypeName) typeName2;
        if (simpleTypeName1.getReferenceTypeName() != null && simpleTypeName2.getEmptyTupleLiteral() != null) {
            return typeName1;
        }
        if (simpleTypeName1.getEmptyTupleLiteral() != null && simpleTypeName2.getReferenceTypeName() != null) {
            return typeName2;
        }
        return null;
    }

    @NotNull
    public static BallerinaTypeName getTypeNameFromNillableType(@NotNull BallerinaNullableTypeName ballerinaTypeName) {
        return ballerinaTypeName.getTypeName();
    }

    public static boolean processDeclarations(@NotNull BallerinaCompositeElement o,
                                              @NotNull PsiScopeProcessor processor,
                                              @NotNull ResolveState state,
                                              PsiElement lastParent,
                                              @NotNull PsiElement place) {
        //        boolean isAncestor = PsiTreeUtil.isAncestor(o, place, false);
        //        if (o instanceof GoVarSpec) {
        //            return isAncestor || GoCompositeElementImpl.processDeclarationsDefault(o, processor, state,
        // lastParent,
        //                    place);
        //        }
        //
        //        if (isAncestor) {
        //            return GoCompositeElementImpl.processDeclarationsDefault(o, processor, state, lastParent, place);
        //        }
        //        if (o instanceof GoBlock ||
        //                o instanceof GoIfStatement ||
        //                o instanceof GoForStatement ||
        //                o instanceof GoCommClause ||
        //                o instanceof GoFunctionLit ||
        //                o instanceof GoTypeCaseClause ||
        //                o instanceof GoExprCaseClause) {
        //            return processor.execute(o, state);
        //        }
        return BallerinaCompositeElementImpl.processDeclarationsDefault(o, processor, state, lastParent, place);
    }

    @NotNull
    public static PsiReference[] getReferences(@NotNull BallerinaCompletePackageName o) {
        if (o.getTextLength() < 2) {
            return PsiReference.EMPTY_ARRAY;
        }
        return new BallerinaCompletePackageNameReferenceSet(o).getAllReferences();
    }


    @NotNull
    public static PsiReference[] getReferences(@NotNull BallerinaPackageName o) {
        if (o.getTextLength() < 2) {
            return PsiReference.EMPTY_ARRAY;
        }
        return new BallerinaCompletePackageNameReferenceSet(o).getAllReferences();
    }

    @Nullable
    public static PsiReference getReference(@NotNull BallerinaPackageReference ballerinaPackageReference) {
        BallerinaPackageReferenceStub stub = ballerinaPackageReference.getStub();

        //        return new BallerinaCompletePackageNameReferenceSet(ballerinaPackageReference).getAllReferences();

        BallerinaFile containingFile = ballerinaPackageReference.getContainingFile();
        MultiMap<String, BallerinaImportDeclaration> importMap = containingFile.getImportMap();

        String packageName = ballerinaPackageReference.getIdentifier().getText();
        Collection<BallerinaImportDeclaration> ballerinaImportDeclarations = importMap.get(packageName);
        if (ballerinaImportDeclarations.isEmpty()) {
            return null;
        }
        BallerinaImportDeclaration firstItem = ContainerUtil.getFirstItem(ballerinaImportDeclarations);
        if (firstItem == null) {
            return null;
        }
        PsiElement shortPackageName = firstItem.getShortPackageName();
        if (shortPackageName == null) {
            return null;
        }
        PsiReference reference = shortPackageName.getReference();
        if (reference != null) {
            return reference;
        }
        BallerinaCompletePackageName completePackageName = firstItem.getCompletePackageName();
        if (completePackageName == null) {
            return null;
        }
        PsiReference[] references = completePackageName.getReferences();
        if (references.length == 0) {
            return null;
        }
        return new BallerinaPackageNameReference((BallerinaIdentifier)
                ballerinaPackageReference.getIdentifier(), ArrayUtil.getFirstElement(references));
    }

    @Nullable
    public static PsiElement getShortPackageName(@NotNull BallerinaImportDeclaration ballerinaImportDeclaration) {
        return CachedValuesManager.getCachedValue(ballerinaImportDeclaration, () -> {
            BallerinaAlias alias = ballerinaImportDeclaration.getAlias();
            if (alias != null && alias.getIdentifier() != null) {
                return CachedValueProvider.Result.create(alias.getIdentifier(), ballerinaImportDeclaration);
            }
            BallerinaCompletePackageName completePackageName = ballerinaImportDeclaration.getCompletePackageName();
            if (completePackageName == null) {
                return CachedValueProvider.Result.create(null, ballerinaImportDeclaration);
            }
            List<BallerinaPackageName> packageNameList = completePackageName.getPackageNameList();
            BallerinaPackageName lastItem = ContainerUtil.getLastItem(packageNameList);
            if (lastItem != null) {
                return CachedValueProvider.Result.create(lastItem.getIdentifier(), ballerinaImportDeclaration);
            }
            return CachedValueProvider.Result.create(null, ballerinaImportDeclaration);
        });
    }

    /**
     * Finds a file in the project SDK.
     *
     * @param project current project
     * @param path    relative file path in the SDK
     * @return {@code null} if the file cannot be found, otherwise returns the corresponding {@link VirtualFile}.
     */
    @Nullable
    public static VirtualFile findFileInProjectSDK(@NotNull Project project, @NotNull String path) {
        Sdk projectSdk = ProjectRootManager.getInstance(project).getProjectSdk();
        if (projectSdk == null) {
            return null;
        }
        VirtualFile[] roots = projectSdk.getSdkModificator().getRoots(OrderRootType.SOURCES);
        VirtualFile file;
        for (VirtualFile root : roots) {
            file = VfsUtilCore.findRelativeFile(path, root);
            if (file != null) {
                return file;
            }
        }
        return null;
    }

    public static boolean isAContentRoot(@Nullable PsiDirectory directory) {
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

    @Nullable
    public static String formatBallerinaFunctionParameters(@Nullable BallerinaFormalParameterList parameterList) {
        if (parameterList == null) {
            return "";
        }
        // Todo - Update formatting logic
        return "(" + parameterList.getText() + ")";
    }

    @Nullable
    public static String formatBallerinaFunctionReturnType(@Nullable BallerinaReturnType ballerinaReturnType) {
        if (ballerinaReturnType == null) {
            return null;
        }
        BallerinaTypeName typeName = ballerinaReturnType.getTypeName();
        if (typeName instanceof BallerinaTupleTypeName) {
            List<BallerinaTypeName> typeNameList = ((BallerinaTupleTypeName) typeName).getTypeNameList();
            if (!typeNameList.isEmpty()) {
                return typeNameList.get(0).getText();
            }
        }
        return typeName.getText();
    }

    @Nullable
    public static String formatBallerinaTypeName(@Nullable BallerinaTypeName ballerinaTypeName) {
        if (ballerinaTypeName == null) {
            return null;
        }
        // Todo - Update formatting logic
        return ballerinaTypeName.getText();
    }

    @Nullable
    public static String formatParameterDefaultValue(@Nullable BallerinaExpression ballerinaExpression) {
        if (ballerinaExpression == null) {
            return null;
        }
        // Todo - Update formatting logic
        return ballerinaExpression.getText();
    }


    @Nullable
    public static String getObjectFieldDefaultValue(@Nullable BallerinaFieldDefinition ballerinaFieldDefinition) {
        if (ballerinaFieldDefinition == null) {
            return null;
        }
        BallerinaExpression expression = ballerinaFieldDefinition.getExpression();
        return formatParameterDefaultValue(expression);
    }
}
