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

public interface OperationExecutorCallbacks {
    /**
     * <p>Called when an operation is pending completion, will be invoked when
     * executing an operation with the associated manager 
     * or after a configuration change when the activity is recreated.</p>
     * 
     * @param key The key used to persist an executor through saved state, which can be used to
     * identify which executor the callback is is coming from
     */
    public void onOperationPending(String key);
    
    /**
     * <p>A callback that will be invoked by{@link OperationManager} or {@link SupportOperationManager}
     * on completion of an operation.</p>
     * 
     * <p>Will be invoked for each completing operation,
     * the first time it will be invoked is after the operation completes, subsequent times it
     * will be invoked and the fromCache argument will be true.</p>
     * 
     * @param key The key used to persist an executor through saved state, which can be used to
     * identify which executor the callback is is coming from
     * @param result The result of the completed operation
     * @param handled Whether the operation result has been handled already, this is useful in scenarios
     * where you still want to act upon the completion of an operation but you only want to do certain
     * things the first time it was handled
     * 
     * @return you should return true if you handled this operation, and false if you did not or if you
     * do not want to handle it yet, this can be useful if you do not want to handle the operation because your 
     * fragment or activity is being destroyed
     */
    public boolean onOperationComplete(String key, OperationResult result);
}