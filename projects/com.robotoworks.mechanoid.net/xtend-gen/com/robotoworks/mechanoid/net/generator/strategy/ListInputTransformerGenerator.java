package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ListInputTransformerGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public CharSequence registerImports() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateListInputTranformerGeneratorClass(decl, module)\u00AA");
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
  
  public CharSequence generateListInputTranformerGeneratorClass(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONException\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("public class \u00B4decl.name\u00AAListInputTransformer extends Transformer<JSONArray, List<\u00B4decl.name\u00AA>> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void transform(JSONArray source, List<\u00B4decl.name\u00AA> target) throws TransformException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4decl.name\u00AAInputTransformer itemTransformer = provider.get(\u00B4decl.name\u00AAInputTransformer.class);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\u00B4decl.name\u00AA targetItem = new \u00B4decl.name\u00AA();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("target.add(targetItem);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("itemTransformer.transform(source.getJSONObject(i), targetItem);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (JSONException x) {");
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
