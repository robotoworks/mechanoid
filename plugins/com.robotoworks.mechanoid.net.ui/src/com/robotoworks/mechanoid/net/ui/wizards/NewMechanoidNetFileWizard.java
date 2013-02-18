package com.robotoworks.mechanoid.net.ui.wizards;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.base.Strings;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.NetModelFactory;
import com.robotoworks.mechanoid.net.ui.Messages;
import com.robotoworks.mechanoid.net.ui.internal.NetModelActivator;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementWizard;

public class NewMechanoidNetFileWizard extends NewMechanoidElementWizard {
    
    private static final String FILE_EXTENSION = "mechnet"; //$NON-NLS-1$
    
    @Inject XtextResourceSet mResourceSet;
    
    private NewMechanoidNetServiceClientPage mNewFilePage;

    private String mSelectedPackageName;

    private String mSelectedElementName;

    private String mSelectedBaseUrl;

    public NewMechanoidNetFileWizard() {
        
        Injector injector = NetModelActivator.getInstance().getInjector(NetModelActivator.COM_ROBOTOWORKS_MECHANOID_NET_NETMODEL);
        
        injector.injectMembers(this);
        
        mNewFilePage = new NewMechanoidNetServiceClientPage();
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
        mSelectedBaseUrl = mNewFilePage.getBaseUrlField().getTextField().getText();
    }
    
    @Override
    protected IResource createElementResource(IProgressMonitor monitor, IPath path) {
        try {
            
            if(monitor == null) {
                monitor = new NullProgressMonitor();
            }
            
            monitor.beginTask(Messages.NewMechanoidNetFileWizard_Progress_Message, 1);
            
            URI newEmfResourceURI = URI.createURI("platform:/resource" + //$NON-NLS-1$
                    path
                     .toPortableString());
                     
            Resource emfResource = mResourceSet.createResource(newEmfResourceURI);
            
            Model model = NetModelFactory.eINSTANCE.createModel();
            model.setPackageName(mSelectedPackageName);
            
            emfResource.getContents().add(model);
            
            Client client = (Client) NetModelFactory.eINSTANCE.createClient();
            client.setName(mSelectedElementName);
            
            if(!Strings.isNullOrEmpty(mSelectedBaseUrl)) {
                client.setBaseUrl(mSelectedBaseUrl);
            }
            
            model.getDeclarations().add(client);
            
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