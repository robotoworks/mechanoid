package com.robotoworks.mechanoid.db.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.robotoworks.mechanoid.db.ui.messages"; //$NON-NLS-1$
    public static String NewMechanoidDBFileWizard_Message;
    public static String NewMechanoidDBFileWizard_Progress_Message;
    public static String NewMechanoidDBFileWizard_Title;
    public static String NewMechanoidDBFileWizard_Widget_Label_Message_Name;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
