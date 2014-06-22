package com.robotoworks.mechanoid.net.generator;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.generator.JsonWriterStatementGenerator;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityWriterGenerator {
  @Inject
  private ImportHelper imports;
  
  @Inject
  private JsonWriterStatementGenerator jsonWriterGenerator;
  
  public CharSequence generate(final ComplexTypeDeclaration decl, final Model model) {
    CharSequence _xblockexpression = null;
    {
      this.jsonWriterGenerator.setImports(this.imports);
      this.jsonWriterGenerator.setWriterIdentifier("writer");
      this.jsonWriterGenerator.setSubjectIdentifier("entity");
      this.jsonWriterGenerator.setProviderIdentifier("getProvider()");
      _xblockexpression = this.doGenerate(decl, model);
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
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityWriter;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.internal.util.JsonWriter;");
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
    _builder.newLine();
    _builder.append("public class ");
    String _name = decl.getName();
    _builder.append(_name, "");
    _builder.append("Writer extends JsonEntityWriter<");
    String _name_1 = decl.getName();
    _builder.append(_name_1, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = decl.getName();
    _builder.append(_name_2, "\t");
    _builder.append("Writer(JsonEntityWriterProvider provider) {");
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
    _builder.append("public void write(JsonWriter writer, ");
    String _name_3 = decl.getName();
    _builder.append(_name_3, "\t");
    _builder.append(" entity) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _genWriteComplexType = this.jsonWriterGenerator.genWriteComplexType(decl);
    _builder.append(_genWriteComplexType, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void writeList(JsonWriter writer, List<");
    String _name_4 = decl.getName();
    _builder.append(_name_4, "\t");
    _builder.append("> entities) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("writer.beginArray();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(");
    String _name_5 = decl.getName();
    _builder.append(_name_5, "\t\t");
    _builder.append(" item:entities) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("write(writer, item);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("writer.endArray();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
