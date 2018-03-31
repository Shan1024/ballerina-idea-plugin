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
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;

public class BallerinaParserUtil extends GeneratedParserUtilBase {

    public static boolean isPackageExpected(PsiBuilder builder, int level) {
        IElementType next1Element = builder.lookAhead(1);
        if (next1Element != null && next1Element.toString().equals(":")) {
            IElementType next2Element = builder.lookAhead(2);
            if (next2Element != null && next2Element == BallerinaTypes.IDENTIFIER) {
                IElementType next3Element = builder.lookAhead(3);
                // The next token can be one of the following tokens. Right brace is to check in record key literals.
                if (next3Element != null && (next3Element == BallerinaTypes.SEMICOLON
                        || next3Element == BallerinaTypes.COLON || next3Element == BallerinaTypes.RIGHT_PARENTHESIS
                        || next3Element == BallerinaTypes.RIGHT_BRACE)) {
                    // We need to look behind few steps to identify the last token. If this token is not "?" only we
                    // identify that the package is required.
                    int steps = -1;
                    IElementType rawLookup;
                    do {
                        rawLookup = builder.rawLookup(steps--);
                        if (isWhiteSpaceOrComment(rawLookup)) {
                            continue;
                        }
                        // Left brace is to check in record key literals.
                        if (rawLookup == BallerinaTypes.QUESTION_MARK || rawLookup == BallerinaTypes.LEFT_BRACE) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    while (rawLookup != null && isWhiteSpaceOrComment(rawLookup));
                }
            }
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
