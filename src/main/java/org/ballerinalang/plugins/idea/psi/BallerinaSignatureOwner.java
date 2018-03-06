package org.ballerinalang.plugins.idea.psi;

import org.jetbrains.annotations.Nullable;

public interface BallerinaSignatureOwner extends BallerinaCompositeElement {

    @Nullable
    BallerinaCallableUnitSignature getSignature();
}
