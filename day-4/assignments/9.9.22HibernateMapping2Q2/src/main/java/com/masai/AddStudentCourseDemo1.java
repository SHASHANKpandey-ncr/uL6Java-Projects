package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddStudentCourseDemo1 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		
		Course course1=new Course();
		course1.setCourseName("BackEnd");
		course1.setDuration("35M");
		course1.setFee(100000);
		
		Course course2=new Course();
		course2.setCourseName("FrontEnd");
		course2.setDuration("30M");
		course2.setFee(80000);
		
		
		Student student1=new Student();
		student1.setName("sp");
		student1.setEmail("sp@gmail.com");
		student1.setMobile("987456321");
		
		Student student2=new Student();
		student2.setName("md");
		student2.setEmail("md@gmail.com");
		student2.setMobile("789456123");
		
		
		student1.getCrsList().add(course1);
		student2.getCrsList().add(course1);
		
		course1.getStdList().add(student1);
		course1.getStdList().add(student2);
		
		student2.getCrsList().add(course2);
		course2.getStdList().add(student2);
		
		
		
		//
		
		em.getTransaction().begin();
		
		em.persist(course1);
		em.persist(course2);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Added..!!");
		

		
		
	}
	
}

// in Many to Many do not use Dao pattern..!! 