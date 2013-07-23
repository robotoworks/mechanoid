
package com.robotoworks.mechanoid.ops.ui.quickfix;

import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.ui.MechanoidLibsInstaller;
import com.robotoworks.mechanoid.ui.quickfix.MechanoidQuickfixProvider;

public class OpServiceModelQuickfixProvider extends MechanoidQuickfixProvider {
    @Inject
    public OpServiceModelQuickfixProvider(IJavaProjectProvider projectProvider, MechanoidLibsInstaller libsInstaller) {
        super(projectProvider, libsInstaller);
    }
}
