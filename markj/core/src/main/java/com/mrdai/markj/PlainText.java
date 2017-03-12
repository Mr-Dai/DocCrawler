package com.mrdai.markj;

public class PlainText extends MarkdownNode {
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
