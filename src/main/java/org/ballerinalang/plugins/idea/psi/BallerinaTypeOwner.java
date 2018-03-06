package org.ballerinalang.plugins.idea.psi;

import com.intellij.psi.ResolveState;
import org.jetbrains.annotations.Nullable;

public interface BallerinaTypeOwner extends BallerinaCompositeElement {

    @Nullable
    BallerinaTypeName getBallerinaType(@Nullable ResolveState context);
}
