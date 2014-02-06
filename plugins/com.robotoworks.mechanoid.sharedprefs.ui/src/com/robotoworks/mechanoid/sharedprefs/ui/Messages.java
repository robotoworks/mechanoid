package com.robotoworks.mechanoid.sharedprefs.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.robotoworks.mechanoid.sharedprefs.ui.messages"; //$NON-NLS-1$
    public static String NewMechanoidPrefsFileWizard_Message;
    public static String NewMechanoidPrefsFileWizard_Progress_Message;
    public static String NewMechanoidPrefsFileWizard_Title;
    public static String NewMechanoidPrefsFileWizard_Widget_Label_Message_Name;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
