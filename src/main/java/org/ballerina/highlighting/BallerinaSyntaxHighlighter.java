package org.ballerina.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.ballerina.BallerinaParserDefinition;
import org.ballerina.lexer.BallerinaLexerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static org.ballerina.highlighting.BallerinaSyntaxHighlightingColors.BAD_CHARACTER;
import static org.ballerina.highlighting.BallerinaSyntaxHighlightingColors.KEYWORD;
import static org.ballerina.highlighting.BallerinaSyntaxHighlightingColors.LINE_COMMENT;
import static org.ballerina.highlighting.BallerinaSyntaxHighlightingColors.NUMBER;
import static org.ballerina.highlighting.BallerinaSyntaxHighlightingColors.STRING;

public class BallerinaSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        fillMap(ATTRIBUTES, BallerinaParserDefinition.COMMENTS, LINE_COMMENT);
        fillMap(ATTRIBUTES, BallerinaParserDefinition.KEYWORDS, KEYWORD);
        fillMap(ATTRIBUTES, BallerinaParserDefinition.STRING, STRING);
        fillMap(ATTRIBUTES, BallerinaParserDefinition.NUMBERS, NUMBER);
        fillMap(ATTRIBUTES, BallerinaParserDefinition.BAD_CHARACTER, BAD_CHARACTER);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new BallerinaLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
