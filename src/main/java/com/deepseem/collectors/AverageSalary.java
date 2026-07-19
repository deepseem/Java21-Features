package com.deepseem.collectors;

import java.util.stream.Collectors;

public class AverageSalary {
    public static void main(String[] args) {

        double avg =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println(avg);
    }
}
