package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;

public class EchoParamsRequest {
	
	private static final String PATH="/echoParams";
	
	private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
	
	public void setHeader(String field, String value) {
		headers.put(field, value);
	}
	
	public Set<String> getHeaderKeys() {
		return headers.keySet();
	}
	
	public String getHeaderValue(String key) {
		return headers.get(key);
	}

	private String aParam;
	private boolean aParamSet;
	private boolean bParam;
	private boolean bParamSet;
	private double cParam;
	private boolean cParamSet;
	private int dParam;
	private boolean dParamSet;
	private long eParam;
	private boolean eParamSet;
		
	public EchoParamsRequest setAParam(String value) {
		this.aParam = value;
		this.aParamSet = true;
		return this;
	}
	
	public boolean isAParamSet() {
		return aParamSet;
	}
	public EchoParamsRequest setBParam(boolean value) {
		this.bParam = value;
		this.bParamSet = true;
		return this;
	}
	
	public boolean isBParamSet() {
		return bParamSet;
	}
	public EchoParamsRequest setCParam(double value) {
		this.cParam = value;
		this.cParamSet = true;
		return this;
	}
	
	public boolean isCParamSet() {
		return cParamSet;
	}
	public EchoParamsRequest setDParam(int value) {
		this.dParam = value;
		this.dParamSet = true;
		return this;
	}
	
	public boolean isDParamSet() {
		return dParamSet;
	}
	public EchoParamsRequest setEParam(long value) {
		this.eParam = value;
		this.eParamSet = true;
		return this;
	}
	
	public boolean isEParamSet() {
		return eParamSet;
	}
		
	public EchoParamsRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		if(aParamSet){
			uriBuilder.appendQueryParameter("a", aParam);
		}
		if(bParamSet){
			uriBuilder.appendQueryParameter("b", String.valueOf(bParam));
		}
		if(cParamSet){
			uriBuilder.appendQueryParameter("c", String.valueOf(cParam));
		}
		if(dParamSet){
			uriBuilder.appendQueryParameter("d", String.valueOf(dParam));
		}
		if(eParamSet){
			uriBuilder.appendQueryParameter("e", String.valueOf(eParam));
		}
		
		return uriBuilder.toString();			
	}
}
