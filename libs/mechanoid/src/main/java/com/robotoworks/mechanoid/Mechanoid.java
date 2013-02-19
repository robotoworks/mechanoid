/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;

/**
 * <p>Provides a means to initialize Mechanoid in an Android application, see {@link #init(Context)} for
 * more details.</p>
 */
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
	
	/**
	 * <p>Initialize Mechanoid, this should be the very first thing called in onCreate of an
	 * Android application implementation.</p>
	 * 
	 * @param context
	 */
	public static void init(Context context) {
		if(sInstance == null) {
			sInstance = new Mechanoid(context);
		}
	}
}
