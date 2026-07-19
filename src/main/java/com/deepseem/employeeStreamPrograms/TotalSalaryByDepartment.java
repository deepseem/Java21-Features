package com.deepseem.employeeStreamPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class TotalSalaryByDepartment {
    public static void main(String[] args) {

        Map<String, Double> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)));

        result.forEach((department, totalSalary) ->
                System.out.println(department + " -> " + totalSalary));
    }
}
