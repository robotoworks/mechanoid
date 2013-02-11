package com.robotoworks.mechanoid.ui.wizard.fields;

import java.util.ArrayList;
import java.util.TreeSet;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class PackageProposalProvider implements IContentProposalProvider {

    private TreeSet<PackageProposal> mAllProposals = new TreeSet<PackageProposal>();

    public PackageProposalProvider() {
    }
    
    public void setProposalsFromProject(IJavaProject project) {
        
        mAllProposals.clear();

        if(project == null) {
            return;
        }
        
        try {
            IPackageFragment[] packageFragments = project.getPackageFragments();
            
            for(int i=0; i < packageFragments.length; i++) {
                IPackageFragment frag = packageFragments[i];
                if(!frag.isDefaultPackage() && frag.getKind() == IPackageFragmentRoot.K_SOURCE) {
                    mAllProposals.add(new PackageProposal(frag));
                }
            }
            
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    @Override
    public IContentProposal[] getProposals(String contents, int position) {
        ArrayList<IContentProposal> proposals = new ArrayList<IContentProposal>();
        
        for(IContentProposal p : mAllProposals) {
            if(p.getContent().startsWith(contents)) {
                proposals.add(p);
            }
        }
        
        
        return proposals.toArray(new IContentProposal[proposals.size()]);
    }

}
