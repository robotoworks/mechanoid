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
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateListOutputTransformerGeneratorClass(decl, module)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4registerImports\u00AA");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.Transformer;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformException;");
    _builder.newLine();
    _builder.append("\u00B4context.printImports\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.clearImports\u00AA");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4body\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateListOutputTransformerGeneratorClass(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("public class \u00B4decl.name\u00AAListOutputTransformer extends Transformer<List<\u00B4decl.name\u00AA>, JSONArray> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void transform(List<\u00B4decl.name\u00AA> source, JSONArray target) throws TransformException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4decl.name\u00AAOutputTransformer itemTransformer = provider.get(\u00B4decl.name\u00AAOutputTransformer.class);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(\u00B4decl.name\u00AA sourceItem:source) {");
    _builder.newLine();
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
