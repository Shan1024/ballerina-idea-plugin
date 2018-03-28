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

import com.intellij.formatting.Alignment;
import com.intellij.formatting.Block;
import com.intellij.formatting.ChildAttributes;
import com.intellij.formatting.Indent;
import com.intellij.formatting.Spacing;
import com.intellij.formatting.SpacingBuilder;
import com.intellij.formatting.Wrap;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.TokenType;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.ContainerUtil;
import org.ballerinalang.plugins.idea.psi.BallerinaTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a code block.
 */
public class BallerinaBlock extends AbstractBlock {

    @NotNull
    private final ASTNode myNode;
    @Nullable
    private final Alignment myAlignment;
    @Nullable
    private final Indent myIndent;
    @Nullable
    private final Wrap myWrap;
    @NotNull
    private final CodeStyleSettings mySettings;
    @NotNull
    private final SpacingBuilder mySpacingBuilder;
    @Nullable
    private List<Block> mySubBlocks;


    protected BallerinaBlock(@NotNull ASTNode node, @Nullable Alignment alignment, @Nullable Indent indent, @Nullable
            Wrap wrap, @NotNull CodeStyleSettings settings, SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);

        this.myNode = node;
        this.myAlignment = alignment;
        this.myIndent = indent;
        this.myWrap = wrap;
        this.mySettings = settings;
        this.mySpacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {
        //        List<Block> blocks = new ArrayList<>();
        //        ASTNode child = node.getFirstChildNode();
        //        IElementType parentElementType = node.getElementType();
        //
        //        while (child != null) {
        //            IElementType childElementType = child.getElementType();
        //            if (childElementType != TokenType.WHITE_SPACE) {
        //
        //                Indent indent = Indent.getNoneIndent();
        //
        //                //                if (isInsideADefinitionElement(childElementType)) {
        //                //                    if (child.getFirstChildNode() != null && child.getLastChildNode() !=
        // null) {
        //                //                        indent = Indent.getSpaceIndent(4);
        //                //                    }
        //                //                } else if (childElementType == COMMENT_STATEMENT) {
        //                //                    if (isADefinitionElement(parentElementType) || isACodeBlock
        // (parentElementType)) {
        //                //                        indent = Indent.getSpaceIndent(4);
        //                //                    }
        //                //                } else if (childElementType == WORKER_DECLARATION) {
        //                //                    if (parentElementType == FORK_JOIN_STATEMENT) {
        //                //                        indent = Indent.getSpaceIndent(4);
        //                //                    }
        //                //                } else if (childElementType == WORKER_BODY) {
        //                //                    if (parentElementType == WORKER_DECLARATION) {
        //                //                        indent = Indent.getSpaceIndent(4);
        //                //                    }
        //                //                } else if (childElementType == RECORD_KEY_VALUE) {
        //                //                    indent = Indent.getSpaceIndent(4);
        //                //                } else if (childElementType == CODE_BLOCK_BODY || childElementType ==
        //                // NON_EMPTY_CODE_BLOCK_BODY
        //                //                        || childElementType == ENUM_FIELD_LIST) {
        //                //                    indent = Indent.getSpaceIndent(4);
        //                //                } else if (childElementType == EXPRESSION_LIST) {
        //                //                    if (parentElementType == VARIABLE_REFERENCE) {
        //                //                        indent = Indent.getSpaceIndent(4);
        //                //                    }
        //                //                } else if (childElementType == FIELD_DEFINITION) {
        //                //                    if (parentElementType == PRIVATE_STRUCT_BODY) {
        //                //                        indent = Indent.getSpaceIndent(4);
        //                //                    }
        //                //                } else if (childElementType == MATCH_PATTERN_CLAUSE) {
        //                //                    indent = Indent.getSpaceIndent(4);
        //                //                } else if (childElementType == OBJECT_BODY) {
        //                //                    indent = Indent.getSpaceIndent(4);
        //                //                } else if (childElementType == OBJECT_FIELD_DEFINITION) {
        //                //                    indent = Indent.getSpaceIndent(4);
        //                //                } else if (childElementType == STREAMING_QUERY_STATEMENT) {
        //                //                    indent = Indent.getSpaceIndent(4);
        //                //                }
        //
        //                // If the child node text is empty, the IDEA core will throw an exception.
        //                if (!child.getText().isEmpty()) {
        //                    Block block = new BallerinaBlock(
        //                            child,
        //                            Alignment.createAlignment(),
        //                            indent,
        //                            null,
        //                            mySettings,
        //                            spacingBuilder
        //                    );
        //                    blocks.add(block);
        //                }
        //            }
        //            child = child.getTreeNext();
        //        }
        //        return blocks;
        return new LinkedList<>();
    }

    //    private static boolean isADefinitionElement(@NotNull final IElementType parentElementType) {
    //        if (parentElementType == FUNCTION_DEFINITION || parentElementType == SERVICE_DEFINITION
    //                || parentElementType == RESOURCE_DEFINITION || parentElementType == STRUCT_DEFINITION
    //                || parentElementType == OBJECT_INITIALIZER || parentElementType == OBJECT_FUNCTION_DEFINITION) {
    //            return true;
    //        }
    //        return false;
    //    }
    //
    //    private static boolean isInsideADefinitionElement(@NotNull final IElementType childElementType) {
    //        if (childElementType == FUNCTION_BODY || childElementType == SERVICE_BODY || childElementType ==
    // STRUCT_BODY) {
    //            return true;
    //        }
    //        return false;
    //    }
    //
    //    private static boolean isACodeBlock(@NotNull final IElementType parentElementType) {
    //        if (parentElementType == IF_ELSE_STATEMENT || parentElementType == FOREACH_STATEMENT
    //                || parentElementType == WHILE_STATEMENT || parentElementType == WORKER_DECLARATION
    //                || parentElementType == FORK_JOIN_STATEMENT || parentElementType == TRANSACTION_STATEMENT
    //                || parentElementType == IF_CLAUSE || parentElementType == ELSE_IF_CLAUSE
    //                || parentElementType == ELSE_CLAUSE || parentElementType == TRY_CATCH_STATEMENT
    //                || parentElementType == CATCH_CLAUSE || parentElementType == CATCH_CLAUSES
    //                || parentElementType == FINALLY_CLAUSE || parentElementType == JOIN_CLAUSE
    //                || parentElementType == TIMEOUT_CLAUSE || parentElementType == ON_ABORT_CLAUSE
    //                || parentElementType == ON_COMMIT_CLAUSE || parentElementType == ON_RETRY_CLAUSE) {
    //            return true;
    //        }
    //        return false;
    //    }

    @NotNull
    @Override
    public ASTNode getNode() {
        return myNode;
    }

    @NotNull
    @Override
    public TextRange getTextRange() {
        return myNode.getTextRange();
    }

    @Nullable
    @Override
    public Wrap getWrap() {
        return myWrap;
    }

    @Override
    public Indent getIndent() {
        return myIndent;
    }

    @Override
    @Nullable
    public Alignment getAlignment() {
        return myAlignment;
    }

    @NotNull
    @Override
    public List<Block> getSubBlocks() {
        if (mySubBlocks == null) {
            mySubBlocks = buildSubBlocks();
        }
        return mySubBlocks;
    }

    @NotNull
    private List<Block> buildSubBlocks() {
        List<Block> blocks = ContainerUtil.newArrayList();
        for (ASTNode child = myNode.getFirstChildNode(); child != null; child = child.getTreeNext()) {
            IElementType childType = child.getElementType();
            if (child.getTextRange().getLength() == 0) {
                continue;
            }
            if (childType == TokenType.WHITE_SPACE) {
                continue;
            }
            Alignment alignment = null;
            Indent indent = calculateIndent(child);
            blocks.add(new BallerinaBlock(child, alignment, indent, null, mySettings, mySpacingBuilder));
        }
        return blocks;
    }

    @NotNull
    private Indent calculateIndent(@NotNull ASTNode child) {
        IElementType childElementType = child.getElementType();
        IElementType parentElementType = myNode.getElementType();
        if (childElementType == BallerinaTypes.BLOCK) {
            return Indent.getNormalIndent();
        }
        return Indent.getNoneIndent();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return mySpacingBuilder.getSpacing(this, child1, child2);
    }

    @NotNull
    @Override
    public ChildAttributes getChildAttributes(int newChildIndex) {
        Indent childIndent = Indent.getNoneIndent();
        if (myNode.getElementType() == BallerinaTypes.CALLABLE_UNIT_BODY) {
            childIndent = Indent.getNormalIndent();
        }
        return new ChildAttributes(childIndent, null);
    }

    @Override
    public boolean isIncomplete() {
        //        return myNode.getElementType() == BallerinaFileElementType.INSTANCE;
        return false;
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}