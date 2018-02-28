package org.ballerinalang.plugins.idea.psi;

import com.intellij.psi.tree.IElementType;
import org.ballerinalang.plugins.idea.BallerinaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BallerinaElementType extends IElementType {

    public BallerinaElementType(@NotNull @NonNls String debugName) {
        super(debugName, BallerinaLanguage.INSTANCE);
    }
}
