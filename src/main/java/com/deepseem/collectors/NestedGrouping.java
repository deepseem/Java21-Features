package com.deepseem.collectors;

public class NestedGrouping {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(
                        java.util.stream.Collectors.groupingBy(
                                Employee::getDepartment,
                                java.util.stream.Collectors.groupingBy(Employee::getGender)
                        )
                )
                .forEach((department, genderMap) -> {
                    System.out.println("Department: " + department);
                    genderMap.forEach((gender, employees) -> {
                        System.out.println("  Gender: " + gender);
                        employees.forEach(employee -> System.out.println("    " + employee));
                    });
                });
    }
}
