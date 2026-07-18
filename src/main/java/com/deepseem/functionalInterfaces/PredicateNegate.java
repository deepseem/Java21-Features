package com.deepseem.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateNegate {
    public static void main(String[] args) {

        Predicate<String> isEmpty = String::isEmpty;

        System.out.println(isEmpty.negate().test("Java"));
        System.out.println(isEmpty.negate().test(""));
    }
}
