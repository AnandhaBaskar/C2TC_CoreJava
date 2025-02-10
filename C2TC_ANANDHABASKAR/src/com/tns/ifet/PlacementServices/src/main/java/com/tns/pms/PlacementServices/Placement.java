package com.tns.pms.PlacementServices;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String jobRole;
    private String jobLocation;
    private double salaryPackage;
    private String interviewDate;
    private String applicationDeadline;
    private String status;
    
    
    
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(Long id, String companyName, String jobRole, String jobLocation, double salaryPackage,
			String interviewDate, String applicationDeadline, String status) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobRole = jobRole;
		this.jobLocation = jobLocation;
		this.salaryPackage = salaryPackage;
		this.interviewDate = interviewDate;
		this.applicationDeadline = applicationDeadline;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public double getSalaryPackage() {
		return salaryPackage;
	}
	public void setSalaryPackage(double salaryPackage) {
		this.salaryPackage = salaryPackage;
	}
	public String getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(String applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
