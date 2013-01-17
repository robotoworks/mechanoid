package com.robotoworks.mechanoid;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;

public class Mechanoid {
	private Context mApplicationContext;
	
	public static Context getApplicationContext() {
		return get().mApplicationContext;
	}
	public static ContentResolver getContentResolver() {
		return get().mApplicationContext.getContentResolver();
	}
	
	public static ComponentName startService(Intent intent) {
		return get().mApplicationContext.startService(intent);
	}
	
	private static Mechanoid sInstance;
	
	
	public static Mechanoid get() {
		if(sInstance == null) {
			throw new MechanoidNotInitializedException();
		}
		return sInstance;
	}
	
	private Mechanoid(Context context){
		mApplicationContext = context.getApplicationContext();
	}
	
	public static void init(Context context) {
		if(sInstance == null) {
			sInstance = new Mechanoid(context);
		}
	}
}
