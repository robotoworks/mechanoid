package com.robotoworks.mechanoid.content;

import java.util.List;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

public abstract class ListInsertHelper<T> {
    
    protected abstract ContentValues createValues(T item);
    protected boolean onBeforeInsert(ContentResolver resolver, T item){ return true; }
    protected void onAfterInsert(Uri uri, T item) {}
    public void insert(ContentResolver resolver, Uri contentUri, List<T> items) {
        if(items == null || items.size() == 0) {
            return;
        }
        
        for(int i=0; i < items.size(); i++) {
            T item = items.get(i);
            
            ContentValues values = createValues(item);
            
            if(onBeforeInsert(resolver, item)) {
            	Uri uri = resolver.insert(contentUri, values);
            	onAfterInsert(uri, item);
            }
        }
    }
}
