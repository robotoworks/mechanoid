package com.robotoworks.example.movies.net;

import com.robotoworks.mechanoid.net.JsonEntityReader;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class MovieReader extends JsonEntityReader<Movie> {			
	
	public MovieReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, Movie entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("title")) {
				entity.setTitle(reader.nextString());
			}
			else if(name.equals("description")) {
				entity.setDescription(reader.nextString());
			}
			else if(name.equals("year")) {
				entity.setYear(reader.nextInt());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<Movie> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			Movie item = new Movie();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
