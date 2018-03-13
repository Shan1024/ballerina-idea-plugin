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

package org.ballerinalang.plugins.idea.stubs.index;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.ballerinalang.plugins.idea.BallerinaFileElementType;
import org.ballerinalang.plugins.idea.psi.BallerinaFile;
import org.jetbrains.annotations.NotNull;

public class BallerinaPackageIndex extends StringStubIndexExtension<BallerinaFile> {

    public static final StubIndexKey<String, BallerinaFile> KEY = StubIndexKey.createIndexKey("ballerina.package");

    @Override
    public int getVersion() {
        return BallerinaFileElementType.VERSION;
    }

    @NotNull
    @Override
    public StubIndexKey<String, BallerinaFile> getKey() {
        return KEY;
    }
}
