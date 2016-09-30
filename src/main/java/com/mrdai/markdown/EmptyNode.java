package com.mrdai.markdown;

public class EmptyNode extends NoChildNode {
    private static final EmptyNode instance = new EmptyNode();

    public static EmptyNode get() {
        return instance;
    }

    @Override
    public String toMarkdown() {
        return "";
    }
}
