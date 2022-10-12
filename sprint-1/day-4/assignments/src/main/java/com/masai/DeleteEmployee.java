package com.masai;

public class DeleteEmployee {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Boolean status=dao.deleteEmployee(7);
		
		if(!status)System.out.println("Not found..!!");
	}

	
}
