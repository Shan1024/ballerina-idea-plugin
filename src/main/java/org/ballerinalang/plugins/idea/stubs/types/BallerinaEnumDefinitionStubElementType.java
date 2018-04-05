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
//import org.ballerinalang.plugins.idea.psi.BallerinaEnumDefinition;
//import org.ballerinalang.plugins.idea.psi.BallerinaNamedElement;
//import org.ballerinalang.plugins.idea.psi.impl.BallerinaEnumDefinitionImpl;
//import org.ballerinalang.plugins.idea.stubs.BallerinaEnumDefinitionStub;
//import org.ballerinalang.plugins.idea.stubs.index.BallerinaEnumIndex;
//import org.jetbrains.annotations.NotNull;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class BallerinaEnumDefinitionStubElementType extends
//        BallerinaNamedStubElementType<BallerinaEnumDefinitionStub, BallerinaEnumDefinition> {
//
//    private static final ArrayList<StubIndexKey<String, ? extends BallerinaNamedElement>> EXTRA_KEYS =
//            ContainerUtil.newArrayList(BallerinaEnumIndex.KEY);
//
//    public BallerinaEnumDefinitionStubElementType(@NotNull String debugName) {
//        super(debugName);
//    }
//
//    @Override
//    public BallerinaEnumDefinition createPsi(@NotNull BallerinaEnumDefinitionStub stub) {
//        return new BallerinaEnumDefinitionImpl(stub, this);
//    }
//
//    @NotNull
//    @Override
//    public BallerinaEnumDefinitionStub createStub(@NotNull BallerinaEnumDefinition psi, StubElement
//            parentStub) {
//        return new BallerinaEnumDefinitionStub(parentStub, this, psi.getName(), psi.isPublic());
//    }
//
//    @Override
//    public void indexStub(@NotNull BallerinaEnumDefinitionStub stub, @NotNull IndexSink sink) {
//        String name = stub.getName();
//        if (shouldIndex() && StringUtil.isNotEmpty(name)) {
//            sink.occurrence(BallerinaEnumIndex.KEY, name);
//        }
//    }
//
//    @Override
//    public void serialize(@NotNull BallerinaEnumDefinitionStub stub, @NotNull StubOutputStream dataStream)
//            throws IOException {
//        dataStream.writeName(stub.getName());
//        dataStream.writeBoolean(stub.isPublic());
//    }
//
//    @NotNull
//    @Override
//    public BallerinaEnumDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub)
//            throws IOException {
//        return new BallerinaEnumDefinitionStub(parentStub, this, dataStream.readName(), dataStream.readBoolean());
//    }
//
//    @NotNull
//    @Override
//    protected Collection<StubIndexKey<String, ? extends BallerinaNamedElement>> getExtraIndexKeys() {
//        return EXTRA_KEYS;
//    }
//}
