package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.ArrayType;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.WrapWithMember;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MemberDeserializationStatementGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public CharSequence generate(final Member member, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    CharSequence _generateStatementForType = this.generateStatementForType(member, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForType;
  }
  
  protected CharSequence _generateStatementForType(final TypedMember member, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    Type _type = member.getType();
    CharSequence _generateStatementForType = this.generateStatementForType(member, _type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForType;
  }
  
  protected CharSequence _generateStatementForType(final WrapWithMember member, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONObject ");
    String _name_2 = member.getName();
    String _camelize = ModelExtensions.camelize(_name_2);
    _builder.append(_camelize, "	");
    _builder.append(" = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONObject(\"");
    String _name_3 = member.getName();
    _builder.append(_name_3, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      ComplexTypeLiteral _literal = member.getLiteral();
      EList<Member> _members = _literal.getMembers();
      for(final Member litMember : _members) {
        _builder.append("\t");
        String _name_4 = member.getName();
        String _camelize_1 = ModelExtensions.camelize(_name_4);
        CharSequence _generateStatementForType = this.generateStatementForType(litMember, serializerMemberName, _camelize_1, toPrefix, membersAreInternal);
        _builder.append(_generateStatementForType, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForType(final TypedMember member, final IntrinsicType type, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = ");
        _builder.append(fromPrefix, "	");
        _builder.append(".");
        String _jSONPropertyGetMethod = ModelExtensions.toJSONPropertyGetMethod(type);
        _builder.append(_jSONPropertyGetMethod, "	");
        _builder.append("(\"");
        String _name_2 = member.getName();
        _builder.append(_name_2, "	");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(");
        _builder.append(fromPrefix, "	");
        _builder.append(".");
        String _jSONPropertyGetMethod_1 = ModelExtensions.toJSONPropertyGetMethod(type);
        _builder.append(_jSONPropertyGetMethod_1, "	");
        _builder.append("(\"");
        String _name_3 = member.getName();
        _builder.append(_name_3, "	");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForType(final TypedMember member, final UserType type, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    CharSequence _generateStatementForUserType = this.generateStatementForUserType(member, type, _declaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForUserType;
  }
  
  protected CharSequence _generateStatementForType(final TypedMember member, final ArrayType type, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    Type _elementType = type.getElementType();
    CharSequence _generateStatementForArrayType = this.generateStatementForArrayType(member, type, _elementType, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForArrayType;
  }
  
  protected CharSequence _generateStatementForType(final TypedMember member, final GenericListType type, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    Type _genericType = type.getGenericType();
    CharSequence _generateStatementForGenericListType = this.generateStatementForGenericListType(member, type, _genericType, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForGenericListType;
  }
  
  protected CharSequence _generateStatementForUserType(final TypedMember member, final UserType type, final ComplexTypeDeclaration declaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "	");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(serializerMemberName, "	");
    _builder.append(".get(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append("InputTransformer.class).transform(");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONObject(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\"), targetMember);");
    _builder.newLineIfNotEmpty();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForUserType(final TypedMember member, final UserType type, final EnumTypeDeclaration declaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "	");
    _builder.append(".fromValue(");
    _builder.append(fromPrefix, "	");
    _builder.append(".");
    String _resolveGetJSONValueMethodName = ModelExtensions.resolveGetJSONValueMethodName(declaration);
    _builder.append(_resolveGetJSONValueMethodName, "	");
    _builder.append("(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForArrayType(final TypedMember member, final ArrayType type, final IntrinsicType element, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONArray(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new ");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append("[sourceMember.length()];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetMember[i] = sourceMember.");
    String _jSONPropertyGetMethod = ModelExtensions.toJSONPropertyGetMethod(element);
    _builder.append(_jSONPropertyGetMethod, "		");
    _builder.append("(i);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForArrayType(final TypedMember member, final ArrayType type, final UserType element, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    UserTypeDeclaration _declaration = element.getDeclaration();
    CharSequence _generateStatementForUserTypeArray = this.generateStatementForUserTypeArray(member, type, element, _declaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForUserTypeArray;
  }
  
  protected CharSequence _generateStatementForUserTypeArray(final TypedMember member, final ArrayType type, final UserType element, final ComplexTypeDeclaration elementDeclaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONArray(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new ");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append("[sourceMember.length()];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(serializerMemberName, "	");
    _builder.append(".get(");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "	");
    _builder.append("ArrayInputTransformer.class).transform(sourceMember, targetMember);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForUserTypeArray(final TypedMember member, final ArrayType type, final UserType element, final EnumTypeDeclaration elementDeclaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONArray(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new ");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append("[sourceMember.length()];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "		");
    _builder.append(" element = ");
    String _innerSignature_2 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_2, "		");
    _builder.append(".fromValue(sourceMember.");
    String _resolveGetJSONValueMethodName = ModelExtensions.resolveGetJSONValueMethodName(elementDeclaration);
    _builder.append(_resolveGetJSONValueMethodName, "		");
    _builder.append("(i));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("targetMember[i] = element;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForGenericListType(final TypedMember member, final GenericListType type, final IntrinsicType genericType, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONArray(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Type _type = member.getType();
    String _signature = ModelExtensions.signature(_type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new Array");
    Type _type_1 = member.getType();
    String _signature_1 = ModelExtensions.signature(_type_1);
    _builder.append(_signature_1, "	");
    _builder.append("(sourceMember.length());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetMember.add(sourceMember.");
    String _jSONPropertyGetMethod = ModelExtensions.toJSONPropertyGetMethod(genericType);
    _builder.append(_jSONPropertyGetMethod, "		");
    _builder.append("(i));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForGenericListType(final TypedMember member, final GenericListType type, final UserType genericType, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    UserTypeDeclaration _declaration = genericType.getDeclaration();
    CharSequence _generateStatementForUserTypeGenericList = this.generateStatementForUserTypeGenericList(member, type, genericType, _declaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    return _generateStatementForUserTypeGenericList;
  }
  
  protected CharSequence _generateStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType genericType, final ComplexTypeDeclaration genericTypeDeclartion, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONArray(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new Array");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "	");
    _builder.append("(sourceMember.length());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(serializerMemberName, "	");
    _builder.append(".get(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append("ListInputTransformer.class).transform(sourceMember, targetMember);");
    _builder.newLineIfNotEmpty();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType genericType, final EnumTypeDeclaration genericTypeDeclartion, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(fromPrefix, "");
    _builder.append(".has(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\") && !");
    _builder.append(fromPrefix, "");
    _builder.append(".isNull(\"");
    String _name_1 = member.getName();
    _builder.append(_name_1, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = ");
    _builder.append(fromPrefix, "	");
    _builder.append(".getJSONArray(\"");
    String _name_2 = member.getName();
    _builder.append(_name_2, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "	");
    _builder.append(" targetMember = new Array");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "	");
    _builder.append("(sourceMember.length());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "		");
    _builder.append(" element = ");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "		");
    _builder.append(".fromValue(sourceMember.");
    String _resolveGetJSONValueMethodName = ModelExtensions.resolveGetJSONValueMethodName(genericTypeDeclartion);
    _builder.append(_resolveGetJSONValueMethodName, "		");
    _builder.append("(i));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("targetMember.add(element);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      if (membersAreInternal) {
        _builder.append("\t");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _memberize = ModelExtensions.memberize(_identifier, toPrefix);
        _builder.append(_memberize, "	");
        _builder.append(" = targetMember;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _memberize_1 = ModelExtensions.memberize(_setMethodName, toPrefix);
        _builder.append(_memberize_1, "	");
        _builder.append("(targetMember);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStatementForType(final Member member, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (member instanceof TypedMember) {
      return _generateStatementForType((TypedMember)member, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (member instanceof WrapWithMember) {
      return _generateStatementForType((WrapWithMember)member, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
  
  public CharSequence generateStatementForType(final TypedMember member, final Type type, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (type instanceof ArrayType) {
      return _generateStatementForType(member, (ArrayType)type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (type instanceof GenericListType) {
      return _generateStatementForType(member, (GenericListType)type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (type instanceof IntrinsicType) {
      return _generateStatementForType(member, (IntrinsicType)type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (type instanceof UserType) {
      return _generateStatementForType(member, (UserType)type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
  
  public CharSequence generateStatementForUserType(final TypedMember member, final UserType type, final UserTypeDeclaration declaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateStatementForUserType(member, type, (ComplexTypeDeclaration)declaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateStatementForUserType(member, type, (EnumTypeDeclaration)declaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, declaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
  
  public CharSequence generateStatementForArrayType(final TypedMember member, final ArrayType type, final Type element, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (element instanceof IntrinsicType) {
      return _generateStatementForArrayType(member, type, (IntrinsicType)element, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (element instanceof UserType) {
      return _generateStatementForArrayType(member, type, (UserType)element, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, element, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
  
  public CharSequence generateStatementForUserTypeArray(final TypedMember member, final ArrayType type, final UserType element, final UserTypeDeclaration elementDeclaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (elementDeclaration instanceof ComplexTypeDeclaration) {
      return _generateStatementForUserTypeArray(member, type, element, (ComplexTypeDeclaration)elementDeclaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (elementDeclaration instanceof EnumTypeDeclaration) {
      return _generateStatementForUserTypeArray(member, type, element, (EnumTypeDeclaration)elementDeclaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, element, elementDeclaration, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
  
  public CharSequence generateStatementForGenericListType(final TypedMember member, final GenericListType type, final Type genericType, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (genericType instanceof IntrinsicType) {
      return _generateStatementForGenericListType(member, type, (IntrinsicType)genericType, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (genericType instanceof UserType) {
      return _generateStatementForGenericListType(member, type, (UserType)genericType, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, genericType, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
  
  public CharSequence generateStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType genericType, final UserTypeDeclaration genericTypeDeclartion, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    if (genericTypeDeclartion instanceof ComplexTypeDeclaration) {
      return _generateStatementForUserTypeGenericList(member, type, genericType, (ComplexTypeDeclaration)genericTypeDeclartion, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else if (genericTypeDeclartion instanceof EnumTypeDeclaration) {
      return _generateStatementForUserTypeGenericList(member, type, genericType, (EnumTypeDeclaration)genericTypeDeclartion, serializerMemberName, fromPrefix, toPrefix, membersAreInternal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, genericType, genericTypeDeclartion, serializerMemberName, fromPrefix, toPrefix, membersAreInternal).toString());
    }
  }
}
