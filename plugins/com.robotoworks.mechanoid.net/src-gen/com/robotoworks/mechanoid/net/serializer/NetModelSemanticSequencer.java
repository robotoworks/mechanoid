package com.robotoworks.mechanoid.net.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.net.netModel.BodyBlock;
import com.robotoworks.mechanoid.net.netModel.BooleanType;
import com.robotoworks.mechanoid.net.netModel.Client;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.DoubleType;
import com.robotoworks.mechanoid.net.netModel.EnumMember;
import com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration;
import com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral;
import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.Header;
import com.robotoworks.mechanoid.net.netModel.HeaderBlock;
import com.robotoworks.mechanoid.net.netModel.HttpDelete;
import com.robotoworks.mechanoid.net.netModel.HttpGet;
import com.robotoworks.mechanoid.net.netModel.HttpPost;
import com.robotoworks.mechanoid.net.netModel.HttpPut;
import com.robotoworks.mechanoid.net.netModel.IntegerType;
import com.robotoworks.mechanoid.net.netModel.LongType;
import com.robotoworks.mechanoid.net.netModel.Model;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.ResponseBlock;
import com.robotoworks.mechanoid.net.netModel.SimpleMember;
import com.robotoworks.mechanoid.net.netModel.SkipMember;
import com.robotoworks.mechanoid.net.netModel.StringType;
import com.robotoworks.mechanoid.net.netModel.TypedMember;
import com.robotoworks.mechanoid.net.netModel.UserType;
import com.robotoworks.mechanoid.net.services.NetModelGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class NetModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NetModelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == NetModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NetModelPackage.BODY_BLOCK:
				if(context == grammarAccess.getBodyBlockRule()) {
					sequence_BodyBlock(context, (BodyBlock) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getBooleanTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BooleanType(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.CLIENT:
				if(context == grammarAccess.getClientRule() ||
				   context == grammarAccess.getDeclarationRule()) {
					sequence_Client(context, (Client) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.COMPLEX_TYPE_DECLARATION:
				if(context == grammarAccess.getComplexTypeDeclarationRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getUserTypeDeclarationRule()) {
					sequence_ComplexTypeDeclaration(context, (ComplexTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.COMPLEX_TYPE_LITERAL:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getComplexTypeLiteralRule()) {
					sequence_ComplexTypeLiteral(context, (ComplexTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.DOUBLE_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getDoubleTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getNumericTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DoubleType(context, (DoubleType) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.ENUM_MEMBER:
				if(context == grammarAccess.getEnumMemberRule()) {
					sequence_EnumMember(context, (EnumMember) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.ENUM_TYPE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getEnumTypeDeclarationRule() ||
				   context == grammarAccess.getUserTypeDeclarationRule()) {
					sequence_EnumTypeDeclaration(context, (EnumTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.ENUM_TYPE_LITERAL:
				if(context == grammarAccess.getEnumTypeLiteralRule()) {
					sequence_EnumTypeLiteral(context, (EnumTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.GENERIC_LIST_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getGenericListTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_GenericListType(context, (GenericListType) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.HEADER_BLOCK:
				if(context == grammarAccess.getHeaderBlockRule()) {
					sequence_HeaderBlock(context, (HeaderBlock) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.HTTP_DELETE:
				if(context == grammarAccess.getHttpDeleteRule() ||
				   context == grammarAccess.getHttpMethodRule()) {
					sequence_HttpDelete(context, (HttpDelete) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.HTTP_GET:
				if(context == grammarAccess.getHttpGetRule() ||
				   context == grammarAccess.getHttpMethodRule()) {
					sequence_HttpGet(context, (HttpGet) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.HTTP_POST:
				if(context == grammarAccess.getHttpMethodRule() ||
				   context == grammarAccess.getHttpPostRule()) {
					sequence_HttpPost(context, (HttpPost) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.HTTP_PUT:
				if(context == grammarAccess.getHttpMethodRule() ||
				   context == grammarAccess.getHttpPutRule()) {
					sequence_HttpPut(context, (HttpPut) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.INTEGER_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getIntegerTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getNumericTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_IntegerType(context, (IntegerType) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.LONG_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getLongTypeRule() ||
				   context == grammarAccess.getNumericTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_LongType(context, (LongType) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.PARAMS_BLOCK:
				if(context == grammarAccess.getParamsBlockRule()) {
					sequence_ParamsBlock(context, (ParamsBlock) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.RESPONSE_BLOCK:
				if(context == grammarAccess.getResponseBlockRule()) {
					sequence_ResponseBlock(context, (ResponseBlock) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.SIMPLE_MEMBER:
				if(context == grammarAccess.getSimpleMemberRule()) {
					sequence_SimpleMember(context, (SimpleMember) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.SKIP_MEMBER:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getSkipMemberRule()) {
					sequence_SkipMember(context, (SkipMember) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.STRING_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StringType(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.TYPED_MEMBER:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedMemberRule()) {
					sequence_TypedMember(context, (TypedMember) semanticObject); 
					return; 
				}
				else break;
			case NetModelPackage.USER_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUserTypeRule()) {
					sequence_UserType(context, (UserType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     type=BlockType
	 */
	protected void sequence_BodyBlock(EObject context, BodyBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.BODY_BLOCK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.BODY_BLOCK__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id='boolean'
	 */
	protected void sequence_BooleanType(EObject context, BooleanType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID baseUrl=STRING? headers=HeaderBlock? params=ParamsBlock? methods+=HttpMethod*)
	 */
	protected void sequence_Client(EObject context, Client semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='entity' gen?='generate'? name=ID literal=ComplexTypeLiteral?)
	 */
	protected void sequence_ComplexTypeDeclaration(EObject context, ComplexTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=Member members+=Member*)
	 */
	protected void sequence_ComplexTypeLiteral(EObject context, ComplexTypeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id='double'
	 */
	protected void sequence_DoubleType(EObject context, DoubleType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (assignment?='=' value=INT)?)
	 */
	protected void sequence_EnumMember(EObject context, EnumMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='enum' gen?='generate'? name=ID superType=IntegerType? literal=EnumTypeLiteral?)
	 */
	protected void sequence_EnumTypeDeclaration(EObject context, EnumTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=EnumMember members+=EnumMember*)
	 */
	protected void sequence_EnumTypeLiteral(EObject context, EnumTypeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elementType=UserType | elementType=IntrinsicType) id='[]')
	 */
	protected void sequence_GenericListType(EObject context, GenericListType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (headers+=Header headers+=Header*)
	 */
	protected void sequence_HeaderBlock(EObject context, HeaderBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING)
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.HEADER__NAME));
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.HEADER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.HEADER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID path=STRING? headers=HeaderBlock? params=ParamsBlock? response=ResponseBlock?)
	 */
	protected void sequence_HttpDelete(EObject context, HttpDelete semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID path=STRING? headers=HeaderBlock? params=ParamsBlock? response=ResponseBlock?)
	 */
	protected void sequence_HttpGet(EObject context, HttpGet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         path=STRING? 
	 *         headers=HeaderBlock? 
	 *         params=ParamsBlock? 
	 *         body=BodyBlock? 
	 *         response=ResponseBlock?
	 *     )
	 */
	protected void sequence_HttpPost(EObject context, HttpPost semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         path=STRING? 
	 *         headers=HeaderBlock? 
	 *         params=ParamsBlock? 
	 *         body=BodyBlock? 
	 *         response=ResponseBlock?
	 *     )
	 */
	protected void sequence_HttpPut(EObject context, HttpPut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id='int'
	 */
	protected void sequence_IntegerType(EObject context, IntegerType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id='long'
	 */
	protected void sequence_LongType(EObject context, LongType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLongTypeAccess().getIdLongKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=FQN declarations+=Declaration*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=SimpleMember* params+=SimpleMember*)
	 */
	protected void sequence_ParamsBlock(EObject context, ParamsBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (superType=[ComplexTypeDeclaration|ID]? type=BlockType?)
	 */
	protected void sequence_ResponseBlock(EObject context, ResponseBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) type=IntrinsicType)
	 */
	protected void sequence_SimpleMember(EObject context, SimpleMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) literal=ComplexTypeLiteral)
	 */
	protected void sequence_SkipMember(EObject context, SkipMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id='String'
	 */
	protected void sequence_StringType(EObject context, StringType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringTypeAccess().getIdStringKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) type=Type)
	 */
	protected void sequence_TypedMember(EObject context, TypedMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     declaration=[UserTypeDeclaration|ID]
	 */
	protected void sequence_UserType(EObject context, UserType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetModelPackage.Literals.USER_TYPE__DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetModelPackage.Literals.USER_TYPE__DECLARATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1(), semanticObject.getDeclaration());
		feeder.finish();
	}
}
