package com.robotoworks.mechanoid.sqlite.ui.wizards;

import com.robotoworks.mechanoid.ui.wizard.NewMechanoidFileWizard;



public class NewMechDbFileWizard extends NewMechanoidFileWizard {

	@Override
	protected String getFileExtension() {
		return "mechdb";
	}

}