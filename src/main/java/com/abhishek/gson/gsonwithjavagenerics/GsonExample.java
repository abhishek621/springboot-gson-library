package com.abhishek.gson.gsonwithjavagenerics;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class GsonExample {
    public static void main(String[] args) {
        // Example 1: Serialize and Deserialize with String type
        Response<String> stringResponse = new Response<>(true, "Hello, Gson!");
        Gson gson = new Gson();

        // Serialize to JSON
        String json1 = gson.toJson(stringResponse);
        System.out.println("Serialized JSON (String):");
        System.out.println(json1);

        // Deserialize from JSON
        Response<String> deserializedStringResponse = gson.fromJson(json1, new TypeToken<Response<String>>(){}.getType());
        System.out.println("\nDeserialized String Response:");
        System.out.println("Success: " + deserializedStringResponse.isSuccess());
        System.out.println("Data: " + deserializedStringResponse.getData());

        // Example 2: Serialize and Deserialize with Integer type
        Response<Integer> intResponse = new Response<>(true, 123);
        
        // Serialize to JSON
        String json2 = gson.toJson(intResponse);
        System.out.println("\nSerialized JSON (Integer):");
        System.out.println(json2);

        // Deserialize from JSON
        Response<Integer> deserializedIntResponse = gson.fromJson(json2, new TypeToken<Response<Integer>>(){}.getType());
        System.out.println("\nDeserialized Integer Response:");
        System.out.println("Success: " + deserializedIntResponse.isSuccess());
        System.out.println("Data: " + deserializedIntResponse.getData());

        // Example 3: Serialize and Deserialize with a custom class (Book)
        Book book = new Book("Java Programming", "John Doe", 300);
        Response<Book> bookResponse = new Response<>(true, book);
        
        // Serialize to JSON
        String json3 = gson.toJson(bookResponse);
        System.out.println("\nSerialized JSON (Book):");
        System.out.println(json3);

        // Deserialize from JSON
        Type bookType = new TypeToken<Response<Book>>(){}.getType();
        Response<Book> deserializedBookResponse = gson.fromJson(json3, bookType);
        System.out.println("\nDeserialized Book Response:");
        System.out.println("Success: " + deserializedBookResponse.isSuccess());
        System.out.println("Book Title: " + deserializedBookResponse.getData().getTitle());
        System.out.println("Book Author: " + deserializedBookResponse.getData().getAuthor());
        System.out.println("Book Pages: " + deserializedBookResponse.getData().getPages());

        // Example 4: Serialize and Deserialize with a List of Strings
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        Response<List<String>> listResponse = new Response<>(true, stringList);
        
        // Serialize to JSON
        String json4 = gson.toJson(listResponse);
        System.out.println("\nSerialized JSON (List<String>):");
        System.out.println(json4);

        // Deserialize from JSON
        Type listType = new TypeToken<Response<List<String>>>(){}.getType();
        Response<List<String>> deserializedListResponse = gson.fromJson(json4, listType);
        System.out.println("\nDeserialized List Response:");
        System.out.println("Success: " + deserializedListResponse.isSuccess());
        System.out.println("List Data: " + deserializedListResponse.getData());
    }
}
