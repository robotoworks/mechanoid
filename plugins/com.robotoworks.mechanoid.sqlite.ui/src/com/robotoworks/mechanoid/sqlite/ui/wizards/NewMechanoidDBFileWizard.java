package com.robotoworks.mechanoid.sqlite.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class NewMechanoidDBFileWizard extends Wizard implements IWorkbenchWizard {

    private NewMechanoidDBFilePage mNewFilePage;
    private IWorkbench mWorkbench;
    private IStructuredSelection mSelection;

    public NewMechanoidDBFileWizard() {
        mNewFilePage = new NewMechanoidDBFilePage();
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        mWorkbench = workbench;
        mSelection = selection;
        
    }
    
    @Override
    public void addPages() {
        super.addPages();

        addPage(mNewFilePage);
    }

    @Override
    public boolean performFinish() {
        return false;
    }
}