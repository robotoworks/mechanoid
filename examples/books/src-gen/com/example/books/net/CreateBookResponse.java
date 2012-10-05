package com.example.books.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.util.Streams;
import org.json.JSONObject;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class CreateBookResponse  {
	private boolean success;
	private String statusMessage;
	private int bookId;
	public boolean isSuccess(){
		return this.success;
	}
	public String getStatusMessage(){
		return this.statusMessage;
	}
	public int getBookId(){
		return this.bookId;
	}
	
	public CreateBookResponse(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
		
		try {
			if(inStream != null){
				String content = Streams.readAllText(inStream);
				JSONObject source = new JSONObject(content);
				if(source.has("success") && !source.isNull("success")) {
					this.success = source.getBoolean("success");
				}
				if(source.has("status_message") && !source.isNull("status_message")) {
					this.statusMessage = source.getString("status_message");
				}
				if(source.has("book_id") && !source.isNull("book_id")) {
					this.bookId = source.getInt("book_id");
				}
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	}
}
