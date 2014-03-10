package com.robotoworks.example.ghissues.net;

import com.robotoworks.mechanoid.net.JsonEntityWriter;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class LabelWriter extends JsonEntityWriter<Label> {

	public LabelWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, Label entity) throws IOException {
		writer.beginObject();
		
		writer.name("url");
		writer.value(entity.getUrl());
		writer.name("name");
		writer.value(entity.getName());
		writer.name("color");
		writer.value(entity.getColor());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<Label> entities) throws IOException {
		writer.beginArray();
		
		for(Label item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
