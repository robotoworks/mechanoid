package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

class FileCreationPage extends WizardNewFileCreationPage {
	
	private String extension;

	public FileCreationPage(IStructuredSelection selection, String extension, String fileTypeDescription) {
		super("setFileName", selection);
		this.extension = extension;
		
		setTitle(fileTypeDescription + " (*." + extension + ")");
		setFileName("untitled." + extension);
	}
	
	 @Override
	protected boolean validatePage() {
		if(!super.validatePage()) {
			return false;
		}
		if(getFileName().endsWith(extension)) {
			setErrorMessage(null);
			return true;
		}
		
		setErrorMessage("Create a valid (*." + extension + ") file");
		
		return false;
	}
}