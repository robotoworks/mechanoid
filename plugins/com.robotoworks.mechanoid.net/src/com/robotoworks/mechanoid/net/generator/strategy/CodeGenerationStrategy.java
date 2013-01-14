package com.robotoworks.mechanoid.net.generator.strategy;

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext;
import com.robotoworks.mechanoid.net.generator.ModelExtensions;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.Declaration;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.Model;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

public class CodeGenerationStrategy {
	private ClientGenerator clientGenerator;
	private IntegerEnumTypeGenerator integerEnumTypeGenerator;
	private StringEnumTypeGenerator stringEnumTypeGenerator;
	private TransformerGenerator transformerGenerator;
	private RequestGenerator requestGenerator;
	private ResponseGenerator responseGenerator;
	private TypeGenerator typeGenerator;
	private JsonReaderGenerator jsonReaderGenerator;
	private JsonWriterGenerator jsonWriterGenerator;
	protected CodeGenerationContext context;
	
	public void setContext(CodeGenerationContext context) {
		this.context = context;
	}
	
	public void generate(IFileSystemAccess fsa, Model module){
		for(Declaration decl : module.getDeclarations()){
			if(decl instanceof Client){
				Client client = (Client) decl;
				
				// Generate each client file
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), client.getName()), getClientGenerator().generate(client, module));
				
				// Generate client methods for each client
				for(HttpMethod method:IterableExtensions.filter(client.getBlocks(), HttpMethod.class)){
					String requestFileName = ModelExtensions.resolveFileName(module.getPackageName(), ModelExtensions.pascalize(method.getName()) + "Request");
					String responseFileName = ModelExtensions.resolveFileName(module.getPackageName(), ModelExtensions.pascalize(method.getName()) + "Result");
					fsa.generateFile(requestFileName, getRequestGenerator().generate(method, module, client));
					fsa.generateFile(responseFileName, getResponseGenerator().generate(method, module, client));
				}
			} else if(decl instanceof ComplexTypeDeclaration) {
				ComplexTypeDeclaration lit = (ComplexTypeDeclaration)decl;

				// Generate transformers
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "Transformer"), getTransformerGenerator().generate(lit, module));
				
				// Generate types
				if(lit.isGen()){
					fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName()), getTypeGenerator().generate(lit, module));
				}		
			} else if(decl instanceof EnumTypeDeclaration) {
				EnumTypeDeclaration typeDecl = (EnumTypeDeclaration)decl;
				
				// Generate enum types
				if(typeDecl.isGen()){
					if(typeDecl.getSuperType() != null) {
						fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), typeDecl.getName()), getIntegerEnumTypeGenerator().generate(typeDecl, module));						
					} else {						
						fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), typeDecl.getName()), getStringEnumTypeGenerator().generate(typeDecl, module));
					}
				}		
			}
		}
	}
	
	public ClientGenerator getClientGenerator() {
		if(clientGenerator == null){
			clientGenerator = new ClientGenerator();
			clientGenerator.setContext(context);
		}
		return clientGenerator;
	}
	
	public IntegerEnumTypeGenerator getIntegerEnumTypeGenerator() {
		if(integerEnumTypeGenerator == null){
			integerEnumTypeGenerator = new IntegerEnumTypeGenerator();
			integerEnumTypeGenerator.setContext(context);
		}
		return integerEnumTypeGenerator;
	}
	public StringEnumTypeGenerator getStringEnumTypeGenerator() {
		if(stringEnumTypeGenerator == null){
			stringEnumTypeGenerator = new StringEnumTypeGenerator();
			stringEnumTypeGenerator.setContext(context);
		}
		return stringEnumTypeGenerator;
	}

	public TransformerGenerator getTransformerGenerator() {
		if(transformerGenerator == null){
			transformerGenerator = new TransformerGenerator();
			transformerGenerator.setContext(context);
			transformerGenerator.setJsonReaderGenerator(getJsonReaderGenerator());
			transformerGenerator.setJsonWriterGenerator(getJsonWriterGenerator());
		}
		return transformerGenerator;
	}
	
	public RequestGenerator getRequestGenerator() {
		if(requestGenerator == null){
			requestGenerator = new RequestGenerator();
			requestGenerator.setContext(context);
			requestGenerator.setJsonWriterGenerator(getJsonWriterGenerator());
		}
		return requestGenerator;
	}
	public ResponseGenerator getResponseGenerator() {
		if(responseGenerator == null){
			responseGenerator = createResponseGenerator();
			responseGenerator.setContext(context);
			responseGenerator.setJsonReaderGenerator(getJsonReaderGenerator());
		}
		return responseGenerator;
	}
	
	protected ResponseGenerator createResponseGenerator() {
		return new ResponseGenerator();
	}
	
	public TypeGenerator getTypeGenerator() {
		if(typeGenerator == null){
			typeGenerator = new TypeGenerator();
			typeGenerator.setContext(context);
		}
		return typeGenerator;
	}
	
	public JsonReaderGenerator getJsonReaderGenerator() {
		if(jsonReaderGenerator == null){
			jsonReaderGenerator = new JsonReaderGenerator();
			jsonReaderGenerator.setContext(context);
		}
		return jsonReaderGenerator;
	}
	
	public JsonWriterGenerator getJsonWriterGenerator() {
		if(jsonWriterGenerator == null){
			jsonWriterGenerator = new JsonWriterGenerator();
			jsonWriterGenerator.setContext(context);
		}
		return jsonWriterGenerator;
	}
}
