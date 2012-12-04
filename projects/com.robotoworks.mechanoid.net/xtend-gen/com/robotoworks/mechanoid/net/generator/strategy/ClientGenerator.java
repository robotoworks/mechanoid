package com.robotoworks.mechanoid.net.generator.strategy;

import com.google.common.base.Objects;
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.Header;
import com.robotoworks.mechanoid.net.netModel.HeaderBlock;
import com.robotoworks.mechanoid.net.netModel.HttpDelete;
import com.robotoworks.mechanoid.net.netModel.HttpGet;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.HttpPost;
import com.robotoworks.mechanoid.net.netModel.HttpPut;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.SimpleMember;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    _builder.newLine();
    {
      ParamsBlock _params = client.getParams();
      boolean _notEquals_1 = (!Objects.equal(_params, null));
      if (_notEquals_1) {
        {
          ParamsBlock _params_1 = client.getParams();
          EList<SimpleMember> _params_2 = _params_1.getParams();
          for(final SimpleMember param : _params_2) {
            _builder.append("\t");
            _builder.append("private ");
            IntrinsicType _type = param.getType();
            String _signature = ModelExtensions.signature(_type);
            _builder.append(_signature, "	");
            _builder.append(" ");
            String _name_2 = param.getName();
            String _camelize = ModelExtensions.camelize(_name_2);
            _builder.append(_camelize, "	");
            _builder.append("Param;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private boolean ");
            String _name_3 = param.getName();
            String _camelize_1 = ModelExtensions.camelize(_name_3);
            _builder.append(_camelize_1, "	");
            _builder.append("ParamSet;");
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
      ParamsBlock _params_3 = client.getParams();
      boolean _notEquals_2 = (!Objects.equal(_params_3, null));
      if (_notEquals_2) {
        {
          ParamsBlock _params_4 = client.getParams();
          EList<SimpleMember> _params_5 = _params_4.getParams();
          for(final SimpleMember param_1 : _params_5) {
            _builder.append("\t");
            _builder.append("public void set");
            String _name_4 = param_1.getName();
            String _pascalize = ModelExtensions.pascalize(_name_4);
            _builder.append(_pascalize, "	");
            _builder.append("Param(");
            IntrinsicType _type_1 = param_1.getType();
            String _signature_1 = ModelExtensions.signature(_type_1);
            _builder.append(_signature_1, "	");
            _builder.append(" value) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _name_5 = param_1.getName();
            String _camelize_2 = ModelExtensions.camelize(_name_5);
            _builder.append(_camelize_2, "		");
            _builder.append("Param = value;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _name_6 = param_1.getName();
            String _camelize_3 = ModelExtensions.camelize(_name_6);
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
      boolean _notEquals_3 = (!Objects.equal(_baseUrl_2, null));
      if (_notEquals_3) {
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
    _builder.newLine();
    {
      HeaderBlock _headers = client.getHeaders();
      boolean _notEquals_4 = (!Objects.equal(_headers, null));
      if (_notEquals_4) {
        {
          HeaderBlock _headers_1 = client.getHeaders();
          EList<Header> _headers_2 = _headers_1.getHeaders();
          for(final Header header : _headers_2) {
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
      EList<HttpMethod> _methods = client.getMethods();
      for(final HttpMethod method : _methods) {
        {
          boolean _and = false;
          boolean _hasBody = ModelExtensions.hasBody(method);
          boolean _not = (!_hasBody);
          if (!_not) {
            _and = false;
          } else {
            Iterable<String> _argsFromPath = ModelExtensions.getArgsFromPath(method);
            int _size = IterableExtensions.size(_argsFromPath);
            boolean _equals = (_size == 0);
            _and = (_not && _equals);
          }
          if (_and) {
            _builder.append("public Response<");
            String _name = method.getName();
            String _pascalize = ModelExtensions.pascalize(_name);
            _builder.append(_pascalize, "");
            _builder.append("Result> ");
            String _name_1 = method.getName();
            String _camelize = ModelExtensions.camelize(_name_1);
            _builder.append(_camelize, "");
            _builder.append("()");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("throws ServiceException {");
            _builder.newLine();
            _builder.append("  \t");
            _builder.append("return ");
            String _name_2 = method.getName();
            String _camelize_1 = ModelExtensions.camelize(_name_2);
            _builder.append(_camelize_1, "  	");
            _builder.append("(new ");
            String _name_3 = method.getName();
            String _pascalize_1 = ModelExtensions.pascalize(_name_3);
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
        String _pascalize_2 = ModelExtensions.pascalize(_name_4);
        _builder.append(_pascalize_2, "");
        _builder.append("Result> ");
        String _name_5 = method.getName();
        String _camelize_2 = ModelExtensions.camelize(_name_5);
        _builder.append(_camelize_2, "");
        _builder.append("(");
        String _name_6 = method.getName();
        String _pascalize_3 = ModelExtensions.pascalize(_name_6);
        _builder.append(_pascalize_3, "");
        _builder.append("Request request)");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("throws ServiceException {");
        _builder.newLine();
        {
          ParamsBlock _params = client.getParams();
          boolean _notEquals = (!Objects.equal(_params, null));
          if (_notEquals) {
            {
              ParamsBlock _params_1 = client.getParams();
              EList<SimpleMember> _params_2 = _params_1.getParams();
              for(final SimpleMember param : _params_2) {
                _builder.append("\t");
                _builder.append("if(this.");
                String _name_7 = param.getName();
                String _camelize_3 = ModelExtensions.camelize(_name_7);
                _builder.append(_camelize_3, "	");
                _builder.append("ParamSet && !request.is");
                String _name_8 = param.getName();
                String _pascalize_4 = ModelExtensions.pascalize(_name_8);
                _builder.append(_pascalize_4, "	");
                _builder.append("ParamSet()){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("request.set");
                String _name_9 = param.getName();
                String _pascalize_5 = ModelExtensions.pascalize(_name_9);
                _builder.append(_pascalize_5, "		");
                _builder.append("Param(this.");
                String _name_10 = param.getName();
                String _camelize_4 = ModelExtensions.camelize(_name_10);
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
        String _pascalize_6 = ModelExtensions.pascalize(_name_11);
        _builder.append(_pascalize_6, "	");
        _builder.append("Result> parser = new Parser<");
        String _name_12 = method.getName();
        String _pascalize_7 = ModelExtensions.pascalize(_name_12);
        _builder.append(_pascalize_7, "	");
        _builder.append("Result>() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public ");
        String _name_13 = method.getName();
        String _pascalize_8 = ModelExtensions.pascalize(_name_13);
        _builder.append(_pascalize_8, "		");
        _builder.append("Result parse(InputStream inStream) throws TransformException {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("return new ");
        String _name_14 = method.getName();
        String _pascalize_9 = ModelExtensions.pascalize(_name_14);
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
  
  protected CharSequence _generateServiceMethod(final HttpGet method) {
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
    String _pascalize = ModelExtensions.pascalize(_name);
    _builder.append(_pascalize, "	");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = ModelExtensions.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, \"Response \" + response.getResponseCode());");
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
  
  protected CharSequence _generateServiceMethod(final HttpPut method) {
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
    _builder.append("conn.connect();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      BodyBlock _body = method.getBody();
      boolean _notEquals = (!Objects.equal(_body, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("request.writeBody(transformerProvider, conn.getOutputStream());");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Response<");
    String _name = method.getName();
    String _pascalize = ModelExtensions.pascalize(_name);
    _builder.append(_pascalize, "	");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = ModelExtensions.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, \"Response \" + response.getResponseCode());");
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
  
  protected CharSequence _generateServiceMethod(final HttpPost method) {
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
    _builder.append("\t");
    _builder.newLine();
    {
      BodyBlock _body = method.getBody();
      boolean _notEquals = (!Objects.equal(_body, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("request.writeBody(transformerProvider, conn.getOutputStream());");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Response<");
    String _name = method.getName();
    String _pascalize = ModelExtensions.pascalize(_name);
    _builder.append(_pascalize, "	");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = ModelExtensions.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(LOG_TAG, \"Response \" + response.getResponseCode());");
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
  
  protected CharSequence _generateServiceMethod(final HttpDelete method) {
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
    String _pascalize = ModelExtensions.pascalize(_name);
    _builder.append(_pascalize, "		");
    _builder.append("Result> response = new Response<");
    String _name_1 = method.getName();
    String _pascalize_1 = ModelExtensions.pascalize(_name_1);
    _builder.append(_pascalize_1, "		");
    _builder.append("Result>(conn, parser);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(debug) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Log.d(LOG_TAG, \"Response \" + response.getResponseCode());");
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
  
  public CharSequence generateServiceMethod(final HttpMethod method) {
    if (method instanceof HttpDelete) {
      return _generateServiceMethod((HttpDelete)method);
    } else if (method instanceof HttpGet) {
      return _generateServiceMethod((HttpGet)method);
    } else if (method instanceof HttpPost) {
      return _generateServiceMethod((HttpPost)method);
    } else if (method instanceof HttpPut) {
      return _generateServiceMethod((HttpPut)method);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(method).toString());
    }
  }
}
