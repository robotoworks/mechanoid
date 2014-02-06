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


@Deprecated
public interface OperationManagerCallbacks {
    /**
     * <p>Called when an operation is pending completion, will be invoked when
     * executing an operation with the associated manager 
     * or after a configuration change when the activity is recreated.</p>
     * @param code A user-defined code for this operation
     */
    public void onOperationPending(int code);
    
    /**
     * <p>A callback that will be invoked by{@link OperationManager} or {@link SupportOperationManager}
     * on completion of an operation.</p>
     * 
     * <p>Will be invoked for each completing operation,
     * the first time it will be invoked is after the operation completes, subsequent times it
     * will be invoked and the fromCache argument will be true.</p>
     * 
     * @param code A user-defined code for this operation
     * @param result The result of the completed operation
     * @param fromCache Whether the operation result was from cache
     */
    public abstract void onOperationComplete(int code, OperationResult result, boolean fromCache);
}