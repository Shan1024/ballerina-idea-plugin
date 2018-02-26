package com.simpleplugin.lexer;

import com.intellij.lexer.FlexAdapter;
import com.simpleplugin.grammar._SimpleLexer;

public class SimpleLexerAdapter extends FlexAdapter {

    public SimpleLexerAdapter() {
        super(new _SimpleLexer(null));
    }
}
