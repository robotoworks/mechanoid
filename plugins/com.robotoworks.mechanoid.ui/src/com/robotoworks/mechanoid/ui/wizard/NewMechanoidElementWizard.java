package com.robotoworks.mechanoid.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public abstract class NewMechanoidElementWizard extends MechanoidWizard {

    protected abstract IPath createNewResourceFilePath();
    
    @Override
    public boolean performFinish() {
        
        final IPath newFilePath = createNewResourceFilePath();
        
        onBeforeCreateElementResource();
        
        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                try {
                    IResource resource = createElementResource(monitor, newFilePath);

                    openResource((IFile) resource);
                }
                catch (Exception e) {
                    throw new InvocationTargetException(e);
                }
                finally {
                    monitor.done();
                }
            }
        };
        
        try {
            getContainer().run(true, true, op);
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), "Error", realException.getMessage());
            return false;
        } catch (InterruptedException e) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Occurs on the UI thread before the element resource is created
     */
    protected void onBeforeCreateElementResource() {
        
    }

    protected abstract IResource createElementResource(IProgressMonitor monitor, IPath newFilePath);

    protected void selectAndReveal(IResource newResource) {
        BasicNewResourceWizard.selectAndReveal(newResource, getWorkbench().getActiveWorkbenchWindow());
    }
    
    protected void openResource(final IFile resource) {
        final Display display= getShell().getDisplay();
        if (display != null) {
            display.asyncExec(new Runnable() {
                public void run() {
                    try {
                        final IWorkbenchPage activePage = getWorkbench().getActiveWorkbenchWindow().getActivePage();
                        
                        if(activePage != null) {
                            
                            selectAndReveal(resource);
                            
                            IEditorPart editor = IDE.openEditor(activePage, resource, true);
                            editor = null;
                        }
                    } catch (PartInitException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
