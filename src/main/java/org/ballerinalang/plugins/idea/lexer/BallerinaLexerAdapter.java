package org.ballerinalang.plugins.idea.lexer;

import com.intellij.lexer.FlexAdapter;

public class BallerinaLexerAdapter extends FlexAdapter {

    public BallerinaLexerAdapter() {
        super(new BallerinaLexer(null));
    }
}
