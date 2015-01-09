package com.robotoworks.example.ghissues.net;

import com.robotoworks.mechanoid.net.JsonEntityReader;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class UserReader extends JsonEntityReader<User> {			
	
	public UserReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, User entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("login")) {
				entity.setLogin(reader.nextString());
			}
			else if(name.equals("id")) {
				entity.setId(reader.nextLong());
			}
			else if(name.equals("avatar_url")) {
				entity.setAvatarUrl(reader.nextString());
			}
			else if(name.equals("gravatar_id")) {
				entity.setGravatarId(reader.nextString());
			}
			else if(name.equals("url")) {
				entity.setUrl(reader.nextString());
			}
			else if(name.equals("html_url")) {
				entity.setHtmlUrl(reader.nextString());
			}
			else if(name.equals("followers_url")) {
				entity.setFollowersUrl(reader.nextString());
			}
			else if(name.equals("following_url")) {
				entity.setFollowingUrl(reader.nextString());
			}
			else if(name.equals("gists_url")) {
				entity.setGistsUrl(reader.nextString());
			}
			else if(name.equals("starred_url")) {
				entity.setStarredUrl(reader.nextString());
			}
			else if(name.equals("subscriptions_url")) {
				entity.setSubscriptionsUrl(reader.nextString());
			}
			else if(name.equals("organizations_url")) {
				entity.setOrganizationsUrl(reader.nextString());
			}
			else if(name.equals("repos_url")) {
				entity.setReposUrl(reader.nextString());
			}
			else if(name.equals("events_url")) {
				entity.setEventsUrl(reader.nextString());
			}
			else if(name.equals("received_events_url")) {
				entity.setReceivedEventsUrl(reader.nextString());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<User> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			User item = new User();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
