package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.computeIfAbsent("Java", key -> key.length());

        System.out.println(map);
    }
}
