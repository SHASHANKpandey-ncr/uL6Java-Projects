package com.masai;

public class Save {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		dao.save(new Employee(2, "np", "mp", 10000));
		
	}
	
}
