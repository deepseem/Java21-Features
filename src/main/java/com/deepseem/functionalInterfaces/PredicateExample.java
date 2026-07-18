package com.deepseem.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));
    }
}
