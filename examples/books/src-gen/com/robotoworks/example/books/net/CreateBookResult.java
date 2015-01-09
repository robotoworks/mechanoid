package com.robotoworks.example.books.net;


import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.net.ServiceResult;
import java.io.InputStream;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.net.JsonReaderUtil;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CreateBookResult extends ServiceResult {
	private boolean success;
	private String statusMessage;
	private int bookId;
	public boolean isSuccess(){
		return this.success;
	}
	public void setSuccess(boolean value){
		this.success = value;
	}
	public String getStatusMessage(){
		return this.statusMessage;
	}
	public void setStatusMessage(String value){
		this.statusMessage = value;
	}
	public int getBookId(){
		return this.bookId;
	}
	public void setBookId(int value){
		this.bookId = value;
	}
	
	public CreateBookResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
		CreateBookResult subject = this;
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
		
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
						
			if(name.equals("status_message")) {
				subject.setStatusMessage(reader.nextString());
			}
			else if(name.equals("success")) {
				subject.setSuccess(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("book_id")) {
				subject.setBookId(reader.nextInt());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
