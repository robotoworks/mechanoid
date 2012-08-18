package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.strategy.MemberDeserializationStatementGenerator;
import com.robotoworks.mechanoid.net.netModel.ArrayType;
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
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.WrapWithMember;
import java.util.Arrays;
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
    this.context.registerImport("com.robotoworks.mechanoid.net.WebResponse");
  }
  
  public CharSequence generate(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \u00B4module.packageName\u00AA;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\u00B4var body = generateResponseClass(method, module, client)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4registerImports\u00AA");
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
  
  public CharSequence generateResponseClass(final HttpMethod method, final Model module, final Client client) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class \u00B4method.name.pascalize\u00AAResponse \u00B4IF(method.response != null && method.response.superType != null)\u00AAextends \u00B4method.response.superType.name\u00AA\u00B4ENDIF\u00AA {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4IF (method.response != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4generateFieldForType(method.response.type)\u00AA\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4generateGetterForType(method.response.type)\u00AA\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4method.name.pascalize\u00AAResponse(TransformerProvider transformerProvider, WebResponse<\u00B4method.name.pascalize\u00AAResponse> webResponse) throws TransformException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4IF (method.response != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4IF(method.response.type != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\u00B4generateDeserializationStatementForType(method.response, method.response.type)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\u00B4IF(method.response.superType != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\u00B4generateDeserializationStatementForSuperTypeOnly(method.response, method.response.superType)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4FOR member:type.members\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateFieldForMember(member)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4ENDFOR\u00AA\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private \u00B4type.signature\u00AA value;\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final ArrayType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.elementType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private \u00B4type.signature\u00AA values;");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private \u00B4type.signature\u00AA \u00B4type.innerSignature.camelize.pluralize\u00AA;");
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
    _builder.append("private \u00B4type.signature\u00AA values;");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private \u00B4type.signature\u00AA \u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private \u00B4type.signature\u00AA \u00B4type.signature.camelize.escapeReserved\u00AA;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private \u00B4member.type.signature\u00AA \u00B4member.toIdentifier\u00AA;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateFieldForMember(final WrapWithMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4generateFieldForType(member.literal)\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4FOR member:type.members\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateGetter(member)\u00AA");
    _builder.newLine();
    _builder.append("\u00B4ENDFOR\u00AA\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public \u00B4type.signature\u00AA getValue(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this.value;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final ArrayType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.elementType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4type.signature\u00AA getValues(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.values;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4type.signature\u00AA get\u00B4type.innerSignature.pascalize.pluralize\u00AA(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.\u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final GenericListType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4IF(type.genericType instanceof IntrinsicType)\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4type.signature\u00AA getValues(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.values;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4ELSE\u00AA");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public \u00B4type.signature\u00AA get\u00B4type.innerSignature.pascalize.pluralize\u00AA(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.\u00B4type.innerSignature.camelize.pluralize\u00AA;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetterForType(final UserType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public \u00B4type.signature\u00AA get\u00B4type.signature.pascalize\u00AA(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this.\u00B4type.signature.camelize.escapeReserved\u00AA;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetter(final TypedMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public \u00B4member.type.signature\u00AA \u00B4member.toGetMethodName\u00AA(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this.\u00B4member.toIdentifier\u00AA;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateGetter(final WrapWithMember member) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4generateGetterForType(member.literal)\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"com.robotoworks.mechanoid.util.Streams\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.io.InputStream\")\u00AA");
    _builder.newLine();
    _builder.append("InputStream stream = webResponse.getContentStream();");
    _builder.newLine();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(stream != null){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String content = Streams.readAllText(stream);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementFooter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"java.io.IOException\")\u00AA");
    _builder.newLine();
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
    _builder.append("if(stream != null) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("stream.close();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch (IOException x) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new TransformException(x);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDeserializationStatementForSuperTypeOnly(final ResponseBlock response, final ComplexTypeDeclaration superType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONObject source = new JSONObject(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transformerProvider.get(\u00B4superType.name\u00AAInputTransformer.class).transform(source, this);");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final ComplexTypeLiteral type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONObject source = new JSONObject(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4FOR member:type.members\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4deserializationStatementGenerator.generate(member, \"transformerProvider\", \"source\", \"this\", true)\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDFOR\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4IF(response.superType != null)\u00AA");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transformerProvider.get(\u00B4response.superType.name\u00AAInputTransformer.class).transform(source, this);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\u00B4ENDIF\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final IntrinsicType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.value = \u00B4type.signature\u00AA.valueOf(content);");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final UserType type) {
    UserTypeDeclaration _declaration = type.getDeclaration();
    CharSequence _generateDeserializationStatementForUserType = this.generateDeserializationStatementForUserType(response, type, _declaration);
    return _generateDeserializationStatementForUserType;
  }
  
  protected CharSequence _generateDeserializationStatementForUserType(final ResponseBlock response, final UserType type, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONObject\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONObject source = new JSONObject(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.\u00B4type.signature.camelize\u00AA = new \u00B4type.signature\u00AA();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transformerProvider.get(\u00B4type.signature\u00AAInputTransformer.class).transform(source, this.\u00B4type.signature.camelize\u00AA);");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserType(final ResponseBlock response, final UserType type, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.\u00B4type.signature.camelize\u00AA = \u00B4type.signature\u00AA.fromValue(content);");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final ArrayType type) {
    Type _elementType = type.getElementType();
    CharSequence _generateDeserializationStatementForArrayType = this.generateDeserializationStatementForArrayType(response, type, _elementType);
    return _generateDeserializationStatementForArrayType;
  }
  
  protected CharSequence _generateDeserializationStatementForArrayType(final ResponseBlock response, final ArrayType type, final IntrinsicType elementType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.values = new \u00B4type.innerSignature\u00AA[source.length()];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.values[i] = source.\u00B4elementType.toJSONPropertyGetMethod\u00AA(i);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForArrayType(final ResponseBlock response, final ArrayType type, final UserType elementType) {
    UserTypeDeclaration _declaration = elementType.getDeclaration();
    CharSequence _generateDeserializationStatementForUserTypeArray = this.generateDeserializationStatementForUserTypeArray(response, type, elementType, _declaration);
    return _generateDeserializationStatementForUserTypeArray;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeArray(final ResponseBlock response, final ArrayType type, final UserType elementType, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA = new \u00B4type.innerSignature\u00AA[source.length()];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transformerProvider.get(\u00B4type.innerSignature\u00AAArrayInputTransformer.class).transform(source, this.\u00B4type.innerSignature.camelize.pluralize\u00AA);");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeArray(final ResponseBlock response, final ArrayType type, final UserType elementType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA = new \u00B4type.innerSignature\u00AA[source.length()];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4type.innerSignature\u00AA element = \u00B4type.innerSignature\u00AA.fromValue(source.\u00B4declaration.resolveGetJSONValueMethodName\u00AA(i));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA[i] = element;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForType(final ResponseBlock response, final GenericListType type) {
    Type _genericType = type.getGenericType();
    CharSequence _generateDeserializationStatementForGenericListType = this.generateDeserializationStatementForGenericListType(response, type, _genericType);
    return _generateDeserializationStatementForGenericListType;
  }
  
  protected CharSequence _generateDeserializationStatementForGenericListType(final ResponseBlock response, final GenericListType type, final IntrinsicType genericType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.ArrayList\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.values = new Array\u00B4type.signature\u00AA(source.length());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.values.add(source.\u00B4genericType.toJSONPropertyGetMethod\u00AA(i));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForGenericListType(final ResponseBlock response, final GenericListType type, final UserType genericType) {
    UserTypeDeclaration _declaration = genericType.getDeclaration();
    CharSequence _generateDeserializationStatementForUserTypeGenericList = this.generateDeserializationStatementForUserTypeGenericList(response, type, genericType, _declaration);
    return _generateDeserializationStatementForUserTypeGenericList;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeGenericList(final ResponseBlock response, final GenericListType type, final UserType genericType, final ComplexTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.ArrayList\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA = new Array\u00B4type.signature\u00AA(source.length());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transformerProvider.get(\u00B4type.innerSignature\u00AAListInputTransformer.class).transform(source, this.\u00B4type.innerSignature.camelize.pluralize\u00AA);");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateDeserializationStatementForUserTypeGenericList(final ResponseBlock response, final GenericListType type, final UserType genericType, final EnumTypeDeclaration declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00B4context.registerImport(\"org.json.JSONArray\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.List\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4context.registerImport(\"java.util.ArrayList\")\u00AA");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementHeader()\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JSONArray source = new JSONArray(content);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA = new Array\u00B4type.signature\u00AA(source.length());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(int i=0; i < source.length(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\u00B4type.innerSignature\u00AA element = \u00B4type.innerSignature\u00AA.fromValue(source.\u00B4declaration.resolveGetJSONValueMethodName\u00AA(i));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.\u00B4type.innerSignature.camelize.pluralize\u00AA.add(element);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\u00B4generateDeserializationStatementFooter()\u00AA");
    _builder.newLine();
    return _builder;
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
  
  public CharSequence generateGetterForType(final BlockType type) {
    if (type instanceof ArrayType) {
      return _generateGetterForType((ArrayType)type);
    } else if (type instanceof GenericListType) {
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
    if (member instanceof TypedMember) {
      return _generateGetter((TypedMember)member);
    } else if (member instanceof WrapWithMember) {
      return _generateGetter((WrapWithMember)member);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(member).toString());
    }
  }
  
  public CharSequence generateDeserializationStatementForType(final ResponseBlock response, final BlockType type) {
    if (type instanceof ArrayType) {
      return _generateDeserializationStatementForType(response, (ArrayType)type);
    } else if (type instanceof GenericListType) {
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
  
  public CharSequence generateDeserializationStatementForArrayType(final ResponseBlock response, final ArrayType type, final Type elementType) {
    if (elementType instanceof IntrinsicType) {
      return _generateDeserializationStatementForArrayType(response, type, (IntrinsicType)elementType);
    } else if (elementType instanceof UserType) {
      return _generateDeserializationStatementForArrayType(response, type, (UserType)elementType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(response, type, elementType).toString());
    }
  }
  
  public CharSequence generateDeserializationStatementForUserTypeArray(final ResponseBlock response, final ArrayType type, final UserType elementType, final UserTypeDeclaration declaration) {
    if (declaration instanceof ComplexTypeDeclaration) {
      return _generateDeserializationStatementForUserTypeArray(response, type, elementType, (ComplexTypeDeclaration)declaration);
    } else if (declaration instanceof EnumTypeDeclaration) {
      return _generateDeserializationStatementForUserTypeArray(response, type, elementType, (EnumTypeDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(response, type, elementType, declaration).toString());
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
