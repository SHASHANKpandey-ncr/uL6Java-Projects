package com.masai;

import java.util.List;

public class GetAllEmployeeWithRangeSalary {

	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			List<Employee> list=dao.getAllEmployeeWithRangeSalary(5000,7000);
			for(Employee emp:list)System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
