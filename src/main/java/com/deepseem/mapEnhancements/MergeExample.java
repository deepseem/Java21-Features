package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class MergeExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 5);

        map.merge("Java", 3, Integer::sum);
        map.merge("Spring", 2, Integer::sum);

        System.out.println(map);
    }
}
