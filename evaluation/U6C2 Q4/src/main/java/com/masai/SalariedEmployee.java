package com.masai;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee{

	private int salary;
	private String email;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SalariedEmployee(int empId, String empName, int salary, String email) {
		super(empId, empName);
		this.salary = salary;
		this.email = email;
	}

	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + "]";
	}
	
}
