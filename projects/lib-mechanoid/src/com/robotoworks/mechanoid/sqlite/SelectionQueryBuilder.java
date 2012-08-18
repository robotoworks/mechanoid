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

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class SelectionQueryBuilder {
	public interface Op {
		public String EQ = " = ";
		public String NEQ = " != ";
		public String GT = " > ";
		public String LT = " < ";
		public String GTEQ = " >= ";
		public String LTEQ = " <= ";
		public String LIKE = " LIKE ";
		public String IS = " IS ";
		public String ISNOT = " IS NOT ";
		public String REGEXP = " REGEXP ";
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
		return mArgs.toArray(new String[0]);
	}
	
	public SelectionQueryBuilder() {
		mBuilder = new StringBuilder();
	}
	
	public SelectionQueryBuilder expr(String column, String op, String arg) {
		ensureOp();
		mBuilder.append(column).append(op).append("?");
		mArgs.add(arg);
		mNextOp = null;
		
		return this;
	}
	
	public SelectionQueryBuilder expr(SelectionQueryBuilder builder) {

		List<String> args = builder.getArgs();
		
		
		if(args.size() > 0) {
			ensureOp();
			mBuilder.append("(").append(builder).append(")");
			mArgs.addAll(args);
		}
		
		mNextOp = null;
		
		return this;
	}
	
	public SelectionQueryBuilder expr(String column, String op, boolean arg) {
		return expr(column, op, arg ? "1" : "0");
	}
	
	public SelectionQueryBuilder expr(String column, String op, int arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	public SelectionQueryBuilder expr(String column, String op, long arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	public SelectionQueryBuilder expr(String column, String op, float arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	public SelectionQueryBuilder expr(String column, String op, double arg) {
		return expr(column, op, String.valueOf(arg));
	}
	

	
	public SelectionQueryBuilder opt(String column, String op, String arg) {
		if(arg == null) {
			return this;
		}
		
		return expr(column, op, arg);
	}
		
	public SelectionQueryBuilder opt(String column, String op, int arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, String.valueOf(arg));
	}
	
	public SelectionQueryBuilder opt(String column, String op, boolean arg) {
		if(!arg) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SelectionQueryBuilder opt(String column, String op, long arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SelectionQueryBuilder opt(String column, String op, float arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SelectionQueryBuilder opt(String column, String op, double arg) {
		if(arg == 0) {
			return this;
		}
		return expr(column, op, arg);
	}
	
	public SelectionQueryBuilder append(String query, String... args) {

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
	
	public SelectionQueryBuilder and() {
		mNextOp = AND;
		
		return this;
	}
	
	public SelectionQueryBuilder or() {
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
		
	public int update(SQLiteDatabase db, String table, ContentValues values) {
		return db.update(table, values, mBuilder.toString(), getArgsArray());
	}
	
	public int delete(SQLiteDatabase db, String table) {
		return db.delete(table, mBuilder.toString(), getArgsArray());
	}	
}
