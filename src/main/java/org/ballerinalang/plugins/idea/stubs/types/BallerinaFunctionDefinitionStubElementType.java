package org.ballerinalang.plugins.idea.stubs.types;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubIndexKey;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaNamedElement;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaFunctionDefinitionImpl;
import org.ballerinalang.plugins.idea.stubs.BallerinaFunctionDefinitionStub;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaFunctionIndex;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class BallerinaFunctionDefinitionStubElementType extends
        BallerinaNamedStubElementType<BallerinaFunctionDefinitionStub, BallerinaFunctionDefinition> {

    private static final ArrayList<StubIndexKey<String, ? extends BallerinaNamedElement>> EXTRA_KEYS =
            ContainerUtil.newArrayList(BallerinaFunctionIndex.KEY);

    public BallerinaFunctionDefinitionStubElementType(@NotNull String debugName) {
        super(debugName);
    }

    @Override
    public BallerinaFunctionDefinition createPsi(@NotNull BallerinaFunctionDefinitionStub stub) {
        return new BallerinaFunctionDefinitionImpl(stub, this);
    }

    @NotNull
    @Override
    public BallerinaFunctionDefinitionStub createStub(@NotNull BallerinaFunctionDefinition psi, StubElement
            parentStub) {
        return new BallerinaFunctionDefinitionStub(parentStub, this, psi.getName(), psi.isPublic());
    }

    @Override
    public void indexStub(@NotNull BallerinaFunctionDefinitionStub stub, @NotNull IndexSink sink) {
        String name = stub.getName();
        if (shouldIndex() && StringUtil.isNotEmpty(name)) {
            sink.occurrence(BallerinaFunctionIndex.KEY, name);
        }
    }

    @Override
    public void serialize(@NotNull BallerinaFunctionDefinitionStub stub, @NotNull StubOutputStream dataStream)
            throws IOException {
        dataStream.writeName(stub.getName());
        dataStream.writeBoolean(stub.isPublic());
    }

    @NotNull
    @Override
    public BallerinaFunctionDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub)
            throws IOException {
        return new BallerinaFunctionDefinitionStub(parentStub, this, dataStream.readName(), dataStream.readBoolean());
    }

    @NotNull
    @Override
    protected Collection<StubIndexKey<String, ? extends BallerinaNamedElement>> getExtraIndexKeys() {
        return EXTRA_KEYS;
    }
}
