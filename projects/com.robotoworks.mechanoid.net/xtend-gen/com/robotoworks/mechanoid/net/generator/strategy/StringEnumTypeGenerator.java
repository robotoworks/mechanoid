package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class StringEnumTypeGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public CharSequence generate(final EnumTypeDeclaration type, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public enum \u00B4type.name\u00AA {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.literal.members.join(\",\\n\", [member|member.name.underscore.toUpperCase + \'(\"\' + member.name + \'\")\'])\u00AA;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getValue() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.name\u00AA(String value){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static \u00B4type.name\u00AA fromValue(String value) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (value == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new IllegalArgumentException(\"value cannot be null\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (\u00B4type.name\u00AA member : \u00B4type.name\u00AA.values()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (value.equalsIgnoreCase(member.value)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return member;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new RuntimeException(\"No constant with value \" + value + \" found\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
