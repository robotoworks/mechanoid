package com.robotoworks.mechanoid.content;

import com.robotoworks.mechanoid.util.Closeables;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class ProviderUtils {
	private ProviderUtils(){}
	
    public static int delete(Context context, Uri uri) {
        ContentResolver resolver = context.getContentResolver();
        return resolver.delete(uri, null, null);
    }
    
    public static int delete(Context context, Uri uri, String where, String[] selectionArgs) {
    	ContentResolver resolver = context.getContentResolver();
    	return resolver.delete(uri, where, selectionArgs);
    }
    
    public static boolean isEmpty(Context context, Uri uri) {
    	return getCount(context, uri) == 0;
    }
    
    public static int getCount(Context context, Uri uri) {
    	ContentResolver resolver = context.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[]{"count(*)"}, null, null, null);
    		
    		int count = 0;
    		
    		if (c.moveToFirst()) {
    			count = c.getInt(0);
    		}
    		
    		return count;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
    
    public static int getCount(Context context, Uri uri, String selection, String[] selectionArgs) {
    	ContentResolver resolver = context.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[]{"count(*)"}, selection, selectionArgs, null);
    		
    		int count = 0;
    		
    		if (c.moveToFirst()) {
    			count = c.getInt(0);
    		}
    		
    		return count;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
    
    public static int getCount(Context context, Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = context.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[]{"count(" + column + ")"}, selection, selectionArgs, null);
    		
    		int count = 0;
    		
    		if (c.moveToFirst()) {
    			count = c.getInt(0);
    		}
    		
    		return count;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
    
    public static String getString(Context context, Uri uri, String column, String selection, String[] selectionArgs) {
        ContentResolver resolver = context.getContentResolver();
        
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
    
    public static long getLong(Context context, Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = context.getContentResolver();
    	
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
    
    public static int getInt(Context context, Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = context.getContentResolver();
    	
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
    
    public static double getDouble(Context context, Uri uri, String column, String selection, String[] selectionArgs) {
    	ContentResolver resolver = context.getContentResolver();
    	
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
