package com.robotoworks.mechanoid.net.ui.editor.syntaxcoloring;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.robotoworks.mechanoid.net.netModel.HttpMethodType;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.Path;

public class MechNetSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
		    return;
		    
		  INode root = resource.getParseResult().getRootNode();
		  for (INode node : root.getAsTreeIterable()) {
		    if (node instanceof CompositeNodeWithSemanticElement) {
		    	
		    	CompositeNodeWithSemanticElement composite = (CompositeNodeWithSemanticElement) node;
		    	if(composite.getSemanticElement() instanceof Path) {
		    	
			      acceptor.addPosition(node.getOffset(), node.getLength(), 
			    		  DefaultHighlightingConfiguration.STRING_ID);	
		    	}
		    }
		  }
	}
}
