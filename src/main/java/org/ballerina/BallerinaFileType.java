package org.ballerina;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class BallerinaFileType extends LanguageFileType {

    public static final BallerinaFileType INSTANCE = new BallerinaFileType();

    private BallerinaFileType() {
        super(BallerinaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ballerina file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Ballerina language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "bal";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return BallerinaIcons.FILE;
    }
}
