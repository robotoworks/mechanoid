/*
 * Generated by Robotoworks Mechanoid
 */
package com.robotoworks.example.ghissues.ops;

import com.robotoworks.mechanoid.ops.OperationServiceConfiguration;
import com.robotoworks.mechanoid.ops.OperationConfigurationRegistry;

public abstract class AbstractGithubServiceConfiguration extends OperationServiceConfiguration {
	private OperationConfigurationRegistry mOperationConfigurationRegistry = new GithubServiceOperationConfigurationRegistry();
	
	@Override
	public OperationConfigurationRegistry getOperationConfigurationRegistry() {
		return mOperationConfigurationRegistry;
	}
}