package com.neoteric.map.mapdemo.department;

import java.util.*;

public class DepartmentTest {
    public static void main(String[] args) {
        Department dept1 = new Department("IT");
        dept1.addEmployee(new Employee("kiran", 75000));
        dept1.addEmployee(new Employee("Boby", 50000));

        Department dept2 = new Department("HR");
        dept2.addEmployee(new Employee("vijay", 45000));
        dept2.addEmployee(new Employee("arun", 60000));

        Department dept3 = new Department("Finance");
        dept3.addEmployee(new Employee("rakesh", 90000));
        dept3.addEmployee(new Employee("suresh", 55000));

                List<Department> departments = Arrays.asList(dept1, dept2, dept3);


        List<Map.Entry<Department, Employee>> allEmployees = new ArrayList<>();
        for (Department department : departments) {
            for (Employee employee : department.getEmployees()) {
                allEmployees.add(Map.entry(department, employee));
            }
        }

        if (allEmployees.isEmpty()) {
            System.out.println("No employees in the company.");
            return;
        }


        Map.Entry<Department, Employee> highestSalaryEntry = allEmployees.stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getSalary()))
                .get();


        Department highestSalaryDepartment = highestSalaryEntry.getKey();
        Employee highestSalaryEmployee = highestSalaryEntry.getValue();


        System.out.println("Employee with the Highest Salary: " + highestSalaryEmployee);
        System.out.println("Company Highest Salary: " + highestSalaryEmployee.getSalary());
        System.out.println("Department: " + highestSalaryDepartment.getName());
    }
}

