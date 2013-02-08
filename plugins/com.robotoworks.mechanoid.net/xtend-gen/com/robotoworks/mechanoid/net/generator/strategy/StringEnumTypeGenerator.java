package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.EnumMember;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.text.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StringEnumTypeGenerator {
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
    EnumTypeLiteral _literal = type.getLiteral();
    EList<EnumMember> _members = _literal.getMembers();
    final Function1<EnumMember,String> _function = new Function1<EnumMember,String>() {
        public String apply(final EnumMember member) {
          String _name = member.getName();
          String _underscore = Strings.underscore(_name);
          String _upperCase = _underscore.toUpperCase();
          String _plus = (_upperCase + "(\"");
          String _name_1 = member.getName();
          String _plus_1 = (_plus + _name_1);
          String _plus_2 = (_plus_1 + "\")");
          return _plus_2;
        }
      };
    String _join = IterableExtensions.<EnumMember>join(_members, ",\n", _function);
    _builder.append(_join, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
    String _name_1 = type.getName();
    _builder.append(_name_1, "	");
    _builder.append("(String value){");
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
    _builder.append(" fromValue(String value) {");
    _builder.newLineIfNotEmpty();
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
    _builder.append("for (");
    String _name_3 = type.getName();
    _builder.append(_name_3, "		");
    _builder.append(" member : ");
    String _name_4 = type.getName();
    _builder.append(_name_4, "		");
    _builder.append(".values()) {");
    _builder.newLineIfNotEmpty();
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
