package com.robotoworks.mechanoid.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;


/**
 * See JavaPluginImages when this is needed
 */
public class MechanoidPluginImages {
    private static final String NAME_PREFIX= "com.robotoworks.mechanoid.ui."; //$NON-NLS-1$
    
    public static final String IMG_INFO_LABEL = NAME_PREFIX + "info_icon.gif";  //$NON-NLS-1$
    
    public static void initializeRegistry(ImageRegistry registry) {
        
        MechanoidUiPlugin plugin = MechanoidUiPlugin.getPlugin();
        Bundle bundle = plugin.getBundle();
        
        registry.put(IMG_INFO_LABEL, createDescriptor(bundle, "images/info_icon.gif")); //$NON-NLS-1$
    }
    
    private static ImageDescriptor createDescriptor(Bundle bundle, String path) {
        return ImageDescriptor.createFromURL(bundle.getResource(path));
    }
}
