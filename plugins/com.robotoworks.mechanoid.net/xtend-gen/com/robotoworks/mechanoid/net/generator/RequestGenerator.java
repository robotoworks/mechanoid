package com.robotoworks.mechanoid.net.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.robotoworks.mechanoid.net.generator.ImportHelper;
import com.robotoworks.mechanoid.net.generator.JsonWriterStatementGenerator;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.BlockType;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.Header;
import com.robotoworks.mechanoid.net.netModel.HeaderBlock;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Literal;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.Path;
import com.robotoworks.mechanoid.net.netModel.SimpleMember;
import com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment;
import com.robotoworks.mechanoid.net.netModel.SkipMember;
import com.robotoworks.mechanoid.net.netModel.StringType;
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration;
import com.robotoworks.mechanoid.text.Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RequestGenerator {
  @Inject
  private ImportHelper imports;
  
  @Inject
  private JsonWriterStatementGenerator jsonWriterGenerator;
  
  @Inject
  private ISerializer serializer;
  
  public CharSequence generate(final HttpMethod method, final Model module, final Client client) {
    CharSequence _xblockexpression = null;
    {
      this.jsonWriterGenerator.setImports(this.imports);
      this.jsonWriterGenerator.setWriterIdentifier("writer");
      _xblockexpression = this.doGenerate(method, module, client);
    }
    return _xblockexpression;
  }
  
  public CharSequence doGenerate(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = module.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence classDecl = this.generateRequestClass(method, module, client);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    {
      boolean _hasBody = ModelExtensions.hasBody(method);
      if (_hasBody) {
        _builder.append("import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;");
        _builder.newLine();
        _builder.append("import com.robotoworks.mechanoid.net.EntityEnclosedServiceRequest;");
        _builder.newLine();
      } else {
        _builder.append("import com.robotoworks.mechanoid.net.ServiceRequest;");
        _builder.newLine();
      }
    }
    StringConcatenation _printAndClear = this.imports.printAndClear();
    _builder.append(_printAndClear, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(classDecl, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateRequestClass(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Request extends ");
    {
      boolean _hasBody = ModelExtensions.hasBody(method);
      if (_hasBody) {
        _builder.append("EntityEnclosed");
      }
    }
    _builder.append("ServiceRequest {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String PATH = \"");
    String _pathAsFormatString = ModelExtensions.getPathAsFormatString(method, this.serializer);
    _builder.append(_pathAsFormatString, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      Path _path = method.getPath();
      EList<SimpleMemberAssignment> _params = null;
      if (_path!=null) {
        _params=_path.getParams();
      }
      int _size = 0;
      if (_params!=null) {
        _size=_params.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          Path _path_1 = method.getPath();
          EList<SimpleMemberAssignment> _params_1 = _path_1.getParams();
          for(final SimpleMemberAssignment slug : _params_1) {
            _builder.append("\t");
            _builder.append("private final ");
            SimpleMember _member = slug.getMember();
            IntrinsicType _type = _member.getType();
            String _signature = ModelExtensions.signature(_type);
            _builder.append(_signature, "\t");
            _builder.append(" ");
            SimpleMember _member_1 = slug.getMember();
            String _name_1 = _member_1.getName();
            String _camelize = Strings.camelize(_name_1);
            _builder.append(_camelize, "\t");
            _builder.append("Segment;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    ParamsBlock methodParams = ModelExtensions.getParamsBlock(method);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ParamsBlock clientParams = ModelExtensions.getParamsBlock(client);
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(methodParams, null));
      if (_notEquals) {
        {
          EList<SimpleMemberAssignment> _params_2 = methodParams.getParams();
          for(final SimpleMemberAssignment param : _params_2) {
            _builder.append("\t");
            _builder.append("private ");
            SimpleMember _member_2 = param.getMember();
            IntrinsicType _type_1 = _member_2.getType();
            String _signature_1 = ModelExtensions.signature(_type_1);
            _builder.append(_signature_1, "\t");
            _builder.append(" ");
            SimpleMember _member_3 = param.getMember();
            String _name_2 = _member_3.getName();
            String _camelize_1 = Strings.camelize(_name_2);
            _builder.append(_camelize_1, "\t");
            _builder.append("Param");
            {
              Literal _defaultValue = param.getDefaultValue();
              boolean _notEquals_1 = (!Objects.equal(_defaultValue, null));
              if (_notEquals_1) {
                _builder.append(" = ");
                Literal _defaultValue_1 = param.getDefaultValue();
                String _convertToJavaLiteral = ModelExtensions.convertToJavaLiteral(_defaultValue_1);
                _builder.append(_convertToJavaLiteral, "\t");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private boolean ");
            SimpleMember _member_4 = param.getMember();
            String _name_3 = _member_4.getName();
            String _camelize_2 = Strings.camelize(_name_3);
            _builder.append(_camelize_2, "\t");
            _builder.append("ParamSet");
            {
              Literal _defaultValue_2 = param.getDefaultValue();
              boolean _notEquals_2 = (!Objects.equal(_defaultValue_2, null));
              if (_notEquals_2) {
                _builder.append(" = true");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      boolean _notEquals_3 = (!Objects.equal(clientParams, null));
      if (_notEquals_3) {
        {
          EList<SimpleMemberAssignment> _params_3 = clientParams.getParams();
          for(final SimpleMemberAssignment param_1 : _params_3) {
            _builder.append("\t");
            _builder.append("private ");
            SimpleMember _member_5 = param_1.getMember();
            IntrinsicType _type_2 = _member_5.getType();
            String _signature_2 = ModelExtensions.signature(_type_2);
            _builder.append(_signature_2, "\t");
            _builder.append(" ");
            SimpleMember _member_6 = param_1.getMember();
            String _name_4 = _member_6.getName();
            String _camelize_3 = Strings.camelize(_name_4);
            _builder.append(_camelize_3, "\t");
            _builder.append("Param");
            {
              Literal _defaultValue_3 = param_1.getDefaultValue();
              boolean _notEquals_4 = (!Objects.equal(_defaultValue_3, null));
              if (_notEquals_4) {
                _builder.append(" = ");
                Literal _defaultValue_4 = param_1.getDefaultValue();
                String _convertToJavaLiteral_1 = ModelExtensions.convertToJavaLiteral(_defaultValue_4);
                _builder.append(_convertToJavaLiteral_1, "\t");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private boolean ");
            SimpleMember _member_7 = param_1.getMember();
            String _name_5 = _member_7.getName();
            String _camelize_4 = Strings.camelize(_name_5);
            _builder.append(_camelize_4, "\t");
            _builder.append("ParamSet");
            {
              Literal _defaultValue_5 = param_1.getDefaultValue();
              boolean _notEquals_5 = (!Objects.equal(_defaultValue_5, null));
              if (_notEquals_5) {
                _builder.append(" = true");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      boolean _hasBody_1 = ModelExtensions.hasBody(method);
      if (_hasBody_1) {
        _builder.append("\t");
        BodyBlock _body = ModelExtensions.getBody(method);
        BlockType _type_3 = _body.getType();
        CharSequence _generateFieldForType = this.generateFieldForType(_type_3);
        _builder.append(_generateFieldForType, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        BodyBlock _body_1 = ModelExtensions.getBody(method);
        BlockType _type_4 = _body_1.getType();
        CharSequence _generateGetterSetterForType = this.generateGetterSetterForType(_type_4);
        _builder.append(_generateGetterSetterForType, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_6 = (!Objects.equal(methodParams, null));
      if (_notEquals_6) {
        {
          EList<SimpleMemberAssignment> _params_4 = methodParams.getParams();
          for(final SimpleMemberAssignment param_2 : _params_4) {
            _builder.append("\t");
            _builder.append("public ");
            String _name_6 = method.getName();
            String _pascalize_1 = Strings.pascalize(_name_6);
            _builder.append(_pascalize_1, "\t");
            _builder.append("Request set");
            SimpleMember _member_8 = param_2.getMember();
            String _name_7 = _member_8.getName();
            String _pascalize_2 = Strings.pascalize(_name_7);
            _builder.append(_pascalize_2, "\t");
            _builder.append("Param(");
            SimpleMember _member_9 = param_2.getMember();
            IntrinsicType _type_5 = _member_9.getType();
            String _signature_3 = ModelExtensions.signature(_type_5);
            _builder.append(_signature_3, "\t");
            _builder.append(" value) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            SimpleMember _member_10 = param_2.getMember();
            String _name_8 = _member_10.getName();
            String _camelize_5 = Strings.camelize(_name_8);
            _builder.append(_camelize_5, "\t\t");
            _builder.append("Param = value;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            SimpleMember _member_11 = param_2.getMember();
            String _name_9 = _member_11.getName();
            String _camelize_6 = Strings.camelize(_name_9);
            _builder.append(_camelize_6, "\t\t");
            _builder.append("ParamSet = true;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return this;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public boolean is");
            SimpleMember _member_12 = param_2.getMember();
            String _name_10 = _member_12.getName();
            String _pascalize_3 = Strings.pascalize(_name_10);
            _builder.append(_pascalize_3, "\t");
            _builder.append("ParamSet() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            SimpleMember _member_13 = param_2.getMember();
            String _name_11 = _member_13.getName();
            String _camelize_7 = Strings.camelize(_name_11);
            _builder.append(_camelize_7, "\t\t");
            _builder.append("ParamSet;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      boolean _notEquals_7 = (!Objects.equal(clientParams, null));
      if (_notEquals_7) {
        {
          EList<SimpleMemberAssignment> _params_5 = clientParams.getParams();
          for(final SimpleMemberAssignment param_3 : _params_5) {
            _builder.append("\t");
            _builder.append("public ");
            String _name_12 = method.getName();
            String _pascalize_4 = Strings.pascalize(_name_12);
            _builder.append(_pascalize_4, "\t");
            _builder.append("Request set");
            SimpleMember _member_14 = param_3.getMember();
            String _name_13 = _member_14.getName();
            String _pascalize_5 = Strings.pascalize(_name_13);
            _builder.append(_pascalize_5, "\t");
            _builder.append("Param(");
            SimpleMember _member_15 = param_3.getMember();
            IntrinsicType _type_6 = _member_15.getType();
            String _signature_4 = ModelExtensions.signature(_type_6);
            _builder.append(_signature_4, "\t");
            _builder.append(" value) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            SimpleMember _member_16 = param_3.getMember();
            String _name_14 = _member_16.getName();
            String _camelize_8 = Strings.camelize(_name_14);
            _builder.append(_camelize_8, "\t\t");
            _builder.append("Param = value;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            SimpleMember _member_17 = param_3.getMember();
            String _name_15 = _member_17.getName();
            String _camelize_9 = Strings.camelize(_name_15);
            _builder.append(_camelize_9, "\t\t");
            _builder.append("ParamSet = true;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return this;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public boolean is");
            SimpleMember _member_18 = param_3.getMember();
            String _name_16 = _member_18.getName();
            String _pascalize_6 = Strings.pascalize(_name_16);
            _builder.append(_pascalize_6, "\t");
            _builder.append("ParamSet() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            SimpleMember _member_19 = param_3.getMember();
            String _name_17 = _member_19.getName();
            String _camelize_10 = Strings.camelize(_name_17);
            _builder.append(_camelize_10, "\t\t");
            _builder.append("ParamSet;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public ");
    String _name_18 = method.getName();
    String _pascalize_7 = Strings.pascalize(_name_18);
    _builder.append(_pascalize_7, "\t");
    _builder.append("Request(");
    Path _path_2 = method.getPath();
    BodyBlock _body_2 = ModelExtensions.getBody(method);
    String _generateRequestConstructorArgs = this.generateRequestConstructorArgs(_path_2, _body_2);
    _builder.append(_generateRequestConstructorArgs, "\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    HeaderBlock methodHeaders = ModelExtensions.getHeaderBlock(method);
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_8 = (!Objects.equal(methodHeaders, null));
      if (_notEquals_8) {
        {
          EList<Header> _headers = methodHeaders.getHeaders();
          for(final Header header : _headers) {
            _builder.append("\t\t");
            _builder.append("setHeader(\"");
            String _name_19 = header.getName();
            _builder.append(_name_19, "\t\t");
            _builder.append("\",\"");
            String _value = header.getValue();
            _builder.append(_value, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    {
      Path _path_3 = method.getPath();
      EList<SimpleMemberAssignment> _params_6 = null;
      if (_path_3!=null) {
        _params_6=_path_3.getParams();
      }
      int _size_1 = 0;
      if (_params_6!=null) {
        _size_1=_params_6.size();
      }
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        {
          Path _path_4 = method.getPath();
          EList<SimpleMemberAssignment> _params_7 = _path_4.getParams();
          for(final SimpleMemberAssignment slug_1 : _params_7) {
            _builder.append("\t\t");
            _builder.append("this.");
            SimpleMember _member_20 = slug_1.getMember();
            String _name_20 = _member_20.getName();
            String _camelize_11 = Strings.camelize(_name_20);
            _builder.append(_camelize_11, "\t\t");
            _builder.append("Segment = ");
            SimpleMember _member_21 = slug_1.getMember();
            String _name_21 = _member_21.getName();
            String _camelize_12 = Strings.camelize(_name_21);
            _builder.append(_camelize_12, "\t\t");
            _builder.append("Segment;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _hasBody_2 = ModelExtensions.hasBody(method);
      if (_hasBody_2) {
        _builder.append("\t\t");
        BodyBlock _body_3 = ModelExtensions.getBody(method);
        BlockType _type_7 = _body_3.getType();
        CharSequence _generateConstructorAssignmentForType = this.generateConstructorAssignmentForType(_type_7);
        _builder.append(_generateConstructorAssignmentForType, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _hasBody_3 = ModelExtensions.hasBody(method);
      if (_hasBody_3) {
        _builder.append("\t");
        this.imports.addImport("com.robotoworks.mechanoid.util.Closeables");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        this.imports.addImport("java.io.OutputStream");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        this.imports.addImport("java.io.IOException");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        BodyBlock _body_4 = ModelExtensions.getBody(method);
        BodyBlock _body_5 = ModelExtensions.getBody(method);
        BlockType _type_8 = _body_5.getType();
        CharSequence _generateSerializationStatementForType = this.generateSerializationStatementForType(method, _body_4, _type_8);
        _builder.append(_generateSerializationStatementForType, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String createUrl(String baseUrl){");
    _builder.newLine();
    {
      Path _path_5 = method.getPath();
      EList<SimpleMemberAssignment> _params_8 = null;
      if (_path_5!=null) {
        _params_8=_path_5.getParams();
      }
      int _size_2 = 0;
      if (_params_8!=null) {
        _size_2=_params_8.size();
      }
      boolean _greaterThan_2 = (_size_2 > 0);
      if (_greaterThan_2) {
        _builder.append("\t\t");
        _builder.append("Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, ");
        {
          Path _path_6 = method.getPath();
          EList<SimpleMemberAssignment> _params_9 = _path_6.getParams();
          boolean _hasElements = false;
          for(final SimpleMemberAssignment slug_2 : _params_9) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t\t");
            }
            SimpleMember _member_22 = slug_2.getMember();
            String _name_22 = _member_22.getName();
            String _camelize_13 = Strings.camelize(_name_22);
            _builder.append(_camelize_13, "\t\t");
            _builder.append("Segment");
          }
        }
        _builder.append(")).buildUpon();");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t");
        _builder.append("Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      boolean _notEquals_9 = (!Objects.equal(methodParams, null));
      if (_notEquals_9) {
        {
          EList<SimpleMemberAssignment> _params_10 = methodParams.getParams();
          for(final SimpleMemberAssignment param_4 : _params_10) {
            _builder.append("\t\t");
            _builder.append("if(");
            SimpleMember _member_23 = param_4.getMember();
            String _name_23 = _member_23.getName();
            String _camelize_14 = Strings.camelize(_name_23);
            _builder.append(_camelize_14, "\t\t");
            _builder.append("ParamSet){");
            _builder.newLineIfNotEmpty();
            {
              SimpleMember _member_24 = param_4.getMember();
              IntrinsicType _type_9 = _member_24.getType();
              if ((_type_9 instanceof StringType)) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("uriBuilder.appendQueryParameter(\"");
                SimpleMember _member_25 = param_4.getMember();
                String _name_24 = _member_25.getName();
                _builder.append(_name_24, "\t\t\t");
                _builder.append("\", ");
                SimpleMember _member_26 = param_4.getMember();
                String _name_25 = _member_26.getName();
                String _camelize_15 = Strings.camelize(_name_25);
                _builder.append(_camelize_15, "\t\t\t");
                _builder.append("Param);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("uriBuilder.appendQueryParameter(\"");
                SimpleMember _member_27 = param_4.getMember();
                String _name_26 = _member_27.getName();
                _builder.append(_name_26, "\t\t\t");
                _builder.append("\", String.valueOf(");
                SimpleMember _member_28 = param_4.getMember();
                String _name_27 = _member_28.getName();
                String _camelize_16 = Strings.camelize(_name_27);
                _builder.append(_camelize_16, "\t\t\t");
                _builder.append("Param));");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    {
      boolean _notEquals_10 = (!Objects.equal(clientParams, null));
      if (_notEquals_10) {
        {
          EList<SimpleMemberAssignment> _params_11 = clientParams.getParams();
          for(final SimpleMemberAssignment param_5 : _params_11) {
            _builder.append("\t\t");
            _builder.append("if(");
            SimpleMember _member_29 = param_5.getMember();
            String _name_28 = _member_29.getName();
            String _camelize_17 = Strings.camelize(_name_28);
            _builder.append(_camelize_17, "\t\t");
            _builder.append("ParamSet){");
            _builder.newLineIfNotEmpty();
            {
              SimpleMember _member_30 = param_5.getMember();
              IntrinsicType _type_10 = _member_30.getType();
              if ((_type_10 instanceof StringType)) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("uriBuilder.appendQueryParameter(\"");
                SimpleMember _member_31 = param_5.getMember();
                String _name_29 = _member_31.getName();
                _builder.append(_name_29, "\t\t\t");
                _builder.append("\", ");
                SimpleMember _member_32 = param_5.getMember();
                String _name_30 = _member_32.getName();
                String _camelize_18 = Strings.camelize(_name_30);
                _builder.append(_camelize_18, "\t\t\t");
                _builder.append("Param);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("uriBuilder.appendQueryParameter(\"");
                SimpleMember _member_33 = param_5.getMember();
                String _name_31 = _member_33.getName();
                _builder.append(_name_31, "\t\t\t");
                _builder.append("\", String.valueOf(");
                SimpleMember _member_34 = param_5.getMember();
                String _name_32 = _member_34.getName();
                String _camelize_19 = Strings.camelize(_name_32);
                _builder.append(_camelize_19, "\t\t\t");
                _builder.append("Param));");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("return uriBuilder.toString();\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSerializationStatementHeader(final boolean withReader) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (withReader) {
        this.imports.addImport("com.robotoworks.mechanoid.internal.util.JsonWriter");
        _builder.newLineIfNotEmpty();
        this.imports.addImport("java.io.OutputStreamWriter");
        _builder.newLineIfNotEmpty();
        this.imports.addImport("java.nio.charset.Charset");
        _builder.newLineIfNotEmpty();
        _builder.append("JsonWriter writer = null;");
        _builder.newLine();
      }
    }
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(stream != null) {");
    _builder.newLine();
    {
      if (withReader) {
        _builder.append("\t\t");
        _builder.append("writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSerializationStatementFooter(final boolean withReader) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} finally {");
    _builder.newLine();
    {
      if (withReader) {
        _builder.append("\t");
        _builder.append("Closeables.closeSilently(writer);");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("Closeables.closeSilently(stream);");
        _builder.newLine();
      }
    }
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
    _builder.append("private final ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" value;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _elementType = type.getElementType();
      if ((_elementType instanceof IntrinsicType)) {
        _builder.append("private final ");
        String _signature = ModelExtensions.signature(type);
        _builder.append(_signature, "");
        _builder.append(" values;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("private final ");
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
    _builder.append("private final ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" ");
    String _signature_1 = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature_1);
    _builder.append(_camelize, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final ");
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
  
  protected CharSequence _generateGetterSetterForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Member> _members = type.getMembers();
      for(final Member member : _members) {
        CharSequence _generateGetterSetterForMember = this.generateGetterSetterForMember(member);
        _builder.append(_generateGetterSetterForMember, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateGetterSetterForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" getValue() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return value;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterSetterForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _elementType = type.getElementType();
      if ((_elementType instanceof IntrinsicType)) {
        _builder.append("public ");
        String _signature = ModelExtensions.signature(type);
        _builder.append(_signature, "");
        _builder.append(" getValues() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return values;");
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
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        String _innerSignature_1 = ModelExtensions.innerSignature(type);
        String _camelize = Strings.camelize(_innerSignature_1);
        String _pluralize_1 = Strings.pluralize(_camelize);
        _builder.append(_pluralize_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateGetterSetterForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "");
    _builder.append(" get");
    String _signature_1 = ModelExtensions.signature(type);
    String _pascalize = Strings.pascalize(_signature_1);
    _builder.append(_pascalize, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _signature_2 = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature_2);
    _builder.append(_camelize, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterSetterForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    Type _type = member.getType();
    String _signature = ModelExtensions.signature(_type);
    _builder.append(_signature, "");
    _builder.append(" ");
    String _getMethodName = ModelExtensions.toGetMethodName(member);
    _builder.append(_getMethodName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _identifier = ModelExtensions.toIdentifier(member);
    _builder.append(_identifier, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterSetterForMember(final SkipMember member) {
    StringConcatenation _builder = new StringConcatenation();
    ComplexTypeLiteral _literal = member.getLiteral();
    Object _generateGetterSetterForType = this.generateGetterSetterForType(_literal);
    _builder.append(_generateGetterSetterForType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Member> _members = type.getMembers();
      for(final Member member : _members) {
        CharSequence _generateConstructorAssignmentForMember = this.generateConstructorAssignmentForMember(member);
        _builder.append(_generateConstructorAssignmentForMember, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.value = value;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _elementType = type.getElementType();
      if ((_elementType instanceof IntrinsicType)) {
        _builder.append("this.values = values;");
        _builder.newLine();
      } else {
        _builder.append("this.");
        String _innerSignature = ModelExtensions.innerSignature(type);
        String _camelize = Strings.camelize(_innerSignature);
        String _pluralize = Strings.pluralize(_camelize);
        _builder.append(_pluralize, "");
        _builder.append(" = ");
        String _innerSignature_1 = ModelExtensions.innerSignature(type);
        String _camelize_1 = Strings.camelize(_innerSignature_1);
        String _pluralize_1 = Strings.pluralize(_camelize_1);
        _builder.append(_pluralize_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _signature = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature);
    _builder.append(_camelize, "");
    _builder.append(" = ");
    String _signature_1 = ModelExtensions.signature(type);
    String _camelize_1 = Strings.camelize(_signature_1);
    _builder.append(_camelize_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _identifier = ModelExtensions.toIdentifier(member);
    _builder.append(_identifier, "");
    _builder.append(" = ");
    String _identifier_1 = ModelExtensions.toIdentifier(member);
    _builder.append(_identifier_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForMember(final SkipMember member) {
    StringConcatenation _builder = new StringConcatenation();
    ComplexTypeLiteral _literal = member.getLiteral();
    Object _generateConstructorAssignmentForType = this.generateConstructorAssignmentForType(_literal);
    _builder.append(_generateConstructorAssignmentForType, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final HttpMethod method, final BodyBlock body, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("java.io.PrintStream");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(false);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("PrintStream ps = new PrintStream(stream);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ps.print(value);");
    _builder.newLine();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(false);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final HttpMethod method, final BodyBlock body, final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(true);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "\t");
    _builder.append("Request subject = this;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _genWriteComplexTypeLiteral = this.jsonWriterGenerator.genWriteComplexTypeLiteral(type);
    _builder.append(_genWriteComplexTypeLiteral, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(true);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final HttpMethod method, final BodyBlock body, final UserType type) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    return this.generateSerializationStatementForUserType(body, type, _declaration);
  }
  
  protected CharSequence _generateSerializationStatementForUserType(final BodyBlock body, final UserType type, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(true);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("provider.get(");
    String _signature = ModelExtensions.signature(type);
    _builder.append(_signature, "\t");
    _builder.append(".class).write(writer, ");
    String _signature_1 = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature_1);
    _builder.append(_camelize, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(true);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForUserType(final BodyBlock body, final UserType type, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("java.io.PrintStream");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(false);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("PrintStream ps = new PrintStream(stream);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ps.print(");
    String _signature = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature);
    _builder.append(_camelize, "\t");
    _builder.append(".getValue());");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(false);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final HttpMethod method, final BodyBlock body, final GenericListType type) {
    Type _elementType = type.getElementType();
    return this.generateSerializationStatementForGenericListType(body, type, _elementType);
  }
  
  protected CharSequence _generateSerializationStatementForGenericListType(final BodyBlock body, final GenericListType type, final IntrinsicType elementType) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("com.robotoworks.mechanoid.internal.util.JsonUtil");
    _builder.newLineIfNotEmpty();
    this.imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(true);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JsonUtil.write");
    String _boxedTypeSignature = ModelExtensions.getBoxedTypeSignature(elementType);
    _builder.append(_boxedTypeSignature, "\t");
    _builder.append("List(writer, values);");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(true);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForGenericListType(final BodyBlock body, final GenericListType type, final UserType elementType) {
    UserTypeDeclaration _declaration = elementType.getDeclaration();
    return this.generateSerializationStatementForUserTypeGenericList(body, type, elementType, _declaration);
  }
  
  protected CharSequence _generateSerializationStatementForUserTypeGenericList(final BodyBlock body, final GenericListType type, final UserType elementType, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    this.imports.addImport("java.util.List");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(true);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("provider.get(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "\t");
    _builder.append(".class).writeList(writer, ");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    String _camelize = Strings.camelize(_innerSignature_1);
    String _pluralize = Strings.pluralize(_camelize);
    _builder.append(_pluralize, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(true);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForUserTypeGenericList(final BodyBlock body, final GenericListType type, final UserType elementType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSerializationStatementHeader = this.generateSerializationStatementHeader(true);
    _builder.append(_generateSerializationStatementHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("writer.beginArray();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(");
    String _innerSignature = ModelExtensions.innerSignature(type);
    _builder.append(_innerSignature, "\t");
    _builder.append(" element:");
    String _innerSignature_1 = ModelExtensions.innerSignature(type);
    String _camelize = Strings.camelize(_innerSignature_1);
    String _pluralize = Strings.pluralize(_camelize);
    _builder.append(_pluralize, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("writer.put(element.getValue());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("writer.endArray();");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateSerializationStatementFooter = this.generateSerializationStatementFooter(true);
    _builder.append(_generateSerializationStatementFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Converts a path (eg:- /qux/:fooparam/:quxparam/bar
   * into constructor arguments
   */
  public String generateRequestConstructorArgs(final Path path, final BodyBlock body) {
    ArrayList<String> args = new ArrayList<String>();
    EList<SimpleMemberAssignment> _params = null;
    if (path!=null) {
      _params=path.getParams();
    }
    int _size = 0;
    if (_params!=null) {
      _size=_params.size();
    }
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      EList<SimpleMemberAssignment> _params_1 = path.getParams();
      for (final SimpleMemberAssignment slug : _params_1) {
        SimpleMember _member = slug.getMember();
        IntrinsicType _type = _member.getType();
        String _signature = ModelExtensions.signature(_type);
        String _plus = (_signature + " ");
        SimpleMember _member_1 = slug.getMember();
        String _name = _member_1.getName();
        String _camelize = Strings.camelize(_name);
        String _plus_1 = (_plus + _camelize);
        String _plus_2 = (_plus_1 + "Segment");
        args.add(_plus_2);
      }
    }
    boolean _notEquals = (!Objects.equal(body, null));
    if (_notEquals) {
      BlockType _type_1 = body.getType();
      this.buildConstructorArgsForType(_type_1, args);
    }
    return IterableExtensions.join(args, ",\n");
  }
  
  protected void _buildConstructorArgsForType(final ComplexTypeLiteral type, final List<String> args) {
    EList<Member> _members = type.getMembers();
    for (final Member member : _members) {
      if ((member instanceof TypedMember)) {
        Type _type = ((TypedMember) member).getType();
        String _signature = ModelExtensions.signature(_type);
        String _plus = (_signature + " ");
        String _identifier = ModelExtensions.toIdentifier(member);
        String _plus_1 = (_plus + _identifier);
        args.add(_plus_1);
      } else {
        if ((member instanceof SkipMember)) {
          ComplexTypeLiteral _literal = ((SkipMember) member).getLiteral();
          this.buildConstructorArgsForType(_literal, args);
        }
      }
    }
  }
  
  protected void _buildConstructorArgsForType(final IntrinsicType type, final List<String> args) {
    String _signature = ModelExtensions.signature(type);
    String _plus = (_signature + " value");
    args.add(_plus);
  }
  
  protected void _buildConstructorArgsForType(final GenericListType type, final List<String> args) {
    Type _elementType = type.getElementType();
    if ((_elementType instanceof IntrinsicType)) {
      String _signature = ModelExtensions.signature(type);
      String _plus = (_signature + " values");
      args.add(_plus);
    } else {
      String _signature_1 = ModelExtensions.signature(type);
      String _plus_1 = (_signature_1 + " ");
      String _innerSignature = ModelExtensions.innerSignature(type);
      String _camelize = Strings.camelize(_innerSignature);
      String _pluralize = Strings.pluralize(_camelize);
      String _plus_2 = (_plus_1 + _pluralize);
      args.add(_plus_2);
    }
  }
  
  protected void _buildConstructorArgsForType(final UserType type, final List<String> args) {
    String _signature = ModelExtensions.signature(type);
    String _plus = (_signature + " ");
    String _signature_1 = ModelExtensions.signature(type);
    String _camelize = Strings.camelize(_signature_1);
    String _plus_1 = (_plus + _camelize);
    args.add(_plus_1);
  }
  
  public String pathToStringFormatArgs(final String path) {
    String[] _split = path.split("/|\\.");
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
      public Boolean apply(final String seg) {
        return Boolean.valueOf(seg.startsWith(":"));
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(_split)), _function);
    final Function1<String,String> _function_1 = new Function1<String,String>() {
      public String apply(final String arg) {
        String _substring = arg.substring(1);
        String _camelize = Strings.camelize(_substring);
        return (_camelize + "Segment");
      }
    };
    String _join = IterableExtensions.<String>join(_filter, ", ", _function_1);
    return (", " + _join);
  }
  
  public boolean hasArgs(final String path) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(path, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _contains = path.contains(":");
      _and = _contains;
    }
    return _and;
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
  
  public CharSequence generateGetterSetterForType(final BlockType type) {
    if (type instanceof GenericListType) {
      return _generateGetterSetterForType((GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateGetterSetterForType((IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateGetterSetterForType((UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateGetterSetterForType((ComplexTypeLiteral)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public CharSequence generateGetterSetterForMember(final Member member) {
    if (member instanceof SkipMember) {
      return _generateGetterSetterForMember((SkipMember)member);
    } else if (member instanceof TypedMember) {
      return _generateGetterSetterForMember((TypedMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateConstructorAssignmentForType(final BlockType type) {
    if (type instanceof GenericListType) {
      return _generateConstructorAssignmentForType((GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateConstructorAssignmentForType((IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateConstructorAssignmentForType((UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateConstructorAssignmentForType((ComplexTypeLiteral)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  public CharSequence generateConstructorAssignmentForMember(final Member member) {
    if (member instanceof SkipMember) {
      return _generateConstructorAssignmentForMember((SkipMember)member);
    } else if (member instanceof TypedMember) {
      return _generateConstructorAssignmentForMember((TypedMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateSerializationStatementForType(final HttpMethod method, final BodyBlock body, final BlockType type) {
    if (type instanceof GenericListType) {
      return _generateSerializationStatementForType(method, body, (GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateSerializationStatementForType(method, body, (IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateSerializationStatementForType(method, body, (UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateSerializationStatementForType(method, body, (ComplexTypeLiteral)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(method, body, type).toString());
    }
  }
  
  public CharSequence generateSerializationStatementForUserType(final BodyBlock body, final UserType type, final UserTypeDeclaration declaration) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateSerializationStatementForUserType(body, type, (ComplexTypeDeclaration)declaration);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateSerializationStatementForUserType(body, type, (EnumTypeDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body, type, declaration).toString());
    }
  }
  
  public CharSequence generateSerializationStatementForGenericListType(final BodyBlock body, final GenericListType type, final Type elementType) {
    if (elementType instanceof IntrinsicType) {
      return _generateSerializationStatementForGenericListType(body, type, (IntrinsicType)elementType);
    } else if (elementType instanceof UserType) {
      return _generateSerializationStatementForGenericListType(body, type, (UserType)elementType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body, type, elementType).toString());
    }
  }
  
  public CharSequence generateSerializationStatementForUserTypeGenericList(final BodyBlock body, final GenericListType type, final UserType elementType, final UserTypeDeclaration declaration) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateSerializationStatementForUserTypeGenericList(body, type, elementType, (ComplexTypeDeclaration)declaration);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateSerializationStatementForUserTypeGenericList(body, type, elementType, (EnumTypeDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body, type, elementType, declaration).toString());
    }
  }
  
  public void buildConstructorArgsForType(final BlockType type, final List<String> args) {
    if (type instanceof GenericListType) {
      _buildConstructorArgsForType((GenericListType)type, args);
      return;
    } else if (type instanceof IntrinsicType) {
      _buildConstructorArgsForType((IntrinsicType)type, args);
      return;
    } else if (type instanceof UserType) {
      _buildConstructorArgsForType((UserType)type, args);
      return;
    } else if (type instanceof ComplexTypeLiteral) {
      _buildConstructorArgsForType((ComplexTypeLiteral)type, args);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type, args).toString());
    }
  }
}
