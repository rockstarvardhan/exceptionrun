package com.neoteric.map.mapdemo.streamlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamArrayList {
    public static void main(String[] args) {
        Employee e = new Employee("1", "IT");
        Employee e1 = new Employee("2", "ECE");
        Employee e2 = new Employee("3", "EEE");
        Employee e3 = new Employee("4", "MECH");
        Employee e4 = new Employee("5", "IT");


        List<Employee> employeeList = new ArrayList<>();


        put(employeeList, e);
        put(employeeList, e1);
        put(employeeList, e2);
        put(employeeList, e3);
        put(employeeList, e4);


        Employee newEmployee = new Employee("6", "CSE");
        set(employeeList, 2, newEmployee);

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println("Iterator Employee: " + emp);
        }


        employeeList.stream().forEach(emp -> {
            System.out.println("Stream Employee: " + emp);
        });
    }


    public static void put(List<Employee> employeeList, Employee employee) {
        employeeList.add(employee);
    }


    public static void set(List<Employee> employeeList, int index, Employee newEmployee) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.set(index, newEmployee);
        } else {
            System.out.println("Index out of bounds!");
        }
    }
    }


