package com.masai;

import java.util.List;

public class GetAllEmployeeWithDeptName {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoimpl();
		
		List<Employee> e=dao.getAllEmployeeWithDeptName(1);
		
		
		
		
		
		e.forEach(l->{
			System.out.println("**************************");
			System.out.println("name : "+l.getEmpName());
			System.out.println("dept : "+l.getDept().getDeptName());
			System.out.println("address : "+l.getAddress());
			System.out.println("salary : "+l.getSalary());
			
		});
		

	}
	
}
