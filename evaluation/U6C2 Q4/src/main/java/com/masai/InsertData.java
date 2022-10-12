package com.masai;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		SalariedEmployee sal1=new SalariedEmployee();
		sal1.setEmpName("ram");
		sal1.setEmail("ram@gmail");
		sal1.setSalary(1000);
		
		SalariedEmployee sal2=new SalariedEmployee();
		sal2.setEmpName("raju");
		sal2.setEmail("raju@gmail");
		sal2.setSalary(2000);
		
		SalariedEmployee sal3=new SalariedEmployee();
		sal3.setEmpName("kaju");
		sal3.setEmail("kaju@gmail");
		sal3.setSalary(3000);
		
		SalariedEmployee sal4=new SalariedEmployee();
		sal4.setEmpName("baju");
		sal4.setEmail("baju@gmail");
		sal4.setSalary(4000);
		
		
		
		
		
		ConractualEmployee con1=new ConractualEmployee();
		con1.setEmpName("shyam");
		con1.setMobileNumber("9826198261");
		con1.setCostofperday(100);
		con1.setNoOfWorkingDays(10);
		
		ConractualEmployee con2=new ConractualEmployee();
		con2.setEmpName("sita");
		con2.setMobileNumber("9898989898");
		con2.setCostofperday(200);
		con2.setNoOfWorkingDays(20);
		
		ConractualEmployee con3=new ConractualEmployee();
		con3.setEmpName("gita");
		con3.setMobileNumber("7878787878");
		con3.setCostofperday(300);
		con3.setNoOfWorkingDays(30);
		
		ConractualEmployee con4=new ConractualEmployee();
		con4.setEmpName("babita");
		con4.setMobileNumber("1212121212");
		con4.setCostofperday(400);
		con4.setNoOfWorkingDays(40);
		
		
		em.getTransaction().begin();
		
		em.persist(sal1);
		em.persist(sal2);
		em.persist(sal3);
		em.persist(sal4);
		
		em.persist(con1);
		em.persist(con2);
		em.persist(con3);
		em.persist(con4);
		
		em.getTransaction().commit();
		em.close();
		System.out.println("Done");
	}
	
}
