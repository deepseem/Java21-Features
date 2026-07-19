package com.deepseem.methodReference;

public class ForEachMethodReference {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .forEach(System.out::println);
    }
}
