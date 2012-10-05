package com.robotoworks.mechanoid.net.generator.strategy;

import com.google.common.base.Objects;
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.generator.strategy.MemberDeserializationStatementGenerator;
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
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ResponseGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  private MemberDeserializationStatementGenerator deserializationStatementGenerator;
  
  public MemberDeserializationStatementGenerator setMemberDeserializationStatementGenerator(final MemberDeserializationStatementGenerator deserializationStatementGenerator) {
    MemberDeserializationStatementGenerator _deserializationStatementGenerator = this.deserializationStatementGenerator = deserializationStatementGenerator;
    return _deserializationStatementGenerator;
  }
  
  public MemberDeserializationStatementGenerator getMemberDeserializationStatementGenerator() {
    return this.deserializationStatementGenerator;
  }
  
  public void registerImports() {
    this.context.registerImport("com.robotoworks.mechanoid.net.TransformerProvider");
    this.context.registerImport("com.robotoworks.mechanoid.net.TransformException");
    this.context.registerImport("java.io.InputStream");
    this.context.registerImport("com.robotoworks.mechanoid.util.Closeables");
  }
  
  public CharSequence generate(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = module.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence body = this.generateResponseClass(method, module, client);
    _builder.newLineIfNotEmpty();
    this.registerImports();
    _builder.newLineIfNotEmpty();
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
  
  public CharSequence generateResponseClass(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = method.getName();
    String _pascalize = ModelExtensions.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Response ");
    {
      boolean _and = false;
      ResponseBlock _response = method.getResponse();
      boolean _notEquals = (!Objects.equal(_response, null));
      if (!_notEquals) {
        _and = false;
      } else {
        ResponseBlock _response_1 = method.getResponse();
        ComplexTypeDeclaration _superType = _response_1.getSuperType();
        boolean _notEquals_1 = (!Objects.equal(_superType, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("extends ");
        ResponseBlock _response_2 = method.getResponse();
        ComplexTypeDeclaration _superType_1 = _response_2.getSuperType();
        String _name_1 = _superType_1.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      ResponseBlock _response_3 = method.getResponse();
      boolean _notEquals_2 = (!Objects.equal(_response_3, null));
      if (_notEquals_2) {
        _builder.append("\t");
        ResponseBlock _response_4 = method.getResponse();
        BlockType _type = _response_4.getType();
        CharSequence _generateFieldForType = this.generateFieldForType(_type);
        _builder.append(_generateFieldForType, "	");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        ResponseBlock _response_5 = method.getResponse();
        BlockType _type_1 = _response_5.getType();
        CharSequence _generateGetterForType = this.generateGetterForType(_type_1);
        _builder.append(_generateGetterForType, "	");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = method.getName();
    String _pascalize_1 = ModelExtensions.pascalize(_name_2);
    _builder.append(_pascalize_1, "	");
    _builder.append("Response(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {");
    _builder.newLineIfNotEmpty();
    {
      ResponseBlock _response_6 = method.getResponse();
      boolean _notEquals_3 = (!Objects.equal(_response_6, null));
      if (_notEquals_3) {
        {
          ResponseBlock _response_7 = method.getResponse();
          BlockType _type_2 = _response_7.getType();
          boolean _notEquals_4 = (!Objects.equal(_type_2, null));
          if (_notEquals_4) {
            _builder.append("\t\t");
            ResponseBlock _response_8 = method.getResponse();
            ResponseBlock _response_9 = method.getResponse();
            BlockType _type_3 = _response_9.getType();
            CharSequence _generateDeserializationStatementForType = this.generateDeserializationStatementForType(_response_8, _type_3);
            _builder.append(_generateDeserializationStatementForType, "		");
            _builder.newLineIfNotEmpty();
          } else {
            {
              ResponseBlock _response_10 = method.getResponse();
              ComplexTypeDeclaration _superType_2 = _response_10.getSuperType();
              boolean _notEquals_5 = (!Objects.equal(_superType_2, null));
              if (_notEquals_5) {
                _builder.append("\t\t");
                ResponseBlock _response_11 = method.getResponse();
                ResponseBlock _response_12 = method.getResponse();
                ComplexTypeDeclaration _superType_3 = _response_12.getSuperType();
                CharSequence _generateDeserializationStatementForSuperTypeOnly = this.generateDeserializationStatementForSuperTypeOnly(_response_11, _superType_3);
                _builder.append(_generateDeserializationStatementForSuperTypeOnly, "		");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      } else {
        _builder.append("\t\t");
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
        String _camelize = ModelExtensions.camelize(_innerSignature);
        String _pluralize = ModelExtensions.pluralize(_camelize);
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
    String _camelize = ModelExtensions.camelize(_signature_1);
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
    CharSequence _generateFieldForType = this.generateFieldForType(_literal);
    _builder.append(_generateFieldForType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Member> _members = type.getMembers();
      for(final Member member : _members) {
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
        String _pascalize = ModelExtensions.pascalize(_innerSignature);
        String _pluralize = ModelExtensions.pluralize(_pascalize);
        _builder.append(_pluralize, "");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _innerSignature_1 = ModelExtensions.innerSignature(type);
        String _camelize = ModelExtensions.camelize(_innerSignature_1);
        String _pluralize_1 = ModelExtensions.pluralize(_camelize);
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
    String _pascalize = ModelExtensions.pascalize(_signature_1);
    _builder.append(_pascalize, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _signature_2 = ModelExtensions.signature(type);
    String _camelize = ModelExtensions.camelize(_signature_2);
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
    return _builder;
  }
  
  protected CharSequence _generateGetter(final SkipMember member) {
    StringConcatenation _builder = new StringConcatenation();
    ComplexTypeLiteral _literal = member.getLiteral();
    CharSequence _generateGetterForType = this.generateGetterForType(_literal);
    _builder.append(_generateGetterForType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementHeader() {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("com.robotoworks.mechanoid.util.Streams");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(inStream != null){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String content = Streams.readAllText(inStream);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementFooter() {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("java.io.IOException");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} catch(Exception x) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw new TransformException(x);");
    _builder.newLine();
    _builder.append("} finally {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Closeables.closeSilently(inStream);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementForSuperTypeOnly(final ResponseBlock response, final ComplexTypeDeclaration superType) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JSONObject source = new JSONObject(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transformerProvider.get(");
    String _name = superType.getName();
    _builder.append(_name, "		");
    _builder.append("InputTransformer.class).transform(source, this);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JSONObject source = new JSONObject(content);");
    _builder.newLine();
    {
      EList<Member> _members = type.getMembers();
      for(final Member member : _members) {
        _builder.append("\t\t");
        CharSequence _generate = this.deserializationStatementGenerator.generate(member, "transformerProvider", "source", "this", true);
        _builder.append(_generate, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ComplexTypeDeclaration _superType = response.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append("\t\t");
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("transformerProvider.get(");
        ComplexTypeDeclaration _superType_1 = response.getSuperType();
        String _name = _superType_1.getName();
        _builder.append(_name, "		");
        _builder.append("InputTransformer.class).transform(source, this);");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.value = ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "		");
    _builder.append(".valueOf(content);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
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
    this.context.registerImport("org.json.JSONObject");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JSONObject source = new JSONObject(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    String _signature = ModelExtensions.signature(type);
    String _camelize = ModelExtensions.camelize(_signature);
    _builder.append(_camelize, "		");
    _builder.append(" = transformerProvider.get(");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "		");
    _builder.append("InputTransformer.class).transform(source);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserType(final ResponseBlock response, final UserType type, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _signature = ModelExtensions.signature(type);
    String _camelize = ModelExtensions.camelize(_signature);
    _builder.append(_camelize, "		");
    _builder.append(" = ");
    String _signature_1 = ModelExtensions.signature(type);
    _builder.append(_signature_1, "		");
    _builder.append(".fromValue(content);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
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
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.values = new Array");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "		");
    _builder.append("(source.length());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.values.add(source.");
    String _jSONPropertyGetMethod = ModelExtensions.toJSONPropertyGetMethod(genericType);
    _builder.append(_jSONPropertyGetMethod, "			");
    _builder.append("(i));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
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
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    String _innerSignature = ModelExtensions.innerSignature(type);
    String _camelize = ModelExtensions.camelize(_innerSignature);
    String _pluralize = ModelExtensions.pluralize(_camelize);
    _builder.append(_pluralize, "		");
    _builder.append(" = transformerProvider.get(");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "		");
    _builder.append("ListInputTransformer.class).transform(source);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
    _builder.append(_generateDeserializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeGenericList(final ResponseBlock response, final GenericListType type, final UserType genericType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    this.context.registerImport("org.json.JSONArray");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.List");
    _builder.newLineIfNotEmpty();
    this.context.registerImport("java.util.ArrayList");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDeserializationStatementHeader = this.generateDeserializationStatementHeader();
    _builder.append(_generateDeserializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    String _innerSignature = ModelExtensions.innerSignature(type);
    String _camelize = ModelExtensions.camelize(_innerSignature);
    String _pluralize = ModelExtensions.pluralize(_camelize);
    _builder.append(_pluralize, "		");
    _builder.append(" = new Array");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "		");
    _builder.append("(source.length());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_1, "			");
    _builder.append(" element = ");
    String _innerSignature_2 = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature_2, "			");
    _builder.append(".fromValue(source.");
    String _resolveGetJSONValueMethodName = ModelExtensions.resolveGetJSONValueMethodName(declaration);
    _builder.append(_resolveGetJSONValueMethodName, "			");
    _builder.append("(i));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.");
    String _innerSignature_3 = ModelExtensions.innerSignature(type);
    String _camelize_1 = ModelExtensions.camelize(_innerSignature_3);
    String _pluralize_1 = ModelExtensions.pluralize(_camelize_1);
    _builder.append(_pluralize_1, "			");
    _builder.append(".add(element);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    CharSequence _generateDeserializationStatementFooter = this.generateDeserializationStatementFooter();
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
  
  public CharSequence generateDeserializationStatementForType(final ResponseBlock response, final BlockType type) {
    if (type instanceof GenericListType) {
      return _generateDeserializationStatementForType(response, (GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateDeserializationStatementForType(response, (IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateDeserializationStatementForType(response, (UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateDeserializationStatementForType(response, (ComplexTypeLiteral)type);
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
