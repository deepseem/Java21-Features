package com.deepseem.optional;

import java.util.Optional;

public class OptionalWithEmployee {
    public static void main(String[] args) {

        Optional<Employee> employee =
                Optional.ofNullable(
                        new Employee(101, "Alice", 95000.0));

        employee.ifPresent(System.out::println);
    }
}
