package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.strategy.MemberSerializationStatementGenerator;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.emf.common.util.EList;
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
  
  private MemberSerializationStatementGenerator serializationStatementGenerator;
  
  public MemberSerializationStatementGenerator setMemberSerializationStatementGenerator(final MemberSerializationStatementGenerator serializationStatementGenerator) {
    MemberSerializationStatementGenerator _serializationStatementGenerator = this.serializationStatementGenerator = serializationStatementGenerator;
    return _serializationStatementGenerator;
  }
  
  public MemberSerializationStatementGenerator getMemberSerializationStatementGenerator() {
    return this.serializationStatementGenerator;
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
    _builder.append(", JSONObject> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void transform(");
    String _name_2 = decl.getName();
    _builder.append(_name_2, "	");
    _builder.append(" source, JSONObject target) throws TransformException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    {
      ComplexTypeLiteral _literal = decl.getLiteral();
      EList<Member> _members = _literal.getMembers();
      for(final Member member : _members) {
        _builder.append("\t\t\t");
        CharSequence _generate = this.serializationStatementGenerator.generate(member, "provider", "source", "target", false);
        _builder.append(_generate, "			");
        _builder.newLineIfNotEmpty();
      }
    }
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
