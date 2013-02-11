package com.robotoworks.mechanoid.sqlite.ui.wizards;

import com.robotoworks.mechanoid.ui.wizard.MechanoidWizard;

public class NewMechanoidDBFileWizard extends MechanoidWizard {

    private NewMechanoidDBFilePage mNewFilePage;

    public NewMechanoidDBFileWizard() {
        mNewFilePage = new NewMechanoidDBFilePage();
    }

    @Override
    public void addPages() {
        super.addPages();

        addPage(mNewFilePage);
    }

    @Override
    public boolean performFinish() {
        return false;
    }
}