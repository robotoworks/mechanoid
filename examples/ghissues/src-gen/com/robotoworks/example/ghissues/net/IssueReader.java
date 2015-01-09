package com.robotoworks.example.ghissues.net;

import com.robotoworks.mechanoid.net.JsonEntityReader;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.ArrayList;

public class IssueReader extends JsonEntityReader<Issue> {			
	
	public IssueReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, Issue entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("url")) {
				entity.setUrl(reader.nextString());
			}
			else if(name.equals("labels_url")) {
				entity.setLabelsUrl(reader.nextString());
			}
			else if(name.equals("comments_url")) {
				entity.setCommentsUrl(reader.nextString());
			}
			else if(name.equals("events_url")) {
				entity.setEventsUrl(reader.nextString());
			}
			else if(name.equals("html_url")) {
				entity.setHtmlUrl(reader.nextString());
			}
			else if(name.equals("id")) {
				entity.setId(reader.nextLong());
			}
			else if(name.equals("number")) {
				entity.setNumber(reader.nextLong());
			}
			else if(name.equals("title")) {
				entity.setTitle(reader.nextString());
			}
			else if(name.equals("user")) {
				User entityMember = new User();
				getProvider().get(User.class).read(reader, entityMember);
				entity.setUser(entityMember);
			}
			else if(name.equals("labels")) {
				List<Label> entityMember = new ArrayList<Label>();
				getProvider().get(Label.class).readList(reader, entityMember);
				entity.setLabels(entityMember);
			}
			else if(name.equals("state")) {
				IssueState entityMember = IssueState.fromValue(reader.nextString());
				entity.setState(entityMember);
			}
			else if(name.equals("comments")) {
				entity.setComments(reader.nextInt());
			}
			else if(name.equals("created_at")) {
				entity.setCreatedAt(reader.nextString());
			}
			else if(name.equals("updated_at")) {
				entity.setUpdatedAt(reader.nextString());
			}
			else if(name.equals("closed_at")) {
				entity.setClosedAt(reader.nextString());
			}
			else if(name.equals("body")) {
				entity.setBody(reader.nextString());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<Issue> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			Issue item = new Issue();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
