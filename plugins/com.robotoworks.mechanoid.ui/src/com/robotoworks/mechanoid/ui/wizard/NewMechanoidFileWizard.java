package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public abstract class NewMechanoidFileWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private FileCreationPage fileCreationPage;

	@Override
	public boolean performFinish() {
        IFile file = fileCreationPage.createNewFile();
        if (file == null) {
			return false;
		}
        
        IWorkbenchWindow dw = workbench.getActiveWorkbenchWindow();
        
        BasicNewResourceWizard.selectAndReveal(file, dw);

        // Open editor on new file.
        try {
            if (dw != null) {
                IWorkbenchPage page = dw.getActivePage();
                if (page != null) {
                    IDE.openEditor(page, file, true);
                }
            }
        } catch (PartInitException e) {
            DialogUtil.openError(dw.getShell(), ResourceMessages.FileResource_errorMessage, 
                    e.getMessage(), e);
        }

        return true;
	}
	
	protected abstract String getFileExtension();
	protected abstract String getFileTypeDescription();
	
	@Override
	public void addPages() {
		super.addPages();

		this.fileCreationPage = new FileCreationPage(selection, getFileExtension(), getFileTypeDescription());
		
		addPage(fileCreationPage);
	}
	


	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setNeedsProgressMonitor(true);
	}
	
}