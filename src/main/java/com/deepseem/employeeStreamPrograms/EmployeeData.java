package com.deepseem.employeeStreamPrograms;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {

        return Arrays.asList(

                new Employee(101,"John","IT",75000,30,"Male", LocalDate.of(2020,5,10)),
                new Employee(102,"David","HR",50000,28,"Male",LocalDate.of(2021,3,5)),
                new Employee(103,"Alice","Finance",90000,35,"Female",LocalDate.of(2018,8,20)),
                new Employee(104,"Bob","IT",85000,32,"Male",LocalDate.of(2019,7,15)),
                new Employee(105,"Emma","Finance",95000,29,"Female",LocalDate.of(2022,1,1)),
                new Employee(106,"Sophia","HR",60000,31,"Female",LocalDate.of(2017,11,18)),
                new Employee(107,"John","IT",78000,27,"Male",LocalDate.of(2023,2,10)),
                new Employee(108,"Chris","Admin",45000,40,"Male",LocalDate.of(2015,4,4))
        );
    }
}
