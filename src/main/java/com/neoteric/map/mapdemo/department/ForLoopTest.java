package com.neoteric.map.mapdemo.department;

import java.util.ArrayList;
import java.util.List;

public class ForLoopTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 5000);
        Employee emp2 = new Employee("Bob", 7000);
        Employee emp3 = new Employee("Charlie", 6000);
        Employee emp4 = new Employee("David", 4000);
        Employee emp5 = new Employee("Eve", 9000);
        Department dept1 = new Department("HR");
        Department dept2 = new Department("IT");
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);
        dept2.addEmployee(emp4);
        dept2.addEmployee(emp5);

        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);

        calculateSalaryDetails(departments);
    }
    public static void calculateSalaryDetails(List<Department> departments) {
        double totalSalary = 0;
        double maxSalary = 0;
        double minSalary = Double.MAX_VALUE;
        int totalEmployees = 0;
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);
            System.out.println("Department: " + department.getDepartmentName());
            List<Employee> employees = department.getEmployees();
            for (int j = 0; j < employees.size(); j++) {
                Employee employee = employees.get(j);
                double salary = employee.getSalary();
                totalSalary += salary;
                totalEmployees++;
                if (salary > maxSalary) {
                    maxSalary = salary;
                }
                if (salary < minSalary) {
                    minSalary = salary;
                }
            }
        }
        double averageSalary = totalEmployees > 0 ? totalSalary / totalEmployees : 0;
        System.out.println("Company Salary Details:");
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Maximum Salary: " + maxSalary);
        System.out.println("Minimum Salary: " + minSalary);
    }
    }

