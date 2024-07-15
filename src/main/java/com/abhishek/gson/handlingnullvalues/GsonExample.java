package com.abhishek.gson.handlingnullvalues;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {

	public static void main(String[] args) {
        // Create a Person object with null values
        Person person = new Person(null, null, null);

        // Initialize Gson with GsonBuilder to handle nulls gracefully
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls() // Include null values in JSON output
                .create();

        // Serialize Person to JSON
        String json = gson.toJson(person);
        System.out.println("Serialized JSON:");
        System.out.println(json);

        // Deserialize JSON back to Person
        Person deserializedPerson = gson.fromJson(json, Person.class);

        // Print Person information
        System.out.println("\nDeserialized Person:");
        System.out.println("Name: " + deserializedPerson.getName());
        System.out.println("Age: " + deserializedPerson.getAge());
        System.out.println("Address: " + deserializedPerson.getAddress());
    }
}
