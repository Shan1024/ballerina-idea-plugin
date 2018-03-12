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

package org.ballerinalang.plugins.idea.psi.reference;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import org.ballerinalang.plugins.idea.psi.impl.BallerinaElementFactory;
import org.ballerinalang.plugins.idea.psi.scope.BallerinaScopeProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BallerinaCachedReference<T extends PsiElement> extends PsiReferenceBase<T> {

    protected BallerinaCachedReference(@NotNull T element) {
        super(element, TextRange.from(0, element.getTextLength()));
    }

    private static final ResolveCache.AbstractResolver<BallerinaCachedReference, PsiElement> MY_RESOLVER =
            (r, b) -> r.resolveInner();

    @Nullable
    protected abstract PsiElement resolveInner();

    @Nullable
    @Override
    public final PsiElement resolve() {
        return myElement.isValid()
                ? ResolveCache.getInstance(myElement.getProject()).resolveWithCaching(this, MY_RESOLVER, false, false)
                : null;
    }

    public abstract boolean processResolveVariants(@NotNull BallerinaScopeProcessor processor);

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        myElement.replace(BallerinaElementFactory.createIdentifierFromText(myElement.getProject(), newElementName));
        return myElement;
    }

    @Override
    public boolean isReferenceTo(PsiElement element) {
        //    return GoUtil.couldBeReferenceTo(element, myElement) && super.isReferenceTo(element);
        return false;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof BallerinaCachedReference &&
                getElement() == ((BallerinaCachedReference) o).getElement();
    }

    @Override
    public int hashCode() {
        return getElement().hashCode();
    }
}
