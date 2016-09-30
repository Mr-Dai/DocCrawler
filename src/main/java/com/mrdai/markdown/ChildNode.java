package com.mrdai.markdown;

import java.util.LinkedList;
import java.util.List;

public class ChildNode implements MarkdownNode {
    private final LinkedList<MarkdownNode> children = new LinkedList<>();

    public void addChild(MarkdownNode child) {
        children.add(child);
    }

    public List<MarkdownNode> getChildren() {
        return children;
    }

    public String toMarkdown() {
        StringBuilder builder = new StringBuilder();
        children.forEach((c) -> builder.append(c.toMarkdown()));
        return builder.toString();
    }
}
