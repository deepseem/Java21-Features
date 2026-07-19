package com.deepseem.employeeStreamPrograms;

import java.util.stream.Collectors;

public class FindDuplicateEmployeeNames {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getName,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);
    }
}
