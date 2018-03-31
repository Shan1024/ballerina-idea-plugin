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

package org.ballerinalang.plugins.idea.formatter;

import com.intellij.formatting.FormattingModel;
import com.intellij.formatting.FormattingModelBuilder;
import com.intellij.formatting.FormattingModelProvider;
import com.intellij.formatting.Indent;
import com.intellij.formatting.SpacingBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.ballerinalang.plugins.idea.BallerinaLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ABORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ADD;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ALL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.AND;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ANNOTATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ANY_IDENTIFIER_NAME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ARRAY_TYPE_NAME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.AS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ASSIGN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ASYNC;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.AWAIT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BIND;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.BREAK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CALLABLE_UNIT_BODY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CALLABLE_UNIT_SIGNATURE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CATCH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.COLON;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.COMMA;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.COMPLETE_PACKAGE_NAME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.COMPOUND_OPERATOR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.CONST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DECIMAL_INTEGER_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DEPRECATED;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DIV;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DOCUMENTATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.DOT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ELSE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ENDPOINT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ENUM;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.EQUAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.EQUAL_GT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.EXPRESSION_LIST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FAIL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FINALLY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FLOATING_POINT_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FOREACH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FORK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FUNCTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.FUNCTION_INVOCATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.GT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.GT_EQUAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IDENTIFIER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IMPORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IMPORT_DECLARATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.IN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INTEGER_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INVOCATION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INVOCATION_ARG;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.INVOCATION_ARG_LIST;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.JOIN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LARROW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LEFT_BRACE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LEFT_BRACKET;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LEFT_PARENTHESIS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LENGTHOF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LOCK;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.LT_EQUAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MATCH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MOD;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.MUL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NAME_REFERENCE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NATIVE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NEW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NEXT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.NOT_EQUAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.OBJECT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ONABORT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ONCOMMIT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.ONRETRY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.OR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PACKAGE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PACKAGE_REFERENCE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PARAMETER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.POW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PRIVATE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.PUBLIC;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RARROW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RECORD_KEY_VALUE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RECORD_LITERAL;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RESOURCE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETRIES;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURN;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURNS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURN_PARAMETER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RETURN_TYPE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RIGHT_BRACE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RIGHT_BRACKET;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.RIGHT_PARENTHESIS;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SAFE_ASSIGNMENT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SEMICOLON;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SERVICE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SIMPLE_TYPE_NAME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SIMPLE_VARIABLE_REFERENCE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SOME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.STRUCT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.SUB;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.THROW;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TIMEOUT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRANSACTION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRANSFORMER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TRY;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TUPLE_TYPE_NAME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPEOF;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.TYPE_CONVERSION_EXPRESSION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.UNION_TYPE_NAME;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.UNTAINT;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.VAR;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.VERSION;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WHILE;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WITH;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.WORKER;
import static org.ballerinalang.plugins.idea.psi.BallerinaTypes.XMLNS;

/**
 * Builds the Ballerina file formatting model.
 */
public class BallerinaFormattingModelBuilder implements FormattingModelBuilder {

    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        BallerinaBlock rootBlock = new BallerinaBlock(
                element.getNode(), null, Indent.getNoneIndent(), null, settings, createSpaceBuilder(settings)
        );
        return FormattingModelProvider.createFormattingModelForPsiFile(
                element.getContainingFile(), rootBlock, settings
        );
    }

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, BallerinaLanguage.INSTANCE)
                // Keywords
                .around(PACKAGE).spaceIf(true)
                .around(IMPORT).spaceIf(true)
                .around(AS).spaceIf(true)
                .around(PUBLIC).spaceIf(true)
                .around(PRIVATE).spaceIf(true)
                .around(NATIVE).spaceIf(true)
                .around(SERVICE).spaceIf(true)
                .around(RESOURCE).spaceIf(true)
                .around(FUNCTION).spaceIf(true)
                .around(STRUCT).spaceIf(true)
                .around(OBJECT).spaceIf(true)
                .around(ANNOTATION).spaceIf(true)
                .around(ENUM).spaceIf(true)
                // .around(PARAMETER).spaceIf(true) // Todo
                .around(CONST).spaceIf(true)
                .around(TRANSFORMER).spaceIf(true)
                .around(WORKER).spaceIf(true)
                .around(ENDPOINT).spaceIf(true)
                .around(BIND).spaceIf(true)
                .around(XMLNS).spaceIf(true)
                .around(RETURNS).spaceIf(true)
                .around(VERSION).spaceIf(true)
                .around(DOCUMENTATION).spaceIf(true)
                .around(DEPRECATED).spaceIf(true)

                .around(VAR).spaceIf(true)
                .around(NEW).spaceIf(true)
                .around(IF).spaceIf(true)
                .around(MATCH).spaceIf(true)
                .around(ELSE).spaceIf(true)
                .around(FOREACH).spaceIf(true)
                .around(WHILE).spaceIf(true)
                .around(NEXT).spaceIf(true)
                .around(BREAK).spaceIf(true)
                .around(FORK).spaceIf(true)
                .around(JOIN).spaceIf(true)
                .around(SOME).spaceIf(true) // Todo
                .around(ALL).spaceIf(true) // Todo
                .around(TIMEOUT).spaceIf(true)
                .around(TRY).spaceIf(true)
                .around(CATCH).spaceIf(true)
                .around(FINALLY).spaceIf(true)
                .around(THROW).spaceIf(true)
                .around(RETURN).spaceIf(true)
                .around(TRANSACTION).spaceIf(true)
                .around(ABORT).spaceIf(true)
                .around(FAIL).spaceIf(true)
                .around(ONRETRY).spaceIf(true)
                .around(RETRIES).spaceIf(true)
                .around(ONABORT).spaceIf(true)
                .around(ONCOMMIT).spaceIf(true)
                .around(LENGTHOF).spaceIf(true)
                .around(TYPEOF).spaceIf(true)
                .around(WITH).spaceIf(true)
                .around(IN).spaceIf(true)
                .around(LOCK).spaceIf(true)
                .around(UNTAINT).spaceIf(true) // Todo
                .around(ASYNC).spaceIf(true)
                .around(AWAIT).spaceIf(true)

                // Common tokens
                .before(COMMA).spaceIf(false)
                .after(COMMA).spaceIf(true)
                .around(SEMICOLON).spaceIf(false)

                // Function signature
                .between(LEFT_PARENTHESIS, RIGHT_PARENTHESIS).spaceIf(false)
                .around(RETURN_PARAMETER).spaceIf(true)
                .between(SIMPLE_TYPE_NAME, IDENTIFIER).spaceIf(true)
                .between(SIMPLE_TYPE_NAME, EQUAL_GT).spaceIf(true)
                .around(SIMPLE_TYPE_NAME).spaceIf(false)
                .around(NAME_REFERENCE).spaceIf(false)
                .before(RETURN_TYPE).spaceIf(false)
                .after(RETURN_TYPE).spaceIf(true)
                .around(UNION_TYPE_NAME).spaceIf(false)
                .around(TUPLE_TYPE_NAME).spaceIf(false)
                .around(PARAMETER).spaceIf(false)

                .aroundInside(DIV, IMPORT_DECLARATION).spaceIf(false)
                .aroundInside(DOT, COMPLETE_PACKAGE_NAME).spaceIf(false)
                .aroundInside(COLON, PACKAGE_REFERENCE).spaceIf(false)
                .afterInside(IDENTIFIER, CALLABLE_UNIT_SIGNATURE).spaceIf(false)
                .around(CALLABLE_UNIT_SIGNATURE).spaceIf(true)
                .after(PACKAGE_REFERENCE).spaceIf(false)
                .aroundInside(NAME_REFERENCE, FUNCTION_INVOCATION).spaceIf(false)
                .around(INVOCATION_ARG_LIST).spaceIf(false)
                .around(CALLABLE_UNIT_BODY).spaceIf(false)
                .around(SIMPLE_TYPE_NAME).spaceIf(true)

                // Record Literals
                .aroundInside(COLON, RECORD_KEY_VALUE).spaceIf(false)
                .beforeInside(COMMA, RECORD_LITERAL).spaceIf(false)
                .afterInside(COMMA, RECORD_LITERAL).spaceIf(true)
                .between(RECORD_KEY_VALUE, RIGHT_BRACE).spaceIf(false)
                .between(LEFT_BRACE, RIGHT_BRACE).spaceIf(false)

                // Statements
                .between(LEFT_BRACE, RIGHT_BRACE).spaceIf(false)
                .between(LEFT_BRACKET, RIGHT_BRACKET).spaceIf(false)
                .between(SIMPLE_VARIABLE_REFERENCE, ASSIGN).spaceIf(true)
                .after(SIMPLE_VARIABLE_REFERENCE).spaceIf(false)
                .aroundInside(DOT, INVOCATION).spaceIf(false)
                .between(INVOCATION_ARG, COMMA).spaceIf(false)
                .between(ANY_IDENTIFIER_NAME, LEFT_PARENTHESIS).spaceIf(false)
                .around(EXPRESSION_LIST).spaceIf(false)
                .between(ARRAY_TYPE_NAME, IDENTIFIER).spaceIf(true)
                .aroundInside(GT, TYPE_CONVERSION_EXPRESSION).spaceIf(false)
                .after(LEFT_PARENTHESIS).spaceIf(false)
                .before(RIGHT_PARENTHESIS).spaceIf(false)

                .between(ADD, INTEGER_LITERAL).spaceIf(false)
                .between(SUB, INTEGER_LITERAL).spaceIf(false)
                .between(ADD, FLOATING_POINT_LITERAL).spaceIf(false)
                .between(SUB, FLOATING_POINT_LITERAL).spaceIf(false)

                // Operators
                .around(ASSIGN).spaceIf(true)
                .around(ADD).spaceIf(true)
                .around(SUB).spaceIf(true)
                .around(DIV).spaceIf(true)
                .around(MUL).spaceIf(true)
                .around(POW).spaceIf(true)
                .around(MOD).spaceIf(true)

                .around(EQUAL).spaceIf(true)
                .around(NOT_EQUAL).spaceIf(true)
                .around(GT).spaceIf(true)
                .around(LT).spaceIf(true)
                .around(GT_EQUAL).spaceIf(true)
                .around(LT_EQUAL).spaceIf(true)
                .around(AND).spaceIf(true)
                .around(OR).spaceIf(true)

                .around(RARROW).spaceIf(true)
                .around(LARROW).spaceIf(true)
                .around(EQUAL_GT).spaceIf(true)

                .around(COMPOUND_OPERATOR).spaceIf(true)

                .around(SAFE_ASSIGNMENT).spaceIf(true)
                ;
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}
