package com.deepseem.optional;

import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {

        Employee employee =
                new Employee(101, "John", 80000.0);

        Optional<Employee> result =
                Optional.of(employee)
                        .filter(emp ->
                                emp.getSalary() > 70000);

        System.out.println(result);
    }
}
