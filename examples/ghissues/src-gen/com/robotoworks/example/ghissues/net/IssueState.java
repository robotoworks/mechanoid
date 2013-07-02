package com.robotoworks.example.ghissues.net;
	
public enum IssueState {
	OPEN("open"),
	CLOSED("closed");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	IssueState(String value){
		this.value = value;
	}
	
	public static IssueState fromValue(String value) {
		if (value == null) {
			throw new IllegalArgumentException("value cannot be null");
		}
		
		for (IssueState member : IssueState.values()) {
			if (value.equalsIgnoreCase(member.value)) {
				return member;
			}
		}
		
		throw new RuntimeException("No constant with value " + value + " found");
	}
}
