package com.robotoworks.example.ghissues;

import android.app.Application;

import com.robotoworks.mechanoid.Mechanoid;

public class GithubIssuesApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Mechanoid.init(this);
    }
}
