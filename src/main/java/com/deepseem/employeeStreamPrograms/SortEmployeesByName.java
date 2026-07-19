package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class SortEmployeesByName {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }
}
