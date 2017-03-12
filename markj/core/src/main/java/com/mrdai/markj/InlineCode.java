package com.mrdai.markj;

public class InlineCode extends MarkdownNode {
    private final String code;

    public InlineCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "`" + code + "`";
    }
}
