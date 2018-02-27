package org.ballerina.psi;

import com.intellij.psi.tree.IElementType;
import org.ballerina.BallerinaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BallerinaElementType extends IElementType {

    public BallerinaElementType(@NotNull @NonNls String debugName) {
        super(debugName, BallerinaLanguage.INSTANCE);
    }
}
