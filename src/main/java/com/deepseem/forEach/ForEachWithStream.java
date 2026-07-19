package com.deepseem.forEach;

public class ForEachWithStream {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .forEach(System.out::println);
    }
}
