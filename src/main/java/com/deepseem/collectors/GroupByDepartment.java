package com.deepseem.collectors;

import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, employees) -> {
                    System.out.println("Department: " + department);
                    employees.forEach(emp -> System.out.println("\t" + emp));
                });
    }
}
