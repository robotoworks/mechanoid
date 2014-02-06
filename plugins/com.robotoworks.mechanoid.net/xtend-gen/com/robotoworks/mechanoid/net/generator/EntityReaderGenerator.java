package com.robotoworks.mechanoid.net.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.generator.JsonReaderStatementGenerator;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityReaderGenerator {
  @Inject
  private ImportHelper imports;
  
  @Inject
  private JsonReaderStatementGenerator jsonReaderGenerator;
  
  public CharSequence generate(final ComplexTypeDeclaration decl, final Model model) {
    CharSequence _xblockexpression = null;
    {
      this.jsonReaderGenerator.setImports(this.imports);
      this.jsonReaderGenerator.setReaderIdentifier("reader");
      this.jsonReaderGenerator.setSubjectIdentifier("entity");
      this.jsonReaderGenerator.setProviderIdentifier("getProvider()");
      CharSequence _doGenerate = this.doGenerate(decl, model);
      _xblockexpression = (_doGenerate);
    }
    return _xblockexpression;
  }
  
  public CharSequence doGenerate(final ComplexTypeDeclaration decl, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence classDecl = this.generateOutputTransformerGeneratorClass(decl, model);
    _builder.newLineIfNotEmpty();
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityReader;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.internal.util.JsonReader;");
    _builder.newLine();
    StringConcatenation _printAndClear = this.imports.printAndClear();
    _builder.append(_printAndClear, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(classDecl, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateOutputTransformerGeneratorClass(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = decl.getName();
    _builder.append(_name, "");
    _builder.append("Reader extends JsonEntityReader<");
    String _name_1 = decl.getName();
    _builder.append(_name_1, "");
    _builder.append("> {\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = decl.getName();
    _builder.append(_name_2, "	");
    _builder.append("Reader(JsonEntityReaderProvider provider) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(provider);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void read(JsonReader reader, ");
    String _name_3 = decl.getName();
    _builder.append(_name_3, "	");
    _builder.append(" entity) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _genReadComplexType = this.jsonReaderGenerator.genReadComplexType(decl);
    _builder.append(_genReadComplexType, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void read(JsonReader reader, List<");
    String _name_4 = decl.getName();
    _builder.append(_name_4, "	");
    _builder.append("> entities) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("reader.beginArray();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(reader.hasNext()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _name_5 = decl.getName();
    _builder.append(_name_5, "			");
    _builder.append(" item = new ");
    String _name_6 = decl.getName();
    _builder.append(_name_6, "			");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("read(reader, item);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("entities.add(item);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("reader.endArray();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
