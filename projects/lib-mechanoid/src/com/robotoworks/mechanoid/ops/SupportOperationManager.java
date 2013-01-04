package com.robotoworks.mechanoid.ops;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import com.robotoworks.mechanoid.ops.OperationServiceBridge;

public class SupportOperationManager<T extends OperationServiceBridge> extends OperationManagerBase<T> {

    public SupportOperationManager(FragmentManager fragmentManager, T bridge, OperationManagerCallbacks<T> callbacks) {
        super(bridge, callbacks);
        
        String tag = bridge.getClass().getName() + ".OperationManager.Tag";
        
        PersistenceFragment frag = (PersistenceFragment) fragmentManager.findFragmentByTag(tag);
        if(frag == null) {
            frag = new PersistenceFragment();
            frag.setOperationManager(this);
            fragmentManager.beginTransaction().add(frag, tag).commit();
        } else {
            frag.setOperationManager(this);
        }
        
    }
    
    public static class PersistenceFragment extends Fragment {
        private OperationManagerBase<?> mOperationManager;

        void setOperationManager(OperationManagerBase<?> operationManager) {
            mOperationManager = operationManager;
        }
        
        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            mOperationManager.restoreState(savedInstanceState);
        }
        
        @Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            mOperationManager.saveState(outState);
        }
        
        @Override
        public void onStart() {
            super.onStart();
            mOperationManager.start();
        }
        
        @Override
        public void onStop() {
            super.onStop();
            mOperationManager.stop();
        }
    }
}
