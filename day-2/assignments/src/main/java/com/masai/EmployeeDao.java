package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public interface EmployeeDao {

public List<Employee> getAllEmployees()
		throws EmployeeException;

public List<Employee> getEmployeesByAddress(String address) 
		throws EmployeeException;

public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary)
		throws EmployeeException;

public Object[] getEmployeeNameAndSalary(int empId)
		throws EmployeeException;

public int getEmployeeSalaryById(int empId)
		throws EmployeeException;

	
}

//************************************************

class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		 EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		 
		 EntityManager em=factory.createEntityManager();
		 
		 String jpql="select e.name,e.salary from Employee e where e.empid=:id";
		 
		 Query query=em.createQuery(jpql);
		
		 query.setParameter("id", empId);
		 
		 Object[] obj= (Object[]) query.getSingleResult();
		 
//		 List<Object[]> results= q.getResultList(); // to get list
		 
		 if(obj.length!=0)return obj;
		 else {
			 EmployeeException exception=
					 new EmployeeException("No Database with such ID..!!");
			 throw exception;
		 }
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		 EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		 
		 EntityManager em=factory.createEntityManager();
		 
		 String jpql="select e.salary from Employee e where e.empid=:id";
		 
		 Query query=em.createQuery(jpql);
		
		 query.setParameter("id", empId);
		 
		 int integer= (int) query.getSingleResult();
		 
		 if(integer!=0)return integer;
		 else {
			 EmployeeException exception=
					 new EmployeeException("No Database with such ID..!!");
			 throw exception;
		 }
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		 EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		 
		 EntityManager em=factory.createEntityManager();
		 
		 String jpql="select e from Employee e";
		 
		 Query query=em.createQuery(jpql);
		 
		 List<Employee> list=query.getResultList();
		 
		 if(!list.isEmpty())return list;
		 else {
			 EmployeeException exception=
					 new EmployeeException("Database is empty..!!");
			 throw exception;
		 }
		
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		 EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		 
		 EntityManager em=factory.createEntityManager();
		 
		 String jpql="select e from Employee e where e.address=:adr";
		 
		 Query query=em.createQuery(jpql);
		
		 query.setParameter("adr", address);
		 
		 List<Employee> list=query.getResultList();
		 
		 if(!list.isEmpty())return list;
		 else {
			 EmployeeException exception=
					 new EmployeeException("No Database with such address..!!");
			 throw exception;
		 }
		 
		
		
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		 EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		 
		 EntityManager em=factory.createEntityManager();
		 
		 String jpql=
"select e from Employee e where e.salary>=:sSalary and e.salary<=:eSalary";
		 
		 Query query=em.createQuery(jpql);
		
		 query.setParameter("sSalary", startSalary);
		 query.setParameter("eSalary", endSalary);
		 
		 List<Employee> list=query.getResultList();
		 
		 if(!list.isEmpty())return list;
		 else {
			 EmployeeException exception=
					 new EmployeeException("No Database with such parameters..!!");
			 throw exception;
		 }
	}
	
}
