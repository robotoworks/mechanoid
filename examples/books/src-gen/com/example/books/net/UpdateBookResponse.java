package com.example.books.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.util.Streams;
import org.json.JSONObject;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class UpdateBookResponse  {
	private boolean success;
	private String statusMessage;
	public boolean isSuccess(){
		return this.success;
	}
	public String getStatusMessage(){
		return this.statusMessage;
	}
	
	public UpdateBookResponse(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
		
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
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	}
}
