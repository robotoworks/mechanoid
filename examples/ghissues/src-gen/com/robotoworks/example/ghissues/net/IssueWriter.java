package com.robotoworks.example.ghissues.net;

import com.robotoworks.mechanoid.net.JsonEntityWriter;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class IssueWriter extends JsonEntityWriter<Issue> {

	public IssueWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, Issue entity) throws IOException {
		writer.beginObject();
		
		writer.name("url");
		writer.value(entity.getUrl());
		writer.name("labels_url");
		writer.value(entity.getLabelsUrl());
		writer.name("comments_url");
		writer.value(entity.getCommentsUrl());
		writer.name("events_url");
		writer.value(entity.getEventsUrl());
		writer.name("html_url");
		writer.value(entity.getHtmlUrl());
		writer.name("id");
		writer.value(entity.getId());
		writer.name("number");
		writer.value(entity.getNumber());
		writer.name("title");
		writer.value(entity.getTitle());
		if(entity.getUser() != null) {
			writer.name("user");
			getProvider().get(User.class).write(writer, entity.getUser());
		}
		if(entity.getLabels() != null) {
			writer.name("labels");
			getProvider().get(Label.class).writeList(writer, entity.getLabels());
		}
		if(entity.getState() != null) {
			writer.name("state");
			writer.value(entity.getState().toString());
		}
		writer.name("comments");
		writer.value(entity.getComments());
		writer.name("created_at");
		writer.value(entity.getCreatedAt());
		writer.name("updated_at");
		writer.value(entity.getUpdatedAt());
		writer.name("closed_at");
		writer.value(entity.getClosedAt());
		writer.name("body");
		writer.value(entity.getBody());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<Issue> entities) throws IOException {
		writer.beginArray();
		
		for(Issue item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
