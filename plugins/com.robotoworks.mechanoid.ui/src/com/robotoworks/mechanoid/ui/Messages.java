package com.robotoworks.mechanoid.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.robotoworks.mechanoid.ui.messages"; //$NON-NLS-1$
    
    public static String BrowseableValueTextField_Button_Browse;

    public static String ContainerBrowserField_ContainerSelectionDialog_Message;

    public static String ContainerBrowserField_Title;

    public static String MechanoidLibsInstaller_Message_Failed_To_Add_Libs;
    public static String MechanoidQuickfixProvider_Button_Add_Mechanoid_Library;
    public static String MechanoidQuickfixProvider_Message_Add_Mechanoid_Library;
    public static String NewMechanoidElementPage_Widget_Field_ValidationMessage_Invalid_Folder;
    public static String NewMechanoidElementPage_Widget_Field_ValidationMessage_Invalid_Name;
    public static String NewMechanoidElementPage_Widget_Field_ValidationMessage_Required_Folder;
    public static String NewMechanoidElementPage_Widget_Field_ValidationMessage_Required_Name;
    public static String NewMechanoidElementPage_Widget_Field_ValidationMessage_Required_Package;
    public static String NewMechanoidElementPage_Widget_Group_Button_Label_Mechanoid_Library;
    public static String NewMechanoidElementPage_Widget_Group_Mechanoid_Library;
    public static String NewMechanoidElementPage_Widget_Group_Mechanoid_Library_Message;
    public static String NewMechanoidElementPage_Widget_Label_Folder;
    public static String NewMechanoidElementPage_Widget_Label_Message_Folder;
    public static String NewMechanoidElementPage_Widget_Label_Message_Name;
    public static String NewMechanoidElementPage_Widget_Label_Message_Package;
    public static String NewMechanoidElementPage_Widget_Label_Name;
    public static String NewMechanoidElementPage_Widget_Label_Package;
    public static String NewMechanoidElementWizard_Dialog_CreateResourceError_Title;
    
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
