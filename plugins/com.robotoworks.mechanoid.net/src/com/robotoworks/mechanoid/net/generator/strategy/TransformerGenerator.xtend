package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.generator.CodeGenerationContext
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model

class TransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	def registerImports(){}
	
	JsonWriterGenerator jsonWriterGenerator
	JsonReaderGenerator jsonReaderGenerator
	
	def setJsonWriterGenerator(JsonWriterGenerator jsonWriterGenerator){
		this.jsonWriterGenerator = jsonWriterGenerator;
	}
	def setJsonReaderGenerator(JsonReaderGenerator jsonReaderGenerator){
		this.jsonReaderGenerator = jsonReaderGenerator;
	}
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;
	
	«var body = generateOutputTransformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.internal.util.JsonWriter;
	import com.robotoworks.mechanoid.internal.util.JsonReader;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("java.util.List")»

		public class «decl.name»Transformer extends Transformer<«decl.name», JsonReader, JsonWriter> {			
			public void transformOut(«decl.name» subject, JsonWriter target) throws TransformException {
				try {

					«jsonWriterGenerator.genWriteComplexType(decl)»

				} catch (Exception x) {
					throw new TransformException(x);
				}
			}
			public void transformOut(List<«decl.name»> subject, JsonWriter target) throws TransformException {
				try {
					target.beginArray();
					
					for(«decl.name» item:subject) {
						transformOut(item, target);
					}
					
					target.endArray();
				} catch (Exception x) {
					throw new TransformException(x);
				}
			}
			
			public void transformIn(JsonReader source, «decl.name» subject) throws TransformException {
				try {
					«jsonReaderGenerator.genReadComplexType(decl)»
					
				} catch (Exception x) {
					throw new TransformException(x);
				}
				
			}
			
			public void transformIn(JsonReader source, List<«decl.name»> subject) throws TransformException {
				
				try {
					source.beginArray();
					
					while(source.hasNext()) {
						«decl.name» item = new «decl.name»();
						transformIn(source, item);
						subject.add(item);
						
					}
					
					source.endArray();
					
				} catch (Exception x) {
					throw new TransformException(x);
				}
				
			}
		}
	'''
}