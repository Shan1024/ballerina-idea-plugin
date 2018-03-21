///*
// * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// *
// */
//
//package org.ballerinalang.plugins.idea.stubs.types;
//
//import com.intellij.openapi.util.text.StringUtil;
//import com.intellij.psi.stubs.IndexSink;
//import com.intellij.psi.stubs.StubElement;
//import com.intellij.psi.stubs.StubIndexKey;
//import com.intellij.psi.stubs.StubInputStream;
//import com.intellij.psi.stubs.StubOutputStream;
//import com.intellij.util.containers.ContainerUtil;
//import org.ballerinalang.plugins.idea.psi.BallerinaConnectorDefinition;
//import org.ballerinalang.plugins.idea.psi.BallerinaNamedElement;
//import org.ballerinalang.plugins.idea.psi.impl.BallerinaConnectorDefinitionImpl;
//import org.ballerinalang.plugins.idea.stubs.BallerinaConnectorDefinitionStub;
//import org.ballerinalang.plugins.idea.stubs.index.BallerinaConnectorIndex;
//import org.jetbrains.annotations.NotNull;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class BallerinaConnectorDefinitionStubElementType extends
//        BallerinaNamedStubElementType<BallerinaConnectorDefinitionStub, BallerinaConnectorDefinition> {
//
//    private static final ArrayList<StubIndexKey<String, ? extends BallerinaNamedElement>> EXTRA_KEYS =
//            ContainerUtil.newArrayList(BallerinaConnectorIndex.KEY);
//
//    public BallerinaConnectorDefinitionStubElementType(@NotNull String debugName) {
//        super(debugName);
//    }
//
//    @Override
//    public BallerinaConnectorDefinition createPsi(@NotNull BallerinaConnectorDefinitionStub stub) {
//        return new BallerinaConnectorDefinitionImpl(stub, this);
//    }
//
//    @NotNull
//    @Override
//    public BallerinaConnectorDefinitionStub createStub(@NotNull BallerinaConnectorDefinition psi, StubElement
//            parentStub) {
//        return new BallerinaConnectorDefinitionStub(parentStub, this, psi.getName(), psi.isPublic());
//    }
//
//    @Override
//    public void indexStub(@NotNull BallerinaConnectorDefinitionStub stub, @NotNull IndexSink sink) {
//        String name = stub.getName();
//        if (shouldIndex() && StringUtil.isNotEmpty(name)) {
//            sink.occurrence(BallerinaConnectorIndex.KEY, name);
//        }
//    }
//
//    @Override
//    public void serialize(@NotNull BallerinaConnectorDefinitionStub stub, @NotNull StubOutputStream dataStream)
//            throws IOException {
//        dataStream.writeName(stub.getName());
//        dataStream.writeBoolean(stub.isPublic());
//    }
//
//    @NotNull
//    @Override
//    public BallerinaConnectorDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub)
//            throws IOException {
//        return new BallerinaConnectorDefinitionStub(parentStub, this, dataStream.readName(), dataStream.readBoolean());
//    }
//
//    @NotNull
//    @Override
//    protected Collection<StubIndexKey<String, ? extends BallerinaNamedElement>> getExtraIndexKeys() {
//        return EXTRA_KEYS;
//    }
//}
