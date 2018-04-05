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
//import com.intellij.psi.stubs.StubElement;
//import com.intellij.psi.stubs.StubInputStream;
//import com.intellij.psi.stubs.StubOutputStream;
//import org.ballerinalang.plugins.idea.psi.BallerinaField;
//import org.ballerinalang.plugins.idea.psi.impl.BallerinaFieldImpl;
//import org.ballerinalang.plugins.idea.stubs.BallerinaFieldStub;
//import org.jetbrains.annotations.NotNull;
//
//import java.io.IOException;
//
//public class BallerinaFieldStubElementType extends
//        BallerinaNamedStubElementType<BallerinaFieldStub, BallerinaField> {
//
//    public BallerinaFieldStubElementType(@NotNull String debugName) {
//        super(debugName);
//    }
//
//    @Override
//    public BallerinaField createPsi(@NotNull BallerinaFieldStub stub) {
//        return new BallerinaFieldImpl(stub, this);
//    }
//
//    @NotNull
//    @Override
//    public BallerinaFieldStub createStub(@NotNull BallerinaField psi, StubElement parentStub) {
//        return new BallerinaFieldStub(parentStub, this, psi.getName(), psi.isPublic());
//    }
//
//    @Override
//    public void serialize(@NotNull BallerinaFieldStub stub, @NotNull StubOutputStream dataStream)
//            throws IOException {
//        dataStream.writeName(stub.getName());
//        dataStream.writeBoolean(stub.isPublic());
//    }
//
//    @NotNull
//    @Override
//    public BallerinaFieldStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub)
//            throws IOException {
//        return new BallerinaFieldStub(parentStub, this, dataStream.readName(), dataStream.readBoolean());
//    }
//}
