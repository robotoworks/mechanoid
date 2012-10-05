package com.example.books.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.util.Streams;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class GetBooksResponse  {
	private List<Book> books;
	public List<Book> getBooks(){
		return this.books;
	}
	
	public GetBooksResponse(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
		
		try {
			if(inStream != null){
				String content = Streams.readAllText(inStream);
				JSONArray source = new JSONArray(content);
				this.books = transformerProvider.get(BookListInputTransformer.class).transform(source);
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	}
}
