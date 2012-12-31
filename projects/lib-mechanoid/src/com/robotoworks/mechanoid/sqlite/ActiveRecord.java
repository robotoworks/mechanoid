package com.robotoworks.mechanoid.sqlite;


public abstract class ActiveRecord {
    /**
     * Will insert the record if its _id is zero or update the record otherwise.
     * @param resolver the resolver
     * @return the new _id of the record, the id property of this active record
     * will also be updated
     */
    public abstract long save();
    public abstract long save(boolean notifyChange);
    
    
    /**
     * @param resolver
     * @param query
     * @return the number of records affected
     */
    public abstract int update(SQuery query);
    
    public abstract int update(SQuery query, boolean notifyChange);
    
    
    public abstract boolean delete();
    
    public abstract boolean delete(boolean notifyChange);
    
    /**
     * Set all fields in this record to dirty
     * @param dirty
     */
    public abstract void setDirty(boolean dirty);
    
    /**
     * Reload this record, if it has an id
     */
    public abstract void reload();
}
