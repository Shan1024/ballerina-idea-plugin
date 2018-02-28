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
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.ballerina.lexer.BallerinaLexerAdapter;
import org.ballerina.parser.BallerinaParser;
import org.ballerina.psi.BallerinaFile;
import org.ballerina.psi.BallerinaTypes;
import org.jetbrains.annotations.NotNull;

import static org.ballerina.psi.BallerinaTypes.ABORT;
import static org.ballerina.psi.BallerinaTypes.ACTION;
import static org.ballerina.psi.BallerinaTypes.ALL;
import static org.ballerina.psi.BallerinaTypes.ANNOTATION;
import static org.ballerina.psi.BallerinaTypes.ANY;
import static org.ballerina.psi.BallerinaTypes.AS;
import static org.ballerina.psi.BallerinaTypes.ATTACH;
import static org.ballerina.psi.BallerinaTypes.BIND;
import static org.ballerina.psi.BallerinaTypes.BLOB;
import static org.ballerina.psi.BallerinaTypes.BOOLEAN;
import static org.ballerina.psi.BallerinaTypes.BREAK;
import static org.ballerina.psi.BallerinaTypes.CATCH;
import static org.ballerina.psi.BallerinaTypes.CONNECTOR;
import static org.ballerina.psi.BallerinaTypes.CONST;
import static org.ballerina.psi.BallerinaTypes.CREATE;
import static org.ballerina.psi.BallerinaTypes.ELSE;
import static org.ballerina.psi.BallerinaTypes.ENDPOINT;
import static org.ballerina.psi.BallerinaTypes.ENUM;
import static org.ballerina.psi.BallerinaTypes.FAILED;
import static org.ballerina.psi.BallerinaTypes.FINALLY;
import static org.ballerina.psi.BallerinaTypes.FLOAT;
import static org.ballerina.psi.BallerinaTypes.FOREACH;
import static org.ballerina.psi.BallerinaTypes.FORK;
import static org.ballerina.psi.BallerinaTypes.FUNCTION;
import static org.ballerina.psi.BallerinaTypes.IF;
import static org.ballerina.psi.BallerinaTypes.IMPORT;
import static org.ballerina.psi.BallerinaTypes.IN;
import static org.ballerina.psi.BallerinaTypes.INT;
import static org.ballerina.psi.BallerinaTypes.INTEGERLITERAL;
import static org.ballerina.psi.BallerinaTypes.JOIN;
import static org.ballerina.psi.BallerinaTypes.JSON;
import static org.ballerina.psi.BallerinaTypes.LENGTHOF;
import static org.ballerina.psi.BallerinaTypes.LINE_COMMENT;
import static org.ballerina.psi.BallerinaTypes.LOCK;
import static org.ballerina.psi.BallerinaTypes.MAP;
import static org.ballerina.psi.BallerinaTypes.NATIVE;
import static org.ballerina.psi.BallerinaTypes.NEXT;
import static org.ballerina.psi.BallerinaTypes.PACKAGE;
import static org.ballerina.psi.BallerinaTypes.PARAMETER;
import static org.ballerina.psi.BallerinaTypes.PRIVATE;
import static org.ballerina.psi.BallerinaTypes.PUBLIC;
import static org.ballerina.psi.BallerinaTypes.QUOTEDSTRINGLITERAL;
import static org.ballerina.psi.BallerinaTypes.RESOURCE;
import static org.ballerina.psi.BallerinaTypes.RETRIES;
import static org.ballerina.psi.BallerinaTypes.RETURN;
import static org.ballerina.psi.BallerinaTypes.RETURNS;
import static org.ballerina.psi.BallerinaTypes.SERVICE;
import static org.ballerina.psi.BallerinaTypes.SOME;
import static org.ballerina.psi.BallerinaTypes.STRING;
import static org.ballerina.psi.BallerinaTypes.STRUCT;
import static org.ballerina.psi.BallerinaTypes.TABLE;
import static org.ballerina.psi.BallerinaTypes.THROW;
import static org.ballerina.psi.BallerinaTypes.TIMEOUT;
import static org.ballerina.psi.BallerinaTypes.TRANSACTION;
import static org.ballerina.psi.BallerinaTypes.TRANSFORMER;
import static org.ballerina.psi.BallerinaTypes.TRY;
import static org.ballerina.psi.BallerinaTypes.TYPE;
import static org.ballerina.psi.BallerinaTypes.TYPEOF;
import static org.ballerina.psi.BallerinaTypes.VAR;
import static org.ballerina.psi.BallerinaTypes.VERSION;
import static org.ballerina.psi.BallerinaTypes.WHILE;
import static org.ballerina.psi.BallerinaTypes.WITH;
import static org.ballerina.psi.BallerinaTypes.WORKER;
import static org.ballerina.psi.BallerinaTypes.XML;
import static org.ballerina.psi.BallerinaTypes.XMLNS;

public class BallerinaParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(LINE_COMMENT);

    public static final TokenSet STRINGS = TokenSet.create(QUOTEDSTRINGLITERAL);

    public static final TokenSet NUMBERS = TokenSet.create(INTEGERLITERAL);

    public static final TokenSet KEYWORDS = TokenSet.create(ABORT, ACTION, ALL, ANNOTATION, ANY, AS, ATTACH, BIND,
            BLOB, BOOLEAN, BREAK, CATCH, CONNECTOR, CONST, CREATE, ELSE, ENDPOINT, ENUM, FAILED, FINALLY, FLOAT,
            FOREACH, FORK, FUNCTION, IF, IMPORT, IN, INT, JOIN, JSON, LENGTHOF, LOCK, MAP, NATIVE, NEXT, PACKAGE,
            PARAMETER, PRIVATE, PUBLIC, RESOURCE, RETRIES, RETURN, RETURNS, SERVICE, SOME, STRING, STRUCT, TABLE,
            TIMEOUT, TRANSACTION, TRANSFORMER, TRY, TYPE, TYPEOF, THROW, WHILE, WITH, WORKER, VAR, VERSION, XML, XMLNS);

    public static final TokenSet OPERATORS = TokenSet.create();

    public static final TokenSet BAD_CHARACTER = TokenSet.create(TokenType.BAD_CHARACTER);

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
