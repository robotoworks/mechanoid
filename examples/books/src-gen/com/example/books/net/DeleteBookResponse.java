package com.example.books.net;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class DeleteBookResponse extends BookResponseBase {
	
	public DeleteBookResponse(TransformerProvider provider, InputStream inStream) throws TransformException {
		JsonReader source = null;
		try {
			if(inStream != null) {
				source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
		
			DeleteBookResponse target = this;
			
		
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("success")) {
					target.setSuccess(source.nextBoolean());
				}
				else if(name.equals("status_message")) {
					target.setStatusMessage(source.nextString());
				}
			}
			
			source.endObject();

			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(source);
		}
	}
}
