package com.robotoworks.mechanoid.net.generator.strategy;

import com.google.common.base.Objects;
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.SimpleMember;
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
    _builder.append("import com.robotoworks.mechanoid.net.TransformerProvider;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.ServiceClient;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.Response;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.DefaultServiceClient;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import org.apache.http.client.ClientProtocolException;");
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
    _builder.append("protected final ServiceClient client;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final TransformerProvider transformerProvider;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String baseUrl;");
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
            String _name_1 = param.getName();
            String _camelize = ModelExtensions.camelize(_name_1);
            _builder.append(_camelize, "	");
            _builder.append("Param;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private boolean ");
            String _name_2 = param.getName();
            String _camelize_1 = ModelExtensions.camelize(_name_2);
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
            String _name_3 = param_1.getName();
            String _pascalize = ModelExtensions.pascalize(_name_3);
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
            String _name_4 = param_1.getName();
            String _camelize_2 = ModelExtensions.camelize(_name_4);
            _builder.append(_camelize_2, "		");
            _builder.append("Param = value;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _name_5 = param_1.getName();
            String _camelize_3 = ModelExtensions.camelize(_name_5);
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
        String _name_6 = client.getName();
        _builder.append(_name_6, "	");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this(new DefaultServiceClient(), new TransformerProvider(), DEFAULT_BASE_URL);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_7 = client.getName();
        _builder.append(_name_7, "	");
        _builder.append("(ServiceClient client){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this(client, new TransformerProvider(), DEFAULT_BASE_URL);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_8 = client.getName();
        _builder.append(_name_8, "	");
        _builder.append("(ServiceClient client, TransformerProvider transformerProvider){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this(client, transformerProvider, DEFAULT_BASE_URL);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public ");
    String _name_9 = client.getName();
    _builder.append(_name_9, "	");
    _builder.append("(String baseUrl){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(new DefaultServiceClient(), new TransformerProvider(), baseUrl);");
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
    _builder.append("(ServiceClient client, String baseUrl){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(client, new TransformerProvider(), baseUrl);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_11 = client.getName();
    _builder.append(_name_11, "	");
    _builder.append("(ServiceClient client, TransformerProvider transformerProvider, String baseUrl){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.client = client;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.baseUrl = baseUrl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.transformerProvider = transformerProvider;");
    _builder.newLine();
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
            _builder.append("Response> ");
            String _name_1 = method.getName();
            String _camelize = ModelExtensions.camelize(_name_1);
            _builder.append(_camelize, "");
            _builder.append("()");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("throws ClientProtocolException, IOException");
            {
              boolean _hasBody_1 = ModelExtensions.hasBody(method);
              if (_hasBody_1) {
                _builder.append(", TransformException");
              }
            }
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
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
        _builder.append("Response> ");
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
        _builder.append("throws ClientProtocolException, IOException");
        {
          boolean _hasBody_2 = ModelExtensions.hasBody(method);
          if (_hasBody_2) {
            _builder.append(", TransformException");
          }
        }
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("  \t");
        boolean _hasBody_3 = ModelExtensions.hasBody(method);
        if (_hasBody_3) {
          this.context.registerImport("com.robotoworks.mechanoid.net.TransformException");
        }
        _builder.newLineIfNotEmpty();
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
        _builder.append("return request.execute(baseUrl, client, transformerProvider);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
