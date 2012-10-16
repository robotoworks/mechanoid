package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.strategy.JsonWriterGenerator;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OutputTransformerGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public Object registerImports() {
    return null;
  }
  
  private JsonWriterGenerator jsonWriterGenerator;
  
  public JsonWriterGenerator setJsonWriterGenerator(final JsonWriterGenerator jsonWriterGenerator) {
    JsonWriterGenerator _jsonWriterGenerator = this.jsonWriterGenerator = jsonWriterGenerator;
    return _jsonWriterGenerator;
  }
  
  public CharSequence generate(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = module.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence body = this.generateOutputTransformerGeneratorClass(decl, module);
    _builder.newLineIfNotEmpty();
    Object _registerImports = this.registerImports();
    _builder.append(_registerImports, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import com.robotoworks.mechanoid.net.Transformer;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.internal.util.JsonWriter;");
    _builder.newLine();
    StringConcatenation _printImports = this.context.printImports();
    _builder.append(_printImports, "");
    _builder.newLineIfNotEmpty();
    this.context.clearImports();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateOutputTransformerGeneratorClass(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("java.lang.Exception");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = decl.getName();
    _builder.append(_name, "");
    _builder.append("OutputTransformer extends Transformer<");
    String _name_1 = decl.getName();
    _builder.append(_name_1, "");
    _builder.append(", JsonWriter> {\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void transform(");
    String _name_2 = decl.getName();
    _builder.append(_name_2, "	");
    _builder.append(" source, JsonWriter target) throws TransformException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _genWriteComplexType = this.jsonWriterGenerator.genWriteComplexType(decl);
    _builder.append(_genWriteComplexType, "			");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (Exception x) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new TransformException(x);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
