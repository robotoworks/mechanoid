package ${packageName};

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.SimpleCursorAdapter;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Loader;
import android.database.Cursor;
import android.content.Context;
import com.robotoworks.mechanoid.db.SQuery;

public class ${activityClass} extends ListActivity {

    private static final String[] PROJECTION = {
        // TODO
    };
    
    private ${contractItemSource}Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mAdapter = new ${contractItemSource}Adapter(this);
        
        setListAdapter(mAdapter);
        
        getLoaderManager().initLoader(0, null, mLoaderCallbacks);
    }
    
    private LoaderCallbacks<Cursor> mLoaderCallbacks = new LoaderCallbacks<Cursor>() {
        
        @Override
        public void onLoaderReset(Loader<Cursor> loader) {
            mAdapter.swapCursor(null);
        }
        
        @Override
        public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
            mAdapter.swapCursor(cursor);
        }
        
        @Override
        public Loader<Cursor> onCreateLoader(int id, Bundle args) {
            return SQuery.newQuery().createLoader(${contractItemSource}.CONTENT_URI, PROJECTION);
        }
    };
    
    public static class ${contractItemSource}Adapter extends SimpleCursorAdapter {

        private static final String[] FROM = {
            // TODO columns to bind
        };
        
        private static final int[] TO = {
            // TODO resource ids to bind to
        };
        
        public ${contractItemSource}Adapter(Context context) {
            super(context, R.layout.${itemLayoutName}, null, FROM, TO, 0);
        }
    }
}
