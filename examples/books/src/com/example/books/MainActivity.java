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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
