package com.masai;

import java.util.List;

public class GetEmployeeSalaryById {
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			int salary=dao.getEmployeeSalaryById(5);
			System.out.println(salary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
