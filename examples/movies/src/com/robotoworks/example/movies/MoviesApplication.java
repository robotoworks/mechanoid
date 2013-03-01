package com.robotoworks.example.movies;

import com.robotoworks.example.movies.net.MoviesApiClient;
import com.robotoworks.mechanoid.Mechanoid;

import android.app.Application;

public class MoviesApplication extends Application {
	
	protected MoviesApiClient mMoviesApiClient;

	public static MoviesApplication get() {
		return (MoviesApplication) Mechanoid.getApplicationContext();
	}

	@Override
	public void onCreate() {
		super.onCreate();
		
		Mechanoid.init(this);
		
		createMoviesApiClient();
	}

	protected void createMoviesApiClient() {
		mMoviesApiClient = new MoviesApiClient(BuildConfig.DEBUG);
	}
	
	public static MoviesApiClient getMoviesApiClient() {
		return get().mMoviesApiClient;
	}	
}
