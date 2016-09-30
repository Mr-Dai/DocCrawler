package com.mrdai.markdown;

public class LineBreak extends NoChildNode {
    @Override
    public String toMarkdown() {
        return "\n";
    }
}
