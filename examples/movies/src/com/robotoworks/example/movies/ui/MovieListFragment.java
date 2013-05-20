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
import com.robotoworks.mechanoid.ops.OperationManagerCallbacks;
import com.robotoworks.mechanoid.ops.OperationResult;
import com.robotoworks.mechanoid.ops.SupportOperationManager;

public class MovieListFragment extends ListFragment {

	private static final int OP_GET_MOVIES = 1;
	
	private static final int LOADER_MOVIES = 1;
	
	private static String[] PROJECTION = {
		Movies._ID,
		Movies.TITLE,
		Movies.DESCRIPTION,
		Movies.YEAR
	};
	
	private SupportOperationManager mOperationManager;

	private MoviesAdapter mAdapter;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		mOperationManager = SupportOperationManager.create(getActivity(), mOperationManagerCallbacks);
		
		mOperationManager.runOperation(GetMoviesOperation.createIntent(), OP_GET_MOVIES, false);
		
		mAdapter = new MoviesAdapter(getActivity());
		
		setListAdapter(mAdapter);
	}

	private OperationManagerCallbacks mOperationManagerCallbacks = new OperationManagerCallbacks() {

		@Override
		public void onOperationComplete(int code, OperationResult result, boolean fromCache) {
			if(code == OP_GET_MOVIES) {
				if(result.isOk()) {
					
					getLoaderManager().initLoader(LOADER_MOVIES, null, mLoaderCallbacks);
					
				} else {
					Throwable error = result.getError();
					
					Toast.makeText(getActivity(), error.getMessage(), Toast.LENGTH_LONG).show();
				}
			}
		}

		@Override
		public void onOperationPending(int code) {
			setListShown(false);
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
