package com.robotoworks.mechanoid.net.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.robotoworks.mechanoid.net.ui.messages"; //$NON-NLS-1$
    public static String NewMechanoidNetServiceClientPage_Message;
    public static String NewMechanoidNetFileWizard_Progress_Message;
    public static String NewMechanoidNetServiceClientPage_Title;
    public static String NewMechanoidNetServiceClientPage_Widget_Label_Message_Name;
    public static String NewMechanoidNetServiceClientPage_Widget_Label_Message_Url;
    public static String NewMechanoidNetServiceClientPage_Widget_Label_Url;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
