package com.robotoworks.example.books.net;

import android.content.ContentValues;
import com.robotoworks.mechanoid.db.ContentValuesUtil;
import java.util.Map;

public class Book {
    
        public static final String KEY_ID = "id";
        public static final String KEY_TITLE = "title";
        public static final String KEY_DESCRIPTION = "description";

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
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();
	    
            ContentValuesUtil.putMapped(KEY_ID, map, values, id);
            ContentValuesUtil.putMapped(KEY_TITLE, map, values, title);
            ContentValuesUtil.putMapped(KEY_DESCRIPTION, map, values, description);

        return values;
	}
}
