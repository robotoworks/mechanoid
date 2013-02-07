package com.robotoworks.mechanoid.ui.builder;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

public class MechanoidBuilderParticipant extends BuilderParticipant {
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		super.build(context, monitor);
	}
	
	@Override
	protected void handleChangedContents(Delta delta,
			IBuildContext context,
			EclipseResourceFileSystemAccess2 fileSystemAccess)
			throws CoreException {
		
		ensureSourceFolders(context, fileSystemAccess);
		
		super.handleChangedContents(delta, context, fileSystemAccess);
	}

	private void ensureSourceFolders(IBuildContext context,
			EclipseResourceFileSystemAccess2 fileSystemAccess)
			throws CoreException {
		IProject project = context.getBuiltProject();

		for(OutputConfiguration config : fileSystemAccess.getOutputConfigurations().values()) {
			IFolder folder =  project.getFolder(new Path(config.getOutputDirectory()));
			makeSourceFolder(folder, null);
		}
	}
	
	private void makeSourceFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {
		
		// make it a source folder
		IJavaProject jp = JavaCore.create(folder.getProject());
		if (jp.exists()) {
			IClasspathEntry srcFolderClasspathEntry = JavaCore.newSourceEntry(folder.getFullPath());
			IClasspathEntry[] newClassPath;
			IClasspathEntry[] classPath = jp.getRawClasspath();
			for (IClasspathEntry classPathEntry : classPath) {
				if (classPathEntry.equals(srcFolderClasspathEntry)) {
					return;
				}
			}
			
			newClassPath = new IClasspathEntry[classPath.length + 1];
			System.arraycopy(classPath, 0, newClassPath, 1, classPath.length);
			newClassPath[0] = srcFolderClasspathEntry;
			jp.setRawClasspath(newClassPath, monitor);
		}
	}
}