package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IntegerEnumTypeGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public CharSequence generate(final EnumTypeDeclaration type, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = module.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public enum ");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateEnumMembers = ModelExtensions.generateEnumMembers(type);
    _builder.append(_generateEnumMembers, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private int value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getValue() {");
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
    String _name_1 = type.getName();
    _builder.append(_name_1, "	");
    _builder.append("(int value){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _name_2 = type.getName();
    _builder.append(_name_2, "	");
    _builder.append(" fromValue(int value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (");
    String _name_3 = type.getName();
    _builder.append(_name_3, "		");
    _builder.append(" member : ");
    String _name_4 = type.getName();
    _builder.append(_name_4, "		");
    _builder.append(".values()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if (value == member.value) {");
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
