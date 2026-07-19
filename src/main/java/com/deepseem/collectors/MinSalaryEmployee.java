package com.deepseem.collectors;

import java.util.Comparator;
import java.util.stream.Collectors;

public class MinSalaryEmployee {
    public static void main(String[] args) {
        Employee emp =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.minBy(
                                Comparator.comparing(Employee::getSalary)))
                        .orElse(null);
        System.out.println(emp);
    }
}
