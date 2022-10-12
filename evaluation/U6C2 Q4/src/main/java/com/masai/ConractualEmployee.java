package com.masai;

import javax.persistence.Entity;

@Entity
public class ConractualEmployee extends Employee{

	private int noOfWorkingDays;
	private int costofperday;
	private String mobileNumber;
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getCostofperday() {
		return costofperday;
	}
	public void setCostofperday(int costofperday) {
		this.costofperday = costofperday;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public ConractualEmployee(int empId, String empName, int noOfWorkingDays, int costofperday, String mobileNumber) {
		super(empId, empName);
		this.noOfWorkingDays = noOfWorkingDays;
		this.costofperday = costofperday;
		this.mobileNumber = mobileNumber;
	}

	
	public ConractualEmployee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ConractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costofperday=" + costofperday
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
