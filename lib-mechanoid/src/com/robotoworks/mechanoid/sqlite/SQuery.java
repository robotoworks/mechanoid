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

/**
 * <p>Construct content provider/database queries using a fluent API.</p>
 * 
 * <p>To create a new SQuery instance use the factory method {@link SQuery#newQuery()}</p>
 * 
 * <p>Expressions can be chained using the {@link expr()} overloads, by default expressions are AND'd together
 * unless an explicit call is made to {@link or()} or {@link and()} between each expression, eg:-</p>
 * 
 * <pre><code>Cursor cursor = SQuery.newQuery()
 *     .expr(Books.TITLE, Op.LIKE, "A%")
 *     .or()
 *     .expr(Books.TITLE, Op.LIKE, "B%")
 *     .select(Books.CONTENT_URI,
 *         new String[] {
 *             Books._ID,
 *             Books.TITLE
 *         });</code></pre>
 *
 * <p>If a query ends with either {@link or()} or {@link and()} they will not be included when executing the query
 * since it is an error to end a query without the right operand of an expression.</p>
 */
public class SQuery {
	/**
	 * Used to represent Sqlite literal types used in expressions.
	 * 
	 * @see SQuery#NULL
	 * @see SQuery#CURRENT_TIME
	 * @see SQuery#CURRENT_DATE
	 * @see SQuery#CURRENT_TIMESTAMP
	 *
	 */
	public static final class Literal {
		protected final String value;
		
		protected Literal(String value) {
			this.value = value;
		}
	}
	
	/**
	 * Represents the Sqlite literal NULL
	 */
	public static final Literal NULL = new Literal("NULL");
	
	/**
	 * Represents the Sqlite literal CURRENT_TIME
	 */
	public static final Literal CURRENT_TIME = new Literal("CURRENT_TIME");
	
	/**
	 * Represents the Sqlite literal CURRENT_DATE
	 */
	public static final Literal CURRENT_DATE = new Literal("CURRENT_DATE");
	
	/**
	 * Represents the Sqlite literal CURRENT_TIMESTAMP
	 */
	public static final Literal CURRENT_TIMESTAMP = new Literal("CURRENT_TIMESTAMP");
	
	/**
	 * <p>Comparison operator constants used in SQuery expressions.</p>
	 * 
	 * <h2>Example</h2>
	 * <pre><code>BooksRecord record = SQuery.newQuery()
	 *     .expr(Books.TITLE, Op.EQ, "Musashi")
	 *     .selectFirst(Books.CONTENT_URI);
	 * </code></pre>
	 * 
	 * @see SQuery#expr(String, String, boolean)
	 * @see SQuery#expr(String, String, double)
	 * @see SQuery#expr(String, String, float)
	 * @see SQuery#expr(String, String, int)
	 * @see SQuery#expr(String, String, long)
	 * @see SQuery#expr(String, String, String)
	 * @see SQuery#expr(String, String, Literal)
	 */
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
	
	/**
	 * @return A list of expression arguments added so far
	 */
	public List<String> getArgs() {
		return mArgs;
	}
	
	/**
	 * @return An array of expression arguments added so far
	 */
	public String[] getArgsArray() {
		return mArgs.toArray(new String[mArgs.size()]);
	}
	
	private SQuery() {
		mBuilder = new StringBuilder();
	}
	
	public static SQuery newQuery() {
		return new SQuery();
	}
	
	/**
	 * <p>Add an expression to the end of the currently added expressions, if
	 * no previous boolean operator has been given ({@link and()} or {@link or()}) then
	 * AND will be used by default when appending this expression.</p>
	 * @param column Usually the column on the left side of the expression
	 * @param op The operator, see {@link Op} for available operators
	 * @param arg An argument for the right side of the expression, this will be added to
	 * an array of expressions to be added as a bind argument.
	 * @return
	 */
	public SQuery expr(String column, String op, String arg) {
		ensureOp();
		mBuilder.append(column).append(op).append("?");
		mArgs.add(arg);
		mNextOp = null;
		
		return this;
	}

	/**
	 * <p>Add an expression to the end of the currently added expressions, if
	 * no previous boolean operator has been given ({@link and()} or {@link or()}) then
	 * AND will be used by default when appending this expression.</p>
	 * @param column Usually the column on the left side of the expression
	 * @param op The operator, see {@link Op} for available operators
	 * @param arg An argument of type {@link Literal}, can be {@link SQuery#NULL}, 
	 * {@link SQuery#CURRENT_TIME}, {@link SQuery#CURRENT_DATE} or {@link SQuery#CURRENT_TIMESTAMP}.
	 * @return
	 */
	public SQuery expr(String column, String op, Literal arg) {
		ensureOp();
		
		mBuilder.append(column).append(op).append(" ").append(arg.value);
		mNextOp = null;
		
		return this;
	}
	
	/**
	 * <p>An ISNULL expression on the given column name, ie:- column ISNULL</p>
	 * @param column Usually the column name
	 * @return
	 */
	public SQuery exprIsNull(String column) {
		ensureOp();
		mBuilder.append(column).append(" ISNULL");
		mNextOp = null;
		
		return this;
	}
	
	/**
	 * A NOTNULL expression on the given column name, ie:- NOTNULL
	 * @param column Usually the colum name
	 * @return
	 */
	public SQuery exprNotNull(String column) {
		ensureOp();
		mBuilder.append(column).append(" NOTNULL");
		mNextOp = null;
		
		return this;
	}
	
	/**
	 * Add a sub-expression to this expression, the sub-expression will be enclosed in brackets, ie:-
	 * a=? AND (b=?) AND c=? where the expression contained in the brackets is the sub-expression
	 * @param builder A query to use as a sub-expression
	 * @return
	 */
	public SQuery expr(SQuery query) {

		List<String> args = query.getArgs();
		
		
		if(args.size() > 0) {
			ensureOp();
			mBuilder.append("(").append(query).append(")");
			mArgs.addAll(args);
		}
		
		mNextOp = null;
		
		return this;
	}
	
	/**
	 * @see SQuery#expr(String, String, String)
	 */
	public SQuery expr(String column, String op, boolean arg) {
		return expr(column, op, arg ? "1" : "0");
	}

	/**
	 * @see SQuery#expr(String, String, String)
	 */
	public SQuery expr(String column, String op, int arg) {
		return expr(column, op, String.valueOf(arg));
	}
	
	/**
	 * @see SQuery#expr(String, String, String)
	 */	
	public SQuery expr(String column, String op, long arg) {
		return expr(column, op, String.valueOf(arg));
	}

	/**
	 * @see SQuery#expr(String, String, String)
	 */
	public SQuery expr(String column, String op, float arg) {
		return expr(column, op, String.valueOf(arg));
	}

	/**
	 * @see SQuery#expr(String, String, String)
	 */
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
	
	/**
	 * <p>Select records using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @param sortOrder The order by clause
	 * @return The results as active records
	 */
	public <T extends ActiveRecord> List<T> select(Uri uri, String sortOrder) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		
		List<T> records = provider.selectRecords(uri, this, sortOrder);
		
		return records;
	}
	
	/**
	 * <p>Select records using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @return The results as active records
	 */	
	public <T extends ActiveRecord> List<T> select(Uri uri) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		
		List<T> records = provider.selectRecords(uri, this, null);
		
		return records;
	}

	/**
	 * <p>Select the first record from the results of using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @param sortOrder The order by clause
	 * @return The results as active records
	 */	
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
	
	/**
	 * <p>Select the first record from the results of using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @return The results as active records
	 */		
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
	
	public Cursor select(Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return resolver.query(uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public Cursor select(Uri uri, String[] projection) {
		return select(uri, projection, null);
	}
	
	public Cursor select(Uri uri, String[] projection, boolean enableNotifications) {
		return select(uri, projection, null, enableNotifications);
	}
	
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder) {
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
		
	public android.content.CursorLoader createLoader(Uri uri, String[] projection) {
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}

	public android.content.CursorLoader createLoader(Uri uri, String[] projection, boolean enableNotifications) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder) {
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
			
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection) {
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, boolean enableNotifications) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public int firstInt(Uri uri, String column) {
		return firstInt(uri, column, null);
	}
	
	public int firstInt(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		int value = 0;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
			cursor = select(uri, new String[] { column }, orderBy, false);
			
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
	
	public int update(Uri uri, ContentValues values, boolean notifyChange) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(notifyChange)).build();
		
		ContentResolver resolver = Mechanoid.getContentResolver();
		return resolver.update(uri, values, toString(), getArgsArray());
	}
	
	public int delete(Uri uri) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		return resolver.delete(uri, toString(), getArgsArray());
	}	
	
	public int delete(Uri uri, boolean notifyChange) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(notifyChange)).build();

		ContentResolver resolver = Mechanoid.getContentResolver();
		return resolver.delete(uri, toString(), getArgsArray());
	}	
	
    public int count(Uri uri) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
    	
    	Cursor c = null;
    	
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, "false").build();
    	
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
