/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.db;

import java.util.List;


import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class ContentProviderActions {
	public int delete(MechanoidContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		return -1;
	}
	
	public Uri insert(MechanoidContentProvider provider, Uri uri, ContentValues values){
		return null;
	}
	
	public Cursor query(MechanoidContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){
		return null;
	}
	
	public int update(MechanoidContentProvider provider, Uri uri, ContentValues values, String selection, String[] selectionArgs){
		return -1;
	}
	
    public int bulkInsert(MechanoidContentProvider provider, Uri uri, ContentValues[] values) {		
        int numValues = values.length;
        for (int i = 0; i < numValues; i++) {
            insert(provider, uri, values[i]);
        }
        return numValues;
    }
    
	public <T extends ActiveRecord> List<T> selectRecords(MechanoidContentProvider provider, Uri uri, SQuery sQuery, String sortOrder) {
		return null;
	}
}
