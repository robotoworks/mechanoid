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
	
	JsonWriterGenerator jsonWriterGenerator
	
	def setJsonWriterGenerator(JsonWriterGenerator jsonWriterGenerator){
		this.jsonWriterGenerator = jsonWriterGenerator;
	}
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;
	
	«var body = generateOutputTransformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.internal.util.JsonWriter;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("java.util.List")»

		public class «decl.name»OutputTransformer extends Transformer<«decl.name», JsonWriter> {			
			public void transform(«decl.name» source, JsonWriter target) throws TransformException {
				try {

					«jsonWriterGenerator.genWriteComplexType(decl)»

				} catch (Exception x) {
					throw new TransformException(x);
				}
			}
			public void transform(List<«decl.name»> source, JsonWriter target) throws TransformException {
				try {
					target.beginArray();
					
					for(«decl.name» sourceItem:source) {
						transform(sourceItem, target);
					}
					
					target.endArray();
				} catch (Exception x) {
					throw new TransformException(x);
				}
			}
		}
	'''
}