package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model

class OutputTransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	def registerImports(){}
	
	MemberSerializationStatementGenerator serializationStatementGenerator
	
	def setMemberSerializationStatementGenerator(MemberSerializationStatementGenerator serializationStatementGenerator){
		this.serializationStatementGenerator = serializationStatementGenerator;
	}
	
	def getMemberSerializationStatementGenerator(){
		this.serializationStatementGenerator;
	}
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;
	
	«var body = generateOutputTransformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("java.lang.Exception")»
		public class «decl.name»OutputTransformer extends Transformer<«decl.name», JSONObject> {
			public JSONObject transform(«decl.name» source) throws TransformException {
				JSONObject target = new JSONObject();

				transform(source, target);
				
				return target;
			}
			
			public void transform(«decl.name» source, JSONObject target) throws TransformException {
				try {
					«FOR member:decl.literal.members»
					«serializationStatementGenerator.generate(member, "provider", "source", "target", false)»
					«ENDFOR»
				} catch (Exception x) {
					throw new TransformException(x);
				}
			}
		}
	'''
}