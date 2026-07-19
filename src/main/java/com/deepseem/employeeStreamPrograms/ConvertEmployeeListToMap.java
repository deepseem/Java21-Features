package com.deepseem.employeeStreamPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class ConvertEmployeeListToMap {
    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.toMap(
                                Employee::getId,
                                employee -> employee
                        ));

        employeeMap.forEach((id, employee) ->
                System.out.println(id + " -> " + employee));
    }
}
