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

package org.ballerinalang.plugins.idea.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;

public class BallerinaParserUtil extends GeneratedParserUtilBase {

    public static boolean isPackageExpected(PsiBuilder builder, int level) {
        IElementType next1Element = builder.lookAhead(1);
        if (next1Element == null || !next1Element.toString().equals(":")) {
            return true;
        }
        IElementType next2Element = builder.lookAhead(2);
        if (next2Element == null || next2Element != BallerinaTypes.IDENTIFIER) {
            return true;
        }
        IElementType next3Element = builder.lookAhead(3);
        // The next token can be one of the following tokens. Right brace is to check in record key literals.
        // Comma is used for record literals in function invocations - test(a,{b:c, d:e})
        // Left bracket is used to identify array elements - {name:"Ballerina", address:args[0]};
        //
        if (next3Element != null && (next3Element == BallerinaTypes.SEMICOLON
                || next3Element == BallerinaTypes.COLON || next3Element == BallerinaTypes.RIGHT_PARENTHESIS
                || next3Element == BallerinaTypes.RIGHT_BRACE || next3Element == BallerinaTypes.COMMA
                || next3Element == BallerinaTypes.LEFT_BRACKET || next3Element == BallerinaTypes.LEFT_PARENTHESIS
                || next3Element == BallerinaTypes.EQUAL || next3Element == BallerinaTypes.NOT_EQUAL
                || next3Element == BallerinaTypes.GT || next3Element == BallerinaTypes.LT
                || next3Element == BallerinaTypes.GT_EQUAL || next3Element == BallerinaTypes.LT_EQUAL
                || next3Element == BallerinaTypes.DOT
        )) {
            // We need to look behind few steps to identify the last token. If this token is not "?" only we
            // identify that the package is required.
            int steps = -1;
            IElementType rawLookup;
            do {
                rawLookup = builder.rawLookup(steps--);
                if (isWhiteSpaceOrComment(rawLookup)) {
                    continue;
                }
                // Left brace is to check in record key literals. Comma and other token is checked for situations like -
                // {name:"Child", parent:parent}
                if (rawLookup == BallerinaTypes.QUESTION_MARK || rawLookup == BallerinaTypes.LEFT_BRACE
                        || (rawLookup == BallerinaTypes.COMMA
                        && (next3Element == BallerinaTypes.RIGHT_BRACE || next3Element == BallerinaTypes.COMMA
                        || next3Element == BallerinaTypes.DOT)
                )) {
                    // Note - Another raw lookup is added for situations like below. Second record key value
                    // pair does not get identified correctly otherwise.
                    // {sqlType:sql:Type.INTEGER, value:xmlDataArray};
                    IElementType rawLookup2;
                    do {
                        rawLookup2 = builder.rawLookup(--steps);
                        if (isWhiteSpaceOrComment(rawLookup2)) {
                            continue;
                        }
                        // Identifier example - endpoint ServiceEndpoint backendEP {port:getBackendPort()};
                        // Quoted literal string example - {address:{"city":"Colombo", "country":"SriLanka"}, info:info}

                        // Decimal literal example - string a = x == 1 ? s : i;
                        if (rawLookup2 != BallerinaTypes.ASSIGN /*&& rawLookup2 != BallerinaTypes.COLON*/
                                && rawLookup2 != BallerinaTypes.DOT && rawLookup2 != BallerinaTypes.IDENTIFIER
                                && rawLookup2 != BallerinaTypes.RIGHT_BRACE
                                && rawLookup2 != BallerinaTypes.QUOTED_STRING_LITERAL
                                && rawLookup2 != BallerinaTypes.DECIMAL_INTEGER_LITERAL
                                && rawLookup2 != BallerinaTypes.BOOLEAN_LITERAL
                                // Example for below condition - {dataSourceClassName:"org.hsqldb.jdbc.JDBCDataSource",
                                // datasourceProperties:propertiesMap}
                                && !(rawLookup == BallerinaTypes.COMMA && rawLookup2 == BallerinaTypes.COLON)
                                // Example for below condition - worker w {a:b();}
                                && !(rawLookup == BallerinaTypes.LEFT_BRACE && rawLookup2 == BallerinaTypes.COMMA)
                                || (rawLookup == BallerinaTypes.LEFT_BRACE && rawLookup2 == BallerinaTypes.IDENTIFIER)
                                ) {
                            return true;
                        } else {
                            return false;
                        }
                    } while (rawLookup2 != null && isWhiteSpaceOrComment(rawLookup2));
                } else {
                    return true;
                }
            } while (rawLookup != null && isWhiteSpaceOrComment(rawLookup));
        }
        return true;
    }

    private static boolean isWhiteSpaceOrComment(IElementType rawLookup) {
        return rawLookup == TokenType.WHITE_SPACE || rawLookup == BallerinaTypes.COMMENT;
    }

    public static boolean isNotAResourceDefinition(PsiBuilder builder, int level) {
        if (builder.getTokenType() != BallerinaTypes.IDENTIFIER) {
            return false;
        }
        IElementType next1Element = builder.lookAhead(1);
        if (next1Element != null && next1Element.toString().equals("(")) {
            return true;
        }
        return false;
    }
}
