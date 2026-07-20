package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAllExample {
    public static void main(String[] args) {

        Map<String, Integer> salaries = new HashMap<>();

        salaries.put("John", 50000);
        salaries.put("David", 60000);

        salaries.replaceAll((name, salary) -> salary + 5000);

        System.out.println(salaries);
    }
}
