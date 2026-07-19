package com.deepseem.collectors;

import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.mapping(
                        Employee::getName,
                        Collectors.toList()));

    }
}
