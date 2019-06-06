package com.app.model;

import java.util.List;

public class Admin {

	private String adminName;
	private String adminDept;
	private String adminGrade;
	private String adminNote;
	private List<String> adminGrants;
	public Admin() {
		super();
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminDept() {
		return adminDept;
	}
	public void setAdminDept(String adminDept) {
		this.adminDept = adminDept;
	}
	public String getAdminGrade() {
		return adminGrade;
	}
	public void setAdminGrade(String adminGrade) {
		this.adminGrade = adminGrade;
	}
	public String getAdminNote() {
		return adminNote;
	}
	public void setAdminNote(String adminNote) {
		this.adminNote = adminNote;
	}
	public List<String> getAdminGrants() {
		return adminGrants;
	}
	public void setAdminGrants(List<String> adminGrants) {
		this.adminGrants = adminGrants;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminDept=" + adminDept + ", adminGrade=" + adminGrade
				+ ", adminNote=" + adminNote + ", adminGrants=" + adminGrants + "]";
	}
	
	 
}
