package com.robotoworks.mechanoid.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.util.Closeables;

public final class ProviderUtils {
	private ProviderUtils(){}
	
    public static int delete(Uri uri) {
        ContentResolver resolver = Mechanoid.getContentResolver();
        return resolver.delete(uri, null, null);
    }
    
    public static int delete(Uri uri, String where, String[] selectionArgs) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
    	return resolver.delete(uri, where, selectionArgs);
    }
    
    public static boolean isEmpty(Uri uri) {
    	return getCount(uri) == 0;
    }
    
    public static int getCount(Uri uri) {
    	return getInt(uri, "count(*)", null, null);
    }
    
    public static int getCount(Uri uri, String selection, String[] selectionArgs) {
    	return getInt(uri, "count(*)", selection, selectionArgs);
    }
    
    public static int getCount(Uri uri, String column, String selection, String[] selectionArgs) {
    	return getInt(uri, "count(" + column + ")", selection, selectionArgs);
    }
    
    public static String getString(Uri uri, String column, String selection, String[] selectionArgs) {
        ContentResolver resolver = Mechanoid.getContentResolver();
        
        Cursor c = null;
        
        try {
	        c = resolver.query(uri, new String[] { column }, selection, selectionArgs, null);
	
	        String value = null;
	
	        if (c.moveToFirst()) {
	            value = c.getString(0);
	        }
	    
	        return value;

        } finally {
        	Closeables.closeSilently(c);
        }
    }
    
    public static long getLong(Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[] { column }, selection, selectionArgs, null);
    		
    		long value = -1;
    		
    		if (c.moveToFirst()) {
    			value = c.getLong(0);
    		}
    		
    		return value;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
    
    public static int getInt(Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[] { column }, selection, selectionArgs, null);
    		
    		int value = -1;
    		
    		if (c.moveToFirst()) {
    			value = c.getInt(0);
    		}
    		
    		return value;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
    
    public static double getDouble(Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[] { column }, selection, selectionArgs, null);
    		
    		double value = -1;
    		
    		if (c.moveToFirst()) {
    			value = c.getDouble(0);
    		}
    		
    		return value;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
}
