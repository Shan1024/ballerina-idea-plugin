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

package org.ballerinalang.plugins.idea.stubs.factory;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.util.containers.HashMap;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaAliasStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaAnnotationDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaConstantDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaEndpointDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaEnumDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaEnumeratorStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaFieldDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaFieldStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaFunctionDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaGlobalEndpointDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaGlobalVariableDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaNameReferenceStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaNamespaceDeclarationStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaOrgNameStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaPackageDeclarationStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaPackageNameStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaPackageReferenceStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaPackageVersionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaParameterStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaStructDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaTransformerDefinitionStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaVariableDefinitionStatementStubElementType;
import org.ballerinalang.plugins.idea.stubs.types.BallerinaWorkerDefinitionStubElementType;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class BallerinaElementTypeFactory {
    private static final Map<String, Class> TYPES = new HashMap<String, Class>() {
        {
            //      put("ARRAY_OR_SLICE_TYPE", GoArrayOrSliceTypeImpl.class);
            //      put("CHANNEL_TYPE", GoChannelTypeImpl.class);
            //      put("FUNCTION_TYPE", GoFunctionTypeImpl.class);
            //      put("INTERFACE_TYPE", GoInterfaceTypeImpl.class);
            //      put("MAP_TYPE", GoMapTypeImpl.class);
            //      put("POINTER_TYPE", GoPointerTypeImpl.class);
            //      put("STRUCT_TYPE", GoStructTypeImpl.class);
            //      put("TYPE", GoTypeImpl.class);
            //      put("PAR_TYPE", GoParTypeImpl.class);
            //      put("SPEC_TYPE", GoSpecTypeImpl.class);
            //      put("TYPE_LIST", GoTypeListImpl.class);
        }
    };

    private BallerinaElementTypeFactory() {
    }

    public static IStubElementType stubFactory(@NotNull String name) {
        // NOTE - If the element type is wrong, an error will occur while loading the lexer in syntax highlighting.
        switch (name) {
            case "PACKAGE_DECLARATION":
                return BallerinaPackageDeclarationStubElementType.INSTANCE;
            case "FUNCTION_DEFINITION":
                return new BallerinaFunctionDefinitionStubElementType(name);
            case "STRUCT_DEFINITION":
                return new BallerinaStructDefinitionStubElementType(name);
            case "GLOBAL_VARIABLE_DEFINITION":
                return new BallerinaGlobalVariableDefinitionStubElementType(name);
            case "ENUM_DEFINITION":
                return new BallerinaEnumDefinitionStubElementType(name);
            case "ANNOTATION_DEFINITION":
                return new BallerinaAnnotationDefinitionStubElementType(name);
            case "TRANSFORMER_DEFINITION":
                return new BallerinaTransformerDefinitionStubElementType(name);
            case "CONSTANT_DEFINITION":
                return new BallerinaConstantDefinitionStubElementType(name);
            case "GLOBAL_ENDPOINT_DEFINITION":
                return new BallerinaGlobalEndpointDefinitionStubElementType(name);
            case "ENDPOINT_DEFINITION":
                return new BallerinaEndpointDefinitionStubElementType(name);
            case "WORKER_DEFINITION":
                return new BallerinaWorkerDefinitionStubElementType(name);
            case "PACKAGE_NAME":
                return new BallerinaPackageNameStubElementType(name);
            case "ORG_NAME":
                return new BallerinaOrgNameStubElementType(name);
            case "PACKAGE_VERSION":
                return new BallerinaPackageVersionStubElementType(name);
            case "ALIAS":
                return new BallerinaAliasStubElementType(name);
            case "ENUMERATOR":
                return new BallerinaEnumeratorStubElementType(name);
            case "VARIABLE_DEFINITION_STATEMENT":
                return new BallerinaVariableDefinitionStatementStubElementType(name);
            case "PARAMETER":
                return new BallerinaParameterStubElementType(name);
            case "FIELD_DEFINITION":
                return new BallerinaFieldDefinitionStubElementType(name);
            case "NAME_REFERENCE":
                return new BallerinaNameReferenceStubElementType(name);
            case "PACKAGE_REFERENCE":
                return new BallerinaPackageReferenceStubElementType(name);
            case "FIELD":
                return new BallerinaFieldStubElementType(name);
            case "NAMESPACE_DECLARATION":
                return new BallerinaNamespaceDeclarationStubElementType(name);
        }

        //    if ("CONST_SPEC".equals(name)) return new GoConstSpecStubElementType(name);
        //        if ("PACKAGE_CLAUSE".equals(name)) {
        //            return BallerinaPackageDeclarationStubElementType.INSTANCE;
        //        }
        //    if ("VAR_SPEC".equals(name)) return new GoVarSpecStubElementType(name);
        //        if ("SHORT_VAR_DECLARATION".equals(name)) return new GoVarSpecStubElementType(name) {
        //            @NotNull
        //            @Override
        //            public GoVarSpec createPsi(@NotNull GoVarSpecStub stub) {
        //                return new GoShortVarDeclarationImpl(stub, this);
        //            }
        //        };
        //        if ("RECV_STATEMENT".equals(name)) return new GoVarSpecStubElementType(name) {
        //            @NotNull
        //            @Override
        //            public GoVarSpec createPsi(@NotNull GoVarSpecStub stub) {
        //                return new GoRecvStatementImpl(stub, this);
        //            }
        //        };
        //        if ("RANGE_CLAUSE".equals(name)) return new GoVarSpecStubElementType(name) {
        //            @NotNull
        //            @Override
        //            public GoVarSpec createPsi(@NotNull GoVarSpecStub stub) {
        //                return new GoRangeClauseImpl(stub, this);
        //            }
        //        };
        //        if ("VAR_DEFINITION".equals(name)) return new GoVarDefinitionStubElementType(name);
        //        if ("LABEL_DEFINITION".equals(name)) return new GoLabelDefinitionStubElementType(name);
        //        if ("PARAMETERS".equals(name)) return new GoParametersStubElementType(name);
        //        if ("SIGNATURE".equals(name)) return new GoSignatureStubElementType(name);
        //        if ("PARAMETER_DECLARATION".equals(name)) return new GoParameterDeclarationStubElementType(name);
        //        if ("RESULT".equals(name)) return new GoResultStubElementType(name);
        //
        //        Class c = TYPES.get(name);
        //        if (c != null) {
        //            return new GoTypeStubElementType(name) {
        //                @NotNull
        //                @Override
        //                public GoType createPsi(@NotNull GoTypeStub stub) {
        //                    try {
        //                        //noinspection unchecked
        //                        return (GoType) ReflectionUtil.createInstance(c.getConstructor(stub.getClass(),
        // IStubElementType.class), stub, this);
        //                    } catch (NoSuchMethodException e) {
        //                        throw new RuntimeException(e);
        //                    }
        //                }
        //            };
        //        }
        throw new RuntimeException("Unknown element type: " + name);
    }
}
