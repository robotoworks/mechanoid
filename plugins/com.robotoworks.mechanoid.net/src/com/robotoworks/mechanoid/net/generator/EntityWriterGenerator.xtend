package com.robotoworks.mechanoid.net.generator

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.google.inject.Inject

class EntityWriterGenerator {
	@Inject ImportHelper imports
	@Inject JsonWriterStatementGenerator jsonWriterGenerator
	
	
	def generate(ComplexTypeDeclaration decl, Model model) {
		jsonWriterGenerator.imports = imports
		jsonWriterGenerator.setWriterIdentifier("writer")
		jsonWriterGenerator.setSubjectIdentifier("entity")
		jsonWriterGenerator.setProviderIdentifier("getProvider()")
		doGenerate(decl, model)
	}
	
	def doGenerate(ComplexTypeDeclaration decl, Model model) '''
	package «model.packageName»;
	
	«var classDecl = generateOutputTransformerGeneratorClass(decl, model)»
	import com.robotoworks.mechanoid.net.JsonEntityWriter;
	import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
	import java.io.IOException;
	import com.robotoworks.mechanoid.internal.util.JsonWriter;
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«imports.addImport("java.util.List")»

		public class «decl.name»Writer extends JsonEntityWriter<«decl.name»> {

			public «decl.name»Writer(JsonEntityWriterProvider provider) {
				super(provider);
			}
			
			public void write(JsonWriter writer, «decl.name» entity) throws IOException {
				«jsonWriterGenerator.genWriteComplexType(decl)»
			}
			
			public void writeList(JsonWriter writer, List<«decl.name»> entities) throws IOException {
				writer.beginArray();
				
				for(«decl.name» item:entities) {
					write(writer, item);
				}
				
				writer.endArray();
			}
		}
	'''
}