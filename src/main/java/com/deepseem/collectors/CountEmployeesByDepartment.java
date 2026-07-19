package com.deepseem.collectors;

import java.util.stream.Collectors;

public class CountEmployeesByDepartment {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((department, count) -> System.out.println(department + ": " + count));
    }
}
