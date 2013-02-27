package com.robotoworks.example.movies.net;

public class Movie {
	private String title;
	private String description;
	private int year;
	
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
	public int getYear(){
		return year;
	}
	public void setYear(int value){
		this.year = value;
	}
}
