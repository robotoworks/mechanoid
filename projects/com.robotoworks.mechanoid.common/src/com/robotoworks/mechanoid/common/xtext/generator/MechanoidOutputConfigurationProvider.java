package com.robotoworks.mechanoid.common.xtext.generator;

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
		defaultOutput.setSetDerivedProperty(true);
		
		outputConfigurations.add(defaultOutput);

		return outputConfigurations;
	}
}
