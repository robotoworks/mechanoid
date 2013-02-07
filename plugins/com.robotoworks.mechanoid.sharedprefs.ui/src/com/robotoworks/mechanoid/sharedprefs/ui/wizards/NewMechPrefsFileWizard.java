package com.robotoworks.mechanoid.sharedprefs.ui.wizards;

import com.robotoworks.mechanoid.ui.wizard.NewMechanoidFileWizard;

public class NewMechPrefsFileWizard extends NewMechanoidFileWizard {

	@Override
	protected String getFileExtension() {
		return "mechprefs";
	}

}