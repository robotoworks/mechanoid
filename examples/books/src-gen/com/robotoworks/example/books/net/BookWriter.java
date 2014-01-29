package com.robotoworks.example.books.net;

import com.robotoworks.mechanoid.net.JsonEntityWriter;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class BookWriter extends JsonEntityWriter<Book> {

	public BookWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, Book entity) throws IOException {
		writer.beginObject();
		
		writer.name("id");
		writer.value(entity.getId());
		writer.name("title");
		writer.value(entity.getTitle());
		writer.name("description");
		writer.value(entity.getDescription());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<Book> entities) throws IOException {
		writer.beginArray();
		
		for(Book item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
