package com.robotoworks.mechanoid.ui;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class MechanoidUiPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.robotoworks.mechanoid.ui"; //$NON-NLS-1$

	// The shared instance
	private static MechanoidUiPlugin plugin;
	
	public MechanoidUiPlugin() {}
	
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
	    MechanoidPluginImages.initializeRegistry(reg);
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static MechanoidUiPlugin getPlugin() {
		return plugin;
	}

}
