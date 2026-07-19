package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class SortEmployeesBySalary {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
