package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class ReplaceExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "John");

        map.replace(101, "Johnny");

        System.out.println(map);
    }
}
