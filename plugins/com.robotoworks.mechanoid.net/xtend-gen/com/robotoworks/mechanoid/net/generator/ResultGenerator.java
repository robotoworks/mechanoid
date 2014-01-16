package com.robotoworks.mechanoid.net.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.generator.JsonReaderStatementGenerator;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.BlockType;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.ResponseBlock;
import com.robotoworks.mechanoid.net.netModel.SkipMember;
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration;
import com.robotoworks.mechanoid.text.Strings;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ResultGenerator {
  @Inject
  private ImportHelper imports;
  
  @Inject
  private JsonReaderStatementGenerator jsonReaderGenerator;
  
  public CharSequence generate(final HttpMethod method, final Model model, final Client client) {
    CharSequence _xblockexpression = null;
    {
      this.jsonReaderGenerator.setImports(this.imports);
      this.jsonReaderGenerator.setReaderIdentifier("reader");
      this.jsonReaderGenerator.setSubjectIdentifier("subject");
      CharSequence _doGenerate = this.doGenerate(method, model, client);
      _xblockexpression = (_doGenerate);
    }
    return _xblockexpression;
  }
  
  public CharSequence doGenerate(final HttpMethod method, final Model model, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence classDecl = this.generateResponseClass(method, model, client);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.ServiceResult;");
    _builder.newLine();
    _builder.append("import java.io.InputStream;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.util.Closeables;");
    _builder.newLine();
    StringConcatenation _printAndClear = this.imports.printAndClear();
    _builder.append(_printAndClear, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(classDecl, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Member> _members = type.getMembers();
      for(final Member member : _members) {
        CharSequence _generateFieldForMember = this.generateFieldForMember(member);
        _builder.append(_generateFieldForMember, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateFieldsForMemberList(final EList<Member> members) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Member member : members) {
        CharSequence _generateFieldForMember = this.generateFieldForMember(member);
        _builder.append(_generateFieldForMember, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" value;\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _elementType = type.getElementType();
      if ((_elementType instanceof IntrinsicType)) {
        _builder.append("private ");
        String _signature = ModelExtensions.signature(type);
        _builder.append(_signature, "");
        _builder.append(" values;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("private ");
        String _signature_1 = ModelExtensions.signature(type);
        _builder.append(_signature_1, "");
        _builder.append(" ");
        String _innerSignature = ModelExtensions.innerSignature(type);
        String _camelize = Strings.camelize(_innerSignature);
        String _pluralize = Strings.pluralize(_camelize);
        _builder.append(_pluralize, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" ");
    String _signature_1 = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature_1);
    String _escapeReserved = ModelExtensions.escapeReserved(_camelize);
    _builder.append(_escapeReserved, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    Type _type = member.getType();
    String _signature = ModelExtensions.signature(_type);
    _builder.append(_signature, "");
    _builder.append(" ");
    String _identifier = ModelExtensions.toIdentifier(member);
    _builder.append(_identifier, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final SkipMember member) {
    StringConcatenation _builder = new StringConcatenation();
    ComplexTypeLiteral _literal = member.getLiteral();
    Object _generateFieldForType = this.generateFieldForType(_literal);
    _builder.append(_generateFieldForType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Member> _members = type.getMembers();
    CharSequence _generateGettersForMemberList = this.generateGettersForMemberList(_members);
    _builder.append(_generateGettersForMemberList, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateGettersForMemberList(final EList<Member> members) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Member member : members) {
        CharSequence _generateGetter = this.generateGetter(member);
        _builder.append(_generateGetter, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" getValue(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.value;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _elementType = type.getElementType();
      if ((_elementType instanceof IntrinsicType)) {
        _builder.append("public ");
        String _signature = ModelExtensions.signature(type);
        _builder.append(_signature, "");
        _builder.append(" getValues(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.values;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("public ");
        String _signature_1 = ModelExtensions.signature(type);
        _builder.append(_signature_1, "");
        _builder.append(" get");
        String _innerSignature = ModelExtensions.innerSignature(type);
        String _pascalize = Strings.pascalize(_innerSignature);
        String _pluralize = Strings.pluralize(_pascalize);
        _builder.append(_pluralize, "");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _innerSignature_1 = ModelExtensions.innerSignature(type);
        String _camelize = Strings.camelize(_innerSignature_1);
        String _pluralize_1 = Strings.pluralize(_camelize);
        _builder.append(_pluralize_1, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" get");
    String _signature_1 = ModelExtensions.signature(type);
    String _pascalize = Strings.pascalize(_signature_1);
    _builder.append(_pascalize, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _signature_2 = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature_2);
    String _escapeReserved = ModelExtensions.escapeReserved(_camelize);
    _builder.append(_escapeReserved, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetter(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    Type _type = member.getType();
    String _signature = ModelExtensions.signature(_type);
    _builder.append(_signature, "");
    _builder.append(" ");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    _builder.append(_getMethodName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _identifier = ModelExtensions.toIdentifier(member);
    _builder.append(_identifier, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("public void ");
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    _builder.append(_setMethodName, "");
    _builder.append("(");
    Type _type_1 = member.getType();
    String _signature_1 = ModelExtensions.signature(_type_1);
    _builder.append(_signature_1, "");
    _builder.append(" value){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _identifier_1 = ModelExtensions.toIdentifier(member);
    _builder.append(_identifier_1, "	");
    _builder.append(" = value;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetter(final SkipMember member) {
    StringConcatenation _builder = new StringConcatenation();
    ComplexTypeLiteral _literal = member.getLiteral();
    Object _generateGetterForType = this.generateGetterForType(_literal);
    _builder.append(_generateGetterForType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateBaseAccessors(final Iterable<Member> members) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Member member : members) {
        CharSequence _generateBaseAccessor = this.generateBaseAccessor(member);
        _builder.append(_generateBaseAccessor, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateBaseAccessor(final SkipMember member) {
    StringConcatenation _builder = new StringConcatenation();
    ComplexTypeLiteral _literal = member.getLiteral();
    EList<Member> _members = _literal.getMembers();
    Object _generateBaseAccessors = this.generateBaseAccessors(_members);
    _builder.append(_generateBaseAccessors, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateBaseAccessor(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _type = member.getType();
      if ((_type instanceof GenericListType)) {
        this.imports.addImport("java.util.List");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    Type _type_1 = member.getType();
    String _signature = ModelExtensions.signature(_type_1);
    _builder.append(_signature, "");
    _builder.append(" ");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    _builder.append(_getMethodName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return base.");
    String _getMethodName_1 = ModelExtensions.toGetMethodName(member);
    _builder.append(_getMethodName_1, "	");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("public void ");
    String _setMethodName = ModelExtensions.toSetMethodName(member);
    _builder.append(_setMethodName, "");
    _builder.append("(");
    Type _type_2 = member.getType();
    String _signature_1 = ModelExtensions.signature(_type_2);
    _builder.append(_signature_1, "");
    _builder.append(" value){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("base.");
    String _setMethodName_1 = ModelExtensions.toSetMethodName(member);
    _builder.append(_setMethodName_1, "	");
    _builder.append("(value);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateResponseClass(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    final ResponseBlock responseBlock = ModelExtensions.getResponseBlock(method);
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Result extends ServiceResult {");
    _builder.newLineIfNotEmpty();
    {
      BlockType _type = null;
      if (responseBlock!=null) {
        _type=responseBlock.getType();
      }
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        _builder.append("\t");
        BlockType _type_1 = responseBlock.getType();
        CharSequence _generateFieldForType = this.generateFieldForType(_type_1);
        _builder.append(_generateFieldForType, "	");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        BlockType _type_2 = responseBlock.getType();
        CharSequence _generateGetterForType = this.generateGetterForType(_type_2);
        _builder.append(_generateGetterForType, "	");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ComplexTypeDeclaration _superType = null;
      if (responseBlock!=null) {
        _superType=responseBlock.getSuperType();
      }
      boolean _notEquals_1 = (!Objects.equal(_superType, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("private ");
        ComplexTypeDeclaration _superType_1 = responseBlock.getSuperType();
        String _name_1 = _superType_1.getName();
        String _pascalize_1 = Strings.pascalize(_name_1);
        _builder.append(_pascalize_1, "	");
        _builder.append(" base;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        ComplexTypeDeclaration _superType_2 = responseBlock.getSuperType();
        ComplexTypeLiteral _literal = _superType_2.getLiteral();
        EList<Member> _members = _literal.getMembers();
        final Function1<Member,Boolean> _function = new Function1<Member,Boolean>() {
          public Boolean apply(final Member superMember) {
            BlockType _type = null;
            if (responseBlock!=null) {
              _type=responseBlock.getType();
            }
            if ((_type instanceof ComplexTypeLiteral)) {
              BlockType _type_1 = responseBlock.getType();
              EList<Member> _members = ((ComplexTypeLiteral) _type_1).getMembers();
              final Function1<Member,Boolean> _function = new Function1<Member,Boolean>() {
                public Boolean apply(final Member member) {
                  String _name = superMember.getName();
                  String _name_1 = member.getName();
                  boolean _equals = _name.equals(_name_1);
                  return Boolean.valueOf(_equals);
                }
              };
              Member _findFirst = IterableExtensions.<Member>findFirst(_members, _function);
              return Boolean.valueOf(Objects.equal(_findFirst, null));
            }
            return Boolean.valueOf(true);
          }
        };
        Iterable<Member> _filter = IterableExtensions.<Member>filter(_members, _function);
        CharSequence _generateBaseAccessors = this.generateBaseAccessors(_filter);
        _builder.append(_generateBaseAccessors, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = method.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    _builder.append(_pascalize_2, "	");
    _builder.append("Result(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_2 = (!Objects.equal(responseBlock, null));
      if (_notEquals_2) {
        {
          boolean _or = false;
          BlockType _type_3 = responseBlock.getType();
          if ((_type_3 instanceof ComplexTypeLiteral)) {
            _or = true;
          } else {
            ComplexTypeDeclaration _superType_3 = responseBlock.getSuperType();
            boolean _notEquals_3 = (!Objects.equal(_superType_3, null));
            _or = ((_type_3 instanceof ComplexTypeLiteral) || _notEquals_3);
          }
          if (_or) {
            _builder.append("\t");
            CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(true);
            _builder.append(_generateDeserializationStatementHeader, "	");
            _builder.newLineIfNotEmpty();
            {
              ComplexTypeDeclaration _superType_4 = responseBlock.getSuperType();
              boolean _notEquals_4 = (!Objects.equal(_superType_4, null));
              if (_notEquals_4) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("this.base = new ");
                ComplexTypeDeclaration _superType_5 = responseBlock.getSuperType();
                String _name_3 = _superType_5.getName();
                String _pascalize_3 = Strings.pascalize(_name_3);
                _builder.append(_pascalize_3, "		");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              BlockType _type_4 = responseBlock.getType();
              if ((_type_4 instanceof ComplexTypeLiteral)) {
                _builder.append("\t");
                _builder.append("\t");
                String _name_4 = method.getName();
                String _pascalize_4 = Strings.pascalize(_name_4);
                _builder.append(_pascalize_4, "		");
                _builder.append("Result subject = this;");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                BlockType _type_5 = responseBlock.getType();
                ComplexTypeDeclaration _superType_6 = null;
                if (responseBlock!=null) {
                  _superType_6=responseBlock.getSuperType();
                }
                ComplexTypeLiteral _literal_1 = null;
                if (_superType_6!=null) {
                  _literal_1=_superType_6.getLiteral();
                }
                EList<Member> _mergeMembers = this.mergeMembers(((ComplexTypeLiteral) _type_5), _literal_1);
                CharSequence _genReadComplexTypeLiteralForMembers = this.jsonReaderGenerator.genReadComplexTypeLiteralForMembers(_mergeMembers);
                _builder.append(_genReadComplexTypeLiteralForMembers, "		");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(true);
            _builder.append(_generateDeserializationStatementFooter, "	");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            BlockType _type_6 = responseBlock.getType();
            CharSequence _generateDeserializationStatementForType = this.generateDeserializationStatementForType(responseBlock, ((Type) _type_6));
            _builder.append(_generateDeserializationStatementForType, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        _builder.append("Closeables.closeSilently(inStream);");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementHeader(final boolean withReader) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (withReader) {
        this.imports.addImport("com.robotoworks.mechanoid.internal.util.JsonReader");
        _builder.newLineIfNotEmpty();
        this.imports.addImport("java.io.InputStreamReader");
        _builder.newLineIfNotEmpty();
        this.imports.addImport("java.nio.charset.Charset");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("JsonReader reader = null;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(inStream != null) {");
    _builder.newLine();
    {
      if (withReader) {
        _builder.append("\t\t\t");
        _builder.append("reader = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementFooter(final boolean withReader) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} finally {");
    _builder.newLine();
    {
      if (withReader) {
        _builder.append("\t");
        _builder.append("Closeables.closeSilently(reader);");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("Closeables.closeSilently(inStream);");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public EList<Member> mergeMembers(final ComplexTypeLiteral a, final ComplexTypeLiteral b) {
    HashMap<String,Member> _hashMap = new HashMap<String, Member>();
    HashMap<String,Member> members = _hashMap;
    boolean _notEquals = (!Objects.equal(a, null));
    if (_notEquals) {
      EList<Member> _members = a.getMembers();
      for (final Member m : _members) {
        String _name = m.getName();
        members.put(_name, m);
      }
    }
    boolean _notEquals_1 = (!Objects.equal(b, null));
    if (_notEquals_1) {
      EList<Member> _members_1 = b.getMembers();
      for (final Member m_1 : _members_1) {
        String _name_1 = m_1.getName();
        boolean _containsKey = members.containsKey(_name_1);
        boolean _not = (!_containsKey);
        if (_not) {
          String _name_2 = m_1.getName();
          members.put(_name_2, m_1);
        }
      }
    }
    Collection<Member> _values = members.values();
    BasicEList<Member> _basicEList = new BasicEList<Member>(_values);
    return _basicEList;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("com.robotoworks.mechanoid.util.Streams");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(false);
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("String source = Streams.readAllText(inStream);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.value = ");
    String _boxedTypeSignature = ModelExtensions.getBoxedTypeSignature(type);
    _builder.append(_boxedTypeSignature, "		");
    _builder.append(".valueOf(source);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(false);
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final UserType type) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    CharSequence _generateDeserializationStatementForUserType = this.generateDeserializationStatementForUserType(response, type, _declaration);
    return _generateDeserializationStatementForUserType;
  }
  
  protected CharSequence _generateDeserializationStatementForUserType(final ResponseBlock response, final UserType type, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(true);
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _signature = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature);
    _builder.append(_camelize, "		");
    _builder.append(" = new ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "		");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("provider.get(");
    String _signature_2 = ModelExtensions.signature(type);
    _builder.append(_signature_2, "		");
    _builder.append(".class).read(reader, this.");
    String _signature_3 = ModelExtensions.signature(type);
    String _camelize_1 = Strings.camelize(_signature_3);
    _builder.append(_camelize_1, "		");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(true);
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserType(final ResponseBlock response, final UserType type, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("com.robotoworks.mechanoid.util.Streams");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(false);
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("String source = Streams.readAllText(inStream);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    String _signature = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature);
    _builder.append(_camelize, "		");
    _builder.append(" = ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "		");
    _builder.append(".fromValue(source);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(false);
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final GenericListType type) {
    Type _elementType = type.getElementType();
    CharSequence _generateDeserializationStatementForGenericListType = this.generateDeserializationStatementForGenericListType(response, type, _elementType);
    return _generateDeserializationStatementForGenericListType;
  }
  
  protected CharSequence _generateDeserializationStatementForGenericListType(final ResponseBlock response, final GenericListType type, final IntrinsicType genericType) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil");
    _builder.newLineIfNotEmpty();
    this.imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(true);
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.values = JsonUtil.read");
    String _boxedTypeSignature = ModelExtensions.getBoxedTypeSignature(genericType);
    _builder.append(_boxedTypeSignature, "		");
    _builder.append("List(reader);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(true);
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForGenericListType(final ResponseBlock response, final GenericListType type, final UserType genericType) {
    UserTypeDeclaration _declaration = genericType.getDeclaration();
    CharSequence _generateDeserializationStatementForUserTypeGenericList = this.generateDeserializationStatementForUserTypeGenericList(response, type, genericType, _declaration);
    return _generateDeserializationStatementForUserTypeGenericList;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeGenericList(final ResponseBlock response, final GenericListType type, final UserType genericType, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.imports.addImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(true);
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _innerSignature = ModelExtensions.innerSignature(type);
    String _camelize = Strings.camelize(_innerSignature);
    String _pluralize = Strings.pluralize(_camelize);
    _builder.append(_pluralize, "		");
    _builder.append(" = new ArrayList<");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "		");
    _builder.append(">();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("provider.get(");
    String _innerSignature_2 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_2, "		");
    _builder.append(".class).readList(reader, this.");
    String _innerSignature_3 = ModelExtensions.innerSignature(type);
    String _camelize_1 = Strings.camelize(_innerSignature_3);
    String _pluralize_1 = Strings.pluralize(_camelize_1);
    _builder.append(_pluralize_1, "		");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(true);
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeGenericList(final ResponseBlock response, final GenericListType type, final UserType genericType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("com.robotoworks.mechanoid.internal.util.JsonToken");
    _builder.newLineIfNotEmpty();
    this.imports.addImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    this.imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader(true);
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _innerSignature = ModelExtensions.innerSignature(type);
    String _camelize = Strings.camelize(_innerSignature);
    String _pluralize = Strings.pluralize(_camelize);
    _builder.append(_pluralize, "		");
    _builder.append(" = new Array");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "		");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(reader.peek() != JsonToken.NULL) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("reader.beginArray();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("while(reader.hasNext()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "				");
    _builder.append(" element = ");
    String _innerSignature_2 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_2, "				");
    _builder.append(".fromValue(reader.");
    String _resolveJsonReaderMethodName = ModelExtensions.resolveJsonReaderMethodName(declaration);
    _builder.append(_resolveJsonReaderMethodName, "				");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("this.");
    String _innerSignature_3 = ModelExtensions.innerSignature(type);
    String _camelize_1 = Strings.camelize(_innerSignature_3);
    String _pluralize_1 = Strings.pluralize(_camelize_1);
    _builder.append(_pluralize_1, "				");
    _builder.append(".add(element);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("reader.endArray();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter(true);
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateFieldForType(final BlockType type) {
    if (type instanceof GenericListType) {
      return _generateFieldForType((GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateFieldForType((IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateFieldForType((UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateFieldForType((ComplexTypeLiteral)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public CharSequence generateFieldForMember(final Member member) {
    if (member instanceof SkipMember) {
      return _generateFieldForMember((SkipMember)member);
    } else if (member instanceof TypedMember) {
      return _generateFieldForMember((TypedMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateGetterForType(final BlockType type) {
    if (type instanceof GenericListType) {
      return _generateGetterForType((GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateGetterForType((IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateGetterForType((UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateGetterForType((ComplexTypeLiteral)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public CharSequence generateGetter(final Member member) {
    if (member instanceof SkipMember) {
      return _generateGetter((SkipMember)member);
    } else if (member instanceof TypedMember) {
      return _generateGetter((TypedMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateBaseAccessor(final Member member) {
    if (member instanceof SkipMember) {
      return _generateBaseAccessor((SkipMember)member);
    } else if (member instanceof TypedMember) {
      return _generateBaseAccessor((TypedMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateDeserializationStatementForType(final ResponseBlock response, final Type type) {
    if (type instanceof GenericListType) {
      return _generateDeserializationStatementForType(response, (GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateDeserializationStatementForType(response, (IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateDeserializationStatementForType(response, (UserType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(response, type).toString());
    }
  }
  
  public CharSequence generateDeserializationStatementForUserType(final ResponseBlock response, final UserType type, final UserTypeDeclaration declaration) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateDeserializationStatementForUserType(response, type, (ComplexTypeDeclaration)declaration);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateDeserializationStatementForUserType(response, type, (EnumTypeDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(response, type, declaration).toString());
    }
  }
  
  public CharSequence generateDeserializationStatementForGenericListType(final ResponseBlock response, final GenericListType type, final Type genericType) {
    if (genericType instanceof IntrinsicType) {
      return _generateDeserializationStatementForGenericListType(response, type, (IntrinsicType)genericType);
    } else if (genericType instanceof UserType) {
      return _generateDeserializationStatementForGenericListType(response, type, (UserType)genericType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(response, type, genericType).toString());
    }
  }
  
  public CharSequence generateDeserializationStatementForUserTypeGenericList(final ResponseBlock response, final GenericListType type, final UserType genericType, final UserTypeDeclaration declaration) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateDeserializationStatementForUserTypeGenericList(response, type, genericType, (ComplexTypeDeclaration)declaration);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateDeserializationStatementForUserTypeGenericList(response, type, genericType, (EnumTypeDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(response, type, genericType, declaration).toString());
    }
  }
}
