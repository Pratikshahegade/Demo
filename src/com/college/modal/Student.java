package com.college.modal;

public class Student {
	private int studId;
	private String studName;
	private int studAge;
	private String studmailid;
	
	
	public Student(int studId, String studName, int studAge, String studmailid) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
		this.studmailid = studmailid;
	}
	
	public String print() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studmailid="
				+ studmailid + "]";
	}


	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public String getStudmailid() {
		return studmailid;
	}
	public void setStudmailid(String studmailid) {
		this.studmailid = studmailid;
	}
	
	
}



