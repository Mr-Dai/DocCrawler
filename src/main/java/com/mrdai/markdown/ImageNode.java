package com.mrdai.markdown;

import org.apache.commons.lang3.StringUtils;

public class ImageNode extends NoChildNode {

    private final String altText;
    private final String link;
    private final String optTitle;

    public ImageNode(String altText, String link, String optTitle) {
        this.altText = altText;
        this.link = link;
        this.optTitle = optTitle;
    }

    public String toMarkdown() {
        if (StringUtils.isNotBlank(optTitle))
            return String.format("![%s](%s)\n\n", altText, link);
        else
            return String.format("![%s](%s \"%s\")\n\n", altText, link, optTitle);
    }
}
