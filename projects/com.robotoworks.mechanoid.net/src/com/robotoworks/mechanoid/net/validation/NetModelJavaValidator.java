package com.robotoworks.mechanoid.net.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.xml.type.internal.RegEx;
import org.eclipse.emf.ecore.xml.type.internal.RegEx.RegularExpression;
import org.eclipse.xtext.validation.Check;

import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.EnumMember;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.ResponseBlock;
 

public class NetModelJavaValidator extends AbstractNetModelJavaValidator {

	private RegularExpression pathPattern = RegEx.REUtil.createRegex("^(\\/)?(?:[^/]+)?(?:(?:\\/(?:[^/]+)?)+)?$", "");
	
	@Check
	public void ensureValidMethodPath(HttpMethod method){
		if(method.getPath() == null || method.getPath().length() == 0) {
			return;
		}
		if(!pathPattern.matches(method.getPath())){
			error("Invalid path format", NetModelPackage.Literals.HTTP_METHOD__PATH);
		}
	}
		
	@Check
	public void responseSuperValidIfResponseIsLiteral(ResponseBlock response){
		if(response.getSuperType() != null && response.getType() != null && !(response.getType() instanceof ComplexTypeLiteral)){
			error("Response must be a literal in order to do this", NetModelPackage.Literals.RESPONSE_BLOCK__SUPER_TYPE);			
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
