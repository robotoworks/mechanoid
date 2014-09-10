package com.robotoworks.mechanoid.ops;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class BatchOperation extends Operation {

	private List<Operation> mBatchOperations;

	public BatchOperation(List<Operation> operations) {
		this.mBatchOperations = operations;
	}

	@Override
	public OperationResult execute(OperationContext context) {
		
		Intent intent = context.getIntent();

		ArrayList<Bundle> results = new ArrayList<Bundle>();
		
		List<Intent> intents = intent.getParcelableArrayListExtra(OperationService.EXTRA_BATCH);
		
		for(int i = 0; i < mBatchOperations.size(); i++) {
			Intent batchIntent = intents.get(i);

			if(context.getEnableLogging()) {
				Log.d(context.getLogTag(), String.format("[Batch Operation] intent:%s", batchIntent));
			}
			
			Operation operation = mBatchOperations.get(i);
			context.setIntent(batchIntent);
			
			try {
				OperationResult opResult = operation.execute(context);
				
				if(opResult == null) {
					throw new NullPointerException("OperationResult should not be null");
				}
				
				results.add(opResult.toBundle());
				
			} catch(Exception x) {
				results.add(OperationResult.error(x).toBundle());
			}
		}
		
		Bundle resultBundle = new Bundle();
		resultBundle.putParcelableArrayList(OperationResult.EXTRA_BATCH_RESULTS, results);
		
		return OperationResult.ok(resultBundle);
	}
}
