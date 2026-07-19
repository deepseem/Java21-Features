package com.deepseem.forEach;

public class ForEachUpdateSalary {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .forEach(emp ->
                        System.out.println(
                                emp.getName()
                                        +" : "
                                        +(emp.getSalary()+5000)));
    }
}
