package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "John");
        map.putIfAbsent(102, "David");
        map.putIfAbsent(101, "Alice");

        System.out.println(map);
    }
}
