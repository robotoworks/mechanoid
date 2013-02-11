package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class ContainerBrowserField extends BrowseableValueTextField {
    private IContainer mSelectedContainer;
    private IPath mSelectedPath;
    private IWorkspaceRoot mWorkspaceRoot;

    public ContainerBrowserField(Composite parent, String labelText, IContainer initialRoot) {
        super(parent, labelText);

        mSelectedContainer = initialRoot;
        
        mWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        
        if(mSelectedContainer != null) {
            mSelectedPath = mSelectedContainer.getFullPath();
            getTextField().setText(mSelectedPath.toPortableString());
        }
    }
    
    public IContainer getSelectedContainer() {
        return mSelectedContainer;
    }
    
    public IPath getSelectedPath() {
        return mSelectedPath;
    }
    
    @Override
    protected void onBrowseButtonPressed() {
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(
            PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), 
            mSelectedContainer, true, "Enter or select parent folder:");
            dialog.setTitle("Select Folder");
            dialog.setBlockOnOpen(true);
            
        if(dialog.open() == Window.OK) {
            mSelectedPath = (IPath) dialog.getResult()[0];
            mSelectedContainer = (IContainer) mWorkspaceRoot.findMember(mSelectedPath);
            getTextField().setText(mSelectedPath.toPortableString());
        }
    }
    
    @Override
    protected void onTextChanged(ModifyEvent e) {
        super.onTextChanged(e);
        mSelectedPath = Path.fromPortableString(getTextField().getText());
        mSelectedContainer = (IContainer) mWorkspaceRoot.findMember(mSelectedPath);        
    }
}
