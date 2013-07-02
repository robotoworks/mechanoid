package com.robotoworks.example.ghissues.net;

public class GithubClient extends AbstractGithubClient {
	public GithubClient(){
		super(DEFAULT_BASE_URL, false);
	}

	public GithubClient(boolean debug){
		super(DEFAULT_BASE_URL, debug);
	}
	
	public GithubClient(String baseUrl){
		super(baseUrl, false);
	}
	
	public GithubClient(String baseUrl, boolean debug){
		super(baseUrl, debug);
	}
}
