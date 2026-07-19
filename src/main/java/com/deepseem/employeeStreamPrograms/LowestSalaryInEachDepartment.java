package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LowestSalaryInEachDepartment {
    public static void main(String[] args) {

        Map<String, Optional<Employee>> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.minBy(
                                        Comparator.comparing(Employee::getSalary))));

        result.forEach((department, employee) ->
                System.out.println(department + " -> " + employee.orElse(null)));
    }
}
