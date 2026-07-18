package com.deepseem.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateAndCondition {
    public static void main(String[] args) {

        Predicate<Integer> greaterThan10 = n -> n > 10;
        Predicate<Integer> lessThan100 = n -> n < 100;

        Predicate<Integer> result = greaterThan10.and(lessThan100);

        System.out.println(result.test(50));
        System.out.println(result.test(5));
        System.out.println(result.test(150));
    }
}
