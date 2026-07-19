package com.deepseem.collectors;

import java.util.stream.Collectors;

public class TeeingCollector {
    public static void main(String[] args) {
        Double average =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.teeing(
                                Collectors.summingDouble(Employee::getSalary),
                                Collectors.counting(),
                                (sum,count)->sum/count));
        System.out.println("Average Salary: " + average);
    }
}
