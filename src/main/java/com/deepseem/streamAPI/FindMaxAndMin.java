package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(15,40,80,5,99);

        Integer max = list.stream()
                .max(Integer::compare)
                .orElse(null);

        Integer min = list.stream()
                .min(Integer::compare)
                .orElse(null);

        System.out.println(max);
        System.out.println(min);
    }
}
