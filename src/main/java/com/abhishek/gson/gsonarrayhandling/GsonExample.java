package com.abhishek.gson.gsonarrayhandling;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class GsonExample {
    
	public static void main(String[] args) {
    
		// JSON array representing multiple Book objects
        String jsonArray = "[{\"title\":\"Java Programming\",\"author\":\"John Doe\"}," +
                           "{\"title\":\"Python Basics\",\"author\":\"Jane Smith\"}]";

        // Initialize Gson
        Gson gson = new Gson();

        // Define Type for deserialization (List<Book>)
        Type bookListType = new TypeToken<List<Book>>(){}.getType();

        // Deserialize JSON array to List<Book>
        List<Book> books = gson.fromJson(jsonArray, bookListType);

        // Print List<Book>
        System.out.println("Deserialized Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
