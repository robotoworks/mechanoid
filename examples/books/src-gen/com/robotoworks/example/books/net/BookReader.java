package com.robotoworks.example.books.net;

import com.robotoworks.mechanoid.net.JsonEntityReader;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class BookReader extends JsonEntityReader<Book> {			
	
	public BookReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, Book entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("id")) {
				entity.setId(reader.nextLong());
			}
			else if(name.equals("title")) {
				entity.setTitle(reader.nextString());
			}
			else if(name.equals("description")) {
				entity.setDescription(reader.nextString());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<Book> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			Book item = new Book();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
