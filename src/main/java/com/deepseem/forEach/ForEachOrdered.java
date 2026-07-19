package com.deepseem.forEach;

public class ForEachOrdered {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .forEachOrdered(System.out::println);
    }
}
