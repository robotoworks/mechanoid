package com.robotoworks.mechanoid.net.generator

import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model
import com.google.inject.Inject

class EntityReaderGenerator {
	@Inject ImportHelper imports
	@Inject JsonReaderStatementGenerator jsonReaderGenerator
	
	
	def generate(ComplexTypeDeclaration decl, Model model) {
		jsonReaderGenerator.imports = imports
		jsonReaderGenerator.setReaderIdentifier("reader")
		jsonReaderGenerator.setSubjectIdentifier("entity")
		jsonReaderGenerator.setProviderIdentifier("getProvider()")
		doGenerate(decl, model)
	}
	
	def doGenerate(ComplexTypeDeclaration decl, Model model) '''
	package «model.packageName»;
	
	«var classDecl = generateOutputTransformerGeneratorClass(decl, model)»
	import com.robotoworks.mechanoid.net.JsonEntityReader;
	import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
	import java.io.IOException;
	import com.robotoworks.mechanoid.internal.util.JsonReader;
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, Model module) '''
		«imports.addImport("java.util.List")»
		public class «decl.name»Reader extends JsonEntityReader<«decl.name»> {			
			
			public «decl.name»Reader(JsonEntityReaderProvider provider) {
				super(provider);
			}
			
			public void read(JsonReader reader, «decl.name» entity) throws IOException {
				«jsonReaderGenerator.genReadComplexType(decl)»
			}
			
			public void readList(JsonReader reader, List<«decl.name»> entities) throws IOException {
				reader.beginArray();
				
				while(reader.hasNext()) {
					«decl.name» item = new «decl.name»();
					read(reader, item);
					entities.add(item);
					
				}
				
				reader.endArray();
			}
		}
	'''
}