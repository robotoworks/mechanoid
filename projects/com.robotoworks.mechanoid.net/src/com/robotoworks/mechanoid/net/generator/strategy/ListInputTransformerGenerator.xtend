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

	«var body = generateClass(decl, module)»
	«registerImports»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.internal.util.JsonReader;
	import java.util.List;
	«context.printImports»
	«context.clearImports»
	
	«body»
	'''
	
	def generateClass(ComplexTypeDeclaration decl, Model module) '''
		public class «decl.name»ListInputTransformer extends Transformer<JsonReader, List<«decl.name»>> {
			public void transform(JsonReader source, List<«decl.name»> target) throws TransformException {
				
				try {
					«decl.name»InputTransformer itemTransformer = provider.get(«decl.name»InputTransformer.class);
					
					source.beginArray();
					
					while(source.hasNext()) {
						«decl.name» targetItem = new «decl.name»();
						itemTransformer.transform(source, targetItem);
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