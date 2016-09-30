package com.mrdai.markdown;

public class Header extends NoChildNode {

    private final int level;
    private final String text;

    public Header(int level, String text) {
        if (level < 1 || level > 6)
            throw new IllegalArgumentException("Header level must be within [1,6]");
        this.level = level;
        this.text = text;
    }

    @Override
    public String toMarkdown() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++)
            builder.append('#');
        builder.append(' ').append(text).append("\n\n");
        return builder.toString();
    }

}
