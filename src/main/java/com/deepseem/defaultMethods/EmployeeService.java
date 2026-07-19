package com.deepseem.defaultMethods;

import java.util.List;

public interface EmployeeService {
    default void printEmployees(List<String> employees) {

        employees.stream()
                .forEach(System.out::println);
    }
}
