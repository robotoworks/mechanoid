package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.NewFolderDialog;

import com.robotoworks.mechanoid.ui.wizard.fields.BrowseableValueField;

public abstract class NewMechanoidElementPage extends WizardPage {
	
    private BrowseableValueField mFolderField;
    private BrowseableValueField mPackageField;
    private ContentProposalAdapter mPackageProposalAdapter;

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
        
        mFolderField = new BrowseableValueField(group, "Folder:");
        mFolderField.getBrowseButton().addSelectionListener(mFolderFieldButtonSelectedListener);
        
        mPackageField = new BrowseableValueField(group, "Package:");
        
        setupPackageFieldProposals();
    }

    private void setupPackageFieldProposals() {
        try {
            SimpleContentProposalProvider provider = new SimpleContentProposalProvider(
                new String[]{ "some.awesome.package", "some.other.package", "some.awesome.thing"});
            provider.setFiltering(true);
            
            mPackageProposalAdapter = new ContentProposalAdapter(
                mPackageField.getValueField(), 
                new TextContentAdapter(), 
                provider, 
                KeyStroke.getInstance("Ctrl+Space"), 
                new char[] {'.'});
        
            mPackageProposalAdapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    private SelectionListener mFolderFieldButtonSelectedListener = new SelectionListener() {
        
        @Override
        public void widgetSelected(SelectionEvent e) {
            onFolderBrowseButtonSelected(e);
        }
        
        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            onFolderBrowseButtonSelected(e);
        }
    };

    protected void onFolderBrowseButtonSelected(SelectionEvent e) {
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(
            PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), 
            null, true, 
                "Select a parent folder:");
            dialog.setTitle("Select Folder");
            dialog.setBlockOnOpen(true);
            dialog.setInitialSelections(new Object[] { mFolderField.getValueField().getText() });
        if(dialog.open() == Window.OK) {
            mFolderField.getValueField().setText(dialog.getResult()[0].toString());
        }
    }
}
