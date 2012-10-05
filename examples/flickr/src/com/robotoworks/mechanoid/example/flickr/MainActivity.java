package com.robotoworks.mechanoid.example.flickr;

import com.robotoworks.mechanoid.example.flickr.content.FlickrContract;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ContentResolver resolver = getContentResolver();
        
        // Insert a new interestingness record
        Uri newInterestingessUri = resolver.insert(
        		FlickrContract.Interestingness.CONTENT_URI, 
        		FlickrContract.Interestingness.createContentValues(
        				"123", "123", "123", "123", 1, "Lorem Ipsum", 0, 0, 0));
        
        // Retrieve the newly created record
        String[] projection = {
        	FlickrContract.Interestingness._ID,
        	FlickrContract.Interestingness.OWNER,
        	FlickrContract.Interestingness.TITLE
        };
        
        Cursor cursor = resolver.query(newInterestingessUri, projection, null, null, null);
        
        cursor.moveToFirst();
        
        long id = cursor.getLong(0);
        String owner = cursor.getString(1);
        String title = cursor.getString(2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
