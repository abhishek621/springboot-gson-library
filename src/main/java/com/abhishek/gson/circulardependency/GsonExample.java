package com.abhishek.gson.circulardependency;

import java.util.Arrays;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
    public static void main(String[] args) {
        // Create Department
        Department department = new Department("IT", null);

        // Create Employees
        Employee john = new Employee("John Doe", department);
        Employee jane = new Employee("Jane Smith", department);

        // Set Employees in Department
        department.setEmployees(Arrays.asList(john, jane));

        // Initialize Gson with GsonBuilder to handle circular references
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Serialize Department to JSON
        String json = gson.toJson(department);
        System.out.println("Serialized JSON:");
        System.out.println(json);

        // Deserialize JSON back to Department
        Department deserializedDepartment = gson.fromJson(json, Department.class);

        // Print Department information
        System.out.println("\nDeserialized Department:");
        System.out.println("Department Name: " + deserializedDepartment.getName());
        System.out.println("Employees:");
        for (Employee employee : deserializedDepartment.getEmployees()) {
            System.out.println("\tEmployee Name: " + employee.getName());
        }
    }
}
