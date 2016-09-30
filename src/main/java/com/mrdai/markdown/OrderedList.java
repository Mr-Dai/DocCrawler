package com.mrdai.markdown;

public class OrderedList extends ChildNode {

    private final int start;

    public OrderedList() {
        this(1);
    }

    public OrderedList(int start) {
        this.start = start;
    }

    public String toMarkdown() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < getChildren().size(); i++) {
            MarkdownNode child = getChildren().get(i);
            String lineMark = String.valueOf(start + i);
            builder.append(lineMark).append(". ");
            if (start + i < 10)
                builder.append(' ');
            String childMarkdown = child.toMarkdown();
            String[] splitLines = childMarkdown.split("\n");
            for (int j = 0; j < splitLines.length; j++) {
                if (j != 0)
                    builder.append("    ");
                builder.append(splitLines[j]).append('\n');
            }
        }
        builder.append('\n');
        return builder.toString();
    }

}
