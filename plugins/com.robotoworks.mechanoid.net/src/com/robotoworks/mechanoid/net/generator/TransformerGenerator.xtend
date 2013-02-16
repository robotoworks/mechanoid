package com.robotoworks.mechanoid.net.generator

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.google.inject.Inject

class TransformerGenerator {
	@Inject ImportHelper imports
	@Inject JsonWriterGenerator jsonWriterGenerator
	@Inject JsonReaderGenerator jsonReaderGenerator
	
	
	def generate(ComplexTypeDeclaration decl, Model model) {
		jsonReaderGenerator.imports = imports
		jsonWriterGenerator.imports = imports
		
		doGenerate(decl, model)
	}
	
	def doGenerate(ComplexTypeDeclaration decl, Model model) '''
	package «model.packageName»;
	
	«var classDecl = generateOutputTransformerGeneratorClass(decl, model)»
	import com.robotoworks.mechanoid.net.Transformer;
	import com.robotoworks.mechanoid.net.TransformException;
	import com.robotoworks.mechanoid.internal.util.JsonWriter;
	import com.robotoworks.mechanoid.internal.util.JsonReader;
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«imports.addImport("java.util.List")»

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