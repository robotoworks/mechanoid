package com.robotoworks.mechanoid.ops.ui.wizards;

import com.robotoworks.mechanoid.ui.wizard.NewMechanoidFileWizard;

public class NewMechOpsFileWizard extends NewMechanoidFileWizard {

	@Override
	protected String getFileExtension() {
		return "mechops";
	}

	@Override
	protected String getFileTypeDescription() {
		return "Mechanoid Ops File";
	}

}