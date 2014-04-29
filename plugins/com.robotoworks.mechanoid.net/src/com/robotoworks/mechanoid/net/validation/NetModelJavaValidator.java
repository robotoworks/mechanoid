package com.robotoworks.mechanoid.net.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.xml.type.internal.RegEx;
import org.eclipse.emf.ecore.xml.type.internal.RegEx.RegularExpression;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Inject;
import com.robotoworks.mechanoid.MechanoidPlugin;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.BooleanLiteral;
import com.robotoworks.mechanoid.net.netModel.BooleanType;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumMember;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.HeaderBlock;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.HttpMethodType;
import com.robotoworks.mechanoid.net.netModel.IntrinsicType;
import com.robotoworks.mechanoid.net.netModel.Literal;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.NumericLiteral;
import com.robotoworks.mechanoid.net.netModel.NumericType;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.ResponseBlock;
import com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment;
import com.robotoworks.mechanoid.net.netModel.StringLiteral;
import com.robotoworks.mechanoid.net.netModel.StringType;
import com.robotoworks.mechanoid.validation.MechanoidIssueCodes;
import com.robotoworks.mechanoid.validation.MechanoidLibClasspathValidationHelper;
 

public class NetModelJavaValidator extends AbstractNetModelJavaValidator {

	@Inject TypeReferences typeReferences;
	@Inject MechanoidLibClasspathValidationHelper libValidationHelper;
	
	@Check
	public void checkMechanoidLibOnClasspath(Model m) {
       if(libValidationHelper.shouldValidateMechanoidLibOnClassPath(m)) {
        	JvmType type = typeReferences.findDeclaredType(MechanoidPlugin.MECHANOID_LIB_CLASS, m);
        
        	if(type == null) {
        		error("mechanoid.jar is required in your /libs folder or on the classpath", NetModelPackage.Literals.MODEL__PACKAGE_NAME, MechanoidIssueCodes.MISSING_MECHANOID_LIBS);
        	}
       }
	}
	
	@Check
	public void checkValueAssignment(SimpleMemberAssignment assignment){
		IntrinsicType type = assignment.getMember().getType();
		Literal defaultValue = assignment.getDefaultValue();
		
		if(defaultValue == null) {
			return;
		}
		
		if(type instanceof StringType) {
			
			if(!(defaultValue instanceof StringLiteral)) {
				error("Type mismatch", 
						NetModelPackage.Literals.SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE
						);
			}
		} else if(type instanceof BooleanType) {
			if(!(defaultValue instanceof BooleanLiteral)) {
				error("Type mismatch", 
						NetModelPackage.Literals.SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE
						);
			}			
		// TODO Check each numeric type (double, integer, long, etc)
		} else if(type instanceof NumericType) {
			if(!(defaultValue instanceof NumericLiteral)) {
				error("Type mismatch", 
						NetModelPackage.Literals.SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE
						);
			}			
		}
	}
	
	@Check
	public void checkBodyIsValid(HttpMethod method){
		Iterable<BodyBlock> bodyBlocks = IterableExtensions.filter(method.getBlocks(), BodyBlock.class);
		int numBodyBlocks = IterableExtensions.size(bodyBlocks);
		HttpMethodType methodType = method.getType();
		
		if(methodType == HttpMethodType.POST || methodType == HttpMethodType.PUT) {
			if(numBodyBlocks > 1) {
				BodyBlock lastBlock = IterableExtensions.last(bodyBlocks);
				error("Body block already defined", 
						method,
						NetModelPackage.Literals.HTTP_METHOD__BLOCKS, 
						method.getBlocks().indexOf(lastBlock));
			}
			
			return;
		}
		
		if(numBodyBlocks > 0) {
			BodyBlock lastBlock = IterableExtensions.last(bodyBlocks);
			error("body not valid for " + methodType.getLiteral() + " methods", 
					method, 
					NetModelPackage.Literals.HTTP_METHOD__BLOCKS, 
					method.getBlocks().indexOf(lastBlock));
		}
	}
	
	@Check
	public void checkBlockCardinality(HttpMethod method){
		checkBlockCardinality(method, ParamsBlock.class, "params", 0, 1);
		checkBlockCardinality(method, ResponseBlock.class, "response", 0, 1);
		checkBlockCardinality(method, HeaderBlock.class, "headers", 0, 1);
	}
	
	@Check
	public void checkBlockCardinality(Client client){
		checkBlockCardinality(client, ParamsBlock.class, "params", 0, 1);
		checkBlockCardinality(client, HeaderBlock.class, "headers", 0, 1);
	}
	
	private <T> void checkBlockCardinality(HttpMethod method, Class<T> blockClazz, String blockType, int min, int max) {
		Iterable<T> blocks = IterableExtensions.filter(method.getBlocks(), blockClazz);
		int numBlocks = IterableExtensions.size(blocks);
		
		if(numBlocks  < min || numBlocks  > max) {
			T lastBlock = IterableExtensions.last(blocks);
			error(blockType + " already defined", 
					method,
					NetModelPackage.Literals.HTTP_METHOD__BLOCKS, 
					method.getBlocks().indexOf(lastBlock));
		}
	}
	
	private <T> void checkBlockCardinality(Client client, Class<T> blockClazz, String blockType, int min, int max) {
		Iterable<T> blocks = IterableExtensions.filter(client.getBlocks(), blockClazz);
		int numBlocks = IterableExtensions.size(blocks);
		
		if(numBlocks < min || numBlocks > max) {
			T lastBlock = IterableExtensions.last(blocks);
			error(blockType + " already defined", 
					client,
					NetModelPackage.Literals.CLIENT__BLOCKS, 
					client.getBlocks().indexOf(lastBlock));
		}
	}
		
	@Check
	public void responseSuperValidIfResponseIsLiteral(ResponseBlock response){
		if(response.getSuperType() != null && response.getType() != null && !(response.getType() instanceof ComplexTypeLiteral)){
			error("Response must be a literal object in order to do this", NetModelPackage.Literals.RESPONSE_BLOCK__SUPER_TYPE);			
		}
	}
	
	@Check
	public void enumMembersAssignNumericValuesOnlyIfEnumExtendsInteger(EnumMember member){
		EnumTypeDeclaration decl = (EnumTypeDeclaration) member.eContainer().eContainer();
		if(member.isAssignment() && decl.getSuperType() == null){
			error("Members can only be assigned values of the enum extends Integer", NetModelPackage.Literals.ENUM_MEMBER__VALUE);
		}
	}
	
	@Check
	public void allEnumMembersAssignUniqueNumericValuesIfEnumExtendsInteger(EnumTypeDeclaration decl){
		Set<Integer> set = new HashSet<Integer>();
		
		boolean someAssigned = false;
		int numAssigned = 0;
		for(EnumMember member : decl.getLiteral().getMembers()){
			if(member.isAssignment()){
				someAssigned = true;
				numAssigned++;
			}
						
			set.add(member.getValue());
		}	
		
		if(someAssigned){
			// First one is assigned
			if(numAssigned == 1 && decl.getLiteral().getMembers().get(0).isAssignment()){
				return;
			}
			// Only some are assigned, this is an error
			else if(numAssigned != decl.getLiteral().getMembers().size()){
				error("One value, all values or no values should be assigned", NetModelPackage.Literals.ENUM_TYPE_DECLARATION__LITERAL);
				return;
			} 
			
			if(set.size() != decl.getLiteral().getMembers().size()){
				error("Duplicate values are not allowed", NetModelPackage.Literals.ENUM_TYPE_DECLARATION__LITERAL);
			}
		}	
	}

}
