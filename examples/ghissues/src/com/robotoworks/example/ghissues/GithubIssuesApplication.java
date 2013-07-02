package com.robotoworks.example.ghissues;

import com.robotoworks.mechanoid.Mechanoid;

import android.app.Application;

public class GithubIssuesApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		
		Mechanoid.init(this);
	}
}
