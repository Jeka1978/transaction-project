package com.credit.guard.mappers;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Component
public class Text2MapConverter {
    public Map<String,String> splitBy(String text, String delimiter) {
        HashMap<String, String> map = new HashMap<>();
        String[] pairs = text.split(delimiter);
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            map.put(keyValue[0], keyValue[1]);
        }
        return map;
    }
}
