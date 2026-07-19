package com.deepseem.employeeStreamPrograms;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class SalarySummaryStatistics {
    public static void main(String[] args) {

        DoubleSummaryStatistics statistics =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.summarizingDouble(
                                Employee::getSalary));

        System.out.println("Count   : " + statistics.getCount());
        System.out.println("Sum     : " + statistics.getSum());
        System.out.println("Average : " + statistics.getAverage());
        System.out.println("Min     : " + statistics.getMin());
        System.out.println("Max     : " + statistics.getMax());
    }
}
