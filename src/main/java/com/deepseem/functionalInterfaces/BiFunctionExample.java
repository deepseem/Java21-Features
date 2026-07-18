package com.deepseem.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = Integer::sum;

        System.out.println(sum.apply(20, 30));
    }
}
