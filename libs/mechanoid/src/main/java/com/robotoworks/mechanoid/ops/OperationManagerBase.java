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

import java.util.LinkedList;
import java.util.Queue;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;

import com.robotoworks.mechanoid.ops.OperationServiceBridge;
import com.robotoworks.mechanoid.ops.OperationServiceListener;

public abstract class OperationManagerBase<T extends OperationServiceBridge> {
	
	private static final String TAG = "OperationManager";
	
    OperationManagerCallbacks<T> mCallbacks;
    
    private T mBridge;

    private String mStateKey;

	private boolean mEnableLogging;

    private SparseArray<OpInfo> mOperations = new SparseArray<OpInfo>();

    private Queue<Runnable> mPendingOperations = new LinkedList<Runnable>();
    
    private boolean mStarted = false;
    	
    static class OpInfo implements Parcelable {
        int mUserCode = 0;
        int mRequestId = 0;
        boolean mCallbackInvoked = false;
        OperationResult mResult = null;
        
        public static final Parcelable.Creator<OpInfo> CREATOR
        = new Parcelable.Creator<OpInfo>() {
            public OpInfo createFromParcel(Parcel in) {
                return new OpInfo(in);
            }
        
            public OpInfo[] newArray(int size) {
                return new OpInfo[size];
            }
        };

        OpInfo() {
            
        }
        
        OpInfo(Parcel in) {
            mUserCode = in.readInt();
            mRequestId = in.readInt();
            mCallbackInvoked = in.readInt() > 0;
            mResult = in.readParcelable(OperationResult.class.getClassLoader());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(mUserCode);
            dest.writeInt(mRequestId);
            dest.writeInt(mCallbackInvoked ? 1 : 0);
            dest.writeParcelable(mResult, 0);
        }
    }
    
    private OperationServiceListener mServiceListener = new OperationServiceListener() {
        @Override
        public void onOperationStarting(OperationServiceBridge bridge, int requestId, Intent request, Bundle data) {
        }
        
        @Override
        public void onOperationProgress(OperationServiceBridge bridge, int requestId, Intent request, int progress, Bundle data) {
        }
        
        @Override
        public void onOperationComplete(OperationServiceBridge bridge, int requestId, OperationResult result) {
            
            // This is not our bridge
            if(mBridge != bridge) {
                return;
            }
            
            OpInfo op = findOperationInfoByRequestId(requestId);
            
            // This is not our op
            if(op == null) {
                return;
            }
            
            op.mResult = result;
            mCallbacks.onOperationComplete((T)mBridge, op.mUserCode, result, false);
            op.mCallbackInvoked = true;
            
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Operation Complete] request id:%s, user code:%s", requestId, op.mUserCode));
        	}
        }
        
        @Override
        public void onOperationAborted(OperationServiceBridge bridge, int requestId, Intent intent, int reason, Bundle data) {
        }
    };
    


    protected OperationManagerBase(T bridge, OperationManagerCallbacks<T> callbacks, boolean enableLogging) {
        mBridge = bridge;
        mCallbacks = callbacks;
		mEnableLogging = enableLogging;
        mStateKey = mBridge.getClass().getName() + ".OperationManager.State";
    }
    
    private OpInfo findOperationInfoByRequestId(int requestId) {
        for (int i = 0; i < mOperations.size(); i++){
            OpInfo op = mOperations.valueAt(i);
            if (op.mRequestId == requestId) {
                return op;
            }
        }
        
        return null;
    }
       
    void restoreState(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            Bundle state = savedInstanceState.getBundle(mStateKey);
            
            if(state != null) {
            	mOperations = savedInstanceState.getSparseParcelableArray("operations");
            	
            	if(mEnableLogging) {
            		Log.d(TAG, String.format("[Restoring State]"));
            	}
            }
        }
    }
    
    void saveState(Bundle outState) {
    	
    	if(mEnableLogging) {
    		Log.d(TAG, String.format("[Saving State]"));
    	}
    	
        Bundle state = new Bundle();
        outState.putSparseParcelableArray("operations", mOperations);
        
        outState.putBundle(mStateKey, state);       
    }
    
    void start() {
    	if(mStarted) {
    		return;
    	}
    	
    	if(mEnableLogging) {
    		Log.d(TAG, String.format("[Starting]"));
    	}
    	
        mBridge.bindListener(mServiceListener);
        
        mStarted = true;
        
        ensureCallbacks();
        
        executePendingOperations();
    }

    private void executePendingOperations() {
        while(mPendingOperations.peek() != null) {
            mPendingOperations.poll().run();
        }
    }

    private void ensureCallbacks() {
        for(int i=0; i < mOperations.size(); i++) {
            OpInfo op = mOperations.valueAt(i);
            
            if(mBridge.isRequestPending(op.mRequestId)) {
            	if(mEnableLogging) {
            		Log.d(TAG, String.format("[Operation Pending] request id: %s, user code:%s", op.mRequestId, op.mUserCode));
            	}
                mCallbacks.onOperationPending(mBridge, op.mUserCode);
                continue;
            }
            
            OperationResult result = mBridge.getLog().get(op.mRequestId);
            
            if (result != null) {
                op.mResult = result;
                
                if(!op.mCallbackInvoked) {
                	if(mEnableLogging) {
                		Log.d(TAG, String.format("[Operation Complete] request id: %s, user code:%s", op.mRequestId, op.mUserCode));
                	}
                    mCallbacks.onOperationComplete(mBridge, op.mUserCode, op.mResult, false);
                    op.mCallbackInvoked = true;
                }
                
                continue;
            }                    
        }
    }

    void stop() {
        
        if(!mStarted) {
            return;
        }
        
        mStarted = false;
        
    	if(mEnableLogging) {
    		Log.d(TAG, String.format("[Stoping]"));
    	}
    	
        mBridge.unbindListener(mServiceListener);
    }
    
    /**
     * <p>Run an operation associated to the user-defined code, when invoked this method,
     * the associated {@link OperationManagerCallbacks#createOperation(OperationServiceBridge, int)} will
     * be invoked to actually create the operation (effectively running it) if the manager has not run the operation before.</p>
     * 
     * <p>When the operation completes, {@link OperationManagerCallbacks#onOperationComplete(OperationServiceBridge, int, Bundle, boolean)}
     * will be invoked.</p>
     * <p><b>runOperation</b> can be invoked many times for the same operation, however it will only run the operation once,
     * subsequent calls will be ignored unless the <b>force</b> argument is set to true. In all cases the 
     * {@link OperationManagerCallbacks#onOperationComplete(OperationServiceBridge, int, Bundle, boolean)} will
     * be invoked for each call to runOperation but subsequent calls for the same operation will have the <b>fromCache</b> argument set to true.</p>
     * 
     * <p>Setting the force flag to true, will force the operation to run, if an operation is currently running then it will continue to run but 
     * its result will be ignored and no callbacks will be received.</p>
     *
     * @param code user-defined code representing the operation to run
     * @param force wether to force the operation to run
     */
    public void runOperation(int code, boolean force) {
        
        if(!mStarted) {
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Queue Operation] user code:%s", code));
        	}
            queuePendingOperation(code, force);
            return;
        }
        
        OpInfo op = mOperations.get(code);
        
        if (force || op == null) {
            mOperations.delete(code);
            
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Operation Pending] user code:%s", code));
        	}
        	
            mCallbacks.onOperationPending(mBridge, code);
            
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Execute Operation] user code:%s", code));
        	}
        	
            int newRequestId = mCallbacks.createOperation(mBridge, code);

            if (newRequestId > 0) {
                OpInfo newOp = new OpInfo();
                newOp.mUserCode = code;
                newOp.mRequestId = newRequestId;
                
                mOperations.put(code, newOp);
            }
            
            return;
        }
        
        if(op.mResult != null) {
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Operation Complete] request id: %s, user code:%s, from cache:%s", op.mRequestId, op.mUserCode, op.mCallbackInvoked));
        	}
        	
        	mCallbacks.onOperationComplete(mBridge, op.mUserCode, op.mResult, op.mCallbackInvoked);
        	op.mCallbackInvoked = true;
        }
    }

    private void queuePendingOperation(final int pendingOperationCode, final boolean pendingForce) {
        mPendingOperations.add(new Runnable() {
            
            @Override
            public void run() {
                runOperation(pendingOperationCode, pendingForce);
            }
        });
        
        return;
    }
}
