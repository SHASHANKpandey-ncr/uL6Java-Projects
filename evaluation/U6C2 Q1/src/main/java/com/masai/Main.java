package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
			Department department=new Department();
			department.setDeptName("HR");
			department.setLocation("Delhi");
			
			Employee employee=new Employee();
			employee.setEmpName("ram");
			employee.setSalary(1000);
			employee.setAddress(new Address("raipur", "cg", "454545"));
			employee.setDept(department);
			
			department.getEmps().add(employee);
			
			em.getTransaction().begin();
			em.persist(department);
			em.getTransaction().commit();
			em.close();
			System.out.println("done");
		
	}
	
}
