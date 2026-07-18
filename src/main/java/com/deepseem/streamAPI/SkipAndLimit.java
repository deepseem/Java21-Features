package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimit {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10,20,30,40,50);

        list.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }
}
