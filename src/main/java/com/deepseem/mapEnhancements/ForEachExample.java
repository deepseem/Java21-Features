package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "John");
        map.put(102, "David");

        map.forEach((id, name) ->
                System.out.println(id + " -> " + name));
    }
}
