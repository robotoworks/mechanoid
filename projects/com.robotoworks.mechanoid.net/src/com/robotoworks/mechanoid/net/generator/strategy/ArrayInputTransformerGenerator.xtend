package com.robotoworks.mechanoid.net.generator.strategy

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

class ArrayInputTransformerGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}	
	
	def registerImports()''''''
	
	def generate(ComplexTypeDeclaration decl, Model module) '''
	package «module.packageName»;
	
	«var body = generateArrayInputTransformerGeneratorClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;	
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateArrayInputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«context.registerImport("org.json.JSONArray")»
		«context.registerImport("org.json.JSONException")»
		public class «decl.name»ArrayInputTransformer extends Transformer<JSONArray, «decl.name»[]> {
			public void transform(JSONArray source, «decl.name»[] target) throws TransformException {
				try {
					«decl.name»InputTransformer itemTransformer = provider.get(«decl.name»InputTransformer.class);
					for(int i=0; i < source.length(); i++) {
						target[i] = new «decl.name»();
						itemTransformer.transform(source.getJSONObject(i), target[i]);
					}
				} catch (JSONException x) {
					throw new TransformException(x);
				}
			}
		}
	'''
}