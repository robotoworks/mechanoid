/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.sqlite;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.content.MechanoidContentProvider;
import com.robotoworks.mechanoid.util.Closeables;

public class SQuery {
	public interface Op {
		String EQ = " = ";
		String NEQ = " != ";
		String GT = " > ";
		String LT = " < ";
		String GTEQ = " >= ";
		String LTEQ = " <= ";
		String LIKE = " LIKE ";
		String IS = " IS ";
		String ISNOT = " IS NOT ";
		String REGEXP = " REGEXP ";
	}
	
	private static final String AND = " AND ";
	private static final String OR = " OR ";
	
	
	private StringBuilder mBuilder;
	private List<String> mArgs = new ArrayList<String>();
	private String mNextOp = null;
	
	public List<String> getArgs() {
		return mArgs;
	}
	
	public String[] getArgsArray() {
		return mArgs.toArray(new String[mArgs.size()]);
	}
	
	private SQuery() {
		mBuilder = new StringBuilder();
	}
	
	public static SQuery newQuery() {
		return new SQuery();
	}
	
	public SQuery expr(String column, String op, String arg) {
		ensureOp();
		mBuilder.append(column).append(op).append("?");
		mArgs.add(arg);
		mNextOp = null;
		
		return this;
	}
	
	public SQuery expr(SQuery builder) {

		List<String> args = builder.getArgs();
		
		
		if(args.size() > 0) {
			ensureOp();
			mBuilder.append("(").append(builder).append(")");
			mArgs.addAll(args);
		}
		
		mNextOp = null;
		
		return this;
	}
	
	public SQuery expr(String column, String op, boolean arg) {
		return expr(column, op, arg ? "1" : "0");
	}
	
	public SQuery expr(String column, String op, int arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	public SQuery expr(String column, String op, long arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	public SQuery expr(String column, String op, float arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	public SQuery expr(String column, String op, double arg) {
		return expr(column, op, String.valueOf(arg));
	}
	

	
	public SQuery opt(String column, String op, String arg) {
		if(arg == null) {
			return this;
		}
		
		return expr(column, op, arg);
	}
		
	public SQuery opt(String column, String op, int arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, String.valueOf(arg));
	}
	
	public SQuery opt(String column, String op, boolean arg) {
		if(!arg) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SQuery opt(String column, String op, long arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SQuery opt(String column, String op, float arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SQuery opt(String column, String op, double arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SQuery append(String query, String... args) {

		if(query != null && query.length() > 0) {
			ensureOp();
	
			mBuilder.append(query);
	
			if(args != null && args.length > 0) {
				for(String arg : args) {
					mArgs.add(arg);
				}
			}
			
			mNextOp = null;
		}
		
		return this;
	}
	
	public SQuery and() {
		mNextOp = AND;
		
		return this;
	}
	
	public SQuery or() {
		mNextOp = OR;
		
		return this;
	}

	private void ensureOp() {
		if(mBuilder.length() == 0) {
			return;
		}
		
		if(mNextOp == null) {
			mBuilder.append(AND);
		} else {
			mBuilder.append(mNextOp);
			mNextOp = null;
		}
	}
	
	@Override
	public String toString() {
		return mBuilder.toString();
	}

	public Cursor query(SQLiteDatabase db, String table, String[] projection, String orderBy) {
		return db.query(table, projection, mBuilder.toString(), getArgsArray(), null, null, orderBy);
	}
		
	public int firstInt(SQLiteDatabase db, String table, String column) {
		return firstInt(db, table, column, null);
	}
	
	public int firstInt(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		int value = 0;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getInt(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public long firstLong(SQLiteDatabase db, String table, String column) {
		return firstLong(db, table, column, null);
	}
	
	public long firstLong(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		long value = 0;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getLong(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public double firstDouble(SQLiteDatabase db, String table, String column) {
		return firstDouble(db, table, column, null);
	}
	
	public double firstDouble(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		double value = 0;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getDouble(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public float firstFloat(SQLiteDatabase db, String table, String column) {
		return firstFloat(db, table, column, null);
	}
	
	public float firstFloat(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		float value = 0;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getFloat(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public short firstShort(SQLiteDatabase db, String table, String column) {
		return firstShort(db, table, column, null);
	}
	
	public short firstShort(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		short value = 0;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getShort(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public byte[] firstBlob(SQLiteDatabase db, String table, String column) {
		return firstBlob(db, table, column, null);
	}
	
	public byte[] firstBlob(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		byte[] value = null;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getBlob(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public boolean firstBoolean(SQLiteDatabase db, String table, String column) {
		return firstBoolean(db, table, column, null);
	}
	
	public boolean firstBoolean(SQLiteDatabase db, String table, String column, String orderBy) {
		return firstShort(db, table, column, orderBy) > 0;
	}
	
	public String firstString(SQLiteDatabase db, String table, String column) {
		return firstString(db, table, column, null);
	}
	
	public String firstString(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		String value = null;
		try {
			cursor = query(db, table, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getString(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
		
	public int update(SQLiteDatabase db, String table, ContentValues values) {
		return db.update(table, values, mBuilder.toString(), getArgsArray());
	}
	
	public int delete(SQLiteDatabase db, String table) {
		return db.delete(table, mBuilder.toString(), getArgsArray());
	}	
	
	public <T extends ActiveRecord> List<T> select(Uri uri, String sortOrder) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		
		List<T> records = provider.selectRecords(uri, this, sortOrder);
		
		return records;
	}
	
	public <T extends ActiveRecord> List<T> select(Uri uri) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		
		List<T> records = provider.selectRecords(uri, this, null);
		
		return records;
	}
	
	public <T extends ActiveRecord> T selectFirst(Uri uri, String sortOrder) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		
		List<T> records = provider.selectRecords(uri, this, sortOrder);
		
		if(records.size() > 0) {
			return records.get(0);
		} else {
			return null;
		}
	}
	
	public <T extends ActiveRecord> T selectFirst(Uri uri) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		
		List<T> records = provider.selectRecords(uri, this, null);
		
		if(records.size() > 0) {
			return records.get(0);
		} else {
			return null;
		}
	}
	
	public Cursor select(Uri uri, String[] projection, String sortOrder) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		return resolver.query(uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public Cursor select(Uri uri, String[] projection) {
		return select(uri, projection, null);
	}
	
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder) {
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.content.CursorLoader createLoader(Uri uri, String[] projection) {
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}

	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder) {
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection) {
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public int firstInt(Uri uri, String column) {
		return firstInt(uri, column, null);
	}
	
	public int firstInt(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		int value = 0;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getInt(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public long firstLong(Uri uri, String column) {
		return firstLong(uri, column, null);
	}
	
	public long firstLong(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		long value = 0;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getLong(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public double firstDouble(Uri uri, String column) {
		return firstDouble(uri, column, null);
	}
	
	public double firstDouble(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		double value = 0;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getDouble(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public float firstFloat(Uri uri, String column) {
		return firstFloat(uri, column, null);
	}
	
	public float firstFloat(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		float value = 0;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getFloat(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public short firstShort(Uri uri, String column) {
		return firstShort(uri, column, null);
	}
	
	public short firstShort(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		short value = 0;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getShort(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public byte[] firstBlob(Uri uri, String column) {
		return firstBlob(uri, column, null);
	}
	
	public byte[] firstBlob(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		byte[] value = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getBlob(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public boolean firstBoolean(Uri uri, String column) {
		return firstBoolean(uri, column, null);
	}
	
	public boolean firstBoolean(Uri uri, String column, String orderBy) {
		return firstShort(uri, column, orderBy) > 0;
	}
	
	public String firstString(Uri uri, String column) {
		return firstString(uri, column, null);
	}
	
	public String firstString(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		String value = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy);
			
			if(cursor.moveToFirst()) {
				value = cursor.getString(0);
			}
			
		} finally {
			Closeables.closeSilently(cursor);
		}
		
		return value;
	}
	
	public int update(Uri uri, ContentValues values) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		return resolver.update(uri, values, toString(), getArgsArray());
	}
	
	public int delete(Uri uri) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		return resolver.delete(uri, toString(), getArgsArray());
	}	
	
    public int count(Uri uri) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
    	
    	Cursor c = null;
    	
    	try {
    		c = resolver.query(uri, new String[]{"count(*)"}, toString(), getArgsArray(), null);
    		
    		int count = 0;
    		
    		if (c.moveToFirst()) {
    			count = c.getInt(0);
    		}
    		
    		return count;
    		
    	} finally {
    		Closeables.closeSilently(c);
    	}
    }
    
    public boolean exists(Uri uri) {
    	return count(uri) > 0;
    }
}
