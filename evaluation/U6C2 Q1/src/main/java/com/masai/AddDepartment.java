package com.masai;

public class AddDepartment {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoimpl();
		
		Department department=new Department();
		department.setDeptName("HR");
		department.setLocation("Delhi");
		
		dao.addDepartment(department);
		
	}
	
}
