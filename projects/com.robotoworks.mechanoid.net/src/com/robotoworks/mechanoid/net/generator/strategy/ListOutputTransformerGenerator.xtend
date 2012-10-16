package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

class ListOutputTransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	def registerImports(){}
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;

	«var body = generateListOutputTransformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.internal.util.JsonWriter;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateListOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("java.util.List")»
		public class «decl.name»ListOutputTransformer extends Transformer<List<«decl.name»>, JsonWriter> {			
			public void transform(List<«decl.name»> source, JsonWriter target) throws TransformException {
				
				«decl.name»OutputTransformer itemTransformer = provider.get(«decl.name»OutputTransformer.class);
				
				try {
					target.beginArray();
					
					for(«decl.name» sourceItem:source) {
						itemTransformer.transform(sourceItem, target);
					}
					
					target.endArray();
				} catch (Exception x) {
					throw new TransformException(x);
				}
			}
		}
	'''	
}