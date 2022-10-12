package com.masai;

public class DeleteEmployeeById {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			System.out.println("Employee Deleted: ");
			System.out.println(dao.deleteEmployeeById(2));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
