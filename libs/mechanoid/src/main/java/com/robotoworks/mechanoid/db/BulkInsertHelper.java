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
