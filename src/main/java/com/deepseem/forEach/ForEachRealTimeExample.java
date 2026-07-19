package com.deepseem.forEach;

public class ForEachRealTimeExample {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
