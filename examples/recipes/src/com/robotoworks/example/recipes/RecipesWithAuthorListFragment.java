package com.robotoworks.example.recipes;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.robotoworks.example.recipes.content.RecipesDBContract.RecipesWithAuthors;
import com.robotoworks.mechanoid.db.SQuery;

public class RecipesWithAuthorListFragment extends ListFragment {

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
                    R.layout.item_recipe_with_authors, null,
                    new String[] {
                        RecipesWithAuthors.RECIPE_TITLE,
                        RecipesWithAuthors.RECIPE_DESCRIPTION,
                        RecipesWithAuthors.AUTHOR_NAME
                    }, 
                    new int[] {
                        R.id.title,
                        R.id.description,
                        R.id.recipe_author
                    }, 0);
        }
        
        @Override
        public void setViewText(TextView v, String text) {
        	if(v.getId() == R.id.recipe_author) {
        		v.setText(getString(R.string.author_name_format, text));
        		return;
        	}
        	
        	super.setViewText(v, text);
        }
    }
    
    LoaderManager.LoaderCallbacks<Cursor> mLoaderCallbacks = 
            new LoaderManager.LoaderCallbacks<Cursor>() {
        @Override
        public Loader<Cursor> onCreateLoader(int id, Bundle args) {
            return SQuery.newQuery().createSupportLoader(
            		RecipesWithAuthors.CONTENT_URI,
                    new String[] { 
                    		RecipesWithAuthors._ID, 
                            RecipesWithAuthors.RECIPE_TITLE,
                            RecipesWithAuthors.RECIPE_DESCRIPTION,
                            RecipesWithAuthors.AUTHOR_NAME
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
