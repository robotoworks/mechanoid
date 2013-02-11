package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class NewMechanoidFileWizard2 extends Wizard implements IWorkbenchWizard {
	@Override
	public boolean performFinish() {
		return false;
	}

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        // TODO Auto-generated method stub
        
    }
}
