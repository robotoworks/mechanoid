package com.robotoworks.mechanoid;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MechanoidPlugin implements BundleActivator {

	private static BundleContext context;
	
	public static final String MECHANOID_LIB_CLASS = "com.robotoworks.mechanoid.internal.Version";

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		MechanoidPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		MechanoidPlugin.context = null;
	}

}
