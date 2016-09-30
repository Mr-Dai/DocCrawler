package com.mrdai.markdown;

public class CodeBlock extends NoChildNode {
    private final String code;

    public CodeBlock(String code) {
        this.code = code;
    }

    public String toMarkdown() {
        StringBuilder builder = new StringBuilder();
        String[] lines = code.split("\n");
        for (String line : lines)
            builder.append("    ").append(line).append('\n');
        return builder.toString();
    }
}
