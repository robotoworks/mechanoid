package com.robotoworks.mechanoid.net.generator.strategy;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ClientBlock;
import com.robotoworks.mechanoid.net.netModel.Header;
import com.robotoworks.mechanoid.net.netModel.HeaderBlock;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.HttpMethodType;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Literal;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.Path;
import com.robotoworks.mechanoid.net.netModel.SimpleMember;
import com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment;
import com.robotoworks.mechanoid.text.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ClientGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  public CharSequence registerImports() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final Client client, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = module.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence body = this.generateClientClass(client, module);
    _builder.newLineIfNotEmpty();
    CharSequence _registerImports = this.registerImports();
    _builder.append(_registerImports, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import android.util.Log;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.Parser;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformerProvider;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.Response;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.ServiceException;");
    _builder.newLine();
    _builder.append("import java.io.InputStream;");
    _builder.newLine();
    _builder.append("import java.net.HttpURLConnection;");
    _builder.newLine();
    _builder.append("import java.net.URL;");
    _builder.newLine();
    _builder.append("import java.util.LinkedHashMap;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.NetLogHelper;");
    _builder.newLine();
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
  
  public CharSequence generateClientClass(final Client client, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = client.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private static final String LOG_TAG = \"");
    String _name_1 = client.getName();
    _builder.append(_name_1, "	");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      String _baseUrl = client.getBaseUrl();
      boolean _notEquals = (!Objects.equal(_baseUrl, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("private static final String DEFAULT_BASE_URL = \"");
        String _baseUrl_1 = client.getBaseUrl();
        _builder.append(_baseUrl_1, "	");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("private final TransformerProvider transformerProvider;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String baseUrl;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final boolean debug;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setHeader(String field, String value) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("headers.put(field, value);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    ParamsBlock params = ModelExtensions.getParamsBlock(client);
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_1 = (!Objects.equal(params, null));
      if (_notEquals_1) {
        {
          EList<SimpleMemberAssignment> _params = params.getParams();
          for(final SimpleMemberAssignment param : _params) {
            _builder.append("\t");
            _builder.append("private ");
            SimpleMember _member = param.getMember();
            IntrinsicType _type = _member.getType();
            String _signature = ModelExtensions.signature(_type);
            _builder.append(_signature, "	");
            _builder.append(" ");
            SimpleMember _member_1 = param.getMember();
            String _name_2 = _member_1.getName();
            String _camelize = Strings.camelize(_name_2);
            _builder.append(_camelize, "	");
            _builder.append("Param");
            {
              Literal _defaultValue = param.getDefaultValue();
              boolean _notEquals_2 = (!Objects.equal(_defaultValue, null));
              if (_notEquals_2) {
                _builder.append(" = ");
                Literal _defaultValue_1 = param.getDefaultValue();
                String _convertToJavaLiteral = ModelExtensions.convertToJavaLiteral(_defaultValue_1);
                _builder.append(_convertToJavaLiteral, "	");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private boolean ");
            SimpleMember _member_2 = param.getMember();
            String _name_3 = _member_2.getName();
            String _camelize_1 = Strings.camelize(_name_3);
            _builder.append(_camelize_1, "	");
            _builder.append("ParamSet");
            {
              Literal _defaultValue_2 = param.getDefaultValue();
              boolean _notEquals_3 = (!Objects.equal(_defaultValue_2, null));
              if (_notEquals_3) {
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
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _notEquals_4 = (!Objects.equal(params, null));
      if (_notEquals_4) {
        {
          EList<SimpleMemberAssignment> _params_1 = params.getParams();
          for(final SimpleMemberAssignment param_1 : _params_1) {
            _builder.append("\t");
            _builder.append("public void set");
            SimpleMember _member_3 = param_1.getMember();
            String _name_4 = _member_3.getName();
            String _pascalize = Strings.pascalize(_name_4);
            _builder.append(_pascalize, "	");
            _builder.append("Param(");
            SimpleMember _member_4 = param_1.getMember();
            IntrinsicType _type_1 = _member_4.getType();
            String _signature_1 = ModelExtensions.signature(_type_1);
            _builder.append(_signature_1, "	");
            _builder.append(" value) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            SimpleMember _member_5 = param_1.getMember();
            String _name_5 = _member_5.getName();
            String _camelize_2 = Strings.camelize(_name_5);
            _builder.append(_camelize_2, "		");
            _builder.append("Param = value;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            SimpleMember _member_6 = param_1.getMember();
            String _name_6 = _member_6.getName();
            String _camelize_3 = Strings.camelize(_name_6);
            _builder.append(_camelize_3, "		");
            _builder.append("ParamSet = true;");
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
      String _baseUrl_2 = client.getBaseUrl();
      boolean _notEquals_5 = (!Objects.equal(_baseUrl_2, null));
      if (_notEquals_5) {
        _builder.append("\t");
        _builder.append("public ");
        String _name_7 = client.getName();
        _builder.append(_name_7, "	");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this(DEFAULT_BASE_URL, new TransformerProvider(), false);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_8 = client.getName();
        _builder.append(_name_8, "	");
        _builder.append("(TransformerProvider transformerProvider){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this(DEFAULT_BASE_URL, transformerProvider, false);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_9 = client.getName();
    _builder.append(_name_9, "	");
    _builder.append("(String baseUrl){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(baseUrl, new TransformerProvider(), false);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_10 = client.getName();
    _builder.append(_name_10, "	");
    _builder.append("(boolean debug){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(DEFAULT_BASE_URL, new TransformerProvider(), debug);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_11 = client.getName();
    _builder.append(_name_11, "	");
    _builder.append("(String baseUrl, boolean debug){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(baseUrl, new TransformerProvider(), debug);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_12 = client.getName();
    _builder.append(_name_12, "	");
    _builder.append("(String baseUrl, TransformerProvider transformerProvider, boolean debug){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.baseUrl = baseUrl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.transformerProvider = transformerProvider;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.debug = debug;");
    _builder.newLine();
    _builder.append("\t\t");
    HeaderBlock headers = ModelExtensions.getHeaderBlock(client);
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_6 = (!Objects.equal(headers, null));
      if (_notEquals_6) {
        {
          EList<Header> _headers = headers.getHeaders();
          for(final Header header : _headers) {
            _builder.append("\t\t");
            _builder.append("headers.put(\"");
            String _name_13 = header.getName();
            _builder.append(_name_13, "		");
            _builder.append("\",\"");
            String _value = header.getValue();
            _builder.append(_value, "		");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateClientMethods = this.generateClientMethods(client, module);
    _builder.append(_generateClientMethods, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateClientMethods(final Client client, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ClientBlock> _blocks = client.getBlocks();
      Iterable<HttpMethod> _filter = Iterables.<HttpMethod>filter(_blocks, HttpMethod.class);
      for(final HttpMethod method : _filter) {
        {
          boolean _and = false;
          boolean _hasBody = ModelExtensions.hasBody(method);
          boolean _not = (!_hasBody);
          if (!_not) {
            _and = false;
          } else {
            boolean _or = false;
            Path _path = method.getPath();
            boolean _equals = Objects.equal(_path, null);
            if (_equals) {
              _or = true;
            } else {
              Path _path_1 = method.getPath();
              EList<SimpleMemberAssignment> _params = _path_1.getParams();
              int _size = _params.size();
              boolean _equals_1 = (_size == 0);
              _or = (_equals || _equals_1);
            }
            _and = (_not && _or);
          }
          if (_and) {
            _builder.append("public Response<");
            String _name = method.getName();
            String _pascalize = Strings.pascalize(_name);
            _builder.append(_pascalize, "");
            _builder.append("Result> ");
            String _name_1 = method.getName();
            String _camelize = Strings.camelize(_name_1);
            _builder.append(_camelize, "");
            _builder.append("()");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("throws ServiceException {");
            _builder.newLine();
            _builder.append("  \t");
            _builder.append("return ");
            String _name_2 = method.getName();
            String _camelize_1 = Strings.camelize(_name_2);
            _builder.append(_camelize_1, "  	");
            _builder.append("(new ");
            String _name_3 = method.getName();
            String _pascalize_1 = Strings.pascalize(_name_3);
            _builder.append(_pascalize_1, "  	");
            _builder.append("Request());");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          }
        }
        _builder.append("public Response<");
        String _name_4 = method.getName();
        String _pascalize_2 = Strings.pascalize(_name_4);
        _builder.append(_pascalize_2, "");
        _builder.append("Result> ");
        String _name_5 = method.getName();
        String _camelize_2 = Strings.camelize(_name_5);
        _builder.append(_camelize_2, "");
        _builder.append("(");
        String _name_6 = method.getName();
        String _pascalize_3 = Strings.pascalize(_name_6);
        _builder.append(_pascalize_3, "");
        _builder.append("Request request)");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("throws ServiceException {");
        _builder.newLine();
        _builder.append("  \t");
        ParamsBlock params = ModelExtensions.getParamsBlock(client);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals = (!Objects.equal(params, null));
          if (_notEquals) {
            {
              EList<SimpleMemberAssignment> _params_1 = params.getParams();
              for(final SimpleMemberAssignment param : _params_1) {
                _builder.append("\t");
                _builder.append("if(this.");
                SimpleMember _member = param.getMember();
                String _name_7 = _member.getName();
                String _camelize_3 = Strings.camelize(_name_7);
                _builder.append(_camelize_3, "	");
                _builder.append("ParamSet && !request.is");
                SimpleMember _member_1 = param.getMember();
                String _name_8 = _member_1.getName();
                String _pascalize_4 = Strings.pascalize(_name_8);
                _builder.append(_pascalize_4, "	");
                _builder.append("ParamSet()){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("request.set");
                SimpleMember _member_2 = param.getMember();
                String _name_9 = _member_2.getName();
                String _pascalize_5 = Strings.pascalize(_name_9);
                _builder.append(_pascalize_5, "		");
                _builder.append("Param(this.");
                SimpleMember _member_3 = param.getMember();
                String _name_10 = _member_3.getName();
                String _camelize_4 = Strings.camelize(_name_10);
                _builder.append(_camelize_4, "		");
                _builder.append("Param);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("Parser<");
        String _name_11 = method.getName();
        String _pascalize_6 = Strings.pascalize(_name_11);
        _builder.append(_pascalize_6, "	");
        _builder.append("Result> parser = new Parser<");
        String _name_12 = method.getName();
        String _pascalize_7 = Strings.pascalize(_name_12);
        _builder.append(_pascalize_7, "	");
        _builder.append("Result>() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public ");
        String _name_13 = method.getName();
        String _pascalize_8 = Strings.pascalize(_name_13);
        _builder.append(_pascalize_8, "		");
        _builder.append("Result parse(InputStream inStream) throws TransformException {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("return new ");
        String _name_14 = method.getName();
        String _pascalize_9 = Strings.pascalize(_name_14);
        _builder.append(_pascalize_9, "			");
        _builder.append("Result(transformerProvider, inStream);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _generateServiceMethod = this.generateServiceMethod(method);
        _builder.append(_generateServiceMethod, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateServiceMethod(final HttpMethod method) {
    CharSequence _switchResult = null;
    HttpMethodType _type = method.getType();
    final HttpMethodType _switchValue = _type;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,HttpMethodType.GET)) {
        _matched=true;
        CharSequence _generateServiceGetMethod = this.generateServiceGetMethod(method);
        _switchResult = _generateServiceGetMethod;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,HttpMethodType.PUT)) {
        _matched=true;
        CharSequence _generateServicePutMethod = this.generateServicePutMethod(method);
        _switchResult = _generateServicePutMethod;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,HttpMethodType.POST)) {
        _matched=true;
        CharSequence _generateServicePostMethod = this.generateServicePostMethod(method);
        _switchResult = _generateServicePostMethod;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,HttpMethodType.DELETE)) {
        _matched=true;
        CharSequence _generateServiceDeleteMethod = this.generateServiceDeleteMethod(method);
        _switchResult = _generateServiceDeleteMethod;
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateServiceGetMethod(final HttpMethod method) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("URL url = new URL(request.createUrl(baseUrl));");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, \"GET \" + url.toString());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HttpURLConnection conn = (HttpURLConnection) url.openConnection();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestMethod(\"GET\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestProperty(\"Accept\", \"application/json, text/json\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _printSetHeadersStatements = this.printSetHeadersStatements();
    _builder.append(_printSetHeadersStatements, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.connect();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Response<");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "	");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, response.getHeaders());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, response.readAsText());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return response;");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.append("catch(Exception e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw new ServiceException(e);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printSetHeadersStatements() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(String key : headers.keySet()) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestProperty(key, headers.get(key));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("for(String key : request.getHeaderKeys()) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestProperty(key, request.getHeaderValue(key));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateServicePutMethod(final HttpMethod method) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("URL url = new URL(request.createUrl(baseUrl));");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, \"PUT \" + url.toString());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HttpURLConnection conn = (HttpURLConnection) url.openConnection();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setDoOutput(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestMethod(\"PUT\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestProperty(\"Content-Type\", \"application/json, text/json\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _printSetHeadersStatements = this.printSetHeadersStatements();
    _builder.append(_printSetHeadersStatements, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.connect()");
    _builder.newLine();
    {
      BodyBlock _body = ModelExtensions.getBody(method);
      boolean _notEquals = (!Objects.equal(_body, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        this.context.registerImport("java.io.ByteArrayOutputStream");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if(debug) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("request.writeBody(transformerProvider, debugOutStream);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), \"UTF-8\"));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("request.writeBody(transformerProvider, conn.getOutputStream());");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("Response<");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "	");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, response.getHeaders());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, response.readAsText());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return response;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.append("catch(Exception e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw new ServiceException(e);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateServicePostMethod(final HttpMethod method) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("URL url = new URL(request.createUrl(baseUrl));");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, \"POST \" + url.toString());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HttpURLConnection conn = (HttpURLConnection) url.openConnection();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setDoOutput(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestMethod(\"POST\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.setRequestProperty(\"Content-Type\", \"application/json, text/json\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _printSetHeadersStatements = this.printSetHeadersStatements();
    _builder.append(_printSetHeadersStatements, "	");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("conn.connect();");
    _builder.newLine();
    {
      BodyBlock _body = ModelExtensions.getBody(method);
      boolean _notEquals = (!Objects.equal(_body, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        this.context.registerImport("java.io.ByteArrayOutputStream");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if(debug) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("ByteArrayOutputStream debugOutStream = new ByteArrayOutputStream();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("request.writeBody(transformerProvider, debugOutStream);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("Log.d(LOG_TAG, new String(debugOutStream.toByteArray(), \"UTF-8\"));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("request.writeBody(transformerProvider, conn.getOutputStream());");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("Response<");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "	");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, response.getHeaders());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, response.readAsText());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return response;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.append("catch(Exception e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw new ServiceException(e);");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateServiceDeleteMethod(final HttpMethod method) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("URL url = new URL(request.createUrl(baseUrl));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Log.d(LOG_TAG, \"DELETE \" + url.toString());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HttpURLConnection conn = (HttpURLConnection) url.openConnection();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("conn.setRequestMethod(\"DELETE\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _printSetHeadersStatements = this.printSetHeadersStatements();
    _builder.append(_printSetHeadersStatements, "		");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, conn.getRequestProperties());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("conn.connect();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Response<");
    String _name = method.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "		");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "		");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("NetLogHelper.logProperties(LOG_TAG, response.getHeaders());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Log.d(LOG_TAG, response.readAsText());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return response;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("catch(Exception e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new ServiceException(e);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
