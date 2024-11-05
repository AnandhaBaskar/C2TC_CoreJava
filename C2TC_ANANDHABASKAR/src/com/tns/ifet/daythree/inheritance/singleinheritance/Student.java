package com.tns.ifet.daythree.inheritance.singleinheritance;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	public Student() {
		super();
	}
	public Student(String name, String aadharNo, String address, long phno,int rollNo, String collegeName) {
		super(name, aadharNo, address, phno);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
				+ ", getCollegeName()=" + getCollegeName() + "]";
	}
	
	
	
	
	
	

	

}
