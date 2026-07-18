package com.deepseem.functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        BinaryOperator<Integer> max = Integer::max;

        System.out.println(max.apply(20, 30));
    }
}
