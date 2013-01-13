package com.robotoworks.mechanoid.content;

import java.util.List;

import com.robotoworks.mechanoid.Mechanoid;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

public abstract class BulkInsertHelper<T> {
    
    protected abstract ContentValues createValues(T item);
    
    public int insert(Uri contentUri, List<T> items) {
    	ContentResolver resolver = Mechanoid.getContentResolver();
        if(items == null || items.size() == 0) {
            return 0;
        }
        
        ContentValues[] values = new ContentValues[items.size()];
        
        for(int i=0; i < values.length; i++) {
            T item = items.get(i);
            
            values[i] = createValues(item);
        }
        
        return resolver.bulkInsert(contentUri, values);
    }
}
