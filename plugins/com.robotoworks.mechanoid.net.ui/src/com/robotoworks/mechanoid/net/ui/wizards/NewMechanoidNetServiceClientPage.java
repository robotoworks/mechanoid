package com.robotoworks.mechanoid.net.ui.wizards;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;

import com.robotoworks.mechanoid.net.ui.Messages;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;
import com.robotoworks.mechanoid.ui.wizard.fields.TextField;

public class NewMechanoidNetServiceClientPage extends NewMechanoidElementPage {
    
    private TextField mBaseUrlField;

    public TextField getBaseUrlField() {
        return mBaseUrlField;
    }
    
    public NewMechanoidNetServiceClientPage() {
        super("new_file_page"); //$NON-NLS-1$
        
        setTitle(Messages.NewMechanoidNetServiceClientPage_Title);
        setDescription(Messages.NewMechanoidNetServiceClientPage_Message);
    }
    
    @Override
    protected String getNameFieldInfoMessage() {
        return Messages.NewMechanoidNetServiceClientPage_Widget_Label_Message_Name;
    }  
    
    @Override
    protected void onAfterAddNameField(Composite parent, Font font) {
        mBaseUrlField = new TextField(parent, Messages.NewMechanoidNetServiceClientPage_Widget_Label_Url);
        mBaseUrlField.getTextField().addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {}
            
            @Override
            public void focusGained(FocusEvent e) {
                getFieldInfoLabel().setText(Messages.NewMechanoidNetServiceClientPage_Widget_Label_Message_Url);
            }
        });
    }
}