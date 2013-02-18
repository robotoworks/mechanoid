/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
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
