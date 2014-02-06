package com.robotoworks.mechanoid.net.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration

class EntityReaderProviderGenerator {
	@Inject ImportHelper imports
	
	def generate(Client client, Model model) '''
	package «model.packageName»;
	
	import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
	import com.robotoworks.mechanoid.net.JsonEntityReader;
	import java.util.HashMap;
	«var classDecl = generateType(client, model)»
	«imports.printAndClear»
	
	«classDecl»
	'''
	
	def generateType(Client client, Model model) '''
	public class Default«client.name»ReaderProvider implements JsonEntityReaderProvider {

		private HashMap<Class<?>, JsonEntityReader<?>> mMap = new HashMap<Class<?>, JsonEntityReader<?>>();
		
		public Default«client.name»ReaderProvider(){
			registerReaders(mMap);
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public <T, R extends JsonEntityReader<T>> R get(Class<T> entityType) {
			return (R) mMap.get(entityType);
		}
		
		protected void registerReaders(HashMap<Class<?>, JsonEntityReader<?>> map) {
			«FOR entity:model.declarations.filter(typeof(ComplexTypeDeclaration))»
			map.put(«entity.name».class, new «entity.name»Reader(this));
			«ENDFOR»
		}
	}
	'''
}