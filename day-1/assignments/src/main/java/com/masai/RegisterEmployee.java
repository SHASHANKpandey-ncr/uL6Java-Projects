package com.masai;

public class RegisterEmployee {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee=new Employee();
		
		employee.setName("np");
		employee.setAddress("UP");
		employee.setSalary(5000);
		
		try {
			dao.registerEmployee(employee);
			System.out.println();
			System.out.println(employee);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
