package com.bnpp.galaxy.gxt.app.batch.container;

import java.util.Map;

public class OutputDataWrapper {
    private static final String SEPARATOR = ";";

    private Map<String, String> flatJsonNode;

    public OutputDataWrapper(Map<String, String> flatJsonNode) {
        super();
        this.flatJsonNode = flatJsonNode;
    }

    public Map<String, String> getFlatJsonNode() {
        return flatJsonNode;
    }

    @Override
    public String toString() {
        return String.join(SEPARATOR, flatJsonNode.values());
    }

}
