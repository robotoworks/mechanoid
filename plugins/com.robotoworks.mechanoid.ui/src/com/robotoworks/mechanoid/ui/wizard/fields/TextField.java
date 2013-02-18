package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TextField {
    private Label mLabel;
    private Text mTextField;
    
    public Text getTextField() {
        return mTextField;
    }

    public TextField(Composite parent, String labelText) {
        this(parent, labelText, true);
    }
    
    public TextField(Composite parent, String labelText, boolean fillRemainingColumns) {

        mLabel = new Label(parent, SWT.NONE);
        mLabel.setText(labelText);
        mLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
        mLabel.setFont(parent.getFont());

        mTextField = new Text(parent, SWT.BORDER);
        mTextField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        mTextField.setFont(parent.getFont());

        mTextField.addModifyListener(new ModifyListener() {
            
            @Override
            public void modifyText(ModifyEvent e) {
                onTextChanged(e);
            }
        });        

        addDummyFillerLabel(parent, fillRemainingColumns);
    }

    protected void addDummyFillerLabel(Composite parent, boolean fillRemainingColumns) {
        //
        // Fill any excess columns with a dummy label
        //
        if(parent.getLayout() instanceof GridLayout && fillRemainingColumns) {
            GridLayout grid = (GridLayout) parent.getLayout();
            int remainingColumns = grid.numColumns - 2;
            
            Label dummy = new Label(parent, SWT.NONE);
            GridData dummyData = new GridData(SWT.FILL, SWT.CENTER, false, false);
            dummyData.horizontalSpan = remainingColumns > 1 ? remainingColumns : 1;
            dummy.setLayoutData(dummyData);
        }
    }
    
    protected void onTextChanged(ModifyEvent e) {
    }
}
