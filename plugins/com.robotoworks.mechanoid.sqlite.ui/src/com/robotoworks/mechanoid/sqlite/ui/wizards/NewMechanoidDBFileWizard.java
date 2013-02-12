package com.robotoworks.mechanoid.sqlite.ui.wizards;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.sqlite.ui.internal.SqliteModelActivator;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementPage;
import com.robotoworks.mechanoid.ui.wizard.NewMechanoidElementWizard;

public class NewMechanoidDBFileWizard extends NewMechanoidElementWizard {
    
    private static final String MECHDB_FILE_EXTENSION = "mechdb";
    
    @Inject XtextResourceSet mSnapshotResourceSet;
    
    private NewMechanoidElementPage mNewFilePage;

    private String mSelectedPackageName;

    private String mSelectedElementName;

    public NewMechanoidDBFileWizard() {
        
        Injector injector = SqliteModelActivator.getInstance().getInjector(SqliteModelActivator.COM_ROBOTOWORKS_MECHANOID_SQLITE_SQLITEMODEL);
        
        injector.injectMembers(this);
        
        mNewFilePage = new NewMechanoidElementPage("new_file_page");
        mNewFilePage.setTitle("Mechanoid DB");
        mNewFilePage.setDescription("Create a new Mechanoid DB (*.mechdb) file.");
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
            
            monitor.beginTask("Create Mechanoid DB FIle", 1);
            
            URI newEmfResourceURI = URI.createURI("platform:/resource" +
                    path
                     .toPortableString());
                     
            Resource emfResource = mSnapshotResourceSet.createResource(newEmfResourceURI);
            
            Model model = SqliteModelFactory.eINSTANCE.createModel();
            model.setPackageName(mSelectedPackageName);
            
            emfResource.getContents().add(model);
            
            DatabaseBlock database = (DatabaseBlock) SqliteModelFactory.eINSTANCE.createDatabaseBlock();
            database.setName(mSelectedElementName);
            model.setDatabase(database);
            
            MigrationBlock migration = (MigrationBlock) SqliteModelFactory.eINSTANCE.createMigrationBlock();

            database.getMigrations().add(migration);
            
            emfResource.save(Collections.EMPTY_MAP);
            
            IResource resource =  ResourcesPlugin.getWorkspace()
                    .getRoot().findMember(newEmfResourceURI.toPlatformString(true));
            
            monitor.worked(1);
            
            return resource;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}