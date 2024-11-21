package com.neoteric.map.mapdemo.employee;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomEmployeeHashMap extends CustomHashMap <Integer,Employee>{

    // Constructor to initialize the HashMap (assuming CustomHashMap has some structure)
    public CustomEmployeeHashMap() throws InterruptedException {
        wait();
    }

    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for (Map.Entry<Integer, Employee> entry : entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }

    @Override
    public Set<Map.Entry<Integer, Employee>> entrySet() {
        // Assuming the base class has a map holding the entries.
        Set<Map.Entry<Integer, Employee>> entrySet = new HashSet<>();
        // Add the logic to return the entries
        // This depends on how your CustomHashMap is structured. Here's a possible example:

        // For example, if CustomHashMap stores data in a map field:
        // entrySet.addAll(super.map.entrySet());

        return entrySet;
    }

    public void put(int i, Employee employee) {
    }

    public int size() {
        return 0;
    }
}