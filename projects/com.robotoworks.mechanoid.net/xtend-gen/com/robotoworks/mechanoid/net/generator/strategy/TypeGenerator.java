package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.WrapWithMember;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TypeGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public CharSequence generate(final ComplexTypeDeclaration type, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateType(type, module)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.printImports\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.clearImports\u00AA\t");
    _builder.newLine();
    _builder.append("\u00B4body\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateType(final ComplexTypeDeclaration type, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class \u00B4type.name\u00AA {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4FOR member:type.literal.members\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4generateField(member)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4FOR member:type.literal.members\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4generateGetterAndSetter(member)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateField(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private \u00B4member.type.signature\u00AA \u00B4member.toIdentifier\u00AA;");
    _builder.newLine();
    _builder.append("\u00B4IF(member.type instanceof GenericListType)\u00AA\u00B4context.registerImport(\"java.util.List\")\u00AA\u00B4ENDIF\u00AA\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateField(final WrapWithMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterAndSetter(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public \u00B4member.type.signature\u00AA \u00B4member.toGetMethodName\u00AA(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return \u00B4member.toIdentifier\u00AA;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("public void \u00B4member.toSetMethodName\u00AA(\u00B4member.type.signature\u00AA value){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.\u00B4member.toIdentifier\u00AA = value;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterAndSetter(final WrapWithMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateField(final Member member) {
    if (member instanceof TypedMember) {
      return _generateField((TypedMember)member);
    } else if (member instanceof WrapWithMember) {
      return _generateField((WrapWithMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateGetterAndSetter(final Member member) {
    if (member instanceof TypedMember) {
      return _generateGetterAndSetter((TypedMember)member);
    } else if (member instanceof WrapWithMember) {
      return _generateGetterAndSetter((WrapWithMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
}
