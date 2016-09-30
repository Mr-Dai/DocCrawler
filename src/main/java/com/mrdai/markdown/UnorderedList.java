package com.mrdai.markdown;

public class UnorderedList extends ChildNode {

    private final char listMark;

    public UnorderedList(char listMark) {
        this.listMark = listMark;
    }

    public String toMarkdown() {
        StringBuilder builder = new StringBuilder();
        for (MarkdownNode child : getChildren()) {
            builder.append(listMark).append("   ");
            String childMarkdown = child.toMarkdown();
            String[] splitLines = childMarkdown.split("\n");
            for (int i = 0; i < splitLines.length; i++) {
                if (i != 0)
                    builder.append("    ");
                builder.append(splitLines[i]).append('\n');
            }
        }
        builder.append('\n');
        return builder.toString();
    }

}
