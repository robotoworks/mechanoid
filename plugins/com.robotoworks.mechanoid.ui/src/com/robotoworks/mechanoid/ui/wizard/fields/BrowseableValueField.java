package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class BrowseableValueField {
    private Label mLabel;
    private Text mValueField;
    private Button mBrowseButton;

    public Button getBrowseButton() {
        return mBrowseButton;
    }
    
    public Text getValueField() {
        return mValueField;
    }
    
    public BrowseableValueField(Composite parent, String labelText) {
        mLabel = new Label(parent, SWT.NONE);
        mLabel.setText(labelText);
        mLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
        mLabel.setFont(parent.getFont());
        
        mValueField = new Text(parent, SWT.BORDER);
        mValueField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        mValueField.setFont(parent.getFont());
        
        mBrowseButton = new Button(parent, SWT.PUSH);
        mBrowseButton.setText("Browse...");
        mBrowseButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
        mBrowseButton.setFont(parent.getFont());        
    }
}
