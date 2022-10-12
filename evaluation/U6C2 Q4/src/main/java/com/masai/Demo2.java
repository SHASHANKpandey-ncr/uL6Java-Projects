package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo2 {

	public static void main(String[] args) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		String jpql=
				"select e from Employee e where e.email is null and e.salary is null";

		Query query=em.createQuery(jpql);
		
		List<Employee> list=query.getResultList();
		

		
		list.forEach(l->{
			System.out.println("**************************");
			System.out.println("Name : "+l.getEmpName());
			System.out.println(l);
			
		});
		
	}
	
}
