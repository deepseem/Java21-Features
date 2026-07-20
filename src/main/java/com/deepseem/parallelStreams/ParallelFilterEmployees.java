package com.deepseem.parallelStreams;

public class ParallelFilterEmployees {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .filter(emp -> emp.getSalary() > 80000)
                .forEach(System.out::println);
    }
}
