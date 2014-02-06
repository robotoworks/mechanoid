package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public abstract class MechanoidWizard extends Wizard implements IWorkbenchWizard {
    
    private IWorkbench mWorkbench;
    private IStructuredSelection mSelection;
    private IJavaProject mSelectedJavaProject;
    private IFolder mSelectedFolder;
    private IProject mSelectedProject;
    
    public IWorkbench getWorkbench() {
        return mWorkbench;
    }
    
    public IJavaProject getSelectedJavaProject() {
        return mSelectedJavaProject;
    }
    
    public IProject getSelectedProject() {
        return mSelectedProject;
    }
    
    public IFolder getSelectedFolder() {
        return mSelectedFolder;
    }
    
    public IStructuredSelection getSelection() {
        return mSelection;
    }
    
	@Override
	public boolean performFinish() {
		return false;
	}

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        mWorkbench = workbench;
        mSelection = selection;
        
        extractSelectionInfo();
    }

    private void extractSelectionInfo() {
        
        if(mSelection.isEmpty()) {
            return;
        }

        if(mSelection instanceof ITreeSelection) {
            ITreeSelection treeSelection = (ITreeSelection) mSelection;
            TreePath[] paths = treeSelection.getPaths();
            
            if(paths.length > 0) {
                for(int i=0; i < paths[0].getSegmentCount(); i++) {
                    Object segment = paths[0].getSegment(i);
                    
                    if(segment instanceof IJavaProject) {
                        mSelectedJavaProject = (IJavaProject) segment;
                        mSelectedProject = mSelectedJavaProject.getProject();
                    }
                    
                    if(segment instanceof IFolder) {
                        mSelectedFolder = (IFolder) segment;
                    }
                    
                    if(segment instanceof IProject) {
                        mSelectedProject = (IProject) segment;
                    }
                }
            }
        }
    }
    
}
