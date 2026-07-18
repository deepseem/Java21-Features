package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("A","B","C","D");

        long count = list.stream().count();

        System.out.println(count);
    }
}
