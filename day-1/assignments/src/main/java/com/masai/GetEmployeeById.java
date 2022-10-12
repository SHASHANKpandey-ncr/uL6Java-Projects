package com.masai;

public class GetEmployeeById {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			System.out.println();
			System.out.println(dao.getEmployeeById(15));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
