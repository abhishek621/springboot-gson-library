package com.abhishek.gson.customserialdeserial;
import com.google.gson.*;

import java.lang.reflect.Type;

public class CustomBookDeserializer implements JsonDeserializer<Book> {
	
    @Override
    public Book deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String customTitle = jsonObject.get("customTitle").getAsString();
        String customAuthor = jsonObject.get("customAuthor").getAsString();
        int pages = jsonObject.get("pages").getAsInt();
        return new Book(customTitle, customAuthor, pages);
    }
}
