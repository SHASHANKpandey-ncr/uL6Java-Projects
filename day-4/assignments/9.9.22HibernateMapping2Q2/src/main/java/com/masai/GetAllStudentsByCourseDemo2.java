package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetAllStudentsByCourseDemo2 {

public static void main(String[] args) {
		
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		List<Student> slist=em.find(Course.class, 1).getStdList();
		
		slist.forEach(s->{
			System.out.println(s.getName()+" "+s.getEmail());
		});
		
}
	
}
