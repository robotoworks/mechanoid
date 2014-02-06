package com.robotoworks.mechanoid.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyDelegatingOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import com.robotoworks.mechanoid.ui.Messages;

public abstract class NewMechanoidElementWizard extends MechanoidWizard {

    private IResource mNewResource;

    @Override
    public boolean performFinish() {
        
        final IPath newFilePath = createNewResourceFilePath();
        
        onBeforeCreateElementResource();
        
        WorkspaceModifyDelegatingOperation op = new WorkspaceModifyDelegatingOperation(new IRunnableWithProgress() {

            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                try {
                    mNewResource = createElementResource(monitor, newFilePath);
                }
                catch (Exception e) {
                    throw new InvocationTargetException(e);
                }
                finally {
                    monitor.done();
                }
            }
        });
        
        try {
            getContainer().run(true, true, op);
            
            selectAndReveal(mNewResource);
            openResource(mNewResource);
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), Messages.NewMechanoidElementWizard_Dialog_CreateResourceError_Title, realException.getMessage());
            return false;
        } catch (InterruptedException e) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Implementations should return the desired resource file path that should be created, this value
     * is ultimately given to {@link #createElementResource(IProgressMonitor, IPath)} as the path argument.
     * @return
     */
    protected abstract IPath createNewResourceFilePath();
    
    
    /**
     * Occurs before the element resource is created (before {@link #createElementResource(IProgressMonitor, IPath)} is invoked.
     * Implementations can initialize any required fields that might be needed.
     */
    protected void onBeforeCreateElementResource() {
        
    }

    protected abstract IResource createElementResource(IProgressMonitor monitor, IPath newFilePath);

    protected void selectAndReveal(IResource newResource) {
        BasicNewResourceWizard.selectAndReveal(newResource, getWorkbench().getActiveWorkbenchWindow());
    }
    
    protected void openResource(final IResource resource) {
        final IWorkbenchPage activePage = getWorkbench().getActiveWorkbenchWindow().getActivePage();

        if(activePage == null) {
            return;
        }
        
        final Display display = getShell().getDisplay();
        
        if (display == null) {
            return;
        }
        
        display.asyncExec(new Runnable() {
            public void run() {
                try {
                    if(activePage != null) {
                        IEditorPart editor = IDE.openEditor(activePage, (IFile) resource, true);
                        onNewResourceEditorOpened(editor);
                    }
                } catch (PartInitException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    protected void onNewResourceEditorOpened(IEditorPart editor) {
        
    }
}
