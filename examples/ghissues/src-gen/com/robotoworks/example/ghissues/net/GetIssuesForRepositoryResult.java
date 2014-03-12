package com.robotoworks.example.ghissues.net;


import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.net.ServiceResult;
import java.io.InputStream;
import com.robotoworks.mechanoid.util.Closeables;
import java.util.ArrayList;
import java.io.BufferedReader;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class GetIssuesForRepositoryResult extends ServiceResult {
	private List<Issue> issues;
	public List<Issue> getIssues(){
		return this.issues;
	}
	
	public GetIssuesForRepositoryResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
			this.issues = new ArrayList<Issue>();
			provider.get(Issue.class).readList(reader, this.issues);
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
