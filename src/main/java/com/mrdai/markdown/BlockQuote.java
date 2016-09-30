package com.mrdai.markdown;

public class BlockQuote extends ChildNode {

    public String toMarkdown() {
        StringBuilder builder = new StringBuilder();
        for (MarkdownNode child : getChildren()) {
            String childMarkdown = child.toMarkdown();
            String[] splitLines = childMarkdown.split("\n");
            for (String line : splitLines)
                builder.append("> ").append(line).append('\n');
        }
        builder.append('\n');
        return builder.toString();
    }

}
