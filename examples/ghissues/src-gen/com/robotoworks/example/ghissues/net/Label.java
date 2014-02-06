package com.robotoworks.example.ghissues.net;

import android.content.ContentValues;
import com.robotoworks.mechanoid.db.ContentValuesUtil;
import java.util.Map;

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
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();
	    
            ContentValuesUtil.putMapped(KEY_URL, map, values, url);
            ContentValuesUtil.putMapped(KEY_NAME, map, values, name);
            ContentValuesUtil.putMapped(KEY_COLOR, map, values, color);

        return values;
	}
}
