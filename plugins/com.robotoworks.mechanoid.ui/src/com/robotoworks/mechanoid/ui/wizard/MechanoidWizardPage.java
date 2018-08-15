package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;

public abstract class MechanoidWizardPage extends WizardPage {

    protected MechanoidWizardPage(String pageName) {
        super(pageName);
    }

    public MechanoidWizard getMechanoidWizard() {
        return (MechanoidWizard) getWizard();
    }
}
