package com.example.books.net;

public class BookResponseBase {
	private boolean success;
	private String statusMessage;
	
	public boolean isSuccess(){
		return success;
	}
	public void setSuccess(boolean value){
		this.success = value;
	}
	public String getStatusMessage(){
		return statusMessage;
	}
	public void setStatusMessage(String value){
		this.statusMessage = value;
	}
}
