package com.masai;

import java.util.List;

public class GetEmployeesByAddress {

	
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			List<Employee> list=dao.getEmployeesByAddress("goa");
			for(Employee emp:list)System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
