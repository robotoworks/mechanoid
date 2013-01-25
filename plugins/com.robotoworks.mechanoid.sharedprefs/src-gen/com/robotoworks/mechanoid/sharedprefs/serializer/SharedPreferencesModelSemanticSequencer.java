package com.robotoworks.mechanoid.sharedprefs.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robotoworks.mechanoid.sharedprefs.services.SharedPreferencesModelGrammarAccess;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.NumericLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.StringLiteral;
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
public class SharedPreferencesModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SharedPreferencesModelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SharedPreferencesModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SharedPreferencesModelPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case SharedPreferencesModelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SharedPreferencesModelPackage.NUMERIC_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (NumericLiteral) semanticObject); 
					return; 
				}
				else break;
			case SharedPreferencesModelPackage.PREFERENCE:
				if(context == grammarAccess.getPreferenceRule()) {
					sequence_Preference(context, (Preference) semanticObject); 
					return; 
				}
				else break;
			case SharedPreferencesModelPackage.PREFERENCES_BLOCK:
				if(context == grammarAccess.getPreferencesBlockRule()) {
					sequence_PreferencesBlock(context, (PreferencesBlock) semanticObject); 
					return; 
				}
				else break;
			case SharedPreferencesModelPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     literal=BooleanValue
	 */
	protected void sequence_Literal(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SharedPreferencesModelPackage.Literals.BOOLEAN_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SharedPreferencesModelPackage.Literals.BOOLEAN_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=SignedNumber
	 */
	protected void sequence_Literal(EObject context, NumericLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SharedPreferencesModelPackage.Literals.NUMERIC_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SharedPreferencesModelPackage.Literals.NUMERIC_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=STRING
	 */
	protected void sequence_Literal(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SharedPreferencesModelPackage.Literals.STRING_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SharedPreferencesModelPackage.Literals.STRING_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=FQN preferencesBlock=PreferencesBlock)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SharedPreferencesModelPackage.Literals.MODEL__PACKAGE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SharedPreferencesModelPackage.Literals.MODEL__PACKAGE_NAME));
			if(transientValues.isValueTransient(semanticObject, SharedPreferencesModelPackage.Literals.MODEL__PREFERENCES_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SharedPreferencesModelPackage.Literals.MODEL__PREFERENCES_BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0(), semanticObject.getPackageName());
		feeder.accept(grammarAccess.getModelAccess().getPreferencesBlockPreferencesBlockParserRuleCall_2_0(), semanticObject.getPreferencesBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=PreferenceType defaultValue=Literal?)
	 */
	protected void sequence_Preference(EObject context, Preference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID prefs+=Preference*)
	 */
	protected void sequence_PreferencesBlock(EObject context, PreferencesBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
