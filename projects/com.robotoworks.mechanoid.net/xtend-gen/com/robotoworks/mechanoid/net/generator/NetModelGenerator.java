package com.robotoworks.mechanoid.net.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.strategy.CodeGenerationStrategy;
import com.robotoworks.mechanoid.net.generator.strategy.CodeGenerationStrategyFactory;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class NetModelGenerator implements IGenerator {
  @Inject
  private CodeGenerationStrategyFactory codeGenerationStrategyFactory;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CodeGenerationContext _codeGenerationContext = new CodeGenerationContext();
    CodeGenerationContext cgContext = _codeGenerationContext;
    CodeGenerationStrategy strategy = this.codeGenerationStrategyFactory.create(cgContext, null);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    strategy.generate(fsa, ((Model) _head));
  }
}
