package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface EmployeeDao {

	public void addEmployee(Employee emp);
	
}

//************************************************

class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee emp) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Employee added..!!");
	}
	
}