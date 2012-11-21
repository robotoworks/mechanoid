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
	
	JsonReaderGenerator jsonReaderGenerator
	
	def setJsonReaderGenerator(JsonReaderGenerator jsonReaderGenerator){
		this.jsonReaderGenerator = jsonReaderGenerator;
	}
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
		package «module.packageName»;
		
		«var body = generateClass(decl, module)»
		«registerImports»
		import com.robotoworks.mechanoid.net.Transformer;
		import com.robotoworks.mechanoid.net.TransformException;
		import com.robotoworks.mechanoid.internal.util.JsonReader;
		«context.printImports»
		«context.clearImports»
		
		«body»
	'''	
	
	def generateClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("java.util.List")»
		public class «decl.name»InputTransformer extends Transformer<JsonReader, «decl.name»> {			
			public void transform(JsonReader source, «decl.name» target) throws TransformException {
				try {
					«jsonReaderGenerator.genReadComplexType(decl)»
					
				} catch (Exception x) {
					throw new TransformException(x);
				}
				
			}
			
			public void transform(JsonReader source, List<«decl.name»> target) throws TransformException {
				
				try {
					source.beginArray();
					
					while(source.hasNext()) {
						«decl.name» targetItem = new «decl.name»();
						transform(source, targetItem);
						target.add(targetItem);
						
					}
					
					source.endArray();
					
				} catch (Exception x) {
					throw new TransformException(x);
				}
				
			}
		}
		
	'''
}