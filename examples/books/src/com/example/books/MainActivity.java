package com.example.books;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.impl.client.DefaultHttpClient;

import com.example.books.net.Book;
import com.example.books.net.BookService;
import com.example.books.net.CreateBookRequest;
import com.example.books.net.CreateBookResponse;
import com.example.books.net.GetBooksRequest;
import com.example.books.net.GetBooksResponse;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.TransformException;

import android.os.Bundle;
import android.provider.Browser.BookmarkColumns;
import android.app.Activity;
import android.util.JsonReader;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			doRequest();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doRequest() throws Exception {

		BookService service = new BookService();

		Book book = new Book();
		book.setAuthor("Eiji Yoshikawa");
		book.setTitle("Musashi");

		Response<CreateBookResponse> response = service
				.createBook(new CreateBookRequest(book));

		if (response.getStatus() != 200) {
			throw new Exception("Invalid response!");
		}

		CreateBookResponse content = response.parse();

		int newBookId = content.getBookId();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
