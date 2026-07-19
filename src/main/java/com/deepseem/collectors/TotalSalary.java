package com.deepseem.collectors;

import java.util.stream.Collectors;

public class TotalSalary {
    public static void main(String[] args) {
        double total =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.summingDouble(Employee::getSalary));

        System.out.println(total);
    }
}
