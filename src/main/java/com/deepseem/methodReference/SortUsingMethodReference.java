package com.deepseem.methodReference;

import java.util.Comparator;

public class SortUsingMethodReference {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
