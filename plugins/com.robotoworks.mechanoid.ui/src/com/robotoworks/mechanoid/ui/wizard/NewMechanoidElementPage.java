package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.robotoworks.mechanoid.ui.MechanoidPluginImages;
import com.robotoworks.mechanoid.ui.MechanoidUiPlugin;
import com.robotoworks.mechanoid.ui.Messages;
import com.robotoworks.mechanoid.ui.wizard.fields.ContainerBrowserField;
import com.robotoworks.mechanoid.ui.wizard.fields.PackageBrowserField;
import com.robotoworks.mechanoid.ui.wizard.fields.TextField;

public class NewMechanoidElementPage extends MechanoidWizardPage {
	
    private ContainerBrowserField mFolderField;
    private PackageBrowserField mPackageField;
    private TextField mElementNameField;
    private Label mFieldInfoLabel;
    
    public String getSelectedPackageName() {
        return mPackageField.getTextField().getText();
    }
    
    public IPath getSelectedFolderPath() {
        return mFolderField.getSelectedPath();
    }
    
    public String getSelectedElementName() {
        return mElementNameField.getTextField().getText();
    }
    
    public NewMechanoidElementPage(String pageName) {
		super(pageName);
		
		setPageComplete(false);
	}
    
    public Label getFieldInfoLabel() {
        return mFieldInfoLabel;
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
        
        createFields(topLevel, parent.getFont());
        
        setControl(topLevel);
	}
	
    protected void createFields(Composite parent, Font font) {
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
            
        mFolderField = new ContainerBrowserField(group, Messages.NewMechanoidElementPage_Widget_Label_Folder, initialRoot);
        mFolderField.getTextField().addModifyListener(mValidatingModifyListener);
        mFolderField.getTextField().addFocusListener(mFieldFocusedListener);
        
        mPackageField = new PackageBrowserField(group, Messages.NewMechanoidElementPage_Widget_Label_Package);
        mPackageField.setJavaProject(getMechanoidWizard().getSelectedJavaProject());
        mPackageField.getTextField().addModifyListener(mValidatingModifyListener);
        mPackageField.getTextField().addFocusListener(mFieldFocusedListener);
        
        mElementNameField = new TextField(group, Messages.NewMechanoidElementPage_Widget_Label_Name);
        mElementNameField.getTextField().addModifyListener(mValidatingModifyListener);
        mElementNameField.getTextField().addFocusListener(mFieldFocusedListener);
        mElementNameField.getTextField().addFocusListener(mFieldFocusedListener);
        
        onAfterAddNameField(group, font);
        
        Label seperator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
        seperator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        createFieldInfoLabel(parent);
        
        //createAddMechanoidLibraryGroup(parent);
    }
    
    protected void onAfterAddNameField(Composite parent, Font font) {
        
    }

    private FocusListener mFieldFocusedListener = new FocusListener() {
        @Override
        public void focusLost(FocusEvent e) {}
        
        @Override
        public void focusGained(FocusEvent e) {
            if(e.widget == mFolderField.getTextField()) {
                mFieldInfoLabel.setText(getFolderFieldInfoMessage());
            } else if(e.widget == mPackageField.getTextField()) {
                mFieldInfoLabel.setText(getPackageFieldInfoMessage());
            } else if(e.widget == mElementNameField.getTextField()) {
                mFieldInfoLabel.setText(getNameFieldInfoMessage());
            }
            
            mFieldInfoLabel.getParent().layout();
        }
    };
    
    protected String getFolderFieldInfoMessage() {
        return Messages.NewMechanoidElementPage_Widget_Label_Message_Folder;
    }
    
    protected String getPackageFieldInfoMessage() {
        return Messages.NewMechanoidElementPage_Widget_Label_Message_Package;
    }
    
    protected String getNameFieldInfoMessage() {
        return Messages.NewMechanoidElementPage_Widget_Label_Message_Name;
    }

    private void createFieldInfoLabel(Composite parent) {
        Composite comp = new Composite(parent, SWT.NONE);
        comp.setLayout(new GridLayout(1, true));
        comp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
        mFieldInfoLabel = new Label(comp, SWT.WRAP);
        GridData labelLayoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
        labelLayoutData.horizontalIndent = 24;
        mFieldInfoLabel.setLayoutData(labelLayoutData);
        
        final ControlDecoration deco = new ControlDecoration(mFieldInfoLabel, SWT.LEFT | SWT.TOP);
        
        Image decoImage = MechanoidUiPlugin.getPlugin().getImageRegistry().get(MechanoidPluginImages.IMG_INFO_LABEL);
        //Image decoImage = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR_QUICKFIX).getImage();
        deco.setMarginWidth(8);
        deco.setImage(decoImage);
    }
    
    // UNDONE: Implement this later
//    private boolean isMechanoidLibraryOnClassPath() {
//        IProject project = mFolderField.getSelectedProject();
//        
//        // TODO
//        return false;
//    }
//
//    private void createAddMechanoidLibraryGroup(Composite parent) {
//        Group group = new Group(parent, SWT.NONE);
//        group.setFont(parent.getFont());
//        group.setText(Messages.NewMechanoidElementPage_Widget_Group_Mechanoid_Library);
//        group.setLayout(new GridLayout(1, false));
//        group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
//        
//        Label label = new Label(group, SWT.NONE);
//        label.setFont(group.getFont());
//        label.setText(Messages.NewMechanoidElementPage_Widget_Group_Mechanoid_Library_Message);
//        label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
//        
//        Button enableButton = new Button(group, SWT.CHECK);
//        enableButton.setFont(group.getFont());
//        enableButton.setText(Messages.NewMechanoidElementPage_Widget_Group_Button_Label_Mechanoid_Library);
//        enableButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
//        enableButton.setSelection(true);
//    }

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
            setErrorMessage(Messages.NewMechanoidElementPage_Widget_Field_ValidationMessage_Required_Folder);
            return false;
        } else {
            IProject project = mFolderField.getSelectedProject();
            
            if(project == null) {
                setErrorMessage(Messages.NewMechanoidElementPage_Widget_Field_ValidationMessage_Invalid_Folder);
                return false;
            }
            
        }
        
        setErrorMessage(null);
        
        return true;
    }
    
    private boolean validatePackageField() {
        String packageText = mPackageField.getTextField().getText();
        
        if(packageText.length() == 0) {
            setErrorMessage(Messages.NewMechanoidElementPage_Widget_Field_ValidationMessage_Required_Package);
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
            setErrorMessage(Messages.NewMechanoidElementPage_Widget_Field_ValidationMessage_Required_Name);
            return false;
        }
        
        // TODO does this need to be more specific?
        IStatus status = JavaConventions.validateIdentifier(name, JavaCore.VERSION_1_3, JavaCore.VERSION_1_3);
        
        if(!status.isOK()) {
            setErrorMessage(String.format(Messages.NewMechanoidElementPage_Widget_Field_ValidationMessage_Invalid_Name, name));
            return false;
        }
        
        setErrorMessage(null);
        
        return true;
        
    }

}
