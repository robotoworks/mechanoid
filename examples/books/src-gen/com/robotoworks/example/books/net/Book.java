package com.robotoworks.example.books.net;

public class Book {
	private long id;
	private String title;
	private String description;
	
	public long getId(){
		return id;
	}
	public void setId(long value){
		this.id = value;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String value){
		this.title = value;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String value){
		this.description = value;
	}
}
