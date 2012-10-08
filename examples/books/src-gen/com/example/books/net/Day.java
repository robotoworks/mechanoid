package com.example.books.net;
	
public enum Day {
	MONDAY("monday"),
	TUESDAY("tuesday"),
	WEDNESDAY("wednesday");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	Day(String value){
		this.value = value;
	}
	
	public static Day fromValue(String value) {
		if (value == null) {
			throw new IllegalArgumentException("value cannot be null");
		}
		
		for (Day member : Day.values()) {
			if (value.equalsIgnoreCase(member.value)) {
				return member;
			}
		}
		
		throw new RuntimeException("No constant with value " + value + " found");
	}
}
