package com.mrdai.markdown;

public class EmphasisText extends NoChildNode {
    private final String text;

    public EmphasisText(String text) {
        this.text = text;
    }

    public String toMarkdown() {
        return String.format("_%s_", text);
    }

}
