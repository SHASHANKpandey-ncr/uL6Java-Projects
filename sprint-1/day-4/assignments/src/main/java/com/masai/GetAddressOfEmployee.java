package com.masai;

public class GetAddressOfEmployee {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		String string=dao.getAddressOfEmployee(7); 
		
			System.out.println(string);
		
	}
	
}
