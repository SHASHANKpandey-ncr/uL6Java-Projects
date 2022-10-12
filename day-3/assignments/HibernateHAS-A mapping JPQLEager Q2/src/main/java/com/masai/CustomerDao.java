package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface CustomerDao {

	public void addCustomer(Customer customer);
	public Customer findCustomer(int id);
	
}

class CustomerDaoImpl implements CustomerDao{

	@Override
	public void addCustomer(Customer customer) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(customer);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Customer added..!!");
		
	}

	@Override
	public Customer findCustomer(int id) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Customer customer=em.find(Customer.class, id);
		
		em.close();
		
		return customer;
	}
	
	
	
}
