package com.robotoworks.mechanoid.db.ui.wizards;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.FindReplaceDocumentAdapter;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.robotoworks.mechanoid.db.services.SqliteModelGrammarAccess;
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.db.sqliteModel.Model;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.ui.Messages;
import com.robotoworks.mechanoid.db.ui.internal.SqliteModelActivator;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementWizard;

public class NewMechanoidDBFileWizard extends NewMechanoidElementWizard {
    
    private static final String MECHDB_FILE_EXTENSION = "mechdb"; //$NON-NLS-1$
    
    @Inject XtextResourceSet mResourceSet;
    @Inject SqliteModelGrammarAccess mGrammarAccess;
    
    private NewMechanoidElementPage mNewFilePage;

    private String mSelectedPackageName;

    private String mSelectedElementName;

    public NewMechanoidDBFileWizard() {
        
        Injector injector = SqliteModelActivator.getInstance().getInjector(SqliteModelActivator.COM_ROBOTOWORKS_MECHANOID_DB_SQLITEMODEL);
        
        injector.injectMembers(this);
        
        mNewFilePage = new NewMechanoidElementPage("new_file_page") { //$NON-NLS-1$
            @Override
            protected String getNameFieldInfoMessage() {
                return Messages.NewMechanoidDBFileWizard_Widget_Label_Message_Name;
            }
        };
        mNewFilePage.setTitle(Messages.NewMechanoidDBFileWizard_Title);
        mNewFilePage.setDescription(Messages.NewMechanoidDBFileWizard_Message);
        
        setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
        super.addPages();

        addPage(mNewFilePage);
    }
    
    @Override
    protected IPath createNewResourceFilePath() {
        return mNewFilePage.getSelectedFolderPath()
                .append(mNewFilePage.getSelectedElementName())
                .addFileExtension(MECHDB_FILE_EXTENSION);
    }
    
    @Override
    protected void onBeforeCreateElementResource() {
        mSelectedPackageName = mNewFilePage.getSelectedPackageName();
        mSelectedElementName = mNewFilePage.getSelectedElementName();
    }
    
    @Override
    protected IResource createElementResource(IProgressMonitor monitor, IPath path) {
        try {
            
            if(monitor == null) {
                monitor = new NullProgressMonitor();
            }
            
            monitor.beginTask(Messages.NewMechanoidDBFileWizard_Progress_Message, 2);
            
            URI newEmfResourceURI = URI.createURI("platform:/resource" + //$NON-NLS-1$
                    path
                     .toPortableString());
                     
            Resource emfResource = mResourceSet.createResource(newEmfResourceURI);
            
            Model model = SqliteModelFactory.eINSTANCE.createModel();
            model.setPackageName(mSelectedPackageName);
            
            emfResource.getContents().add(model);
            
            DatabaseBlock database = (DatabaseBlock) SqliteModelFactory.eINSTANCE.createDatabaseBlock();
            database.setName(mSelectedElementName);
            model.setDatabase(database);
            
            MigrationBlock migration = (MigrationBlock) SqliteModelFactory.eINSTANCE.createMigrationBlock();

            database.getMigrations().add(migration);
            
            emfResource.save(Collections.EMPTY_MAP);
            
            monitor.worked(1);
            
            IResource resource =  ResourcesPlugin.getWorkspace()
                    .getRoot().findMember(newEmfResourceURI.toPlatformString(true));
            
            monitor.worked(2);
            
            
            return resource;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    @Override
    protected void onNewResourceEditorOpened(IEditorPart editor) {
        final XtextEditor xeditor = (XtextEditor) editor;
        final IXtextDocument document = xeditor.getDocument();
        xeditor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
            @Override
            public void process(XtextResource state) throws Exception {
                Model model = (Model)state.getContents().get(0);
                MigrationBlock migrationBlock = model.getDatabase().getMigrations().get(0);
                
                ILeafNode node = findFirstLeafNodeForKeyword(migrationBlock, "{"); //$NON-NLS-1$
                
                int position = node.getOffset() + 1;
                
                document.replace(position, 0, "\n\t\t"); //$NON-NLS-1$
                xeditor.selectAndReveal(position + 3, 0);
            }
        });
    }
    
    public ILeafNode findFirstLeafNodeForKeyword(EObject e, String keyword) {
        ICompositeNode node = NodeModelUtils.getNode(e);
        
        for(ILeafNode leaf : node.getLeafNodes()) {
            if(leaf.getGrammarElement() instanceof Keyword) {
                Keyword k = (Keyword) leaf.getGrammarElement();
                if(k.getValue().equals(keyword)) {
                    return leaf;
                }
            }
        }   
        
        return null;
    }
}