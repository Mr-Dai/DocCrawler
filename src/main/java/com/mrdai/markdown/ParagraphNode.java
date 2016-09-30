package com.mrdai.markdown;

public class ParagraphNode extends ChildNode {

    public String toMarkdown() {
        StringBuilder childBuiler = new StringBuilder();
        for (MarkdownNode child : getChildren())
            childBuiler.append(child.toMarkdown());
        return String.format("%s\n\n", childBuiler.toString().trim());
    }

}
