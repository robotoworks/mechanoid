package com.example.books.net;

public class Book {
	private int id;
	private String title;
	private String author;
	
	public int getId(){
		return id;
	}
	public void setId(int value){
		this.id = value;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String value){
		this.title = value;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String value){
		this.author = value;
	}
}
