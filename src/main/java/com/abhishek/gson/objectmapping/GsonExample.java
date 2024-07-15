package com.abhishek.gson.objectmapping;
import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
       
    	// JSON representing a Person object
        String json = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":30}";

        // Initialize Gson
        Gson gson = new Gson();

        // Deserialize JSON to Person object
        Person person = gson.fromJson(json, Person.class);

        // Print Person object
        System.out.println("Deserialized Person:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}
