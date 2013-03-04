package com.robotoworks.mechanoid.db.ui.editor.syntaxcoloring;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.robotoworks.mechanoid.db.sqliteModel.ContentUri;

public class MechDbSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        if (resource == null || resource.getParseResult() == null)
            return;
            
          INode root = resource.getParseResult().getRootNode();
          for (INode node : root.getAsTreeIterable()) {
            if (node instanceof CompositeNodeWithSemanticElement) {
                
                CompositeNodeWithSemanticElement composite = (CompositeNodeWithSemanticElement) node;
                if(composite.getSemanticElement() instanceof ContentUri) {
                
                  acceptor.addPosition(node.getOffset(), node.getLength(), 
                          DefaultHighlightingConfiguration.STRING_ID);  
                }
            }
          }
    }

}
