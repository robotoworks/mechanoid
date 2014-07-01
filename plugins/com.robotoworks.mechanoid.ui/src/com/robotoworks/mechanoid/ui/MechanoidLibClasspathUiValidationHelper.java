package com.robotoworks.mechanoid.ui;

import java.util.NoSuchElementException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.refactoring.impl.ProjectUtil;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.robotoworks.mechanoid.validation.MechanoidLibClasspathValidationHelper;

public class MechanoidLibClasspathUiValidationHelper extends MechanoidLibClasspathValidationHelper {
    
    @Override
    public boolean shouldValidateMechanoidLibOnClassPath(EObject m) {
        // UNDONE: for some odd reason I am not being injected :(
//        URI resourceUri = EcoreUtil2.getPlatformResourceOrNormalizedURI(m);
//        IProject project = getProject(resourceUri);
//
//        if(JavaProject.hasJavaNature(project)) {
//            return true;
//        }
        
        return true;
    }
    
    @Inject
    private IWorkspace workspace;

    @Inject
    private IStorage2UriMapper mapper;

    /**
     * @return null if there is no such project or the file is not accessible
     */
    public IProject getProject(URI uri) {
        IFile file = findFileStorage(uri, false);
        if(file == null)
            return null;
        return file.getProject();
    }

    /**
     * @return null if there is no such file or the file is not editable
     */
    public IFile findFileStorage(final URI uri, final boolean validateEdit) {
        Iterable<Pair<IStorage, IProject>> storages = mapper.getStorages(uri);
        try {
            Pair<IStorage, IProject> fileStorage = Iterables.find(storages, new Predicate<Pair<IStorage, IProject>>() {
                public boolean apply(Pair<IStorage, IProject> input) {
                    IStorage storage = input.getFirst();
                    if (storage instanceof IFile) {
                        IFile file = (IFile) storage;
                        return file.isAccessible()
                                && (!validateEdit || !file.isReadOnly() || workspace.validateEdit(new IFile[] { file },
                                        null).isOK());
                    }
                    return false;
                }
            });
            return (IFile) fileStorage.getFirst();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
