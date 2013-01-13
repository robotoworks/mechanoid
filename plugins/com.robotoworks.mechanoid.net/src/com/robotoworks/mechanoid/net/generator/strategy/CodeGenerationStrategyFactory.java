package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;

public class CodeGenerationStrategyFactory {
	public CodeGenerationStrategy create(CodeGenerationContext context, String type){
		CodeGenerationStrategy strategy = new CodeGenerationStrategy();
		strategy.setContext(context);
		return strategy;
	}
}
