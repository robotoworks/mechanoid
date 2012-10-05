package com.example.books.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.util.Streams;
import org.json.JSONObject;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class GetBookResponse  {
	private Book book;
	public Book getBook(){
		return this.book;
	}
	
	public GetBookResponse(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
		
		try {
			if(inStream != null){
				String content = Streams.readAllText(inStream);
				JSONObject source = new JSONObject(content);
				this.book = transformerProvider.get(BookInputTransformer.class).transform(source);
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	}
}
