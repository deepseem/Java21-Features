package com.deepseem.forEach;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(101,"John","IT",80000),
                new Employee(102,"David","HR",50000),
                new Employee(103,"Alice","Finance",90000),
                new Employee(104,"Bob","IT",85000),
                new Employee(105,"Emma","Finance",95000)
        );
    }
}
