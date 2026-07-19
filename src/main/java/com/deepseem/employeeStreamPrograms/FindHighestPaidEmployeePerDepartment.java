package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmployeePerDepartment {
    public static void main(String[] args) {

        Map<String, Optional<Employee>> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(
                                        Comparator.comparing(Employee::getSalary)
                                )));

        result.forEach((department, employee) ->
                System.out.println(department + " -> " + employee.orElse(null)));
    }
}
