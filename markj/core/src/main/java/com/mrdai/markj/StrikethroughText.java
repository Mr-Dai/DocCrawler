package com.mrdai.markj;

public class StrikethroughText extends MarkdownNode {
    private final String text;

    public StrikethroughText(String text) {
        this.text = text.trim();
    }

    @Override
    public String toString() {
        return "~~" + text + "~~";
    }
}
