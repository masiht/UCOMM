package com.att.ucomm.models;

public class Tech {
	
	private String name;
	private String techId;
	private String location;
	private int availability;
	private String coc;

	public Tech() {
		
	}
	
	public Tech(String name, String id, String location, int avlbty, String coc) {
		
		this.name = name;
		this.techId = id;
		this.location = location;
		this.availability = avlbty;
		this.coc = coc;
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
	
	public void setAvailability(int avlbty) {
		this.availability = avlbty;
	}
	
	public int getAvailability() {
		return this.availability;
	}
	
	public void setCoc(String coc) {
		this.coc = coc;
	}
	
	public String getCoc() {
		return this.coc;
	}
	
	
	@Override
	public String toString() {
		return new StringBuffer(" Name : ").append(this.name)
				.append(" Tech ID : ").append(this.techId)
				.append(" Location : ").append(this.location)
				.append(" Availability : ").append(this.availability)
				.append(" Coc : ").append(this.coc).toString();
	}
	
}
