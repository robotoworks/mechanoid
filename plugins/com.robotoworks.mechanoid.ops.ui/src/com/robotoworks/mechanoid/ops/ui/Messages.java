package com.robotoworks.mechanoid.ops.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.robotoworks.mechanoid.ops.ui.messages"; //$NON-NLS-1$
    public static String NewMechanoidOpsFileWizard_Widget_Label_Message_Name;
    public static String NewMechanoidOpsFileWizard_Message;
    public static String NewMechanoidOpsFileWizard_Progress_Message;
    public static String NewMechanoidOpsFileWizard_Title;
    
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
