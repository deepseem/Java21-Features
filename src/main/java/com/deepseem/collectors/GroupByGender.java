package com.deepseem.collectors;

import java.util.stream.Collectors;

public class GroupByGender {
    public static void main(String[] args) {
        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender))
                .forEach((gender, employees) -> {
                    System.out.println(gender);
                    employees.forEach(System.out::println);
                });
    }
}
