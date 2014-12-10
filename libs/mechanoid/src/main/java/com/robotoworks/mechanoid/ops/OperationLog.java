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
package com.robotoworks.mechanoid.ops;

import com.robotoworks.mechanoid.internal.util.LruCache;

public class OperationLog {
    
	private OperationLogInternal mLog;

	private class OperationLogInternal extends LruCache<Integer, OperationResult> {
		public OperationLogInternal(int maxSize) {
			super(maxSize);
		}
	}

    public OperationLog(int size) {
        mLog = new OperationLogInternal(size);
    }

	public OperationResult get(int id) {
		return mLog.get(id);
	}

	public void put(int id, OperationResult result) {
		mLog.put(id, result);
	}
	
	public OperationResult remove(int id) {
		return mLog.remove(id);
	}
}