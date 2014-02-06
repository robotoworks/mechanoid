package com.robotoworks.example.movies.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.robotoworks.example.movies.R;
import com.robotoworks.example.movies.db.MovieDBContract.Movies;
import com.robotoworks.example.movies.ops.GetMoviesOperation;
import com.robotoworks.mechanoid.db.SQuery;
import com.robotoworks.mechanoid.ops.OperationExecutor;
import com.robotoworks.mechanoid.ops.OperationExecutorCallbacks;
import com.robotoworks.mechanoid.ops.OperationResult;

public class MovieListFragment extends ListFragment {

	private static final String OP_GET_MOVIES = "OP_GET_MOVIES";
	
	private static final int LOADER_MOVIES = 1;
	
	private static String[] PROJECTION = {
		Movies._ID,
		Movies.TITLE,
		Movies.DESCRIPTION,
		Movies.YEAR
	};
	
	private OperationExecutor mGetMoviesOperationExecutor;

	private MoviesAdapter mAdapter;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		mGetMoviesOperationExecutor = new OperationExecutor(OP_GET_MOVIES, savedInstanceState, mOperationExecutorCallbacks);
		
		if(mGetMoviesOperationExecutor.isComplete()) {
			getLoaderManager().initLoader(LOADER_MOVIES, null, mLoaderCallbacks);
		} else {
			mGetMoviesOperationExecutor.execute(GetMoviesOperation.newIntent(), OperationExecutor.MODE_ONCE);
		}
		
		mAdapter = new MoviesAdapter(getActivity());
		
		setListAdapter(mAdapter);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		mGetMoviesOperationExecutor.saveState(outState);
	}

	private OperationExecutorCallbacks mOperationExecutorCallbacks = new OperationExecutorCallbacks() {
	
		@Override
		public boolean onOperationComplete(String key, OperationResult result) {
			if(!isAdded()) {
				return false;
			}
			
			if(OP_GET_MOVIES.equals(key)) {
				if(result.isOk()) {
					
					getLoaderManager().initLoader(LOADER_MOVIES, null, mLoaderCallbacks);
					
				} else {
					Throwable error = result.getError();
					
					Toast.makeText(getActivity(), error.getMessage(), Toast.LENGTH_LONG).show();
				}
				
				return true;
			}
			
			return false;
		}
	
		@Override
		public void onOperationPending(String key) {
			if(OP_GET_MOVIES.equals(key)) {
				setListShown(false);
			}
		}
	};
	
	
	LoaderManager.LoaderCallbacks<Cursor> mLoaderCallbacks 
		= new LoaderManager.LoaderCallbacks<Cursor>() {
		
		@Override
		public Loader<Cursor> onCreateLoader(int id, Bundle args) {
			if(id == LOADER_MOVIES) {
				return SQuery.newQuery()
						.createSupportLoader(Movies.CONTENT_URI, PROJECTION);
			}
			
			return null;
		}

		@Override
		public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
			mAdapter.swapCursor(cursor);
			
			setListShown(true);
		}
		
		@Override
		public void onLoaderReset(Loader<Cursor> loader) {
			mAdapter.swapCursor(null);
		}
	};
	
	class MoviesAdapter extends SimpleCursorAdapter {

		public MoviesAdapter(Context context) {
			super(context, R.layout.item_movies, null,
					new String[] {
						Movies.TITLE,
						Movies.YEAR,
						Movies.DESCRIPTION
					},
					new int[] {
						R.id.movie_title,
						R.id.movie_year,
						R.id.movie_description
					}, 0);
		}
	}
}
