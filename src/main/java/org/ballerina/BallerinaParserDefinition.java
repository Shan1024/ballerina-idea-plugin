package org.ballerina;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.ballerina.lexer.BallerinaLexerAdapter;
import org.ballerina.parser.BallerinaParser;
import org.ballerina.psi.BallerinaFile;
import org.ballerina.psi.BallerinaTypes;
import org.jetbrains.annotations.NotNull;

import static org.ballerina.psi.BallerinaTypes.FUNCTION;
import static org.ballerina.psi.BallerinaTypes.QUOTEDSTRINGLITERAL;

public class BallerinaParserDefinition implements ParserDefinition {

    public static final IElementType LINE_COMMENT = BallerinaTypes.LINE_COMMENT;

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(LINE_COMMENT);

    public static final TokenSet STRING = TokenSet.create(QUOTEDSTRINGLITERAL);

    public static final TokenSet KEYWORDS = TokenSet.create(FUNCTION);

    public static final IFileElementType FILE = new IFileElementType(BallerinaLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new BallerinaLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new BallerinaParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new BallerinaFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return BallerinaTypes.Factory.createElement(node);
    }
}
