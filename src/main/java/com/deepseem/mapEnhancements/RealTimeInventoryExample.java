package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class RealTimeInventoryExample {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.merge("Laptop", 5, Integer::sum);
        inventory.merge("Laptop", 3, Integer::sum);

        inventory.merge("Mouse", 10, Integer::sum);

        inventory.forEach((item, qty) ->
                System.out.println(item + " -> " + qty));
    }
}
