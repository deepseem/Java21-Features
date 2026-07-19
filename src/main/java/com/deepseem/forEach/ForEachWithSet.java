package com.deepseem.forEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachWithSet {
    public static void main(String[] args) {

        Set<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("Spring");
        skills.add("Kafka");

        skills.forEach(System.out::println);
    }
}
