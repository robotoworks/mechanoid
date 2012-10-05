package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model

class InputTransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def registerImports(){}
	
	MemberDeserializationStatementGenerator deserializationStatementGenerator
	
	def setMemberDeserializationStatementGenerator(MemberDeserializationStatementGenerator deserializationStatementGenerator){
		this.deserializationStatementGenerator = deserializationStatementGenerator;
	}
	
	def getMemberDeserializationStatementGenerator (){
		return deserializationStatementGenerator;
	}
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
		package «module.packageName»;
		
		«var body = generateInputTransformerGeneratorClass(decl, module)»
		«registerImports»
		import com.robotoworks.mechanoid.net.Transformer;
		import com.robotoworks.mechanoid.net.TransformException;
		«context.printImports»
		«context.clearImports»
		
		«body»
	'''	
	
	def generateInputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("org.json.JSONException")»
		public class «decl.name»InputTransformer extends Transformer<JSONObject, «decl.name»> {
			public «decl.name» transform(JSONObject source) throws TransformException {
				«decl.name» target = new «decl.name»();

				transform(source, target);
				
				return target;
			}
			public void transform(JSONObject source, «decl.name» target) throws TransformException {
				try {
					«FOR member:decl.literal.members»
					«deserializationStatementGenerator.generate(member, "provider", "source", "target", false)»
					«ENDFOR»
				} catch (JSONException x) {
					throw new TransformException(x);
				}
				
			}
		}
	'''
}