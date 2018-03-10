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

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import org.ballerinalang.plugins.idea.psi.BallerinaConnectorDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaFunctionDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaGlobalVariableDefinition;
import org.ballerinalang.plugins.idea.psi.BallerinaStructDefinition;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaAnnotationIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaConnectorIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaConstantIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaEndpointIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaEnumIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaFunctionIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaGlobalEndpointIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaGlobalVariableIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaStructIndex;
import org.ballerinalang.plugins.idea.stubs.index.BallerinaTransformerIndex;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class BallerinaReferenceCompletionProvider extends CompletionContributor {

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        Project project = parameters.getOriginalFile().getProject();

        Collection<BallerinaFunctionDefinition> ballerinaFunction = StubIndex.getElements(BallerinaFunctionIndex
                .KEY, "test", project, GlobalSearchScope.allScope(project), BallerinaFunctionDefinition.class);

        Collection<BallerinaStructDefinition> ballerinaStruct = StubIndex.getElements(BallerinaStructIndex.KEY, "test",
                project, GlobalSearchScope.allScope(project), BallerinaStructDefinition.class);

        Collection<BallerinaGlobalVariableDefinition> ballerinaGlobalVariable =
                StubIndex.getElements(BallerinaGlobalVariableIndex.KEY, "test", project, GlobalSearchScope.allScope
                        (project), BallerinaGlobalVariableDefinition.class);

        Collection<BallerinaConnectorDefinition> ballerinaConnector = StubIndex.getElements(BallerinaConnectorIndex.KEY,
                "test", project, GlobalSearchScope.allScope(project), BallerinaConnectorDefinition.class);

        Collection<String> allFunctions = StubIndex.getInstance().getAllKeys(BallerinaFunctionIndex.KEY, project);
        Collection<String> allStructs = StubIndex.getInstance().getAllKeys(BallerinaStructIndex.KEY, project);
        Collection<String> allGlobalVariables = StubIndex.getInstance().getAllKeys(BallerinaGlobalVariableIndex.KEY,
                project);
        Collection<String> allConnectors = StubIndex.getInstance().getAllKeys(BallerinaConnectorIndex.KEY, project);
        Collection<String> allEnums = StubIndex.getInstance().getAllKeys(BallerinaEnumIndex.KEY, project);
        Collection<String> allAnnotations = StubIndex.getInstance().getAllKeys(BallerinaAnnotationIndex.KEY, project);
        Collection<String> allTransformers = StubIndex.getInstance().getAllKeys(BallerinaTransformerIndex.KEY, project);
        Collection<String> allConstants = StubIndex.getInstance().getAllKeys(BallerinaConstantIndex.KEY, project);
        Collection<String> allGlobalEndpoints = StubIndex.getInstance().getAllKeys(BallerinaGlobalEndpointIndex.KEY,
                project);
        Collection<String> allEndpoints = StubIndex.getInstance().getAllKeys(BallerinaEndpointIndex.KEY, project);

        long start = System.currentTimeMillis();

        Collection<BallerinaStructDefinition> ballerinaStructDefinitions = StubIndex.getElements(BallerinaStructIndex
                .KEY, "user2", project, GlobalSearchScope.allScope(project), BallerinaStructDefinition.class);
        /*.forEach(def -> System.out.println(def.getIdentifier().getText()));*/

        //        ballerinaStructDefinitions.forEach(def -> def.isPublic());

        long end = System.currentTimeMillis();

        System.out.println("Found " + ballerinaStructDefinitions.size() + " in " + (end - start) + " ms");
        System.out.println("....");
    }
}
