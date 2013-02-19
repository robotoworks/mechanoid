/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.net;

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
