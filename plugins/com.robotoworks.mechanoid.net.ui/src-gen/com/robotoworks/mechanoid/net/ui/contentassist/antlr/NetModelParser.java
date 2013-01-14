/*
* generated by Xtext
*/
package com.robotoworks.mechanoid.net.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.robotoworks.mechanoid.net.services.NetModelGrammarAccess;

public class NetModelParser extends AbstractContentAssistParser {
	
	@Inject
	private NetModelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.robotoworks.mechanoid.net.ui.contentassist.antlr.internal.InternalNetModelParser createParser() {
		com.robotoworks.mechanoid.net.ui.contentassist.antlr.internal.InternalNetModelParser result = new com.robotoworks.mechanoid.net.ui.contentassist.antlr.internal.InternalNetModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getClientBlockAccess().getAlternatives(), "rule__ClientBlock__Alternatives");
					put(grammarAccess.getHttpMethodBlockAccess().getAlternatives(), "rule__HttpMethodBlock__Alternatives");
					put(grammarAccess.getPathAccess().getAlternatives_2(), "rule__Path__Alternatives_2");
					put(grammarAccess.getPathAccess().getAlternatives_3_1(), "rule__Path__Alternatives_3_1");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBlockTypeAccess().getAlternatives(), "rule__BlockType__Alternatives");
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getTypedMemberAccess().getNameAlternatives_0_0(), "rule__TypedMember__NameAlternatives_0_0");
					put(grammarAccess.getSkipMemberAccess().getNameAlternatives_0_0(), "rule__SkipMember__NameAlternatives_0_0");
					put(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0(), "rule__SimpleMember__NameAlternatives_0_0");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0(), "rule__GenericListType__ElementTypeAlternatives_0_0");
					put(grammarAccess.getUserTypeDeclarationAccess().getAlternatives(), "rule__UserTypeDeclaration__Alternatives");
					put(grammarAccess.getIntrinsicTypeAccess().getAlternatives(), "rule__IntrinsicType__Alternatives");
					put(grammarAccess.getNumericTypeAccess().getAlternatives(), "rule__NumericType__Alternatives");
					put(grammarAccess.getHttpMethodTypeAccess().getAlternatives(), "rule__HttpMethodType__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getClientAccess().getGroup(), "rule__Client__Group__0");
					put(grammarAccess.getHeaderBlockAccess().getGroup(), "rule__HeaderBlock__Group__0");
					put(grammarAccess.getHeaderBlockAccess().getGroup_2(), "rule__HeaderBlock__Group_2__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getHttpMethodAccess().getGroup(), "rule__HttpMethod__Group__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_3(), "rule__Path__Group_3__0");
					put(grammarAccess.getParamsBlockAccess().getGroup(), "rule__ParamsBlock__Group__0");
					put(grammarAccess.getParamsBlockAccess().getGroup_3(), "rule__ParamsBlock__Group_3__0");
					put(grammarAccess.getSimpleMemberAssignmentAccess().getGroup(), "rule__SimpleMemberAssignment__Group__0");
					put(grammarAccess.getSimpleMemberAssignmentAccess().getGroup_1(), "rule__SimpleMemberAssignment__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getLiteralAccess().getGroup_1(), "rule__Literal__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_2(), "rule__Literal__Group_2__0");
					put(grammarAccess.getBodyBlockAccess().getGroup(), "rule__BodyBlock__Group__0");
					put(grammarAccess.getResponseBlockAccess().getGroup(), "rule__ResponseBlock__Group__0");
					put(grammarAccess.getResponseBlockAccess().getGroup_2(), "rule__ResponseBlock__Group_2__0");
					put(grammarAccess.getTypedMemberAccess().getGroup(), "rule__TypedMember__Group__0");
					put(grammarAccess.getSkipMemberAccess().getGroup(), "rule__SkipMember__Group__0");
					put(grammarAccess.getSimpleMemberAccess().getGroup(), "rule__SimpleMember__Group__0");
					put(grammarAccess.getGenericListTypeAccess().getGroup(), "rule__GenericListType__Group__0");
					put(grammarAccess.getComplexTypeDeclarationAccess().getGroup(), "rule__ComplexTypeDeclaration__Group__0");
					put(grammarAccess.getEnumTypeDeclarationAccess().getGroup(), "rule__EnumTypeDeclaration__Group__0");
					put(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3(), "rule__EnumTypeDeclaration__Group_3__0");
					put(grammarAccess.getEnumTypeLiteralAccess().getGroup(), "rule__EnumTypeLiteral__Group__0");
					put(grammarAccess.getEnumTypeLiteralAccess().getGroup_2(), "rule__EnumTypeLiteral__Group_2__0");
					put(grammarAccess.getEnumMemberAccess().getGroup(), "rule__EnumMember__Group__0");
					put(grammarAccess.getEnumMemberAccess().getGroup_1(), "rule__EnumMember__Group_1__0");
					put(grammarAccess.getComplexTypeLiteralAccess().getGroup(), "rule__ComplexTypeLiteral__Group__0");
					put(grammarAccess.getComplexTypeLiteralAccess().getGroup_2(), "rule__ComplexTypeLiteral__Group_2__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getSignedNumberAccess().getGroup(), "rule__SignedNumber__Group__0");
					put(grammarAccess.getModelAccess().getPackageNameAssignment_1(), "rule__Model__PackageNameAssignment_1");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment_2(), "rule__Model__DeclarationsAssignment_2");
					put(grammarAccess.getClientAccess().getNameAssignment_1(), "rule__Client__NameAssignment_1");
					put(grammarAccess.getClientAccess().getBaseUrlAssignment_2(), "rule__Client__BaseUrlAssignment_2");
					put(grammarAccess.getClientAccess().getBlocksAssignment_4(), "rule__Client__BlocksAssignment_4");
					put(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1(), "rule__HeaderBlock__HeadersAssignment_1");
					put(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1(), "rule__HeaderBlock__HeadersAssignment_2_1");
					put(grammarAccess.getHeaderAccess().getNameAssignment_0(), "rule__Header__NameAssignment_0");
					put(grammarAccess.getHeaderAccess().getValueAssignment_2(), "rule__Header__ValueAssignment_2");
					put(grammarAccess.getHttpMethodAccess().getTypeAssignment_0(), "rule__HttpMethod__TypeAssignment_0");
					put(grammarAccess.getHttpMethodAccess().getNameAssignment_1(), "rule__HttpMethod__NameAssignment_1");
					put(grammarAccess.getHttpMethodAccess().getPathAssignment_2(), "rule__HttpMethod__PathAssignment_2");
					put(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4(), "rule__HttpMethod__BlocksAssignment_4");
					put(grammarAccess.getPathAccess().getParamsAssignment_2_1(), "rule__Path__ParamsAssignment_2_1");
					put(grammarAccess.getPathAccess().getParamsAssignment_3_1_1(), "rule__Path__ParamsAssignment_3_1_1");
					put(grammarAccess.getParamsBlockAccess().getParamsAssignment_2(), "rule__ParamsBlock__ParamsAssignment_2");
					put(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1(), "rule__ParamsBlock__ParamsAssignment_3_1");
					put(grammarAccess.getSimpleMemberAssignmentAccess().getMemberAssignment_0(), "rule__SimpleMemberAssignment__MemberAssignment_0");
					put(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueAssignment_1_1(), "rule__SimpleMemberAssignment__DefaultValueAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1(), "rule__Literal__LiteralAssignment_0_1");
					put(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1(), "rule__Literal__LiteralAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1(), "rule__Literal__LiteralAssignment_2_1");
					put(grammarAccess.getBodyBlockAccess().getTypeAssignment_1(), "rule__BodyBlock__TypeAssignment_1");
					put(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1(), "rule__ResponseBlock__SuperTypeAssignment_2_1");
					put(grammarAccess.getResponseBlockAccess().getTypeAssignment_3(), "rule__ResponseBlock__TypeAssignment_3");
					put(grammarAccess.getTypedMemberAccess().getNameAssignment_0(), "rule__TypedMember__NameAssignment_0");
					put(grammarAccess.getTypedMemberAccess().getTypeAssignment_2(), "rule__TypedMember__TypeAssignment_2");
					put(grammarAccess.getSkipMemberAccess().getNameAssignment_0(), "rule__SkipMember__NameAssignment_0");
					put(grammarAccess.getSkipMemberAccess().getLiteralAssignment_1(), "rule__SkipMember__LiteralAssignment_1");
					put(grammarAccess.getSimpleMemberAccess().getNameAssignment_0(), "rule__SimpleMember__NameAssignment_0");
					put(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2(), "rule__SimpleMember__TypeAssignment_2");
					put(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0(), "rule__GenericListType__ElementTypeAssignment_0");
					put(grammarAccess.getGenericListTypeAccess().getIdAssignment_1(), "rule__GenericListType__IdAssignment_1");
					put(grammarAccess.getUserTypeAccess().getDeclarationAssignment(), "rule__UserType__DeclarationAssignment");
					put(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0(), "rule__ComplexTypeDeclaration__KeywordAssignment_0");
					put(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1(), "rule__ComplexTypeDeclaration__GenAssignment_1");
					put(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2(), "rule__ComplexTypeDeclaration__NameAssignment_2");
					put(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3(), "rule__ComplexTypeDeclaration__LiteralAssignment_3");
					put(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0(), "rule__EnumTypeDeclaration__KeywordAssignment_0");
					put(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1(), "rule__EnumTypeDeclaration__GenAssignment_1");
					put(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2(), "rule__EnumTypeDeclaration__NameAssignment_2");
					put(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1(), "rule__EnumTypeDeclaration__SuperTypeAssignment_3_1");
					put(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4(), "rule__EnumTypeDeclaration__LiteralAssignment_4");
					put(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1(), "rule__EnumTypeLiteral__MembersAssignment_1");
					put(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1(), "rule__EnumTypeLiteral__MembersAssignment_2_1");
					put(grammarAccess.getEnumMemberAccess().getNameAssignment_0(), "rule__EnumMember__NameAssignment_0");
					put(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0(), "rule__EnumMember__AssignmentAssignment_1_0");
					put(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1(), "rule__EnumMember__ValueAssignment_1_1");
					put(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1(), "rule__ComplexTypeLiteral__MembersAssignment_1");
					put(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1(), "rule__ComplexTypeLiteral__MembersAssignment_2_1");
					put(grammarAccess.getStringTypeAccess().getIdAssignment(), "rule__StringType__IdAssignment");
					put(grammarAccess.getBooleanTypeAccess().getIdAssignment(), "rule__BooleanType__IdAssignment");
					put(grammarAccess.getIntegerTypeAccess().getIdAssignment(), "rule__IntegerType__IdAssignment");
					put(grammarAccess.getLongTypeAccess().getIdAssignment(), "rule__LongType__IdAssignment");
					put(grammarAccess.getDoubleTypeAccess().getIdAssignment(), "rule__DoubleType__IdAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.robotoworks.mechanoid.net.ui.contentassist.antlr.internal.InternalNetModelParser typedParser = (com.robotoworks.mechanoid.net.ui.contentassist.antlr.internal.InternalNetModelParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NetModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NetModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
