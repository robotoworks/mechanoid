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

import android.content.Intent;


/**
 * <p>An abstract operation</p>
 *
 */
public abstract class Operation {	
	
	/**
	 * <p>Helper method to extract an operation id from an operation intent</p>
	 * 
	 * @param intent The intent to extract the id from
	 * @return An operation id
	 */
	public static int getOperationRequestId(Intent intent) {
		return intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, -1);
	}
	
	public abstract OperationResult execute(OperationContext context);
}