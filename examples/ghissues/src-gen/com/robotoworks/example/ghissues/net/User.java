package com.robotoworks.example.ghissues.net;

public class User {
    
        public static final String KEY_LOGIN = "login";
        public static final String KEY_ID = "id";
        public static final String KEY_AVATAR_URL = "avatar_url";
        public static final String KEY_GRAVATAR_ID = "gravatar_id";
        public static final String KEY_URL = "url";
        public static final String KEY_HTML_URL = "html_url";
        public static final String KEY_FOLLOWERS_URL = "followers_url";
        public static final String KEY_FOLLOWING_URL = "following_url";
        public static final String KEY_GISTS_URL = "gists_url";
        public static final String KEY_STARRED_URL = "starred_url";
        public static final String KEY_SUBSCRIPTIONS_URL = "subscriptions_url";
        public static final String KEY_ORGANIZATIONS_URL = "organizations_url";
        public static final String KEY_REPOS_URL = "repos_url";
        public static final String KEY_EVENTS_URL = "events_url";
        public static final String KEY_RECEIVED_EVENTS_URL = "received_events_url";

	private String login;
	private long id;
	private String avatarUrl;
	private String gravatarId;
	private String url;
	private String htmlUrl;
	private String followersUrl;
	private String followingUrl;
	private String gistsUrl;
	private String starredUrl;
	private String subscriptionsUrl;
	private String organizationsUrl;
	private String reposUrl;
	private String eventsUrl;
	private String receivedEventsUrl;
	
	public String getLogin(){
		return login;
	}
	public void setLogin(String value){
		this.login = value;
	}
	public long getId(){
		return id;
	}
	public void setId(long value){
		this.id = value;
	}
	public String getAvatarUrl(){
		return avatarUrl;
	}
	public void setAvatarUrl(String value){
		this.avatarUrl = value;
	}
	public String getGravatarId(){
		return gravatarId;
	}
	public void setGravatarId(String value){
		this.gravatarId = value;
	}
	public String getUrl(){
		return url;
	}
	public void setUrl(String value){
		this.url = value;
	}
	public String getHtmlUrl(){
		return htmlUrl;
	}
	public void setHtmlUrl(String value){
		this.htmlUrl = value;
	}
	public String getFollowersUrl(){
		return followersUrl;
	}
	public void setFollowersUrl(String value){
		this.followersUrl = value;
	}
	public String getFollowingUrl(){
		return followingUrl;
	}
	public void setFollowingUrl(String value){
		this.followingUrl = value;
	}
	public String getGistsUrl(){
		return gistsUrl;
	}
	public void setGistsUrl(String value){
		this.gistsUrl = value;
	}
	public String getStarredUrl(){
		return starredUrl;
	}
	public void setStarredUrl(String value){
		this.starredUrl = value;
	}
	public String getSubscriptionsUrl(){
		return subscriptionsUrl;
	}
	public void setSubscriptionsUrl(String value){
		this.subscriptionsUrl = value;
	}
	public String getOrganizationsUrl(){
		return organizationsUrl;
	}
	public void setOrganizationsUrl(String value){
		this.organizationsUrl = value;
	}
	public String getReposUrl(){
		return reposUrl;
	}
	public void setReposUrl(String value){
		this.reposUrl = value;
	}
	public String getEventsUrl(){
		return eventsUrl;
	}
	public void setEventsUrl(String value){
		this.eventsUrl = value;
	}
	public String getReceivedEventsUrl(){
		return receivedEventsUrl;
	}
	public void setReceivedEventsUrl(String value){
		this.receivedEventsUrl = value;
	}
}
