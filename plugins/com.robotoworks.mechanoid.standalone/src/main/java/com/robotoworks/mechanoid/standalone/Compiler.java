package com.robotoworks.mechanoid.standalone;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Lists;
import com.google.inject.Injector;
import com.robotoworks.mechanoid.validation.MechanoidIssueCodes;

public class Compiler {
	
	private Injector mInjector;
	private IGenerator mGenerator;
	private StandaloneFileSystemAccess mFileSystemAccess;
	private XtextResourceSet mResourceSet;
	private String mExtension;

	public Compiler(ISetup setup, Class<? extends IGenerator> generatorClass, String extension) {
		mExtension = extension;
		mInjector = setup.createInjectorAndDoEMFRegistration();
		mGenerator = mInjector.getInstance(generatorClass);
		
		mFileSystemAccess = mInjector.getInstance(StandaloneFileSystemAccess.class);
		
		mResourceSet = mInjector.getInstance(XtextResourceSet.class);
		mResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}
	
	public void compile(String source, String sourceFolder, String stubFolder, boolean recurse) {
		
		Map<String, OutputConfiguration> outputConfigurations = createOutputConfigurations(sourceFolder, stubFolder);
		mFileSystemAccess.setOutputConfigurations(outputConfigurations);
		
		File file = new File(System.getProperty("user.dir"), source);
		
		if(!file.exists()) {
			throw new IllegalStateException("invalid input source");
		}
		
		ArrayList<String> resourcePaths = new ArrayList<String>();
		
		getResourcePaths(resourcePaths, file, recurse);
		
		loadResources(resourcePaths);
		
		List<Issue> issues = validate();
		
		for(Issue issue : issues) {
			System.out.println(issue.getCode() + ":" + issue.getMessage());
		}
		
		if(issues.size() == 0) {
			generate();
		}

	}

	private List<Issue> validate() {
		List<Issue> issues = Lists.newArrayList();
		for (Resource resource : mResourceSet.getResources()) {
			IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(resource.getURI());
			if (resourceServiceProvider != null) {
				IResourceValidator resourceValidator = resourceServiceProvider.getResourceValidator();
				List<Issue> result = resourceValidator.validate(resource, CheckMode.ALL, null);
				
				for(Issue issue : result) {
					if(!issue.getCode().equals(MechanoidIssueCodes.MISSING_MECHANOID_LIBS)) {
						issues.add(issue);
					}
				}
			}
		}
		return issues;
	}

	protected void generate() {
		for(Resource resource : mResourceSet.getResources()) {
			mGenerator.doGenerate(resource, mFileSystemAccess);
		}
	}

	protected void loadResources(ArrayList<String> resourcePaths) {
		for(String path : resourcePaths) {
			mResourceSet.getResource(URI.createFileURI(path), true);
		}
	}

	private void getResourcePaths(ArrayList<String> paths, File file, boolean recurse) {
		
		if(file.isFile() && file.toString().endsWith(mExtension)) {
			paths.add(file.toString());
			return;
		}
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for(File f : files) {
				if(f.isDirectory() && recurse) {
					getResourcePaths(paths, f, recurse);
				} else if (f.isFile() && f.toString().endsWith(mExtension)) {
					paths.add(f.toString());
				}
			}
			
		}
	}

	protected Map<String, OutputConfiguration> createOutputConfigurations(
			String sourceFolder, String stubFolder) {
		Map<String, OutputConfiguration> outputConfigurations = new HashMap<String, OutputConfiguration>();
		outputConfigurations.put("DEFAULT_OUTPUT", createSourceGenOutputConfiguration(sourceFolder));
		outputConfigurations.put("DEFAULT_STUB_OUTPUT", createStubGenOutputConfiguration(stubFolder));
		return outputConfigurations;
	}
	
	private OutputConfiguration createSourceGenOutputConfiguration(String outDir) {
		OutputConfiguration out = new OutputConfiguration("DEFAULT_OUTPUT");
		out.setDescription("Generated Source");
		out.setOutputDirectory(outDir);
		out.setOverrideExistingResources(true);
		out.setCreateOutputDirectory(true);
		out.setCleanUpDerivedResources(true);
		out.setSetDerivedProperty(true);
		out.setCanClearOutputDirectory(true);
		return out;
	}
	
	private OutputConfiguration createStubGenOutputConfiguration(String outDir) {
		OutputConfiguration out = new OutputConfiguration("DEFAULT_STUB_OUTPUT");
		out.setDescription("Generated Source Stubs");
		out.setOutputDirectory(outDir);
		out.setOverrideExistingResources(false);
		out.setCreateOutputDirectory(true);
		out.setCleanUpDerivedResources(false);
		out.setSetDerivedProperty(false);
		out.setCanClearOutputDirectory(false);
		return out;
	}
}
