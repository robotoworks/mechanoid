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

import java.lang.ref.WeakReference;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class SupportOperationManager<T extends OperationServiceBridge> extends OperationManagerBase<T> {

	@SuppressWarnings("unchecked")
	public static <T extends OperationServiceBridge> SupportOperationManager<T> create(FragmentManager fragmentManager, T bridge, OperationManagerCallbacks<T> callbacks) {
		
        String tag = "Tags." + bridge.getClass().getName() + callbacks.getClass().getName();
        
        SupportOperationManager<T> operationManager = null;
        
        PersistenceFragment frag = (PersistenceFragment) fragmentManager.findFragmentByTag(tag);
        if(frag == null) {
        	
            frag = new PersistenceFragment();
            operationManager = new SupportOperationManager<T>(bridge, callbacks);
            frag.setOperationManager(operationManager);
            fragmentManager.beginTransaction().add(frag, tag).commit();
        } else {
        	operationManager = (SupportOperationManager<T>) frag.getOperationManager();
        	
        	if(operationManager == null) {
        		operationManager = new SupportOperationManager<T>(bridge, callbacks);
        		frag.setOperationManager(operationManager);
        	} else {
        		operationManager.mCallbacks = callbacks;
        	}
        }		
		
		return operationManager;
	}
	
    private SupportOperationManager(T bridge, OperationManagerCallbacks<T> callbacks) {
        super(bridge, callbacks);        
    }
    
    public static class PersistenceFragment extends Fragment {
        private WeakReference<OperationManagerBase<?>> mOperationManagerRef;
        
        public void setOperationManager(OperationManagerBase<?> operationManager) {
        	mOperationManagerRef = new WeakReference<OperationManagerBase<?>>(operationManager);
		}
        
        public OperationManagerBase<?> getOperationManager() {
        	if(mOperationManagerRef == null) {
        		return null;
        	}
        	
			return mOperationManagerRef.get();
		}
        
        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            
            OperationManagerBase<?> operationManager = getOperationManager();
            
            if(operationManager != null) {
            	operationManager.restoreState(savedInstanceState);
            } else {
            	removeSelf();
            }
        }

		@Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            
            OperationManagerBase<?> operationManager = getOperationManager();
            
            if(operationManager != null) {
            	operationManager.saveState(outState);
            } else {
            	removeSelf();
            }
        }
        
        @Override
        public void onStart() {
            super.onStart();
            
            OperationManagerBase<?> operationManager = getOperationManager();
            
            if(operationManager != null) {
            	operationManager.start();
            } else {
            	removeSelf();
            }
        }
        
        @Override
        public void onStop() {
            super.onStop();
            
            OperationManagerBase<?> operationManager = getOperationManager();
            
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
