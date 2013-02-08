package com.robotoworks.mechanoid.net.ui.wizards;

import com.robotoworks.mechanoid.ui.wizard.NewMechanoidFileWizard;

public class NewMechNetFileWizard extends NewMechanoidFileWizard {

	@Override
	protected String getFileExtension() {
		return "mechnet";
	}
	
	@Override
	protected String getFileTypeDescription() {
		return "Mechanoid Net File";
	}

}