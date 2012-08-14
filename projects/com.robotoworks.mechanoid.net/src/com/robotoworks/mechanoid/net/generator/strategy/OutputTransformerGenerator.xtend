package com.robotoworks.mechanoid.net.generator.strategy

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.ArrayType
import com.robotoworks.mechanoid.net.netModel.GenericListType
import com.google.inject.Inject
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

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