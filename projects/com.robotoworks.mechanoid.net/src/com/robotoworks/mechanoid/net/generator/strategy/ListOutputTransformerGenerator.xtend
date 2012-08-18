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
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateListOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("org.json.JSONObject")»
		«context.registerImport("java.util.List")»
		public class «decl.name»ListOutputTransformer extends Transformer<List<«decl.name»>, JSONArray> {
			public void transform(List<«decl.name»> source, JSONArray target) throws TransformException {
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