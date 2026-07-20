package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresentExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 8);

        map.computeIfPresent("Java", (k, v) -> v + 1);

        System.out.println(map);
    }
}
