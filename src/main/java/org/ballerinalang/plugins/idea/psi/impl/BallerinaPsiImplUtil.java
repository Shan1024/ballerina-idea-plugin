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

import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.SmartPointerManager;
import com.intellij.psi.SmartPsiElementPointer;
import com.intellij.psi.scope.PsiScopeProcessor;
import org.ballerinalang.plugins.idea.psi.BallerinaActionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaAlias;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaCompletePackageName;
import org.ballerinalang.plugins.idea.psi.BallerinaCompositeElement;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaOrgName;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageDeclaration;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageName;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageVersion;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeName;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaPackageReferenceSet;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageDeclarationStub;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageVersionStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null ? callableUnitSignature.getIdentifier() : null;
    }

    @Nullable
    public static PsiElement getIdentifier(BallerinaGlobalEndpointDefinition ballerinaGlobalEndpointDefinition) {
        BallerinaEndpointDefinition endpointDeclaration = ballerinaGlobalEndpointDefinition.getEndpointDefinition();
        return endpointDeclaration.getIdentifier();
    }

    @Nullable
    public static PsiElement getIdentifier(BallerinaActionDefinition ballerinaActionDefinition) {
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaActionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null ? callableUnitSignature.getIdentifier() : null;
    }

    @Nullable
    public static String getName(BallerinaFunctionDefinition ballerinaFunctionDefinition) {
        BallerinaCallableUnitSignature callableUnitSignature = ballerinaFunctionDefinition.getCallableUnitSignature();
        return callableUnitSignature != null ? callableUnitSignature.getIdentifier().getText() : "";
    }

    //    @NotNull
    //    public static PsiReference getReference(@NotNull BallerinaNameReference ballerinaNameReference) {
    //        // Todo
    //        if (ballerinaNameReference.getParent() instanceof BallerinaFunctionInvocation) {
    //            return new BallerinaFunctionReference(ballerinaNameReference.getIdentifier());
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

    public static boolean isReferenceToLocalPackage(@NotNull BallerinaNameReference ballerinaNameReference) {
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

    //
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
        return new BallerinaPackageReferenceSet(o).getAllReferences();
    }


    @NotNull
    public static PsiReference[] getReferences(@NotNull BallerinaPackageName o) {
        if (o.getTextLength() < 2) {
            return PsiReference.EMPTY_ARRAY;
        }
        return new BallerinaPackageReferenceSet(o).getAllReferences();
    }

}
