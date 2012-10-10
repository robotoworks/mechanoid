package com.mechanoid.net;

import java.util.List;
public class Node {
	private String name;
	private List<Node> children;
	
	public String getName(){
		return name;
	}
	public void setName(String value){
		this.name = value;
	}
	public List<Node> getChildren(){
		return children;
	}
	public void setChildren(List<Node> value){
		this.children = value;
	}
}
