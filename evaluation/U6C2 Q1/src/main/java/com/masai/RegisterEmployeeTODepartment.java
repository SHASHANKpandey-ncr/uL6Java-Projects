package com.masai;

public class RegisterEmployeeTODepartment {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoimpl();
		
		dao.registerEmployeeTODepartment(2, 1);
		
	}
	
}
