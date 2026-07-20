package com.deepseem.parallelStreams;

public class ThreadNameExample {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .forEach(emp ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> "
                                        + emp.getName()));
    }
    
}
