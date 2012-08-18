package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.ArrayType;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
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
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONObject \u00B4member.name.camelize\u00AA = \u00B4fromPrefix\u00AA.getJSONObject(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4FOR litMember:member.literal.members\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4generateStatementForType(litMember, serializerMemberName, member.name.camelize, toPrefix, membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForType(final TypedMember member, final IntrinsicType type, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = \u00B4fromPrefix\u00AA.\u00B4type.toJSONPropertyGetMethod\u00AA(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(\u00B4fromPrefix\u00AA.\u00B4type.toJSONPropertyGetMethod\u00AA(\"\u00B4member.name\u00AA\"));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
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
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = new \u00B4type.signature\u00AA();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4serializerMemberName\u00AA.get(\u00B4type.innerSignature\u00AAInputTransformer.class).transform(\u00B4fromPrefix\u00AA.getJSONObject(\"\u00B4member.name\u00AA\"), targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForUserType(final TypedMember member, final UserType type, final EnumTypeDeclaration declaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = \u00B4type.signature\u00AA.fromValue(\u00B4fromPrefix\u00AA.\u00B4declaration.resolveGetJSONValueMethodName\u00AA(\"\u00B4member.name\u00AA\"));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForArrayType(final TypedMember member, final ArrayType type, final IntrinsicType element, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = \u00B4fromPrefix\u00AA.getJSONArray(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = new \u00B4type.innerSignature\u00AA[sourceMember.length()];");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetMember[i] = sourceMember.\u00B4element.toJSONPropertyGetMethod\u00AA(i);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
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
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = \u00B4fromPrefix\u00AA.getJSONArray(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = new \u00B4type.innerSignature\u00AA[sourceMember.length()];");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4serializerMemberName\u00AA.get(\u00B4type.innerSignature\u00AAArrayInputTransformer.class).transform(sourceMember, targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForUserTypeArray(final TypedMember member, final ArrayType type, final UserType element, final EnumTypeDeclaration elementDeclaration, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = \u00B4fromPrefix\u00AA.getJSONArray(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = new \u00B4type.innerSignature\u00AA[sourceMember.length()];");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4type.innerSignature\u00AA element = \u00B4type.innerSignature\u00AA.fromValue(sourceMember.\u00B4elementDeclaration.resolveGetJSONValueMethodName\u00AA(i));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetMember[i] = element;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForGenericListType(final TypedMember member, final GenericListType type, final IntrinsicType genericType, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.ArrayList\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = \u00B4fromPrefix\u00AA.getJSONArray(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.type.signature\u00AA targetMember = new Array\u00B4member.type.signature\u00AA(sourceMember.length());");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetMember.add(sourceMember.\u00B4genericType.toJSONPropertyGetMethod\u00AA(i));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
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
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.ArrayList\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = \u00B4fromPrefix\u00AA.getJSONArray(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = new Array\u00B4type.signature\u00AA(sourceMember.length());");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4serializerMemberName\u00AA.get(\u00B4type.innerSignature\u00AAListInputTransformer.class).transform(sourceMember, targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType genericType, final EnumTypeDeclaration genericTypeDeclartion, final String serializerMemberName, final String fromPrefix, final String toPrefix, final boolean membersAreInternal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.ArrayList\")\u00AA");
    _builder.newLine();
    _builder.append("if(\u00B4fromPrefix\u00AA.has(\"\u00B4member.name\u00AA\") && !\u00B4fromPrefix\u00AA.isNull(\"\u00B4member.name\u00AA\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONArray sourceMember = \u00B4fromPrefix\u00AA.getJSONArray(\"\u00B4member.name\u00AA\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4type.signature\u00AA targetMember = new Array\u00B4type.signature\u00AA(sourceMember.length());");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i < sourceMember.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4type.innerSignature\u00AA element = \u00B4type.innerSignature\u00AA.fromValue(sourceMember.\u00B4genericTypeDeclartion.resolveGetJSONValueMethodName\u00AA(i));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetMember.add(element);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(membersAreInternal)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toIdentifier.memberize(toPrefix)\u00AA = targetMember;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4member.toSetMethodName.memberize(toPrefix)\u00AA(targetMember);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
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
