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

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

@Deprecated
public class OperationManager extends OperationManagerBase {

	private static final String TAG = "OperationManager";
	
	public static OperationManager create(Activity activity, OperationManagerCallbacks callbacks, boolean enableLogging) {

		String tag = "Tags." + callbacks.getClass().getName();
        
        OperationManager operationManager = null;
        
        FragmentManager fm = activity.getFragmentManager();
        
        PersistenceFragment frag = (PersistenceFragment) fm.findFragmentByTag(tag);
        
        if(frag == null) {
        	
        	if(enableLogging) {
        		Log.d(TAG, String.format("[Create Fragment] tag:%s", tag));
        	}
        	
            frag = new PersistenceFragment();
            operationManager = new OperationManager(callbacks, enableLogging);
            frag.setOperationManager(operationManager);
            fm.beginTransaction().add(frag, tag).commit();
        } else {
        	
        	if(enableLogging) {
        		Log.d(TAG, String.format("[Recover Fragment] tag:%s", tag));
        	}
        	
        	operationManager = (OperationManager) frag.getOperationManager();
        	
        	if(operationManager == null) {
            	if(enableLogging) {
            		Log.d(TAG, String.format("[Create Manager] tag:%s", tag));
            	}
            	
        		operationManager = new OperationManager(callbacks, enableLogging);
        		frag.setOperationManager(operationManager);
        	} else {
            	if(enableLogging) {
            		Log.d(TAG, String.format("[Recover Manager] tag:%s", tag));
            	}
            	
        		operationManager.mCallbacks = callbacks;
        	}
        }		
		
		return operationManager;
	}
	
	public static OperationManager create(Activity activity, OperationManagerCallbacks callbacks) {
		return create(activity, callbacks, false);
	}
	
    private OperationManager(OperationManagerCallbacks callbacks, boolean enableLogging) {
        super(callbacks, enableLogging);
    }
    
    public static class PersistenceFragment extends Fragment {
        private OperationManagerBase mOperationManager;
		private Bundle mSavedState;
        
        public void setOperationManager(OperationManagerBase operationManager) {
        	mOperationManager = operationManager;
        	
        	if(mSavedState != null) {
        		mOperationManager.restoreState(mSavedState);
        		mOperationManager.start();
        	}
		}
        
        public OperationManagerBase getOperationManager() {
        	return mOperationManager;
		}
        
        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            
            OperationManagerBase operationManager = getOperationManager();
            
            if(operationManager == null) {
            	mSavedState = savedInstanceState;
            } else {
            	operationManager.restoreState(savedInstanceState);
            }
        }

		@Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            
            OperationManagerBase operationManager = getOperationManager();
            
            if(operationManager != null) {
            	operationManager.saveState(outState);
            } else {
            	removeSelf();
            }
        }
        
		
		@Override
		public void onStart() {
			super.onStart();
			
            OperationManagerBase operationManager = getOperationManager();
            
            if(operationManager != null) {
            	operationManager.start();
            } else {
            	removeSelf();
            }
		}
		
		@Override
		public void onStop() {
			super.onStop();
			
            OperationManagerBase operationManager = getOperationManager();
            
            if(operationManager != null) {
            	operationManager.stop();
            } else {
            	removeSelf();
            }
		}
        
		private void removeSelf() {
			getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
		}
    }
}
