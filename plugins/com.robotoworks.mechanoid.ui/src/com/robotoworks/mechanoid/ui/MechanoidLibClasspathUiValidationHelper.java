package com.robotoworks.mechanoid.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.refactoring.impl.ProjectUtil;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.validation.MechanoidLibClasspathValidationHelper;

public class MechanoidLibClasspathUiValidationHelper extends MechanoidLibClasspathValidationHelper {
    
    @Inject ProjectUtil projectUtil;
    
    @Override
    public boolean shouldValidateMechanoidLibOnClassPath(EObject m) {
        URI resourceUri = EcoreUtil2.getPlatformResourceOrNormalizedURI(m);
        IProject project = projectUtil.getProject(resourceUri);

        if(JavaProject.hasJavaNature(project)) {
            return true;
        }
        
        return false;
    }
}
