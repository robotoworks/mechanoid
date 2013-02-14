package com.robotoworks.mechanoid.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;

public abstract class MechanoidWizardPage extends WizardPage {

    public MechanoidWizard getMechanoidWizard() {
        return (MechanoidWizard) getWizard();
    }
    protected MechanoidWizardPage(String pageName) {
        super(pageName);
    }
}
