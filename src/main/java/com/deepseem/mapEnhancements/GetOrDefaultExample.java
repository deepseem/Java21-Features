package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "John");

        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(200, "Not Found"));
    }
}
