package com.robotoworks.mechanoid.net.generator;

import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.SkipMember;
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JsonWriterStatementGenerator {
  private ImportHelper _imports;
  
  public ImportHelper getImports() {
    return this._imports;
  }
  
  public void setImports(final ImportHelper imports) {
    this._imports = imports;
  }
  
  private String _writerIdentifier = "target";
  
  public String getWriterIdentifier() {
    return this._writerIdentifier;
  }
  
  public void setWriterIdentifier(final String writerIdentifier) {
    this._writerIdentifier = writerIdentifier;
  }
  
  private String _subjectIdentifier = "subject";
  
  public String getSubjectIdentifier() {
    return this._subjectIdentifier;
  }
  
  public void setSubjectIdentifier(final String subjectIdentifier) {
    this._subjectIdentifier = subjectIdentifier;
  }
  
  private String _providerIdentifier = "provider";
  
  public String getProviderIdentifier() {
    return this._providerIdentifier;
  }
  
  public void setProviderIdentifier(final String providerIdentifier) {
    this._providerIdentifier = providerIdentifier;
  }
  
  public CharSequence genWriteComplexType(final ComplexTypeDeclaration decl) {
    ComplexTypeLiteral _literal = decl.getLiteral();
    CharSequence _genWriteComplexTypeLiteral = this.genWriteComplexTypeLiteral(_literal);
    return _genWriteComplexTypeLiteral;
  }
  
  public CharSequence genWriteComplexTypeLiteral(final ComplexTypeLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Member> _members = literal.getMembers();
    CharSequence _genWriteComplexTypeLiteralForMembers = this.genWriteComplexTypeLiteralForMembers(_members);
    _builder.append(_genWriteComplexTypeLiteralForMembers, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWriteComplexTypeLiteralForMembers(final EList<Member> members) {
    StringConcatenation _builder = new StringConcatenation();
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "");
    _builder.append(".beginObject();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final Member member : members) {
        CharSequence _genStatement = this.genStatement(member);
        _builder.append(_genStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "");
    _builder.append(".endObject();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genStatement(final TypedMember member) {
    Type _type = member.getType();
    CharSequence _genStatementForType = this.genStatementForType(member, _type);
    return _genStatementForType;
  }
  
  protected CharSequence _genStatement(final SkipMember skipMember) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "	");
    _builder.append(".name(\"");
    String _name = skipMember.getName();
    _builder.append(_name, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    ComplexTypeLiteral _literal = skipMember.getLiteral();
    EList<Member> _members = _literal.getMembers();
    Object _genWriteComplexTypeLiteralForMembers = this.genWriteComplexTypeLiteralForMembers(_members);
    _builder.append(_genWriteComplexTypeLiteralForMembers, "	");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "");
    _builder.append(".name(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "");
    _builder.append(".value(");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_getMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final UserType type) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    CharSequence _genStatementForType = this.genStatementForType(member, type, _declaration);
    return _genStatementForType;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final UserType type, final ComplexTypeDeclaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_getMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("() != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "	");
    _builder.append(".name(\"");
    String _name = member.getName();
    _builder.append(_name, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _providerIdentifier = this.getProviderIdentifier();
    _builder.append(_providerIdentifier, "	");
    _builder.append(".get(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append(".class).write(");
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "	");
    _builder.append(", ");
    String _getMethodName_1 = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier_1 = this.getSubjectIdentifier();
    String _memberize_1 = ModelExtensions.memberize(_getMethodName_1, _subjectIdentifier_1);
    _builder.append(_memberize_1, "	");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final UserType type, final EnumTypeDeclaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_getMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("() != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "	");
    _builder.append(".name(\"");
    String _name = member.getName();
    _builder.append(_name, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "	");
    _builder.append(".value(");
    String _getMethodName_1 = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier_1 = this.getSubjectIdentifier();
    String _memberize_1 = ModelExtensions.memberize(_getMethodName_1, _subjectIdentifier_1);
    _builder.append(_memberize_1, "	");
    _builder.append("().toString());");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final GenericListType type) {
    Type _elementType = type.getElementType();
    CharSequence _genStatementForGenericListType = this.genStatementForGenericListType(member, type, _elementType);
    return _genStatementForGenericListType;
  }
  
  protected CharSequence _genStatementForGenericListType(final TypedMember member, final GenericListType type, final IntrinsicType itemType) {
    StringConcatenation _builder = new StringConcatenation();
    ImportHelper _imports = this.getImports();
    _imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil");
    _builder.newLineIfNotEmpty();
    ImportHelper _imports_1 = this.getImports();
    _imports_1.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_getMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("() != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "	");
    _builder.append(".name(\"");
    String _name = member.getName();
    _builder.append(_name, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JsonUtil.write");
    String _boxedTypeSignature = ModelExtensions.getBoxedTypeSignature(itemType);
    _builder.append(_boxedTypeSignature, "	");
    _builder.append("List(");
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "	");
    _builder.append(", ");
    String _getMethodName_1 = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier_1 = this.getSubjectIdentifier();
    String _memberize_1 = ModelExtensions.memberize(_getMethodName_1, _subjectIdentifier_1);
    _builder.append(_memberize_1, "	");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genStatementForGenericListType(final TypedMember member, final GenericListType type, final UserType itemType) {
    UserTypeDeclaration _declaration = itemType.getDeclaration();
    CharSequence _genStatementForUserTypeGenericList = this.genStatementForUserTypeGenericList(member, type, itemType, _declaration);
    return _genStatementForUserTypeGenericList;
  }
  
  protected CharSequence _genStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType itemType, final ComplexTypeDeclaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    ImportHelper _imports = this.getImports();
    _imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_getMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("() != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "	");
    _builder.append(".name(\"");
    String _name = member.getName();
    _builder.append(_name, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _providerIdentifier = this.getProviderIdentifier();
    _builder.append(_providerIdentifier, "	");
    _builder.append(".get(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append(".class).write(");
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "	");
    _builder.append(", ");
    String _getMethodName_1 = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier_1 = this.getSubjectIdentifier();
    String _memberize_1 = ModelExtensions.memberize(_getMethodName_1, _subjectIdentifier_1);
    _builder.append(_memberize_1, "	");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType itemType, final EnumTypeDeclaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    ImportHelper _imports = this.getImports();
    _imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    ImportHelper _imports_1 = this.getImports();
    _imports_1.addImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("if(");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_getMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("() != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _writerIdentifier = this.getWriterIdentifier();
    _builder.append(_writerIdentifier, "	");
    _builder.append(".name(\"");
    String _name = member.getName();
    _builder.append(_name, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _writerIdentifier_1 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_1, "	");
    _builder.append(".beginArray();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(");
    Type _type = member.getType();
    String _innerSignature = ModelExtensions.innerSignature(_type);
    _builder.append(_innerSignature, "	");
    _builder.append(" element : ");
    String _getMethodName_1 = ModelExtensions.toGetMethodName(member);
    String _subjectIdentifier_1 = this.getSubjectIdentifier();
    String _memberize_1 = ModelExtensions.memberize(_getMethodName_1, _subjectIdentifier_1);
    _builder.append(_memberize_1, "	");
    _builder.append("()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _writerIdentifier_2 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_2, "		");
    _builder.append(".value(element.toString());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _writerIdentifier_3 = this.getWriterIdentifier();
    _builder.append(_writerIdentifier_3, "	");
    _builder.append(".endArray();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genStatement(final Member skipMember) {
    if (skipMember instanceof SkipMember) {
      return _genStatement((SkipMember)skipMember);
    } else if (skipMember instanceof TypedMember) {
      return _genStatement((TypedMember)skipMember);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(skipMember).toString());
    }
  }
  
  public CharSequence genStatementForType(final TypedMember member, final Type type) {
    if (type instanceof GenericListType) {
      return _genStatementForType(member, (GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _genStatementForType(member, (IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _genStatementForType(member, (UserType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type).toString());
    }
  }
  
  public CharSequence genStatementForType(final TypedMember member, final UserType type, final UserTypeDeclaration decl) {
    if (decl instanceof ComplexTypeDeclaration) {
      return _genStatementForType(member, type, (ComplexTypeDeclaration)decl);
    } else if (decl instanceof EnumTypeDeclaration) {
      return _genStatementForType(member, type, (EnumTypeDeclaration)decl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, decl).toString());
    }
  }
  
  public CharSequence genStatementForGenericListType(final TypedMember member, final GenericListType type, final Type itemType) {
    if (itemType instanceof IntrinsicType) {
      return _genStatementForGenericListType(member, type, (IntrinsicType)itemType);
    } else if (itemType instanceof UserType) {
      return _genStatementForGenericListType(member, type, (UserType)itemType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, itemType).toString());
    }
  }
  
  public CharSequence genStatementForUserTypeGenericList(final TypedMember member, final GenericListType type, final UserType itemType, final UserTypeDeclaration decl) {
    if (decl instanceof ComplexTypeDeclaration) {
      return _genStatementForUserTypeGenericList(member, type, itemType, (ComplexTypeDeclaration)decl);
    } else if (decl instanceof EnumTypeDeclaration) {
      return _genStatementForUserTypeGenericList(member, type, itemType, (EnumTypeDeclaration)decl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member, type, itemType, decl).toString());
    }
  }
}
