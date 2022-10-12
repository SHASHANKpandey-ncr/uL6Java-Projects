package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface StudentDao {

	public void addStudentCollage(Collage collage);
	public void allStudentsDetailsbyColageID(int ColageID);
	public void allCollageDetailsByStudentID(int StudentID);
}

class StudentDaoImpl implements StudentDao{

	@Override
	public void addStudentCollage(Collage collage) {
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(collage);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println();
		System.out.println("Details added..!!");
	}

	@Override
	public void allStudentsDetailsbyColageID(int ColageID) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Collage collage=em.find(Collage.class, ColageID);
		
		
		
		
		
		List<Student> students=collage.getStuds();
		
		students.forEach(s->{
			System.out.println("+++++++++++++++++++++");
			System.out.println(collage.getCollageName());
			System.out.println(s.getStudentName());
			System.out.println(s.getEmail());
			System.out.println(s.getMobileNumber());
			System.out.println("+++++++++++++++++++++");
		});
		
		em.close();
		
		
	}

	@Override
	public void allCollageDetailsByStudentID(int StudentID) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("mappingUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Student student=em.find(Student.class, StudentID);
		
		Collage collage=student.getColg();
		
		
		
			System.out.println("+++++++++++++++++++++");
			System.out.println(collage.getCollageName());
			System.out.println(collage.getCollageAddress());
			System.out.println("+++++++++++++++++++++");
		
		em.close();
	}
	
}

// one to many & many to one bidirectional mapping
