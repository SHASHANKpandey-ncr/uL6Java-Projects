package com.masai;

public class AddEmployee {

	
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee=new Employee();
		
		employee.setName("rita");
		employee.setGender("F");
		employee.setSalary(2000);
		
		//Address adr=new Address("maharastra", "pune","75455","office"); //**
		//employee.setAddr(adr); //**
		
		employee.getEmpAddress()
		.add(new Address("JK", "Jammu", "123456", "office"));
		
		employee.getEmpAddress()
		.add(new Address("JK", "Kashmir", "223456", "home"));
		
		dao.addEmployee(employee);
		
	}
	
}
