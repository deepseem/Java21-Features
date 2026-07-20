package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class StudentMarksExample {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        marks.put("Alice", 80);

        marks.computeIfPresent("Alice", (k, v) -> v + 10);

        System.out.println(marks);
    }
}
