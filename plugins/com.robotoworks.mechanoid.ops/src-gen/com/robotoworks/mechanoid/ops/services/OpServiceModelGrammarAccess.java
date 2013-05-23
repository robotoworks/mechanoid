/*
* generated by Xtext
*/

package com.robotoworks.mechanoid.ops.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class OpServiceModelGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPackageNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cPackageNameAssignment_1.eContents().get(0);
		private final Assignment cServiceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cServiceServiceBlockParserRuleCall_2_0 = (RuleCall)cServiceAssignment_2.eContents().get(0);
		
		//Model:
		//	"package" packageName=QualifiedName service=ServiceBlock;
		public ParserRule getRule() { return rule; }

		//"package" packageName=QualifiedName service=ServiceBlock
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//packageName=QualifiedName
		public Assignment getPackageNameAssignment_1() { return cPackageNameAssignment_1; }

		//QualifiedName
		public RuleCall getPackageNameQualifiedNameParserRuleCall_1_0() { return cPackageNameQualifiedNameParserRuleCall_1_0; }

		//service=ServiceBlock
		public Assignment getServiceAssignment_2() { return cServiceAssignment_2; }

		//ServiceBlock
		public RuleCall getServiceServiceBlockParserRuleCall_2_0() { return cServiceServiceBlockParserRuleCall_2_0; }
	}

	public class ServiceBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ServiceBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOpsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOpsOperationParserRuleCall_3_0 = (RuleCall)cOpsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ServiceBlock:
		//	"service" name=ID "{" ops+=Operation* "}";
		public ParserRule getRule() { return rule; }

		//"service" name=ID "{" ops+=Operation* "}"
		public Group getGroup() { return cGroup; }

		//"service"
		public Keyword getServiceKeyword_0() { return cServiceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//ops+=Operation*
		public Assignment getOpsAssignment_3() { return cOpsAssignment_3; }

		//Operation
		public RuleCall getOpsOperationParserRuleCall_3_0() { return cOpsOperationParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOperationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cArgsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cArgsOperationArgParserRuleCall_3_0_0 = (RuleCall)cArgsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cArgsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cArgsOperationArgParserRuleCall_3_1_1_0 = (RuleCall)cArgsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUniqueClauseAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUniqueClauseUniqueClauseParserRuleCall_5_0 = (RuleCall)cUniqueClauseAssignment_5.eContents().get(0);
		
		//Operation:
		//	"operation" name=ID "(" (args+=OperationArg ("," args+=OperationArg)*)? ")" uniqueClause=UniqueClause?;
		public ParserRule getRule() { return rule; }

		//"operation" name=ID "(" (args+=OperationArg ("," args+=OperationArg)*)? ")" uniqueClause=UniqueClause?
		public Group getGroup() { return cGroup; }

		//"operation"
		public Keyword getOperationKeyword_0() { return cOperationKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(args+=OperationArg ("," args+=OperationArg)*)?
		public Group getGroup_3() { return cGroup_3; }

		//args+=OperationArg
		public Assignment getArgsAssignment_3_0() { return cArgsAssignment_3_0; }

		//OperationArg
		public RuleCall getArgsOperationArgParserRuleCall_3_0_0() { return cArgsOperationArgParserRuleCall_3_0_0; }

		//("," args+=OperationArg)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//args+=OperationArg
		public Assignment getArgsAssignment_3_1_1() { return cArgsAssignment_3_1_1; }

		//OperationArg
		public RuleCall getArgsOperationArgParserRuleCall_3_1_1_0() { return cArgsOperationArgParserRuleCall_3_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//uniqueClause=UniqueClause?
		public Assignment getUniqueClauseAssignment_5() { return cUniqueClauseAssignment_5; }

		//UniqueClause
		public RuleCall getUniqueClauseUniqueClauseParserRuleCall_5_0() { return cUniqueClauseUniqueClauseParserRuleCall_5_0; }
	}

	public class OperationArgElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OperationArg");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeOpArgTypeEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//OperationArg:
		//	type=OpArgType name=ID;
		public ParserRule getRule() { return rule; }

		//type=OpArgType name=ID
		public Group getGroup() { return cGroup; }

		//type=OpArgType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//OpArgType
		public RuleCall getTypeOpArgTypeEnumRuleCall_0_0() { return cTypeOpArgTypeEnumRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class UniqueClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UniqueClause");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNotUniqueAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cNotKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cUniqueKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cUniqueDeclarationAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cUniqueKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cArgsAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final CrossReference cArgsOperationArgCrossReference_1_3_0 = (CrossReference)cArgsAssignment_1_3.eContents().get(0);
		private final RuleCall cArgsOperationArgIDTerminalRuleCall_1_3_0_1 = (RuleCall)cArgsOperationArgCrossReference_1_3_0.eContents().get(1);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Keyword cCommaKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cArgsAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final CrossReference cArgsOperationArgCrossReference_1_4_1_0 = (CrossReference)cArgsAssignment_1_4_1.eContents().get(0);
		private final RuleCall cArgsOperationArgIDTerminalRuleCall_1_4_1_0_1 = (RuleCall)cArgsOperationArgCrossReference_1_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		
		//UniqueClause:
		//	{NotUnique} "not" "unique" | {UniqueDeclaration} "unique" "(" args+=[OperationArg] ("," args+=[OperationArg])* ")";
		public ParserRule getRule() { return rule; }

		//{NotUnique} "not" "unique" | {UniqueDeclaration} "unique" "(" args+=[OperationArg] ("," args+=[OperationArg])* ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//{NotUnique} "not" "unique"
		public Group getGroup_0() { return cGroup_0; }

		//{NotUnique}
		public Action getNotUniqueAction_0_0() { return cNotUniqueAction_0_0; }

		//"not"
		public Keyword getNotKeyword_0_1() { return cNotKeyword_0_1; }

		//"unique"
		public Keyword getUniqueKeyword_0_2() { return cUniqueKeyword_0_2; }

		//{UniqueDeclaration} "unique" "(" args+=[OperationArg] ("," args+=[OperationArg])* ")"
		public Group getGroup_1() { return cGroup_1; }

		//{UniqueDeclaration}
		public Action getUniqueDeclarationAction_1_0() { return cUniqueDeclarationAction_1_0; }

		//"unique"
		public Keyword getUniqueKeyword_1_1() { return cUniqueKeyword_1_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_2() { return cLeftParenthesisKeyword_1_2; }

		//args+=[OperationArg]
		public Assignment getArgsAssignment_1_3() { return cArgsAssignment_1_3; }

		//[OperationArg]
		public CrossReference getArgsOperationArgCrossReference_1_3_0() { return cArgsOperationArgCrossReference_1_3_0; }

		//ID
		public RuleCall getArgsOperationArgIDTerminalRuleCall_1_3_0_1() { return cArgsOperationArgIDTerminalRuleCall_1_3_0_1; }

		//("," args+=[OperationArg])*
		public Group getGroup_1_4() { return cGroup_1_4; }

		//","
		public Keyword getCommaKeyword_1_4_0() { return cCommaKeyword_1_4_0; }

		//args+=[OperationArg]
		public Assignment getArgsAssignment_1_4_1() { return cArgsAssignment_1_4_1; }

		//[OperationArg]
		public CrossReference getArgsOperationArgCrossReference_1_4_1_0() { return cArgsOperationArgCrossReference_1_4_1_0; }

		//ID
		public RuleCall getArgsOperationArgIDTerminalRuleCall_1_4_1_0_1() { return cArgsOperationArgIDTerminalRuleCall_1_4_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_1_5() { return cRightParenthesisKeyword_1_5; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	public class OpArgTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "OpArgType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBooleanBooleanKeyword_0_0 = (Keyword)cBooleanEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cStringStringKeyword_1_0 = (Keyword)cStringEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cIntegerIntKeyword_2_0 = (Keyword)cIntegerEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFloatFloatKeyword_3_0 = (Keyword)cFloatEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cDoubleDoubleKeyword_4_0 = (Keyword)cDoubleEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cLongEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cLongLongKeyword_5_0 = (Keyword)cLongEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cParcelableEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cParcelableParcelableKeyword_6_0 = (Keyword)cParcelableEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum OpArgType:
		//	Boolean="boolean" | String | Integer="int" | Float="float" | Double="double" | Long="long" | Parcelable;
		public EnumRule getRule() { return rule; }

		//Boolean="boolean" | String | Integer="int" | Float="float" | Double="double" | Long="long" | Parcelable
		public Alternatives getAlternatives() { return cAlternatives; }

		//Boolean="boolean"
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_0() { return cBooleanEnumLiteralDeclaration_0; }

		//"boolean"
		public Keyword getBooleanBooleanKeyword_0_0() { return cBooleanBooleanKeyword_0_0; }

		//String
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_1() { return cStringEnumLiteralDeclaration_1; }

		//"String"
		public Keyword getStringStringKeyword_1_0() { return cStringStringKeyword_1_0; }

		//Integer="int"
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_2() { return cIntegerEnumLiteralDeclaration_2; }

		//"int"
		public Keyword getIntegerIntKeyword_2_0() { return cIntegerIntKeyword_2_0; }

		//Float="float"
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_3() { return cFloatEnumLiteralDeclaration_3; }

		//"float"
		public Keyword getFloatFloatKeyword_3_0() { return cFloatFloatKeyword_3_0; }

		//Double="double"
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_4() { return cDoubleEnumLiteralDeclaration_4; }

		//"double"
		public Keyword getDoubleDoubleKeyword_4_0() { return cDoubleDoubleKeyword_4_0; }

		//Long="long"
		public EnumLiteralDeclaration getLongEnumLiteralDeclaration_5() { return cLongEnumLiteralDeclaration_5; }

		//"long"
		public Keyword getLongLongKeyword_5_0() { return cLongLongKeyword_5_0; }

		//Parcelable
		public EnumLiteralDeclaration getParcelableEnumLiteralDeclaration_6() { return cParcelableEnumLiteralDeclaration_6; }

		//"Parcelable"
		public Keyword getParcelableParcelableKeyword_6_0() { return cParcelableParcelableKeyword_6_0; }
	}
	
	private ModelElements pModel;
	private ServiceBlockElements pServiceBlock;
	private OperationElements pOperation;
	private OperationArgElements pOperationArg;
	private UniqueClauseElements pUniqueClause;
	private OpArgTypeElements unknownRuleOpArgType;
	private QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public OpServiceModelGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.robotoworks.mechanoid.ops.OpServiceModel".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"package" packageName=QualifiedName service=ServiceBlock;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//ServiceBlock:
	//	"service" name=ID "{" ops+=Operation* "}";
	public ServiceBlockElements getServiceBlockAccess() {
		return (pServiceBlock != null) ? pServiceBlock : (pServiceBlock = new ServiceBlockElements());
	}
	
	public ParserRule getServiceBlockRule() {
		return getServiceBlockAccess().getRule();
	}

	//Operation:
	//	"operation" name=ID "(" (args+=OperationArg ("," args+=OperationArg)*)? ")" uniqueClause=UniqueClause?;
	public OperationElements getOperationAccess() {
		return (pOperation != null) ? pOperation : (pOperation = new OperationElements());
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//OperationArg:
	//	type=OpArgType name=ID;
	public OperationArgElements getOperationArgAccess() {
		return (pOperationArg != null) ? pOperationArg : (pOperationArg = new OperationArgElements());
	}
	
	public ParserRule getOperationArgRule() {
		return getOperationArgAccess().getRule();
	}

	//UniqueClause:
	//	{NotUnique} "not" "unique" | {UniqueDeclaration} "unique" "(" args+=[OperationArg] ("," args+=[OperationArg])* ")";
	public UniqueClauseElements getUniqueClauseAccess() {
		return (pUniqueClause != null) ? pUniqueClause : (pUniqueClause = new UniqueClauseElements());
	}
	
	public ParserRule getUniqueClauseRule() {
		return getUniqueClauseAccess().getRule();
	}

	//enum OpArgType:
	//	Boolean="boolean" | String | Integer="int" | Float="float" | Double="double" | Long="long" | Parcelable;
	public OpArgTypeElements getOpArgTypeAccess() {
		return (unknownRuleOpArgType != null) ? unknownRuleOpArgType : (unknownRuleOpArgType = new OpArgTypeElements());
	}
	
	public EnumRule getOpArgTypeRule() {
		return getOpArgTypeAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
