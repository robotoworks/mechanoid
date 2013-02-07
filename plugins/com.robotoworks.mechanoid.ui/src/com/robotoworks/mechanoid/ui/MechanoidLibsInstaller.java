package com.robotoworks.mechanoid.ui;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.osgi.framework.Bundle;

import com.google.common.io.Files;

public class MechanoidLibsInstaller {
	
	private static final String MECHANOID_LIB_PATH = "runtime/mechanoid.jar";
	private static final String MECHANOID_LIB_SRC_PATH = "runtime/mechanoid-sources.jar";
	private static final String MECHANOID_LIB_PROPS_PATH = "runtime/mechanoid.jar.properties";
	
	private String[] LIB_FILE_BUNDLE_PATHS = {
			MECHANOID_LIB_PATH,
			MECHANOID_LIB_SRC_PATH,
			MECHANOID_LIB_PROPS_PATH
	};
	
	public void install(IJavaProject javaProject, IProgressMonitor progressMonitor) throws IOException, URISyntaxException {

		try {
			SubMonitor progress = SubMonitor.convert(progressMonitor, 2);
			
			installLibs(javaProject, progress.newChild(1));
			
		} catch (Exception exc) {
			// TODO Log exception
		}
		

	}
	
	protected void installLibs(IJavaProject javaProject, IProgressMonitor monitor) throws URISyntaxException, IOException, CoreException {
		Bundle bundle = Platform.getBundle("com.robotoworks.mechanoid");
		
		IPath location = javaProject.getProject().getLocation();
		File libsFolder = new File(location.toOSString(), "libs");
		
		if(!libsFolder.exists()) {
			libsFolder.mkdirs();
		}

		for(String bundlePath : LIB_FILE_BUNDLE_PATHS) {
			URL url = bundle.getEntry(bundlePath);
			File sourceFile = new File(FileLocator.resolve(url).toURI());
			File targetFile = new File(libsFolder, sourceFile.getName());
			
			if(targetFile.exists()) {
				targetFile.delete();
			}
			
			Files.copy(sourceFile, targetFile);
			
		}

		javaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
}
