package com.robotoworks.mechanoid.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class MechanoidOutputConfigurationProvider extends OutputConfigurationProvider {
	public static final String DEFAULT_STUB_OUTPUT = "DEFAULT_STUB_OUTPUT";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> outputConfigurations = super.getOutputConfigurations();
		
		OutputConfiguration defaultOutput = new OutputConfiguration(DEFAULT_STUB_OUTPUT);
		defaultOutput.setDescription("Stub Folder");
		defaultOutput.setOutputDirectory("./src");
		defaultOutput.setOverrideExistingResources(false);
		defaultOutput.setCreateOutputDirectory(false);
		defaultOutput.setCleanUpDerivedResources(false);
		defaultOutput.setSetDerivedProperty(false);
		defaultOutput.setCanClearOutputDirectory(false);
		outputConfigurations.add(defaultOutput);

		return outputConfigurations;
	}
}
