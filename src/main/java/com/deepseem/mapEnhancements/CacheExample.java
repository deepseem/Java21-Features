package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class CacheExample {
    public static void main(String[] args) {

        Map<Integer, String> cache = new HashMap<>();

        String value = cache.computeIfAbsent(1, key -> "Cached Value");

        System.out.println(value);
    }
}
