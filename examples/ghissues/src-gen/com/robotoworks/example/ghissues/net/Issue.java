package com.robotoworks.example.ghissues.net;

import java.util.List;
public class Issue {
    
        public static final String KEY_URL = "url";
        public static final String KEY_LABELS_URL = "labels_url";
        public static final String KEY_COMMENTS_URL = "comments_url";
        public static final String KEY_EVENTS_URL = "events_url";
        public static final String KEY_HTML_URL = "html_url";
        public static final String KEY_ID = "id";
        public static final String KEY_NUMBER = "number";
        public static final String KEY_TITLE = "title";
        public static final String KEY_USER = "user";
        public static final String KEY_LABELS = "labels";
        public static final String KEY_STATE = "state";
        public static final String KEY_COMMENTS = "comments";
        public static final String KEY_CREATED_AT = "created_at";
        public static final String KEY_UPDATED_AT = "updated_at";
        public static final String KEY_CLOSED_AT = "closed_at";
        public static final String KEY_BODY = "body";

	private String url;
	private String labelsUrl;
	private String commentsUrl;
	private String eventsUrl;
	private String htmlUrl;
	private long id;
	private long number;
	private String title;
	private User user;
	private List<Label> labels;
	private IssueState state;
	private int comments;
	private String createdAt;
	private String updatedAt;
	private String closedAt;
	private String body;
	
	public String getUrl(){
		return url;
	}
	public void setUrl(String value){
		this.url = value;
	}
	public String getLabelsUrl(){
		return labelsUrl;
	}
	public void setLabelsUrl(String value){
		this.labelsUrl = value;
	}
	public String getCommentsUrl(){
		return commentsUrl;
	}
	public void setCommentsUrl(String value){
		this.commentsUrl = value;
	}
	public String getEventsUrl(){
		return eventsUrl;
	}
	public void setEventsUrl(String value){
		this.eventsUrl = value;
	}
	public String getHtmlUrl(){
		return htmlUrl;
	}
	public void setHtmlUrl(String value){
		this.htmlUrl = value;
	}
	public long getId(){
		return id;
	}
	public void setId(long value){
		this.id = value;
	}
	public long getNumber(){
		return number;
	}
	public void setNumber(long value){
		this.number = value;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String value){
		this.title = value;
	}
	public User getUser(){
		return user;
	}
	public void setUser(User value){
		this.user = value;
	}
	public List<Label> getLabels(){
		return labels;
	}
	public void setLabels(List<Label> value){
		this.labels = value;
	}
	public IssueState getState(){
		return state;
	}
	public void setState(IssueState value){
		this.state = value;
	}
	public int getComments(){
		return comments;
	}
	public void setComments(int value){
		this.comments = value;
	}
	public String getCreatedAt(){
		return createdAt;
	}
	public void setCreatedAt(String value){
		this.createdAt = value;
	}
	public String getUpdatedAt(){
		return updatedAt;
	}
	public void setUpdatedAt(String value){
		this.updatedAt = value;
	}
	public String getClosedAt(){
		return closedAt;
	}
	public void setClosedAt(String value){
		this.closedAt = value;
	}
	public String getBody(){
		return body;
	}
	public void setBody(String value){
		this.body = value;
	}
}
