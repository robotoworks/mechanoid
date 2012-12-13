package com.robotoworks.mechanoid.sqlite;

import android.content.ContentResolver;

public abstract class ActiveRecord {
    /**
     * Will insert the record if its _id is zero or update the record otherwise.
     * @param resolver the resolver
     * @return the new _id of the record, the id property of this active record
     * will also be updated
     */
    public abstract long save(ContentResolver resolver);
    
    
    /**
     * @param resolver
     * @param query
     * @return the number of records affected
     */
    public abstract int update(ContentResolver resolver, SQuery query);
    public abstract boolean delete(ContentResolver resolver);
}
