package com.robotoworks.mechanoid.ops.ui.wizards;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelFactory;
import com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock;
import com.robotoworks.mechanoid.ops.ui.Messages;
import com.robotoworks.mechanoid.ops.ui.internal.OpServiceModelActivator;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementWizard;

public class NewMechanoidOpsFileWizard extends NewMechanoidElementWizard {
    
    private static final String FILE_EXTENSION = "mechops"; //$NON-NLS-1$
    
    @Inject XtextResourceSet mResourceSet;
    
    private NewMechanoidElementPage mNewFilePage;

    private String mSelectedPackageName;

    private String mSelectedElementName;

    public NewMechanoidOpsFileWizard() {
        
        Injector injector = OpServiceModelActivator.getInstance().getInjector(OpServiceModelActivator.COM_ROBOTOWORKS_MECHANOID_OPS_OPSERVICEMODEL);
        
        injector.injectMembers(this);
        
        mNewFilePage = new NewMechanoidElementPage("new_file_page") { //$NON-NLS-1$
            @Override
            protected String getNameFieldInfoMessage() {
                return Messages.NewMechanoidOpsFileWizard_Widget_Label_Message_Name;
            }  
        };
        mNewFilePage.setTitle(Messages.NewMechanoidOpsFileWizard_Title);
        mNewFilePage.setDescription(Messages.NewMechanoidOpsFileWizard_Message);
    }

    @Override
    public void addPages() {
        super.addPages();

        addPage(mNewFilePage);
    }
    
    @Override
    protected IPath createNewResourceFilePath() {
        return mNewFilePage.getSelectedFolderPath()
                .append(mNewFilePage.getSelectedElementName())
                .addFileExtension(FILE_EXTENSION);
    }
    
    @Override
    protected void onBeforeCreateElementResource() {
        mSelectedPackageName = mNewFilePage.getSelectedPackageName();
        mSelectedElementName = mNewFilePage.getSelectedElementName();
    }
    
    @Override
    protected IResource createElementResource(IProgressMonitor monitor, IPath path) {
        try {
            
            if(monitor == null) {
                monitor = new NullProgressMonitor();
            }
            
            monitor.beginTask(Messages.NewMechanoidOpsFileWizard_Progress_Message, 1);
            
            URI newEmfResourceURI = URI.createURI("platform:/resource" + //$NON-NLS-1$
                    path
                     .toPortableString());
                     
            Resource emfResource = mResourceSet.createResource(newEmfResourceURI);
            
            Model model = OpServiceModelFactory.eINSTANCE.createModel();
            model.setPackageName(mSelectedPackageName);
            
            emfResource.getContents().add(model);
            
            ServiceBlock service = (ServiceBlock) OpServiceModelFactory.eINSTANCE.createServiceBlock();
            service.setName(mSelectedElementName);
            model.setService(service);
            
            emfResource.save(Collections.EMPTY_MAP);
            
            IResource resource =  ResourcesPlugin.getWorkspace()
                    .getRoot().findMember(newEmfResourceURI.toPlatformString(true));
            
            monitor.worked(1);
            
            return resource;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}