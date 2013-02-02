package com.robotoworks.mechanoid.sqlite.generator

import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSource
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model

import static extension com.robotoworks.mechanoid.common.util.Strings.*
import static extension com.robotoworks.mechanoid.sqlite.generator.Extensions.*

class ContentProviderContractGenerator {
		def CharSequence generate(Model model, SqliteDatabaseSnapshot snapshot) { 
			'''		
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package �model.packageName�;
			
			import android.content.ContentValues;
			import android.net.Uri;
			import android.provider.BaseColumns;
			import android.content.ContentResolver;
			import com.robotoworks.mechanoid.sqlite.SQuery;
			import com.robotoworks.mechanoid.Mechanoid;
			import com.robotoworks.mechanoid.content.MechanoidContentProvider;
			import com.robotoworks.mechanoid.content.AbstractValuesBuilder;
			import java.lang.reflect.Field;
			
			public class �model.database.name.pascalize�Contract  {
			    public static final String CONTENT_AUTHORITY = initAuthority();

				private static String initAuthority() {
					String authority = "�model.packageName�.�model.database.name.toLowerCase�";
			
					try {
			    		
			    		ClassLoader loader = �model.database.name.pascalize�Contract.class.getClassLoader();
			    		
						Class<?> clz = loader.loadClass("com.justeat.app.data.�model.database.name.pascalize�ContentProviderAuthority");
						Field declaredField = clz.getDeclaredField("CONTENT_AUTHORITY");
						
						authority = declaredField.get(null).toString();
					} catch (ClassNotFoundException e) {} 
			    	catch (NoSuchFieldException e) {} 
			    	catch (IllegalArgumentException e) {
					} catch (IllegalAccessException e) {
					}
					
					return authority;
				}
				
			    private static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
			
				�FOR tbl : snapshot.tables�
				interface �tbl.name.pascalize�Columns {
					�FOR col : tbl.columnDefs.filter([!name.equals("_id")])�
					String �col.name.underscore.toUpperCase� = "�col.name�";
					�ENDFOR�
				}
				
				�ENDFOR�

				�FOR vw :  snapshot.views�
				interface �vw.name.pascalize�Columns {
					�FOR col : vw.getViewResultColumns�
					�generateInterfaceMemberForResultColumn(col)�
					�ENDFOR�
				}
				
				�ENDFOR�
						
				�FOR tbl : snapshot.tables�
				/**
				 * <p>Column definitions and helper methods to work with the �tbl.name.pascalize� table.</p>
				 */
				public static class �tbl.name.pascalize� implements �tbl.name.pascalize�Columns�IF tbl.hasAndroidPrimaryKey�, BaseColumns�ENDIF� {
				    public static final Uri CONTENT_URI = 
							BASE_CONTENT_URI.buildUpon().appendPath("�tbl.name.toLowerCase�").build();
				
					/**
					 * <p>The content type for a cursor that contains many �tbl.name.pascalize� table rows.</p>
					 */
				    public static final String CONTENT_TYPE =
				            "vnd.android.cursor.dir/vnd.�model.database.name.toLowerCase�.�tbl.name�";
					/**
					 * <p>The content type for a cursor that contains a single �tbl.name.pascalize� table row.</p>
					 */
				    public static final String ITEM_CONTENT_TYPE =
				            "vnd.android.cursor.item/vnd.�model.database.name.toLowerCase�.�tbl.name�";
				
					/**
					 * <p>Builds a Uri with appended id for a row in the �tbl.name.pascalize� table, 
					 * eg:- content://�model.packageName�.�model.database.name.toLowerCase�/�tbl.name.toLowerCase�/123.</p>
					 */
				    public static Uri buildUriWithId(long id) {
				        return CONTENT_URI.buildUpon().appendPath(String.valueOf(id)).build();
				    }
				
					public static int delete() {
						return Mechanoid.getContentResolver().delete(CONTENT_URI, null, null);
					}
					
					public static int delete(String where, String[] selectionArgs) {
						return Mechanoid.getContentResolver().delete(CONTENT_URI, where, selectionArgs);
					}
					
					/**
					 * <p>Create a new Builder for �tbl.name.pascalize�</p>
					 */
					public static Builder newBuilder() {
						return new Builder();
					}
					
					/**
					 * <p>Build and execute insert or update statements for �tbl.name.pascalize�.</p>
					 *
					 * <p>Use {@link �tbl.name.pascalize�#newBuilder()} to create new builder</p>
					 */
					public static class Builder extends AbstractValuesBuilder {
						private Builder() {
							super(Mechanoid.getApplicationContext(), CONTENT_URI);
						}
						
						�FOR item : tbl.columnDefs.filter([!name.equals("_id")])�
						�var col = item as ColumnDef�
						public Builder set�col.name.pascalize�(�col.type.toJavaTypeName� value) {
							mValues.put(�tbl.name.pascalize�.�col.name.underscore.toUpperCase�, value);
							return this;
						}
						�ENDFOR�
					}
				}
				
				�ENDFOR�
			
				�FOR vw : snapshot.views�
				public static class �vw.name.pascalize� implements �vw.name.pascalize�Columns�IF vw.hasAndroidPrimaryKey�, BaseColumns�ENDIF� {
				    public static final Uri CONTENT_URI = 
							BASE_CONTENT_URI.buildUpon().appendPath("�vw.name�").build();
				
				    public static final String CONTENT_TYPE =
				            "vnd.android.cursor.dir/vnd.�model.database.name.toLowerCase�.�vw.name�";
					�IF vw.hasAndroidPrimaryKey�
					public static final String ITEM_CONTENT_TYPE =
						"vnd.android.cursor.item/vnd.�model.database.name.toLowerCase�.�vw.name�";
					�ENDIF�
				}

				�ENDFOR�
				
				�IF model.database.config != null�
				�FOR action : model.database.config.statements.filter([it instanceof ActionStatement])�
				�var stmt = action as ActionStatement�
				public static class �stmt.name.pascalize� {
				    public static final Uri CONTENT_URI = 
							BASE_CONTENT_URI.buildUpon().appendPath("�stmt.path�").build();
				
				    public static final String CONTENT_TYPE =
				            "vnd.android.cursor.dir/vnd.�model.database.name.toLowerCase�.�stmt.name�";
				}

				�ENDFOR�
				�ENDIF�
			
				private �model.database.name.pascalize�Contract(){}
			}
			'''
	}
	
	def createMethodArgsFromColumns(CreateTableStatement tbl) {
		'''�FOR item : tbl.columnDefs.filter([!name.equals("_id")]) SEPARATOR ", "��var col = item as ColumnDef��col.type.toJavaTypeName()� �col.name.camelize��ENDFOR�'''
	}
	
	def generateInterfaceMemberForResultColumn(ColumnSource expr) { 
		'''
		�IF expr.name != null && !expr.name.equals("") && !expr.name.equals("_id")�
		String �expr.name.underscore.toUpperCase� = "�expr.name�";
		�ENDIF�
		'''		
	}
	
}