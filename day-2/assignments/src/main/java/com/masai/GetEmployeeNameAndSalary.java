package com.masai;

public class GetEmployeeNameAndSalary {

	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			Object[] obj=dao.getEmployeeNameAndSalary(5);
			
				System.out.println("name : "+obj[0].toString());
				System.out.println("salary : "+obj[1].toString());
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
