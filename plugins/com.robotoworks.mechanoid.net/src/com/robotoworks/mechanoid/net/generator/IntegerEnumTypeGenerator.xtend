package com.robotoworks.mechanoid.net.generator

import static extension com.robotoworks.mechanoid.net.generator.ModelExtensions.*
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
import com.robotoworks.mechanoid.net.netModel.Model

class IntegerEnumTypeGenerator {
	def generate(EnumTypeDeclaration type, Model module) '''
	package «module.packageName»;
		
	public enum «type.name» {
		«type.generateEnumMembers()»;
		
		private int value;
		
		public int getValue() {
			return value;
		}
		
		«type.name»(int value){
			this.value = value;
		}
		
		public static «type.name» fromValue(int value) {
			
			for («type.name» member : «type.name».values()) {
				if (value == member.value) {
					return member;
				}
			}
			
			throw new RuntimeException("No constant with value " + value + " found");
		}
	}
	'''	
}