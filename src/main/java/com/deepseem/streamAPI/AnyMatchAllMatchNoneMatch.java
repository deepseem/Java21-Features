package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchNoneMatch {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10,20,30);

        System.out.println(
                numbers.stream().anyMatch(n->n>25));

        System.out.println(
                numbers.stream().allMatch(n->n>5));

        System.out.println(
                numbers.stream().noneMatch(n->n<0));
    }
}
