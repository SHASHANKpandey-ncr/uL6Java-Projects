package com.masai;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	
	private String deptName;
	private String location;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "dept")
	private List<Employee> emps=new ArrayList<>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", emps=" + emps
				+ "]";
	}

	public Department(int deptId, String deptName, String location, List<Employee> emps) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		this.emps = emps;
	}
	
	

	
}
