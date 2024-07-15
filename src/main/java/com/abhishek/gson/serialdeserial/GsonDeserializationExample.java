package com.abhishek.gson.serialdeserial;
import com.google.gson.Gson;

public class GsonDeserializationExample {
	
    public static void main(String[] args) {
        // JSON string representing a Person
        String json = "{\"name\":\"Jane Smith\",\"age\":25}";

        // Initialize Gson
        Gson gson = new Gson();

        // Convert JSON string to Person object
        Person person = gson.fromJson(json, Person.class);

        // Print Person object
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
