package com.bnpp.galaxy.gxt.app.template;

import java.util.Optional;

/**
 * Immutable class wrapping compiled template contents, optionally in multiple formats (plain text, html).
 */
public class CompiledTemplate {

    private final String html;
    private final String plainText;

    public CompiledTemplate(String html, String plainText) {
        this.html = html;
        this.plainText = plainText;
    }

    /**
     * Get contents in HTML format
     *
     * @return The HTML contents or an empty Optional if no HTML contents is available
     */
    public Optional<String> getHtml() {
        return Optional.ofNullable(html);
    }

    /**
     * Get contents in PLAIN TEXT format
     *
     * @return The PLAIN TEXT contents or an empty Optional if no PLAIN TEXT contents is available
     */
    public Optional<String> getPlainText() {
        return Optional.ofNullable(plainText);
    }

    @Override
    public String toString() {
        return "CompiledTemplate{" +
                "html='" + html + '\'' +
                ", plainText='" + plainText + '\'' +
                '}';
    }
}
