package com.robotoworks.mechanoid.sqlite.ui.wizards;

import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;

public class NewMechanoidDBFilePage extends NewMechanoidElementPage {
	public NewMechanoidDBFilePage() {
		super("new_file_page");
		
		setTitle("Mechanoid DB");
		setDescription("Create a new Mechanoid DB (*.mechdb) file.");
	}
}
