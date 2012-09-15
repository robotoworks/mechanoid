package com.robotoworks.mechanoid.sqlite.ui.wizards;


import com.robotoworks.mechanoid.common.wizards.NewMechanoidFileWizard;

public class NewMechDbFileWizard extends NewMechanoidFileWizard {

	@Override
	protected String getFileExtension() {
		return "mechdb";
	}

}