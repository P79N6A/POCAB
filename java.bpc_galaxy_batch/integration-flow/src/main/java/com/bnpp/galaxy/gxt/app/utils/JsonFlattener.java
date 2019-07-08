package com.bnpp.galaxy.gxt.app.utils;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class JsonFlattener {

    private JsonFlattener() {
    }

    public static Map<String, String> flatten(JsonNode doc) {
        Map<String, String> result = new HashMap<>();
        fillMap("", doc, result);
        return result;
    }

    private static void fillMap(String currentPath, JsonNode jsonNode, Map<String, String> map) {
        if (jsonNode.isValueNode()) {
            map.put(currentPath, jsonNode.asText());
        } else if (jsonNode.isArray()) {
            for (int i = 0; i < jsonNode.size(); i++) {
                fillMap(currentPath + "[" + i + "]", jsonNode.get(i), map);
            }
        } else {
            Iterator<Map.Entry<String, JsonNode>> iter = jsonNode.fields();
            String pathPrefix = currentPath.isEmpty() ? "" : currentPath + ".";
            while (iter.hasNext()) {
                Map.Entry<String, JsonNode> entry = iter.next();
                fillMap(pathPrefix + entry.getKey(), entry.getValue(), map);
            }
        }
    }

}
