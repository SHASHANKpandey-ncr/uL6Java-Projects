package com.masai;

import java.util.List;

public class GetAllEmployees {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			List<Employee> list=dao.getAllEmployees();
			for(Employee emp:list)System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
