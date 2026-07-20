package com.deepseem.parallelStreams;

public class ParallelForEach {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .forEach(emp ->
                        System.out.println(emp.getName()));
    }
}
