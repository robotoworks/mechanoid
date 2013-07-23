package com.robotoworks.mechanoid.standalone;

import java.io.File;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.RuntimeIOException;

public class StandaloneFileSystemAccess extends JavaIoFileSystemAccess {
	@Override
	public void generateFile(String fileName, String outputConfigName, CharSequence contents) 
			throws RuntimeIOException {
		OutputConfiguration config = getOutputConfig(outputConfigName);
		
		File file = getFile(fileName, outputConfigName);

		
		if(file.exists()) {
			if(config.isOverrideExistingResources()) {
				System.out.println("generating " + file.getAbsolutePath());
				super.generateFile(fileName, outputConfigName, contents);
			} else {
				System.out.println("skipping " + file.getAbsolutePath() + ", already exists.");
			}
		} else {
			System.out.println("generating " + file.getAbsolutePath());
			super.generateFile(fileName, outputConfigName, contents);
		}
	}
}
