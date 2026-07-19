package com.deepseem.optional;

import java.util.Optional;

public class ChainingOptional {
    public static void main(String[] args) {

        Employee employee =
                new Employee(101, "John", 80000.0);

        String result =
                Optional.of(employee)
                        .map(Employee::getName)
                        .map(String::toUpperCase)
                        .orElse("NA");

        System.out.println(result);
    }
}
