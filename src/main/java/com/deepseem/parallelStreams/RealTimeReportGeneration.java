package com.deepseem.parallelStreams;

import java.util.stream.Collectors;

public class RealTimeReportGeneration {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, employees) -> {

                    System.out.println("\nDepartment : " + dept);

                    employees.forEach(System.out::println);
                });
    }
}
