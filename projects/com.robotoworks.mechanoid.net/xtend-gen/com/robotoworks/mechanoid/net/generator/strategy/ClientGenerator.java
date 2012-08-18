package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.Model;
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
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateClientClass(client, module)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4registerImports\u00AA");
    _builder.newLine();
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
    _builder.append("\u00B4context.printImports\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.clearImports\u00AA");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4body\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateClientClass(final Client client, final Model module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class \u00B4client.name\u00AA {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String DEFAULT_BASE_URL = \"\u00B4client.baseUrl\u00AA\";");
    _builder.newLine();
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
    _builder.append("public \u00B4client.name\u00AA(HttpRequestHelper requestHelper){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this(requestHelper, new TransformerProvider(), DEFAULT_BASE_URL);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4client.name\u00AA(HttpRequestHelper requestHelper, TransformerProvider transformerProvider){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this(requestHelper, transformerProvider, DEFAULT_BASE_URL);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4client.name\u00AA(HttpRequestHelper requestHelper, TransformerProvider transformerProvider, String baseUrl){");
    _builder.newLine();
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
    _builder.append("\u00B4generateClientMethods(client, module)\u00AA");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateClientMethods(final Client client, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4FOR method:client.methods\u00AA");
    _builder.newLine();
    _builder.append("public WebResponse<\u00B4method.name.pascalize\u00AAResponse> \u00B4method.name.camelize\u00AA(\u00B4method.name.pascalize\u00AARequest request)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("throws ClientProtocolException, IOException {\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return request.execute(baseUrl, requestHelper, transformerProvider);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    return _builder;
  }
}
