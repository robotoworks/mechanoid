package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.Model;
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
    _builder.append("import com.robotoworks.mechanoid.net.TransformerProvider;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.HttpRequestHelper;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.WebResponse;");
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
    _builder.append("\t");
    _builder.append("private static final String DEFAULT_BASE_URL = \"");
    String _baseUrl = client.getBaseUrl();
    _builder.append(_baseUrl, "	");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected final HttpRequestHelper requestHelper;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final TransformerProvider transformerProvider;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String baseUrl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = client.getName();
    _builder.append(_name_1, "	");
    _builder.append("(HttpRequestHelper requestHelper){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(requestHelper, new TransformerProvider(), DEFAULT_BASE_URL);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = client.getName();
    _builder.append(_name_2, "	");
    _builder.append("(HttpRequestHelper requestHelper, TransformerProvider transformerProvider){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(requestHelper, transformerProvider, DEFAULT_BASE_URL);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_3 = client.getName();
    _builder.append(_name_3, "	");
    _builder.append("(HttpRequestHelper requestHelper, TransformerProvider transformerProvider, String baseUrl){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.requestHelper = requestHelper;");
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
        _builder.append("public WebResponse<");
        String _name = method.getName();
        String _pascalize = ModelExtensions.pascalize(_name);
        _builder.append(_pascalize, "");
        _builder.append("Response> ");
        String _name_1 = method.getName();
        String _camelize = ModelExtensions.camelize(_name_1);
        _builder.append(_camelize, "");
        _builder.append("(");
        String _name_2 = method.getName();
        String _pascalize_1 = ModelExtensions.pascalize(_name_2);
        _builder.append(_pascalize_1, "");
        _builder.append("Request request)");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("throws ClientProtocolException, IOException {\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return request.execute(baseUrl, requestHelper, transformerProvider);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
