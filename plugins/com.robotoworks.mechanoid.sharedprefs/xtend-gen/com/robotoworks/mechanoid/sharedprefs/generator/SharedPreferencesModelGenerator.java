package com.robotoworks.mechanoid.sharedprefs.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.sharedprefs.generator.SharedPreferencesGenerator;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock;
import com.robotoworks.mechanoid.text.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SharedPreferencesModelGenerator implements IGenerator {
  @Inject
  private SharedPreferencesGenerator mPreferencesGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _packageName = model.getPackageName();
    PreferencesBlock _preferencesBlock = model.getPreferencesBlock();
    String _name = _preferencesBlock.getName();
    String _pascalize = Strings.pascalize(_name);
    String _concat = _pascalize.concat("Preferences");
    String _resolveFileName = Strings.resolveFileName(_packageName, _concat);
    CharSequence _generate = this.mPreferencesGenerator.generate(model);
    fsa.generateFile(_resolveFileName, _generate);
  }
}
