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

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import com.intellij.ui.LayeredIcon;
import com.intellij.util.PlatformIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class BallerinaIcons {

    public static final Icon FILE = IconLoader.getIcon("/icons/ballerina.png");
    public static final Icon ICON = FILE;
    public static final Icon APPLICATION_RUN = createIconWithShift(ICON, AllIcons.Nodes.RunnableMark);
    public static final Icon RUN = AllIcons.RunConfigurations.TestState.Run;
    public static final Icon PACKAGE = PlatformIcons.DIRECTORY_CLOSED_ICON;

    private BallerinaIcons() {

    }

    @NotNull
    private static LayeredIcon createIconWithShift(@NotNull Icon base, Icon mark) {
        LayeredIcon icon = new LayeredIcon(2) {
            @Override
            public int getIconHeight() {
                return base.getIconHeight();
            }
        };
        icon.setIcon(base, 0);
        icon.setIcon(mark, 1, 0, base.getIconWidth() / 2);
        return icon;
    }
}
