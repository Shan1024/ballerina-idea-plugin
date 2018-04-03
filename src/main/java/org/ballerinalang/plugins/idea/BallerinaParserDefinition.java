/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.ballerinalang.plugins.idea;

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
import org.ballerinalang.plugins.idea.lexer.BallerinaLexerAdapter;
import org.ballerinalang.plugins.idea.parser.BallerinaParser;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;
import org.jetbrains.annotations.NotNull;

import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.*;

public class BallerinaParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(LINE_COMMENT);

    public static final TokenSet STRINGS = TokenSet.create(QUOTED_STRING_LITERAL);

    public static final TokenSet NUMBERS = TokenSet.create(DECIMAL_INTEGER_LITERAL, HEX_INTEGER_LITERAL,
            OCTAL_INTEGER_LITERAL, BINARY_INTEGER_LITERAL, FLOATING_POINT_LITERAL);

    public static final TokenSet KEYWORDS = TokenSet.create(ABORT, ALL, ANNOTATION, ANY, AS, ASYNC, AWAIT, BIND,
            BLOB, BOOLEAN, BREAK, BUT, CATCH, CHECK, CONST, DOCUMENTATION, DEPRECATED, ELSE, ENDPOINT, ENUM, FAIL,
            FINALLY, FLOAT, FOREACH, FORK, FUNCTION, FUTURE, IF, IMPORT, IN, INT, JOIN, JSON, LENGTHOF, LOCK, MAP,
            MATCH, NATIVE, NEW, NEXT, OBJECT, ONABORT, ONCOMMIT, ONRETRY, PACKAGE, PARAMETER, PRIVATE, PUBLIC, RESOURCE,
            RETRIES, RETURN, RETURNS, SERVICE, SOME, STREAM, STRING, STRUCT, TABLE, TIMEOUT, TRANSACTION, TRANSFORMER,
            TRY, TYPE, TYPEDESC, TYPEOF, THROW, UNTAINT, WHILE, WITH, WORKER, VAR, VERSION, XML, XMLNS, BOOLEAN_LITERAL,
            NULL_LITERAL,

            FROM, ON, SELECT, GROUP, BY, HAVING, ORDER, WHERE, FOLLOWED, SET, FOR, WINDOW, EXPIRED, CURRENT, EVENTS,
            EVERY, WITHIN, LAST, FIRST, SNAPSHOT, OUTPUT, INNER, OUTER, RIGHT, LEFT, FULL, UNIDIRECTIONAL, SECOND,
            MINUTE, HOUR, DAY, MONTH, YEAR, FOREVER

    );

    public static final TokenSet OPERATORS = TokenSet.create();

    public static final TokenSet BAD_CHARACTER = TokenSet.create(TokenType.BAD_CHARACTER);

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
        return BallerinaFileElementType.INSTANCE;
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
