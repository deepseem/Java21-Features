package com.deepseem.methodReference;

public class ConstructorReference {
    public static void main(String[] args) {

        EmployeeFactory factory = Employee::new;

        Employee employee =
                factory.create(101,"John","IT",80000);

        System.out.println(employee);
    }
}
