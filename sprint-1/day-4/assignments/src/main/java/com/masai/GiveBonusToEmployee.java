package com.masai;

public class GiveBonusToEmployee {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		String ans=dao.giveBonusToEmployee(7, 1000);
		
		System.out.println(ans);
		
	}
	
}
