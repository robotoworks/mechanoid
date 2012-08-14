package com.robotoworks.mechanoid.net.generator.strategy

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.Model
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.generator.CodeGenerationContext

class StringEnumTypeGenerator {
	CodeGenerationContext context
	
	def setContext(CodeGenerationContext context){
		this.context = context;
	}
	
	def generate(EnumTypeDeclaration type, Model module) '''
	package «module.packageName»;
		
	public enum «type.name» {
		«type.literal.members.join(",\n", [member|member.name.underscore.toUpperCase + '("' + member.name + '")'])»;
		
		private String value;
		
		public String getValue() {
			return value;
		}
		
		«type.name»(String value){
			this.value = value;
		}
		
		public static «type.name» fromValue(String value) {
			if (value == null) {
				throw new IllegalArgumentException("value cannot be null");
			}
			
			for («type.name» member : «type.name».values()) {
				if (value.equalsIgnoreCase(member.value)) {
					return member;
				}
			}
			
			throw new RuntimeException("No constant with value " + value + " found");
		}
	}
	'''
}