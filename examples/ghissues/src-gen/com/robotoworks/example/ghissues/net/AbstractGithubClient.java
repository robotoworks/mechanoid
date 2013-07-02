package com.robotoworks.example.ghissues.net;


import com.robotoworks.mechanoid.net.Parser;
import java.io.IOException;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceException;
import java.io.InputStream;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;

public abstract class AbstractGithubClient extends ServiceClient {
	private static final String LOG_TAG = "GithubClient";
	
	protected static final String DEFAULT_BASE_URL = "https://api.github.com";
	
	@Override
	protected String getLogTag() {
		return LOG_TAG;
	}
	
	@Override
	protected JsonEntityWriterProvider createWriterProvider() {
		return new DefaultGithubClientWriterProvider();
	}
	
	@Override
	protected JsonEntityReaderProvider createReaderProvider() {
		return new DefaultGithubClientReaderProvider();
	}
	
	public AbstractGithubClient(String baseUrl, boolean debug){
		super(baseUrl, debug);
		
	}
	
	public Response<GetIssuesForRepositoryResult> getIssuesForRepository(GetIssuesForRepositoryRequest request)
	  throws ServiceException {
		
		Parser<GetIssuesForRepositoryResult> parser = new Parser<GetIssuesForRepositoryResult>() {
			public GetIssuesForRepositoryResult parse(InputStream inStream) throws IOException {
				return new GetIssuesForRepositoryResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
}
