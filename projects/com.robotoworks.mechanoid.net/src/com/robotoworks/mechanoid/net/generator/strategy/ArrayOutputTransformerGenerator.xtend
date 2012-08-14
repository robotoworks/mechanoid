package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

class ArrayOutputTransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def registerImports()''''''
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;
	
	«var body = generateArrayOutputTransformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateArrayOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("org.json.JSONObject")»
		public class «decl.name»ArrayOutputTransformer extends Transformer<«decl.name»[], JSONArray> {
			public void transform(«decl.name»[] source, JSONArray target) throws TransformException {
				«decl.name»OutputTransformer itemTransformer = provider.get(«decl.name»OutputTransformer.class);
				for(«decl.name» sourceItem:source) {
					JSONObject targetItem = new JSONObject();
					itemTransformer.transform(sourceItem, targetItem);
					target.put(targetItem); 
				}
			}
		}
	'''	
}