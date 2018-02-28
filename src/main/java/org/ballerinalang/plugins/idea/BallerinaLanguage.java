package org.ballerinalang.plugins.idea;

import com.intellij.lang.Language;

public class BallerinaLanguage extends Language {

    public static final BallerinaLanguage INSTANCE = new BallerinaLanguage();

    private BallerinaLanguage() {
        super("Ballerina");
    }
}
