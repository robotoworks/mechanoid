package com.robotoworks.mechanoid.net.generator.strategy;

import com.google.common.base.Objects;
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.generator.strategy.MemberSerializationStatementGenerator;
import com.robotoworks.mechanoid.net.netModel.ArrayType;
import com.robotoworks.mechanoid.net.netModel.BlockType;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.WrapWithMember;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RequestGenerator {
  private CodeGenerationContext context;
  
  public CodeGenerationContext setContext(final CodeGenerationContext context) {
    CodeGenerationContext _context = this.context = context;
    return _context;
  }
  
  private MemberSerializationStatementGenerator serializationStatementGenerator;
  
  public MemberSerializationStatementGenerator setMemberSerializationStatementGenerator(final MemberSerializationStatementGenerator serializationStatementGenerator) {
    MemberSerializationStatementGenerator _serializationStatementGenerator = this.serializationStatementGenerator = serializationStatementGenerator;
    return _serializationStatementGenerator;
  }
  
  public MemberSerializationStatementGenerator getMemberSerializationStatementGenerator() {
    return this.serializationStatementGenerator;
  }
  
  public CharSequence registerImports() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateRequestClass(method, module, client)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4registerImports\u00AA");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformerProvider;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.TransformException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.HttpRequestHelper;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.WebResponse;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.net.WebResponseParser;");
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
  
  public CharSequence generateRequestClass(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class \u00B4method.name.pascalize\u00AARequest {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String PATH=\"\u00B4method.pathAsFormatString\u00AA\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4var pathArgs = method.getArgsFromPath\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(pathArgs.size > 0)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4FOR segment:pathArgs\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private final String \u00B4segment.substring(1).camelize.escapeReserved\u00AA;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(method.params != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4context.registerImport(\"android.net.Uri\")\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4FOR param:method.params.params\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private \u00B4param.type.signature\u00AA \u00B4param.name.camelize\u00AAParam;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(method.hasBody)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4generateFieldForType(method.body.type)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(method.params != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4FOR param:method.params.params\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void set\u00B4param.name.pascalize\u00AAParam(\u00B4param.type.signature\u00AA value) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.\u00B4param.name.camelize\u00AAParam = value;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4method.name.pascalize\u00AARequest(\u00B4generateRequestConstructorArgs(method.path, method.body)\u00AA){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4IF(pathArgs.size > 0)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4FOR segment:pathArgs\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.\u00B4segment.substring(1).camelize.escapeReserved\u00AA = \u00B4segment.substring(1).camelize.escapeReserved\u00AA;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ENDFOR\u00AA\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4IF(method.hasBody)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4generateConstructorAssignmentForType(method.body.type)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF(method.hasBody)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String createBody(TransformerProvider transformerProvider) throws TransformException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4generateSerializationStatementForType(method.body, method.body.type)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch(Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new TransformException(e);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String createUrl(String baseUrl){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4IF(method.params != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4IF(method.path.hasArgs)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Uri.Builder uriBuilder = Uri.parse(String.format(baseUrl + PATH\u00B4method.path.pathToStringFormatArgs\u00AA)).buildUpon();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ENDIF\u00AA\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4FOR param:method.params.params\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if(\u00B4param.name.camelize\u00AAParam != null){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("uriBuilder.appendQueryParameter(\"\u00B4param.name\u00AA\", \u00B4param.name.camelize\u00AAParam.toString());");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return uriBuilder.toString();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4IF(method.path.hasArgs)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return String.format(baseUrl + PATH\u00B4method.path.pathToStringFormatArgs\u00AA);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return baseUrl + PATH;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ENDIF\u00AA\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected WebResponse<\u00B4method.name.pascalize\u00AAResponse> execute(String baseUrl, HttpRequestHelper requestHelper, TransformerProvider transformerProvider)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throws ClientProtocolException, IOException {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String url = createUrl(baseUrl);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final TransformerProvider tp = transformerProvider;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("WebResponseParser<\u00B4method.name.pascalize\u00AAResponse> responseParser = new WebResponseParser<\u00B4method.name.pascalize\u00AAResponse>() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public \u00B4method.name.pascalize\u00AAResponse parse(WebResponse<\u00B4method.name.pascalize\u00AAResponse> response) throws TransformException {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return new \u00B4method.name.pascalize\u00AAResponse(tp, response);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4IF (method instanceof HttpPut)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String body = \u00B4IF(method.hasBody)\u00AAcreateBody(transformerProvider)\u00B4ELSE\u00AAnull\u00B4ENDIF\u00AA;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return requestHelper.putJson(url, body, responseParser);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ELSEIF (method instanceof HttpPost)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String body = \u00B4IF(method.hasBody)\u00AAcreateBody(transformerProvider)\u00B4ELSE\u00AAnull\u00B4ENDIF\u00AA;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return requestHelper.postJson(url, body, responseParser);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ELSEIF (method instanceof HttpGet)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return requestHelper.getJson(url, responseParser);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ELSEIF (method instanceof HttpDelete)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return requestHelper.deleteJson(url, responseParser);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4FOR member:type.members\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateFieldForMember(member)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final \u00B4type.signature\u00AA value;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final ArrayType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.elementType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final \u00B4type.signature\u00AA values;");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final \u00B4type.signature\u00AA \u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.genericType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final \u00B4type.signature\u00AA values;");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final \u00B4type.signature\u00AA \u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final \u00B4type.signature\u00AA \u00B4type.signature.camelize\u00AA;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final \u00B4member.type.signature\u00AA \u00B4member.toIdentifier\u00AA;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final WrapWithMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4generateFieldForType(member.literal)\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4FOR member:type.members\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateConstructorAssignmentForMember(member)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.value = value;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final ArrayType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.elementType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.values = values;");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA = \u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.genericType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.values = values;");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA = \u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.\u00B4type.signature.camelize\u00AA = \u00B4type.signature.camelize\u00AA;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.\u00B4member.toIdentifier\u00AA = \u00B4member.toIdentifier\u00AA;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateConstructorAssignmentForMember(final WrapWithMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4generateConstructorAssignmentForType(member.literal)\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final BodyBlock body, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return value.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final BodyBlock body, final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("JSONObject target = new JSONObject();");
    _builder.newLine();
    _builder.append("\u00B4FOR member:type.members\u00AA");
    _builder.newLine();
    _builder.append("\u00B4serializationStatementGenerator.generate(member, \"transformerProvider\", \"this\", \"target\", true)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final BodyBlock body, final UserType type) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    CharSequence _generateSerializationStatementForUserType = this.generateSerializationStatementForUserType(body, type, _declaration);
    return _generateSerializationStatementForUserType;
  }
  
  protected CharSequence _generateSerializationStatementForUserType(final BodyBlock body, final UserType type, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("JSONObject target = new JSONObject();");
    _builder.newLine();
    _builder.append("transformerProvider.get(\u00B4type.signature\u00AAOutputTransformer.class).transform(\u00B4type.signature.camelize\u00AA, target);");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForUserType(final BodyBlock body, final UserType type, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return \u00B4type.signature.camelize\u00AA.getValue();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final BodyBlock body, final ArrayType type) {
    Type _elementType = type.getElementType();
    CharSequence _generateSerializationStatementForArrayType = this.generateSerializationStatementForArrayType(body, type, _elementType);
    return _generateSerializationStatementForArrayType;
  }
  
  protected CharSequence _generateSerializationStatementForArrayType(final BodyBlock body, final ArrayType type, final IntrinsicType elementType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("JSONArray target = new JSONArray();");
    _builder.newLine();
    _builder.append("for(\u00B4type.innerSignature\u00AA element:values) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("target.put(element);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForArrayType(final BodyBlock body, final ArrayType type, final UserType elementType) {
    UserTypeDeclaration _declaration = elementType.getDeclaration();
    CharSequence _generateSerializationStatementForUserTypeArray = this.generateSerializationStatementForUserTypeArray(body, type, elementType, _declaration);
    return _generateSerializationStatementForUserTypeArray;
  }
  
  protected CharSequence _generateSerializationStatementForUserTypeArray(final BodyBlock body, final ArrayType type, final UserType elementType, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("JSONArray target = new JSONArray();");
    _builder.newLine();
    _builder.append("transformerProvider.get(\u00B4type.innerSignature\u00AAArrayOutputTransformer.class).transform(\u00B4type.innerSignature.camelize.pluralize\u00AA, target);");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForUserTypeArray(final BodyBlock body, final ArrayType type, final UserType elementType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("JSONArray target = new JSONArray();");
    _builder.newLine();
    _builder.append("for(\u00B4type.innerSignature\u00AA element:\u00B4type.innerSignature.camelize.pluralize\u00AA) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("target.put(element.getValue());");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForType(final BodyBlock body, final GenericListType type) {
    Type _genericType = type.getGenericType();
    CharSequence _generateSerializationStatementForGenericListType = this.generateSerializationStatementForGenericListType(body, type, _genericType);
    return _generateSerializationStatementForGenericListType;
  }
  
  protected CharSequence _generateSerializationStatementForGenericListType(final BodyBlock body, final GenericListType type, final IntrinsicType elementType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("JSONArray target = new JSONArray(values);");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForGenericListType(final BodyBlock body, final GenericListType type, final UserType elementType) {
    UserTypeDeclaration _declaration = elementType.getDeclaration();
    CharSequence _generateSerializationStatementForUserTypeGenericList = this.generateSerializationStatementForUserTypeGenericList(body, type, elementType, _declaration);
    return _generateSerializationStatementForUserTypeGenericList;
  }
  
  protected CharSequence _generateSerializationStatementForUserTypeGenericList(final BodyBlock body, final GenericListType type, final UserType elementType, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("JSONArray target = new JSONArray();");
    _builder.newLine();
    _builder.append("transformerProvider.get(\u00B4type.innerSignature\u00AAListOutputTransformer.class).transform(\u00B4type.innerSignature.camelize.pluralize\u00AA, target);");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSerializationStatementForUserTypeGenericList(final BodyBlock body, final GenericListType type, final UserType elementType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("JSONArray target = new JSONArray();");
    _builder.newLine();
    _builder.append("for(\u00B4type.innerSignature\u00AA element:\u00B4type.innerSignature.camelize.pluralize\u00AA) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("target.put(element.getValue());");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("return target.toString();");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Converts a path (eg:- /qux/:fooparam/:quxparam/bar
   * into constructor arguments
   */
  public String generateRequestConstructorArgs(final String path, final BodyBlock body) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    ArrayList<String> args = _arrayList;
    Iterable<String> _argsFromPath = ModelExtensions.getArgsFromPath(path);
    for (final String pathArg : _argsFromPath) {
      String _substring = pathArg.substring(1);
      String _camelize = ModelExtensions.camelize(_substring);
      String _escapeReserved = ModelExtensions.escapeReserved(_camelize);
      String _plus = ("\tString " + _escapeReserved);
      args.add(_plus);
    }
    boolean _notEquals = (!Objects.equal(body, null));
    if (_notEquals) {
      BlockType _type = body.getType();
      this.buildConstructorArgsForType(_type, args);
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
        if ((member instanceof WrapWithMember)) {
          ComplexTypeLiteral _literal = ((WrapWithMember) member).getLiteral();
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
  
  protected void _buildConstructorArgsForType(final ArrayType type, final List<String> args) {
    Type _elementType = type.getElementType();
    if ((_elementType instanceof IntrinsicType)) {
      String _signature = ModelExtensions.signature(type);
      String _plus = (_signature + " values");
      args.add(_plus);
    } else {
      String _signature_1 = ModelExtensions.signature(type);
      String _plus_1 = (_signature_1 + " ");
      String _innerSignature = ModelExtensions.innerSignature(type);
      String _camelize = ModelExtensions.camelize(_innerSignature);
      String _pluralize = ModelExtensions.pluralize(_camelize);
      String _plus_2 = (_plus_1 + _pluralize);
      args.add(_plus_2);
    }
  }
  
  protected void _buildConstructorArgsForType(final GenericListType type, final List<String> args) {
    Type _genericType = type.getGenericType();
    if ((_genericType instanceof IntrinsicType)) {
      String _signature = ModelExtensions.signature(type);
      String _plus = (_signature + " values");
      args.add(_plus);
    } else {
      String _signature_1 = ModelExtensions.signature(type);
      String _plus_1 = (_signature_1 + " ");
      String _innerSignature = ModelExtensions.innerSignature(type);
      String _camelize = ModelExtensions.camelize(_innerSignature);
      String _pluralize = ModelExtensions.pluralize(_camelize);
      String _plus_2 = (_plus_1 + _pluralize);
      args.add(_plus_2);
    }
  }
  
  protected void _buildConstructorArgsForType(final UserType type, final List<String> args) {
    String _signature = ModelExtensions.signature(type);
    String _plus = (_signature + " ");
    String _signature_1 = ModelExtensions.signature(type);
    String _camelize = ModelExtensions.camelize(_signature_1);
    String _plus_1 = (_plus + _camelize);
    args.add(_plus_1);
  }
  
  public String pathToStringFormatArgs(final String path) {
    String[] _split = path.split("/");
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
        public Boolean apply(final String seg) {
          boolean _startsWith = seg.startsWith(":");
          return Boolean.valueOf(_startsWith);
        }
      };
    Iterable<String> _filter = IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(_split)), _function);
    final Function1<String,String> _function_1 = new Function1<String,String>() {
        public String apply(final String arg) {
          String _substring = arg.substring(1);
          String _camelize = ModelExtensions.camelize(_substring);
          String _escapeReserved = ModelExtensions.escapeReserved(_camelize);
          return _escapeReserved;
        }
      };
    String _join = IterableExtensions.<String>join(_filter, ", ", _function_1);
    String _plus = (", " + _join);
    return _plus;
  }
  
  public boolean hasArgs(final String path) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(path, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _contains = path.contains(":");
      _and = (_notEquals && _contains);
    }
    return _and;
  }
  
  public CharSequence generateFieldForType(final BlockType type) {
    if (type instanceof ArrayType) {
      return _generateFieldForType((ArrayType)type);
    } else if (type instanceof GenericListType) {
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
    if (member instanceof TypedMember) {
      return _generateFieldForMember((TypedMember)member);
    } else if (member instanceof WrapWithMember) {
      return _generateFieldForMember((WrapWithMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateConstructorAssignmentForType(final BlockType type) {
    if (type instanceof ArrayType) {
      return _generateConstructorAssignmentForType((ArrayType)type);
    } else if (type instanceof GenericListType) {
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
    if (member instanceof TypedMember) {
      return _generateConstructorAssignmentForMember((TypedMember)member);
    } else if (member instanceof WrapWithMember) {
      return _generateConstructorAssignmentForMember((WrapWithMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateSerializationStatementForType(final BodyBlock body, final BlockType type) {
    if (type instanceof ArrayType) {
      return _generateSerializationStatementForType(body, (ArrayType)type);
    } else if (type instanceof GenericListType) {
      return _generateSerializationStatementForType(body, (GenericListType)type);
    } else if (type instanceof IntrinsicType) {
      return _generateSerializationStatementForType(body, (IntrinsicType)type);
    } else if (type instanceof UserType) {
      return _generateSerializationStatementForType(body, (UserType)type);
    } else if (type instanceof ComplexTypeLiteral) {
      return _generateSerializationStatementForType(body, (ComplexTypeLiteral)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body, type).toString());
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
  
  public CharSequence generateSerializationStatementForArrayType(final BodyBlock body, final ArrayType type, final Type elementType) {
    if (elementType instanceof IntrinsicType) {
      return _generateSerializationStatementForArrayType(body, type, (IntrinsicType)elementType);
    } else if (elementType instanceof UserType) {
      return _generateSerializationStatementForArrayType(body, type, (UserType)elementType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body, type, elementType).toString());
    }
  }
  
  public CharSequence generateSerializationStatementForUserTypeArray(final BodyBlock body, final ArrayType type, final UserType elementType, final UserTypeDeclaration declaration) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateSerializationStatementForUserTypeArray(body, type, elementType, (ComplexTypeDeclaration)declaration);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateSerializationStatementForUserTypeArray(body, type, elementType, (EnumTypeDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body, type, elementType, declaration).toString());
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
    if (type instanceof ArrayType) {
      _buildConstructorArgsForType((ArrayType)type, args);
      return;
    } else if (type instanceof GenericListType) {
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
