package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
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
		
		setPageComplete(false);
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
        mFolderField.getTextField().addModifyListener(mValidatingModifyListener);
        
        mPackageField = new PackageBrowserField(group, "Package:");
        mPackageField.setJavaProject(getMechanoidWizard().getSelectedJavaProject());
        mPackageField.getTextField().addModifyListener(mValidatingModifyListener);
        
        mElementNameField = new TextField(group, "Name:");
        mElementNameField.getTextField().addModifyListener(mValidatingModifyListener);
    }
    
    private ModifyListener mValidatingModifyListener = new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent e) {
            validateAll();
        }
    };

    private void validateAll() {
        setPageComplete(false);

        if(!validateFolderField()) {
            return;
        } 

        onFolderFieldValid();
        
        if(!validatePackageField()) {
            return;
        }

        if(!validateNameField()) {
            return;
        }
        
        setPageComplete(true);
    }
    
    private void onFolderFieldValid() {
        IProject project = mFolderField.getSelectedProject();
        IJavaProject javaProj = JavaCore.create(project);
        mPackageField.setJavaProject(javaProj);
    }

    private boolean validateFolderField() {
        if(mFolderField.getSelectedPath().isEmpty()) {
            setErrorMessage("Folder must be specified.");
            return false;
        } else {
            IProject project = mFolderField.getSelectedProject();
            
            if(project == null) {
                setErrorMessage("The specified project does not exist.");
                return false;
            }
            
        }
        
        setErrorMessage(null);
        
        return true;
    }
    
    private boolean validatePackageField() {
        String packageText = mPackageField.getTextField().getText();
        
        if(packageText.length() == 0) {
            setErrorMessage("Package must be specified.");
            return false;
        }
        
        IStatus status = JavaConventions.validatePackageName(
            packageText, JavaCore.VERSION_1_3, JavaCore.VERSION_1_3);
        
        if(!status.isOK()) {
            setErrorMessage(status.getMessage());
            return false;
        }
        
        setErrorMessage(null);
        
        return true;
        
    }
    
    private boolean validateNameField() {
        String name = mElementNameField.getTextField().getText();
        
        if(name.length() == 0) {
            setErrorMessage("Name must be specified.");
            return false;
        }
        
        // TODO does this need to be more specific?
        IStatus status = JavaConventions.validateIdentifier(name, JavaCore.VERSION_1_3, JavaCore.VERSION_1_3);
        
        if(!status.isOK()) {
            setErrorMessage(String.format("%s is not a valid name.", name));
            return false;
        }
        
        setErrorMessage(null);
        
        return true;
        
    }
}
