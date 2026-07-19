package com.deepseem.forEach;

public class ForEachFilterEmployees {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .filter(emp -> emp.getSalary() > 80000)
                .forEach(System.out::println);
    }
}
