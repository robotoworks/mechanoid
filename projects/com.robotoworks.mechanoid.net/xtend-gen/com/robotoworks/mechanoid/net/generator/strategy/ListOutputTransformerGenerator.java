package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ListOutputTransformerGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public Object registerImports() {
    return null;
  }
  
  public CharSequence generate(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = module.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence body = this.generateListOutputTransformerGeneratorClass(decl, module);
    _builder.newLineIfNotEmpty();
    Object _registerImports = this.registerImports();
    _builder.append(_registerImports, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import com.robotoworks.mechanoid.net.Transformer;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformException;");
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
  
  public CharSequence generateListOutputTransformerGeneratorClass(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = decl.getName();
    _builder.append(_name, "");
    _builder.append("ListOutputTransformer extends Transformer<List<");
    String _name_1 = decl.getName();
    _builder.append(_name_1, "");
    _builder.append(">, JSONArray> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void transform(List<");
    String _name_2 = decl.getName();
    _builder.append(_name_2, "	");
    _builder.append("> source, JSONArray target) throws TransformException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_3 = decl.getName();
    _builder.append(_name_3, "		");
    _builder.append("OutputTransformer itemTransformer = provider.get(");
    String _name_4 = decl.getName();
    _builder.append(_name_4, "		");
    _builder.append("OutputTransformer.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for(");
    String _name_5 = decl.getName();
    _builder.append(_name_5, "		");
    _builder.append(" sourceItem:source) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("JSONObject targetItem = new JSONObject();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("itemTransformer.transform(sourceItem, targetItem);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("target.put(targetItem); ");
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
