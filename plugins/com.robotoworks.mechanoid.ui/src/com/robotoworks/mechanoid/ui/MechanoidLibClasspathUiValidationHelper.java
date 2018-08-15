package com.robotoworks.mechanoid.ui;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.robotoworks.mechanoid.validation.MechanoidLibClasspathValidationHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;

import java.util.NoSuchElementException;

public class MechanoidLibClasspathUiValidationHelper extends MechanoidLibClasspathValidationHelper {

    @Inject
    private IWorkspace workspace;
    @Inject
    private IStorage2UriMapper mapper;

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

    /**
     * @return null if there is no such project or the file is not accessible
     */
    public IProject getProject(URI uri) {
        IFile file = findFileStorage(uri, false);
        if (file == null) {
            return null;
        }
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
                                && (!validateEdit || !file.isReadOnly() || workspace.validateEdit(new IFile[]{file},
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
