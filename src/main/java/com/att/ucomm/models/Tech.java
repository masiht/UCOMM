package com.att.ucomm.models;

public class Tech {
	
	private String name;
	private String techId;
	private String location;

	public Tech() {
		
	}
	
	public Tech(String name, String id, String location) {
		
		this.name = name;
		this.techId = id;
		this.location = location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBan(String id) {
		this.techId = id;
	}
	
	public String getId() {
		return this.techId;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(" Name : ").append(this.name)
				.append(" Tech ID : ").append(this.techId)
				.append(" Location : ").append(this.location).toString();
	}
	
}
