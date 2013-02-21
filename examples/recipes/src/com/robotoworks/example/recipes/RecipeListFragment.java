package com.robotoworks.example.recipes;

import com.robotoworks.example.recipes.content.RecipesDBContract.Recipes;
import com.robotoworks.mechanoid.db.SQuery;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;

public class RecipeListFragment extends ListFragment {

    private RecipesCursorAdapter mAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new RecipesCursorAdapter(getActivity());
        setListAdapter(mAdapter);
        
        getLoaderManager().initLoader(0, null, mLoaderCallbacks);
    }
    
    class RecipesCursorAdapter extends SimpleCursorAdapter {
        public RecipesCursorAdapter(Context context) {
            super(context, 
                    R.layout.item_recipe, null,
                    new String[] {
                        Recipes.TITLE,
                        Recipes.DESCRIPTION
                    }, 
                    new int[] {
                        R.id.title,
                        R.id.description
                    }, 0);
        }
    }
    
    LoaderManager.LoaderCallbacks<Cursor> mLoaderCallbacks = 
            new LoaderManager.LoaderCallbacks<Cursor>() {
        @Override
        public Loader<Cursor> onCreateLoader(int id, Bundle args) {
            return SQuery.newQuery().createSupportLoader(
                    Recipes.CONTENT_URI,
                    new String[] { 
                            Recipes._ID, 
                            Recipes.TITLE,
                            Recipes.DESCRIPTION 
                    });
        }
    
        @Override
        public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
            mAdapter.swapCursor(cursor);
        }
    
        @Override
        public void onLoaderReset(Loader<Cursor> loader) {
            mAdapter.swapCursor(null);
        }
    };
}
