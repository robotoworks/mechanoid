package com.robotoworks.mechanoid.ops;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class OperationResult implements Parcelable {
	
	public static final String EXTRA_BATCH_RESULTS = "OperationResult.BATCH_RESULTS";

	
	/**
	 * Represents a code indicating the operation completely successfully a result Bundle.
	 */
	public static final int RESULT_OK = 0;
	
	/**
	 * Represents a code indicating the operation completed with an error.
	 */
	public static final int RESULT_ERROR = 1;

	private int mResultCode = RESULT_OK;
	
	private Throwable mError = null;

	private Bundle mResultData = null;
	
	private Intent mRequest = null;

	private boolean mIsBatch;

	private ArrayList<OperationResult> mBatchResults = new ArrayList<OperationResult>();

	private boolean mBatchResultsOk = true;
	
	private Object mObject;
	
	/**
	 * Better to call release object
	 * and get the result of that which
	 * will save you memory from the log
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T getObject() {
		return (T)mObject;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T releaseObject() {
		Object obj = mObject;
		mObject = null;
		return (T)obj;
	}

	public void setObject(Object obj) {
		mObject = obj;
	}
	
	/**
	 * <p>Associate an error to this result, it is a good idea
	 * to also set the result code to {@link #RESULT_ERROR}</p>
	 * 
	 * @param error the error to associate to this result
	 */
	public void setError(Throwable error) {
		mError = error;
	}
	
	/**
	 * <p>Set the result code, usually either {@link #RESULT_ERROR} or 
	 * {@link #RESULT_OK} should be used.</p>
	 * @param resultCode
	 */
	public void setCode(int resultCode) {
		mResultCode = resultCode;
	}
	
	/**
	 * @return A result code, can be user defined or either {@link #RESULT_ERROR}
	 * or {@link #RESULT_OK}.
	 */
	public int getCode() {
		return mResultCode;
	}
	
	/**
	 * @return Get the exception associated to this result, usually when the
	 * {@link #RESULT_ERROR} is used, can be null
	 */
	public Throwable getError() {
		return mError;
	}
	
	public Bundle getData() {
		return mResultData;
	}
	
	/**
	 * <p>Some arbitrary user defined data</p>
	 * @param resultData
	 */
	public void setData(Bundle resultData) {
		mResultData = resultData;
		mBatchResultsOk = true;
		mIsBatch = false;
		ArrayList<Bundle> results = mResultData.getParcelableArrayList(EXTRA_BATCH_RESULTS);

		if(results != null && results.size() > 0) {
			mIsBatch = true;
			for(Bundle result : results) {
				OperationResult r = OperationResult.fromBundle(result);
				mBatchResults.add(r);
				if(!r.isOk()) {
					mBatchResultsOk = false;
				}
			}
		}
	}
	
	/**
	 * @return true if the result code is {@link #RESULT_OK}, false otherwise
	 */
	public boolean isOk() {
		if(isBatch()) {
			return mBatchResultsOk;
		} else {
			return mResultCode == RESULT_OK;
		}
	}
	
	public boolean isBatch() {
		if(mResultData == null) {
			return false;
		};
		return mIsBatch;
	}
	
	public void setRequest(Intent request) {
		mRequest = request;
	}
	
	public Intent getRequest() {
		return mRequest;
	}
	
	public static final Parcelable.Creator<OperationResult> CREATOR = 
	new Parcelable.Creator<OperationResult>() {
		public OperationResult createFromParcel(Parcel in) {
			return new OperationResult(in);
		}

		public OperationResult[] newArray(int size) {
			return new OperationResult[size];
		}
	};

	public OperationResult(int resultCode) {
		mResultCode = resultCode;
	}
	
	private OperationResult(Parcel in) {
		mResultCode = in.readInt();
		mError = (Throwable) in.readSerializable();
		mResultData = in.readBundle();
		mRequest = in.readParcelable(null);
		mIsBatch = in.readInt() > 0 ? true : false;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(mResultCode);
		dest.writeSerializable(mError);
		dest.writeBundle(mResultData);
		dest.writeParcelable(mRequest, 0);
		dest.writeInt(mIsBatch ? 1 : 0);
	}
	
	/**
	 * <p>Create an error result, the result code
	 * will be set to {@link #RESULT_ERROR}.</p>
	 * @param error The error that occurred during the operation
	 * @return A result that represents an error result of an operation
	 */
	public static OperationResult error(Throwable error) {
		OperationResult result = new OperationResult(RESULT_ERROR);
		result.setError(error);
		return result;	
	}
	
	/**
	 * <p>Create an error result, the result code
	 * will be set to {@link #RESULT_ERROR}.</p>
	 * @param error The error that occurred during the operation
	 * @param data The bundle that should be used as the result bundle, this gives an opportunity
	 * to add arbitrary data to the result, must not be null
	 * @return A result that represents an error result of an operation
	 */
	public static OperationResult error(Throwable error, Bundle data) {
		OperationResult result = new OperationResult(RESULT_ERROR);
		result.setError(error);
		result.setData(data);
		return result;	
	}

	/**
	 * <p>Create an operation result Bundle as an OK result, which should indicate
	 * that the operation was a success, the result code will be set to {@link #RESULT_OK}.</p>
	 * @return A result that represents an operation that completed successfully
	 */
	public static OperationResult ok() {
		return new OperationResult(RESULT_OK);
	}
	
	/**
	 * <p>Create an operation result Bundle as an OK result, which should indicate
	 * that the operation was a success, the result code will be set to {@link #RESULT_OK}.</p>
	 * @param data The bundle that should be used as the result bundle, this gives an opportunity
	 * to add arbitrary data to the result, must not be null
	 * @return A result that represents an operation result that completed successfully
	 */
	public static OperationResult ok(Bundle data) {
		if(data == null) {
			throw new RuntimeException("bundle cannot be null");
		}
		
		OperationResult result = new OperationResult(RESULT_OK);
		result.setData(data);
		
		return result;
	}
	
	public Bundle toBundle() {
		Bundle bundle = new Bundle();
		bundle.putParcelable(OperationResult.class.getName(), this);
		
		return bundle;
	}
	
	public static OperationResult fromBundle(Bundle bundle) {
		bundle.setClassLoader(OperationResult.class.getClassLoader());
		return bundle.getParcelable(OperationResult.class.getName());
	}
	
	public ArrayList<OperationResult> getBatchResults() {
		return mBatchResults;
	}
 }
