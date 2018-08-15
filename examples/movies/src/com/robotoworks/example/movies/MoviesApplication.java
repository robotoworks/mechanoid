package com.robotoworks.example.movies;

import android.app.Application;

import com.robotoworks.example.movies.net.MoviesApiClient;
import com.robotoworks.mechanoid.Mechanoid;

public class MoviesApplication extends Application {

    protected MoviesApiClient mMoviesApiClient;

    public static MoviesApplication get() {
        return (MoviesApplication) Mechanoid.getApplicationContext();
    }

    public static MoviesApiClient getMoviesApiClient() {
        return get().mMoviesApiClient;
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
}
