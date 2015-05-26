package com.att.ucomm;

public class Job {

	private String techId;
	private int ban;
	private int jobId;
	private String status;
	private String jobType;

	public Job() {

	}

	public Job(String techid, int ban, int jobid, String status, String jobtype) {
		this.techId = techid;
		this.ban = ban;
		this.jobId = jobid;
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
				.append(" Job ID : ").append(this.jobId).append(" Status : ")
				.append(this.status).append(" Job Type : ").append(this.jobType).toString();
	}

}

