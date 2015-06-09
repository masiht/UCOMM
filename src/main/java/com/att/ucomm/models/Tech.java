package com.att.ucomm.models;

public class Tech {
	
	private String name;
	private String techId;
	private double latitude;
	private double longitude;
	private int availability;
	private String coc;

	public Tech() {
		
	}
	
	public Tech(String name, String id, double lat, double lon, int avlbty, String coc) {
		
		this.name = name;
		this.techId = id;
		this.latitude = lat;
		this.longitude = lon;
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
	
	public void setLatitude(double lat) {
		this.latitude = lat;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public void setLongitude(double lon) {
		this.longitude = lon;
	}
	
	public double getLongitude() {
		return this.longitude;
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
				.append(" Latitude : ").append(this.latitude)
				.append(" Longitude : ").append(this.longitude)
				.append(" Availability : ").append(this.availability)
				.append(" Coc : ").append(this.coc).toString();
	}
	
}
