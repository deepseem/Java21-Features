package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class ComputeExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);

        map.compute("Apple", (k, v) -> v + 5);

        System.out.println(map);
    }
}
