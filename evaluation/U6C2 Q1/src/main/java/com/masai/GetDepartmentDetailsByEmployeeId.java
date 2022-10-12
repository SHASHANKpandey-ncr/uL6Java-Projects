package com.masai;

public class GetDepartmentDetailsByEmployeeId {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoimpl();
		
		Department d=dao.getDepartmentDetailsByEmployeeId(4);
		
		System.out.println("**************************");
		System.out.println("Department Name : "+d.getDeptName());
		System.out.println("Department Location : "+d.getLocation());
	}
	
}
