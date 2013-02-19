/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.ops;

import android.os.Bundle;

import com.robotoworks.mechanoid.internal.util.LruCache;

public class OperationLog extends LruCache<Integer, Bundle> {
    
    public OperationLog(int size) {
        super(size);
    }
}