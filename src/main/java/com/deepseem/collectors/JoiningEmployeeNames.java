package com.deepseem.collectors;

import java.util.stream.Collectors;

public class JoiningEmployeeNames {
    public static void main(String[] args) {

        String names =
                EmployeeData.getEmployees()
                        .stream()
                        .map(Employee::getName)
                        .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
