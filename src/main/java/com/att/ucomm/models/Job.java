package com.att.ucomm.models;

import java.util.*;


public class Job {

	private String techId;
	private int ban;
	private int jobId;
	private String day;
	private String startDate;
	private String endDate;
	private String status;
	private String jobType;
	private String availability;
	

	public Job() {

	}

	public Job(String techid, int ban, int jobid, String day, String sDate, String eDate, String status, String jobtype, String availability) {
		this.techId = techid;
		this.ban = ban;
		this.jobId = jobid;
		this.day = day;
		this.startDate = sDate;
		this.endDate = eDate;
		this.status = status;
		this.jobType = jobtype;
		this.availability = availability;
	}

	public void setTechId(String techid) {
		this.techId = techid;
	}

	public String getTechId() {
		return this.techId;
	}
	
	public void setBan(int ban) {
		this.ban = ban;
	}
	
	public int getBan() {
		return this.ban;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public void setStartDate(String sDate) {
		this.startDate = sDate;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public void setEndDate(String eDate) {
		this.endDate = eDate;
	}
	
	public String getEndDate() {
		return this.endDate;
	}

	
	public void setjobId(int jobid) {
		this.jobId = jobid;
	}

	public int getJobId() {
		return this.jobId;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setJobType(String jobtype) {
		this.jobType = jobtype;
	}

	public String getJobType() {
		return this.jobType;
	}
	
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public String getAvailability() {
		return this.availability;
	}
	

	@Override
	public String toString() {
		return new StringBuffer(" Tech ID : ").append(this.techId)
				.append(" BAN : ").append(this.ban)
				.append(" Job ID : ").append(this.jobId)
				.append(" Date : ").append(this.day)
				.append(" Start : ").append(this.startDate)
				.append(" End: ").append(this.endDate)
				.append(" Status : ").append(this.status)
				.append(" Job Type : ").append(this.jobType)
				.append(" Availability : ").append(this.availability).toString();
	}

}

