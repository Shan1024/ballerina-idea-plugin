package org.ballerinalang.plugins.idea.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;

public class BallerinaFunctionDefinitionStub extends BallerinaNamedStub<BallerinaFunctionDefinition> {

    public BallerinaFunctionDefinitionStub(StubElement parent, IStubElementType elementType, StringRef name,
                                           boolean isPublic) {
        super(parent, elementType, name, isPublic);
    }

    public BallerinaFunctionDefinitionStub(StubElement parent, IStubElementType elementType, String name,
                                           boolean isPublic) {
        super(parent, elementType, name, isPublic);
    }
}
