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
import com.robotoworks.example.movies.ops.MoviesServiceBridge;
import com.robotoworks.mechanoid.db.SQuery;
import com.robotoworks.mechanoid.ops.Operation;
import com.robotoworks.mechanoid.ops.OperationManagerCallbacks;
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
	
	private SupportOperationManager<MoviesServiceBridge> mOperationManager;

	private MoviesAdapter mAdapter;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		mOperationManager = SupportOperationManager
				.create(getFragmentManager(), 
						MoviesServiceBridge.getInstance(),
						mOperationManagerCallbacks);
		
		mOperationManager.runOperation(OP_GET_MOVIES, false);
		
		mAdapter = new MoviesAdapter(getActivity());
		
		setListAdapter(mAdapter);
	}

	private OperationManagerCallbacks<MoviesServiceBridge> mOperationManagerCallbacks
		= new OperationManagerCallbacks<MoviesServiceBridge>() {

		@Override
		public void onOperationComplete(MoviesServiceBridge bridge, int id, Bundle result, boolean fromCache) {
			if(id == OP_GET_MOVIES) {
				if(Operation.isResultOk(result)) {
					
					getLoaderManager().initLoader(LOADER_MOVIES, null, mLoaderCallbacks);
					
				} else {
					Throwable error = Operation.getResultError(result);
					
					Toast.makeText(getActivity(), error.getMessage(), Toast.LENGTH_LONG).show();
				}
			}
		}

		@Override
		public int createOperation(MoviesServiceBridge bridge, int id) {
			if(id == OP_GET_MOVIES) {
				return bridge.executeGetMoviesOperation();
			}
			
			return -1;
		}
		
		@Override
		public void onOperationPending(MoviesServiceBridge bridge, int id) {
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
