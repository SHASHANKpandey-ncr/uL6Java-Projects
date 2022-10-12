package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface EmployeeDao {

	public String getAddressOfEmployee(int empId);
	public String giveBonusToEmployee(int empId, int bonus);
	void save(Employee emp);
	public boolean deleteEmployee(int empId);


	
}

class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String getAddressOfEmployee(int empId) {
		String result="Employee not found . . !!";
		
		EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee= em.find(Employee.class, empId);
		
		if(employee!=null)
			result="Adress : "+employee.getAddress();
		
//		System.out.println(employee);
		
		em.close();
		return result;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String result="Bonus NOT added..!!" ;
		
		EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		if(employee!=null) {
			
			em.getTransaction().begin();
			
			employee.setSalary(employee.getSalary()+bonus);
			
			em.getTransaction().commit();
			
			result="Bonus added .. !!";
		}
		
		
		
		em.close();
		return result;
	}

	@Override
	public void save(Employee emp) {
		EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Saved.. !!");
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		Boolean result=false;
		
		EntityManagerFactory factory=
				 Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee= em.find(Employee.class, empId);
		
		if(employee!=null) {
			result=true;
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			System.out.println("Deleted..!!");
		}
		
//		System.out.println(employee);
		
		em.close();
		return result;
		
	}
	
}
