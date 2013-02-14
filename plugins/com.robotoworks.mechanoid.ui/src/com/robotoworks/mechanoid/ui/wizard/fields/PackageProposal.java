package com.robotoworks.mechanoid.ui.wizard.fields;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.fieldassist.IContentProposal;

public class PackageProposal implements IContentProposal, Comparable<PackageProposal> {

    private String mContent;
    private int mCursorPosition;
    private String mLabel;
    private String mDescription;

    public PackageProposal(IPackageFragment fragment) {
        mContent = fragment.getElementName();
        mCursorPosition = mContent.length();
        mLabel = mContent;
        mDescription = null;
    }
    
    @Override
    public String getContent() {
        return mContent;
    }

    @Override
    public int getCursorPosition() {
        return mCursorPosition;
    }

    @Override
    public String getLabel() {
        return mLabel;
    }

    @Override
    public String getDescription() {
        return mDescription;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mContent == null) ? 0 : mContent.hashCode());
        result = prime * result + mCursorPosition;
        result = prime * result + ((mDescription == null) ? 0 : mDescription.hashCode());
        result = prime * result + ((mLabel == null) ? 0 : mLabel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PackageProposal other = (PackageProposal) obj;
        if (mContent == null) {
            if (other.mContent != null)
                return false;
        } else if (!mContent.equals(other.mContent))
            return false;
        if (mCursorPosition != other.mCursorPosition)
            return false;
        if (mDescription == null) {
            if (other.mDescription != null)
                return false;
        } else if (!mDescription.equals(other.mDescription))
            return false;
        if (mLabel == null) {
            if (other.mLabel != null)
                return false;
        } else if (!mLabel.equals(other.mLabel))
            return false;
        return true;
    }

    @Override
    public int compareTo(PackageProposal o) {
        return this.getContent().compareTo(o.getContent());
    }

}
