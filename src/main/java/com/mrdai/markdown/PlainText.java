package com.mrdai.markdown;

public class PlainText extends NoChildNode {

    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String toMarkdown() {
        return text;
    }
}
