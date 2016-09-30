package com.mrdai.doccrawler;

import com.mrdai.markdown.ImageNode;
import com.mrdai.markdown.github.LangCodeBlock;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.MalformedURLException;
import java.net.URL;

import static com.mrdai.doccrawler.util.NodeUtils.hasChild;
import static com.mrdai.doccrawler.util.NodeUtils.hasTagName;

public class JenkovParser extends MarkdownParser {

    public JenkovParser() {
        prependElementAction(
            hasTagName("pre"),
            (e) -> new LangCodeBlock("java", e.text())
        );

        prependElementAction(
            hasTagName("center").and(hasChild(hasTagName("img"))),
            (e) -> {
                String title = "";
                Elements optionalTitle = e.select("b");
                if (!optionalTitle.isEmpty())
                    title = optionalTitle.first().text();
                Element img = e.select("img").first();
                String src = img.attr("src");
                if (src.startsWith("/")) {
                    URL baseUrl;
                    try {
                        baseUrl = new URL(img.baseUri());
                    } catch (MalformedURLException ex) {
                        throw new IllegalArgumentException("Fuck!", ex);
                    }

                    src = String.format("%s://%s%s", baseUrl.getProtocol(), baseUrl.getHost(), src);
                }
                return new ImageNode(img.attr("alt"), src, "");
            }
        );
    }

}
