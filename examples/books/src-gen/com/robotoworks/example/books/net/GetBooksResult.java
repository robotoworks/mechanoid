package com.robotoworks.example.books.net;


import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import java.io.IOException;
import com.robotoworks.mechanoid.net.ServiceResult;
import java.io.InputStream;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetBooksResult extends ServiceResult {
	private List<Book> books;
	public List<Book> getBooks(){
		return this.books;
	}
	
	public GetBooksResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
			this.books = new ArrayList<Book>();
			provider.get(Book.class).readList(reader, this.books);
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
