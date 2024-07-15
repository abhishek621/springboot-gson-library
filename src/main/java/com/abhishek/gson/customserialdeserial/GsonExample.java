package com.abhishek.gson.customserialdeserial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
	
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("Java Programming", "John Doe", 300);

        // Initialize Gson with custom serializer and deserializer
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Book.class, new CustomBookSerializer())
                .registerTypeAdapter(Book.class, new CustomBookDeserializer())
                .create();

        // Convert object to JSON string (custom serialization)
        String json = gson.toJson(book);
        System.out.println("Serialized JSON:");
        System.out.println(json);

        // Convert JSON string to object (custom deserialization)
        String jsonString = "{\"customTitle\":\"Advanced Java\",\"customAuthor\":\"Jane Smith\",\"pages\":400}";
        Book deserializedBook = gson.fromJson(jsonString, Book.class);
        System.out.println("\nDeserialized Book:");
        System.out.println("Title: " + deserializedBook.getTitle());
        System.out.println("Author: " + deserializedBook.getAuthor());
        System.out.println("Pages: " + deserializedBook.getPages());
    }
}
