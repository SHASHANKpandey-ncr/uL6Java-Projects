package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetAllCoursesByStudentDemo3 {

public static void main(String[] args) {
		
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		List<Course> clist=em.find(Student.class, 3).getCrsList();
		
		clist.forEach(c->{
			System.out.println(c.getCourseName()+" "+c.getDuration());
		});
		
}
	
}
