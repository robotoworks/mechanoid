package com.justeat.app.ops.net;

public class UnexpectedHttpStatusException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private int mActualStatus;
    private int mExpectedStatus;
    
    public int getActualStatus() {
        return mActualStatus;
    }
    
    public int getExpectedStatus() {
        return mExpectedStatus;
    }

    public UnexpectedHttpStatusException(int actualStatus, int expectedStatus) {
        super(String.format("Expected Status %d,  Actual Status %d", expectedStatus, actualStatus));
        mActualStatus = actualStatus;
        mExpectedStatus = expectedStatus;
    }
}
