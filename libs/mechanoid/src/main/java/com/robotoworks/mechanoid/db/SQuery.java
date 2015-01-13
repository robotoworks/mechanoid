/*
 * Copyright 2013 Robotoworks Limited
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robotoworks.mechanoid.db;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.annotation.TargetApi;
import android.content.AsyncQueryHandler;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;

import com.robotoworks.mechanoid.Mechanoid;
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
		
		public Literal(String value) {
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
		/**
		 * The equals (=) operator
		 */
		String EQ = " = ";
		/**
		 * The not equal (!=) operator
		 */
		String NEQ = " != ";
		/**
		 * The greater than (>) operator
		 */
		String GT = " > ";
		/**
		 * The less than (<) operator
		 */
		String LT = " < ";
		/**
		 * The greater than or equal (>=) operator
		 */
		String GTEQ = " >= ";
		/**
		 * The less than or equal (<=) operator
		 */
		String LTEQ = " <= ";
		/**
		 * The LIKE operator
		 */
		String LIKE = " LIKE ";
		/**
		 * The IS operator
		 */
		String IS = " IS ";
		/**
		 * The IS NOT operator
		 */
		String ISNOT = " IS NOT ";
		/**
		 * The REGEXP operator
		 */
		String REGEXP = " REGEXP ";
	}
	
	/**
	 * The AND operator
	 */
	private static final String AND = " AND ";
	
	/**
	 * The OR operator
	 */
	private static final String OR = " OR ";
	
	
	private StringBuilder mBuilder;
	private List<String> mArgs = new ArrayList<String>();
	private String mNextOp = null;

	private MechanoidContentProvider mProvider;
	
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
	
	public SQuery(MechanoidContentProvider provider) {
		this();
		mProvider = provider;
	}

	public static SQuery newQuery() {
		return new SQuery();
	}
	
	/**
	 * <p>Force this query to use the given content provider when
	 * doing active record queries, ie:- {@link #select(Uri)}, {@link #selectFirst(Uri)}, etc.</p>
	 * 
	 * @param provider The provider to use when performing active record
	 * queries
	 */
	public static SQuery newQuery(MechanoidContentProvider provider) {
		return new SQuery(provider);
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
		
		ensureOp();
		mBuilder.append("(").append(query).append(")");
		
		if(args.size() > 0) {
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

	public Cursor query(SQLiteDatabase db, String table, String[] projection, String orderBy, String groupBy) {
		return db.query(table, projection, mBuilder.toString(), getArgsArray(), groupBy, null, orderBy);
	}
		
	public int firstInt(SQLiteDatabase db, String table, String column) {
		return firstInt(db, table, column, null);
	}
	
	public int firstInt(SQLiteDatabase db, String table, String column, String orderBy) {
		Cursor cursor = null;
		int value = 0;
		try {
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
			cursor = query(db, table, new String[] { column }, orderBy, null);
			
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
	public <T extends ActiveRecord> List<T> select(Uri uri) {
		MechanoidContentProvider provider = getContentProvider(uri);

		List<T> records = provider.selectRecords(uri, this, null);

		return records;
	}

	/**
	 * <p>Select records using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @param sortOrder The order by clause
	 * @return The results as active records
	 */
	public <T extends ActiveRecord> List<T> select(Uri uri, String sortOrder) {
		MechanoidContentProvider provider = getContentProvider(uri);
		
		List<T> records = provider.selectRecords(uri, this, sortOrder);
		
		return records;
	}
	
	/**
	 * <p>Select records using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @param groupBy The columns or expression to group by
	 * @return The results as active records
	 */	
	public <T extends ActiveRecord> List<T> select(Uri uri, String sortOrder, String... groupBy) {
		uri = appendGroupByToUri(uri, groupBy);
		MechanoidContentProvider provider = getContentProvider(uri);
		
		List<T> records = provider.selectRecords(uri, this, sortOrder);
		
		return records;
	}
	
	private Uri appendGroupByToUri(Uri uri, String... groupBy) {
		if(groupBy == null || groupBy.length == 0)
			return uri;
		StringBuilder builder = new StringBuilder();

		for(int i = 0; i < groupBy.length; i++) {
			if(TextUtils.isEmpty(groupBy[i])) {
				continue;
			}
			builder.append(groupBy[i]);
			if(i < groupBy.length - 1) {
				builder.append(", ");
			}
		}
		return uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_GROUP_BY, builder.toString()).build();
	}

	/**
	 * Select records based on this query
	 * @param uri The ContentProvider Uri to query for
	 * @param keyColumnName The column that will be used as the key for the resulting map
	 * @return A map of results using the value of keyColumnName as the map key
	 */
	public <T extends ActiveRecord> Map<String, T> selectMap(Uri uri, String keyColumnName, String... groupBy) {
		uri = appendGroupByToUri(uri, groupBy);
		MechanoidContentProvider provider = getContentProvider(uri);
		
		Map<String, T> records = provider.selectRecordMap(uri, this, keyColumnName);
		
		return records;
	}

	/**
	 * <p>Select the first record from the results of using this query</p>
	 * @param uri The ContentProvider Uri to query for
	 * @param sortOrder The order by clause
	 * @return The results as active records
	 */	
	public <T extends ActiveRecord> T selectFirst(Uri uri, String sortOrder) {
		MechanoidContentProvider provider = getContentProvider(uri);
		
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
		MechanoidContentProvider provider = getContentProvider(uri);
		
		List<T> records = provider.selectRecords(uri, this, null);
		
		if(records.size() > 0) {
			return records.get(0);
		} else {
			return null;
		}
	}

	private MechanoidContentProvider getContentProvider(Uri uri) {
		
		if(mProvider != null) {
			return mProvider;
		}
		
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		ContentProviderClient client = resolver.acquireContentProviderClient(uri);
		
		MechanoidContentProvider provider = (MechanoidContentProvider) client.getLocalContentProvider();
		return provider;
	}
	
	public Cursor select(Uri uri, String[] projection, String sortOrder) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		return resolver.query(uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, String sortOrder) {
		return mAsync.startQuery(callback, uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public Cursor select(Uri uri, String[] projection, String sortOrder, String... groupBy) {
		ContentResolver resolver = Mechanoid.getContentResolver();

		uri = appendGroupByToUri(uri, groupBy);

		return resolver.query(uri, projection, toString(), getArgsArray(), sortOrder);
	}

	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, String sortOrder, String... groupBy) {
		uri = appendGroupByToUri(uri, groupBy);
		return mAsync.startQuery(callback, uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public Cursor select(Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return resolver.query(uri, projection, toString(), getArgsArray(), sortOrder);
	}

	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {

		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return mAsync.startQuery(callback, uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public Cursor select(Uri uri, String[] projection, String sortOrder, boolean enableNotifications, String... groupBy) {
		ContentResolver resolver = Mechanoid.getContentResolver();

		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		uri = appendGroupByToUri(uri, groupBy);

		return resolver.query(uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, String sortOrder, boolean enableNotifications, String... groupBy) {

		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		uri = appendGroupByToUri(uri, groupBy);
		return mAsync.startQuery(callback, uri, projection, toString(), getArgsArray(), sortOrder);
	}

	public Cursor select(Uri uri, String[] projection) {
		return select(uri, projection, (String) null);
	}
	
	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection) {
		return selectAsync(callback, uri, projection, (String) null);
	}

	public Cursor select(Uri uri, String[] projection, String... groupBy) {
		return select(uri, projection, null, groupBy);
	}
	
	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, String... groupBy) {
		return selectAsync(callback, uri, projection, null, groupBy);
	}
	
	public Cursor select(Uri uri, String[] projection, boolean enableNotifications) {
		return select(uri, projection, null, enableNotifications);
	}

	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, boolean enableNotifications) {
		return selectAsync(callback, uri, projection, null, enableNotifications);
	}
	
	public Cursor select(Uri uri, String[] projection, boolean enableNotifications, String... groupBy) {
		return select(uri, projection, null, enableNotifications, groupBy);
	}
	
	public AsyncQuery selectAsync(AsyncQueryCallback callback, Uri uri, String[] projection, boolean enableNotifications, String... groupBy) {
		return selectAsync(callback, uri, projection, null, enableNotifications, groupBy);
	}
	
	public Cursor selectFirst(Uri uri, String[] projection) {
		Uri uriWithLimit = uri.buildUpon()
			.appendQueryParameter(MechanoidContentProvider.PARAM_LIMIT, "1")
			.appendQueryParameter(MechanoidContentProvider.PARAM_OFFSET, "0")
			.build();
		
		return select(uriWithLimit, projection, (String) null);
	}
	
	public AsyncQuery selectFirstAsync(AsyncQueryCallback callback, Uri uri, String[] projection) {
		Uri uriWithLimit = uri.buildUpon()
			.appendQueryParameter(MechanoidContentProvider.PARAM_LIMIT, "1")
			.appendQueryParameter(MechanoidContentProvider.PARAM_OFFSET, "0")
			.build();
		
		return selectAsync(callback, uriWithLimit, projection, (String) null);
	}
	
	public Cursor selectWithLimit(Uri uri, String[] projection, int limit, int offset) {
		Uri uriWithLimit = uri.buildUpon()
			.appendQueryParameter(MechanoidContentProvider.PARAM_LIMIT, String.valueOf(limit))
			.appendQueryParameter(MechanoidContentProvider.PARAM_OFFSET, String.valueOf(offset))
			.build();
		
		return select(uriWithLimit, projection, (String) null);
	}
	
	public AsyncQuery selectWithLimitAsync(AsyncQueryCallback callback, Uri uri, String[] projection, int limit, int offset) {
		Uri uriWithLimit = uri.buildUpon()
			.appendQueryParameter(MechanoidContentProvider.PARAM_LIMIT, String.valueOf(limit))
			.appendQueryParameter(MechanoidContentProvider.PARAM_OFFSET, String.valueOf(offset))
			.build();
		
		return selectAsync(callback, uriWithLimit, projection, (String) null);
	}
	
	@TargetApi(11)
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder) {
		if(Build.VERSION.SDK_INT < 11) {
			return null;
		}
		
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	@TargetApi(11)
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder, String... groupBy) {
		if(Build.VERSION.SDK_INT < 11) {
			return null;
		}

		uri = appendGroupByToUri(uri, groupBy);

		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}

	@TargetApi(11)
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {
		if(Build.VERSION.SDK_INT < 11) {
			return null;
		}
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	@TargetApi(11)
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, String sortOrder, boolean enableNotifications, String... groupBy) {
		if(Build.VERSION.SDK_INT < 11) {
			return null;
		}

		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		uri = appendGroupByToUri(uri, groupBy);

		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}

	@TargetApi(11)	
	public android.content.CursorLoader createLoader(Uri uri, String[] projection) {
		if(Build.VERSION.SDK_INT < 11) {
			return null;
		}
		
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	@TargetApi(11)
	public android.content.CursorLoader createLoader(Uri uri, String[] projection, boolean enableNotifications, String... groupBy) {
		if(Build.VERSION.SDK_INT < 11) {
			return null;
		}
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		uri = appendGroupByToUri(uri, groupBy);
		
		return new android.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder) {
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder, String... groupBy) {
		uri = appendGroupByToUri(uri, groupBy);
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}

	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder, boolean enableNotifications) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
			
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, String sortOrder, boolean enableNotifications, String... groupBy) {

		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		uri = appendGroupByToUri(uri, groupBy);
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), sortOrder);
	}

	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection) {
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, boolean enableNotifications) {
		
		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		
		return new android.support.v4.content.CursorLoader(Mechanoid.getApplicationContext(), uri, projection, toString(), getArgsArray(), null);
	}
	
	public android.support.v4.content.CursorLoader createSupportLoader(Uri uri, String[] projection, boolean enableNotifications, String... groupBy) {

		uri = uri.buildUpon().appendQueryParameter(MechanoidContentProvider.PARAM_NOTIFY, String.valueOf(enableNotifications)).build();
		uri = appendGroupByToUri(uri, groupBy);

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

	public int[] selectIntArray(Uri uri, String column) {
		return selectIntArray(uri, column, null);
	}
	
	public int[] selectIntArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			int[] array = new int[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getInt(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public long[] selectLongArray(Uri uri, String column) {
		return selectLongArray(uri, column, null);
	}
	
	public long[] selectLongArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			long[] array = new long[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getLong(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public double[] selectDoubleArray(Uri uri, String column) {
		return selectDoubleArray(uri, column, null);
	}
	
	public double[] selectDoubleArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			double[] array = new double[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getDouble(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public float[] selectFloatArray(Uri uri, String column) {
		return selectFloatArray(uri, column, null);
	}
	
	public float[] selectFloatArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			float[] array = new float[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getFloat(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public short[] selectShortArray(Uri uri, String column) {
		return selectShortArray(uri, column, null);
	}
	
	public short[] selectShortArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			short[] array = new short[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getShort(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public byte[][] selectBlobArray(Uri uri, String column) {
		return selectBlobArray(uri, column, null);
	}
	
	public byte[][] selectBlobArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			byte[][] array = new byte[cursor.getCount()][];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getBlob(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public boolean[] selectBooleanArray(Uri uri, String column) {
		return selectBooleanArray(uri, column, null);
	}
	
	public boolean[] selectBooleanArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			boolean[] array = new boolean[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getLong(0) > 0;
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public String[] selectStringArray(Uri uri, String column) {
		return selectStringArray(uri, column, null);
	}
	
	public String[] selectStringArray(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			String[] array = new String[cursor.getCount()];
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				array[i] = cursor.getString(0);
			}
			
			return array;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<Integer> selectIntegerList(Uri uri, String column) {
		return selectIntegerList(uri, column, null);
	}
	
	public List<Integer> selectIntegerList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<Integer> list = new ArrayList<Integer>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getInt(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<Long> selectLongList(Uri uri, String column) {
		return selectLongList(uri, column, null);
	}
	
	public List<Long> selectLongList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<Long> list = new ArrayList<Long>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getLong(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<Double> selectDoubleList(Uri uri, String column) {
		return selectDoubleList(uri, column, null);
	}
	
	public List<Double> selectDoubleList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<Double> list = new ArrayList<Double>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getDouble(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<Float> selectFloatList(Uri uri, String column) {
		return selectFloatList(uri, column, null);
	}
	
	public List<Float> selectFloatList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<Float> list = new ArrayList<Float>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getFloat(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<Short> selectShortList(Uri uri, String column) {
		return selectShortList(uri, column, null);
	}
	
	public List<Short> selectShortList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<Short> list = new ArrayList<Short>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getShort(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<byte[]> selectBlobList(Uri uri, String column) {
		return selectBlobList(uri, column, null);
	}
	
	public List<byte[]> selectBlobList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<byte[]> list = new ArrayList<byte[]>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getBlob(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<Boolean> selectBooleanList(Uri uri, String column) {
		return selectBooleanList(uri, column, null);
	}
	
	public List<Boolean> selectBooleanList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<Boolean> list = new ArrayList<Boolean>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getLong(0) > 0);
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
	
	public List<String> selectStringList(Uri uri, String column) {
		return selectStringList(uri, column, null);
	}
	
	public List<String> selectStringList(Uri uri, String column, String orderBy) {
		Cursor cursor = null;
		
		try {
			cursor = select(uri, new String[] { column }, orderBy, false);
			
			List<String> list = new ArrayList<String>(cursor.getCount());
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();
				list.add(cursor.getString(0));
			}
			
			return list;
			
		} finally {
			Closeables.closeSilently(cursor);
		}
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
    
    private static Async mAsync;
    
    public static class Async extends AsyncQueryHandler {

    	int mTokens = 0;
    	
    	protected synchronized int createToken() {
    		mTokens++;
    		return mTokens;
    	}
        public Async(ContentResolver cr) {
            super(cr);
        }
        
        public AsyncQuery startQuery(AsyncQueryCallback callback, Uri uri,
        		String[] projection, String selection, String[] selectionArgs,
        		String orderBy) {
        	
        	AsyncQuery query = new AsyncQuery(this, createToken(), callback);
        	
        	WeakReference<AsyncQuery> queryRef = new WeakReference<AsyncQuery>(query);

        	startQuery(query.token, queryRef, uri, projection, selection, selectionArgs,
        			orderBy);
        	
        	return query;
        }

        @Override
        protected void onQueryComplete(int token, Object cookie, Cursor cursor) {
            super.onQueryComplete(token, cookie, cursor);

            WeakReference<AsyncQuery> queryRef = (WeakReference<AsyncQuery>) cookie;

            AsyncQuery asyncQuery = queryRef.get();
            
            if(asyncQuery != null) {
            	asyncQuery.completeQuery(cursor);
            }
        }
    }
    
    public interface AsyncQueryCallback {
    	void onQueryComplete(Cursor cursor);
    }

	public static synchronized void init(ContentResolver resolver) {
		if(mAsync == null) {
			mAsync = new Async(resolver);
		}
	}
}
