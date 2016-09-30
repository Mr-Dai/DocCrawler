package com.mrdai.markdown;

public class StrongText extends NoChildNode {
    private final String text;

    public StrongText(String text) {
        this.text = text;
    }

    public String toMarkdown() {
        return String.format("__%s__", text);
    }

}
