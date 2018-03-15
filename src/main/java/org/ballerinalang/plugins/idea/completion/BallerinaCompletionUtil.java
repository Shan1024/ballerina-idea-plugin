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

package org.ballerinalang.plugins.idea.completion;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import org.ballerinalang.plugins.idea.BallerinaIcons;
import org.jetbrains.annotations.NotNull;

public class BallerinaCompletionUtil {

    public static class Lazy {

        private static final BallerinaSingleCharacterInsertHandler DIR_INSERT_HANDLER =
                new BallerinaSingleCharacterInsertHandler('.');

    }

    @NotNull
    public static LookupElementBuilder createPackageLookupElement(@NotNull PsiDirectory dir) {
        return LookupElementBuilder.createWithSmartPointer(dir.getName(), dir).withIcon(BallerinaIcons.PACKAGE)
                .withInsertHandler(dir.getFiles().length == 0 ? Lazy.DIR_INSERT_HANDLER : null);
    }

    @NotNull
    public static LookupElement createLookupElement(@NotNull PsiElement element) {
        return LookupElementBuilder.createWithSmartPointer("aaaa",element)
                .withTypeText("Example");
    }
}
