package com.robotoworks.mechanoid.net.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.collect.Lists;
import com.robotoworks.mechanoid.common.internal.util.Inflector;
import com.robotoworks.mechanoid.net.netModel.ArrayType;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.BooleanType;
import com.robotoworks.mechanoid.net.netModel.EnumMember;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.HttpDelete;
import com.robotoworks.mechanoid.net.netModel.HttpGet;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.HttpPost;
import com.robotoworks.mechanoid.net.netModel.HttpPut;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Member;
import com.robotoworks.mechanoid.net.netModel.StringNamedMember;
import com.robotoworks.mechanoid.net.netModel.StringNamedSimpleMember;
import com.robotoworks.mechanoid.net.netModel.Type;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;

public class ModelExtensions {
	private static final Set<String> reservedWords = new HashSet<String>();
	
	static {
		reservedWords.add("source");
		reservedWords.add("target");
		reservedWords.add("abstract");
		reservedWords.add("continue");
		reservedWords.add("for");
		reservedWords.add("new");
		reservedWords.add("switch");
		reservedWords.add("assert");
		reservedWords.add("default");
		reservedWords.add("goto");
		reservedWords.add("package");
		reservedWords.add("synchronized");
		reservedWords.add("boolean");
		reservedWords.add("do");
		reservedWords.add("if");
		reservedWords.add("private");
		reservedWords.add("this");
		reservedWords.add("break");
		reservedWords.add("double");
		reservedWords.add("implements");
		reservedWords.add("protected");
		reservedWords.add("throw");
		reservedWords.add("byte");
		reservedWords.add("else");
		reservedWords.add("import");
		reservedWords.add("public");
		reservedWords.add("throws");
		reservedWords.add("case");
		reservedWords.add("enum");
		reservedWords.add("instanceof");
		reservedWords.add("return");
		reservedWords.add("transient");
		reservedWords.add("catch");
		reservedWords.add("extends");
		reservedWords.add("int");
		reservedWords.add("short");
		reservedWords.add("try");
		reservedWords.add("char");
		reservedWords.add("final");
		reservedWords.add("interface");
		reservedWords.add("static");
		reservedWords.add("void");
		reservedWords.add("class");
		reservedWords.add("finally");
		reservedWords.add("long");
		reservedWords.add("strictfp");
		reservedWords.add("volatile");
		reservedWords.add("const");
		reservedWords.add("float");
		reservedWords.add("native");
		reservedWords.add("super");
		reservedWords.add("while");
	}
	
	public static String resolveFileName(String packageName, String name) {
		return packageName.replace(".", "/") + "/" + pascalize(name) + ".java";
	}  
	
	public static String signature(Type type){
		if(type instanceof IntrinsicType){
			return ((IntrinsicType) type).getId();
		} else if(type instanceof UserType) {
			return ((UserType) type).getDeclaration().getName();
		} else if(type instanceof ArrayType){
			ArrayType arrayType = (ArrayType) type;
			if(arrayType.getElementType() instanceof UserType){
				return ((UserType) arrayType.getElementType()).getDeclaration().getName() + "[]";
			} else {
				return ((IntrinsicType) arrayType.getElementType()).getId() + "[]";				
			}
		} else if(type instanceof GenericListType){
			GenericListType genType = (GenericListType) type;
			if(genType.getGenericType() instanceof UserType){
				return "List<" + ((UserType)genType.getGenericType()).getDeclaration().getName() + ">";				
			} else {
				return "List<" + ((IntrinsicType)genType.getGenericType()).getId() + ">";							
			}
		}
		
		return "[unsupported]";
	}
	
	public static String innerSignature(Type type){
		if(type instanceof IntrinsicType){
			return ((IntrinsicType) type).getId();
		} else if(type instanceof UserType) {
			return ((UserType) type).getDeclaration().getName();
		} else if(type instanceof ArrayType){
			ArrayType arrayType = (ArrayType) type;
			if(arrayType.getElementType() instanceof UserType){
				return ((UserType) arrayType.getElementType()).getDeclaration().getName();
			} else {
				return ((IntrinsicType) arrayType.getElementType()).getId();				
			}
		} else if(type instanceof GenericListType){
			GenericListType genType = (GenericListType) type;
			if(genType.getGenericType() instanceof UserType){
				return ((UserType)genType.getGenericType()).getDeclaration().getName();				
			} else {
				return ((IntrinsicType)genType.getGenericType()).getId();							
			}
		}
		
		return "[unsupported]";
	}
	
	public static String toJSONPropertyGetMethod(IntrinsicType type){
			return "get" + pascalize(type.getId());
	}
	
	public static String toJSONOptPropertyGetMethod(IntrinsicType type){
		return "opt" + pascalize(type.getId());
	}
	
	public static boolean hasBody(HttpMethod method){
		if(method instanceof HttpPut){
			return ((HttpPut) method).getBody() == null ? false : true;
		} else if(method instanceof HttpPost){
			return ((HttpPost) method).getBody() == null ? false : true;
		} else if(method instanceof HttpGet){
			return false;			
		} else if(method instanceof HttpDelete){
			return false;						
		} else {
			return false;
		}
	}
	
	public static BodyBlock getBody(HttpMethod method){
		if(method instanceof HttpPut){
			return ((HttpPut)method).getBody();
		} else if(method instanceof HttpPost){
			return ((HttpPost)method).getBody();
		}
		
		return null;
	}
	
	public static String generateEnumMembers(EnumTypeDeclaration decl){
		Set<Integer> set = new HashSet<Integer>();
		EList<EnumMember> members = decl.getLiteral().getMembers();
		StringBuilder builder = new StringBuilder();

		boolean someAssigned = false;
		
		int numAssigned = 0;
		for(EnumMember member : members){
			if(member.isAssignment()){
				someAssigned = true;
				numAssigned++;
			}
						
			set.add(member.getValue());
		}	
		
		if(someAssigned){
			// First one is assigned
			if(numAssigned == 1 && members.get(0).isAssignment()){
				int idx = members.get(0).getValue();
				
				for(int i=0; i < members.size(); i++){
					builder.append(underscore(members.get(i).getName()).toUpperCase());
					builder.append("(").append(idx++).append(")");
					if(i < members.size() - 1){
						builder.append(", \n");
					}
				}
				
				return builder.toString();
			}
			else if(set.size() == members.size()){
				for(int i=0; i < members.size(); i++){
					builder.append(underscore(members.get(i).getName()).toUpperCase());
					builder.append("(").append(members.get(i).getValue()).append(")");
					if(i < members.size() - 1){
						builder.append(", \n");
					}
				}
				
				return builder.toString();
			} else {
				for(int i=0; i < members.size(); i++){
					builder.append(underscore(members.get(i).getName()).toUpperCase());
					builder.append("(").append(i).append(")");
					if(i < members.size() - 1){
						builder.append(", \n");
					}
				}
				
				return builder.toString();
			}
		} else {
			for(int i=0; i < members.size(); i++){
				builder.append(underscore(members.get(i).getName()).toUpperCase());
				builder.append("(").append(i).append(")");
				if(i < members.size() - 1){
					builder.append(", \n");
				}
			}
			
			return builder.toString();
		}
	}
	
	public static String resolveGetJSONValueMethodName(EnumTypeDeclaration decl){
		if(decl.getSuperType() != null){
			return "optInt";
		} else {
			return "optString";
		}
	}
	
	public static String pascalize(String value){
		return Inflector.getInstance().camelize(value, false);
	}
	
	public static String camelize(String value){
		return Inflector.getInstance().camelize(value, true);
	}
	
	public static String pluralize(String value){
		return Inflector.getInstance().pluralize(value);
	}
	
	public static String underscore(String value){
		// already underscored
		if(value.matches("[A-Z_]+")){
			return value;
		}
		return Inflector.getInstance().underscore(value);
	}
	
	/**
	 * Adds an _ to the start if the string is a reserved word
	 * @param value
	 * @return
	 */
	public static String escapeReserved(String value){
		// Reserved
		if(reservedWords.contains(value)){
			return "_" + value;
		} else {
			return value;
		}
	}
	
	public static String toIdentifierOrGetMethodName(Member member, boolean asGetMethod){
		if(asGetMethod){
			return toGetMethodName(member);
		} else {
			return toIdentifier(member, null);
		}
	}
	
	public static String toIdentifier(Member member){
		return toIdentifier(member, null);
	}
	
	public static String maybeMethodize(String identifier, boolean methodize){
		if(methodize){
			return identifier + "()";
		} else {
			return identifier;
		}
	}
	
	public static String toGetMethodName(Member member){
		if(!(member instanceof TypedMember)) {
			return null;
		}
		
		TypedMember typedMember = (TypedMember) member;
		if(typedMember.getType() instanceof BooleanType){	
			if(member.getName().toLowerCase().startsWith("is")){
				return toIdentifier(member, "get");
			} else {
				return toIdentifier(member, "is");
			}
		} else {
			return toIdentifier(member, "get");
		}
	}
	
	public static String toSetMethodName(Member member){
		return toIdentifier(member, "set");
	}
	
	public static String ifTrue(boolean option, String str){
		return option ? str : "";
	}
	
	/**
	 * Takes a string (identifier) and prefixes it with ownerName seperated by a .
	 * ie:- given the identifier getQux, and an ownerName of this, the result would be this.getQux,
	 * by setting the methodize flag to true, it will append () on the end, ie:- this.getQux()
	 * @param identifier The identifier to memberize
	 * @param ownerName The owner of the member
	 * @param methodize Adds () on the end of the result
	 * @return
	 */
	public static String memberize(String identifier, String ownerName, boolean methodize){
		if(ownerName == null || ownerName.length() == 0){
			return identifier + (methodize ? "()" : "");
		} else {
			return ownerName + "." + identifier + (methodize ? "()" : "");
		}
	}
	
	public static String memberize(String identifier, String ownerName){
		return memberize(identifier, ownerName, false);
	}
	
	public static String toIdentifier(Member member, String prefix){
		String name = member.getName();
		if(member instanceof StringNamedMember || member instanceof StringNamedSimpleMember) {
			StringBuffer result = new StringBuffer(name.length());
			for(int i=0; i < name.length(); i++){
				char ch = name.charAt(i);
				if(Character.isWhitespace(ch)){
					result.append('_');
				}
				else if(Character.isJavaIdentifierPart(ch)){
					result.append(ch);
				}
			}
			
			name = result.toString();

		}
		
		if(prefix != null){
			return prefix + pascalize(name);
		} else {
			return escapeReserved(camelize(name));				
		}
	}
	
	public static String toReference(String name, boolean getter, String prefix){
		if(getter){
			return prefix == null ? "get" + pascalize(name) : prefix + ".get" + pascalize(name) + "()";
		} else {
			return prefix == null ? camelize(name) : prefix + "." + camelize(name);
		}
	}
	
	public static String getPathAsFormatString(HttpMethod method){
		if(method.getPath() == null) {
			return "";
		}
		
		return method.getPath().replaceAll(":[^/]+", "%s");
	}	
	
	public static Iterable<String> getArgsFromPath(HttpMethod method) {
		return getArgsFromPath(method.getPath());
	}
	
	public static Iterable<String> getArgsFromPath(String path) {
		if(path == null) {
			return new ArrayList<String>();
		}

		return IterableExtensions.filter(Lists.newArrayList(path.split("/")), new Function1<String, Boolean>(){public Boolean apply(String p) {
			return p.startsWith(":");
		}});
	}
}
