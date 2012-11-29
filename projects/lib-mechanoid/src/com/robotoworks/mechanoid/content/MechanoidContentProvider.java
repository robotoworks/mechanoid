package com.robotoworks.mechanoid.content;

import com.robotoworks.mechanoid.sqlite.MechanoidSQLiteOpenHelper;

import android.content.ContentProvider;
import android.content.Context;

public abstract class MechanoidContentProvider extends ContentProvider {
    private MechanoidSQLiteOpenHelper mOpenHelper;
    
    public MechanoidSQLiteOpenHelper getOpenHelper() {
		return mOpenHelper;
	}
    
	@Override
	public boolean onCreate() {
        final Context context = getContext();
        mOpenHelper = createOpenHelper(context);
		return true;
	}
	
	protected ContentProviderActions createActions(Class<?> clazz) {
		try {
			return (ContentProviderActions) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Unable to create actions", e);
		}
	}

	protected abstract MechanoidSQLiteOpenHelper createOpenHelper(Context context);
}
