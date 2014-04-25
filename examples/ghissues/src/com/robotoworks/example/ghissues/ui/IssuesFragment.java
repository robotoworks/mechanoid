package com.robotoworks.example.ghissues.ui;

import com.robotoworks.example.ghissues.R;
import com.robotoworks.example.ghissues.db.GithubDBContract.Issues;
import com.robotoworks.example.ghissues.ops.GetIssuesForRepositoryOperation;
import com.robotoworks.mechanoid.db.SQuery;
import com.robotoworks.mechanoid.ops.OperationExecutor;
import com.robotoworks.mechanoid.ops.OperationExecutorCallbacks;
import com.robotoworks.mechanoid.ops.OperationResult;

import android.app.ListFragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class IssuesFragment extends ListFragment {

	private static final String OP_GET_ISSUES = "OP_GET_ISSUES";

	private static final int LOADER_ISSUES = 1;
	
	private OperationExecutor mGetIssuesOpExecutor;

	private IssueListAdapter mAdapter;
	
	private static final String[] ISSUES_PROJECTION = {
			Issues._ID,
			Issues.NUMBER,
			Issues.TITLE,
			Issues.BODY
	};

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		

		mAdapter = new IssueListAdapter(getActivity());
		
		setListAdapter(mAdapter);
		
		mGetIssuesOpExecutor = new OperationExecutor(OP_GET_ISSUES, savedInstanceState, mOpExecutorCallbacks);
		
		if(mGetIssuesOpExecutor.isOk()) {
			getLoaderManager().restartLoader(LOADER_ISSUES, null, mLoaderCallbacks);
		} else {
			mGetIssuesOpExecutor.execute(GetIssuesForRepositoryOperation.newIntent("robotoworks", "mechanoid"), OperationExecutor.MODE_ON_ERROR);
		}
	}

	private OperationExecutorCallbacks mOpExecutorCallbacks = new OperationExecutorCallbacks() {
		
		@Override
		public void onOperationPending(String key) {
			if(OP_GET_ISSUES.equals(key)) {
				setListShown(false);
			}
		}
		
		@Override
		public boolean onOperationComplete(String key, OperationResult result) {
			if(!isAdded()) {
				return false;
			}
			
			if(OP_GET_ISSUES.equals(key)) {
				setListShown(true);
				
				if(result.isOk()) {
					getLoaderManager().restartLoader(LOADER_ISSUES, null, mLoaderCallbacks);
				} else {
					Toast.makeText(getActivity(), result.getError().getMessage(), Toast.LENGTH_LONG).show();
				}
				
				return true;
			}
			
			return false;
		}
	};
	
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
			return SQuery.newQuery().createLoader(Issues.CONTENT_URI, ISSUES_PROJECTION);
		}
	};
	
	public static class IssueListAdapter extends SimpleCursorAdapter {

		private static final String[] FROM = {
			Issues.NUMBER,
			Issues.TITLE,
			Issues.BODY	
		};
		
		private static final int[] TO = {
				R.id.issue_number,
				R.id.issue_title,
				R.id.issue_body
		};
		
		public IssueListAdapter(Context context) {
			super(context, R.layout.item_issue, null, FROM, TO, 0);
		}
	}
}
