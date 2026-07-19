package com.deepseem.forEach;

public class ForEachParallelStream {

    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .forEach(System.out::println);
    }
}
