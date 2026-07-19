package com.deepseem.forEach;

public class ForEachWithMethodReference {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
