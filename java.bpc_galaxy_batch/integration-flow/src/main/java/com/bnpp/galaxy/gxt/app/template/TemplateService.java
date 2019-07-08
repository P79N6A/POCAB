package com.bnpp.galaxy.gxt.app.template;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * Helper service to compile predefined templates
 */
public class TemplateService {

    private final TemplateEngine templateEngine;

    public TemplateService(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    /**
     * Process the "test" template and return compiled body in HTML and TEXT formats.
     *
     * @param errorDetails The error details (for template compilation)
     * @return The compiled "test" template
     */
    public CompiledTemplate getTest(String errorDetails) {
        Context context = new Context();

        context.setVariable("errorDetails", errorDetails);

        String text = templateEngine.process("test.txt", context);
        String html = templateEngine.process("test.html", context);

        return new CompiledTemplate(html, text);
    }

}
