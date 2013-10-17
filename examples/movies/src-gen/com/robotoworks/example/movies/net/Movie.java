package com.robotoworks.example.movies.net;

import android.content.ContentValues;
import com.robotoworks.mechanoid.db.ContentValuesUtil;
import java.util.Map;

public class Movie {
    
        public static final String KEY_TITLE = "title";
        public static final String KEY_DESCRIPTION = "description";
        public static final String KEY_YEAR = "year";

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
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();
	    
            ContentValuesUtil.putMapped(KEY_TITLE, map, values, title);
            ContentValuesUtil.putMapped(KEY_DESCRIPTION, map, values, description);
            ContentValuesUtil.putMapped(KEY_YEAR, map, values, year);

        return values;
	}
}
