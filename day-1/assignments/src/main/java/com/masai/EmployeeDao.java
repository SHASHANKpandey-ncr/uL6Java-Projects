package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface EmployeeDao {

	public Employee registerEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeById(int empId)throws EmployeeException;
	
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	
	public Employee updateEmployee(Employee employee)throws EmployeeException;
	
}


//***************************************

class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		if(employee!=null
				&&employee.getName()!=null
				&&employee.getAddress()!=null
				&&employee.getSalary()!=0) {
			em.getTransaction().begin();
			
			em.persist(employee);
			
//			Employee emp= em.merge(employee);
			
			em.getTransaction().commit();
			
			em.close();
			return employee;
		}
		else {
			EmployeeException exception=
					new EmployeeException("Invalid employee details..!!");
			throw exception;
		}

	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		if(employee!=null) {
			return employee;
		}
		else {
			EmployeeException exception=
					new EmployeeException("Employee not found..!!");
			throw exception;
		}
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		if(employee!=null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			em.close();
			return employee;
		}
		else {
			EmployeeException exception=
					new EmployeeException("Employee not found..!!");
			throw exception;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		
		
		if(employee!=null
				&&employee.getName()!=null
				&&employee.getAddress()!=null
				&&employee.getSalary()!=0) {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
			em.close();
			return employee;
		}
		else {
			EmployeeException exception=
					new EmployeeException("Employee not found..!!");
			throw exception;
		}
	}
	
}
