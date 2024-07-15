package com.abhishek.gson.graphnavigation;
import com.google.gson.Gson;

public class GsonGraphDeserializationExample {
	
    public static void main(String[] args) {
        // JSON string representing a Company object
        String json = "{\"name\":\"ABC Inc.\",\"employees\":[{\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"New York\",\"country\":\"USA\"}},{\"name\":\"Jane Smith\",\"age\":25,\"address\":{\"city\":\"London\",\"country\":\"UK\"}}]}";

        // Initialize Gson
        Gson gson = new Gson();

        // Convert JSON string to Company object
        Company company = gson.fromJson(json, Company.class);

        // Print Company object
        System.out.println("Company Name: " + company.getName());
        System.out.println("Employees:");
        for (Employee employee : company.getEmployees()) {
            System.out.println("\tName: " + employee.getName());
            System.out.println("\tAge: " + employee.getAge());
            System.out.println("\tAddress: " + employee.getAddress().getCity() + ", " + employee.getAddress().getCountry());
            System.out.println();
        }
    }
}
