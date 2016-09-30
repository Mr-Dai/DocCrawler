package com.mrdai.markdown;

import java.util.List;

public interface MarkdownNode {
    void addChild(MarkdownNode child);
    List<MarkdownNode> getChildren();

    String toMarkdown();
}
