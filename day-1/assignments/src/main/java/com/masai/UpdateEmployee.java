package com.masai;

public class UpdateEmployee {
		public static void main(String[] args) {
			
		
	EmployeeDao dao=new EmployeeDaoImpl();
	Employee employee=new Employee();
	employee.setAddress("Raipur");
	employee.setName(null);
	employee.setSalary(8000);
	try {
		System.out.println("Employee Deleted: ");
		System.out.println(dao.updateEmployee(employee));
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
