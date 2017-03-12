package com.mrdai.markj;

public class EmptyNode extends MarkdownNode {
    private static final EmptyNode INSTANCE = new EmptyNode();

    public static EmptyNode get() {
        return INSTANCE;
    }

    private EmptyNode() {}

    @Override
    public String toString() {
        return "";
    }
}
