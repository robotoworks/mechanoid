package com.robotoworks.mechanoid.db.ui.quickfix;

import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.ui.MechanoidLibsInstaller;
import com.robotoworks.mechanoid.ui.quickfix.MechanoidQuickfixProvider;

public class SqliteModelQuickfixProvider extends MechanoidQuickfixProvider {
    
    @Inject
    public SqliteModelQuickfixProvider(IJavaProjectProvider projectProvider, MechanoidLibsInstaller libsInstaller) {
        super(projectProvider, libsInstaller);
    }
}
