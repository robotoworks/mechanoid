package com.robotoworks.mechanoid.net.generator

import com.google.inject.Inject
import com.robotoworks.mechanoid.net.netModel.Client
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration

class EntityWriterProviderGenerator {
	@Inject ImportHelper imports
	
	def generate(Client client, Model model) '''
	package «model.packageName»;
	
	import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
	import com.robotoworks.mechanoid.net.JsonEntityWriter;
	import java.util.HashMap;
	«var classDecl = generateType(client, model)»
	«imports.printAndClear»
	
	«classDecl»
	'''
	
	def generateType(Client client, Model model) '''
	public class Default«client.name»WriterProvider implements JsonEntityWriterProvider {

		private HashMap<Class<?>, JsonEntityWriter<?>> mMap = new HashMap<Class<?>, JsonEntityWriter<?>>();
		
		public Default«client.name»WriterProvider(){
			registerWriters(mMap);
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public <T, R extends JsonEntityWriter<T>> R get(Class<T> entityType) {
			return (R) mMap.get(entityType);
		}
		
		protected void registerWriters(HashMap<Class<?>, JsonEntityWriter<?>> map) {
			«FOR entity:model.declarations.filter(typeof(ComplexTypeDeclaration))»
			map.put(«entity.name».class, new «entity.name»Writer(this));
			«ENDFOR»
		}
	}
	'''
}