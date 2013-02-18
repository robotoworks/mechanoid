package com.robotoworks.mechanoid.net.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.generator.MechanoidOutputConfigurationProvider;
import com.robotoworks.mechanoid.net.generator.ClientGenerator;
import com.robotoworks.mechanoid.net.generator.EntityGenerator;
import com.robotoworks.mechanoid.net.generator.EntityReaderGenerator;
import com.robotoworks.mechanoid.net.generator.EntityReaderProviderGenerator;
import com.robotoworks.mechanoid.net.generator.EntityWriterGenerator;
import com.robotoworks.mechanoid.net.generator.EntityWriterProviderGenerator;
import com.robotoworks.mechanoid.net.generator.IntegerEnumTypeGenerator;
import com.robotoworks.mechanoid.net.generator.RequestGenerator;
import com.robotoworks.mechanoid.net.generator.ResultGenerator;
import com.robotoworks.mechanoid.net.generator.StringEnumTypeGenerator;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ClientBlock;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Declaration;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.IntegerType;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.text.Strings;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class NetModelGenerator implements IGenerator {
  @Inject
  private Provider<ClientGenerator> mClientGenerator;
  
  @Inject
  private Provider<RequestGenerator> mRequestGenerator;
  
  @Inject
  private Provider<ResultGenerator> mResultGenerator;
  
  @Inject
  private Provider<EntityReaderGenerator> mEntityReaderGenerator;
  
  @Inject
  private Provider<EntityWriterGenerator> mEntityWriterGenerator;
  
  @Inject
  private Provider<EntityGenerator> mEntityGenerator;
  
  @Inject
  private Provider<IntegerEnumTypeGenerator> mIntEnumGenerator;
  
  @Inject
  private Provider<StringEnumTypeGenerator> mStringEnumGenerator;
  
  @Inject
  private Provider<EntityReaderProviderGenerator> mEntityReaderProviderGenerator;
  
  @Inject
  private Provider<EntityWriterProviderGenerator> mEntityWriterProviderGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model model = ((Model) _head);
    EList<Declaration> _declarations = model.getDeclarations();
    final Procedure1<Declaration> _function = new Procedure1<Declaration>() {
        public void apply(final Declaration it) {
          NetModelGenerator.this.generate(it, model, fsa);
        }
      };
    IterableExtensions.<Declaration>forEach(_declarations, _function);
  }
  
  protected void _generate(final Client client, final Model model, final IFileSystemAccess fsa) {
    String _packageName = model.getPackageName();
    String _name = client.getName();
    String _plus = ("Abstract" + _name);
    String _resolveFileName = Strings.resolveFileName(_packageName, _plus);
    ClientGenerator _get = this.mClientGenerator.get();
    CharSequence _generate = _get.generate(client, model);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    String _name_1 = client.getName();
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _name_1);
    ClientGenerator _get_1 = this.mClientGenerator.get();
    CharSequence _generateStub = _get_1.generateStub(client, model);
    fsa.generateFile(_resolveFileName_1, 
      MechanoidOutputConfigurationProvider.DEFAULT_STUB_OUTPUT, _generateStub);
    String _packageName_2 = model.getPackageName();
    String _name_2 = client.getName();
    String _pascalize = Strings.pascalize(_name_2);
    String _concat = _pascalize.concat("ReaderProvider");
    String _plus_1 = ("Default" + _concat);
    String _resolveFileName_2 = Strings.resolveFileName(_packageName_2, _plus_1);
    EntityReaderProviderGenerator _get_2 = this.mEntityReaderProviderGenerator.get();
    CharSequence _generate_1 = _get_2.generate(client, model);
    fsa.generateFile(_resolveFileName_2, _generate_1);
    String _packageName_3 = model.getPackageName();
    String _name_3 = client.getName();
    String _pascalize_1 = Strings.pascalize(_name_3);
    String _concat_1 = _pascalize_1.concat("WriterProvider");
    String _plus_2 = ("Default" + _concat_1);
    String _resolveFileName_3 = Strings.resolveFileName(_packageName_3, _plus_2);
    EntityWriterProviderGenerator _get_3 = this.mEntityWriterProviderGenerator.get();
    CharSequence _generate_2 = _get_3.generate(client, model);
    fsa.generateFile(_resolveFileName_3, _generate_2);
    EList<ClientBlock> _blocks = client.getBlocks();
    Iterable<HttpMethod> _filter = Iterables.<HttpMethod>filter(_blocks, HttpMethod.class);
    final Procedure1<HttpMethod> _function = new Procedure1<HttpMethod>() {
        public void apply(final HttpMethod method) {
          String _packageName = model.getPackageName();
          String _name = method.getName();
          String _pascalize = Strings.pascalize(_name);
          String _concat = _pascalize.concat("Request");
          String _resolveFileName = Strings.resolveFileName(_packageName, _concat);
          RequestGenerator _get = NetModelGenerator.this.mRequestGenerator.get();
          CharSequence _generate = _get.generate(method, model, client);
          fsa.generateFile(_resolveFileName, _generate);
          String _packageName_1 = model.getPackageName();
          String _name_1 = method.getName();
          String _pascalize_1 = Strings.pascalize(_name_1);
          String _concat_1 = _pascalize_1.concat("Result");
          String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_1);
          ResultGenerator _get_1 = NetModelGenerator.this.mResultGenerator.get();
          CharSequence _generate_1 = _get_1.generate(method, model, client);
          fsa.generateFile(_resolveFileName_1, _generate_1);
        }
      };
    IterableExtensions.<HttpMethod>forEach(_filter, _function);
  }
  
  protected void _generate(final ComplexTypeDeclaration entity, final Model model, final IFileSystemAccess fsa) {
    String _packageName = model.getPackageName();
    String _name = entity.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = _pascalize.concat("Reader");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat);
    EntityReaderGenerator _get = this.mEntityReaderGenerator.get();
    CharSequence _generate = _get.generate(entity, model);
    fsa.generateFile(_resolveFileName, _generate);
    String _packageName_1 = model.getPackageName();
    String _name_1 = entity.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    String _concat_1 = _pascalize_1.concat("Writer");
    String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_1);
    EntityWriterGenerator _get_1 = this.mEntityWriterGenerator.get();
    CharSequence _generate_1 = _get_1.generate(entity, model);
    fsa.generateFile(_resolveFileName_1, _generate_1);
    String _packageName_2 = model.getPackageName();
    String _name_2 = entity.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    String _resolveFileName_2 = Strings.resolveFileName(_packageName_2, _pascalize_2);
    EntityGenerator _get_2 = this.mEntityGenerator.get();
    CharSequence _generate_2 = _get_2.generate(entity, model);
    fsa.generateFile(_resolveFileName_2, _generate_2);
  }
  
  protected void _generate(final EnumTypeDeclaration type, final Model model, final IFileSystemAccess fsa) {
    boolean _isGen = type.isGen();
    if (_isGen) {
      IntegerType _superType = type.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        String _packageName = model.getPackageName();
        String _name = type.getName();
        String _pascalize = Strings.pascalize(_name);
        String _resolveFileName = Strings.resolveFileName(_packageName, _pascalize);
        IntegerEnumTypeGenerator _get = this.mIntEnumGenerator.get();
        CharSequence _generate = _get.generate(type, model);
        fsa.generateFile(_resolveFileName, _generate);
      } else {
        String _packageName_1 = model.getPackageName();
        String _name_1 = type.getName();
        String _pascalize_1 = Strings.pascalize(_name_1);
        String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _pascalize_1);
        StringEnumTypeGenerator _get_1 = this.mStringEnumGenerator.get();
        CharSequence _generate_1 = _get_1.generate(type, model);
        fsa.generateFile(_resolveFileName_1, _generate_1);
      }
    }
  }
  
  public void generate(final Declaration entity, final Model model, final IFileSystemAccess fsa) {
    if (entity instanceof ComplexTypeDeclaration) {
      _generate((ComplexTypeDeclaration)entity, model, fsa);
      return;
    } else if (entity instanceof EnumTypeDeclaration) {
      _generate((EnumTypeDeclaration)entity, model, fsa);
      return;
    } else if (entity instanceof Client) {
      _generate((Client)entity, model, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity, model, fsa).toString());
    }
  }
}
