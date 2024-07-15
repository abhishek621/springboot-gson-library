package com.abhishek.gson.versioning;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {

	public static void main(String[] args) {
        
		// Create instances of PersonV1 and PersonV2
        PersonV1 personV1 = new PersonV1("John Doe", 30);
        PersonV2 personV2 = new PersonV2("Jane Smith", 25, "123 Main St");

        // Initialize Gson with GsonBuilder for versioning support
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Serialize PersonV1 to JSON
        String jsonV1 = gson.toJson(personV1);
        System.out.println("Serialized PersonV1:");
        System.out.println(jsonV1);

        // Deserialize JSON (PersonV1) back to PersonV2
        PersonV2 deserializedPersonV1 = gson.fromJson(jsonV1, PersonV2.class);
        System.out.println("\nDeserialized PersonV1 to PersonV2:");
        System.out.println("Full Name: " + deserializedPersonV1.getFullName());
        System.out.println("Age: " + deserializedPersonV1.getAge());
        System.out.println("Address: " + deserializedPersonV1.getAddress());

        // Serialize PersonV2 to JSON
        String jsonV2 = gson.toJson(personV2);
        System.out.println("\nSerialized PersonV2:");
        System.out.println(jsonV2);

        // Deserialize JSON (PersonV2) back to PersonV1
        PersonV1 deserializedPersonV2 = gson.fromJson(jsonV2, PersonV1.class);
        System.out.println("\nDeserialized PersonV2 to PersonV1:");
        System.out.println("Name: " + deserializedPersonV2.getName());
        System.out.println("Age: " + deserializedPersonV2.getAge());
    }
}
