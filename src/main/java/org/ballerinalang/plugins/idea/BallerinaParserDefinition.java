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

import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ABORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ACTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ALL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ANNOTATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ANY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.AS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ATTACH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BIND;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BLOB;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BOOLEAN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BREAK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CATCH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CONNECTOR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CONST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CREATE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ELSE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ENDPOINT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ENUM;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FAILED;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FINALLY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FLOAT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FOREACH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FORK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FUNCTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IMPORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INTEGERLITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.JOIN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.JSON;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LENGTHOF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LINE_COMMENT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LOCK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MAP;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NATIVE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NEXT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PACKAGE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PARAMETER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PRIVATE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PUBLIC;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.QUOTEDSTRINGLITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RESOURCE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETRIES;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURNS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SERVICE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SOME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.STRING;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.STRUCT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TABLE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.THROW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TIMEOUT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRANSACTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRANSFORMER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPEOF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.VAR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.VERSION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WHILE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WITH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WORKER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.XML;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.XMLNS;

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
