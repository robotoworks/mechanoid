package com.robotoworks.mechanoid.net.generator;

import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.BooleanType;
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
import com.robotoworks.mechanoid.text.Strings;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JsonReaderStatementGenerator {
  private ImportHelper _imports;
  
  public ImportHelper getImports() {
    return this._imports;
  }
  
  public void setImports(final ImportHelper imports) {
    this._imports = imports;
  }
  
  /**
   * The identifier of the JSONReader instance
   */
  private String _readerIdentifier = "source";
  
  /**
   * The identifier of the JSONReader instance
   */
  public String getReaderIdentifier() {
    return this._readerIdentifier;
  }
  
  /**
   * The identifier of the JSONReader instance
   */
  public void setReaderIdentifier(final String readerIdentifier) {
    this._readerIdentifier = readerIdentifier;
  }
  
  /**
   * The identifier of the reader subject (the entity the reader is
   * setting data to)
   */
  private String _subjectIdentifier = "entity";
  
  /**
   * The identifier of the reader subject (the entity the reader is
   * setting data to)
   */
  public String getSubjectIdentifier() {
    return this._subjectIdentifier;
  }
  
  /**
   * The identifier of the reader subject (the entity the reader is
   * setting data to)
   */
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
  
  public CharSequence genReadComplexType(final ComplexTypeDeclaration decl) {
    ComplexTypeLiteral _literal = decl.getLiteral();
    CharSequence _genReadComplexTypeLiteral = this.genReadComplexTypeLiteral(_literal);
    return _genReadComplexTypeLiteral;
  }
  
  public CharSequence genReadComplexTypeLiteral(final ComplexTypeLiteral literal) {
    StringConcatenation _builder = new StringConcatenation();
    ImportHelper _imports = this.getImports();
    _imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken");
    _builder.newLineIfNotEmpty();
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(".beginObject();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("while(");
    String _readerIdentifier_1 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_1, "");
    _builder.append(".hasNext()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("String name = ");
    String _readerIdentifier_2 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_2, "	");
    _builder.append(".nextName();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(");
    String _readerIdentifier_3 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_3, "	");
    _builder.append(".peek() == JsonToken.NULL) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _readerIdentifier_4 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_4, "		");
    _builder.append(".skipValue();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    int COUNTER = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<Member> _members = literal.getMembers();
      for(final Member member : _members) {
        _builder.append("\t");
        int _plus = (COUNTER + 1);
        int _COUNTER = COUNTER = _plus;
        CharSequence _genBlock = this.genBlock(member, _COUNTER);
        _builder.append(_genBlock, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _greaterThan = (COUNTER > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _readerIdentifier_5 = this.getReaderIdentifier();
        _builder.append(_readerIdentifier_5, "		");
        _builder.append(".skipValue();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _readerIdentifier_6 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_6, "");
    _builder.append(".endObject();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genReadComplexTypeLiteralForMembers(final EList<Member> members) {
    StringConcatenation _builder = new StringConcatenation();
    ImportHelper _imports = this.getImports();
    _imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken");
    _builder.newLineIfNotEmpty();
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(".beginObject();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("while(");
    String _readerIdentifier_1 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_1, "");
    _builder.append(".hasNext()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("String name = ");
    String _readerIdentifier_2 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_2, "	");
    _builder.append(".nextName();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(");
    String _readerIdentifier_3 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_3, "	");
    _builder.append(".peek() == JsonToken.NULL) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _readerIdentifier_4 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_4, "		");
    _builder.append(".skipValue();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    int COUNTER = 0;
    _builder.newLineIfNotEmpty();
    {
      for(final Member member : members) {
        _builder.append("\t");
        int _plus = (COUNTER + 1);
        int _COUNTER = COUNTER = _plus;
        CharSequence _genBlock = this.genBlock(member, _COUNTER);
        _builder.append(_genBlock, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _greaterThan = (COUNTER > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _readerIdentifier_5 = this.getReaderIdentifier();
        _builder.append(_readerIdentifier_5, "		");
        _builder.append(".skipValue();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _readerIdentifier_6 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_6, "");
    _builder.append(".endObject();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genBlock(final Member member, final int blockNumber) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _greaterThan = (blockNumber > 1);
      if (_greaterThan) {
        _builder.append("else ");
      }
    }
    _builder.append("if(name.equals(\"");
    String _name = member.getName();
    _builder.append(_name, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _genStatement = this.genStatement(member);
    _builder.append(_genStatement, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genStatement(final TypedMember member) {
    Type _type = member.getType();
    CharSequence _genStatementForType = this.genStatementForType(member, _type);
    return _genStatementForType;
  }
  
  protected CharSequence _genStatement(final SkipMember skipMember) {
    StringConcatenation _builder = new StringConcatenation();
    ImportHelper _imports = this.getImports();
    _imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken");
    _builder.newLineIfNotEmpty();
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(".beginObject();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("while(");
    String _readerIdentifier_1 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_1, "");
    _builder.append(".hasNext()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("name = ");
    String _readerIdentifier_2 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_2, "	");
    _builder.append(".nextName();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(");
    String _readerIdentifier_3 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_3, "	");
    _builder.append(".peek() == JsonToken.NULL) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _readerIdentifier_4 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_4, "		");
    _builder.append(".skipValue();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    int COUNTER = 0;
    _builder.newLineIfNotEmpty();
    {
      ComplexTypeLiteral _literal = skipMember.getLiteral();
      EList<Member> _members = _literal.getMembers();
      for(final Member member : _members) {
        _builder.append("\t");
        int _plus = (COUNTER + 1);
        int _COUNTER = COUNTER = _plus;
        CharSequence _genBlock = this.genBlock(member, _COUNTER);
        _builder.append(_genBlock, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _greaterThan = (COUNTER > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _readerIdentifier_5 = this.getReaderIdentifier();
        _builder.append(_readerIdentifier_5, "		");
        _builder.append(".skipValue();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _readerIdentifier_6 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_6, "");
    _builder.append(".endObject();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((type instanceof BooleanType)) {
        ImportHelper _imports = this.getImports();
        _imports.addImport("com.robotoworks.mechanoid.net.JsonReaderUtil");
        _builder.newLineIfNotEmpty();
        String _setMethodName = ModelExtensions.toSetMethodName(member);
        String _subjectIdentifier = this.getSubjectIdentifier();
        String _memberize = ModelExtensions.memberize(_setMethodName, _subjectIdentifier);
        _builder.append(_memberize, "");
        _builder.append("(JsonReaderUtil.coerceNextBoolean(");
        String _readerIdentifier = this.getReaderIdentifier();
        _builder.append(_readerIdentifier, "");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      } else {
        String _setMethodName_1 = ModelExtensions.toSetMethodName(member);
        String _subjectIdentifier_1 = this.getSubjectIdentifier();
        String _memberize_1 = ModelExtensions.memberize(_setMethodName_1, _subjectIdentifier_1);
        _builder.append(_memberize_1, "");
        _builder.append("(");
        String _readerIdentifier_1 = this.getReaderIdentifier();
        _builder.append(_readerIdentifier_1, "");
        _builder.append(".next");
        String _signature = ModelExtensions.signature(type);
        String _pascalize = Strings.pascalize(_signature);
        _builder.append(_pascalize, "");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final UserType type) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    CharSequence _genStatementForType = this.genStatementForType(member, type, _declaration);
    return _genStatementForType;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final UserType type, final ComplexTypeDeclaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" entityMember = new ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    String _providerIdentifier = this.getProviderIdentifier();
    _builder.append(_providerIdentifier, "");
    _builder.append(".get(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "");
    _builder.append(".class).read(");
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(", entityMember);");
    _builder.newLineIfNotEmpty();
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_setMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("(entityMember);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genStatementForType(final TypedMember member, final UserType type, final EnumTypeDeclaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" entityMember = ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "");
    _builder.append(".fromValue(");
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(".");
    String _resolveJsonReaderMethodName = ModelExtensions.resolveJsonReaderMethodName(decl);
    _builder.append(_resolveJsonReaderMethodName, "");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_setMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("(entityMember);");
    _builder.newLineIfNotEmpty();
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
    _imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    ImportHelper _imports_1 = this.getImports();
    _imports_1.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil");
    _builder.newLineIfNotEmpty();
    _builder.append("List<");
    String _boxedTypeSignature = ModelExtensions.getBoxedTypeSignature(itemType);
    _builder.append(_boxedTypeSignature, "");
    _builder.append("> entityMember = JsonUtil.read");
    String _boxedTypeSignature_1 = ModelExtensions.getBoxedTypeSignature(itemType);
    _builder.append(_boxedTypeSignature_1, "");
    _builder.append("List(");
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_setMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("(entityMember);");
    _builder.newLineIfNotEmpty();
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
    ImportHelper _imports_1 = this.getImports();
    _imports_1.addImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" entityMember = new ArrayList<");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "");
    _builder.append(">();");
    _builder.newLineIfNotEmpty();
    String _providerIdentifier = this.getProviderIdentifier();
    _builder.append(_providerIdentifier, "");
    _builder.append(".get(");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "");
    _builder.append(".class).read(");
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(", entityMember);");
    _builder.newLineIfNotEmpty();
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_setMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("(entityMember);");
    _builder.newLineIfNotEmpty();
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
    ImportHelper _imports_2 = this.getImports();
    _imports_2.addImport("com.robotoworks.mechanoid.internal.util.JsonToken");
    _builder.newLineIfNotEmpty();
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" entityMember = new ArrayList");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _readerIdentifier = this.getReaderIdentifier();
    _builder.append(_readerIdentifier, "");
    _builder.append(".beginArray();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("while(");
    String _readerIdentifier_1 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_1, "");
    _builder.append(".hasNext()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "	");
    _builder.append(" element = ");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "	");
    _builder.append(".fromValue(");
    String _readerIdentifier_2 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_2, "	");
    _builder.append(".");
    String _resolveJsonReaderMethodName = ModelExtensions.resolveJsonReaderMethodName(decl);
    _builder.append(_resolveJsonReaderMethodName, "	");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("targetMember.add(element);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _readerIdentifier_3 = this.getReaderIdentifier();
    _builder.append(_readerIdentifier_3, "");
    _builder.append(".endArray();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    String _subjectIdentifier = this.getSubjectIdentifier();
    String _memberize = ModelExtensions.memberize(_setMethodName, _subjectIdentifier);
    _builder.append(_memberize, "");
    _builder.append("(entityMember);");
    _builder.newLineIfNotEmpty();
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
