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
//                .aroundInside(DIV, IMPORT_DECLARATION).spaceIf(false)
//                .around(OPERATORS).spaceIf(true)
//                .between(TYPE_NAME, GT).spaceIf(false)
//                .between(LT, TYPE_NAME).spaceIf(false)
//                .between(IDENTIFIER, LT).spaceIf(false)
//                .between(GT, SIMPLE_EXPRESSION).spaceIf(false)
//                .between(RPAREN, SIMPLE_EXPRESSION).spaceIf(false)
//                .aroundInside(LT, EXPRESSION).spaceIf(true)
//                .aroundInside(GT, EXPRESSION).spaceIf(true)
//                .between(ADD, SIMPLE_EXPRESSION).spaceIf(false)
//                .between(SUB, SIMPLE_EXPRESSION).spaceIf(false)
//                .between(ADD, INTEGER_LITERAL).spaceIf(false)
//                .between(SUB, INTEGER_LITERAL).spaceIf(false)
//                .between(ADD, FLOATING_POINT).spaceIf(false)
//                .between(SUB, FLOATING_POINT).spaceIf(false)
//                .between(BANG, SIMPLE_EXPRESSION).spaceIf(false)
//                .around(ADD).spaceIf(true)
//                .around(SUB).spaceIf(true)
//                .before(ALL).spaceIf(false)
//                .after(ALL).spaceIf(true)
//                .before(ANY).spaceIf(false)
//                .after(ANY).spaceIf(true)
//                .around(AS).spaceIf(true)
//                .around(BIND).spaceIf(true)
//                .around(BY).spaceIf(true)
//                .around(BREAK).spaceIf(false)
//                .around(CATCH).spaceIf(true)
//                .around(CURRENT).spaceIf(true)
//                .around(EVENTS).spaceIf(true)
//                .around(EVERY).spaceIf(true)
//                .around(EXPIRED).spaceIf(true)
//                .around(COMPOUND_OPERATOR).spaceIf(true)
//                .around(ONABORT).spaceIf(true)
//                .around(ONCOMMIT).spaceIf(true)
//                .around(ONRETRY).spaceIf(true)
//                .around(DOUBLE_COLON).spaceIf(false)
//                .after(FAIL).spaceIf(true)
//                .around(FINALLY).spaceIf(true)
//                .around(GROUP).spaceIf(true)
//                .after(CONST).spaceIf(true)
//                .around(DAY).spaceIf(true)
//                .around(DELETE).spaceIf(true)
//                .after(ENDPOINT).spaceIf(true)
//                .around(ELSE).spaceIf(true)
//                .between(FORK, LBRACE).spaceIf(true)
//                .around(FIRST).spaceIf(true)
//                .around(FOLLOWED).spaceIf(true)
//                .around(FOR).spaceIf(true)
//                .around(FROM).spaceIf(true)
//                .around(FULL).spaceIf(true)
//                .between(EXPRESSION, LBRACE).spaceIf(true)
//                .between(FORK, SEMI).spaceIf(false)
//                .after(FUNCTION).spaceIf(true)
//                .after(IF).spaceIf(true)
//                .around(INSERT).spaceIf(true)
//                .around(INTO).spaceIf(true)
//                .around(HAVING).spaceIf(true)
//                .around(HOUR).spaceIf(true)
//                .after(IMPORT).spaceIf(true)
//                .after(FOREACH).spaceIf(true)
//                .around(IN).spaceIf(true)
//                .around(JOIN).spaceIf(true)
//                .around(LAST).spaceIf(true)
//                .around(LEFT).spaceIf(true)
//                .after(MATCH).spaceIf(true)
//                .around(MINUTE).spaceIf(true)
//                .around(MONTH).spaceIf(true)
//                .after(NATIVE).spaceIf(true)
//                .after(NEW).spaceIf(true)
//                .around(OBJECT).spaceIf(true)
//                .around(ON).spaceIf(true)
//                .around(ORDER).spaceIf(true)
//                .around(OUTER).spaceIf(true)
//                .after(PACKAGE).spaceIf(true)
//                .around(QUERY).spaceIf(true)
//                .around(REDUCE).spaceIf(true)
//                .after(RETRIES).spaceIf(false)
//                .around(RIGHT).spaceIf(true)
//                .after(TRANSACTION_PROPERTY_INIT_STATEMENT_LIST).spaceIf(true)
//                .after(RESOURCE).spaceIf(true)
//                .around(SECOND).spaceIf(true)
//                .around(SELECT).spaceIf(true)
//                .around(SET).spaceIf(true)
//                .between(SERVICE, LT).spaceIf(false)
//                .between(TYPE_STREAM, LT).spaceIf(false)
//                .between(SERVICE, IDENTIFIER).spaceIf(true)
//                .around(SNAPSHOT).spaceIf(true)
//                .after(STRUCT).spaceIf(true)
//                .after(THROW).spaceIf(true)
//                .around(TIMEOUT).spaceIf(true)
//                .after(TRY).spaceIf(true)
//                .after(TYPE).spaceIf(true)
//                .around(TYPE_STREAM).spaceIf(true)
//                .around(UNIDIRECTIONAL).spaceIf(true)
//                .after(UNTAINT).spaceIf(true)
//                .around(UPDATE).spaceIf(true)
//                .after(VAR).spaceIf(true)
//                .after(WHENEVER).spaceIf(true)
//                .around(WHERE).spaceIf(true)
//                .around(WHERE_CLAUSE).spaceIf(true)
//                .after(WHILE).spaceIf(true)
//                .around(WITHIN).spaceIf(true)
//                .around(WINDOW).spaceIf(true)
//                .after(WORKER).spaceIf(true)
//                .around(WITH).spaceIf(true)
//                .after(XMLNS).spaceIf(true)
//                .around(YEAR).spaceIf(true)
//                .after(TYPEOF).spaceIf(true)
//                .after(LENGTHOF).spaceIf(true)
//                .after(LOCK).spaceIf(true)
//                .before(SEMI).spaceIf(false)
//                .around(DOT).spaceIf(false)
//                .between(TYPE_NAME, QUESTION_MARK).spaceIf(false)
//                .around(QUESTION_MARK).spaceIf(true)
//                .around(PUBLIC).spaceIf(true)
//                .between(LPAREN, RPAREN).spaceIf(false)
//                .between(RPAREN, LBRACE).spaceIf(true)
//                .aroundInside(COLON, EXPRESSION).spaceIf(true)
//                .around(COLON).spaceIf(false)
//                .between(COMMA, PARAMETER).spaceIf(true)
//                .around(PARAMETER).spaceIf(false)
//                .between(COMMA, PARAMETER_LIST).spaceIf(true)
//                .around(PARAMETER_LIST).spaceIf(false)
//                .around(TYPE_LIST).spaceIf(false)
//                .before(COMMA).spaceIf(false)
//                .after(COMMA).spaceIf(true)
//                .between(TYPE_NAME, IDENTIFIER).spaceIf(true)
//                .between(IDENTIFIER, TYPE_NAME).spaceIf(true)
//                .around(LBRACK).spaceIf(false)
//                .between(LBRACE, RBRACE).spaceIf(false)
//                .before(RPAREN).spaceIf(false)
//                .after(LPAREN).spaceIf(false)
//                .between(RPAREN, LPAREN).spaceIf(true)
//                .after(AT).spaceIf(false)
//                .between(BIND, EXPRESSION).spaceIf(true)
//                .around(EXPRESSION).spaceIf(false)
//                .around(RETURN_PARAMETER).spaceIf(true)
//                .around(SENDARROW).spaceIf(true)
//                .around(RECEIVEARROW).spaceIf(true)
//                .before(TILDE).spaceIf(false)
//                .between(RETURN, EXPRESSION_LIST).spaceIf(true)
//                .around(RETURNS).spaceIf(true)
//                .after(ANNOTATION).spaceIf(true)
//                .between(ANNOTATION_ATTACHMENT, TYPE_NAME).spaceIf(true)
//                .between(VALUE_TYPE_NAME, IDENTIFIER).spaceIf(true)
//                .between(ANNOTATION_ATTACHMENT, TYPE_NAME).spaceIf(true)
//                .around(TYPE_NAME).spaceIf(false)
//                .after(TRANSACTION).spaceIf(true)
//                .between(MAP, LT).spaces(0)
//                .between(JSON, LT).spaceIf(false)
//                .between(XML, LT).spaceIf(false)
//                .between(LT, LBRACE).spaceIf(false)
//                .before(LBRACE).spaceIf(true)
//                .between(RBRACE, GT).spaceIf(false)
//                .between(RBRACE, XML_LOCAL_NAME).spaceIf(true)
//                .between(XML_LOCAL_NAME, GT).spaceIf(false)
//                .between(NAME_REFERENCE, LBRACE).spaceIf(true)
//                .between(VARIABLE_REFERENCE, INDEX).spaceIf(false)
//                .between(VARIABLE_REFERENCE, FIELD).spaceIf(false)
//                .between(VARIABLE_REFERENCE, XML_ATTRIB).spaceIf(false)
//                .between(VARIABLE_REFERENCE, LPAREN).spaceIf(false)
//                .after(FUNCTION_REFERENCE).spaceIf(false)
//                .around(NAME_REFERENCE).spaceIf(false)
//                .between(VALUE_TYPE_NAME, IDENTIFIER).spaceIf(true)
//                .between(IDENTIFIER, LBRACE).spaceIf(true)
//                .between(ATTACHMENT_POINT, LBRACE).spaceIf(true)
//                .around(RECORD_KEY_VALUE).spaceIf(false)
//                .between(XML, LT).spaceIf(false)
//                .around(XML_NAMESPACE_NAME).spaceIf(false)
//                .around(EXPRESSION_LIST).spaceIf(false)
//                .aroundInside(INTEGER_LITERAL, JOIN_CONDITIONS).spaceIf(true)
//                .between(LT, IDENTIFIER).spaceIf(true)
//                .withinPairInside(IDENTIFIER, LBRACE, FUNCTION_DEFINITION).spaceIf(true)
//                .withinPairInside(IDENTIFIER, LBRACE, SERVICE_DEFINITION).spaceIf(true)
//                .withinPairInside(IDENTIFIER, LBRACE, RESOURCE_DEFINITION).spaceIf(true)
//                .before(INVOCATION).spaceIf(false)
//                .afterInside(IDENTIFIER, INVOCATION).spaceIf(false)
//                .around(ANY_IDENTIFIER_NAME).spaceIf(false)
//                .after(BIND).spaceIf(true)
//                .after(ENDPOINT).spaceIf(false)
//                .between(GT, IDENTIFIER).spaceIf(true)
//                .after(TRANSFORMER).spaceIf(true)
//                .around(TRANSFORMER_INVOCATION).spaceIf(false)
                ;
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}
