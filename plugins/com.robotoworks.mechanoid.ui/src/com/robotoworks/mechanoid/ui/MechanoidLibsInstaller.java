package com.robotoworks.mechanoid.ui;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.osgi.framework.Bundle;

import com.google.common.io.Files;
import com.google.common.io.InputSupplier;

public class MechanoidLibsInstaller {
	
	private static final String MECHANOID_LIB_PATH = "runtime/"; //$NON-NLS-1$
	private static final String MECHANOID_LIB_FILE = "mechanoid.jar"; //$NON-NLS-1$
	private static final String MECHANOID_LIB_SRC_FILE = "mechanoid-sources.jar"; //$NON-NLS-1$
	private static final String MECHANOID_LIB_PROPS_FILE = "mechanoid.jar.properties"; //$NON-NLS-1$
	private static final String ANDROID_LIBS_DIR_NAME = "libs"; //$NON-NLS-1$
	private static final String ANDROID_LIBS_PLUGIN_RESOURCE_BUNDLE = "com.robotoworks.mechanoid"; //$NON-NLS-1$
	
	private String[] LIB_FILE_BUNDLE_PATHS = {
			MECHANOID_LIB_FILE,
			MECHANOID_LIB_SRC_FILE,
			MECHANOID_LIB_PROPS_FILE
	};

	public void install(IJavaProject javaProject, IProgressMonitor progressMonitor) throws IOException, URISyntaxException {

		try {
			SubMonitor progress = SubMonitor.convert(progressMonitor, 2);
			
			installLibs(javaProject, progress.newChild(1));
			
		} catch (Exception e) {
			MechanoidUiPlugin.getPlugin().getLog().log(new Status(Status.ERROR, MechanoidUiPlugin.PLUGIN_ID, Status.OK, Messages.MechanoidLibsInstaller_Message_Failed_To_Add_Libs, e));
		}
		

	}
	
	protected void installLibs(IJavaProject javaProject, IProgressMonitor monitor) throws URISyntaxException, IOException, CoreException {
		Bundle bundle = Platform.getBundle(ANDROID_LIBS_PLUGIN_RESOURCE_BUNDLE);
		
		IPath location = javaProject.getProject().getLocation();
		File libsFolder = new File(location.toOSString(), ANDROID_LIBS_DIR_NAME);
		
		if(!libsFolder.exists()) {
			libsFolder.mkdirs();
		}

		for(String libFileName : LIB_FILE_BUNDLE_PATHS) {
			
			final URL url = FileLocator.resolve(bundle.getEntry(MECHANOID_LIB_PATH + libFileName));
			
			File targetFile = new File(libsFolder, libFileName);
			
			if(targetFile.exists()) {
				targetFile.delete();
			}
			
			Files.copy(new InputSupplier<InputStream>() {
				@Override
				public InputStream getInput() throws IOException {
					return url.openStream();
				}
			}, targetFile);
			
		}

		javaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
}
