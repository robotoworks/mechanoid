package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.robotoworks.mechanoid.ui.wizard.fields.ContainerBrowserField;
import com.robotoworks.mechanoid.ui.wizard.fields.PackageBrowserField;
import com.robotoworks.mechanoid.ui.wizard.fields.TextField;

public abstract class NewMechanoidElementPage extends MechanoidWizardPage {
	
    private ContainerBrowserField mFolderField;
    private PackageBrowserField mPackageField;
    private TextField mElementNameField;

    protected NewMechanoidElementPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
	    initializeDialogUnits(parent);
        // top level group
        Composite topLevel = new Composite(parent, SWT.NONE);
        topLevel.setLayout(new GridLayout());
        topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
                | GridData.HORIZONTAL_ALIGN_FILL));
        topLevel.setFont(parent.getFont());
        //PlatformUI.getWorkbench().getHelpSystem().setHelp(topLevel,
        //        IIDEHelpContextIds.NEW_FILE_WIZARD_PAGE);
        
        addFields(topLevel, parent.getFont());
        
        setControl(topLevel);
	}
	
    private void addFields(Composite parent, Font font) {
        Composite group = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        layout.marginWidth = 0;
        
        group.setLayout(layout);
        group.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
                | GridData.GRAB_HORIZONTAL));
        group.setFont(font);
        
        IContainer initialRoot = getMechanoidWizard().getSelectedFolder() != null ? 
            getMechanoidWizard().getSelectedFolder() : getMechanoidWizard().getSelectedProject();
            
        mFolderField = new ContainerBrowserField(group, "Folder:", initialRoot);
        
        mFolderField.getTextField().addModifyListener(mFolderTextModifyListener);
        
        mPackageField = new PackageBrowserField(group, "Package:");
        mPackageField.setJavaProject(getMechanoidWizard().getSelectedJavaProject());
        
        mElementNameField = new TextField(group, "Name:");
    }
    
    private ModifyListener mFolderTextModifyListener = new ModifyListener() {
        @Override
        public void modifyText(ModifyEvent e) {
            if(mFolderField.getSelectedPath() == null) {
                setErrorMessage("Invalid Path must be /project/folder, ie:- /myproject/model");
            } else {
                setErrorMessage(null);
            }
        }
    };
}
