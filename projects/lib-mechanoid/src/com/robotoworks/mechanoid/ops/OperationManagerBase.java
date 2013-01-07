package com.robotoworks.mechanoid.ops;

import java.util.LinkedList;
import java.util.Queue;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

import com.robotoworks.mechanoid.ops.OperationServiceBridge;
import com.robotoworks.mechanoid.ops.OperationServiceListener;

public abstract class OperationManagerBase<T extends OperationServiceBridge> {
    OperationManagerCallbacks<T> mCallbacks;
    
    static class OpInfo implements Parcelable {
        int mUserId = 0;
        int mRequestId = 0;
        boolean mCallbackInvoked = false;
        Bundle mResult = null;
        
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
            mUserId = in.readInt();
            mRequestId = in.readInt();
            mCallbackInvoked = in.readInt() > 0;
            mResult = in.readBundle();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(mUserId);
            dest.writeInt(mRequestId);
            dest.writeInt(mCallbackInvoked ? 1 : 0);
            dest.writeBundle(mResult);
        }
    }
    
    private SparseArray<OpInfo> mOperations = new SparseArray<OpInfo>();

    private Queue<Runnable> mPendingOperations = new LinkedList<Runnable>();
    
    private boolean mStarted = false;
    
    private OperationServiceListener mServiceListener = new OperationServiceListener() {
        @Override
        public void onOperationStarting(OperationServiceBridge bridge, int requestId, Bundle data) {
        }
        
        @Override
        public void onOperationProgress(OperationServiceBridge bridge, int requestId, int progress, Bundle data) {
        }
        
        @Override
        public void onOperationComplete(OperationServiceBridge bridge, int requestId, Bundle data) {
            
            // This is not our bridge
            if(mBridge != bridge) {
                return;
            }
            
            OpInfo op = findOperationInfoByRequestId(requestId);
            
            // This is not our op
            if(op == null) {
                return;
            }
            
            op.mResult = data;
            mCallbacks.onOperationComplete((T)mBridge, op.mUserId, data);
            op.mCallbackInvoked = true;
        }
        
        @Override
        public void onOperationAborted(OperationServiceBridge bridge, int requestId, int reason, Bundle data) {
        }
    };
    
    private T mBridge;

    private String mStateKey;


    protected OperationManagerBase(T bridge, OperationManagerCallbacks<T> callbacks) {
        mBridge = bridge;
        mCallbacks = callbacks;
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
            }
        }
    }
    
    void saveState(Bundle outState) {
        Bundle state = new Bundle();
        outState.putSparseParcelableArray("operations", mOperations);
        
        outState.putBundle(mStateKey, state);       
    }
    
    void start() {
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
                mCallbacks.onOperationPending(mBridge, op.mUserId);
                continue;
            }
            
            Bundle result = mBridge.getLog().get(op.mRequestId);
            
            if (result != null) {
                op.mResult = result;
                invokeCallbackOnce(op);
                continue;
            }                    
        }
    }

    private void invokeCallbackOnce(OpInfo op) {
        if(!op.mCallbackInvoked) {
            mCallbacks.onOperationComplete(mBridge, op.mUserId, op.mResult);
            op.mCallbackInvoked = true;
        }
    }

    void stop() {
        mBridge.unbindListener(mServiceListener);
    }
    
    public void runOperation(int id, boolean force) {
        
        if(!mStarted) {
            queuePendingOperation(id, force);
            return;
        }
        
        OpInfo op = mOperations.get(id);
        
        if (force || op == null) {
            mOperations.delete(id);
            
            mCallbacks.onOperationPending(mBridge, id);
            
            int newRequestId = mCallbacks.createOperation(mBridge, id);

            if (newRequestId > 0) {
                OpInfo newOp = new OpInfo();
                newOp.mUserId = id;
                newOp.mRequestId = newRequestId;
                
                mOperations.put(id, newOp);
            }
        } 
    }

    private void queuePendingOperation(final int pendingId, final boolean pendingForce) {
        mPendingOperations.add(new Runnable() {
            
            @Override
            public void run() {
                runOperation(pendingId, pendingForce);
            }
        });
        
        return;
    }
}
