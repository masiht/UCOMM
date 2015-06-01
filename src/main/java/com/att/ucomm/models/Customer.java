package com.att.ucomm.models;

public class Customer {
	
	private String name;
	private int ban;
	private String address;
	private String location;

	public Customer() {
		
	}
	
	public Customer(String name, int ban, String address, String location) {
		this.name = name;
		this.ban = ban;
		this.address = address;
		this.location = location;
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
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(" Name : ").append(this.name)
				.append(" BAN : ").append(this.ban)
				.append(" Address : ").append(this.address)
				.append(" Location : ").append(this.location).toString();
	}
	
}
