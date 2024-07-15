package com.abhishek.gson.serialdeserial;
import com.google.gson.Gson;

public class GsonSerializationExample {
    
	public static void main(String[] args) {
		
        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Initialize Gson
        Gson gson = new Gson();

        // Convert object to JSON string
        String json = gson.toJson(person);

        // Print JSON string
        System.out.println(json);
    }
}
