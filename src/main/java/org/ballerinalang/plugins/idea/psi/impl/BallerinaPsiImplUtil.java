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

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.SmartPointerManager;
import com.intellij.psi.SmartPsiElementPointer;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ArrayUtil;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.containers.MultiMap;
import org.ballerinalang.plugins.idea.psi.BallerinaAlias;
import org.ballerinalang.plugins.idea.psi.BallerinaAnnotationDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaAnyIdentifierName;
import org.ballerinalang.plugins.idea.psi.BallerinaArrayTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaAssignmentStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaBuiltInReferenceTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaCompletePackageName;
import org.ballerinalang.plugins.idea.psi.BallerinaCompositeElement;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaEndpointType;
import org.ballerinalang.plugins.idea.psi.BallerinaExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaField;
import org.ballerinalang.plugins.idea.psi.BallerinaFieldDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFieldVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaForeachStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaFormalParameterList;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionInvocation;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionInvocationReference;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaFutureTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalEndpointDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaIdentifier;
import org.ballerinalang.plugins.idea.psi.BallerinaImportDeclaration;
import org.ballerinalang.plugins.idea.psi.BallerinaIndex;
import org.ballerinalang.plugins.idea.psi.BallerinaInvocationReference;
import org.ballerinalang.plugins.idea.psi.BallerinaJsonTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaMapTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaNameReference;
import org.ballerinalang.plugins.idea.psi.BallerinaNamedPattern;
import org.ballerinalang.plugins.idea.psi.BallerinaNullableTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectCallableUnitSignature;
import org.ballerinalang.plugins.idea.psi.BallerinaObjectFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaOrgName;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageDeclaration;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageName;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageReference;
import org.ballerinalang.plugins.idea.psi.BallerinaPackageVersion;
import org.ballerinalang.plugins.idea.psi.BallerinaParameterWithType;
import org.ballerinalang.plugins.idea.psi.BallerinaReturnParameter;
import org.ballerinalang.plugins.idea.psi.BallerinaReturnType;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaSimpleVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaStreamTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaTableTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaTupleDestructuringStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaTupleTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeConversionExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaUnionTypeName;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableDefinitionStatement;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReference;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReferenceExpression;
import org.ballerinalang.plugins.idea.psi.BallerinaVariableReferenceList;
import org.ballerinalang.plugins.idea.psi.BallerinaXmlTypeName;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaCompletePackageNameReferenceSet;
import org.ballerinalang.plugins.idea.psi.reference.BallerinaPackageNameReference;
import org.ballerinalang.plugins.idea.sdk.BallerinaSdkService;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageDeclarationStub;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageReferenceStub;
import org.ballerinalang.plugins.idea.stubs.BallerinaPackageVersionStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BallerinaPsiImplUtil {

    private static final Key<SmartPsiElementPointer<PsiElement>> CONTEXT = Key.create("CONTEXT");

    private static List<String> BUILTIN_DIRECTORIES = new LinkedList<>();

    private static List<String> BUILTIN_VARIABLE_TYPES = new LinkedList<>();
    private static Map<String, List<BallerinaFunctionDefinition>> BUILTIN_VARIABLE_TYPE_CACHE = new HashMap<>();

    private static List<BallerinaAnnotationDefinition> BUILTIN_ANNOTATION_DEFINITION_CACHE = new LinkedList<>();
    private static List<BallerinaTypeDefinition> BUILTIN_TYPE_DEFINITION_CACHE = new LinkedList<>();

    static {
        BUILTIN_DIRECTORIES.add("/builtin");

        BUILTIN_VARIABLE_TYPES.add("future"); //async
        BUILTIN_VARIABLE_TYPES.add("blob");
        BUILTIN_VARIABLE_TYPES.add("json");
        BUILTIN_VARIABLE_TYPES.add("map");
        BUILTIN_VARIABLE_TYPES.add("stream");
        BUILTIN_VARIABLE_TYPES.add("string");
        BUILTIN_VARIABLE_TYPES.add("table");
        BUILTIN_VARIABLE_TYPES.add("xml");
    }

    public static void clearBuiltInCaches() {
        BUILTIN_VARIABLE_TYPE_CACHE.clear();
        BUILTIN_ANNOTATION_DEFINITION_CACHE.clear();
        BUILTIN_TYPE_DEFINITION_CACHE.clear();
    }

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

    public static boolean isInLocalPackage(@NotNull BallerinaFunctionNameReference nameReference) {
        //        PsiElement resolve = ballerinaNameReference.resolve();
        //        if (resolve instanceof GoTypeSpec) return ((GoTypeSpec) resolve).getSpecType();
        //        // hacky C resolve
        //        return resolve == ballerinaNameReference ? new GoCType(ballerinaNameReference) : null;
        return nameReference.getPackageReference() == null;
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

    public static boolean hasBuiltInDefinitions(@NotNull PsiElement type) {
        return BUILTIN_VARIABLE_TYPES.contains(type.getText());
    }

    @NotNull
    public synchronized static List<BallerinaFunctionDefinition> suggestBuiltInFunctions(@NotNull PsiElement type) {
        if (!hasBuiltInDefinitions(type)) {
            return new LinkedList<>();
        }
        String key = type.getText();
        if (BUILTIN_VARIABLE_TYPE_CACHE.containsKey(key)) {
            return BUILTIN_VARIABLE_TYPE_CACHE.get(key);
        }
        // Add elements from built-in packages
        for (String builtInDirectory : BUILTIN_DIRECTORIES) {

            VirtualFile file = BallerinaPsiImplUtil.findFileInSDK(type, builtInDirectory);
            if (file == null) {
                return new LinkedList<>();
            }
            VirtualFile[] builtInFiles = file.getChildren();
            for (VirtualFile builtInFile : builtInFiles) {
                if (builtInFile.isDirectory() || !"bal".equals(builtInFile.getExtension())
                        || !builtInFile.getName().equals(key + "lib.bal")) {
                    continue;
                }
                // Find the file.
                Project project = type.getProject();
                PsiFile psiFile = PsiManager.getInstance(project).findFile(builtInFile);
                if (psiFile == null) {
                    return new LinkedList<>();
                }
                List<BallerinaFunctionDefinition> functionDefinitions =
                        new ArrayList<>(PsiTreeUtil.findChildrenOfType(psiFile, BallerinaFunctionDefinition.class));
                if (!functionDefinitions.isEmpty()) {
                    BUILTIN_VARIABLE_TYPE_CACHE.put(key, functionDefinitions);
                    return functionDefinitions;
                }
            }
        }
        return new LinkedList<>();
    }

    @NotNull
    public synchronized static List<BallerinaAnnotationDefinition> suggestBuiltInAnnotations(@NotNull PsiElement element) {
        if (!BUILTIN_ANNOTATION_DEFINITION_CACHE.isEmpty()) {
            return BUILTIN_ANNOTATION_DEFINITION_CACHE;
        }

        // Add elements from built-in packages
        for (String builtInDirectory : BUILTIN_DIRECTORIES) {

            VirtualFile file = BallerinaPsiImplUtil.findFileInSDK(element, builtInDirectory);
            if (file == null) {
                return new LinkedList<>();
            }
            VirtualFile[] builtInFiles = file.getChildren();
            for (VirtualFile builtInFile : builtInFiles) {
                if (builtInFile.isDirectory() || !"bal".equals(builtInFile.getExtension())) {
                    continue;
                }
                // Find the file.
                Project project = element.getProject();
                PsiFile psiFile = PsiManager.getInstance(project).findFile(builtInFile);
                if (psiFile == null) {
                    return new LinkedList<>();
                }
                Collection<BallerinaAnnotationDefinition> annotationDefinitions =
                        PsiTreeUtil.findChildrenOfType(psiFile, BallerinaAnnotationDefinition.class);
                if (!annotationDefinitions.isEmpty()) {
                    BUILTIN_ANNOTATION_DEFINITION_CACHE.addAll(annotationDefinitions);
                }
            }
        }
        return BUILTIN_ANNOTATION_DEFINITION_CACHE;
    }

    @NotNull
    public synchronized static List<BallerinaTypeDefinition> suggestBuiltInTypes(@NotNull PsiElement element) {
        if (!BUILTIN_TYPE_DEFINITION_CACHE.isEmpty()) {
            return BUILTIN_TYPE_DEFINITION_CACHE;
        }

        // Add elements from built-in packages
        for (String builtInDirectory : BUILTIN_DIRECTORIES) {

            VirtualFile file = BallerinaPsiImplUtil.findFileInSDK(element, builtInDirectory);
            if (file == null) {
                return new LinkedList<>();
            }
            VirtualFile[] builtInFiles = file.getChildren();
            for (VirtualFile builtInFile : builtInFiles) {
                if (builtInFile.isDirectory() || !"bal".equals(builtInFile.getExtension())) {
                    continue;
                }
                // Find the file.
                Project project = element.getProject();
                PsiFile psiFile = PsiManager.getInstance(project).findFile(builtInFile);
                if (psiFile == null) {
                    return new LinkedList<>();
                }
                Collection<BallerinaTypeDefinition> typeDefinitions =
                        PsiTreeUtil.findChildrenOfType(psiFile, BallerinaTypeDefinition.class);
                if (!typeDefinitions.isEmpty()) {
                    BUILTIN_TYPE_DEFINITION_CACHE.addAll(typeDefinitions);
                }
            }
        }
        return BUILTIN_TYPE_DEFINITION_CACHE;
    }

    /**
     * Used to retrieve the type from a {@link BallerinaVariableDefinitionStatement}.
     *
     * @param ballerinaVariableDefinitionStatement a {@link BallerinaVariableDefinitionStatement} object.
     * @return Type of the definition.
     */
    @Nullable
    public static PsiElement getType(BallerinaVariableDefinitionStatement ballerinaVariableDefinitionStatement) {
        PsiElement type = ballerinaVariableDefinitionStatement.getTypeName();
        PsiReference reference = type.findReferenceAt(type.getTextLength());
        if (reference == null) {
            return type;
        }
        PsiElement resolvedElement = reference.resolve();
        if (resolvedElement != null) {
            return resolvedElement;
        } else if (type instanceof BallerinaSimpleTypeName) {
            return type;
        }
        return null;
    }

    @Nullable
    public static PsiElement getType(@NotNull BallerinaAssignmentStatement ballerinaAssignmentStatement) {
        BallerinaVariableReference variableReference = ballerinaAssignmentStatement.getVariableReference();
        if (variableReference == null) {
            return null;
        }
        PsiElement type = variableReference.getType();
        if (type != null) {
            PsiReference reference = type.findReferenceAt(type.getTextLength());
            if (reference == null) {
                return type;
            }
            return reference.resolve();
        } else if (ballerinaAssignmentStatement.getVar() != null) {
            BallerinaExpression expression = ballerinaAssignmentStatement.getExpression();
            if (expression instanceof BallerinaVariableReferenceExpression) {
                BallerinaVariableReference ballerinaVariableReference =
                        ((BallerinaVariableReferenceExpression) expression).getVariableReference();
                if (ballerinaVariableReference instanceof BallerinaFunctionInvocationReference) {
                    return getType(ballerinaVariableReference);
                } else if (ballerinaVariableReference instanceof BallerinaInvocationReference) {
                    return getType((BallerinaInvocationReference) ballerinaVariableReference);
                }
            } else if (expression instanceof BallerinaTypeConversionExpression) {
                return ((BallerinaTypeConversionExpression) expression).getTypeName();
            }

        }
        return null;
    }

    @Nullable
    public static PsiElement getCachedType(@NotNull BallerinaNameReference ballerinaNameReference) {
        return CachedValuesManager.getCachedValue(ballerinaNameReference,
                () -> CachedValueProvider.Result.create(getType(ballerinaNameReference),
                        ProjectRootManager.getInstance(ballerinaNameReference.getProject())));
    }

    @Nullable
    private static PsiElement getType(@NotNull BallerinaNameReference ballerinaNameReference) {
        // Todo - cache
        PsiElement identifier = ballerinaNameReference.getIdentifier();
        PsiReference reference = identifier.getReference();
        if (reference == null) {
            return null;
        }
        PsiElement resolvedElement = reference.resolve();
        if (resolvedElement == null) {
            return null;
        }
        PsiElement parent = resolvedElement.getParent();
        if (parent instanceof BallerinaEndpointDefinition) {

            BallerinaEndpointType endpointType = ((BallerinaEndpointDefinition) parent).getEndpointType();
            if (endpointType == null) {
                return null;
            }
            PsiReference typeReference = endpointType.getNameReference().getIdentifier().getReference();
            if (typeReference == null) {
                return null;
            }
            PsiElement resolvedType = typeReference.resolve();
            if (resolvedType == null) {
                return null;
            }
            return resolvedType;
        } else if (parent instanceof BallerinaTypeDefinition) {
            return parent;
        }
        return null;
    }

    @Nullable
    public static BallerinaTypeDefinition getMatchingFunctionFromObject(@NotNull BallerinaTypeDefinition
                                                                                ballerinaTypeDefinition,
                                                                        @NotNull String name) {
        Collection<BallerinaObjectFunctionDefinition> ballerinaObjectFunctionDefinitions =
                PsiTreeUtil.findChildrenOfType(ballerinaTypeDefinition, BallerinaObjectFunctionDefinition.class);
        for (BallerinaObjectFunctionDefinition ballerinaObjectFunctionDefinition : ballerinaObjectFunctionDefinitions) {
            BallerinaObjectCallableUnitSignature objectCallableUnitSignature = ballerinaObjectFunctionDefinition
                    .getObjectCallableUnitSignature();
            if (objectCallableUnitSignature == null) {
                continue;
            }
            BallerinaAnyIdentifierName anyIdentifierName = objectCallableUnitSignature.getAnyIdentifierName();
            if (name.equals(anyIdentifierName.getText())) {
                return getClientFromReturnType(objectCallableUnitSignature);
            }
        }
        return null;
    }

    @Nullable
    public static BallerinaTypeDefinition getClientFromReturnType(@NotNull BallerinaObjectCallableUnitSignature
                                                                          signature) {
        BallerinaReturnParameter returnParameter = signature.getReturnParameter();
        if (returnParameter == null) {
            return null;
        }
        BallerinaReturnType returnType = returnParameter.getReturnType();
        if (returnType == null) {
            return null;
        }

        BallerinaTypeName typeName = returnType.getTypeName();

        if (typeName instanceof BallerinaTupleTypeName) {
            List<BallerinaTypeName> typeNameList = ((BallerinaTupleTypeName) typeName).getTypeNameList();
            if (typeNameList.size() != 1) {
                return null;
            }
            BallerinaTypeName ballerinaTypeName = typeNameList.get(0);
            if (ballerinaTypeName instanceof BallerinaSimpleTypeName) {
                PsiElement typeFromTypeName = getTypeFromTypeName(ballerinaTypeName);
                if (typeFromTypeName == null) {
                    return null;
                }
                if (!(typeFromTypeName.getParent() instanceof BallerinaTypeDefinition)) {
                    return null;
                }
                return ((BallerinaTypeDefinition) typeFromTypeName.getParent());
            }
        } else if (typeName instanceof BallerinaSimpleTypeName) {
            PsiElement typeFromTypeName = getTypeFromTypeName(typeName);
            if (typeFromTypeName == null) {
                return null;
            }
            if (!(typeFromTypeName.getParent() instanceof BallerinaTypeDefinition)) {
                return null;
            }
            return ((BallerinaTypeDefinition) typeFromTypeName.getParent());
        }
        return null;
    }

    @Nullable
    public static PsiElement getType(@NotNull BallerinaTupleDestructuringStatement ballerinaTupleDestructuringStatement,
                                     @NotNull PsiElement identifier) {
        int index = getVariableIndex(identifier);
        if (index == -1) {
            return null;
        }

        BallerinaExpression expression = ballerinaTupleDestructuringStatement.getExpression();
        if ((expression instanceof BallerinaVariableReferenceExpression)) {
            BallerinaVariableReference variableReference = ((BallerinaVariableReferenceExpression) expression)
                    .getVariableReference();
            if (variableReference instanceof BallerinaFunctionInvocationReference) {

                BallerinaFunctionDefinition definition =
                        getFunctionDefinition(((BallerinaFunctionInvocationReference) variableReference));
                if (definition == null) {
                    return null;
                }
                BallerinaTypeName returnType = getReturnTypeFromFunction(definition);
                if (returnType instanceof BallerinaTupleTypeName) {
                    List<BallerinaTypeName> typeNameList = ((BallerinaTupleTypeName) returnType).getTypeNameList();
                    if (typeNameList.size() <= index) {
                        return null;
                    }
                    return typeNameList.get(index);
                }
                return null;
            } else if (variableReference instanceof BallerinaSimpleVariableReference) {
                return getBallerinaTypeFromVariableReference(variableReference, index);
            }
            return null;
        } else if (expression instanceof BallerinaTypeConversionExpression) {
            return ((BallerinaTypeConversionExpression) expression).getTypeName();
        }
        return null;
    }

    private static int getVariableIndex(@NotNull PsiElement identifier) {
        int index = -1;
        BallerinaVariableReferenceList ballerinaVariableReferenceList = PsiTreeUtil.getParentOfType(identifier,
                BallerinaVariableReferenceList.class);
        if (ballerinaVariableReferenceList == null) {
            return index;
        }

        List<BallerinaVariableReference> variableReferenceList =
                ballerinaVariableReferenceList.getVariableReferenceList();
        int count = 0;
        for (BallerinaVariableReference ballerinaVariableReference : variableReferenceList) {
            if (!(ballerinaVariableReference instanceof BallerinaSimpleVariableReference)) {
                count++;
                continue;
            }
            BallerinaSimpleVariableReference variableReference =
                    (BallerinaSimpleVariableReference) ballerinaVariableReference;
            BallerinaNameReference nameReference = variableReference.getNameReference();
            PsiElement element = nameReference.getIdentifier();
            if (element.equals(identifier)) {
                index = count;
                break;
            }
            count++;
        }
        return index;
    }

    /**
     * Used to retrieve the type from a {@link BallerinaVariableReference}.
     *
     * @param ballerinaVariableReference a {@link BallerinaVariableReference} object.
     * @return Type of the definition.
     */
    @Nullable
    public static PsiElement getType(@NotNull BallerinaVariableReference ballerinaVariableReference) {
        return CachedValuesManager.getCachedValue(ballerinaVariableReference,
                () -> CachedValueProvider.Result.create(getBallerinaTypeFromVariableReference
                                (ballerinaVariableReference),
                        ProjectRootManager.getInstance(ballerinaVariableReference.getProject())));
    }

    @Nullable
    public static PsiElement getBallerinaTypeFromExpression(@Nullable BallerinaExpression expression) {
        // Todo - add caching
        if (expression instanceof BallerinaVariableReferenceExpression) {
            BallerinaVariableReference variableReference = ((BallerinaVariableReferenceExpression)
                    expression).getVariableReference();
            //            if (variableReference instanceof BallerinaSimpleVariableReference) {
            //                BallerinaNameReference nameReference = ((BallerinaSimpleVariableReference)
            //                        variableReference).getNameReference();
            return BallerinaPsiImplUtil.getBallerinaTypeFromVariableReference(variableReference);
            //            }
        }
        return null;
    }

    @Nullable
    private static PsiElement getBallerinaTypeFromVariableReference(@NotNull BallerinaVariableReference
                                                                            variableReference, int index) {
        if (variableReference instanceof BallerinaSimpleVariableReference) {
            if (isVariableReferenceInForEach(variableReference)) {
                BallerinaForeachStatement foreachStatement = PsiTreeUtil.getParentOfType(variableReference,
                        BallerinaForeachStatement.class);
                if (foreachStatement != null) {
                    BallerinaVariableReferenceList variableReferenceList = foreachStatement.getVariableReferenceList();

                    if (variableReferenceList != null) {
                        List<BallerinaVariableReference> referenceList = variableReferenceList
                                .getVariableReferenceList();

                        if (referenceList.size() == 1) {
                            return getType(foreachStatement);
                        } else if (referenceList.size() == 2) {

                            // This is used to get the type for the lookup element.
                            if (referenceList.get(1).getText().equals(variableReference.getText())) {
                                return getType(foreachStatement);
                            }
                        }
                    }
                }
            }

            BallerinaNameReference ballerinaNameReference =
                    ((BallerinaSimpleVariableReference) variableReference).getNameReference();

            PsiElement identifier = ballerinaNameReference.getIdentifier();
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
            } else if (parent instanceof BallerinaGlobalVariableDefinition) {
                return resolveBallerinaType(((BallerinaGlobalVariableDefinition) parent));
            } else if (parent instanceof BallerinaFieldDefinition) {
                return getTypeNameFromField(((BallerinaFieldDefinition) parent));
            } else if (parent instanceof BallerinaParameterWithType) {
                return getTypeNameFromParameter(((BallerinaParameterWithType) parent));
            } else if (parent instanceof BallerinaNamedPattern) {
                BallerinaNamedPattern ballerinaNamedPattern = (BallerinaNamedPattern) parent;
                BallerinaTypeName typeName = ballerinaNamedPattern.getTypeName();
                if (typeName instanceof BallerinaArrayTypeName && !(variableReference.getNextSibling()
                        instanceof BallerinaIndex)) {
                    return null;
                }

                return getTypeNameFromNamedPattern(typeName);
            } else if (parent instanceof BallerinaNameReference) {
                PsiElement superParent = parent.getParent();
                if (superParent instanceof BallerinaVariableReference) {
                    BallerinaVariableReference ballerinaVariableReference = (BallerinaVariableReference) superParent;
                    if (isVariableReferenceInForEach(ballerinaVariableReference)) {
                        BallerinaForeachStatement foreachStatement =
                                PsiTreeUtil.getParentOfType(ballerinaVariableReference,
                                        BallerinaForeachStatement.class);
                        if (foreachStatement != null) {
                            BallerinaVariableReferenceList variableReferenceList = foreachStatement
                                    .getVariableReferenceList();

                            if (variableReferenceList != null) {
                                List<BallerinaVariableReference> referenceList = variableReferenceList
                                        .getVariableReferenceList();
                                // If there is only one element in the list, we resolve the type.
                                if (referenceList.size() == 1) {
                                    return getType(foreachStatement);
                                } else if (referenceList.size() == 2) {
                                    // If there are two items, the first one will be the index. So we only resolve
                                    // the second element.
                                    if (variableReference.getText().equals(referenceList.get(1).getText())) {
                                        return getType(foreachStatement);
                                    }
                                }
                            }
                        }
                    }
                }

                BallerinaAssignmentStatement ballerinaAssignmentStatement = PsiTreeUtil.getParentOfType(parent,
                        BallerinaAssignmentStatement.class);
                if (ballerinaAssignmentStatement != null) {
                    return getType(ballerinaAssignmentStatement);
                }
                BallerinaTupleDestructuringStatement tupleDestructuringStatement = PsiTreeUtil.getParentOfType(parent,
                        BallerinaTupleDestructuringStatement.class);
                if (tupleDestructuringStatement != null) {
                    PsiElement type = getType(tupleDestructuringStatement, resolvedElement);
                    index = getVariableIndex(resolvedElement);
                    if (!(type instanceof BallerinaTupleTypeName) || index == -1) {
                        return type;
                    }
                    List<BallerinaTypeName> typeNameList = ((BallerinaTupleTypeName) type).getTypeNameList();
                    if (typeNameList.size() <= index) {
                        return null;
                    }
                    return typeNameList.get(index);
                }
            }
        } else if (variableReference instanceof BallerinaFieldVariableReference) {
            BallerinaField field = ((BallerinaFieldVariableReference) variableReference).getField();
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
        } else if (variableReference instanceof BallerinaFunctionInvocationReference) {
            BallerinaFunctionInvocationReference functionInvocationReference = (BallerinaFunctionInvocationReference)
                    variableReference;
            BallerinaFunctionDefinition functionDefinition = getFunctionDefinition(functionInvocationReference);
            if (functionDefinition == null) {
                return null;
            }
            BallerinaTypeName typeName = getReturnTypeFromFunction(functionDefinition);
            if (typeName instanceof BallerinaUnionTypeName) {
                return typeName;
            } else if (typeName instanceof BallerinaTupleTypeName) {
                List<BallerinaTypeName> typeNameList = ((BallerinaTupleTypeName) typeName).getTypeNameList();
                if (typeNameList.size() == 1) {
                    return typeNameList.get(0);
                }
                return typeName;
            } else if (typeName instanceof BallerinaSimpleTypeName) {
                PsiReference reference = typeName.findReferenceAt(typeName.getTextLength());
                if (reference == null) {
                    return typeName;
                }
                PsiElement resolvedElement = reference.resolve();
                if (resolvedElement == null) {
                    return typeName;
                }
                return resolvedElement;
            }
        } else if (variableReference instanceof BallerinaInvocationReference) {
            return getType((BallerinaInvocationReference) variableReference);
        }
        return null;
    }

    @Nullable
    private static PsiElement getType(@NotNull BallerinaInvocationReference variableReference) {
        BallerinaAnyIdentifierName anyIdentifierName = variableReference
                .getInvocation().getAnyIdentifierName();
        PsiElement identifier = anyIdentifierName.getIdentifier();
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
        if (!(parent instanceof BallerinaAnyIdentifierName)) {
            return null;
        }
        BallerinaFunctionDefinition definition = PsiTreeUtil.getParentOfType(parent,
                BallerinaFunctionDefinition.class);
        if (definition != null) {
            BallerinaCallableUnitSignature callableUnitSignature = definition.getCallableUnitSignature();
            if (callableUnitSignature == null) {
                return null;
            }
            BallerinaReturnParameter returnParameter = callableUnitSignature.getReturnParameter();
            if (returnParameter == null) {
                return null;
            }
            BallerinaReturnType returnType = returnParameter.getReturnType();
            if (returnType == null) {
                return null;
            }
            BallerinaTypeName typeName = returnType.getTypeName();
            if (typeName instanceof BallerinaTupleTypeName) {
                return ((BallerinaTupleTypeName) typeName).getTypeNameList().get(0);
            }
            return typeName;
        }

        BallerinaObjectFunctionDefinition objectFunctionDefinition = PsiTreeUtil.getParentOfType(parent,
                BallerinaObjectFunctionDefinition.class);
        if (objectFunctionDefinition != null) {
            BallerinaObjectCallableUnitSignature callableUnitSignature =
                    objectFunctionDefinition.getObjectCallableUnitSignature();
            if (callableUnitSignature == null) {
                return null;
            }
            BallerinaReturnParameter returnParameter = callableUnitSignature.getReturnParameter();
            if (returnParameter == null) {
                return null;
            }
            BallerinaReturnType returnType = returnParameter.getReturnType();
            if (returnType == null) {
                return null;
            }
            BallerinaTypeName typeName = returnType.getTypeName();
            if (typeName instanceof BallerinaTupleTypeName) {
                return ((BallerinaTupleTypeName) typeName).getTypeNameList().get(0);
            }
            return typeName;
        }
        return null;
    }

    private static boolean isVariableReferenceInForEach(@NotNull BallerinaVariableReference variableReference) {
        PsiElement parent = variableReference.getParent();
        if (!(parent instanceof BallerinaVariableReferenceList)) {
            return false;
        }
        PsiElement superParent = parent.getParent();
        return superParent instanceof BallerinaForeachStatement;
    }

    private static PsiElement getType(@NotNull BallerinaForeachStatement foreachStatement) {
        BallerinaExpression expression = foreachStatement.getExpression();
        return getBallerinaTypeFromExpression(expression);
    }

    @Nullable
    private static PsiElement getBallerinaTypeFromVariableReference(@NotNull BallerinaVariableReference
                                                                            variableReference) {
        return getBallerinaTypeFromVariableReference(variableReference, -1);
    }

    @Nullable
    private static BallerinaFunctionDefinition getFunctionDefinition(@NotNull BallerinaFunctionInvocationReference
                                                                             invocationReference) {
        BallerinaFunctionInvocation functionInvocation = invocationReference.getFunctionInvocation();
        BallerinaFunctionNameReference functionNameReference = functionInvocation.getFunctionNameReference();
        BallerinaAnyIdentifierName anyIdentifierName = functionNameReference.getAnyIdentifierName();
        PsiElement identifier = anyIdentifierName.getIdentifier();
        if (identifier == null) {
            return null;
        }
        PsiReference reference = identifier.getReference();
        if (reference == null) {
            return null;
        }
        PsiElement resolvedElement = reference.resolve();
        return PsiTreeUtil.getParentOfType(resolvedElement, BallerinaFunctionDefinition.class);
    }

    @Nullable
    private static BallerinaTypeName getReturnTypeFromFunction(@NotNull BallerinaFunctionDefinition definition) {
        BallerinaCallableUnitSignature callableUnitSignature = definition.getCallableUnitSignature();
        if (callableUnitSignature == null) {
            return null;
        }
        BallerinaReturnParameter returnParameter = callableUnitSignature.getReturnParameter();
        if (returnParameter == null) {
            return null;
        }
        BallerinaReturnType returnType = returnParameter.getReturnType();
        if (returnType == null) {
            return null;
        }
        return returnType.getTypeName();
    }

    @Nullable
    public static PsiElement resolveBallerinaType(@NotNull BallerinaVariableDefinitionStatement statement) {
        BallerinaTypeName type = statement.getTypeName();
        return getTypeFromTypeName(type);
    }

    @Nullable
    public static PsiElement resolveBallerinaType(@NotNull BallerinaGlobalVariableDefinition statement) {
        BallerinaTypeName type = statement.getTypeName();
        return getTypeFromTypeName(type);
    }

    @Nullable
    private static PsiElement getTypeFromTypeName(@NotNull BallerinaTypeName type) {
        PsiReference reference = type.findReferenceAt(type.getTextLength());
        if (reference == null) {
            BallerinaBuiltInReferenceTypeName builtInReferenceTypeName = PsiTreeUtil.findChildOfType(type,
                    BallerinaBuiltInReferenceTypeName.class);
            if (builtInReferenceTypeName == null) {
                return type;
            }
            BallerinaFutureTypeName futureTypeName = builtInReferenceTypeName.getFutureTypeName();
            if (futureTypeName != null) {
                return futureTypeName.getFuture();
            }
            BallerinaJsonTypeName jsonTypeName = builtInReferenceTypeName.getJsonTypeName();
            if (jsonTypeName != null) {
                return jsonTypeName.getJson();
            }
            BallerinaMapTypeName mapTypeName = builtInReferenceTypeName.getMapTypeName();
            if (mapTypeName != null) {
                return mapTypeName.getMap();
            }
            BallerinaStreamTypeName streamTypeName = builtInReferenceTypeName.getStreamTypeName();
            if (streamTypeName != null) {
                return streamTypeName.getStream();
            }
            BallerinaTableTypeName tableTypeName = builtInReferenceTypeName.getTableTypeName();
            if (tableTypeName != null) {
                return tableTypeName.getTable();
            }
            BallerinaXmlTypeName xmlTypeName = builtInReferenceTypeName.getXmlTypeName();
            if (xmlTypeName != null) {
                return xmlTypeName.getXml();
            }
            return null;
        }
        PsiElement resolvedElement = reference.resolve();
        if (resolvedElement != null) {
            return resolvedElement;
        } else {
            return type;
        }
    }

    @Nullable
    public static PsiElement getTypeNameFromField(@NotNull BallerinaFieldDefinition fieldDefinition) {
        BallerinaTypeName typeName = fieldDefinition.getTypeName();
        if (typeName instanceof BallerinaSimpleTypeName) {
            return typeName;
        } else if (typeName instanceof BallerinaUnionTypeName) {
            BallerinaTypeName ballerinaTypeName = getTypeNameFromNillableType(((BallerinaUnionTypeName) typeName));
            if (ballerinaTypeName != null) {
                // Todo - Use a util method
                PsiReference reference = ballerinaTypeName.findReferenceAt(ballerinaTypeName.getTextLength());
                if (reference == null) {
                    return null;
                }
                return reference.resolve();
            } else {
                return typeName;
            }
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
    public static PsiElement getTypeNameFromNamedPattern(@NotNull BallerinaTypeName typeName) {
        if (typeName instanceof BallerinaTupleTypeName) {
            return PsiTreeUtil.getChildOfType(typeName, BallerinaUnionTypeName.class);
        } else if (typeName instanceof BallerinaSimpleTypeName) {
            PsiReference reference = typeName.findReferenceAt(typeName.getTextLength());
            if (reference == null) {
                return typeName;
            }
            return reference.resolve();
        } else if (typeName instanceof BallerinaArrayTypeName) {
            return ((BallerinaArrayTypeName) typeName).getTypeName();
        }
        return null;
    }

    @Nullable
    public static PsiElement getTypeNameFromParameter(@NotNull BallerinaParameterWithType parameter) {
        BallerinaTypeName typeName = parameter.getTypeName();
        if (typeName instanceof BallerinaUnionTypeName) {
            return typeName;
        }
        PsiReference reference = typeName.findReferenceAt(typeName.getTextLength());
        if (reference == null) {
            return typeName;
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

    public static boolean isAContentRoot(@Nullable PsiDirectory directory) {
        if (directory == null) {
            return true;
        }
        Module module = ModuleUtilCore.findModuleForPsiElement(directory);
        if (module == null) {
            // If we are trying to access a file which is not in the project, we should stop searching. Otherwise all
            // files in the file system will be searched.
            return true;
        }
        VirtualFile[] contentRoots = ProjectRootManager.getInstance(directory.getProject()).getContentRoots();
        for (VirtualFile contentRoot : contentRoots) {
            if (contentRoot.equals(directory.getVirtualFile())) {
                return true;
            }
        }

        Sdk moduleSdk = ModuleRootManager.getInstance(module).getSdk();
        if (moduleSdk != null) {
            VirtualFile homeDirectory = moduleSdk.getHomeDirectory();
            if (homeDirectory != null && homeDirectory.equals(directory.getVirtualFile())) {
                return true;
            }
        }

        Sdk projectSdk = ProjectRootManager.getInstance(directory.getProject()).getProjectSdk();
        if (projectSdk != null) {
            VirtualFile homeDirectory = projectSdk.getHomeDirectory();
            if (homeDirectory != null && homeDirectory.equals(directory.getVirtualFile())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static String formatBallerinaFunctionParameters(@Nullable BallerinaFormalParameterList parameterList) {
        if (parameterList == null) {
            return "()";
        }
        // Todo - Update formatting logic.
        // Todo - Format anonymous structs correctly.
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

    /**
     * Finds a file in project or module SDK.
     *
     * @param element a PsiElement
     * @param path    relative file path in the SDK
     * @return {@code null} if the file cannot be found, otherwise returns the corresponding {@link VirtualFile}.
     */
    @Nullable
    public static VirtualFile findFileInSDK(@NotNull PsiElement element, @NotNull String path) {
        // First we check the sources of module SDK.
        VirtualFile file = findFileInModuleSDK(element, path);
        if (file != null) {
            return file;
        }
        // Then we check the sources of project SDK.
        Project project = element.getProject();
        file = findFileInProjectSDK(project, path);
        if (file != null) {
            return file;
        }
        String sdkHomePath = BallerinaSdkService.getInstance(project).getSdkHomePath(null);
        if (sdkHomePath == null) {
            return null;
        }
        VirtualFile virtualFile = LocalFileSystem.getInstance().findFileByPath(sdkHomePath);
        if (virtualFile == null) {
            return null;
        }
        return VfsUtilCore.findRelativeFile("src/" + path, virtualFile);
    }

    /**
     * Finds a file in the module SDK.
     *
     * @param element a PsiElement
     * @param path    relative file path in the SDK
     * @return {@code null} if the file cannot be found, otherwise returns the corresponding {@link VirtualFile}.
     */
    @Nullable
    public static VirtualFile findFileInModuleSDK(@NotNull PsiElement element, @NotNull String path) {
        Module module = ModuleUtilCore.findModuleForPsiElement(element);
        if (module == null) {
            return null;
        }

        Sdk moduleSdk = ModuleRootManager.getInstance(module).getSdk();
        if (moduleSdk == null) {
            return null;
        }
        VirtualFile[] roots = moduleSdk.getSdkModificator().getRoots(OrderRootType.SOURCES);
        VirtualFile file;
        for (VirtualFile root : roots) {
            file = VfsUtilCore.findRelativeFile(path, root);
            if (file != null) {
                return file;
            }
        }
        return null;
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
}
