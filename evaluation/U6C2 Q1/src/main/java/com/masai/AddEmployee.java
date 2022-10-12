package com.masai;

public class AddEmployee {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoimpl();
		
		Employee employee=new Employee();
		employee.setEmpName("ram");
		employee.setSalary(1000);
		employee.setAddress(new Address("raipur", "cg", "454545"));
		
		dao.addEmployee(employee);
		
	}
	
}
