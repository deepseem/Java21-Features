package com.deepseem.methodReference;

import java.util.Comparator;

public class MethodReferenceWithComparator {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }
}
