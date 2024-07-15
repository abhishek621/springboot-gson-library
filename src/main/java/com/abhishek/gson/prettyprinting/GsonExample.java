package com.abhishek.gson.prettyprinting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {

	public static void main(String[] args) {
        // Create a Student object
        String[] subjects = {"Math", "Science", "History"};
        Student student = new Student("John Doe", 20, subjects);

        // Initialize Gson with GsonBuilder for pretty printing
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Serialize Student to JSON with pretty printing
        String json = gson.toJson(student);
        System.out.println("Pretty Printed JSON:");
        System.out.println(json);
    }
}
