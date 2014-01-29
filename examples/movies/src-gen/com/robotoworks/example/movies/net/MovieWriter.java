package com.robotoworks.example.movies.net;

import com.robotoworks.mechanoid.net.JsonEntityWriter;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class MovieWriter extends JsonEntityWriter<Movie> {

	public MovieWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, Movie entity) throws IOException {
		writer.beginObject();
		
		writer.name("title");
		writer.value(entity.getTitle());
		writer.name("description");
		writer.value(entity.getDescription());
		writer.name("year");
		writer.value(entity.getYear());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<Movie> entities) throws IOException {
		writer.beginArray();
		
		for(Movie item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
