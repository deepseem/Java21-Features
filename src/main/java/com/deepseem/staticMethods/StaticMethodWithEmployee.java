package com.deepseem.staticMethods;

public class StaticMethodWithEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee(101, "John", 90000);

        System.out.println(EmployeeUtil.isHighSalary(employee));
    }
}
