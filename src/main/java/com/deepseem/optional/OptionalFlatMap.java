package com.deepseem.optional;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args) {

        Optional<Employee> employee =
                Optional.of(new Employee(101, "John", 80000.0));

        String name =
                employee.flatMap(emp ->
                                Optional.of(emp.getName()))
                        .orElse("Unknown");

        System.out.println(name);
    }
}
