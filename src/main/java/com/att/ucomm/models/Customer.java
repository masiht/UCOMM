package com.att.ucomm.models;

public class Customer {
	
	private String name;
	private int ban;
	private String address;
	private String latitude;
	private String longitude;

	public Customer() {
		
	}
	
	public Customer(String name, int ban, String address, String lat, String lon) {
		this.name = name;
		this.ban = ban;
		this.address = address;
		this.latitude = lat;
		this.longitude = lon;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBan(int ban) {
		this.ban = ban;
	}
	
	public int getBan() {
		return this.ban;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setLatitude(String lat) {
		this.latitude = lat;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	
	public void setLongitude(String lon) {
		this.longitude = lon;
	}
	
	public String getLongitude() {
		return this.longitude;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(" Name : ").append(this.name)
				.append(" BAN : ").append(this.ban)
				.append(" Address : ").append(this.address)
				.append(" Latitude : ").append(this.latitude)
				.append(" Longitude : ").append(this.longitude).toString();
	}
	
}
