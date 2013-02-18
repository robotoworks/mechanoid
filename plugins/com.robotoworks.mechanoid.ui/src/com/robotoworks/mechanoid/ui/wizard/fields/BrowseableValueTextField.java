package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.robotoworks.mechanoid.ui.Messages;

public class BrowseableValueTextField extends TextField {

    protected Button mBrowseButton;


    public Button getBrowseButton() {
        return mBrowseButton;
    }
    
    public BrowseableValueTextField(Composite parent, String labelText) {
        super(parent, labelText, false);
        
        mBrowseButton = new Button(parent, SWT.PUSH);
        mBrowseButton.setText(Messages.BrowseableValueTextField_Button_Browse);
        mBrowseButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
        mBrowseButton.setFont(parent.getFont()); 
        
        mBrowseButton.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                onBrowseButtonPressed();
            }
            
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                onBrowseButtonPressed();
            }
        });
    }

    protected void onBrowseButtonPressed() {
    }
}
