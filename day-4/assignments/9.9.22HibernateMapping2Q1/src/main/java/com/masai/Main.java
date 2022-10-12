package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Employee employee1=new Employee();
		employee1.setName("raju");
		employee1.setSalary(1000);
		employee1.setHomeAddress(new Address("CG", "Bilaspur", "464646"));
		employee1.setOfficeAddress(new Address("CG", "Raipur", "565656"));
		
		Employee employee2=new Employee();
		employee2.setName("kaju");
		employee2.setSalary(2000);
		employee2.setHomeAddress(new Address("MP", "Indore", "494949"));
		employee2.setOfficeAddress(new Address("MP", "Bhopal", "121212"));
		
		Employee employee3=new Employee();
		employee3.setName("baju");
		employee3.setSalary(3000);
		employee3.setHomeAddress(new Address("JK", "Jammu", "535353"));
		employee3.setOfficeAddress(new Address("JK", "Kashmir", "232323"));
		
		Employee employee4=new Employee();
		employee4.setName("haju");
		employee4.setSalary(4000);
		employee4.setHomeAddress(new Address("UP", "Kanpur", "535353"));
		employee4.setOfficeAddress(new Address("UP", "Jhansi", "858585"));
		

		
		em.getTransaction().begin();
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		em.persist(employee4);
		em.getTransaction().commit();
		em.close();
		System.out.println("done");
	}
	
}
