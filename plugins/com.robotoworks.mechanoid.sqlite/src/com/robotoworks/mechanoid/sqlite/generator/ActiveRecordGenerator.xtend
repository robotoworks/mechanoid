package com.robotoworks.mechanoid.sqlite.generator

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model

import static extension com.robotoworks.mechanoid.common.util.Strings.*
import static extension com.robotoworks.mechanoid.sqlite.generator.Extensions.*
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef

class ActiveRecordGenerator {
		def CharSequence generate(Model model, CreateTableStatement stmt) '''
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package �model.packageName�;

			import android.content.ContentResolver;
			import android.database.Cursor;
			import android.os.Parcel;
			import android.os.Parcelable;
			
			import �model.packageName�.�model.database.name.pascalize�Contract.�stmt.name.pascalize�;
			import �model.packageName�.�model.database.name.pascalize�Contract.�stmt.name.pascalize�.Builder;
			import com.robotoworks.mechanoid.util.Closeables;
			import com.robotoworks.mechanoid.sqlite.ActiveRecord;
			import com.robotoworks.mechanoid.sqlite.ActiveRecordFactory;
			import com.robotoworks.mechanoid.Mechanoid;
			import com.robotoworks.mechanoid.content.AbstractValuesBuilder;
			
			public class �stmt.name.pascalize�Record extends ActiveRecord implements Parcelable {

				private static ActiveRecordFactory<�stmt.name.pascalize�Record> sFactory = new ActiveRecordFactory<�stmt.name.pascalize�Record>() {
					@Override
					public �stmt.name.pascalize�Record create(Cursor c) {
						return fromCursor(c);
					}
					
					@Override
					public String[] getProjection() {
						return PROJECTION;
					}
				};
				
				public static ActiveRecordFactory<�stmt.name.pascalize�Record> getFactory() {
					return sFactory;
				}

			    public static final Parcelable.Creator<�stmt.name.pascalize�Record> CREATOR 
			    	= new Parcelable.Creator<�stmt.name.pascalize�Record>() {
			        public �stmt.name.pascalize�Record createFromParcel(Parcel in) {
			            return new �stmt.name.pascalize�Record(in);
			        }
			
			        public �stmt.name.pascalize�Record[] newArray(int size) {
			            return new �stmt.name.pascalize�Record[size];
			        }
			    };
			    
			    public static String[] PROJECTION = {
			    	�generateProjectionArrayMembers(stmt)�
			    };
			    
			    public interface Indices {
			    	�generateProjectionIndicesMembers(stmt)�
			    }
			    
			    �generateFields(stmt)�
			    
			    @Override
			    protected String[] _getProjection() {
			    	return PROJECTION;
			    }
			    
			    �generateAccessors(stmt)�
			    
			    public �stmt.name.pascalize�Record() {
			    	super(�stmt.name.pascalize�.CONTENT_URI);
				}
				
				private �stmt.name.pascalize�Record(Parcel in) {
			    	super(�stmt.name.pascalize�.CONTENT_URI);
			    	
					setId(in.readLong());
					�var counter=-1�
					�FOR item : stmt.columnDefs.filter([!it.name.equals("_id")])�
					�var col = item as ColumnDef�
					�IF col.type == ColumnType::BOOLEAN�
					m�col.name.pascalize� = (in.readInt() > 0);
					�ELSE�
					m�col.name.pascalize� = in.read�col.type.toJavaTypeName.pascalize�();
					�ENDIF�
					�ENDFOR�
					
					boolean[] dirtyFlags = new boolean[�stmt.columnDefs.size�];
					in.readBooleanArray(dirtyFlags);
					�FOR col : stmt.columnDefs.filter([!it.name.equals("_id")])�
					m�col.name.pascalize�Dirty = dirtyFlags[�counter = counter + 1�];
					�ENDFOR�
				}
				
				@Override
				public int describeContents() {
				    return 0;
				}
				
				@Override
				public void writeToParcel(Parcel dest, int flags) {
					dest.writeLong(getId());
					�FOR item : stmt.columnDefs.filter([!it.name.equals("_id")])�
					�var col = item as ColumnDef�
					�IF col.type == ColumnType::BOOLEAN�
					dest.writeInt(m�col.name.pascalize� ? 1 : 0);
					�ELSE�
					dest.write�col.type.toJavaTypeName.pascalize�(m�col.name.pascalize�);
					�ENDIF�
					�ENDFOR�
				    dest.writeBooleanArray(new boolean[] {
						�FOR col : stmt.columnDefs.filter([!it.name.equals("_id")]) SEPARATOR ","�
						m�col.name.pascalize�Dirty
						�ENDFOR�
				    });
				}
				
				@Override
				protected AbstractValuesBuilder createBuilder() {
					Builder builder = �stmt.name.pascalize�.newBuilder();

					�FOR col : stmt.columnDefs.filter([!it.name.equals("_id")])�
					if(m�col.name.pascalize�Dirty) {
						builder.set�col.name.pascalize�(m�col.name.pascalize�);
					}
					�ENDFOR�
					
					return builder;
				}
				
			    @Override
				public void makeDirty(boolean dirty){
					�FOR col : stmt.columnDefs.filter([!it.name.equals("_id")])�
					m�col.name.pascalize�Dirty = dirty;
					�ENDFOR�
				}

				@Override
				protected void setPropertiesFromCursor(Cursor c) {
					setId(c.getLong(Indices._ID));
					�FOR item : stmt.columnDefs.filter([!it.name.equals("_id")])�
					�var col = item as ColumnDef�
					�IF col.type == ColumnType::BOOLEAN�
					set�col.name.pascalize�(c.getInt(Indices.�col.name.underscore.toUpperCase�) > 0);
					�ELSE�
					set�col.name.pascalize�(c.get�col.type.toJavaTypeName.pascalize�(Indices.�col.name.underscore.toUpperCase�));
					�ENDIF�
					�ENDFOR�
				}
				
				public static �stmt.name.pascalize�Record fromCursor(Cursor c) {
				    �stmt.name.pascalize�Record item = new �stmt.name.pascalize�Record();
				    
					item.setPropertiesFromCursor(c);
					
					item.makeDirty(false);
					
				    return item;
				}
				
				public static �stmt.name.pascalize�Record get(long id) {
				    Cursor c = null;
				    
				    ContentResolver resolver = Mechanoid.getContentResolver();
				    
				    try {
				        c = resolver.query(�stmt.name.pascalize�.CONTENT_URI.buildUpon()
						.appendPath(String.valueOf(id)).build(), PROJECTION, null, null, null);
				        
				        if(!c.moveToFirst()) {
				            return null;
				        }
				        
				        return fromCursor(c);
				    } finally {
				        Closeables.closeSilently(c);
				    }
				}
			}
		'''
		
		def generateProjectionArrayMembers(CreateTableStatement stmt) '''
			�FOR col : stmt.columnDefs SEPARATOR ','�
			�stmt.name.pascalize�.�col.name.underscore.toUpperCase�
			�ENDFOR�
		'''

		def generateProjectionIndicesMembers(CreateTableStatement stmt) '''
			�var counter=-1�
			�FOR col : stmt.columnDefs�
				int �col.name.underscore.toUpperCase� = �counter = counter + 1�;
			�ENDFOR�
		'''
		
		def generateFields(CreateTableStatement stmt) '''
			�FOR item : stmt.columnDefs.filter([!it.name.equals("_id")])�
			�var col = item as ColumnDef�
			private �col.type.toJavaTypeName� m�col.name.pascalize�;
			private boolean m�col.name.pascalize�Dirty;
			�ENDFOR�
		'''
		
		def generateAccessors(CreateTableStatement stmt) '''
			�FOR item : stmt.columnDefs.filter([!it.name.equals("_id")])�
			�var col = item as ColumnDef�
			public void set�col.name.pascalize�(�col.type.toJavaTypeName� �col.name.camelize�) {
				m�col.name.pascalize� = �col.name.camelize�;
				m�col.name.pascalize�Dirty = true;
			}
			
			public �col.type.toJavaTypeName� get�col.name.pascalize�() {
				return m�col.name.pascalize�;
			}
			
			�ENDFOR�
		'''
}