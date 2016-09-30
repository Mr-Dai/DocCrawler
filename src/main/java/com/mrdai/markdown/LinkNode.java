package com.mrdai.markdown;

import org.apache.commons.lang3.StringUtils;

public class LinkNode extends NoChildNode {

    private final String text;
    private final String href;

    public LinkNode(String text, String href) {
        this.text = text;
        this.href = href;
    }

    public String toMarkdown() {
        if (StringUtils.isBlank(text) && StringUtils.isBlank(href))
            return "";
        return String.format("[%s](%s)", text, href);
    }
}
