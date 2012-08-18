package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.strategy.MemberDeserializationStatementGenerator;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InputTransformerGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public Object registerImports() {
    return null;
  }
  
  private MemberDeserializationStatementGenerator deserializationStatementGenerator;
  
  public MemberDeserializationStatementGenerator setMemberDeserializationStatementGenerator(final MemberDeserializationStatementGenerator deserializationStatementGenerator) {
    MemberDeserializationStatementGenerator _deserializationStatementGenerator = this.deserializationStatementGenerator = deserializationStatementGenerator;
    return _deserializationStatementGenerator;
  }
  
  public MemberDeserializationStatementGenerator getMemberDeserializationStatementGenerator() {
    return this.deserializationStatementGenerator;
  }
  
  public CharSequence generate(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateInputTransformerGeneratorClass(decl, module)\u00AA");
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
  
  public CharSequence generateInputTransformerGeneratorClass(final ComplexTypeDeclaration decl, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONException\")\u00AA");
    _builder.newLine();
    _builder.append("public class \u00B4decl.name\u00AAInputTransformer extends Transformer<JSONObject, \u00B4decl.name\u00AA> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void transform(JSONObject source, \u00B4decl.name\u00AA target) throws TransformException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4FOR member:decl.literal.members\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4deserializationStatementGenerator.generate(member, \"provider\", \"source\", \"target\", false)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ENDFOR\u00AA");
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
