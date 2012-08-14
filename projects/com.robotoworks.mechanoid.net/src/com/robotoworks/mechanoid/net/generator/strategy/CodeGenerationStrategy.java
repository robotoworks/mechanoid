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

public class CodeGenerationStrategy {
	private ArrayInputTransformerGenerator arrayInputTransformerGenerator;
	private ArrayOutputTransformerGenerator arrayOutputTransformerGenerator;
	private ClientGenerator clientGenerator;
	private InputTransformerGenerator inputTransformerGenerator;
	private IntegerEnumTypeGenerator integerEnumTypeGenerator;
	private StringEnumTypeGenerator stringEnumTypeGenerator;
	private ListInputTransformerGenerator listInputTransformerGenerator;
	private ListOutputTransformerGenerator listOutputTransformerGenerator;
	private OutputTransformerGenerator outputTransformerGenerator;
	private RequestGenerator requestGenerator;
	private ResponseGenerator responseGenerator;
	private TypeGenerator typeGenerator;
	private MemberDeserializationStatementGenerator memberDeserializationStatementGenerator;
	private MemberSerializationStatementGenerator memberSerializationStatementGenerator;
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
				for(HttpMethod method:client.getMethods()){
					String requestFileName = ModelExtensions.resolveFileName(module.getPackageName(), ModelExtensions.pascalize(method.getName()) + "Request");
					String responseFileName = ModelExtensions.resolveFileName(module.getPackageName(), ModelExtensions.pascalize(method.getName()) + "Response");
					fsa.generateFile(requestFileName, getRequestGenerator().generate(method, module, client));
					fsa.generateFile(responseFileName, getResponseGenerator().generate(method, module, client));
				}
			} else if(decl instanceof ComplexTypeDeclaration) {
				ComplexTypeDeclaration lit = (ComplexTypeDeclaration)decl;

				// Generate transformers
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "OutputTransformer"), getOutputTransformerGenerator().generate(lit, module));
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "InputTransformer"), getInputTransformerGenerator().generate(lit, module));
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "ArrayOutputTransformer"), getArrayOutputTransformerGenerator().generate(lit, module));
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "ArrayInputTransformer"), getArrayInputTransformerGenerator().generate(lit, module));
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "ListOutputTransformer"), getListOutputTransformerGenerator().generate(lit, module));
				fsa.generateFile(ModelExtensions.resolveFileName(module.getPackageName(), lit.getName() + "ListInputTransformer"), getListInputTransformerGenerator().generate(lit, module));
				
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
	
	public ArrayInputTransformerGenerator getArrayInputTransformerGenerator() {
		if(arrayInputTransformerGenerator == null){
			arrayInputTransformerGenerator = new ArrayInputTransformerGenerator();
			arrayInputTransformerGenerator.setContext(context);
		}
		return arrayInputTransformerGenerator;
	}
	
	public ArrayOutputTransformerGenerator getArrayOutputTransformerGenerator() {
		if(arrayOutputTransformerGenerator == null){
			arrayOutputTransformerGenerator = new ArrayOutputTransformerGenerator();
			arrayOutputTransformerGenerator.setContext(context);
		}
		return arrayOutputTransformerGenerator;
	}
	
	public ClientGenerator getClientGenerator() {
		if(clientGenerator == null){
			clientGenerator = new ClientGenerator();
			clientGenerator.setContext(context);
		}
		return clientGenerator;
	}
	
	public InputTransformerGenerator getInputTransformerGenerator() {
		if(inputTransformerGenerator == null){
			inputTransformerGenerator = new InputTransformerGenerator();
			inputTransformerGenerator.setContext(context);
			inputTransformerGenerator.setMemberDeserializationStatementGenerator(getMemberDeserializationStatementGenerator());
		}
		return inputTransformerGenerator;
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
	public ListInputTransformerGenerator getListInputTransformerGenerator() {
		if(listInputTransformerGenerator == null){
			listInputTransformerGenerator = new ListInputTransformerGenerator();
			listInputTransformerGenerator.setContext(context);
		}
		return listInputTransformerGenerator;
	}
	public ListOutputTransformerGenerator getListOutputTransformerGenerator() {
		if(listOutputTransformerGenerator == null){
			listOutputTransformerGenerator = new ListOutputTransformerGenerator();
			listOutputTransformerGenerator.setContext(context);
		}
		return listOutputTransformerGenerator;
	}

	public OutputTransformerGenerator getOutputTransformerGenerator() {
		if(outputTransformerGenerator == null){
			outputTransformerGenerator = new OutputTransformerGenerator();
			outputTransformerGenerator.setContext(context);
			outputTransformerGenerator.setMemberSerializationStatementGenerator(getMemberSerializationStatementGenerator());
		}
		return outputTransformerGenerator;
	}
	public RequestGenerator getRequestGenerator() {
		if(requestGenerator == null){
			requestGenerator = new RequestGenerator();
			requestGenerator.setContext(context);
			requestGenerator.setMemberSerializationStatementGenerator(getMemberSerializationStatementGenerator());
		}
		return requestGenerator;
	}
	public ResponseGenerator getResponseGenerator() {
		if(responseGenerator == null){
			responseGenerator = createResponseGenerator();
			responseGenerator.setContext(context);
			responseGenerator.setMemberDeserializationStatementGenerator(getMemberDeserializationStatementGenerator());
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
	
	public MemberDeserializationStatementGenerator getMemberDeserializationStatementGenerator() {
		if(memberDeserializationStatementGenerator == null){
			memberDeserializationStatementGenerator = new MemberDeserializationStatementGenerator();
			memberDeserializationStatementGenerator.setContext(context);
		}
		return memberDeserializationStatementGenerator;
	}
	
	public MemberSerializationStatementGenerator getMemberSerializationStatementGenerator() {
		if(memberSerializationStatementGenerator == null){
			memberSerializationStatementGenerator = new MemberSerializationStatementGenerator();
			memberSerializationStatementGenerator.setContext(context);
		}
		return memberSerializationStatementGenerator;
	}
}
