package com.robotoworks.example.ghissues.net;

import com.robotoworks.mechanoid.net.JsonEntityWriter;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;


public class UserWriter extends JsonEntityWriter<User> {

	public UserWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, User entity) throws IOException {
		writer.beginObject();
		
		writer.name("login");
		writer.value(entity.getLogin());
		writer.name("id");
		writer.value(entity.getId());
		writer.name("avatar_url");
		writer.value(entity.getAvatarUrl());
		writer.name("gravatar_id");
		writer.value(entity.getGravatarId());
		writer.name("url");
		writer.value(entity.getUrl());
		writer.name("html_url");
		writer.value(entity.getHtmlUrl());
		writer.name("followers_url");
		writer.value(entity.getFollowersUrl());
		writer.name("following_url");
		writer.value(entity.getFollowingUrl());
		writer.name("gists_url");
		writer.value(entity.getGistsUrl());
		writer.name("starred_url");
		writer.value(entity.getStarredUrl());
		writer.name("subscriptions_url");
		writer.value(entity.getSubscriptionsUrl());
		writer.name("organizations_url");
		writer.value(entity.getOrganizationsUrl());
		writer.name("repos_url");
		writer.value(entity.getReposUrl());
		writer.name("events_url");
		writer.value(entity.getEventsUrl());
		writer.name("received_events_url");
		writer.value(entity.getReceivedEventsUrl());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<User> entities) throws IOException {
		writer.beginArray();
		
		for(User item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
