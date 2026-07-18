package com.deepseem.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, Integer> employee =
                (name, age) -> System.out.println(name + " : " + age);

        employee.accept("John", 30);
    }
}
