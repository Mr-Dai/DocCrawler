package com.mrdai.markdown.github;

import com.mrdai.markdown.NoChildNode;

public class LangCodeBlock extends NoChildNode {
    private final String lang;
    private final String code;

    public LangCodeBlock(String lang, String code) {
        this.lang = lang;
        this.code = code;
    }

    public String toMarkdown() {
        return String.format("```%s\n%s\n```\n\n", lang, code);
    }
}
