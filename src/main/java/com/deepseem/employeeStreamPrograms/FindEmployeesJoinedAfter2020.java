package com.deepseem.employeeStreamPrograms;

import java.time.LocalDate;

public class FindEmployeesJoinedAfter2020 {

    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .filter(employee ->
                        employee.getJoiningDate()
                                .isAfter(LocalDate.of(2020, 12, 31)))
                .forEach(System.out::println);
    }
}
