package com.robotoworks.example.ghissues.net;

public class Label {
    
        public static final String KEY_URL = "url";
        public static final String KEY_NAME = "name";
        public static final String KEY_COLOR = "color";

	private String url;
	private String name;
	private String color;
	
	public String getUrl(){
		return url;
	}
	public void setUrl(String value){
		this.url = value;
	}
	public String getName(){
		return name;
	}
	public void setName(String value){
		this.name = value;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String value){
		this.color = value;
	}
}
