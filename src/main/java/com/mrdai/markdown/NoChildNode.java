package com.mrdai.markdown;

import java.util.Collections;
import java.util.List;

public abstract class NoChildNode implements MarkdownNode {

    @Override
    public void addChild(MarkdownNode child) {
        throw new UnsupportedOperationException("A "
            + getClass().getName() + " cannot have any child.");
    }

    @Override
    public List<MarkdownNode> getChildren() {
        return Collections.emptyList();
    }

}
