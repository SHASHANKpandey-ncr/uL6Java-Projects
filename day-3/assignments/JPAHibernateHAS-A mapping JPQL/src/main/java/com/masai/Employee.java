package com.masai;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empID;
	
	
	private String name;
	private String gender;
	private int salary;
	
	
	@ElementCollection     // remove this if you want all in same table**
	@Embedded
	private Set<Address> empAddress = new HashSet();
	// private Address addr; // remove above line and use this**

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", empAddress=" + empAddress + "]";
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Set<Address> getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}


	public Employee(int empID, String name, String gender, int salary, Set<Address> empAddress) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.empAddress = empAddress;
	}


	@Override
	public int hashCode() {
		return Objects.hash(empAddress, empID, gender, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empAddress, other.empAddress) && empID == other.empID
				&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
}
