
package com.robotoworks.mechanoid.ui.quickfix;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.ui.MechanoidLibsInstaller;
import com.robotoworks.mechanoid.ui.Messages;
import com.robotoworks.mechanoid.validation.MechanoidIssueCodes;

public abstract class MechanoidQuickfixProvider extends DefaultQuickfixProvider {

    private static final String IMG_ADD_MECHANOID_LIBRARY = "add.gif"; //$NON-NLS-1$
    
    private IJavaProjectProvider projectProvider;
	
    private MechanoidLibsInstaller libsInstaller;
	
    @Inject
    public MechanoidQuickfixProvider(IJavaProjectProvider projectProvider, MechanoidLibsInstaller libsInstaller) {
        this.projectProvider = projectProvider;
        this.libsInstaller = libsInstaller;
    }
    
	@Fix(MechanoidIssueCodes.MISSING_MECHANOID_LIBS)
	public void addMechanoidToClasspath(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
				Messages.MechanoidQuickfixProvider_Button_Add_Mechanoid_Library, 
				Messages.MechanoidQuickfixProvider_Message_Add_Mechanoid_Library, IMG_ADD_MECHANOID_LIBRARY,  
				new ISemanticModification() {
					public void apply(EObject element, IModificationContext context)
							throws Exception {
						ResourceSet resourceSet = element.eResource().getResourceSet();
						IJavaProject javaProject = projectProvider.getJavaProject(resourceSet);
						
						libsInstaller.install(javaProject, new NullProgressMonitor());
					}
				});
	}

}
