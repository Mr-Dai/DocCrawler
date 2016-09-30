package com.mrdai.markdown;

public class InlineCode extends ChildNode {

    private final String code;

    public InlineCode(String code) {
        this.code = code;
    }

    public String toMarkdown() {
        return String.format("`%s`", code.replaceAll("`", "\\`"));
    }
}
