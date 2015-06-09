package com.att.ucomm.models;

public class Customer {
	
	private String name;
	private int ban;
	private String address;
	private double latitude;
	private double longitude;

	public Customer() {
		
	}
	
	public Customer(String name, int ban, String address, double lat, double lon) {
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
	
	@Override
	public String toString() {
		return new StringBuffer(" Name : ").append(this.name)
				.append(" BAN : ").append(this.ban)
				.append(" Address : ").append(this.address)
				.append(" Latitude : ").append(this.latitude)
				.append(" Longitude : ").append(this.longitude).toString();
	}
	
}
