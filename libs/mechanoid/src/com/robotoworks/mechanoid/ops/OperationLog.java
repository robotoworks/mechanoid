package com.robotoworks.mechanoid.ops;

import android.os.Bundle;

import com.robotoworks.mechanoid.internal.util.LruCache;

public class OperationLog extends LruCache<Integer, Bundle> {
    
    public OperationLog(int size) {
        super(size);
    }
}