
package com.robotoworks.mechanoid.sharedprefs.ui.quickfix;

import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.ui.MechanoidLibsInstaller;
import com.robotoworks.mechanoid.ui.quickfix.MechanoidQuickfixProvider;

public class SharedPreferencesModelQuickfixProvider extends MechanoidQuickfixProvider {
    @Inject
    public SharedPreferencesModelQuickfixProvider(IJavaProjectProvider projectProvider, MechanoidLibsInstaller libsInstaller) {
        super(projectProvider, libsInstaller);
    }
}