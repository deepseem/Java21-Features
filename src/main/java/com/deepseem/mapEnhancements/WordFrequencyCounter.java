package com.deepseem.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String[] words = {"Java", "Spring", "Java", "Kafka", "Java"};

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.merge(word, 1, Integer::sum);
        }

        System.out.println(frequency);
    }
}
