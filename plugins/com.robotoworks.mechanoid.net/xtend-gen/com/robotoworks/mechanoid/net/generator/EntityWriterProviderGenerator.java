package com.robotoworks.mechanoid.net.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Declaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityWriterProviderGenerator {
  @Inject
  private ImportHelper imports;
  
  public CharSequence generate(final Client client, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityWriter;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    CharSequence classDecl = this.generateType(client, model);
    _builder.newLineIfNotEmpty();
    StringConcatenation _printAndClear = this.imports.printAndClear();
    _builder.append(_printAndClear, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(classDecl, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateType(final Client client, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Default");
    String _name = client.getName();
    _builder.append(_name, "");
    _builder.append("WriterProvider implements JsonEntityWriterProvider {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private HashMap<Class<?>, JsonEntityWriter<?>> mMap = new HashMap<Class<?>, JsonEntityWriter<?>>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Default");
    String _name_1 = client.getName();
    _builder.append(_name_1, "\t");
    _builder.append("WriterProvider(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("registerWriters(mMap);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@SuppressWarnings(\"unchecked\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public <T, R extends JsonEntityWriter<T>> R get(Class<T> entityType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (R) mMap.get(entityType);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void registerWriters(HashMap<Class<?>, JsonEntityWriter<?>> map) {");
    _builder.newLine();
    {
      EList<Declaration> _declarations = model.getDeclarations();
      Iterable<ComplexTypeDeclaration> _filter = Iterables.<ComplexTypeDeclaration>filter(_declarations, ComplexTypeDeclaration.class);
      for(final ComplexTypeDeclaration entity : _filter) {
        _builder.append("\t\t");
        _builder.append("map.put(");
        String _name_2 = entity.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(".class, new ");
        String _name_3 = entity.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("Writer(this));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
