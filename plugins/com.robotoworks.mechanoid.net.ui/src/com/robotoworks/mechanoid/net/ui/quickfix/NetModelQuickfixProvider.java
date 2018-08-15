package com.robotoworks.mechanoid.net.ui.quickfix;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.ui.MechanoidLibsInstaller;
import com.robotoworks.mechanoid.ui.quickfix.MechanoidQuickfixProvider;

import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;

public class NetModelQuickfixProvider extends MechanoidQuickfixProvider {
    @Inject
    public NetModelQuickfixProvider(IJavaProjectProvider projectProvider, MechanoidLibsInstaller libsInstaller) {
        super(projectProvider, libsInstaller);
    }
}
