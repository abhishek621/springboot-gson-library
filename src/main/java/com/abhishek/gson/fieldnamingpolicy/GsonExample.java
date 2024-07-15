package com.abhishek.gson.fieldnamingpolicy;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", "Doe", 30);

        // Initialize Gson with GsonBuilder and custom field naming policy
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) 
                // Convert camelCase to snake_case
                .create();

        // Serialize Person to JSON with field naming policy
        String json = gson.toJson(person);
        System.out.println("Serialized JSON with Snake Case:");
        System.out.println(json);
    }
}
