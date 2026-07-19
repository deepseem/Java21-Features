package com.deepseem.collectors;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(

                new Employee(101,"John","IT","Male",80000),
                new Employee(102,"David","HR","Male",50000),
                new Employee(103,"Alice","Finance","Female",90000),
                new Employee(104,"Bob","IT","Male",85000),
                new Employee(105,"Emma","Finance","Female",95000),
                new Employee(106,"Sophia","HR","Female",60000)
        );
    }
}
