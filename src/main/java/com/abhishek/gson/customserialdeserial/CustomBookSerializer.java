package com.abhishek.gson.customserialdeserial;
import com.google.gson.*;

import java.lang.reflect.Type;

public class CustomBookSerializer implements JsonSerializer<Book> {
	
    @Override
    public JsonElement serialize(Book book, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonBook = new JsonObject();
        jsonBook.addProperty("customTitle", book.getTitle());
        jsonBook.addProperty("customAuthor", book.getAuthor());
        jsonBook.addProperty("pages", book.getPages());
        return jsonBook;
    }
}
