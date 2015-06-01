package com.att.ucomm.models;

import java.util.*;


public class Job {

	private String techId;
	private int ban;
	private int jobId;
	private Date day;
	private Date startDate;
	private Date endDate;
	private String status;
	private String jobType;
	

	public Job() {

	}

	public Job(String techid, int ban, int jobid, Date day, Date sDate, Date eDate, String status, String jobtype) {
		this.techId = techid;
		this.ban = ban;
		this.jobId = jobid;
		this.day = day;
		this.startDate = sDate;
		this.endDate = eDate;
		this.status = status;
		this.jobType = jobtype;
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
	
	public void setDay(Date day) {
		this.day = day;
	}
	
	public Date getDay() {
		return this.day;
	}
	
	public void setStartDate(Date sDate) {
		this.startDate = sDate;
	}
	
	public Date getStartDate() {
		return this.startDate;
	}
	
	public void setEndDate(Date eDate) {
		this.endDate = eDate;
	}
	
	public Date getEndDate() {
		return this.endDate;
	}

	public int getBan() {
		return this.ban;
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
	

	@Override
	public String toString() {
		return new StringBuffer(" Tech ID : ").append(this.techId)
				.append(" BAN : ").append(this.ban)
				.append(" Job ID : ").append(this.jobId)
				.append(" Date: ").append(this.day)
				.append(" Start: ").append(this.startDate)
				.append(" End: ").append(this.endDate)
				.append(" Status : ").append(this.status)
				.append(" Job Type : ").append(this.jobType).toString();
	}

}

