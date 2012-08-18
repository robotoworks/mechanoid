package com.robotoworks.mechanoid.ops.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.common.util.Strings;
import com.robotoworks.mechanoid.common.xtext.generator.MechanoidOutputConfigurationProvider;
import com.robotoworks.mechanoid.ops.generator.OperationGenerator;
import com.robotoworks.mechanoid.ops.generator.OperationProcessorGenerator;
import com.robotoworks.mechanoid.ops.generator.OperationRegistryGenerator;
import com.robotoworks.mechanoid.ops.generator.ServiceBridgeGenerator;
import com.robotoworks.mechanoid.ops.generator.ServiceGenerator;
import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.Operation;
import com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OpServiceModelGenerator implements IGenerator {
  @Inject
  private OperationGenerator mOperationGenerator;
  
  @Inject
  private ServiceBridgeGenerator mServiceBridgeGenerator;
  
  @Inject
  private ServiceGenerator mServiceGenerator;
  
  @Inject
  private OperationProcessorGenerator mOperationProcessorGenerator;
  
  @Inject
  private OperationRegistryGenerator mOperationRegistryGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    this.generateOperationProcessor(resource, fsa);
    this.generateService(resource, fsa);
    this.generateServiceBridge(resource, fsa);
    this.generateOperationRegistry(resource, fsa);
    ServiceBlock _service = model.getService();
    EList<Operation> _ops = _service.getOps();
    final Procedure1<Operation> _function = new Procedure1<Operation>() {
        public void apply(final Operation item) {
          OpServiceModelGenerator.this.generateOps(resource, fsa, item);
        }
      };
    IterableExtensions.<Operation>forEach(_ops, _function);
  }
  
  public void generateOps(final Resource resource, final IFileSystemAccess fsa, final Operation op) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    String _name = op.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = "Abstract".concat(_pascalize);
    String _concat_1 = _concat.concat("Operation");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
    CharSequence _generate = this.mOperationGenerator.generate(model, op);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    String _name_1 = op.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_2 = _pascalize_1.concat("Operation");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
    CharSequence _generateStub = this.mOperationGenerator.generateStub(model, op);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  public void generateOperationRegistry(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    ServiceBlock _service = model.getService();
    String _name = _service.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = "Abstract".concat(_pascalize);
    String _concat_1 = _concat.concat("OperationRegistry");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
    CharSequence _generate = this.mOperationRegistryGenerator.generate(model);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    ServiceBlock _service_1 = model.getService();
    String _name_1 = _service_1.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_2 = _pascalize_1.concat("OperationRegistry");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
    CharSequence _generateStub = this.mOperationRegistryGenerator.generateStub(model);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  public void generateServiceBridge(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    ServiceBlock _service = model.getService();
    String _name = _service.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = "Abstract".concat(_pascalize);
    String _concat_1 = _concat.concat("ServiceBridge");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
    CharSequence _generate = this.mServiceBridgeGenerator.generate(model);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    ServiceBlock _service_1 = model.getService();
    String _name_1 = _service_1.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_2 = _pascalize_1.concat("ServiceBridge");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
    CharSequence _generateStub = this.mServiceBridgeGenerator.generateStub(model);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  public void generateService(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    ServiceBlock _service = model.getService();
    String _name = _service.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = "Abstract".concat(_pascalize);
    String _concat_1 = _concat.concat("Service");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
    CharSequence _generate = this.mServiceGenerator.generate(model);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    ServiceBlock _service_1 = model.getService();
    String _name_1 = _service_1.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_2 = _pascalize_1.concat("Service");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
    CharSequence _generateStub = this.mServiceGenerator.generateStub(model);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
  
  public void generateOperationProcessor(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    ServiceBlock _service = model.getService();
    String _name = _service.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = "Abstract".concat(_pascalize);
    String _concat_1 = _concat.concat("Processor");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
    CharSequence _generate = this.mOperationProcessorGenerator.generate(model);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    ServiceBlock _service_1 = model.getService();
    String _name_1 = _service_1.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_2 = _pascalize_1.concat("Processor");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
    CharSequence _generateStub = this.mOperationProcessorGenerator.generateStub(model);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
  }
}
