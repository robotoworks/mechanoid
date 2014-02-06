package com.robotoworks.mechanoid.ui.builder;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class MechanoidXtextAddingEditorCallback extends
        AbstractDirtyStateAwareEditorCallback {

    private static final Logger log = Logger.getLogger(MechanoidXtextAddingEditorCallback.class);

    @Override
    public void afterCreatePartControl(XtextEditor editor) {
        super.afterCreatePartControl(editor);

        IResource resource = editor.getResource();

        if (resource == null) {
            return;
        }

        IProject project = resource.getProject();
        if (!project.isAccessible() || project.isHidden()) {
            return;
        }

        if (!hasNature(project)) {
            toggleNature(project);
        }
    }

    public void toggleNature(IProject project) {
        try {
            IProjectDescription description = project.getDescription();
            String[] natures = description.getNatureIds();

            for (int i = 0; i < natures.length; ++i) {
                if (XtextProjectHelper.NATURE_ID.equals(natures[i])) {
                    // Remove the nature
                    String[] newNatures = new String[natures.length - 1];
                    System.arraycopy(natures, 0, newNatures, 0, i);
                    System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
                    description.setNatureIds(newNatures);
                    project.setDescription(description, null);
                    return;
                }
            }

            // Add the nature
            String[] newNatures = new String[natures.length + 1];
            System.arraycopy(natures, 0, newNatures, 0, natures.length);
            newNatures[natures.length] = XtextProjectHelper.NATURE_ID;
            description.setNatureIds(newNatures);
            project.setDescription(description, null);
        } catch (CoreException e) {
            log.error(e);
        }
    }

    public boolean hasNature(IProject project) {
        return XtextProjectHelper.hasNature(project);
    }
}
