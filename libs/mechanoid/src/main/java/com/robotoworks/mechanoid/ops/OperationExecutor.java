package com.robotoworks.mechanoid.ops;

import java.lang.ref.WeakReference;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * <p>A convenient helper to execute and persist the state of an operation.</p>
 */
public class OperationExecutor {
	
	/**
	 * <p>Execute the operation once only.</p>
	 * <p>In this mode, the operation will only be executed if it has not been executed
	 * before by this executor, to force the operation to execute again, use {@link #MODE_ALWAYS}</p>
	 */
	public static final int MODE_ONCE = 0;
	
	
	/**
	 * <p>Always execute this operation regardless of whether it is currently executing, finished, or
	 * has never been executed at all. Currently executing or completed operations will be abandoned but not aborted by
	 * this executor.</p>
	 */
	public static final int MODE_ALWAYS = 1;
	
	
	/**
	 * <p>Execute the operation only if it has previously completed with an error or if it has never
	 * been executed before.</p>
	 */
	public static final int MODE_ON_ERROR = 2;
	
	private static final String TAG = OperationExecutor.class.getSimpleName();
	
	private static final String STATE_KEY = "com.robotoworks.mechanoid.ops.OperationExecutor.State";
	
	private String mUserStateKey;
	private WeakReference<OperationExecutorCallbacks> mCallbacksRef;
	private boolean mEnableLogging;
	private OpInfo mOpInfo;
	
	public String getKey() {
		return mUserStateKey;
	}
	
	/**
	 * @param key The key used to persist this executor through saved state
	 * @param savedInstanceState The state Bundle to persist the state of this executor to
	 * @param callbacks callbacks that will be invoked during the execution of an operation
	 */
	public OperationExecutor(String key, Bundle savedInstanceState, OperationExecutorCallbacks callbacks) {
		this(key, savedInstanceState, callbacks, false);
	}
	
	/**
	 * @param key The key used to persist this executor through saved state
	 * @param savedInstanceState The state Bundle to persist the state of this executor to
	 * @param callbacks callbacks that will be invoked during the execution of an operation
	 * @param enableLogging enable log output for the executor
	 */
	public OperationExecutor(String key, Bundle savedInstanceState, OperationExecutorCallbacks callbacks, boolean enableLogging) {
		mUserStateKey = key;
		mCallbacksRef = new WeakReference<OperationExecutorCallbacks>(callbacks);
		mEnableLogging = enableLogging;
		
		restoreState(savedInstanceState);
		
        Ops.bindListener(mServiceListener);
        
        ensureCallbacks();
	}
	
	/**
	 * Whether the operation is complete. An operation is considered
	 * complete when the completion callback has been successfully invoked.
	 * 
	 * @return
	 */
	public boolean isComplete() {
		return (mOpInfo != null && mOpInfo.mCallbackInvoked);
	}
	
	/**
	 * <p>Useful if you want to know if the operation completed and is ok.</p>
	 * 
	 * <p>Equivalent to <code>isComplete() && getResult().isOk()</code></p>
	 * 
	 * @return true if the operation completed ok
	 */
	public boolean isOk() {
		return isComplete() && getResult().isOk();
	}
	
	/**
	 * <p>Useful if you want to know if an operation completed but with error.</p>
	 * 
	 * <p>Equivalent to <code>isComplete() && !getResult().isOk()</code></p>
	 * @return true if the operation completed with error
	 */
	public boolean isError() {
		return isComplete() && !getResult().isOk();
	}
	
	/**
	 * Whether the operation is currently pending completion. An operation
	 * is considered pending completion when it is currently executing or
	 * waiting to be executed yet a result has not yet been received.
	 * 
	 * @return true if the operation has been executed but not yet received a result
	 */
	public boolean isPending() {
		return (mOpInfo != null && mOpInfo.mResult == null);
	}
	
	/**
	 * @return the result of this executors operation, or null if an operation
	 * is yet to be executed
	 */
	public OperationResult getResult() {
		if(mOpInfo == null) {
			return null;
		}
		
		return mOpInfo.mResult;
	}
	
	/**
	 * @return The intent that represents the operation to execute, set by {@link #execute(Intent, boolean)}.
	 */
	public Intent getIntent() {
		if(mOpInfo == null) {
			return null;
		}
		
		return mOpInfo.mIntent;
	}
	
    private void restoreState(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            Bundle state = savedInstanceState.getBundle(STATE_KEY);
            
            if(state != null) {
            	state.setClassLoader(OpInfo.class.getClassLoader());
            	mOpInfo = state.getParcelable(mUserStateKey);
            	
            	if(mEnableLogging) {
            		Log.d(TAG, String.format("[Restoring State] key:%s", mUserStateKey));
            	}
            }
        }
    }
    
    /**
     * <p>Saves the state of this operation executor</p>
     * 
     * @param outState The bundle to save the state to
     */
    public void saveState(Bundle outState) {
    	
    	if(mEnableLogging) {
    		Log.d(TAG, String.format("[Saving State] key: %s", mUserStateKey));
    	}
    	
        Bundle state = new Bundle();
        state.putParcelable(mUserStateKey, mOpInfo);
        
        outState.putBundle(STATE_KEY, state);       
    }
	
    private OperationServiceListener mServiceListener = new OperationServiceListener() {

		@Override
		public void onOperationComplete(int id, OperationResult result) {
            if(mOpInfo == null || mOpInfo.mId != id) {
            	return;
            }
            
            mOpInfo.mResult = result;
            
            if(invokeOnOperationComplete(result)) {
            	mOpInfo.mCallbackInvoked = true;
            	if(mEnableLogging) {
            		Log.d(TAG, String.format("[Operation Complete] key: %s", mUserStateKey));
            	}
            }
            
		}

    };
    
    /**
     * Remove the callback associated to this executor, this can be useful
     * in scenarios where you want to ensure that a callback is not received
     * undesirably such as when a fragment is no longer valid
     */
    public void removeCallback() {
    	mCallbacksRef = null;
    }
    
    public void setCallback(OperationExecutorCallbacks callbacks) {
		mCallbacksRef = new WeakReference<OperationExecutorCallbacks>(callbacks);
	}
    

    private void ensureCallbacks() {
    	
    	if(mOpInfo == null) {
    		return;
    	}
    	
    	if(mOpInfo.mResult != null) {
    		completeOperation();
    		return;
    	}
    	
        if(Ops.isOperationPending(mOpInfo.mId)) {
        	
        	if(mEnableLogging) {
        		Log.d(TAG, String.format("[Operation Pending] request id: %s, key: %s", mOpInfo.mId, mUserStateKey));
        	}
        	
        	invokeOnOperationPending();
        	
            return;
        }
        
        OperationResult result = Ops.getLog().get(mOpInfo.mId);
        
        if (result == null) {
        	Log.d(TAG, String.format("[Operation Retry] the log did not contain request id: %s, key: %s, retrying...", mOpInfo.mId, mUserStateKey));
        	
        	executeOperation(mOpInfo.mIntent);
        	
        	return;
        }
        
    	mOpInfo.mResult = result;
        
    	completeOperation();
    }
    
    static class OpInfo implements Parcelable {
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
            dest.writeInt(mId);
            dest.writeInt(mCallbackInvoked ? 1 : 0);
            dest.writeParcelable(mResult, 0);
            dest.writeParcelable(mIntent, 0);
        }
    }
    
    protected boolean invokeOnOperationPending() {
    	if(mCallbacksRef == null) {
    		return false;
    	}
    	
    	OperationExecutorCallbacks callbacks = mCallbacksRef.get();
    	
    	if(callbacks == null) {
    		return false;
    	}
    	
    	callbacks.onOperationPending(mUserStateKey);
    	return true;
    }
    
    protected boolean invokeOnOperationComplete(OperationResult result) {
    	if(mCallbacksRef == null) {
    		return false;
    	}
    	
    	OperationExecutorCallbacks callbacks = mCallbacksRef.get();
    	
    	if(callbacks == null) {
    		return false;
    	}
    	
    	return callbacks.onOperationComplete(mUserStateKey, result);
    }
    
    /**
     * <p>Execute an operation</p>
     * 
     * <p>When the operation completes, {@link OperationExecutorCallbacks#onOperationComplete(OperationExecutor, OperationResult, boolean)}
     * will be invoked.</p>
     * <p><b>execute</b> can be invoked many times for the same operation intent, however it will only run the operation once if
     * the <b>force</b> flag is set to false,
     * subsequent calls will be ignored unless the <b>force</b> argument is set to true. In all cases the 
     * {@link OperationExecutorCallbacks#onOperationComplete(OperationExecutor, OperationResult, boolean)} will
     * be invoked for each call but subsequent calls for the same operation will have the <b>fromCache</b> argument set to true.</p>
     * 
     * <p>Setting the force flag to true, will force the operation to run, if an operation is currently running then it will continue to run but 
     * its result will be ignored and no callbacks will be received.</p>
     *
     * @param operationIntent An intent representing the operation to execute
     * @param force true to force the operation intent to execute, this will abandon any previous operation
     * intent
     */
    public void execute(Intent operationIntent, int mode) {
        
        if (operationIntent == null) {
        	Log.d(TAG, String.format("[Operation Null] operationintent argument was null, key: %s", mUserStateKey));
        	return;
        }
        
        if (mode == MODE_ALWAYS) {
        	mOpInfo = null;
        	executeOperation(operationIntent);
        } else if(mode == MODE_ONCE) {
        	if(mOpInfo == null) {
        		executeOperation(operationIntent);
        	}
        } else if(mode == MODE_ON_ERROR) {
        	if(mOpInfo == null || isError()) {
        		executeOperation(operationIntent);
        	}
        }
        
        completeOperation();
    }
    
    private void completeOperation() {
        if(mOpInfo.mResult != null && !mOpInfo.mCallbackInvoked) {
        	if(invokeOnOperationComplete(mOpInfo.mResult)) {
        		if(mEnableLogging) {
        			Log.d(TAG, String.format("[Operation Complete] request id: %s, key: %s", mOpInfo.mId, mUserStateKey));
        		}
        		
        		mOpInfo.mCallbackInvoked = true;
        	}
        }
    }

	protected void executeOperation(Intent operationIntent) {
		if(mEnableLogging) {
			Log.d(TAG, String.format("[Execute Operation] key: %s", mUserStateKey));
		}
		
		mOpInfo = new OpInfo();
		mOpInfo.mIntent = operationIntent;

		invokeOnOperationPending();
		
		mOpInfo.mId = Ops.execute(operationIntent);
	}
}
