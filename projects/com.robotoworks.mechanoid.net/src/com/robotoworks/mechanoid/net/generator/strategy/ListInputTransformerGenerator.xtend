package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

class ListInputTransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	

	def registerImports()''''''
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;

	«var body = generateListInputTranformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateListInputTranformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("org.json.JSONException")»
		«context.registerImport("java.util.List")»
		public class «decl.name»ListInputTransformer extends Transformer<JSONArray, List<«decl.name»>> {
			public void transform(JSONArray source, List<«decl.name»> target) throws TransformException {
				try {
					«decl.name»InputTransformer itemTransformer = provider.get(«decl.name»InputTransformer.class);
					for(int i=0; i < source.length(); i++) {
						«decl.name» targetItem = new «decl.name»();
						target.add(targetItem);
						itemTransformer.transform(source.getJSONObject(i), targetItem);
					}
				} catch (JSONException x) {
					throw new TransformException(x);
				}
			}
		}
	'''
}