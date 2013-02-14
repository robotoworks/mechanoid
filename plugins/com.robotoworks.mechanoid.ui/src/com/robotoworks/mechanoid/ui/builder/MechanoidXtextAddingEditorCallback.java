package com.robotoworks.mechanoid.ui.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class MechanoidXtextAddingEditorCallback extends
		AbstractDirtyStateAwareEditorCallback {
	@Inject
	private ToggleXtextNatureAction toggleNature;

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
		
		if (!toggleNature.hasNature(project)) {
			toggleNature.toggleNature(project);
		}
	}
}
