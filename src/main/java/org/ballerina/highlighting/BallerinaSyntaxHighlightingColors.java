package org.ballerina.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class BallerinaSyntaxHighlightingColors {

    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("BALLERINA_LINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("BALLERINA_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = createTextAttributesKey("BALLERINA_STRING",
            DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("BALLERINA_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("BALLERINA_BAD_TOKEN",
            HighlighterColors.BAD_CHARACTER);
}
