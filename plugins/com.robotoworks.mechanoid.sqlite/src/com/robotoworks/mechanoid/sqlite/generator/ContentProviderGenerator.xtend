package com.robotoworks.mechanoid.sqlite.generator

import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model

import static extension com.robotoworks.mechanoid.common.util.Strings.*
import static extension com.robotoworks.mechanoid.sqlite.generator.Extensions.*

class ContentProviderGenerator {
		def CharSequence generate(Model model, SqliteDatabaseSnapshot snapshot) '''
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package �model.packageName�;
			
			import java.util.ArrayList;
			import java.util.List;
			import android.content.ContentProviderOperation;
			import android.content.ContentProviderResult;
			import android.content.ContentValues;
			import android.content.Context;
			import android.content.OperationApplicationException;
			import android.content.UriMatcher;
			import android.database.Cursor;
			import android.database.sqlite.SQLiteDatabase;
			import android.net.Uri;
			import com.robotoworks.mechanoid.content.MechanoidContentProvider;
			import com.robotoworks.mechanoid.sqlite.MechanoidSQLiteOpenHelper;
			import com.robotoworks.mechanoid.sqlite.ActiveRecord;
			import com.robotoworks.mechanoid.sqlite.SQuery;
			import com.robotoworks.mechanoid.content.DefaultContentProviderActions;
			import com.robotoworks.mechanoid.content.ContentProviderActions;
			import �model.packageName�.Abstract�model.database.name.pascalize�OpenHelper.Tables;
			�FOR tbl : snapshot.tables�
			import �model.packageName�.�model.database.name.pascalize�Contract.�tbl.name.pascalize�;
			�ENDFOR�
			�FOR vw : snapshot.views�
			import �model.packageName�.�model.database.name.pascalize�Contract.�vw.name.pascalize�;
			�ENDFOR�
			�FOR tbl : snapshot.tables.filter([it.hasAndroidPrimaryKey])�
			import �model.packageName�.�tbl.name.pascalize�Record;
			�ENDFOR�			
			
			public abstract class Abstract�model.database.name.pascalize�ContentProvider extends MechanoidContentProvider {
			
			    private static final UriMatcher sUriMatcher;
				private static final String[] sContentTypes;
			    
				�var counter=-1�
				�FOR tbl : snapshot.tables�
				private static final int �tbl.name.underscore.toUpperCase� = �counter=counter+1�;
				�IF tbl.hasAndroidPrimaryKey�
				private static final int �tbl.name.underscore.toUpperCase�_ID = �counter=counter+1�;
				�ENDIF�
				�ENDFOR�

				�FOR vw : snapshot.views�
				private static final int �vw.name.underscore.toUpperCase� = �counter=counter+1�;
				�IF vw.hasAndroidPrimaryKey�
				private static final int �vw.name.underscore.toUpperCase�_ID = �counter=counter+1�;
				�ENDIF�				
				�ENDFOR�
				
				�IF model.database.config !=null�
				�FOR a : model.database.config.statements.filter([it instanceof ActionStatement])�
				private static final int �(a as ActionStatement).name.underscore.toUpperCase� = �counter=counter+1�;
				�ENDFOR�
				�ENDIF�			
				public static final int NUM_URI_MATCHERS = �counter + 1�;
			
				static {
					sUriMatcher = buildUriMatcher();
				
					sContentTypes = new String[NUM_URI_MATCHERS];

					�FOR tbl : snapshot.tables�
					sContentTypes[�tbl.name.underscore.toUpperCase�] = �tbl.name.pascalize�.CONTENT_TYPE;
					�IF tbl.hasAndroidPrimaryKey�
					sContentTypes[�tbl.name.underscore.toUpperCase�_ID] = �tbl.name.pascalize�.ITEM_CONTENT_TYPE;
					�ENDIF�
					�ENDFOR�
					�FOR vw : snapshot.views�
					sContentTypes[�vw.name.underscore.toUpperCase�] = �vw.name.pascalize�.CONTENT_TYPE;
					�IF vw.hasAndroidPrimaryKey�
					sContentTypes[�vw.name.underscore.toUpperCase�_ID] = �vw.name.pascalize�.ITEM_CONTENT_TYPE;
					�ENDIF�
					�ENDFOR�					
				}
				
			    private static UriMatcher buildUriMatcher() {
			        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
			        final String authority = �model.database.name.pascalize�Contract.CONTENT_AUTHORITY;
			
					// Tables
					�FOR tbl : snapshot.tables�
					matcher.addURI(authority, "�tbl.name�", �tbl.name.underscore.toUpperCase�);
					�IF tbl.hasAndroidPrimaryKey�
					matcher.addURI(authority, "�tbl.name�/#", �tbl.name.underscore.toUpperCase�_ID);
					�ENDIF�
					�ENDFOR�
			
					// Views
					�FOR vw : snapshot.views�
					matcher.addURI(authority, "�vw.name�", �vw.name.underscore.toUpperCase�);
					�IF vw.hasAndroidPrimaryKey�
					matcher.addURI(authority, "�vw.name�/#", �vw.name.underscore.toUpperCase�_ID);
					�ENDIF�
					�ENDFOR�

					// User Actions
					�IF model.database.config !=null�
					�FOR a : model.database.config.statements.filter([it instanceof ActionStatement])�
					�var stmt = a as ActionStatement�
					matcher.addURI(authority, "�stmt.path�", �(a as ActionStatement).name.underscore.toUpperCase�); 
					�ENDFOR�
					�ENDIF�
			        return matcher;
			    }
			
				@Override
				public String getType(Uri uri) {
			        final int match = sUriMatcher.match(uri);
			
					if(match == UriMatcher.NO_MATCH) {
						throw new UnsupportedOperationException("Unknown uri: " + uri);
					}
					
					return sContentTypes[match];
				}
			
				@Override
				public int delete(Uri uri, String selection, String[] selectionArgs) {
					final int match = sUriMatcher.match(uri);

					if(match == UriMatcher.NO_MATCH) {
						throw new UnsupportedOperationException("Unknown uri: " + uri);
					}
					
					int affected = createActions(match).delete(this, uri, selection, selectionArgs);
					
					if(affected > 0) {
						tryNotifyChange(uri);
					}
					
					return affected;
				}
			
				@Override
				public Uri insert(Uri uri, ContentValues values) {
			
					final int match = sUriMatcher.match(uri);

					if(match == UriMatcher.NO_MATCH) {
						throw new UnsupportedOperationException("Unknown uri: " + uri);
					}
					
					Uri newUri = createActions(match).insert(this, uri, values);
					
					if(newUri != null) {
						tryNotifyChange(uri);
					}
					
					return newUri;
				}
				
				@Override
			    public int bulkInsert(Uri uri, ContentValues[] values) {
			    	
					final int match = sUriMatcher.match(uri);

					if(match == UriMatcher.NO_MATCH) {
						throw new UnsupportedOperationException("Unknown uri: " + uri);
					}
					
					int affected = createActions(match).bulkInsert(this, uri, values);
					
					if(affected > 0) {
						tryNotifyChange(uri);
					}
					
					return affected;
			    }
			
				@Override
				protected MechanoidSQLiteOpenHelper createOpenHelper(Context context) {
			        return new �model.database.name.pascalize�OpenHelper(context);
				}
			
				@Override
				public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
					final int match = sUriMatcher.match(uri);

					if(match == UriMatcher.NO_MATCH) {
						throw new UnsupportedOperationException("Unknown uri: " + uri);
					}
					
					Cursor cursor = createActions(match).query(this, uri, projection, selection, selectionArgs, sortOrder);
			
					trySetNotificationUri(cursor, uri);
					
					return cursor;
				}
			
				@Override
				public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
					final int match = sUriMatcher.match(uri);

					if(match == UriMatcher.NO_MATCH) {
						throw new UnsupportedOperationException("Unknown uri: " + uri);
					}
					
					int affected = createActions(match).update(this, uri, values, selection, selectionArgs);

					if(affected > 0) {
						tryNotifyChange(uri);
					}

					return affected;
				}

			    public <T extends ActiveRecord> List<T> selectRecords(Uri uri, SQuery sQuery, String sortOrder) {
			        final int match = sUriMatcher.match(uri);
			
			        if(match == UriMatcher.NO_MATCH) {
			            throw new UnsupportedOperationException("Unknown uri: " + uri);
			        }
			        
			        return createActions(match).selectRecords(this, uri, sQuery, sortOrder);
			    }
			    
			    @Override
			    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations)
			            throws OperationApplicationException {
			        final SQLiteDatabase db = getOpenHelper().getWritableDatabase();
			        db.beginTransaction();
			        try {
			            final int numOperations = operations.size();
			            final ContentProviderResult[] results = new ContentProviderResult[numOperations];
			            for (int i = 0; i < numOperations; i++) {
			                results[i] = operations.get(i).apply(this, results, i);
			            }
			            db.setTransactionSuccessful();
			            return results;
			        } finally {
			            db.endTransaction();
			        }
			    }
			    
			    @Override
			    protected ContentProviderActions createActions(int id) {
			    	switch(id) {
						�FOR tbl : snapshot.tables�
						case �tbl.name.underscore.toUpperCase�: 
							return create�tbl.name.pascalize�Actions();
						�IF tbl.hasAndroidPrimaryKey�
						case �tbl.name.underscore.toUpperCase�_ID:
							return create�tbl.name.pascalize�ByIdActions();
						�ENDIF�
						�ENDFOR�
						�FOR vw : snapshot.views�
						case �vw.name.underscore.toUpperCase�:
							return create�vw.name.pascalize�Actions();
						�IF vw.hasAndroidPrimaryKey�
						case �vw.name.underscore.toUpperCase�_ID: 
							return create�vw.name.pascalize�ByIdActions();
						�ENDIF�
						�ENDFOR�
						�IF model.database.config !=null�
						�FOR a : model.database.config.statements.filter([it instanceof ActionStatement])�
						case �(a as ActionStatement).name.underscore.toUpperCase�:
							return create�(a as ActionStatement).name.pascalize�Actions();
						�ENDFOR�
						�ENDIF�
						default:
							throw new UnsupportedOperationException("Unknown id: " + id);
			    	}
			    }
			    
			    �FOR tbl:snapshot.tables�
			    �IF tbl.hasAndroidPrimaryKey�
			    protected ContentProviderActions create�tbl.name.pascalize�ByIdActions() {
			    	return new DefaultContentProviderActions(Tables.�tbl.name.underscore.toUpperCase�, true, �IF tbl.hasAndroidPrimaryKey��tbl.name.pascalize�Record.getFactory()�ELSE�null�ENDIF�);
			    }
			    
			    �ENDIF�
			    protected ContentProviderActions create�tbl.name.pascalize�Actions() {
			    	return new DefaultContentProviderActions(Tables.�tbl.name.underscore.toUpperCase�, false, �IF tbl.hasAndroidPrimaryKey��tbl.name.pascalize�Record.getFactory()�ELSE�null�ENDIF�);
			    }
			    
			    �ENDFOR�
			    �FOR view:snapshot.views�
			    �IF view.hasAndroidPrimaryKey�
			    protected ContentProviderActions create�view.name.pascalize�ByIdActions() {
			    	return new DefaultContentProviderActions(Tables.�view.name.underscore.toUpperCase�, true);
			    }
			    
			    �ENDIF�
			    protected ContentProviderActions create�view.name.pascalize�Actions() {
			    	return new DefaultContentProviderActions(Tables.�view.name.underscore.toUpperCase�, false);
			    }
			    
			    �ENDFOR�
				�IF model.database.config !=null�
				�FOR a : model.database.config.statements.filter(typeof(ActionStatement))�
				protected ContentProviderActions create�a.name.pascalize�Actions() {
					return new ContentProviderActions();
				}
				
				�ENDFOR�
				�ENDIF�
			}
			'''
			
		def CharSequence generateStub(Model model, SqliteDatabaseSnapshot snapshot) '''
			/*******************************************************************************
			 * Copyright (c) 2012, Robotoworks Limited
			 * All rights reserved. This program and the accompanying materials
			 * are made available under the terms of the Eclipse Public License v1.0
			 * which accompanies this distribution, and is available at
			 * http://www.eclipse.org/legal/epl-v10.html
			 * 
			 *******************************************************************************/
			package �model.packageName�;
			
			import �model.packageName�.Abstract�model.database.name.pascalize�ContentProvider;
			
			public class �model.database.name.pascalize�ContentProvider extends Abstract�model.database.name.pascalize�ContentProvider {}
		'''
}