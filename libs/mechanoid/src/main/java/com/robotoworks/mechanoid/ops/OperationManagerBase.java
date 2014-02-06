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

@Deprecated
public abstract class OperationManagerBase {
	
	private static final String TAG = "OperationManager";
	
    OperationManagerCallbacks mCallbacks;
    
    private String mStateKey;

	private boolean mEnableLogging;

    private SparseArray<OpInfo> mOperations = new SparseArray<OpInfo>();

    private Queue<Runnable> mPendingOperations = new LinkedList<Runnable>();
    
    private boolean mStarted = false;
    	
    static class OpInfo implements Parcelable {
        int mUserCode = 0;
        int mId = 0;
        boolean mCallbackInvoked = false;
        OperationResult mResult = null;
		public Intent mIntent;
        
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
            mId = in.readInt();
            mCallbackInvoked = in.readInt() > 0;
            mResult = in.readParcelable(OperationResult.class.getClassLoader());
            mIntent = in.readParcelable(Intent.class.getClassLoader());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(mUserCode);
            dest.writeInt(mId);
            dest.writeInt(mCallbackInvoked ? 1 : 0);
            dest.writeParcelable(mResult, 0);
            dest.writeParcelable(mIntent, 0);
        }
    }
    
    private OperationServiceListener mServiceListener = new OperationServiceListener() {

		@Override
		public void onOperationComplete(int id, OperationResult result) {
            OpInfo op = findOperationInfoByRequestId(id);
            
            // This is not our op
            if(op == null) {
                return;
            }
            
            op.mResult = result;
            if(invokeOnOperationComplete(op.mUserCode, result, false)) {
            	op.mCallbackInvoked = true;
            	if(mEnableLogging) {
            		Log.d(TAG, String.format("[Operation Complete] request id:%s, user code:%s", id, op.mUserCode));
            	}
            }
            
		}

    };
    


    protected OperationManagerBase(OperationManagerCallbacks callbacks, boolean enableLogging) {
        mCallbacks = callbacks;
		mEnableLogging = enableLogging;
        mStateKey = "com.robotoworks.mechanoid.ops.OperationManager.State";
    }
    
    public void removeCallbacks() {
    	mCallbacks = null;
    }
    
    public void setCallbacks(OperationManagerCallbacks callbacks) {
    	mCallbacks = callbacks;
    }
    
    private OpInfo findOperationInfoByRequestId(int requestId) {
        for (int i = 0; i < mOperations.size(); i++){
            OpInfo op = mOperations.valueAt(i);
            if (op.mId == requestId) {
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
    	
        Ops.bindListener(mServiceListener);
        
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
            
            if(Ops.isOperationPending(op.mId)) {
            	
            	if(mEnableLogging) {
            		Log.d(TAG, String.format("[Operation Pending] request id: %s, user code:%s", op.mId, op.mUserCode));
            	}
            	
            	invokeOnOperationPending(op.mUserCode);
            	
                continue;
            }
            
            OperationResult result = Ops.getLog().get(op.mId);
            
            if (result != null) {
                op.mResult = result;
                
                if(!op.mCallbackInvoked) {
                	
                    if(invokeOnOperationComplete(op.mUserCode, op.mResult, false)) {
                    	
                    	op.mCallbackInvoked = true;

                    	if(mEnableLogging) {
                    		Log.d(TAG, String.format("[Operation Complete] request id: %s, user code:%s", op.mId, op.mUserCode));
                    	}
                    }
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
    		Log.d(TAG, String.format("[Stopping]"));
    	}
    	
        Ops.unbindListener(mServiceListener);
    }
    
    /**
     * <p>Execute an operation described by the given intent with a user defined code</p>
     * 
     * <p>When the operation completes, {@link OperationManagerCallbacks#onOperationComplete(int, OperationResult, boolean)}
     * will be invoked.</p>
     * <p><b>execute</b> can be invoked many times for the same operation intent, however it will only run the operation once if
     * the <b>force</b> flag is set to false,
     * subsequent calls will be ignored unless the <b>force</b> argument is set to true. In all cases the 
     * {@link OperationManagerCallbacks#onOperationComplete(int, OperationResult, boolean)} will
     * be invoked for each call to runOperation but subsequent calls for the same operation will have the <b>fromCache</b> argument set to true.</p>
     * 
     * <p>Setting the force flag to true, will force the operation to run, if an operation is currently running then it will continue to run but 
     * its result will be ignored and no callbacks will be received.</p>
     *
     * @param code user-defined code representing the operation to run
     * @param force whether to force the operation to run
     */
    public void execute(Intent operationIntent, int code, boolean force) {
        
        if (operationIntent == null) {
        	Log.d(TAG, String.format("[Operation Null] operationintent argument was null, code:%s", code));
        	return;
        }
        
        if(!mStarted) {
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Queue Operation] manager not started, queueing, user code:%s", code));
        	}
            queuePendingOperation(operationIntent, code, force);
            return;
        }
        
        OpInfo op = mOperations.get(code);
        
        if (force || op == null) {
            mOperations.delete(code);
            
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Operation Pending] user code:%s", code));
        	}
        	
            invokeOnOperationPending(code);
            
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Execute Operation] user code:%s", code));
        	}
        	
            OpInfo newOp = new OpInfo();
            newOp.mUserCode = code;
            newOp.mIntent = operationIntent;
            
            mOperations.put(code, newOp);
            
            newOp.mId = Ops.execute(operationIntent);
            
            return;
        }
        
        if(op.mResult != null) {
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Operation Complete] request id: %s, user code:%s, from cache:%s", op.mId, op.mUserCode, op.mCallbackInvoked));
        	}
        	
        	if(invokeOnOperationComplete(op.mUserCode, op.mResult, op.mCallbackInvoked)) {
        		op.mCallbackInvoked = true;
        	}
        }
    }

    private void queuePendingOperation(final Intent operationIntent, final int pendingOperationCode, final boolean pendingForce) {
        mPendingOperations.add(new Runnable() {
            
            @Override
            public void run() {
                execute(operationIntent, pendingOperationCode, pendingForce);
            }
        });
        
        return;
    }
    
    protected boolean invokeOnOperationPending(int code) {
    	if(mCallbacks == null) {
    		return false;
    	}
    	
    	mCallbacks.onOperationPending(code);
    	return true;
    }
    
    protected boolean invokeOnOperationComplete(int code, OperationResult result, boolean fromCache) {
    	if(mCallbacks == null) {
    		return false;
    	}
    	
    	mCallbacks.onOperationComplete(code, result, fromCache);
    	return true;
    }
}
