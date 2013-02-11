package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.widgets.Composite;

public class PackageBrowserField extends BrowseableValueTextField {

    private ContentProposalAdapter mPackageProposalAdapter;
    private PackageProposalProvider mProposalProvider;
    
    public void setJavaProject(IJavaProject project) {
        mProposalProvider.setProposalsFromProject(project);
    }
    
    public PackageBrowserField(Composite parent, String labelText) {
        super(parent, labelText);
        
        attachProposalProvider();   
    }

    private void attachProposalProvider() {
        try {
            mProposalProvider = new PackageProposalProvider();
            
            mPackageProposalAdapter = new ContentProposalAdapter(
                getTextField(), 
                new TextContentAdapter(), 
                mProposalProvider, 
                KeyStroke.getInstance("Ctrl+Space"), 
                new char[] {'.'});
            
//            mPackageProposalAdapter.setLabelProvider(new LabelProvider() {
//                @Override
//                public Image getImage(Object element) {
//                    new Image()
//                }
//            });
            
            mPackageProposalAdapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
