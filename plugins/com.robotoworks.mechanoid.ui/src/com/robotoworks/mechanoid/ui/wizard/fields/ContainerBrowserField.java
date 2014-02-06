package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import com.robotoworks.mechanoid.ui.Messages;

public class ContainerBrowserField extends BrowseableValueTextField {
    
    private IPath mSelectedPath = Path.EMPTY;
    
    private IWorkspaceRoot mWorkspaceRoot;

    private IProject mSelectedProject;
    
    public IProject getSelectedProject() {
        return mSelectedProject;
    }

    public ContainerBrowserField(Composite parent, String labelText, IContainer initialRoot) {
        super(parent, labelText);

        mWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        
        if(initialRoot != null) {
            mSelectedPath = initialRoot.getFullPath();
            getTextField().setText(mSelectedPath.toPortableString());
        }
    }
    
    public IPath getSelectedPath() {
        return mSelectedPath;
    }
    
    @Override
    protected void onBrowseButtonPressed() {
        
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(
            PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), 
            (IContainer) mWorkspaceRoot.findMember(mSelectedPath), 
            true, Messages.ContainerBrowserField_ContainerSelectionDialog_Message);
            dialog.setTitle(Messages.ContainerBrowserField_Title);
            dialog.setBlockOnOpen(true);
        if(dialog.open() == Window.OK) {
            mSelectedPath = (IPath) dialog.getResult()[0];
            getTextField().setText(mSelectedPath.toPortableString());
        }
    }
    
    @Override
    protected void onTextChanged(ModifyEvent e) {
        super.onTextChanged(e);
        
        mSelectedPath = Path.fromPortableString(getTextField().getText());
        
        if(mSelectedPath.segmentCount() > 0) {
            IPath firstPart = mSelectedPath.uptoSegment(1);
            IContainer container = (IContainer) mWorkspaceRoot.findMember(firstPart);
            
            if(container != null && container instanceof IProject) {
                mSelectedProject = (IProject) container;
            } else {
                mSelectedProject = null;
            }
        }
    }
}
