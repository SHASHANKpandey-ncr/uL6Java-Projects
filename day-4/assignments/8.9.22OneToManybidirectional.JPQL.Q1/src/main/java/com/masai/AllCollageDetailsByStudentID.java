package com.masai;

public class AllCollageDetailsByStudentID {

	public static void main(String[] args) {
		StudentDao dao=new StudentDaoImpl();
		
		dao.allCollageDetailsByStudentID(10);
	}
	
}
