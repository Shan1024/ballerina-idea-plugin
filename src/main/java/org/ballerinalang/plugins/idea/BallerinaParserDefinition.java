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
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ALL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ANNOTATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ANY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.AS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ASYNC;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.AWAIT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BINARY_INTEGER_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BIND;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BLOB;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BOOLEAN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BOOLEAN_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BREAK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CATCH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CONST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CURRENT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DAY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DECIMAL_INTEGER_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DEPRECATED;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DOCUMENTATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ELSE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ENDPOINT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ENUM;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.EVENTS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.EVERY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.EXPIRED;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FAIL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FINALLY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FIRST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FLOAT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FLOATING_POINT_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FOLLOWED;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FOR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FOREACH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FOREVER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FORK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FROM;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FULL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FUNCTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FUTURE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.GROUP;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.HAVING;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.HEX_INTEGER_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.HOUR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IMPORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INNER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.JOIN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.JSON;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LAST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LEFT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LENGTHOF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LINE_COMMENT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LOCK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MAP;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MATCH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MINUTE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MONTH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NATIVE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NEW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NEXT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NULL_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.OBJECT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.OCTAL_INTEGER_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ON;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ONABORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ONCOMMIT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ONRETRY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ORDER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.OUTER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.OUTPUT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PACKAGE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PARAMETER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PRIVATE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PUBLIC;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.QUOTED_STRING_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RESOURCE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETRIES;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURNS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RIGHT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SECOND;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SELECT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SERVICE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SET;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SNAPSHOT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SOME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.STREAM;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.STRING;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.STRUCT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TABLE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.THROW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TIMEOUT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRANSACTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRANSFORMER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPEDESC;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPEOF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.UNIDIRECTIONAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.UNTAINT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.VAR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.VERSION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WHERE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WHILE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WINDOW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WITH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WITHIN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WORKER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.XML;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.XMLNS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.YEAR;

public class BallerinaParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(LINE_COMMENT);

    public static final TokenSet STRINGS = TokenSet.create(QUOTED_STRING_LITERAL);

    public static final TokenSet NUMBERS = TokenSet.create(DECIMAL_INTEGER_LITERAL, HEX_INTEGER_LITERAL,
            OCTAL_INTEGER_LITERAL, BINARY_INTEGER_LITERAL, FLOATING_POINT_LITERAL);

    public static final TokenSet KEYWORDS = TokenSet.create(ABORT, ALL, ANNOTATION, ANY, AS, ASYNC, AWAIT, BIND,
            BLOB, BOOLEAN, BREAK, CATCH, CONST, DOCUMENTATION, DEPRECATED, ELSE, ENDPOINT, ENUM, FAIL, FINALLY,
            FLOAT, FOREACH, FORK, FUNCTION, FUTURE, IF, IMPORT, IN, INT, JOIN, JSON, LENGTHOF, LOCK, MAP, MATCH,
            NATIVE, NEW, NEXT, OBJECT, ONABORT, ONCOMMIT, ONRETRY, PACKAGE, PARAMETER, PRIVATE, PUBLIC, RESOURCE,
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
