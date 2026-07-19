package com.deepseem.methodReference;

public class MapUsingMethodReference {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
