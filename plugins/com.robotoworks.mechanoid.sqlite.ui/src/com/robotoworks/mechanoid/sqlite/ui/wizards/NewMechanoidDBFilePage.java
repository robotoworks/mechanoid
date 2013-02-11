package com.robotoworks.mechanoid.sqlite.ui.wizards;

import org.eclipse.swt.widgets.Composite;

import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;

public class NewMechanoidDBFilePage extends NewMechanoidElementPage {
	public NewMechanoidDBFilePage() {
		super("new_file_page");
		
		setTitle("Hello World");
	}
	
	@Override
	public void createControl(Composite parent) {
	    super.createControl(parent);
	}
}
