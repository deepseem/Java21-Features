package com.deepseem.employeeStreamPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {
    public static void main(String[] args) {

        Map<String, Double> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        result.forEach((department, avgSalary) ->
                System.out.println(department + " -> " + avgSalary));
    }
}
