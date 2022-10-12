package com.masai;

public class AllStudentsDetailsbyColageID {

	public static void main(String[] args) {
		StudentDao dao=new StudentDaoImpl();
		
		dao.allStudentsDetailsbyColageID(1);
	}
	
}
