package com.robotoworks.mechanoid.ops.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.NotUnique;
import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage;
import com.robotoworks.mechanoid.ops.opServiceModel.Operation;
import com.robotoworks.mechanoid.ops.opServiceModel.OperationArg;
import com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock;
import com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration;
import com.robotoworks.mechanoid.ops.services.OpServiceModelGrammarAccess;
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
public class OpServiceModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OpServiceModelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == OpServiceModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OpServiceModelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case OpServiceModelPackage.NOT_UNIQUE:
				if(context == grammarAccess.getUniqueClauseRule()) {
					sequence_UniqueClause(context, (NotUnique) semanticObject); 
					return; 
				}
				else break;
			case OpServiceModelPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case OpServiceModelPackage.OPERATION_ARG:
				if(context == grammarAccess.getOperationArgRule()) {
					sequence_OperationArg(context, (OperationArg) semanticObject); 
					return; 
				}
				else break;
			case OpServiceModelPackage.SERVICE_BLOCK:
				if(context == grammarAccess.getServiceBlockRule()) {
					sequence_ServiceBlock(context, (ServiceBlock) semanticObject); 
					return; 
				}
				else break;
			case OpServiceModelPackage.UNIQUE_DECLARATION:
				if(context == grammarAccess.getUniqueClauseRule()) {
					sequence_UniqueClause(context, (UniqueDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName service=ServiceBlock)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OpServiceModelPackage.Literals.MODEL__PACKAGE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpServiceModelPackage.Literals.MODEL__PACKAGE_NAME));
			if(transientValues.isValueTransient(semanticObject, OpServiceModelPackage.Literals.MODEL__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpServiceModelPackage.Literals.MODEL__SERVICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0(), semanticObject.getPackageName());
		feeder.accept(grammarAccess.getModelAccess().getServiceServiceBlockParserRuleCall_2_0(), semanticObject.getService());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=OpArgType name=ID)
	 */
	protected void sequence_OperationArg(EObject context, OperationArg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OpServiceModelPackage.Literals.OPERATION_ARG__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpServiceModelPackage.Literals.OPERATION_ARG__TYPE));
			if(transientValues.isValueTransient(semanticObject, OpServiceModelPackage.Literals.OPERATION_ARG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpServiceModelPackage.Literals.OPERATION_ARG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperationArgAccess().getTypeOpArgTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getOperationArgAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (args+=OperationArg args+=OperationArg*)? uniqueClause=UniqueClause?)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ops+=Operation*)
	 */
	protected void sequence_ServiceBlock(EObject context, ServiceBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NotUnique}
	 */
	protected void sequence_UniqueClause(EObject context, NotUnique semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (args+=[OperationArg|ID] args+=[OperationArg|ID]*)
	 */
	protected void sequence_UniqueClause(EObject context, UniqueDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
