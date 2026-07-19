package com.deepseem.forEach;

public class ForEachEmployeeNames {

    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .forEach(emp ->
                        System.out.println(emp.getName()));
    }
}
