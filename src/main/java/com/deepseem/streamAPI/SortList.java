package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9,2,8,4,1);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        //Descending
        list.stream()
                .sorted((a,b)->b-a)
                .forEach(System.out::println);
    }
}
