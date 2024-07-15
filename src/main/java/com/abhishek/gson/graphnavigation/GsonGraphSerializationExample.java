package com.abhishek.gson.graphnavigation;
import com.google.gson.Gson;

import java.util.Arrays;

public class GsonGraphSerializationExample {
	
    public static void main(String[] args) {
        // Create Address objects
        Address address1 = new Address("New York", "USA");
        Address address2 = new Address("London", "UK");

        // Create Employee objects
        Employee employee1 = new Employee("John Doe", 30, address1);
        Employee employee2 = new Employee("Jane Smith", 25, address2);

        // Create a Company object with employees
        Company company = new Company("ABC Inc.", Arrays.asList(employee1, employee2));

        // Initialize Gson
        Gson gson = new Gson();

        // Convert object graph to JSON string
        String json = gson.toJson(company);

        // Print JSON string
        System.out.println(json);
    }
}
