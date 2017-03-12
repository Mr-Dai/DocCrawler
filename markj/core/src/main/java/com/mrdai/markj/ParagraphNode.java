package com.mrdai.markj;

public class ParagraphNode extends ChildNode {
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (MarkdownNode child : getChildren())
            builder.append(child.toString());
        return builder.toString().trim() + "\n\n";
    }
}
