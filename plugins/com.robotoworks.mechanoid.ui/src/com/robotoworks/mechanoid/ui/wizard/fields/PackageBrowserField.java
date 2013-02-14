package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class PackageBrowserField extends BrowseableValueTextField {

    private ContentProposalAdapter mPackageProposalAdapter;
    private PackageProposalProvider mProposalProvider;
    private Image mPackageImage;
    
    public void setJavaProject(IJavaProject project) {
        mProposalProvider.setProposalsFromProject(project);
    }
    
    public PackageBrowserField(Composite parent, String labelText) {
        super(parent, labelText);
        
        attachProposalProvider();
        
        parent.addDisposeListener(mDisposeListener);
        
        mPackageImage = JavaPluginImages.DESC_OBJS_PACKAGE.createImage();
        
        getBrowseButton().setVisible(false);
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
            
            mPackageProposalAdapter.setLabelProvider(new LabelProvider() {
                @Override
                public Image getImage(Object element) {
                    return mPackageImage;
                }
                
                @Override
                public String getText(Object element) {
                    PackageProposal p = (PackageProposal) element;
                    return p.getContent();
                }
            });
            
            mPackageProposalAdapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void onBrowseButtonPressed() {
        Shell shell = PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();

        ListDialog dialog = new ListDialog(shell);
        dialog.setContentProvider(new WorkbenchContentProvider());
        dialog.setInput("hi");
        dialog.setLabelProvider(new WorkbenchLabelProvider());
        dialog.setBlockOnOpen(true);
        
        if(dialog.open() == Window.OK) {
            // TODO
        }
    }
    
    private DisposeListener mDisposeListener = new DisposeListener() {
        @Override
        public void widgetDisposed(DisposeEvent e) {
            if(mPackageImage != null) {
                mPackageImage.dispose();
            }
        }
    };
}
